package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4091t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4091t0 f7384a = new C4091t0();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Mf mf, ContinuationImpl continuationImpl) {
        C4035r0 c4035r0;
        int i;
        Of of;
        if (continuationImpl instanceof C4035r0) {
            c4035r0 = (C4035r0) continuationImpl;
            int i2 = c4035r0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4035r0.c = i2 - Integer.MIN_VALUE;
                Object obj = c4035r0.f7339a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4035r0.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    c4035r0.c = 1;
                    obj = b(mf, c4035r0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                of = (Of) obj;
                if (of.c() != 204) {
                    throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4248yk((short) 2286));
                }
                int c = of.c();
                C4262z6 c4262z6 = B6.b;
                if (c == 176) {
                    throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new C3842k7((short) 2369));
                }
                if (of.c() == 200) {
                    return of;
                }
                int c2 = of.c();
                throw new Z(new InMobiAdRequestStatus(c2 != 192 ? c2 != 0 ? (c2 == 504 || c2 == 176) ? InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT : (400 > c2 || c2 >= 500) ? (500 > c2 || c2 > 599) ? InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : InMobiAdRequestStatus.StatusCode.SERVER_ERROR : InMobiAdRequestStatus.StatusCode.REQUEST_INVALID : InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE : InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), new C3871l7(of.c()));
            }
        }
        c4035r0 = new C4035r0(this, continuationImpl);
        Object obj2 = c4035r0.f7339a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4035r0.c;
        if (i != 0) {
        }
        of = (Of) obj2;
        if (of.c() != 204) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Mf mf, ContinuationImpl continuationImpl) {
        C4063s0 c4063s0;
        int i;
        try {
            if (continuationImpl instanceof C4063s0) {
                c4063s0 = (C4063s0) continuationImpl;
                int i2 = c4063s0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4063s0.c = i2 - Integer.MIN_VALUE;
                    Object obj = c4063s0.f7363a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4063s0.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    C3733ga c3733ga = (C3733ga) If.f6628a.getValue();
                    c4063s0.c = 1;
                    Object a2 = c3733ga.f7119a.a(mf, c4063s0);
                    return a2 == coroutine_suspended ? coroutine_suspended : a2;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException unused) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3842k7((short) 2206));
        }
        c4063s0 = new C4063s0(this, continuationImpl);
        Object obj2 = c4063s0.f7363a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4063s0.c;
    }
}
