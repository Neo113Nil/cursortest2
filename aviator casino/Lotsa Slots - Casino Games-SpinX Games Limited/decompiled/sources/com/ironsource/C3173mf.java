package com.ironsource;

/* renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3173mf implements com.ironsource.Ib<com.ironsource.AbstractC3066gf, com.ironsource.C3336w> {
    @Override // com.ironsource.Ib
    public com.ironsource.C3336w a(com.ironsource.AbstractC3066gf input) {
        com.ironsource.R7 r7;
        java.lang.String str;
        java.lang.String g;
        java.lang.String i;
        java.lang.String h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        com.ironsource.EnumC3191nf b = input.b();
        com.ironsource.P a2 = input.a();
        java.lang.String str2 = (a2 == null || (h = a2.h()) == null) ? "0" : h;
        com.ironsource.P a3 = input.a();
        java.lang.String str3 = (a3 == null || (i = a3.i()) == null) ? "0" : i;
        com.ironsource.P a4 = input.a();
        java.lang.String str4 = (a4 == null || (g = a4.g()) == null) ? "0" : g;
        com.ironsource.P a5 = input.a();
        if (a5 == null || (r7 = a5.e()) == null) {
            r7 = com.ironsource.R7.UnknownProvider;
        }
        com.ironsource.R7 r72 = r7;
        com.ironsource.P a6 = input.a();
        if (a6 == null || (str = a6.c()) == null) {
            str = "0";
        }
        return new com.ironsource.C3336w(b, str2, str3, str4, r72, str);
    }
}
