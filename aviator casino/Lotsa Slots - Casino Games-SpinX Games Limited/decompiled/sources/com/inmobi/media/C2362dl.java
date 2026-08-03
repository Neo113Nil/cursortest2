package com.inmobi.media;

/* renamed from: com.inmobi.media.dl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2362dl {
    public static final kotlinx.coroutines.sync.Mutex c = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Ve f5164a;
    public final java.util.LinkedHashSet b;

    public C2362dl(com.inmobi.media.Ve networkResponse, java.util.LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.f5164a = networkResponse;
        this.b = inMobiUnifiedIdInterfaceSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:12:0x002d, B:13:0x0084, B:14:0x009d, B:16:0x00a3, B:23:0x00ab, B:19:0x00b6, B:26:0x00ba, B:33:0x0055, B:37:0x0064, B:43:0x007e, B:44:0x00c5), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:12:0x002d, B:13:0x0084, B:14:0x009d, B:16:0x00a3, B:23:0x00ab, B:19:0x00b6, B:26:0x00ba, B:33:0x0055, B:37:0x0064, B:43:0x007e, B:44:0x00c5), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(org.json.JSONObject jSONObject, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2336cl c2336cl;
        java.lang.Object coroutine_suspended;
        int i;
        org.json.JSONObject jSONObject2;
        kotlinx.coroutines.sync.Mutex mutex;
        int c2;
        java.lang.Object a2;
        org.json.JSONObject jSONObject3;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2336cl) {
                c2336cl = (com.inmobi.media.C2336cl) continuationImpl;
                int i2 = c2336cl.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2336cl.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2336cl.c;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2336cl.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = c;
                        c2336cl.f5146a = jSONObject;
                        c2336cl.b = mutex2;
                        c2336cl.e = 1;
                        if (mutex2.lock(null, c2336cl) != coroutine_suspended) {
                            jSONObject2 = jSONObject;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2336cl.b;
                        jSONObject3 = c2336cl.f5146a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.M9.b(com.inmobi.media.AbstractC2415fl.a(jSONObject3, com.inmobi.media.M9.b()));
                        org.json.JSONObject a3 = com.inmobi.media.AbstractC2415fl.a(com.inmobi.media.M9.b());
                        for (com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.b) {
                            if (a3 == null) {
                                com.inmobi.media.AbstractC2415fl.a(inMobiUnifiedIdInterface, null, new java.lang.Error(com.inmobi.unifiedId.InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                            } else {
                                com.inmobi.media.AbstractC2415fl.a(inMobiUnifiedIdInterface, a3, null);
                            }
                        }
                        this.b.clear();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit;
                    }
                    mutex = c2336cl.b;
                    jSONObject2 = c2336cl.f5146a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    c2 = this.f5164a.c();
                    com.inmobi.media.C2320c6 c2320c6 = com.inmobi.media.EnumC2372e6.b;
                    if (c2 != 192 && c2 != 0) {
                        com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
                        c2336cl.f5146a = jSONObject2;
                        c2336cl.b = mutex;
                        c2336cl.e = 2;
                        a2 = com.inmobi.media.J3.a(com.inmobi.media.C2282al.b, new com.inmobi.media.Vk(null), c2336cl);
                        if (a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = kotlin.Unit.INSTANCE;
                        }
                        if (a2 != coroutine_suspended) {
                            jSONObject3 = jSONObject2;
                            com.inmobi.media.M9.b(com.inmobi.media.AbstractC2415fl.a(jSONObject3, com.inmobi.media.M9.b()));
                            org.json.JSONObject a32 = com.inmobi.media.AbstractC2415fl.a(com.inmobi.media.M9.b());
                            while (r0.hasNext()) {
                            }
                            this.b.clear();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            mutex.unlock(null);
                            return unit2;
                        }
                        return coroutine_suspended;
                    }
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            if (i != 0) {
            }
            c2 = this.f5164a.c();
            com.inmobi.media.C2320c6 c2320c62 = com.inmobi.media.EnumC2372e6.b;
            if (c2 != 192) {
                com.inmobi.media.C2282al c2282al2 = com.inmobi.media.C2282al.f5108a;
                c2336cl.f5146a = jSONObject2;
                c2336cl.b = mutex;
                c2336cl.e = 2;
                a2 = com.inmobi.media.J3.a(com.inmobi.media.C2282al.b, new com.inmobi.media.Vk(null), c2336cl);
                if (a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (a2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return unit32;
        } catch (java.lang.Throwable th) {
            jSONObject.unlock(null);
            throw th;
        }
        c2336cl = new com.inmobi.media.C2336cl(this, continuationImpl);
        java.lang.Object obj2 = c2336cl.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2336cl.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005a, code lost:
    
        if (r9.lock(null, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #1 {all -> 0x00b4, blocks: (B:26:0x005d, B:30:0x0083, B:36:0x009d, B:37:0x00ae), top: B:25:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(int i, java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2308bl c2308bl;
        java.lang.Object coroutine_suspended;
        int i2;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        int c2;
        java.lang.Object a2;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2308bl) {
                c2308bl = (com.inmobi.media.C2308bl) continuationImpl;
                int i3 = c2308bl.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c2308bl.f = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2308bl.d;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = c2308bl.f;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = c;
                        c2308bl.b = str;
                        c2308bl.c = mutex;
                        c2308bl.f5128a = i;
                        c2308bl.f = 1;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = c2308bl.c;
                            str = c2308bl.b;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                a(str);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                mutex2.unlock(null);
                                return unit;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex = mutex2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i = c2308bl.f5128a;
                        kotlinx.coroutines.sync.Mutex mutex3 = c2308bl.c;
                        java.lang.String str2 = c2308bl.b;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap.put("errorCode", java.lang.Integer.valueOf(i));
                    com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                    com.inmobi.media.C2624nk.b("UnifiedIdNetworkResponseFailure", linkedHashMap, com.inmobi.media.EnumC2728rk.f5431a);
                    c2 = this.f5164a.c();
                    com.inmobi.media.C2320c6 c2320c6 = com.inmobi.media.EnumC2372e6.b;
                    if (c2 != 192 && c2 != 0) {
                        com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
                        c2308bl.b = str;
                        c2308bl.c = mutex;
                        c2308bl.f = 2;
                        a2 = com.inmobi.media.J3.a(com.inmobi.media.C2282al.b, new com.inmobi.media.Vk(null), c2308bl);
                        if (a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = kotlin.Unit.INSTANCE;
                        }
                        if (a2 != coroutine_suspended) {
                            mutex2 = mutex;
                            a(str);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit2;
                        }
                        return coroutine_suspended;
                    }
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("errorCode", java.lang.Integer.valueOf(i));
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("UnifiedIdNetworkResponseFailure", linkedHashMap2, com.inmobi.media.EnumC2728rk.f5431a);
            c2 = this.f5164a.c();
            com.inmobi.media.C2320c6 c2320c62 = com.inmobi.media.EnumC2372e6.b;
            if (c2 != 192) {
                com.inmobi.media.C2282al c2282al2 = com.inmobi.media.C2282al.f5108a;
                c2308bl.b = str;
                c2308bl.c = mutex;
                c2308bl.f = 2;
                a2 = com.inmobi.media.J3.a(com.inmobi.media.C2282al.b, new com.inmobi.media.Vk(null), c2308bl);
                if (a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (a2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return unit32;
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
        c2308bl = new com.inmobi.media.C2308bl(this, continuationImpl);
        java.lang.Object obj2 = c2308bl.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2308bl.f;
        if (i2 != 0) {
        }
    }

    public final void a(java.lang.String str) {
        org.json.JSONObject a2 = com.inmobi.media.AbstractC2415fl.a(com.inmobi.media.M9.b());
        try {
            if (a2 != null) {
                if (a2.has("ufids") && a2.getJSONArray("ufids").length() > 0) {
                    java.util.Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        com.inmobi.media.AbstractC2415fl.a((com.inmobi.unifiedId.InMobiUnifiedIdInterface) it.next(), a2, null);
                    }
                }
            }
            java.util.Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                com.inmobi.media.AbstractC2415fl.a((com.inmobi.unifiedId.InMobiUnifiedIdInterface) it2.next(), null, new java.lang.Error(com.inmobi.unifiedId.InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        } finally {
            this.b.clear();
        }
    }
}
