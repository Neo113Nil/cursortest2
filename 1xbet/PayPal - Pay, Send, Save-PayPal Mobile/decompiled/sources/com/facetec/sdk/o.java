package com.facetec.sdk;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    java.lang.String f3697a;
    java.lang.String b;
    java.lang.String c;
    com.facetec.sdk.p d;
    java.util.ArrayList<java.lang.String> e;
    int f;
    java.lang.String g;
    java.lang.String h;
    java.lang.String i;
    boolean j;

    o(java.lang.String str, com.facetec.sdk.p pVar, java.util.ArrayList<java.lang.String> arrayList, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        this.f3697a = str;
        this.d = pVar;
        this.e = arrayList;
        this.c = null;
        this.b = str2;
        this.i = str3;
        this.h = str4;
        this.g = str5;
        this.j = z;
        this.f = 0;
    }

    static com.facetec.sdk.o e(byte[] bArr) throws java.lang.Exception {
        return (com.facetec.sdk.o) new com.facetec.sdk.el().d().c().e(new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8), com.facetec.sdk.o.class);
    }

    public /* synthetic */ o() {
    }
}
