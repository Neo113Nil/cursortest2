package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Zm {
    public static final Mutex c = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final Of f6997a;
    public final LinkedHashSet b;

    public Zm(Of networkResponse, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.f6997a = networkResponse;
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
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        Ym ym;
        Object coroutine_suspended;
        int i;
        JSONObject jSONObject2;
        Mutex mutex;
        int c2;
        Object a2;
        JSONObject jSONObject3;
        try {
            if (continuationImpl instanceof Ym) {
                ym = (Ym) continuationImpl;
                int i2 = ym.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ym.e = i2 - Integer.MIN_VALUE;
                    Object obj = ym.c;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = ym.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = c;
                        ym.f6979a = jSONObject;
                        ym.b = mutex2;
                        ym.e = 1;
                        if (mutex2.lock(null, ym) != coroutine_suspended) {
                            jSONObject2 = jSONObject;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = ym.b;
                        jSONObject3 = ym.f6979a;
                        ResultKt.throwOnFailure(obj);
                        AbstractC4045ra.b(AbstractC3606bn.a(jSONObject3, AbstractC4045ra.b()));
                        JSONObject a3 = AbstractC3606bn.a(AbstractC4045ra.b());
                        for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.b) {
                            if (a3 == null) {
                                AbstractC3606bn.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                            } else {
                                AbstractC3606bn.a(inMobiUnifiedIdInterface, a3, null);
                            }
                        }
                        this.b.clear();
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit;
                    }
                    mutex = ym.b;
                    jSONObject2 = ym.f6979a;
                    ResultKt.throwOnFailure(obj);
                    c2 = this.f6997a.c();
                    C4262z6 c4262z6 = B6.b;
                    if (c2 != 192 && c2 != 0) {
                        Wm wm = Wm.f6937a;
                        ym.f6979a = jSONObject2;
                        ym.b = mutex;
                        ym.e = 2;
                        a2 = AbstractC3727g4.a(Wm.b, new Rm(null), ym);
                        if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = Unit.INSTANCE;
                        }
                        if (a2 != coroutine_suspended) {
                            jSONObject3 = jSONObject2;
                            AbstractC4045ra.b(AbstractC3606bn.a(jSONObject3, AbstractC4045ra.b()));
                            JSONObject a32 = AbstractC3606bn.a(AbstractC4045ra.b());
                            while (r0.hasNext()) {
                            }
                            this.b.clear();
                            Unit unit2 = Unit.INSTANCE;
                            mutex.unlock(null);
                            return unit2;
                        }
                        return coroutine_suspended;
                    }
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            if (i != 0) {
            }
            c2 = this.f6997a.c();
            C4262z6 c4262z62 = B6.b;
            if (c2 != 192) {
                Wm wm2 = Wm.f6937a;
                ym.f6979a = jSONObject2;
                ym.b = mutex;
                ym.e = 2;
                a2 = AbstractC3727g4.a(Wm.b, new Rm(null), ym);
                if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (a2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Unit unit32 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit32;
        } catch (Throwable th) {
            jSONObject.unlock(null);
            throw th;
        }
        ym = new Ym(this, continuationImpl);
        Object obj2 = ym.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ym.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005e, code lost:
    
        if (r11.lock(null, r2) == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:26:0x0061, B:30:0x009f, B:36:0x00b9, B:37:0x00ca), top: B:25:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) {
        Xm xm;
        Object coroutine_suspended;
        int i2;
        Mutex mutex;
        Throwable th;
        int c2;
        Object a2;
        Mutex mutex2;
        try {
            if (continuationImpl instanceof Xm) {
                xm = (Xm) continuationImpl;
                int i3 = xm.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    xm.f = i3 - Integer.MIN_VALUE;
                    Object obj = xm.d;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = xm.f;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = c;
                        xm.b = str;
                        xm.c = mutex;
                        xm.f6956a = i;
                        xm.f = 1;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = xm.c;
                            str = xm.b;
                            try {
                                ResultKt.throwOnFailure(obj);
                                a(str);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex = mutex2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i = xm.f6956a;
                        Mutex mutex3 = xm.c;
                        String str2 = xm.b;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    String str3 = "ErrorCode = " + i;
                    String str4 = "ErrorMessage = " + str;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
                    C3829jm c3829jm = C3829jm.f7187a;
                    C3829jm.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC3944nm.f7271a);
                    c2 = this.f6997a.c();
                    C4262z6 c4262z6 = B6.b;
                    if (c2 != 192 && c2 != 0) {
                        Wm wm = Wm.f6937a;
                        xm.b = str;
                        xm.c = mutex;
                        xm.f = 2;
                        a2 = AbstractC3727g4.a(Wm.b, new Rm(null), xm);
                        if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = Unit.INSTANCE;
                        }
                        if (a2 != coroutine_suspended) {
                            mutex2 = mutex;
                            a(str);
                            Unit unit2 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit2;
                        }
                        return coroutine_suspended;
                    }
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            String str32 = "ErrorCode = " + i;
            String str42 = "ErrorMessage = " + str;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
            C3829jm c3829jm2 = C3829jm.f7187a;
            C3829jm.b("UnifiedIdNetworkResponseFailure", linkedHashMap2, EnumC3944nm.f7271a);
            c2 = this.f6997a.c();
            C4262z6 c4262z62 = B6.b;
            if (c2 != 192) {
                Wm wm2 = Wm.f6937a;
                xm.b = str;
                xm.c = mutex;
                xm.f = 2;
                a2 = AbstractC3727g4.a(Wm.b, new Rm(null), xm);
                if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (a2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Unit unit32 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit32;
        } catch (Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
        xm = new Xm(this, continuationImpl);
        Object obj2 = xm.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = xm.f;
        if (i2 != 0) {
        }
    }

    public final void a(String str) {
        JSONObject a2 = AbstractC3606bn.a(AbstractC4045ra.b());
        try {
            if (a2 != null) {
                if (a2.has("ufids") && a2.getJSONArray("ufids").length() > 0) {
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        AbstractC3606bn.a((InMobiUnifiedIdInterface) it.next(), a2, null);
                    }
                    String str2 = "Ad fetch failed: " + str;
                }
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                AbstractC3606bn.a((InMobiUnifiedIdInterface) it2.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
            }
            String str22 = "Ad fetch failed: " + str;
        } catch (JSONException e) {
            e.printStackTrace();
        } finally {
            this.b.clear();
        }
    }
}
