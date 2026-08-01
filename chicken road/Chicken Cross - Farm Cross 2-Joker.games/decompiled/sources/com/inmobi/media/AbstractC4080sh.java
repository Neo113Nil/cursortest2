package com.inmobi.media;

import com.adjust.sdk.Constants;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4080sh {

    /* renamed from: a, reason: collision with root package name */
    public final Gh f7376a;
    public final ConcurrentHashMap b;
    public final C3852kg c;

    public AbstractC4080sh(Gh dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.f7376a = dao;
        this.b = new ConcurrentHashMap();
        this.c = new C3852kg(a());
    }

    public static void a(Vg vg, short s) {
        Ij ij = vg.k;
        if (ij != null) {
            new Oj(ij).a(vg.g, vg.e, s);
            return;
        }
        C3827jk c3827jk = AbstractC4108th.f7396a;
        AbstractC4108th.a("PingFailed", MapsKt.mutableMapOf(TuplesKt.to("trigger", vg.e + "_" + vg.g), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))));
    }

    public static void b(C3628ch c3628ch, InterfaceC3968oh interfaceC3968oh) {
        Intrinsics.checkNotNullExpressionValue(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "getSimpleName(...)");
        String str = "Ping resolved successfully: " + c3628ch.f7049a.f6913a + ", Status Code: " + c3628ch.b + ", Timestamp: " + c3628ch.d + ", Listener: " + interfaceC3968oh;
        if (interfaceC3968oh == null) {
            a(c3628ch.f7049a);
        } else {
            ((C3939nh) interfaceC3968oh).a(c3628ch.f7049a, c3628ch.b, c3628ch.d);
        }
    }

    public static void a(Vg vg) {
        Ij ij = vg.k;
        if (ij != null) {
            new Oj(ij).a(vg.g, System.currentTimeMillis() - vg.i, vg.e);
            return;
        }
        C3827jk c3827jk = AbstractC4108th.f7396a;
        AbstractC4108th.a("PingSuccess", MapsKt.mutableMapOf(TuplesKt.to("trigger", vg.e + "_" + vg.g), TuplesKt.to("retryCount", Integer.valueOf(vg.g))));
    }

    public static AdConfig.PingsV2Config a() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Vg vg, ContinuationImpl continuationImpl) {
        C4052rh c4052rh;
        int i;
        AbstractC3565ab abstractC3565ab;
        if (continuationImpl instanceof C4052rh) {
            c4052rh = (C4052rh) continuationImpl;
            int i2 = c4052rh.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4052rh.c = i2 - Integer.MIN_VALUE;
                Object obj = c4052rh.f7354a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4052rh.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Gh gh = this.f7376a;
                    int maxEntries = a().getMaxEntries();
                    c4052rh.c = 1;
                    obj = gh.b(vg, maxEntries, c4052rh);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                abstractC3565ab = (AbstractC3565ab) obj;
                if (!(abstractC3565ab instanceof Xa)) {
                    return EnumC3996ph.f7306a;
                }
                if (abstractC3565ab instanceof Ya) {
                    Ya ya = (Ya) abstractC3565ab;
                    a(ya.b, (short) (Intrinsics.areEqual(ya.f6969a.e, Constants.HIGH) ? 2259 : 2260));
                    return EnumC3996ph.f7306a;
                }
                if (abstractC3565ab instanceof Wa) {
                    a(((Wa) abstractC3565ab).f6929a, (short) 2371);
                    return EnumC3996ph.c;
                }
                if (abstractC3565ab instanceof Za) {
                    C3827jk c3827jk = AbstractC4108th.f7396a;
                    AbstractC4108th.a("PingDBMaxLimitReached", new LinkedHashMap());
                    return EnumC3996ph.b;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        c4052rh = new C4052rh(this, continuationImpl);
        Object obj2 = c4052rh.f7354a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4052rh.c;
        if (i != 0) {
        }
        abstractC3565ab = (AbstractC3565ab) obj2;
        if (!(abstractC3565ab instanceof Xa)) {
        }
    }

    public static void a(int i, String str, short s, Vg ping, long j, InterfaceC3968oh interfaceC3968oh) {
        Intrinsics.checkNotNullParameter(ping, "ping");
        Intrinsics.checkNotNullExpressionValue(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "getSimpleName(...)");
        String str2 = "Ping resolution failed: " + ping.f6913a + ", Status Code: " + i + ", Error: " + str;
        Intrinsics.checkNotNullExpressionValue(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "getSimpleName(...)");
        String str3 = "Listener: " + interfaceC3968oh + ", Retry Count: " + ping.g + ", Timestamp: " + j;
        if (interfaceC3968oh != null) {
            ((C3939nh) interfaceC3968oh).a(ping, i, str, ping.g, j, s);
        } else {
            a(ping, s);
        }
    }

    public static void a(C3628ch pingResult, InterfaceC3968oh interfaceC3968oh) {
        String str;
        Intrinsics.checkNotNullParameter(pingResult, "pingResult");
        if (AbstractC3824jh.a(pingResult)) {
            b(pingResult, interfaceC3968oh);
            return;
        }
        String str2 = "Ping failed without persistence: " + pingResult.f7049a.f6913a + ", Status Code: " + pingResult.b + ", Error: " + pingResult.c;
        int i = pingResult.b;
        C4262z6 c4262z6 = B6.b;
        if (i == 178) {
            str = "Redirect URL is malformed";
        } else {
            str = pingResult.c;
        }
        a(i, str, i == 178 ? (short) 2258 : (short) i, pingResult.f7049a, pingResult.d, interfaceC3968oh);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3628ch c3628ch, InterfaceC3968oh interfaceC3968oh, ContinuationImpl continuationImpl) {
        C4024qh c4024qh;
        int i;
        int maxRetries;
        Pair pair;
        InterfaceC3968oh interfaceC3968oh2;
        Vg vg;
        InterfaceC3968oh interfaceC3968oh3;
        Vg vg2;
        InterfaceC3968oh interfaceC3968oh4;
        C3628ch c3628ch2 = c3628ch;
        if (continuationImpl instanceof C4024qh) {
            c4024qh = (C4024qh) continuationImpl;
            int i2 = c4024qh.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4024qh.f = i2 - Integer.MIN_VALUE;
                C4024qh c4024qh2 = c4024qh;
                Object obj = c4024qh2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4024qh2.f;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC3968oh interfaceC3968oh5 = c4024qh2.b;
                        C3628ch c3628ch3 = c4024qh2.f7329a;
                        ResultKt.throwOnFailure(obj);
                        interfaceC3968oh4 = interfaceC3968oh5;
                        c3628ch2 = c3628ch3;
                        a(c3628ch2.b, "Redirect URL is malformed", (short) 2258, c3628ch2.f7049a, c3628ch2.d, interfaceC3968oh4);
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        Vg vg3 = c4024qh2.c;
                        InterfaceC3968oh interfaceC3968oh6 = c4024qh2.b;
                        C3628ch c3628ch4 = c4024qh2.f7329a;
                        ResultKt.throwOnFailure(obj);
                        vg2 = vg3;
                        interfaceC3968oh3 = interfaceC3968oh6;
                        c3628ch2 = c3628ch4;
                        int i3 = c3628ch2.b;
                        a(i3, c3628ch2.c, (short) i3, vg2, c3628ch2.d, interfaceC3968oh3);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Vg vg4 = c4024qh2.c;
                    InterfaceC3968oh interfaceC3968oh7 = c4024qh2.b;
                    C3628ch c3628ch5 = c4024qh2.f7329a;
                    ResultKt.throwOnFailure(obj);
                    vg = vg4;
                    interfaceC3968oh2 = interfaceC3968oh7;
                    c3628ch2 = c3628ch5;
                    int i4 = c3628ch2.b;
                    a(i4, c3628ch2.c, (short) i4, vg, c3628ch2.d, interfaceC3968oh2);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                String str = "Ping failed: " + c3628ch2.f7049a.f6913a + ", Status Code: " + c3628ch2.b + ", Error: " + c3628ch2.c;
                int i5 = c3628ch2.b;
                C4262z6 c4262z6 = B6.b;
                if (i5 == 178) {
                    String str2 = "Removing ping due to malformed redirect: " + c3628ch2.f7049a.f6913a;
                    Gh gh = this.f7376a;
                    Vg vg5 = c3628ch2.f7049a;
                    c4024qh2.f7329a = c3628ch2;
                    c4024qh2.b = interfaceC3968oh;
                    c4024qh2.f = 1;
                    Object a2 = gh.f6585a.a("pings", "id=?", new String[]{vg5.b}, c4024qh2);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                    if (a2 != coroutine_suspended) {
                        interfaceC3968oh4 = interfaceC3968oh;
                        a(c3628ch2.b, "Redirect URL is malformed", (short) 2258, c3628ch2.f7049a, c3628ch2.d, interfaceC3968oh4);
                        return Unit.INSTANCE;
                    }
                } else {
                    Vg vg6 = c3628ch2.f7049a;
                    int i6 = vg6.g + 1;
                    if (Intrinsics.areEqual(vg6.e, Constants.HIGH)) {
                        maxRetries = a().getRetryConfig().getHigh().getMaxRetries();
                    } else {
                        maxRetries = a().getRetryConfig().getNormal().getMaxRetries();
                    }
                    if (i6 > maxRetries) {
                        Gh gh2 = this.f7376a;
                        c4024qh2.f7329a = c3628ch2;
                        c4024qh2.b = interfaceC3968oh;
                        c4024qh2.c = vg6;
                        c4024qh2.f = 2;
                        Object a3 = gh2.f6585a.a("pings", "id=?", new String[]{vg6.b}, c4024qh2);
                        if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a3 = Unit.INSTANCE;
                        }
                        if (a3 != coroutine_suspended) {
                            interfaceC3968oh3 = interfaceC3968oh;
                            vg2 = vg6;
                            int i32 = c3628ch2.b;
                            a(i32, c3628ch2.c, (short) i32, vg2, c3628ch2.d, interfaceC3968oh3);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (Intrinsics.areEqual(vg6.e, Constants.HIGH)) {
                            pair = new Pair(Boxing.boxLong(a().getRetryConfig().getHigh().getRetryInterval()), Boxing.boxDouble(a().getRetryConfig().getHigh().getFactor()));
                        } else {
                            pair = new Pair(Boxing.boxLong(a().getRetryConfig().getNormal().getRetryInterval()), Boxing.boxDouble(a().getRetryConfig().getNormal().getFactor()));
                        }
                        Long boxLong = Boxing.boxLong(System.currentTimeMillis() + ((long) (Math.pow(((Number) pair.component2()).doubleValue(), i6) * ((Number) pair.component1()).longValue() * 1000)));
                        String url = vg6.f6913a;
                        String id = vg6.b;
                        Map headers = vg6.c;
                        boolean z = vg6.d;
                        String priority = vg6.e;
                        boolean z2 = vg6.f;
                        String ownerId = vg6.h;
                        long j = vg6.i;
                        Ij ij = vg6.k;
                        String status = vg6.l;
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(id, "id");
                        Intrinsics.checkNotNullParameter(headers, "headers");
                        Intrinsics.checkNotNullParameter(priority, "priority");
                        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        Vg vg7 = new Vg(url, id, headers, z, priority, z2, i6, ownerId, j, boxLong, ij, status);
                        Intrinsics.checkNotNullParameter(U3.i.t, "<set-?>");
                        vg7.l = U3.i.t;
                        Gh gh3 = this.f7376a;
                        c4024qh2.f7329a = c3628ch2;
                        c4024qh2.b = interfaceC3968oh;
                        c4024qh2.c = vg6;
                        c4024qh2.f = 3;
                        Object a4 = S9.a(gh3.f6585a, "pings", Hh.a(vg7), "id=?", new String[]{id}, c4024qh2, 16);
                        if (a4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a4 = Unit.INSTANCE;
                        }
                        if (a4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC3968oh2 = interfaceC3968oh;
                        vg = vg6;
                        int i42 = c3628ch2.b;
                        a(i42, c3628ch2.c, (short) i42, vg, c3628ch2.d, interfaceC3968oh2);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
        }
        c4024qh = new C4024qh(this, continuationImpl);
        C4024qh c4024qh22 = c4024qh;
        Object obj2 = c4024qh22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4024qh22.f;
        if (i == 0) {
        }
    }
}
