package com.inmobi.media;

/* renamed from: com.inmobi.media.y6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2899y6 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.ExoPlayer f5564a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final kotlinx.coroutines.flow.MutableSharedFlow c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public kotlinx.coroutines.Job e;
    public kotlinx.coroutines.Job f;
    public int g;
    public boolean[] h;
    public final int[] i;
    public final com.inmobi.media.AbstractC2493im[] j;
    public final long k;
    public final long l;

    public C2899y6(androidx.media3.exoplayer.ExoPlayer player, com.inmobi.media.core.config.models.AdConfig.HybridNativeConfig hybridNativeConfig, kotlinx.coroutines.CoroutineScope coroutineScope, long j, kotlinx.coroutines.flow.MutableSharedFlow progressEvents, com.inmobi.media.videoPlayer.model.TrackPercentage trackPercentage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(player, "player");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackPercentage, "trackPercentage");
        this.f5564a = player;
        this.b = coroutineScope;
        this.c = progressEvents;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = -1;
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        this.h = zArr;
        this.i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.j = new com.inmobi.media.AbstractC2493im[]{com.inmobi.media.Om.f4882a, com.inmobi.media.C2941zn.f5598a, com.inmobi.media.In.f4771a, com.inmobi.media.Pm.f4903a};
        this.k = 200L;
        this.l = kotlin.ranges.RangesKt.coerceAtLeast(j, hybridNativeConfig.getMinProgressInterval());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r9.a(r2, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.C2899y6 c2899y6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2822v6 c2822v6;
        int i;
        int currentPosition;
        java.lang.Object emit;
        c2899y6.getClass();
        if (continuationImpl instanceof com.inmobi.media.C2822v6) {
            c2822v6 = (com.inmobi.media.C2822v6) continuationImpl;
            int i2 = c2822v6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2822v6.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2822v6.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2822v6.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!c2899y6.f5564a.isPlaying()) {
                        return kotlin.Unit.INSTANCE;
                    }
                    int duration = (int) c2899y6.f5564a.getDuration();
                    if (duration <= 0) {
                        return kotlin.Unit.INSTANCE;
                    }
                    currentPosition = (((int) c2899y6.f5564a.getCurrentPosition()) * 100) / duration;
                    if (c2899y6.g == 2 && currentPosition < c2899y6.i[0]) {
                        c2899y6.g = -1;
                        boolean[] zArr = new boolean[4];
                        for (int i3 = 0; i3 < 4; i3++) {
                            zArr[i3] = false;
                        }
                        c2899y6.h = zArr;
                    }
                    c2822v6.f5503a = currentPosition;
                    c2822v6.d = 1;
                    if (c2899y6.g >= 0) {
                        emit = kotlin.Unit.INSTANCE;
                    } else {
                        c2899y6.g = 0;
                        emit = c2899y6.c.emit(new com.inmobi.media.Bn("ExoVideoProgressTracker", duration), c2822v6);
                        if (emit != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            emit = kotlin.Unit.INSTANCE;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    currentPosition = c2822v6.f5503a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                c2822v6.d = 2;
            }
        }
        c2822v6 = new com.inmobi.media.C2822v6(c2899y6, continuationImpl);
        java.lang.Object obj2 = c2822v6.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2822v6.d;
        if (i != 0) {
        }
        c2822v6.d = 2;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            com.inmobi.media.L6.a(this.e);
            com.inmobi.media.L6.a(this.f);
            this.e = null;
            this.f = null;
        }
    }

    public static final java.lang.Object a(com.inmobi.media.C2899y6 c2899y6, com.inmobi.media.C2874x6 c2874x6) {
        java.lang.Object emit;
        if (!c2899y6.f5564a.isPlaying()) {
            return kotlin.Unit.INSTANCE;
        }
        long duration = c2899y6.f5564a.getDuration();
        if (duration <= 0) {
            return kotlin.Unit.INSTANCE;
        }
        return (c2899y6.g != 2 && (emit = c2899y6.c.emit(new com.inmobi.media.C2664p8(c2899y6.f5564a.getCurrentPosition(), duration), c2874x6)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? emit : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:10:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:10:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:10:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(int i, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2769t6 c2769t6;
        int i2;
        int i3;
        int i4;
        int length;
        if (continuationImpl instanceof com.inmobi.media.C2769t6) {
            c2769t6 = (com.inmobi.media.C2769t6) continuationImpl;
            int i5 = c2769t6.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2769t6.f = i5 - Integer.MIN_VALUE;
                java.lang.Object obj = c2769t6.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2769t6.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = 0;
                    i4 = i;
                    length = this.i.length;
                    if (i3 < length) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = c2769t6.c;
                    i3 = c2769t6.b;
                    int i6 = c2769t6.f5459a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i4 = i6;
                    i3++;
                    if (i3 < length) {
                        if (i4 >= this.i[i3]) {
                            boolean[] zArr = this.h;
                            if (!zArr[i3]) {
                                zArr[i3] = true;
                                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.c;
                                com.inmobi.media.AbstractC2493im abstractC2493im = this.j[i3];
                                c2769t6.f5459a = i4;
                                c2769t6.b = i3;
                                c2769t6.c = length;
                                c2769t6.f = 1;
                                if (mutableSharedFlow.emit(abstractC2493im, c2769t6) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        i3++;
                        if (i3 < length) {
                        }
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
        c2769t6 = new com.inmobi.media.C2769t6(this, continuationImpl);
        java.lang.Object obj2 = c2769t6.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2769t6.f;
        if (i2 != 0) {
        }
    }
}
