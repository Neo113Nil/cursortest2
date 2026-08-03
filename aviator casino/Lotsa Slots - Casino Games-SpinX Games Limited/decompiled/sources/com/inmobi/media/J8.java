package com.inmobi.media;

/* loaded from: classes5.dex */
public final class J8 extends com.inmobi.media.AbstractC2699qg {
    public final com.inmobi.media.C2690q7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8(com.inmobi.media.C2884xg dao) {
        super(dao);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
        this.d = new com.inmobi.media.C2690q7(dao, new com.inmobi.media.I8(this), this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.Zf zf, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.G8 g8;
        int i;
        if (continuationImpl instanceof com.inmobi.media.G8) {
            g8 = (com.inmobi.media.G8) continuationImpl;
            int i2 = g8.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g8.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = g8.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g8.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2698qf c2698qf = this.c;
                    g8.f4721a = zf;
                    g8.d = 1;
                    c2698qf.getClass();
                    java.util.HashMap hashMap = new java.util.HashMap(zf.c);
                    hashMap.put(com.google.common.net.HttpHeaders.USER_AGENT, com.inmobi.media.Xi.c());
                    obj = c2698qf.f5410a.f4618a.a(new com.inmobi.media.Re(zf.f5085a, hashMap, null, null, null, zf.d, 28), g8);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zf = g8.f4721a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.inmobi.media.Ve ve = (com.inmobi.media.Ve) obj;
                return new com.inmobi.media.C2409fg(zf, ve.c(), ve.e());
            }
        }
        g8 = new com.inmobi.media.G8(this, continuationImpl);
        java.lang.Object obj2 = g8.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g8.d;
        if (i != 0) {
        }
        com.inmobi.media.Ve ve2 = (com.inmobi.media.Ve) obj2;
        return new com.inmobi.media.C2409fg(zf, ve2.c(), ve2.e());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|87|6|7|8|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x013f, code lost:
    
        if (r15.a(r0) != r1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0060, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0061, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
    
        r14.getMessage();
        r15 = (java.lang.ref.WeakReference) r13.b.get(r9.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0153, code lost:
    
        if (r15 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        r12 = (com.inmobi.media.InterfaceC2620ng) r15.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
    
        com.inmobi.media.AbstractC2699qg.a(0, r14.getMessage(), 2251, r9, java.lang.System.currentTimeMillis(), r12);
        r14 = r13.d;
        r0.f4741a = null;
        r0.b = null;
        r0.e = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017a, code lost:
    
        if (r14.a(r0) == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015d, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0064, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0065, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0180, code lost:
    
        r14.getMessage();
        r15 = (java.lang.ref.WeakReference) r13.b.get(r9.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018d, code lost:
    
        if (r15 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018f, code lost:
    
        r12 = (com.inmobi.media.InterfaceC2620ng) r15.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
    
        com.inmobi.media.AbstractC2699qg.a(0, r14.getMessage(), 2250, r9, java.lang.System.currentTimeMillis(), r12);
        r14 = r13.d;
        r0.f4741a = null;
        r0.b = null;
        r0.e = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        if (r14.a(r0) == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0197, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0143, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        r9 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017d, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017e, code lost:
    
        r9 = r14;
        r14 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7 A[Catch: Error -> 0x0060, Exception -> 0x0064, TryCatch #4 {Error -> 0x0060, Exception -> 0x0064, blocks: (B:23:0x0046, B:24:0x00df, B:26:0x00e7, B:29:0x010f, B:34:0x0116, B:35:0x010d, B:36:0x011c, B:40:0x004f, B:46:0x005a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c A[Catch: Error -> 0x0060, Exception -> 0x0064, TRY_LEAVE, TryCatch #4 {Error -> 0x0060, Exception -> 0x0064, blocks: (B:23:0x0046, B:24:0x00df, B:26:0x00e7, B:29:0x010f, B:34:0x0116, B:35:0x010d, B:36:0x011c, B:40:0x004f, B:46:0x005a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e A[Catch: Error -> 0x0143, Exception -> 0x017d, TryCatch #3 {Error -> 0x0143, Exception -> 0x017d, blocks: (B:16:0x0036, B:17:0x0134, B:21:0x003d, B:42:0x00ce, B:48:0x0096, B:50:0x009e, B:52:0x00ae, B:57:0x00c8, B:59:0x006b, B:61:0x007b, B:62:0x0083), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[Catch: Error -> 0x0143, Exception -> 0x017d, TryCatch #3 {Error -> 0x0143, Exception -> 0x017d, blocks: (B:16:0x0036, B:17:0x0134, B:21:0x003d, B:42:0x00ce, B:48:0x0096, B:50:0x009e, B:52:0x00ae, B:57:0x00c8, B:59:0x006b, B:61:0x007b, B:62:0x0083), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.inmobi.media.Zf zf, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.H8 h8;
        ?? r2;
        com.inmobi.media.InterfaceC2620ng interfaceC2620ng;
        com.inmobi.media.Zf zf2;
        com.inmobi.media.InterfaceC2620ng interfaceC2620ng2;
        com.inmobi.media.C2409fg c2409fg;
        com.inmobi.media.Zf zf3;
        if (continuationImpl instanceof com.inmobi.media.H8) {
            h8 = (com.inmobi.media.H8) continuationImpl;
            int i = h8.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8.e = i - Integer.MIN_VALUE;
                java.lang.Object obj = h8.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = h8.e;
                switch (r2) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str = zf.b;
                        java.lang.String str2 = zf.h;
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.b.get(zf.h);
                        com.inmobi.media.InterfaceC2620ng interfaceC2620ng3 = weakReference != null ? (com.inmobi.media.InterfaceC2620ng) weakReference.get() : null;
                        java.lang.String str3 = zf.e;
                        h8.f4741a = zf;
                        h8.b = interfaceC2620ng3;
                        h8.e = 1;
                        java.lang.Object a2 = a(str3, h8);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC2620ng = interfaceC2620ng3;
                        obj = a2;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            com.inmobi.media.AbstractC2699qg.a(0, "Database capacity exceeded for pings", (short) 2248, zf, java.lang.System.currentTimeMillis(), interfaceC2620ng);
                            return kotlin.Unit.INSTANCE;
                        }
                        com.inmobi.media.C2884xg c2884xg = this.f5411a;
                        h8.f4741a = zf;
                        h8.b = interfaceC2620ng;
                        h8.e = 2;
                        java.lang.Object a3 = c2884xg.f5552a.a("pings", com.inmobi.media.AbstractC2909yg.a(zf), 4, h8);
                        if (a3 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a3 = kotlin.Unit.INSTANCE;
                        }
                        if (a3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        h8.f4741a = zf;
                        h8.b = interfaceC2620ng;
                        h8.e = 3;
                        obj = a(zf, h8);
                        if (obj != coroutine_suspended) {
                            zf2 = zf;
                            interfaceC2620ng2 = interfaceC2620ng;
                            c2409fg = (com.inmobi.media.C2409fg) obj;
                            if (!com.inmobi.media.AbstractC2487ig.a(c2409fg)) {
                                java.lang.String str4 = c2409fg.f5201a.b;
                                h8.f4741a = zf2;
                                h8.b = null;
                                h8.e = 4;
                                com.inmobi.media.AbstractC2699qg.a(c2409fg, interfaceC2620ng2);
                                java.lang.Object a4 = this.f5411a.f5552a.a("pings", "id=?", new java.lang.String[]{c2409fg.f5201a.b}, h8);
                                if (a4 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    a4 = kotlin.Unit.INSTANCE;
                                }
                                if (a4 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    a4 = kotlin.Unit.INSTANCE;
                                }
                                if (a4 == coroutine_suspended) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            java.lang.String str5 = c2409fg.f5201a.b;
                            int i2 = c2409fg.b;
                            java.lang.String str6 = c2409fg.c;
                            h8.f4741a = zf2;
                            h8.b = null;
                            h8.e = 5;
                            if (a(c2409fg, interfaceC2620ng2, h8) != coroutine_suspended) {
                                zf3 = zf2;
                                com.inmobi.media.C2690q7 c2690q7 = this.d;
                                h8.f4741a = zf3;
                                h8.e = 6;
                                break;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        com.inmobi.media.InterfaceC2620ng interfaceC2620ng4 = h8.b;
                        com.inmobi.media.Zf zf4 = h8.f4741a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        interfaceC2620ng = interfaceC2620ng4;
                        zf = zf4;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        com.inmobi.media.InterfaceC2620ng interfaceC2620ng5 = h8.b;
                        com.inmobi.media.Zf zf5 = h8.f4741a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        interfaceC2620ng = interfaceC2620ng5;
                        zf = zf5;
                        h8.f4741a = zf;
                        h8.b = interfaceC2620ng;
                        h8.e = 3;
                        obj = a(zf, h8);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        interfaceC2620ng2 = h8.b;
                        zf2 = h8.f4741a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        c2409fg = (com.inmobi.media.C2409fg) obj;
                        if (!com.inmobi.media.AbstractC2487ig.a(c2409fg)) {
                        }
                        return coroutine_suspended;
                    case 4:
                    case 6:
                        com.inmobi.media.Zf zf6 = h8.f4741a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 5:
                        zf3 = h8.f4741a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.C2690q7 c2690q72 = this.d;
                        h8.f4741a = zf3;
                        h8.e = 6;
                        break;
                    case 7:
                    case 8:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        h8 = new com.inmobi.media.H8(this, continuationImpl);
        java.lang.Object obj2 = h8.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = h8.e;
        switch (r2) {
        }
    }
}
