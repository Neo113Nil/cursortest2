package io.flutter.plugin.editing;

import O.r;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    public int f616b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f617c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f618d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f619e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f620f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public String f621g;

    /* renamed from: h, reason: collision with root package name */
    public String f622h;

    /* renamed from: i, reason: collision with root package name */
    public int f623i;

    /* renamed from: j, reason: collision with root package name */
    public int f624j;

    /* renamed from: k, reason: collision with root package name */
    public int f625k;

    /* renamed from: l, reason: collision with root package name */
    public int f626l;

    /* renamed from: m, reason: collision with root package name */
    public final d f627m;

    public f(r rVar, View view) {
        this.f627m = new d(view, this);
        if (rVar != null) {
            f(rVar);
        }
    }

    public final void a(e eVar) {
        if (this.f617c > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f616b <= 0) {
            this.f618d.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f619e.add(eVar);
        }
    }

    public final void b() {
        this.f616b++;
        if (this.f617c > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f616b != 1 || this.f618d.isEmpty()) {
            return;
        }
        this.f622h = toString();
        this.f623i = Selection.getSelectionStart(this);
        this.f624j = Selection.getSelectionEnd(this);
        this.f625k = BaseInputConnection.getComposingSpanStart(this);
        this.f626l = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f616b;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f618d;
        ArrayList arrayList2 = this.f619e;
        if (i2 == 1) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                this.f617c++;
                ((e) obj).a(true);
                this.f617c--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f622h), (this.f623i == Selection.getSelectionStart(this) && this.f624j == Selection.getSelectionEnd(this)) ? false : true, (this.f625k == BaseInputConnection.getComposingSpanStart(this) && this.f626l == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f616b--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            ArrayList arrayList = this.f618d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.f617c++;
                ((e) obj).a(z2);
                this.f617c--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f617c > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f618d.remove(eVar);
        if (this.f616b > 0) {
            this.f619e.remove(eVar);
        }
    }

    public final void f(r rVar) {
        b();
        replace(0, length(), (CharSequence) rVar.f354a);
        int i2 = rVar.f355b;
        if (i2 >= 0) {
            Selection.setSelection(this, i2, rVar.f356c);
        } else {
            Selection.removeSelection(this);
        }
        int i3 = rVar.f357d;
        int i4 = rVar.f358e;
        if (i3 < 0 || i3 >= i4) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f627m.setComposingRegion(i3, i4);
        }
        this.f620f.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f636e = selectionStart;
        hVar.f637f = selectionEnd;
        hVar.f638g = composingSpanStart;
        hVar.f639h = composingSpanEnd;
        hVar.f632a = fVar;
        hVar.f633b = "";
        hVar.f634c = -1;
        hVar.f635d = -1;
        this.f620f.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f621g;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f621g = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f617c > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f621g = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f636e = selectionStart2;
        hVar.f637f = selectionEnd2;
        hVar.f638g = composingSpanStart2;
        hVar.f639h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        hVar.f632a = fVar;
        hVar.f633b = charSequence2;
        hVar.f634c = i2;
        hVar.f635d = i3;
        this.f620f.add(hVar);
        if (this.f616b > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
