package com.inmobi.media;

/* renamed from: com.inmobi.media.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2734s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2734s0 f5435a = new com.inmobi.media.C2734s0();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.Te te, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2683q0 c2683q0;
        int i;
        com.inmobi.media.Ve ve;
        if (continuationImpl instanceof com.inmobi.media.C2683q0) {
            c2683q0 = (com.inmobi.media.C2683q0) continuationImpl;
            int i2 = c2683q0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2683q0.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2683q0.f5401a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2683q0.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c2683q0.c = 1;
                    obj = b(te, c2683q0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ve = (com.inmobi.media.Ve) obj;
                if (ve.c() != 204) {
                    throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_FILL), new com.inmobi.media.O6(ve.c()));
                }
                int c = ve.c();
                com.inmobi.media.C2320c6 c2320c6 = com.inmobi.media.EnumC2372e6.b;
                if (c == 176) {
                    throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new com.inmobi.media.N6((short) 2369));
                }
                if (ve.c() == 200) {
                    return ve;
                }
                int c2 = ve.c();
                throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(c2 != 192 ? c2 != 0 ? (c2 == 504 || c2 == 176) ? com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT : (400 > c2 || c2 >= 500) ? (500 > c2 || c2 > 599) ? com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : com.inmobi.ads.InMobiAdRequestStatus.StatusCode.SERVER_ERROR : com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_INVALID : com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE : com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), new com.inmobi.media.O6(ve.c()));
            }
        }
        c2683q0 = new com.inmobi.media.C2683q0(this, continuationImpl);
        java.lang.Object obj2 = c2683q0.f5401a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2683q0.c;
        if (i != 0) {
        }
        ve = (com.inmobi.media.Ve) obj2;
        if (ve.c() != 204) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.inmobi.media.Te te, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2708r0 c2708r0;
        int i;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2708r0) {
                c2708r0 = (com.inmobi.media.C2708r0) continuationImpl;
                int i2 = c2708r0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2708r0.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2708r0.f5415a;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2708r0.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.f4897a.getValue();
                    c2708r0.c = 1;
                    java.lang.Object a2 = b9.f4618a.a(te, c2708r0);
                    return a2 == coroutine_suspended ? coroutine_suspended : a2;
                }
            }
            if (i == 0) {
            }
        } catch (java.util.concurrent.CancellationException unused) {
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.N6((short) 2206));
        }
        c2708r0 = new com.inmobi.media.C2708r0(this, continuationImpl);
        java.lang.Object obj2 = c2708r0.f5415a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2708r0.c;
    }
}
