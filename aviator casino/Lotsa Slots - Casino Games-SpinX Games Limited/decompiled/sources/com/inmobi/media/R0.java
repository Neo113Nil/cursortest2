package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class R0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2799u9 f4927a;

    public R0(com.inmobi.media.C2799u9 c2799u9) {
        this.f4927a = c2799u9;
    }

    public abstract java.lang.Object a(kotlin.coroutines.Continuation continuation);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 function1, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.P0 p0;
        int i;
        if (continuationImpl instanceof com.inmobi.media.P0) {
            p0 = (com.inmobi.media.P0) continuationImpl;
            int i2 = p0.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = p0.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = p0.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1.invoke(com.inmobi.media.C2641ob.f5372a);
                    p0.f4885a = function1;
                    p0.d = 1;
                    obj = a(p0);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    function1 = p0.f4885a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                p0.f4885a = null;
                p0.d = 2;
                java.lang.Object a2 = a((java.lang.String) obj, function1, p0);
                return a2 != coroutine_suspended ? coroutine_suspended : a2;
            }
        }
        p0 = new com.inmobi.media.P0(this, continuationImpl);
        java.lang.Object obj2 = p0.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = p0.d;
        if (i != 0) {
        }
        p0.f4885a = null;
        p0.d = 2;
        java.lang.Object a22 = a((java.lang.String) obj2, function1, p0);
        if (a22 != coroutine_suspended2) {
        }
    }

    public abstract kotlin.Unit a(com.inmobi.media.ads.network.common.model.AdResponse adResponse, kotlin.jvm.functions.Function1 function1);

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
    
        if (r0.a(r3) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
    
        if (a(r0, r14) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007b, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00c3 -> B:46:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00dd -> B:46:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00df -> B:46:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00c8 -> B:46:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x00ca -> B:46:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Q0 q0;
        int i;
        com.inmobi.media.ads.network.common.model.AdResponse adResponse;
        com.inmobi.media.ads.network.common.model.AdSet adSet;
        kotlin.jvm.functions.Function1 function12;
        com.inmobi.media.ads.network.common.model.AdResponse adResponse2;
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.AdResponse adResponse3;
        java.util.Iterator it;
        int i2;
        long j;
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        long j2;
        kotlin.jvm.functions.Function1 function13 = function1;
        if (continuationImpl instanceof com.inmobi.media.Q0) {
            q0 = (com.inmobi.media.Q0) continuationImpl;
            int i3 = q0.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q0.h = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = q0.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = q0.h;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    function13.invoke(com.inmobi.media.Qf.f4919a);
                    com.inmobi.media.U0 u0 = com.inmobi.media.U0.f4986a;
                    q0.f4906a = function13;
                    q0.h = 1;
                    obj = u0.a(str, q0);
                } else if (i == 1) {
                    function13 = (kotlin.jvm.functions.Function1) q0.f4906a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        adResponse2 = (com.inmobi.media.ads.network.common.model.AdResponse) q0.f4906a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.ads.network.common.model.AdSet adSet2 = (com.inmobi.media.ads.network.common.model.AdSet) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) adResponse2.getAdSets());
                        if (adSet2 != null) {
                            long expiry = adSet2.getExpiry();
                            java.lang.Long valueOf = java.lang.Long.valueOf(expiry);
                            if (expiry <= 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                j = valueOf.longValue();
                                if (adSet2 != null && (ads2 = adSet2.getAds()) != null) {
                                    for (com.inmobi.media.ads.network.common.model.Ad ad : ads2) {
                                        java.lang.Long expiry2 = ad.getExpiry();
                                        if (expiry2 != null) {
                                            if (expiry2.longValue() <= 0) {
                                                expiry2 = null;
                                            }
                                            if (expiry2 != null) {
                                                j2 = expiry2.longValue();
                                                ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : java.util.concurrent.TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
                                            }
                                        }
                                        j2 = j;
                                        ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : java.util.concurrent.TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
                                    }
                                }
                                return adResponse2;
                            }
                        }
                        j = -1;
                        if (adSet2 != null) {
                            while (r2.hasNext()) {
                            }
                        }
                        return adResponse2;
                    }
                    i2 = q0.e;
                    int i4 = q0.d;
                    it = q0.c;
                    adResponse3 = q0.b;
                    function12 = (kotlin.jvm.functions.Function1) q0.f4906a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.ClassCastException e) {
                        com.inmobi.media.C2799u9 c2799u9 = this.f4927a;
                        if (c2799u9 != null) {
                            c2799u9.a("AdResponseManager", "Error parsing pub content: " + i2, e);
                        }
                    } catch (java.lang.IllegalArgumentException e2) {
                        com.inmobi.media.C2799u9 c2799u92 = this.f4927a;
                        if (c2799u92 != null) {
                            c2799u92.a("AdResponseManager", "Error parsing pub content: " + i2, e2);
                        }
                    }
                    i2 = i4;
                    if (!it.hasNext()) {
                        java.lang.Object next = it.next();
                        i4 = i2 + 1;
                        if (i2 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        com.inmobi.media.Pg pubContent = ((com.inmobi.media.ads.network.common.model.Ad) next).getPubContent();
                        q0.f4906a = function12;
                        q0.b = adResponse3;
                        q0.c = it;
                        q0.d = i4;
                        q0.e = i2;
                        q0.h = 2;
                    } else {
                        adResponse2 = adResponse3;
                        q0.f4906a = adResponse2;
                        q0.b = null;
                        q0.c = null;
                        q0.h = 3;
                    }
                }
                adResponse = (com.inmobi.media.ads.network.common.model.AdResponse) obj;
                adSet = (com.inmobi.media.ads.network.common.model.AdSet) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) adResponse.getAdSets());
                if (adSet == null && (ads = adSet.getAds()) != null) {
                    function12 = function13;
                    adResponse3 = adResponse;
                    it = ads.iterator();
                    i2 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    function12 = function13;
                    adResponse2 = adResponse;
                    q0.f4906a = adResponse2;
                    q0.b = null;
                    q0.c = null;
                    q0.h = 3;
                }
            }
        }
        q0 = new com.inmobi.media.Q0(this, continuationImpl);
        java.lang.Object obj2 = q0.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = q0.h;
        if (i != 0) {
        }
        adResponse = (com.inmobi.media.ads.network.common.model.AdResponse) obj2;
        adSet = (com.inmobi.media.ads.network.common.model.AdSet) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) adResponse.getAdSets());
        if (adSet == null) {
        }
        function12 = function13;
        adResponse2 = adResponse;
        q0.f4906a = adResponse2;
        q0.b = null;
        q0.c = null;
        q0.h = 3;
    }
}
