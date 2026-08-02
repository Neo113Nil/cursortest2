package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: cw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0116cw implements TextWatcher {

    /* JADX INFO: renamed from: j */
    public final EditText f1469j;

    /* JADX INFO: renamed from: k */
    public C0077bw f1470k;

    /* JADX INFO: renamed from: l */
    public boolean f1471l = true;

    public C0116cw(EditText editText) {
        this.f1469j = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m1037a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0595pv c0595pvM3994a = C0595pv.m3994a();
            if (editableText == null) {
                length = 0;
            } else {
                c0595pvM3994a.getClass();
                length = editableText.length();
            }
            c0595pvM3994a.m3998e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.f1469j;
        if (editText.isInEditMode() || !this.f1471l || C0595pv.f6261k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM3995b = C0595pv.m3994a().m3995b();
        if (iM3995b != 0) {
            if (iM3995b == 1) {
                C0595pv.m3994a().m3998e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM3995b != 3) {
                return;
            }
        }
        C0595pv c0595pvM3994a = C0595pv.m3994a();
        if (this.f1470k == null) {
            this.f1470k = new C0077bw(editText);
        }
        c0595pvM3994a.m3999f(this.f1470k);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
