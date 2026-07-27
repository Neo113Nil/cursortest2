package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3569af extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3597bf f7012a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3569af(C3597bf c3597bf, Continuation continuation) {
        super(2, continuation);
        this.f7012a = c3597bf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3569af(this.f7012a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3569af(this.f7012a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f7012a.f.e()) {
            C3597bf c3597bf = this.f7012a;
            MediaPlayer mediaPlayer = c3597bf.c;
            Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException unused) {
            }
            c3597bf.a(c3597bf.k, c3597bf.j);
            AbstractC4012q5.a(c3597bf.e, c3597bf.b, new C3866l2(1.0f, false));
            c3597bf.i = false;
        } else {
            this.f7012a.a();
        }
        return Unit.INSTANCE;
    }
}
