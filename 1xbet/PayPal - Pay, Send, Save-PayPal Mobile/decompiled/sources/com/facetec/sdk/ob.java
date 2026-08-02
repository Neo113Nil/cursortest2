package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ob extends com.facetec.sdk.nf {

    /* renamed from: a, reason: collision with root package name */
    public static int f3698a;
    public static int d;

    @javax.annotation.Nullable
    private final java.lang.String b;
    private final long c;
    private final com.facetec.sdk.pr e;

    public ob(@javax.annotation.Nullable java.lang.String str, long j, com.facetec.sdk.pr prVar) {
        this.b = str;
        this.c = j;
        this.e = prVar;
    }

    @Override // com.facetec.sdk.nf
    public final com.facetec.sdk.mr e() {
        java.lang.String str = this.b;
        if (str != null) {
            return com.facetec.sdk.mr.d(str);
        }
        return null;
    }

    @Override // com.facetec.sdk.nf
    public final long d() {
        return this.c;
    }

    @Override // com.facetec.sdk.nf
    public final com.facetec.sdk.pr b() {
        return this.e;
    }

    public static int c() {
        int i = f3698a;
        f3698a = i + 1;
        if (i % 9742853 != 0) {
            return d;
        }
        int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
        d = maxMemory;
        return maxMemory;
    }
}
