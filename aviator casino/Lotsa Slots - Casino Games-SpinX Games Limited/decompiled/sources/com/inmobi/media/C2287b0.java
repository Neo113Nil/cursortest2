package com.inmobi.media;

/* renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2287b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f5111a;
    public final java.lang.String b;
    public final boolean c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.lang.String e;
    public com.inmobi.media.C2799u9 f;

    public C2287b0(java.lang.ref.WeakReference adUnitEventListener, java.lang.String adtype, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitEventListener, "adUnitEventListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adtype, "adtype");
        this.f5111a = adUnitEventListener;
        this.b = adtype;
        this.c = z;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.inmobi.media.C2287b0.class).getSimpleName());
    }

    public final void a(com.inmobi.media.C2888xk c2888xk) {
        com.inmobi.media.Ph ph;
        com.inmobi.media.C2913yk c2913yk;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        if (!this.d.getAndSet(true)) {
            com.inmobi.media.C2386ej c2386ej = com.inmobi.media.C2386ej.f5183a;
            java.lang.String str = this.b;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.c);
            c2386ej.getClass();
            com.inmobi.media.C2386ej.a(str, valueOf);
            com.inmobi.media.AbstractC2421g1 abstractC2421g1 = (com.inmobi.media.AbstractC2421g1) this.f5111a.get();
            if (abstractC2421g1 != null) {
                abstractC2421g1.a(c2888xk);
            } else if (c2888xk != null) {
                c2888xk.b();
            }
            com.inmobi.media.C2799u9 c2799u9 = this.f;
            if (c2799u9 != null) {
                c2799u9.a(this.e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 == null || (ph = c2799u92.f5484a) == null) {
                return;
            }
            ph.a();
            return;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            c2799u93.c(this.e, "skipping as Impression is already Called");
        }
        if (c2888xk != null) {
            com.inmobi.media.C2709r1 c2709r1 = c2888xk.f5555a;
            if (c2709r1 == null || (c2913yk = c2709r1.b) == null || (atomicBoolean = c2913yk.f5575a) == null || !atomicBoolean.getAndSet(true)) {
                java.util.LinkedHashMap a2 = c2888xk.a();
                a2.put("networkType", com.inmobi.media.B5.g());
                a2.put("errorCode", (short) 2179);
                java.lang.String str2 = c2888xk.d;
                if (str2 == null) {
                    str2 = "";
                }
                a2.put("impressionId", str2);
                com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("AdImpressionSuccessful", a2, com.inmobi.media.EnumC2728rk.f5431a);
            }
        }
    }
}
