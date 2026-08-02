package Pf;

import Pf.f;

/* loaded from: classes10.dex */
public class r extends m {
    public r(String str) {
        super(str);
    }

    static boolean Q(StringBuilder sb2) {
        return sb2.length() != 0 && sb2.charAt(sb2.length() - 1) == ' ';
    }

    @Override // Pf.n
    void A(Of.b bVar, f.a aVar) {
        j.f(bVar, M(), aVar, 1);
    }

    @Override // Pf.n
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public r k() {
        return (r) super.k();
    }

    public final boolean P() {
        return Of.k.f(M());
    }

    @Override // Pf.n
    public final String toString() {
        return z();
    }

    @Override // Pf.n
    public String w() {
        return "#text";
    }
}
