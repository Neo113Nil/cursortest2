package x1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import n.AbstractC2144n;
import v1.k;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2144n f21083k;

    /* renamed from: l, reason: collision with root package name */
    public h f21084l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21085m = true;

    public i(AbstractC2144n abstractC2144n) {
        this.f21083k = abstractC2144n;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k a5 = k.a();
            if (editableText == null) {
                length = 0;
            } else {
                a5.getClass();
                length = editableText.length();
            }
            a5.g(0, length, 0, editableText);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        AbstractC2144n abstractC2144n = this.f21083k;
        if (!abstractC2144n.isInEditMode() && this.f21085m && k.d() && i5 <= i6 && (charSequence instanceof Spannable)) {
            int c5 = k.a().c();
            if (c5 != 0) {
                if (c5 == 1) {
                    k.a().g(i, i6 + i, 0, (Spannable) charSequence);
                    return;
                } else if (c5 != 3) {
                    return;
                }
            }
            k a5 = k.a();
            if (this.f21084l == null) {
                this.f21084l = new h(abstractC2144n);
            }
            a5.h(this.f21084l);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
    }
}
