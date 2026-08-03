package com.inmobi.media;

/* renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2462hg {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2884xg f5242a;
    public final com.inmobi.media.InterfaceC2357dg b;
    public final com.inmobi.media.C2698qf c;
    public volatile com.inmobi.media.EnumC2382eg d;
    public final java.util.concurrent.ConcurrentHashMap e;

    public AbstractC2462hg(com.inmobi.media.C2884xg dao, com.inmobi.media.InterfaceC2357dg interfaceC2357dg, com.inmobi.media.C2698qf networkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dao, "dao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f5242a = dao;
        this.b = interfaceC2357dg;
        this.c = networkHandler;
        this.d = com.inmobi.media.EnumC2382eg.f5180a;
        this.e = new java.util.concurrent.ConcurrentHashMap();
    }

    public static com.inmobi.media.C2409fg a(com.inmobi.media.Zf zf, com.inmobi.media.Ve ve) {
        java.lang.String str = zf.f5085a;
        ve.c();
        ve.e();
        int i = zf.g;
        return new com.inmobi.media.C2409fg(zf, ve.c(), ve.e());
    }

    public abstract kotlin.Unit b();

    public static com.inmobi.media.core.config.models.AdConfig.PingsV2Config a() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        return ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (r5.invoke(r2, r3) != r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.Zf zf, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2436gg c2436gg;
        int i;
        kotlin.jvm.functions.Function2 function22;
        com.inmobi.media.Zf zf2 = zf;
        if (continuationImpl instanceof com.inmobi.media.C2436gg) {
            c2436gg = (com.inmobi.media.C2436gg) continuationImpl;
            int i2 = c2436gg.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2436gg.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2436gg.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2436gg.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.d == com.inmobi.media.EnumC2382eg.b) {
                        if (this.e.containsKey(zf2.b)) {
                            java.lang.String str = zf2.b;
                            return kotlin.Unit.INSTANCE;
                        }
                        this.e.put(zf2.b, zf2.f5085a);
                        com.inmobi.media.C2698qf c2698qf = this.c;
                        c2436gg.f5220a = zf2;
                        function22 = function2;
                        c2436gg.b = function22;
                        c2436gg.e = 1;
                        c2698qf.getClass();
                        java.util.HashMap hashMap = new java.util.HashMap(zf2.c);
                        hashMap.put(com.google.common.net.HttpHeaders.USER_AGENT, com.inmobi.media.Xi.c());
                        obj = c2698qf.f5410a.f4618a.a(new com.inmobi.media.Re(zf2.f5085a, hashMap, null, null, null, zf2.d, 28), c2436gg);
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zf2 = c2436gg.f5220a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.e.remove(zf2.b);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.functions.Function2 function23 = c2436gg.b;
                    com.inmobi.media.Zf zf3 = c2436gg.f5220a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function22 = function23;
                    zf2 = zf3;
                }
                com.inmobi.media.C2409fg a2 = a(zf2, (com.inmobi.media.Ve) obj);
                c2436gg.f5220a = zf2;
                c2436gg.b = null;
                c2436gg.e = 2;
            }
        }
        c2436gg = new com.inmobi.media.C2436gg(this, continuationImpl);
        java.lang.Object obj2 = c2436gg.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2436gg.e;
        if (i != 0) {
        }
        com.inmobi.media.C2409fg a22 = a(zf2, (com.inmobi.media.Ve) obj2);
        c2436gg.f5220a = zf2;
        c2436gg.b = null;
        c2436gg.e = 2;
    }

    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.EnumC2382eg enumC2382eg = this.d;
        com.inmobi.media.EnumC2382eg enumC2382eg2 = com.inmobi.media.EnumC2382eg.b;
        com.inmobi.media.EnumC2382eg enumC2382eg3 = com.inmobi.media.EnumC2382eg.f5180a;
        java.util.Objects.toString(enumC2382eg);
        if (this.d == enumC2382eg3) {
            this.d = enumC2382eg2;
            kotlin.Unit b = b();
            return b == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }
}
