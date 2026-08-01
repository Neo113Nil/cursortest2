package sg.bigo.ads.n0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: sg.bigo.ads.n0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5417b implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditText f13200a;
    public final /* synthetic */ d b;

    public C5417b(d dVar, EditText editText) {
        this.b = dVar;
        this.f13200a = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.c = this.f13200a.getText().toString();
        d dVar = this.b;
        e eVar = dVar.i;
        if (eVar != null) {
            eVar.a(dVar.f13199a.d, dVar.c);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
