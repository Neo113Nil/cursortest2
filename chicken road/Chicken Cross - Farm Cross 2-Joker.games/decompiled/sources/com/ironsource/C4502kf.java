package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4502kf implements Hb<AbstractC4395ef, C4701w> {
    @Override // com.ironsource.Hb
    public C4701w a(AbstractC4395ef input) {
        P7 p7;
        String str;
        String g;
        String i;
        String h;
        Intrinsics.checkNotNullParameter(input, "input");
        EnumC4520lf b = input.b();
        P a2 = input.a();
        String str2 = (a2 == null || (h = a2.h()) == null) ? "0" : h;
        P a3 = input.a();
        String str3 = (a3 == null || (i = a3.i()) == null) ? "0" : i;
        P a4 = input.a();
        String str4 = (a4 == null || (g = a4.g()) == null) ? "0" : g;
        P a5 = input.a();
        if (a5 == null || (p7 = a5.e()) == null) {
            p7 = P7.UnknownProvider;
        }
        P7 p72 = p7;
        P a6 = input.a();
        if (a6 == null || (str = a6.c()) == null) {
            str = "0";
        }
        return new C4701w(b, str2, str3, str4, p72, str);
    }
}
