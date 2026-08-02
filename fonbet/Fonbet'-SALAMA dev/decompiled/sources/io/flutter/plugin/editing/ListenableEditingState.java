package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import z5.q;

/* loaded from: classes2.dex */
class ListenableEditingState extends SpannableStringBuilder {
    private static final String TAG = "ListenableEditingState";
    private int mComposingEndWhenBeginBatchEdit;
    private int mComposingStartWhenBeginBatchEdit;
    private BaseInputConnection mDummyConnection;
    private int mSelectionEndWhenBeginBatchEdit;
    private int mSelectionStartWhenBeginBatchEdit;
    private String mTextWhenBeginBatchEdit;
    private String mToStringCache;
    private int mBatchEditNestDepth = 0;
    private int mChangeNotificationDepth = 0;
    private ArrayList<EditingStateWatcher> mListeners = new ArrayList<>();
    private ArrayList<EditingStateWatcher> mPendingListeners = new ArrayList<>();
    private ArrayList<TextEditingDelta> mBatchTextEditingDeltas = new ArrayList<>();

    public interface EditingStateWatcher {
        void didChangeEditingState(boolean z4, boolean z7, boolean z8);
    }

    public ListenableEditingState(q qVar, View view) {
        this.mDummyConnection = new BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
            @Override // android.view.inputmethod.BaseInputConnection
            public Editable getEditable() {
                return this;
            }
        };
        if (qVar != null) {
            setEditingState(qVar);
        }
    }

    private void notifyListener(EditingStateWatcher editingStateWatcher, boolean z4, boolean z7, boolean z8) {
        this.mChangeNotificationDepth++;
        editingStateWatcher.didChangeEditingState(z4, z7, z8);
        this.mChangeNotificationDepth--;
    }

    private void notifyListenersIfNeeded(boolean z4, boolean z7, boolean z8) {
        if (z4 || z7 || z8) {
            Iterator<EditingStateWatcher> it = this.mListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), z4, z7, z8);
            }
        }
    }

    public void addEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "adding a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        if (this.mBatchEditNestDepth <= 0) {
            this.mListeners.add(editingStateWatcher);
        } else {
            Log.w(TAG, "a listener was added to EditingState while a batch edit was in progress");
            this.mPendingListeners.add(editingStateWatcher);
        }
    }

    public void beginBatchEdit() {
        this.mBatchEditNestDepth++;
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        if (this.mBatchEditNestDepth != 1 || this.mListeners.isEmpty()) {
            return;
        }
        this.mTextWhenBeginBatchEdit = toString();
        this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
        this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
        this.mComposingStartWhenBeginBatchEdit = getComposingStart();
        this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
    }

    public void clearBatchDeltas() {
        this.mBatchTextEditingDeltas.clear();
    }

    public void endBatchEdit() {
        int i7 = this.mBatchEditNestDepth;
        if (i7 == 0) {
            Log.e(TAG, "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i7 == 1) {
            Iterator<EditingStateWatcher> it = this.mPendingListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), true, true, true);
            }
            if (!this.mListeners.isEmpty()) {
                String.valueOf(this.mListeners.size());
                notifyListenersIfNeeded(!toString().equals(this.mTextWhenBeginBatchEdit), (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true, (this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd()) ? false : true);
            }
        }
        this.mListeners.addAll(this.mPendingListeners);
        this.mPendingListeners.clear();
        this.mBatchEditNestDepth--;
    }

    public ArrayList<TextEditingDelta> extractBatchTextEditingDeltas() {
        ArrayList<TextEditingDelta> arrayList = new ArrayList<>(this.mBatchTextEditingDeltas);
        this.mBatchTextEditingDeltas.clear();
        return arrayList;
    }

    public final int getComposingEnd() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int getComposingStart() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int getSelectionEnd() {
        return Selection.getSelectionEnd(this);
    }

    public final int getSelectionStart() {
        return Selection.getSelectionStart(this);
    }

    public void removeEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "removing a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        this.mListeners.remove(editingStateWatcher);
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.remove(editingStateWatcher);
        }
    }

    public void setComposingRange(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.mDummyConnection.setComposingRegion(i7, i8);
        }
    }

    public void setEditingState(q qVar) {
        beginBatchEdit();
        replace(0, length(), (CharSequence) qVar.f18520a);
        int i7 = qVar.f18521b;
        if (i7 >= 0) {
            Selection.setSelection(this, i7, qVar.f18522c);
        } else {
            Selection.removeSelection(this);
        }
        setComposingRange(qVar.f18523d, qVar.f18524e);
        clearBatchDeltas();
        endBatchEdit();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        super.setSpan(obj, i7, i8, i9);
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(toString(), getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.mToStringCache;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.mToStringCache = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        boolean z4;
        boolean z7;
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        String listenableEditingState = toString();
        int i11 = i8 - i7;
        boolean z8 = i11 != i10 - i9;
        for (int i12 = 0; i12 < i11 && !z8; i12++) {
            z8 |= charAt(i7 + i12) != charSequence.charAt(i9 + i12);
        }
        if (z8) {
            this.mToStringCache = null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        SpannableStringBuilder replace = super.replace(i7, i8, charSequence, i9, i10);
        boolean z9 = z8;
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(listenableEditingState, i7, i8, charSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
        if (this.mBatchEditNestDepth > 0) {
            return replace;
        }
        boolean z10 = (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true;
        if (getComposingStart() == composingStart && getComposingEnd() == composingEnd) {
            z4 = z9;
            z7 = false;
        } else {
            z4 = z9;
            z7 = true;
        }
        notifyListenersIfNeeded(z4, z10, z7);
        return replace;
    }
}
