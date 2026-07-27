package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class L3 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4 A[Catch: Exception -> 0x00eb, CancellationException -> 0x0108, TryCatch #3 {CancellationException -> 0x0108, Exception -> 0x00eb, blocks: (B:13:0x00b9, B:15:0x00c4, B:21:0x00d1, B:23:0x00d5, B:28:0x00e0, B:46:0x00a3), top: B:45:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4066s3 c4066s3, ContinuationImpl continuationImpl) {
        K3 k3;
        int i;
        String str;
        Exception e;
        String str2;
        Of of;
        C4066s3 c4066s32 = c4066s3;
        if (continuationImpl instanceof K3) {
            k3 = (K3) continuationImpl;
            int i2 = k3.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k3.d = i2 - Integer.MIN_VALUE;
                Object obj = k3.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = k3.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    X3 x3 = X3.f6941a;
                    Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                    String str3 = "ping - " + c4066s32.f7366a;
                    X3 x32 = X3.f6941a;
                    str = "access$getTAG$p(...)";
                    Kf kf = new Kf(c4066s32.b, X3.a(c4066s3), new Cm(X3.c().getPingTimeout() * 1000, X3.c().getPingTimeout() * 1000, X3.c().getPingTimeout() * 1000), c4066s32.c, null, c4066s32.d, 16);
                    try {
                        C3733ga c3733ga = (C3733ga) If.f.getValue();
                        k3.f6662a = c4066s32;
                        k3.d = 1;
                        obj = c3733ga.f7119a.a(kf, k3);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CancellationException unused) {
                        str2 = str;
                        X3 x33 = X3.f6941a;
                        Intrinsics.checkNotNullExpressionValue("X3", str2);
                        return B6.n;
                    } catch (Exception e2) {
                        e = e2;
                        X3 x34 = X3.f6941a;
                        Intrinsics.checkNotNullExpressionValue("X3", str);
                        String str4 = "SDK encountered unexpected error in executing ping over HTTP; " + e.getMessage();
                        return B6.d;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4066s32 = k3.f6662a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str = "access$getTAG$p(...)";
                    } catch (CancellationException unused2) {
                        str2 = "access$getTAG$p(...)";
                        X3 x332 = X3.f6941a;
                        Intrinsics.checkNotNullExpressionValue("X3", str2);
                        return B6.n;
                    } catch (Exception e3) {
                        e = e3;
                        str = "access$getTAG$p(...)";
                        X3 x342 = X3.f6941a;
                        Intrinsics.checkNotNullExpressionValue("X3", str);
                        String str42 = "SDK encountered unexpected error in executing ping over HTTP; " + e.getMessage();
                        return B6.d;
                    }
                }
                of = (Of) obj;
                X3 x35 = X3.f6941a;
                if (!AbstractC4086sn.a(of)) {
                    return null;
                }
                int c = of.c();
                if (200 <= c && c < 300) {
                    return null;
                }
                if (!c4066s32.d) {
                    C4262z6 c4262z6 = B6.b;
                    if (303 == c || 302 == c) {
                        return null;
                    }
                }
                B6.b.getClass();
                return C4262z6.a(c);
            }
        }
        k3 = new K3(this, continuationImpl);
        Object obj2 = k3.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = k3.d;
        if (i != 0) {
        }
        of = (Of) obj2;
        X3 x352 = X3.f6941a;
        if (!AbstractC4086sn.a(of)) {
        }
    }
}
