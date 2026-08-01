package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Zg {

    /* renamed from: a, reason: collision with root package name */
    public static final Zg f6993a = new Zg();
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Zg$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Zg.c();
        }
    });
    public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Zg$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Zg.b();
        }
    });
    public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Zg$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Zg.a();
        }
    });
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final AtomicBoolean f = new AtomicBoolean(true);

    public static final Q5 a() {
        return new Q5((Gh) b.getValue());
    }

    public static final C3931n9 b() {
        return new C3931n9((Gh) b.getValue());
    }

    public static final Gh c() {
        return new Gh(T9.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        if (r8 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        if (a(r2, r8, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Xg xg;
        int i;
        P7 p7;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof Xg) {
            xg = (Xg) continuationImpl;
            int i2 = xg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xg.c = i2 - Integer.MIN_VALUE;
                Object obj3 = xg.f6951a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = xg.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    J4 j4 = AbstractC4260z4.f7518a;
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    AdConfig.PingsV2Config pingV2 = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getPingV2();
                    if (!pingV2.getEnabled()) {
                        return Unit.INSTANCE;
                    }
                    if (!e.compareAndSet(false, true)) {
                        return Unit.INSTANCE;
                    }
                    Gh gh = (Gh) b.getValue();
                    xg.c = 1;
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj3);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj3);
                    Q5 q5 = (Q5) d.getValue();
                    xg.c = 3;
                    C3682eg c3682eg = q5.d;
                    c3682eg.getClass();
                    EnumC3599bh enumC3599bh = EnumC3599bh.b;
                    if (c3682eg.d == EnumC3599bh.f7030a) {
                        c3682eg.d = enumC3599bh;
                        obj2 = c3682eg.c(xg);
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj2 = Unit.INSTANCE;
                    }
                }
                C3931n9 c3931n9 = (C3931n9) c.getValue();
                xg.c = 2;
                p7 = c3931n9.d;
                p7.getClass();
                EnumC3599bh enumC3599bh2 = EnumC3599bh.b;
                if (p7.d != EnumC3599bh.f7030a) {
                    p7.d = enumC3599bh2;
                    obj = p7.c(xg);
                    if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj = Unit.INSTANCE;
                    }
                } else {
                    obj = Unit.INSTANCE;
                }
                if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj = Unit.INSTANCE;
                }
            }
        }
        xg = new Xg(this, continuationImpl);
        Object obj32 = xg.f6951a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = xg.c;
        if (i != 0) {
        }
        C3931n9 c3931n92 = (C3931n9) c.getValue();
        xg.c = 2;
        p7 = c3931n92.d;
        p7.getClass();
        EnumC3599bh enumC3599bh22 = EnumC3599bh.b;
        if (p7.d != EnumC3599bh.f7030a) {
        }
        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r7 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        Yg yg;
        int i;
        Object obj;
        C3682eg c3682eg;
        Object obj2;
        if (continuationImpl instanceof Yg) {
            yg = (Yg) continuationImpl;
            int i2 = yg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yg.c = i2 - Integer.MIN_VALUE;
                Object obj3 = yg.f6974a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yg.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (!e.compareAndSet(true, false)) {
                        return Unit.INSTANCE;
                    }
                    C3931n9 c3931n9 = (C3931n9) c.getValue();
                    yg.c = 1;
                    P7 p7 = c3931n9.d;
                    p7.getClass();
                    EnumC3599bh enumC3599bh = EnumC3599bh.f7030a;
                    if (p7.d == EnumC3599bh.b) {
                        p7.d = enumC3599bh;
                        obj = p7.i(yg);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                    if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj3);
                }
                Q5 q5 = (Q5) d.getValue();
                yg.c = 2;
                q5.getClass();
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                c3682eg = q5.d;
                c3682eg.getClass();
                EnumC3599bh enumC3599bh2 = EnumC3599bh.f7030a;
                if (c3682eg.d != EnumC3599bh.b) {
                    c3682eg.d = enumC3599bh2;
                    obj2 = c3682eg.h(yg);
                    if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj2 = Unit.INSTANCE;
                    }
                } else {
                    obj2 = Unit.INSTANCE;
                }
                if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj2 = Unit.INSTANCE;
                }
            }
        }
        yg = new Yg(this, continuationImpl);
        Object obj32 = yg.f6974a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yg.c;
        if (i != 0) {
        }
        Q5 q52 = (Q5) d.getValue();
        yg.c = 2;
        q52.getClass();
        Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
        c3682eg = q52.d;
        c3682eg.getClass();
        EnumC3599bh enumC3599bh22 = EnumC3599bh.f7030a;
        if (c3682eg.d != EnumC3599bh.b) {
        }
        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r13 != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r13 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Gh gh, AdConfig.PingsV2Config pingsV2Config, ContinuationImpl continuationImpl) {
        Wg wg;
        int i;
        if (continuationImpl instanceof Wg) {
            wg = (Wg) continuationImpl;
            int i2 = wg.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wg.e = i2 - Integer.MIN_VALUE;
                Wg wg2 = wg;
                Object obj = wg2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wg2.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (f.compareAndSet(true, false)) {
                        wg2.f6934a = gh;
                        wg2.b = pingsV2Config;
                        wg2.e = 1;
                        Object a2 = gh.f6585a.a("UPDATE pings SET status=\"idle\" WHERE status=\"in_progress\"", wg2);
                        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    for (Pair pair : (Iterable) obj) {
                        String str = (String) pair.component1();
                        int intValue = ((Number) pair.component2()).intValue();
                        String str2 = "Deleted expired " + str + " priority ping";
                        C3827jk c3827jk = AbstractC4108th.f7396a;
                        AbstractC4108th.a("PingFailed", MapsKt.mutableMapOf(TuplesKt.to("trigger", str + "_" + intValue), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) 2370))));
                    }
                    return Unit.INSTANCE;
                }
                pingsV2Config = wg2.b;
                gh = wg2.f6934a;
                ResultKt.throwOnFailure(obj);
                Gh gh2 = gh;
                wg2.f6934a = null;
                wg2.b = null;
                wg2.e = 2;
                obj = gh2.a(pingsV2Config.getExpiry().getNormal() * 1000, 1000 * pingsV2Config.getExpiry().getHigh(), wg2);
            }
        }
        wg = new Wg(this, continuationImpl);
        Wg wg22 = wg;
        Object obj2 = wg22.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wg22.e;
        if (i != 0) {
        }
        Gh gh22 = gh;
        wg22.f6934a = null;
        wg22.b = null;
        wg22.e = 2;
        obj2 = gh22.a(pingsV2Config.getExpiry().getNormal() * 1000, 1000 * pingsV2Config.getExpiry().getHigh(), wg22);
    }
}
