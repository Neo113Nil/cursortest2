package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.nq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3948nq extends T0 {
    public final Mf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3948nq(Mf networkRequest, Z9 z9) {
        super(z9);
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        this.b = networkRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C3920mq c3920mq;
        int i;
        if (continuation instanceof C3920mq) {
            c3920mq = (C3920mq) continuation;
            int i2 = c3920mq.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3920mq.c = i2 - Integer.MIN_VALUE;
                Object obj = c3920mq.f7255a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3920mq.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4091t0 c4091t0 = C4091t0.f7384a;
                    Mf mf = this.b;
                    c3920mq.c = 1;
                    obj = c4091t0.a(mf, c3920mq);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Of of = (Of) obj;
                IntRange intRange = Tf.f6872a;
                Intrinsics.checkNotNullParameter(of, "<this>");
                return of.d().string(Charsets.UTF_8);
            }
        }
        c3920mq = new C3920mq(this, (ContinuationImpl) continuation);
        Object obj2 = c3920mq.f7255a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3920mq.c;
        if (i != 0) {
        }
        Of of2 = (Of) obj2;
        IntRange intRange2 = Tf.f6872a;
        Intrinsics.checkNotNullParameter(of2, "<this>");
        return of2.d().string(Charsets.UTF_8);
    }

    @Override // com.inmobi.media.T0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        String str = "validateAdResponse: " + adResponse;
        X0.a(adResponse, this.f6862a, function1);
        return Unit.INSTANCE;
    }
}
