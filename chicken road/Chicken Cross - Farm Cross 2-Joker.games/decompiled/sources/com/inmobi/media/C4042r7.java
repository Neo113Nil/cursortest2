package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4042r7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7344a;
    public final /* synthetic */ AbstractC4070s7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4042r7(AbstractC4070s7 abstractC4070s7, Continuation continuation) {
        super(2, continuation);
        this.b = abstractC4070s7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4042r7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4042r7(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7344a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3639d0 c3639d0 = this.b.f;
                c3639d0.getClass();
                c3639d0.c = SystemClock.elapsedRealtime();
                Integer num = this.b.m.d;
                long intValue = num != null ? num.intValue() : 15000;
                C4014q7 c4014q7 = new C4014q7(this.b, null);
                this.f7344a = 1;
                obj = TimeoutKt.withTimeout(intValue, c4014q7, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.b.f7095a.getClass();
            AbstractC4070s7 abstractC4070s7 = this.b;
            AbstractC3666e0.a("native", abstractC4070s7.d.h, adResponse, abstractC4070s7.e);
            Z9 z9 = this.b.e;
            if (z9 != null) {
                z9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.b.a(adResponse);
        } catch (Z e) {
            Z9 z92 = this.b.e;
            if (z92 != null) {
                z92.b("AUM-FetchingState", "AdResponse Parse Failure " + e);
            }
            this.b.a(e);
        } catch (TimeoutCancellationException unused) {
            Z9 z93 = this.b.e;
            if (z93 != null) {
                z93.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.b.a(new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new C3842k7((short) 2138)));
        }
        return Unit.INSTANCE;
    }
}
