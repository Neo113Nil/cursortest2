package Cm0;

import Dm0.d;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private int f5159a;

    @Override // Cm0.c
    protected final Dm0.b a(char c11) {
        if (Character.isDigit(c11)) {
            Dm0.b bVar = new Dm0.b(this.f5159a, Character.valueOf(c11), Dm0.c.a(new d()));
            this.f5159a = 2;
            return bVar;
        }
        this.f5159a = 3;
        Dm0.b b11 = Dm0.a.b(c11);
        if (c11 == '+') {
            return b11;
        }
        b11.D(14779);
        return b11;
    }

    @Override // Cm0.c, Cm0.b
    @NonNull
    public final Dm0.b[] parseSlots(@NonNull CharSequence charSequence) {
        this.f5159a = 3;
        return super.parseSlots(charSequence);
    }
}
