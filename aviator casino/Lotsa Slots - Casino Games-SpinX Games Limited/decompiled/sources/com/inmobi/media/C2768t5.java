package com.inmobi.media;

/* renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2768t5 extends com.inmobi.media.AbstractC2699qg {
    public final com.inmobi.media.C2538kf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2768t5(com.inmobi.media.C2884xg dao) {
        super(dao);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
        this.d = new com.inmobi.media.C2538kf(dao, new com.inmobi.media.C2713r5(this), this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        if (r13.a(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.Zf zf, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2739s5 c2739s5;
        java.lang.Object obj;
        int i;
        if (continuationImpl instanceof com.inmobi.media.C2739s5) {
            c2739s5 = (com.inmobi.media.C2739s5) continuationImpl;
            int i2 = c2739s5.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2739s5.d = i2 - Integer.MIN_VALUE;
                obj = c2739s5.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2739s5.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("t5", "TAG");
                    java.lang.String str = zf.b;
                    java.lang.String str2 = zf.e;
                    c2739s5.f5440a = zf;
                    c2739s5.d = 1;
                    obj = a(str2, c2739s5);
                } else if (i == 1) {
                    zf = c2739s5.f5440a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2538kf c2538kf = this.d;
                    c2739s5.d = 3;
                }
                com.inmobi.media.Zf zf2 = zf;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.b.get(zf2.h);
                    com.inmobi.media.AbstractC2699qg.a(0, "Database capacity exceeded for pings", (short) 2248, zf2, java.lang.System.currentTimeMillis(), weakReference != null ? (com.inmobi.media.InterfaceC2620ng) weakReference.get() : null);
                    return kotlin.Unit.INSTANCE;
                }
                com.inmobi.media.C2884xg c2884xg = this.f5411a;
                c2739s5.f5440a = null;
                c2739s5.d = 2;
                java.lang.Object a2 = c2884xg.f5552a.a("pings", com.inmobi.media.AbstractC2909yg.a(zf2), 4, c2739s5);
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
            }
        }
        c2739s5 = new com.inmobi.media.C2739s5(this, continuationImpl);
        obj = c2739s5.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2739s5.d;
        if (i != 0) {
        }
        com.inmobi.media.Zf zf22 = zf;
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
