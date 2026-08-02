package i0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.widget.W0;
import g0.j;

/* renamed from: i0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241h implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f13825a;

    /* renamed from: b, reason: collision with root package name */
    public W0 f13826b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13827c = true;

    public C1241h(EditText editText) {
        this.f13825a = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j a2 = j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.e(editableText, 0, length);
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
        EditText editText = this.f13825a;
        if (editText.isInEditMode() || !this.f13827c || j.j == null || i8 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b7 = j.a().b();
        if (b7 != 0) {
            if (b7 == 1) {
                j.a().e((Spannable) charSequence, i7, i9 + i7);
                return;
            } else if (b7 != 3) {
                return;
            }
        }
        j a2 = j.a();
        if (this.f13826b == null) {
            this.f13826b = new W0(editText);
        }
        a2.f(this.f13826b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
