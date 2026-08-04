package p059i0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.widget.W0;
import p046g0.j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f13831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W0 f13832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13833c = true;

    public h(EditText editText) {
        this.f13831a = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j jVarA = j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        EditText editText = this.f13831a;
        if (editText.isInEditMode() || !this.f13833c || j.j == null || i8 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                j.a().e((Spannable) charSequence, i7, i9 + i7);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        j jVarA = j.a();
        if (this.f13832b == null) {
            this.f13832b = new W0(editText);
        }
        jVarA.f(this.f13832b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
