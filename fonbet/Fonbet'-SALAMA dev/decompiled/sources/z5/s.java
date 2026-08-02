package z5;

import A1.x0;
import java.util.HashMap;
import l.C1373k;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final A5.s f18525a;

    /* renamed from: b, reason: collision with root package name */
    public r f18526b;

    public s(C1373k c1373k) {
        x0 x0Var = new x0(this, 25);
        A5.s sVar = new A5.s(c1373k, "flutter/textinput", A5.m.f675a, null);
        this.f18525a = sVar;
        sVar.b(x0Var);
    }

    public static HashMap a(String str, int i7, int i8, int i9, int i10) {
        HashMap m7 = e1.k.m("text", str);
        AbstractC1663a.k(i7, m7, "selectionBase", i8, "selectionExtent");
        AbstractC1663a.k(i9, m7, "composingBase", i10, "composingExtent");
        return m7;
    }
}
