package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    public final Z9 f6862a;

    public T0(Z9 z9) {
        this.f6862a = z9;
    }

    public abstract Object a(Continuation continuation);

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
    public final Object a(Function1 function1, ContinuationImpl continuationImpl) {
        R0 r0;
        int i;
        if (continuationImpl instanceof R0) {
            r0 = (R0) continuationImpl;
            int i2 = r0.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0.d = i2 - Integer.MIN_VALUE;
                Object obj = r0.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = r0.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    function1.invoke(C3735gc.f7120a);
                    r0.f6814a = function1;
                    r0.d = 1;
                    obj = a(r0);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    function1 = r0.f6814a;
                    ResultKt.throwOnFailure(obj);
                }
                r0.f6814a = null;
                r0.d = 2;
                Object a2 = a((String) obj, function1, r0);
                return a2 != coroutine_suspended ? coroutine_suspended : a2;
            }
        }
        r0 = new R0(this, continuationImpl);
        Object obj2 = r0.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0.d;
        if (i != 0) {
        }
        r0.f6814a = null;
        r0.d = 2;
        Object a22 = a((String) obj2, function1, r0);
        if (a22 != coroutine_suspended2) {
        }
    }

    public abstract Unit a(AdResponse adResponse, Function1 function1);

    /* JADX WARN: Code restructure failed: missing block: B:65:0x010e, code lost:
    
        if (a(r0, r14) == r5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00eb -> B:46:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00ed -> B:46:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x00d6 -> B:46:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00d8 -> B:46:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Function1 function1, ContinuationImpl continuationImpl) {
        S0 s0;
        int i;
        Function1 function12;
        AdResponse adResponse;
        AdSet adSet;
        Function1 function13;
        AdResponse adResponse2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        int i2;
        Iterator it;
        AdResponse adResponse3;
        int i3;
        Yh pubContent;
        long j;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        long j2;
        if (continuationImpl instanceof S0) {
            s0 = (S0) continuationImpl;
            int i4 = s0.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s0.h = i4 - Integer.MIN_VALUE;
                Object obj = s0.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s0.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = "parseAdResponseAndValidate: " + str;
                    function1.invoke(Mg.f6719a);
                    W0 w0 = W0.f6919a;
                    s0.f6838a = function1;
                    s0.h = 1;
                    obj = w0.a(str, s0);
                    if (obj != coroutine_suspended) {
                        function12 = function1;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        adResponse2 = (AdResponse) s0.f6838a;
                        ResultKt.throwOnFailure(obj);
                        AdSet adSet2 = (AdSet) CollectionsKt.firstOrNull((List) adResponse2.getAdSets());
                        if (adSet2 != null) {
                            long expiry = adSet2.getExpiry();
                            Long valueOf = Long.valueOf(expiry);
                            if (expiry <= 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                j = valueOf.longValue();
                                if (adSet2 != null && (ads2 = adSet2.getAds()) != null) {
                                    for (com.inmobi.media.ads.network.common.model.Ad ad : ads2) {
                                        Long expiry2 = ad.getExpiry();
                                        if (expiry2 != null) {
                                            if (expiry2.longValue() <= 0) {
                                                expiry2 = null;
                                            }
                                            if (expiry2 != null) {
                                                j2 = expiry2.longValue();
                                                ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
                                            }
                                        }
                                        j2 = j;
                                        ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
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
                    i3 = s0.e;
                    i2 = s0.d;
                    it = s0.c;
                    adResponse3 = s0.b;
                    function13 = (Function1) s0.f6838a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (ClassCastException e) {
                        Z9 z9 = this.f6862a;
                        if (z9 != null) {
                            z9.a("AdResponseManager", "Error parsing pub content: " + i3, e);
                        }
                    } catch (IllegalArgumentException e2) {
                        Z9 z92 = this.f6862a;
                        if (z92 != null) {
                            z92.a("AdResponseManager", "Error parsing pub content: " + i3, e2);
                        }
                    }
                    do {
                        i3 = i2;
                        if (!it.hasNext()) {
                            Object next = it.next();
                            i2 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            pubContent = ((com.inmobi.media.ads.network.common.model.Ad) next).getPubContent();
                            s0.f6838a = function13;
                            s0.b = adResponse3;
                            s0.c = it;
                            s0.d = i2;
                            s0.e = i3;
                            s0.h = 2;
                        } else {
                            adResponse2 = adResponse3;
                            s0.f6838a = adResponse2;
                            s0.b = null;
                            s0.c = null;
                            s0.h = 3;
                        }
                    } while (pubContent.a(s0) != coroutine_suspended);
                    return coroutine_suspended;
                }
                function12 = (Function1) s0.f6838a;
                ResultKt.throwOnFailure(obj);
                adResponse = (AdResponse) obj;
                adSet = (AdSet) CollectionsKt.firstOrNull((List) adResponse.getAdSets());
                if (adSet == null && (ads = adSet.getAds()) != null) {
                    i2 = 0;
                    function13 = function12;
                    it = ads.iterator();
                    adResponse3 = adResponse;
                    do {
                        i3 = i2;
                        if (!it.hasNext()) {
                        }
                    } while (pubContent.a(s0) != coroutine_suspended);
                    return coroutine_suspended;
                }
                function13 = function12;
                adResponse2 = adResponse;
                s0.f6838a = adResponse2;
                s0.b = null;
                s0.c = null;
                s0.h = 3;
            }
        }
        s0 = new S0(this, continuationImpl);
        Object obj2 = s0.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s0.h;
        if (i != 0) {
        }
        adResponse = (AdResponse) obj2;
        adSet = (AdSet) CollectionsKt.firstOrNull((List) adResponse.getAdSets());
        if (adSet == null) {
        }
        function13 = function12;
        adResponse2 = adResponse;
        s0.f6838a = adResponse2;
        s0.b = null;
        s0.c = null;
        s0.h = 3;
    }
}
