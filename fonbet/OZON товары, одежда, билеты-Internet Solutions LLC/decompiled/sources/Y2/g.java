package Y2;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.j;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f34553a;

    /* renamed from: b, reason: collision with root package name */
    private j.f f34554b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34555c = true;

    private static class a extends j.f {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f34556a;

        a(EditText editText) {
            this.f34556a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.j.f
        public final void b() {
            g.b((EditText) this.f34556a.get(), 1);
        }
    }

    g(EditText editText) {
        this.f34553a = editText;
    }

    static void b(EditText editText, int i11) {
        int length;
        if (i11 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j c11 = j.c();
            if (editableText == null) {
                length = 0;
            } else {
                c11.getClass();
                length = editableText.length();
            }
            c11.n(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final boolean a() {
        return this.f34555c;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    public final void c(boolean z11) {
        if (this.f34555c != z11) {
            if (this.f34554b != null) {
                j.c().p(this.f34554b);
            }
            this.f34555c = z11;
            if (z11) {
                b(this.f34553a, j.c().f());
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        EditText editText = this.f34553a;
        if (!editText.isInEditMode() && this.f34555c && j.j() && i12 <= i13 && (charSequence instanceof Spannable)) {
            int f7 = j.c().f();
            if (f7 != 0) {
                if (f7 == 1) {
                    j.c().n(i11, i13 + i11, 0, (Spannable) charSequence);
                    return;
                } else if (f7 != 3) {
                    return;
                }
            }
            j c11 = j.c();
            if (this.f34554b == null) {
                this.f34554b = new a(editText);
            }
            c11.o(this.f34554b);
        }
    }
}
