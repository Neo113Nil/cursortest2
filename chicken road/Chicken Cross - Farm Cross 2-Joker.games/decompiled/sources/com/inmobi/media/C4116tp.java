package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.tp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4116tp {

    /* renamed from: a, reason: collision with root package name */
    public final MediaPlayer f7402a;
    public final CoroutineScope b;
    public final long c;
    public final MutableSharedFlow d;
    public final AtomicBoolean e;
    public Job f;
    public int g;

    public C4116tp(MediaPlayer mediaPlayer, CoroutineScope coroutineScope, long j, MutableSharedFlow progressEvents) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        this.f7402a = mediaPlayer;
        this.b = coroutineScope;
        this.c = j;
        this.d = progressEvents;
        this.e = new AtomicBoolean(false);
        this.g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C4116tp c4116tp, ContinuationImpl continuationImpl) {
        C4060rp c4060rp;
        Object coroutine_suspended;
        int i;
        boolean z;
        int currentPosition;
        Object emit;
        int i2;
        Object obj;
        int i3;
        Object emit2;
        c4116tp.getClass();
        if (continuationImpl instanceof C4060rp) {
            c4060rp = (C4060rp) continuationImpl;
            int i4 = c4060rp.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c4060rp.e = i4 - Integer.MIN_VALUE;
                Object obj2 = c4060rp.c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4060rp.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    MediaPlayer mediaPlayer = c4116tp.f7402a;
                    Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
                    try {
                        z = mediaPlayer.isPlaying();
                    } catch (IllegalStateException unused) {
                        z = false;
                    }
                    if (z) {
                        currentPosition = c4116tp.f7402a.getCurrentPosition();
                        int duration = c4116tp.f7402a.getDuration();
                        if (duration == -1) {
                            return Unit.INSTANCE;
                        }
                        int i5 = duration > 0 ? (currentPosition * 100) / duration : 0;
                        if (c4116tp.g == 4 && i5 < 25) {
                            c4116tp.g = -1;
                        }
                        c4060rp.f7360a = currentPosition;
                        c4060rp.b = i5;
                        c4060rp.e = 1;
                        if (c4116tp.g >= 0) {
                            emit = Unit.INSTANCE;
                        } else {
                            c4116tp.g = 0;
                            emit = c4116tp.d.emit(new C4253yp("VideoProgressTracker", duration), c4060rp);
                            if (emit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                emit = Unit.INSTANCE;
                            }
                        }
                        if (emit == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = i5;
                        c4060rp.f7360a = currentPosition;
                        c4060rp.b = i2;
                        c4060rp.e = 2;
                        if (!c4116tp.a(i2, 25, 1)) {
                        }
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    i2 = c4060rp.b;
                    int i6 = c4060rp.f7360a;
                    ResultKt.throwOnFailure(obj2);
                    currentPosition = i6;
                    c4060rp.f7360a = currentPosition;
                    c4060rp.b = i2;
                    c4060rp.e = 2;
                    if (!c4116tp.a(i2, 25, 1)) {
                        c4116tp.g = 1;
                        obj = c4116tp.d.emit(Ko.f6680a, c4060rp);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else if (c4116tp.a(i2, 50, 2)) {
                        c4116tp.g = 2;
                        obj = c4116tp.d.emit(C4199wp.f7467a, c4060rp);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else if (c4116tp.a(i2, 75, 3)) {
                        c4116tp.g = 3;
                        obj = c4116tp.d.emit(Fp.f6567a, c4060rp);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = currentPosition;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    i2 = c4060rp.b;
                    i3 = c4060rp.f7360a;
                    ResultKt.throwOnFailure(obj2);
                }
                c4060rp.e = 3;
                if (c4116tp.g != 4) {
                    emit2 = Unit.INSTANCE;
                } else {
                    emit2 = c4116tp.d.emit(new C3891lp(i3, i2), c4060rp);
                    if (emit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        emit2 = Unit.INSTANCE;
                    }
                }
                if (emit2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        c4060rp = new C4060rp(c4116tp, continuationImpl);
        Object obj22 = c4060rp.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4060rp.e;
        if (i != 0) {
        }
        c4060rp.e = 3;
        if (c4116tp.g != 4) {
        }
        if (emit2 == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final void b() {
        Job launch$default;
        if (this.e.getAndSet(true)) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new C4088sp(this, null), 3, null);
        this.f = launch$default;
        a();
    }

    public final void c() {
        if (this.e.getAndSet(false)) {
            this.f7402a.setOnCompletionListener(null);
            AbstractC3787i7.a(this.f);
            this.f = null;
        }
    }

    public final void a() {
        this.f7402a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.inmobi.media.tp$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C4116tp.a(C4116tp.this, mediaPlayer);
            }
        });
    }

    public static final void a(C4116tp c4116tp, MediaPlayer mediaPlayer) {
        c4116tp.g = 4;
        BuildersKt__Builders_commonKt.launch$default(c4116tp.b, null, null, new C4032qp(c4116tp, null), 3, null);
    }

    public final boolean a(int i, int i2, int i3) {
        return i3 >= -1 && i3 <= 4 && i >= i2 && this.g == i3 - 1;
    }
}
