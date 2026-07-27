package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final class V6 {

    /* renamed from: a, reason: collision with root package name */
    public final ExoPlayer f6908a;
    public final CoroutineScope b;
    public final MutableSharedFlow c;
    public final AtomicBoolean d;
    public Job e;
    public Job f;
    public int g;
    public boolean[] h;
    public final int[] i;
    public final AbstractC3691eo[] j;
    public final long k;
    public final long l;

    public V6(ExoPlayer player, AdConfig.HybridNativeConfig hybridNativeConfig, CoroutineScope coroutineScope, long j, MutableSharedFlow progressEvents, TrackPercentage trackPercentage) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        Intrinsics.checkNotNullParameter(trackPercentage, "trackPercentage");
        this.f6908a = player;
        this.b = coroutineScope;
        this.c = progressEvents;
        this.d = new AtomicBoolean(false);
        this.g = -1;
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        this.h = zArr;
        this.i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.j = new AbstractC3691eo[]{Ko.f6680a, C4199wp.f7467a, Fp.f6567a, Lo.f6702a};
        this.k = 200L;
        this.l = RangesKt.coerceAtLeast(j, hybridNativeConfig.getMinProgressInterval());
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
    public static final Object a(V6 v6, ContinuationImpl continuationImpl) {
        S6 s6;
        int i;
        int currentPosition;
        Object emit;
        v6.getClass();
        if (continuationImpl instanceof S6) {
            s6 = (S6) continuationImpl;
            int i2 = s6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s6.d = i2 - Integer.MIN_VALUE;
                Object obj = s6.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s6.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!v6.f6908a.isPlaying()) {
                        return Unit.INSTANCE;
                    }
                    int duration = (int) v6.f6908a.getDuration();
                    if (duration <= 0) {
                        return Unit.INSTANCE;
                    }
                    currentPosition = (((int) v6.f6908a.getCurrentPosition()) * 100) / duration;
                    if (v6.g == 2 && currentPosition < v6.i[0]) {
                        v6.g = -1;
                        boolean[] zArr = new boolean[4];
                        for (int i3 = 0; i3 < 4; i3++) {
                            zArr[i3] = false;
                        }
                        v6.h = zArr;
                    }
                    s6.f6843a = currentPosition;
                    s6.d = 1;
                    if (v6.g >= 0) {
                        emit = Unit.INSTANCE;
                    } else {
                        v6.g = 0;
                        emit = v6.c.emit(new C4253yp("ExoVideoProgressTracker", duration), s6);
                        if (emit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            emit = Unit.INSTANCE;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    currentPosition = s6.f6843a;
                    ResultKt.throwOnFailure(obj);
                }
                s6.d = 2;
            }
        }
        s6 = new S6(v6, continuationImpl);
        Object obj2 = s6.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s6.d;
        if (i != 0) {
        }
        s6.d = 2;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            AbstractC3787i7.a(this.e);
            AbstractC3787i7.a(this.f);
            this.e = null;
            this.f = null;
        }
    }

    public static final Object a(V6 v6, U6 u6) {
        Object emit;
        if (!v6.f6908a.isPlaying()) {
            return Unit.INSTANCE;
        }
        long duration = v6.f6908a.getDuration();
        if (duration <= 0) {
            return Unit.INSTANCE;
        }
        return (v6.g != 2 && (emit = v6.c.emit(new R8(v6.f6908a.getCurrentPosition(), duration), u6)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? emit : Unit.INSTANCE;
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
    public final Object a(int i, ContinuationImpl continuationImpl) {
        Q6 q6;
        int i2;
        int i3;
        int i4;
        int length;
        if (continuationImpl instanceof Q6) {
            q6 = (Q6) continuationImpl;
            int i5 = q6.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                q6.f = i5 - Integer.MIN_VALUE;
                Object obj = q6.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = q6.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    i3 = 0;
                    i4 = i;
                    length = this.i.length;
                    if (i3 < length) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = q6.c;
                    i3 = q6.b;
                    int i6 = q6.f6795a;
                    ResultKt.throwOnFailure(obj);
                    i4 = i6;
                    i3++;
                    if (i3 < length) {
                        if (i4 >= this.i[i3]) {
                            boolean[] zArr = this.h;
                            if (!zArr[i3]) {
                                zArr[i3] = true;
                                MutableSharedFlow mutableSharedFlow = this.c;
                                AbstractC3691eo abstractC3691eo = this.j[i3];
                                q6.f6795a = i4;
                                q6.b = i3;
                                q6.c = length;
                                q6.f = 1;
                                if (mutableSharedFlow.emit(abstractC3691eo, q6) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        i3++;
                        if (i3 < length) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        q6 = new Q6(this, continuationImpl);
        Object obj2 = q6.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = q6.f;
        if (i2 != 0) {
        }
    }
}
