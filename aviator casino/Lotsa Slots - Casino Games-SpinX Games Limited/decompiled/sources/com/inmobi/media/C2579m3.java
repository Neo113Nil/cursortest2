package com.inmobi.media;

/* renamed from: com.inmobi.media.m3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2579m3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2659p3 f5326a;

    public C2579m3(com.inmobi.media.InterfaceC2659p3 mEventHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mEventHandler, "mEventHandler");
        this.f5326a = mEventHandler;
    }

    public static final kotlin.Unit b(com.inmobi.media.V2 v2) {
        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
        java.lang.String str = v2.b;
        return kotlin.Unit.INSTANCE;
    }

    public final void a(final com.inmobi.media.V2 click) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.m3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2579m3.a(com.inmobi.media.V2.this, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.inmobi.media.Do] */
    public static final void a(final com.inmobi.media.V2 v2, com.inmobi.media.C2579m3 c2579m3) {
        java.lang.String str = v2.b;
        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
        com.inmobi.media.Re re = new com.inmobi.media.Re(str, com.inmobi.media.A3.a(v2), null, null, null, false, 60);
        int pingTimeout = com.inmobi.media.A3.c().getPingTimeout();
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        ?? r7 = new com.inmobi.media.Do(re, new com.inmobi.media.C2553l3(new java.util.concurrent.atomic.AtomicBoolean(false), objectRef, c2579m3, v2), pingTimeout * 1000, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.m3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2579m3.b(com.inmobi.media.V2.this);
            }
        });
        objectRef.element = r7;
        r7.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlin.jvm.internal.Ref.ObjectRef objectRef, com.inmobi.media.C2579m3 c2579m3, com.inmobi.media.V2 v2, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            com.inmobi.media.Do r2 = (com.inmobi.media.Do) objectRef.element;
            if (r2 != null) {
                r2.a();
            }
            if (z) {
                c2579m3.f5326a.a(v2);
            } else {
                c2579m3.f5326a.a(v2, com.inmobi.media.EnumC2372e6.d);
            }
        }
    }
}
