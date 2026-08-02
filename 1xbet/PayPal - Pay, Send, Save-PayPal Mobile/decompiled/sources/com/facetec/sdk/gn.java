package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gn {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3610a;
    public static final com.facetec.sdk.ga.c<? extends java.util.Date> b;
    public static final com.facetec.sdk.fb c;
    public static final com.facetec.sdk.ga.c<? extends java.util.Date> d;
    public static final com.facetec.sdk.fb e;
    public static final com.facetec.sdk.fb f;

    static {
        boolean z;
        try {
            java.lang.Class.forName("java.sql.Date");
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
            z = false;
        }
        f3610a = z;
        if (z) {
            d = new com.facetec.sdk.ga.c<java.sql.Date>(java.sql.Date.class) { // from class: com.facetec.sdk.gn.3
                @Override // com.facetec.sdk.ga.c
                public final /* synthetic */ java.sql.Date b(java.util.Date date) {
                    return new java.sql.Date(date.getTime());
                }
            };
            b = new com.facetec.sdk.ga.c<java.sql.Timestamp>(java.sql.Timestamp.class) { // from class: com.facetec.sdk.gn.1
                @Override // com.facetec.sdk.ga.c
                public final /* synthetic */ java.sql.Timestamp b(java.util.Date date) {
                    return new java.sql.Timestamp(date.getTime());
                }
            };
            e = com.facetec.sdk.gq.d;
            c = com.facetec.sdk.go.d;
            f = com.facetec.sdk.gp.f3611a;
            return;
        }
        d = null;
        b = null;
        e = null;
        c = null;
        f = null;
    }
}
