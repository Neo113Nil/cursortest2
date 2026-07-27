package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qe extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Te f6802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qe(Te te, Continuation continuation) {
        super(2, continuation);
        this.f6802a = te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Qe(this.f6802a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Qe(this.f6802a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Te te = this.f6802a;
        if (te.b.b) {
            C4116tp c4116tp = te.l;
            c4116tp.c();
            c4116tp.g = -1;
            c4116tp.b();
            MediaPlayer mediaPlayer = this.f6802a.j;
            Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.seekTo(0);
            } catch (IllegalStateException unused) {
            }
            MediaPlayer mediaPlayer2 = this.f6802a.j;
            Intrinsics.checkNotNullParameter(mediaPlayer2, "<this>");
            try {
                mediaPlayer2.start();
            } catch (IllegalStateException unused2) {
            }
        } else {
            te.l.c();
            Oh oh = (Oh) this.f6802a.m.i.d.getValue();
            oh.f.set(true);
            AbstractC3787i7.a(oh.e);
            oh.e = null;
            this.f6802a.g = Kh.f;
        }
        return Unit.INSTANCE;
    }
}
