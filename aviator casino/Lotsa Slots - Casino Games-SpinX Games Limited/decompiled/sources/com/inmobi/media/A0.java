package com.inmobi.media;

/* loaded from: classes5.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f4590a = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.HashMap c = new java.util.HashMap();
    public final com.inmobi.media.C2918z0 d = new com.inmobi.media.C2918z0(this);

    public A0() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.A0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.A0.a(com.inmobi.media.A0.this);
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void a(com.inmobi.media.A0 a0) {
        kotlin.Lazy lazy = com.inmobi.media.E0.f4672a;
        com.inmobi.media.H0 h0 = (com.inmobi.media.H0) com.inmobi.media.E0.f4672a.getValue();
        com.inmobi.media.C2918z0 listener = a0.d;
        h0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        h0.b = new java.lang.ref.WeakReference(listener);
    }

    public static final kotlin.Unit b(com.inmobi.media.A0 a0) {
        a0.f4590a.set(true);
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2893y0(a0, (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class), null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public final void a() {
        com.inmobi.media.AbstractC2340d.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.A0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.A0.b(com.inmobi.media.A0.this);
            }
        });
    }

    public static void a(com.inmobi.adquality.models.AdQualityResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        try {
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2868x0(result, null), 1, null);
            if (result.getImageLocation().length() == 0) {
                return;
            }
            new java.io.File(result.getImageLocation()).delete();
        } catch (java.lang.Exception unused) {
        }
    }
}
