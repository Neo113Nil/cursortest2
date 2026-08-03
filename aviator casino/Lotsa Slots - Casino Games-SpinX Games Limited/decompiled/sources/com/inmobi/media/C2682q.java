package com.inmobi.media;

/* renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2682q {
    public static android.media.AudioManager b;
    public static com.inmobi.media.C2522k c;
    public static kotlinx.coroutines.Job f;
    public static kotlin.jvm.functions.Function1 i;

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2682q f5400a = new com.inmobi.media.C2682q();
    public static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference(null);
    public static final kotlinx.coroutines.CoroutineScope g = com.inmobi.media.H9.d;
    public static final java.util.concurrent.CopyOnWriteArraySet h = new java.util.concurrent.CopyOnWriteArraySet();

    public static final kotlin.Unit a(long j, com.inmobi.media.J2 it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.f4774a;
        if (i2 != 101) {
            if (i2 == 102) {
                kotlinx.coroutines.Job job = f;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                f = null;
            }
        } else if (f == null && d.get()) {
            f = com.inmobi.media.J3.a(g, 0L, j, new com.inmobi.media.C2629o(null));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b() {
        try {
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.y()) {
                android.media.AudioManager audioManager = b;
                if (audioManager != null && audioManager.isStreamMute(3)) {
                }
                return !com.inmobi.media.Xi.f;
            }
            android.media.AudioManager audioManager2 = b;
            if (audioManager2 != null && audioManager2.getStreamVolume(3) == 0) {
            }
            if (!com.inmobi.media.Xi.f) {
            }
        } catch (java.lang.Throwable unused) {
            return com.inmobi.media.Xi.f;
        }
    }

    public static void a(final long j) {
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2682q.a(j, (com.inmobi.media.J2) obj);
            }
        };
        i = function1;
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{102, 101}, function1);
    }

    public static void a(final com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        final android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((java.lang.Float) null);
            return;
        }
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        final long muteChangeInterval = ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getMraid3().getMuteChangeInterval();
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(com.inmobi.media.L3.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2682q.a(com.inmobi.media.InterfaceC2772t9.this, context, muteChangeInterval);
            }
        }));
        if (m10801exceptionOrNullimpl != null) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("AdAudioTracker", "Error starting audio volume tracking - " + m10801exceptionOrNullimpl.getMessage());
            }
            a((java.lang.Float) null);
        }
    }

    public static final java.lang.Object a(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, android.content.Context context, long j) {
        kotlinx.coroutines.Job launch$default;
        if (d.compareAndSet(false, true)) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(g, null, null, new com.inmobi.media.C2655p(interfaceC2772t9, context, j, null), 3, null);
            return launch$default;
        }
        if (interfaceC2772t9 == null) {
            return null;
        }
        ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AdAudioTracker", "Audio volume tracking is already started");
        return kotlin.Unit.INSTANCE;
    }

    public static void a(final android.content.Context context, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(com.inmobi.media.L3.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2682q.a(context);
            }
        }));
        if (m10801exceptionOrNullimpl == null || interfaceC2772t9 == null) {
            return;
        }
        ((com.inmobi.media.C2799u9) interfaceC2772t9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + m10801exceptionOrNullimpl.getMessage());
    }

    public static final kotlin.Unit a(final android.content.Context context) {
        final com.inmobi.media.C2522k c2522k = c;
        if (c2522k != null) {
            com.inmobi.media.L3.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.C2682q.a(context, c2522k);
                }
            });
            c = null;
        }
        kotlinx.coroutines.Job job = f;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        kotlin.jvm.functions.Function1 function1 = i;
        if (function1 != null) {
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(function1);
        }
        i = null;
        f = null;
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(android.content.Context context, com.inmobi.media.C2522k c2522k) {
        context.unregisterReceiver(c2522k);
        return kotlin.Unit.INSTANCE;
    }

    public final synchronized float a() {
        try {
            boolean b2 = b();
            android.media.AudioManager audioManager = b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            android.media.AudioManager audioManager2 = b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (b2) {
                return 0.0f;
            }
            if (streamVolume < 0) {
                return 0.0f;
            }
            if (streamVolume > streamMaxVolume) {
                return 1.0f;
            }
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static void a(java.lang.Float f2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Float) e.getAndSet(f2), f2)) {
            return;
        }
        java.util.Iterator it = h.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            com.inmobi.media.InterfaceC2496j interfaceC2496j = (com.inmobi.media.InterfaceC2496j) ((java.lang.ref.WeakReference) it.next()).get();
            if (interfaceC2496j != null) {
                ((com.inmobi.media.Yh) interfaceC2496j).a(f2 != null ? java.lang.Float.valueOf(com.inmobi.media.J3.a(f2.floatValue() * 100.0f)) : null);
            }
        }
    }
}
