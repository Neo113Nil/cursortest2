package com.inmobi.media;

/* renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2633o3 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[Catch: Exception -> 0x00dd, CancellationException -> 0x00eb, TryCatch #3 {CancellationException -> 0x00eb, Exception -> 0x00dd, blocks: (B:13:0x00ab, B:15:0x00b6, B:21:0x00c3, B:23:0x00c7, B:28:0x00d2, B:46:0x0095), top: B:45:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.V2 v2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2605n3 c2605n3;
        int i;
        java.lang.String str;
        java.lang.Exception e;
        java.lang.String str2;
        com.inmobi.media.Ve ve;
        com.inmobi.media.V2 v22 = v2;
        if (continuationImpl instanceof com.inmobi.media.C2605n3) {
            c2605n3 = (com.inmobi.media.C2605n3) continuationImpl;
            int i2 = c2605n3.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2605n3.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2605n3.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2605n3.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                    int i3 = v22.f5007a;
                    com.inmobi.media.A3 a32 = com.inmobi.media.A3.f4593a;
                    str = "access$getTAG$p(...)";
                    com.inmobi.media.Re re = new com.inmobi.media.Re(v22.b, com.inmobi.media.A3.a(v2), new com.inmobi.media.Gk(com.inmobi.media.A3.c().getPingTimeout() * 1000, com.inmobi.media.A3.c().getPingTimeout() * 1000, com.inmobi.media.A3.c().getPingTimeout() * 1000), v22.c, null, v22.d, 16);
                    try {
                        com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.f.getValue();
                        c2605n3.f5348a = v22;
                        c2605n3.d = 1;
                        obj = b9.f4618a.a(re, c2605n3);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.util.concurrent.CancellationException unused) {
                        str2 = str;
                        com.inmobi.media.A3 a33 = com.inmobi.media.A3.f4593a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", str2);
                        return com.inmobi.media.EnumC2372e6.n;
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        com.inmobi.media.A3 a34 = com.inmobi.media.A3.f4593a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", str);
                        e.getMessage();
                        return com.inmobi.media.EnumC2372e6.d;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v22 = c2605n3.f5348a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = "access$getTAG$p(...)";
                    } catch (java.util.concurrent.CancellationException unused2) {
                        str2 = "access$getTAG$p(...)";
                        com.inmobi.media.A3 a332 = com.inmobi.media.A3.f4593a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", str2);
                        return com.inmobi.media.EnumC2372e6.n;
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        str = "access$getTAG$p(...)";
                        com.inmobi.media.A3 a342 = com.inmobi.media.A3.f4593a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", str);
                        e.getMessage();
                        return com.inmobi.media.EnumC2372e6.d;
                    }
                }
                ve = (com.inmobi.media.Ve) obj;
                com.inmobi.media.A3 a35 = com.inmobi.media.A3.f4593a;
                if (!com.inmobi.media.AbstractC2889xl.a(ve)) {
                    return null;
                }
                int c = ve.c();
                if (200 <= c && c < 300) {
                    return null;
                }
                if (!v22.d) {
                    com.inmobi.media.C2320c6 c2320c6 = com.inmobi.media.EnumC2372e6.b;
                    if (303 == c || 302 == c) {
                        return null;
                    }
                }
                com.inmobi.media.EnumC2372e6.b.getClass();
                return com.inmobi.media.C2320c6.a(c);
            }
        }
        c2605n3 = new com.inmobi.media.C2605n3(this, continuationImpl);
        java.lang.Object obj2 = c2605n3.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2605n3.d;
        if (i != 0) {
        }
        ve = (com.inmobi.media.Ve) obj2;
        com.inmobi.media.A3 a352 = com.inmobi.media.A3.f4593a;
        if (!com.inmobi.media.AbstractC2889xl.a(ve)) {
        }
    }
}
