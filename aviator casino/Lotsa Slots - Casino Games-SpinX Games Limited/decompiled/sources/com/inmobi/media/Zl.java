package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Zl {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Zl f5088a = new com.inmobi.media.Zl();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.inmobi.media.C2867x c2867x, java.util.ArrayList arrayList, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Yl yl;
        int i;
        com.inmobi.media.El el;
        com.inmobi.media.Kl e;
        com.inmobi.media.El el2;
        if (continuationImpl instanceof com.inmobi.media.Yl) {
            yl = (com.inmobi.media.Yl) continuationImpl;
            int i2 = yl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yl.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = yl.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yl.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.G g = c2867x.b;
                    el = new com.inmobi.media.El(g);
                    com.inmobi.media.Wl wl = new com.inmobi.media.Wl(c2867x.b.f4714a.b.getVastVideo(), el, c2867x.f5538a.c);
                    try {
                        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(g);
                        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                        com.inmobi.media.C2624nk.b("VastParseStart", a2, com.inmobi.media.EnumC2728rk.f5431a);
                        yl.f5071a = el;
                        try {
                            yl.d = 1;
                            java.lang.Object a3 = wl.a(str, arrayList, yl);
                            if (a3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = a3;
                            el2 = el;
                        } catch (com.inmobi.media.Kl e2) {
                            e = e2;
                            short s = e.f4803a;
                            java.util.Map a4 = com.inmobi.media.AbstractC2938zk.a(el.f4690a);
                            a4.put("errorCode", java.lang.Short.valueOf(s));
                            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
                            com.inmobi.media.C2624nk.b("VastParseFailure", a4, com.inmobi.media.EnumC2728rk.f5431a);
                            throw e;
                        }
                    } catch (com.inmobi.media.Kl e3) {
                        e = e3;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    el2 = yl.f5071a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (com.inmobi.media.Kl e4) {
                        e = e4;
                        el = el2;
                        short s2 = e.f4803a;
                        java.util.Map a42 = com.inmobi.media.AbstractC2938zk.a(el.f4690a);
                        a42.put("errorCode", java.lang.Short.valueOf(s2));
                        com.inmobi.media.C2624nk c2624nk22 = com.inmobi.media.C2624nk.f5360a;
                        com.inmobi.media.C2624nk.b("VastParseFailure", a42, com.inmobi.media.EnumC2728rk.f5431a);
                        throw e;
                    }
                }
                java.util.Map a5 = com.inmobi.media.AbstractC2938zk.a(el2.f4690a);
                com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VastParseSuccess", a5, com.inmobi.media.EnumC2728rk.f5431a);
                return obj;
            }
        }
        yl = new com.inmobi.media.Yl(this, continuationImpl);
        java.lang.Object obj2 = yl.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yl.d;
        if (i != 0) {
        }
        java.util.Map a52 = com.inmobi.media.AbstractC2938zk.a(el2.f4690a);
        com.inmobi.media.C2624nk c2624nk32 = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("VastParseSuccess", a52, com.inmobi.media.EnumC2728rk.f5431a);
        return obj2;
    }
}
