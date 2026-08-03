package com.inmobi.media;

/* renamed from: com.inmobi.media.wn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2865wn {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.MediaPlayer f5536a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final long c;
    public final kotlinx.coroutines.flow.MutableSharedFlow d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public kotlinx.coroutines.Job f;
    public int g;

    public C2865wn(android.media.MediaPlayer mediaPlayer, kotlinx.coroutines.CoroutineScope coroutineScope, long j, kotlinx.coroutines.flow.MutableSharedFlow progressEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        this.f5536a = mediaPlayer;
        this.b = coroutineScope;
        this.c = j;
        this.d = progressEvents;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.C2865wn c2865wn, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2813un c2813un;
        java.lang.Object coroutine_suspended;
        int i;
        int currentPosition;
        java.lang.Object emit;
        int i2;
        java.lang.Object obj;
        int i3;
        java.lang.Object emit2;
        c2865wn.getClass();
        if (continuationImpl instanceof com.inmobi.media.C2813un) {
            c2813un = (com.inmobi.media.C2813un) continuationImpl;
            int i4 = c2813un.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2813un.e = i4 - Integer.MIN_VALUE;
                java.lang.Object obj2 = c2813un.c;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2813un.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    android.media.MediaPlayer mediaPlayer = c2865wn.f5536a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
                    try {
                        if (mediaPlayer.isPlaying()) {
                            currentPosition = c2865wn.f5536a.getCurrentPosition();
                            int duration = c2865wn.f5536a.getDuration();
                            if (duration == -1) {
                                return kotlin.Unit.INSTANCE;
                            }
                            int i5 = duration > 0 ? (currentPosition * 100) / duration : 0;
                            if (c2865wn.g == 4 && i5 < 25) {
                                c2865wn.g = -1;
                            }
                            c2813un.f5494a = currentPosition;
                            c2813un.b = i5;
                            c2813un.e = 1;
                            if (c2865wn.g >= 0) {
                                emit = kotlin.Unit.INSTANCE;
                            } else {
                                c2865wn.g = 0;
                                emit = c2865wn.d.emit(new com.inmobi.media.Bn("VideoProgressTracker", duration), c2813un);
                                if (emit != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    emit = kotlin.Unit.INSTANCE;
                                }
                            }
                            if (emit == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i5;
                        }
                    } catch (java.lang.IllegalStateException unused) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                    i2 = c2813un.b;
                    i3 = c2813un.f5494a;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    c2813un.e = 3;
                    if (c2865wn.g != 4) {
                        emit2 = kotlin.Unit.INSTANCE;
                    } else {
                        emit2 = c2865wn.d.emit(new com.inmobi.media.C2653on(i3, i2), c2813un);
                        if (emit2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            emit2 = kotlin.Unit.INSTANCE;
                        }
                    }
                    if (emit2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                i2 = c2813un.b;
                int i6 = c2813un.f5494a;
                kotlin.ResultKt.throwOnFailure(obj2);
                currentPosition = i6;
                c2813un.f5494a = currentPosition;
                c2813un.b = i2;
                c2813un.e = 2;
                if (!c2865wn.a(i2, 25, 1)) {
                    c2865wn.g = 1;
                    obj = c2865wn.d.emit(com.inmobi.media.Om.f4882a, c2813un);
                    if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj = kotlin.Unit.INSTANCE;
                    }
                } else if (c2865wn.a(i2, 50, 2)) {
                    c2865wn.g = 2;
                    obj = c2865wn.d.emit(com.inmobi.media.C2941zn.f5598a, c2813un);
                    if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj = kotlin.Unit.INSTANCE;
                    }
                } else if (c2865wn.a(i2, 75, 3)) {
                    c2865wn.g = 3;
                    obj = c2865wn.d.emit(com.inmobi.media.In.f4771a, c2813un);
                    if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj = kotlin.Unit.INSTANCE;
                    }
                } else {
                    obj = kotlin.Unit.INSTANCE;
                }
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = currentPosition;
                c2813un.e = 3;
                if (c2865wn.g != 4) {
                }
                if (emit2 == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2813un = new com.inmobi.media.C2813un(c2865wn, continuationImpl);
        java.lang.Object obj22 = c2813un.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2813un.e;
        if (i != 0) {
        }
        c2813un.f5494a = currentPosition;
        c2813un.b = i2;
        c2813un.e = 2;
        if (!c2865wn.a(i2, 25, 1)) {
        }
        if (obj != coroutine_suspended) {
        }
    }

    public final void b() {
        kotlinx.coroutines.Job launch$default;
        if (this.e.getAndSet(true)) {
            return;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.inmobi.media.C2839vn(this, null), 3, null);
        this.f = launch$default;
        a();
    }

    public final void c() {
        if (this.e.getAndSet(false)) {
            this.f5536a.setOnCompletionListener(null);
            com.inmobi.media.L6.a(this.f);
            this.f = null;
        }
    }

    public final void a() {
        this.f5536a.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: com.inmobi.media.wn$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
                com.inmobi.media.C2865wn.a(com.inmobi.media.C2865wn.this, mediaPlayer);
            }
        });
    }

    public static final void a(com.inmobi.media.C2865wn c2865wn, android.media.MediaPlayer mediaPlayer) {
        c2865wn.g = 4;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2865wn.b, null, null, new com.inmobi.media.C2786tn(c2865wn, null), 3, null);
    }

    public final boolean a(int i, int i2, int i3) {
        return i3 >= -1 && i3 <= 4 && i >= i2 && this.g == i3 - 1;
    }
}
