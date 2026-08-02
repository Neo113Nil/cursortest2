package Em0;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class c implements TextWatcher, Bm0.c {

    /* renamed from: b, reason: collision with root package name */
    private String f8134b;

    /* renamed from: c, reason: collision with root package name */
    private Bm0.a f8135c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f8136d;

    /* renamed from: a, reason: collision with root package name */
    private b f8133a = new b();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8137e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8138f = false;

    protected c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Bm0.a aVar;
        Editable editable2;
        String str;
        if (this.f8137e || (aVar = this.f8135c) == null || this.f8138f) {
            this.f8138f = false;
            return;
        }
        String obj = aVar.toString();
        int b11 = this.f8133a.b();
        if (obj.equals(editable.toString())) {
            editable2 = editable;
        } else {
            int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
            int length = b11 > editable.length() ? editable.length() : b11;
            if (composingSpanStart == -1 || length == -1) {
                str = obj;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) obj.substring(0, composingSpanStart));
                SpannableString spannableString = new SpannableString(obj.substring(composingSpanStart, length));
                BaseInputConnection.setComposingSpans(spannableString);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) obj.substring(length, obj.length()));
                str = spannableStringBuilder;
            }
            this.f8137e = true;
            editable2 = editable;
            editable2.replace(0, editable.length(), str, 0, obj.length());
            this.f8137e = false;
        }
        if (b11 >= 0 && b11 <= editable2.length()) {
            TextView textView = this.f8136d;
            if ((textView instanceof EditText) && b11 <= textView.length()) {
                ((EditText) this.f8136d).setSelection(b11);
            }
        }
        this.f8134b = null;
    }

    public final Bm0.a b() {
        return new e(this.f8135c);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        if (this.f8137e || this.f8135c == null) {
            return;
        }
        this.f8134b = new String(charSequence.toString());
        this.f8133a.a(i11, i12, i13);
    }

    public final void c(@NonNull TextView textView) {
        if (textView == null) {
            throw new IllegalArgumentException("text view cannot be null");
        }
        this.f8136d = textView;
        textView.removeTextChangedListener(this);
        textView.addTextChangedListener(this);
        this.f8135c = null;
        d(null);
    }

    public final void d(CharSequence charSequence) {
        boolean z11 = this.f8135c == null;
        Bm0.e a11 = a();
        this.f8135c = a11;
        boolean z12 = charSequence != null;
        b bVar = new b();
        this.f8133a = bVar;
        if (z12) {
            bVar.k(a11.b(0, charSequence));
        }
        if ((!z11 || z12) && this.f8136d != null) {
            this.f8137e = true;
            String obj = this.f8135c.toString();
            TextView textView = this.f8136d;
            if (textView instanceof EditText) {
                Editable editable = (Editable) textView.getText();
                editable.replace(0, editable.length(), obj, 0, obj.length());
            } else {
                textView.setText(obj);
            }
            int W11 = this.f8135c.W();
            TextView textView2 = this.f8136d;
            if ((textView2 instanceof EditText) && W11 <= textView2.length()) {
                ((EditText) this.f8136d).setSelection(W11);
            }
            this.f8137e = false;
        }
    }

    public final void e() {
        TextView textView = this.f8136d;
        if (textView != null) {
            textView.removeTextChangedListener(this);
            this.f8136d = null;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        CharSequence charSequence2;
        if (this.f8137e || this.f8135c == null) {
            return;
        }
        if (this.f8133a.g()) {
            charSequence2 = charSequence.subSequence(this.f8133a.f(), this.f8133a.c());
            if (this.f8133a.i() && this.f8134b.subSequence(this.f8133a.f(), this.f8133a.c()).equals(charSequence2)) {
                this.f8133a.j(charSequence2.length());
            }
        } else {
            charSequence2 = null;
        }
        boolean equals = this.f8134b.equals(charSequence.toString());
        this.f8138f = equals;
        if (equals) {
            return;
        }
        if (this.f8133a.h()) {
            if (this.f8133a.g()) {
                b bVar = this.f8133a;
                bVar.k(this.f8135c.Z(bVar.d(), this.f8133a.e()));
            } else {
                b bVar2 = this.f8133a;
                bVar2.k(this.f8135c.v1(bVar2.d(), this.f8133a.e()));
            }
        }
        if (this.f8133a.g()) {
            b bVar3 = this.f8133a;
            bVar3.k(this.f8135c.u1(bVar3.f(), charSequence2));
        }
    }

    @NonNull
    public final String toString() {
        Bm0.a aVar = this.f8135c;
        return aVar == null ? "" : aVar.toString();
    }
}
