package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes6.dex */
public final class X3 {
    public static CoroutineScope c;
    public static H3 d;
    public static HandlerThread e;
    public static final U3 l;

    /* renamed from: a, reason: collision with root package name */
    public static final X3 f6941a = new X3();
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.X3$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return X3.b();
        }
    });
    public static List f = new ArrayList();
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static final AtomicBoolean h = new AtomicBoolean(true);
    public static final Object i = new Object();
    public static final LinkedHashMap j = new LinkedHashMap();
    public static final Function1 k = new Function1() { // from class: com.inmobi.media.X3$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return X3.a((C3698f3) obj);
        }
    };

    public static final Unit a(C3698f3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = event.f7098a;
        if (i2 == 1 || i2 == 2) {
            Intrinsics.checkNotNullExpressionValue("X3", "TAG");
            h.set(false);
        } else if (i2 != 10) {
            if (i2 != 11) {
                Intrinsics.checkNotNullExpressionValue("X3", "TAG");
                String str = "event received - " + event.f7098a;
            } else if (!Boolean.parseBoolean(event.b)) {
                f();
            }
        } else if (Intrinsics.areEqual("available", event.b)) {
            f();
        }
        return Unit.INSTANCE;
    }

    public static final void b(C4066s3 c4066s3) {
        int i2 = c4066s3.f;
        if (i2 > 0) {
            c4066s3.f = i2 - 1;
            c4066s3.g = System.currentTimeMillis();
            BuildersKt__BuildersKt.runBlocking$default(null, new W3(c4066s3, null), 1, null);
        }
    }

    public static AdConfig.ImaiConfig c() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getImai();
    }

    public static void d() {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            Intrinsics.checkNotNullExpressionValue("X3", "TAG");
            Intrinsics.checkNotNullParameter("X3", "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new ThreadFactoryC3932na("X3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            c = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) threadPoolExecutor).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            e = handlerThread;
            AbstractC3787i7.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = e;
            Intrinsics.checkNotNull(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
            d = new H3(looper);
            ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{10, 11, 2, 1}, k);
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("X3", "TAG");
            String str = "SDK encountered unexpected error in initializing the ping component; " + e2.getMessage();
        }
    }

    public static boolean e() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        return !((RootConfig) AbstractC4260z4.f7518a.a(RootConfig.class)).getMonetizationDisabled();
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (Sf.a() != null) {
                return;
            }
            synchronized (i) {
                if (g.compareAndSet(false, true)) {
                    Intrinsics.checkNotNullExpressionValue("X3", "TAG");
                    if (e == null) {
                        HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                        e = handlerThread2;
                        AbstractC3787i7.a(handlerThread2, "pingHandlerThread");
                    }
                    if (d == null && (handlerThread = e) != null) {
                        Looper looper = handlerThread.getLooper();
                        Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
                        d = new H3(looper);
                    }
                    BuildersKt__BuildersKt.runBlocking$default(null, new V3(null), 1, null);
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("X3", "TAG");
            String str = "SDK encountered unexpected error in starting the ping component; " + e2.getMessage();
        }
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = g;
            atomicBoolean.set(false);
            synchronized (i) {
                if (!atomicBoolean.get()) {
                    HandlerThread handlerThread = e;
                    if (handlerThread != null) {
                        handlerThread.getLooper().quit();
                        handlerThread.interrupt();
                    }
                    e = null;
                    d = null;
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("X3", "TAG");
            String str = "SDK encountered unexpected error in stopping the ping component; " + e2.getMessage();
        }
    }

    public static final C4177w3 b() {
        return new C4177w3(T9.b());
    }

    static {
        Intrinsics.checkNotNullExpressionValue("X3", "TAG");
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.X3$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                X3.a();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
        l = new U3();
    }

    public static final HashMap a(C4066s3 c4066s3) {
        HashMap hashMap = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - c4066s3.f) + 1;
            if (maxRetries > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(maxRetries));
                return hashMap;
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("X3", "TAG");
        }
        return hashMap;
    }

    public static final void a() {
        d();
    }

    public static void a(String url, boolean z, Y9 y9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullExpressionValue("X3", "TAG");
        String str = "ping " + url;
        Vh.a(Sh.b, new N3(url, z, y9, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4066s3 c4066s3, C3582b0 c3582b0, Y9 y9, ContinuationImpl continuationImpl) {
        R3 r3;
        int i2;
        C3582b0 c3582b02;
        C4066s3 c4066s32 = c4066s3;
        Y9 y92 = y9;
        if (continuationImpl instanceof R3) {
            r3 = (R3) continuationImpl;
            int i3 = r3.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r3.f = i3 - Integer.MIN_VALUE;
                Object obj = r3.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = r3.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (y92 != null) {
                        Intrinsics.checkNotNullExpressionValue("X3", "TAG");
                        ((Z9) y92).c("X3", "record Click");
                    }
                    C4177w3 c4177w3 = (C4177w3) b.getValue();
                    int maxDbEvents = c().getMaxDbEvents();
                    r3.f6817a = c4066s32;
                    c3582b02 = c3582b0;
                    r3.b = c3582b02;
                    r3.c = y92;
                    r3.f = 1;
                    S9 s9 = c4177w3.f7450a;
                    C4150v3 c4150v3 = new C4150v3(maxDbEvents, c4177w3, c4066s32, null);
                    s9.getClass();
                    Object a2 = s9.a(new R9(s9, c4150v3, null), r3);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Y9 y93 = r3.c;
                    C3582b0 c3582b03 = r3.b;
                    C4066s3 c4066s33 = r3.f6817a;
                    ResultKt.throwOnFailure(obj);
                    c3582b02 = c3582b03;
                    y92 = y93;
                    c4066s32 = c4066s33;
                }
                if (c3582b02 != null) {
                    j.put(Integer.valueOf(c4066s32.f7366a), c3582b02);
                }
                if (Sf.a() == null) {
                    if (y92 != null) {
                        Intrinsics.checkNotNullExpressionValue("X3", "TAG");
                        ((Z9) y92).b("X3", "No network available. Saving click for later processing ...");
                    }
                    g.set(false);
                    g();
                } else {
                    if (y92 != null) {
                        Intrinsics.checkNotNullExpressionValue("X3", "TAG");
                        ((Z9) y92).a("X3", "submit click - " + c4066s32.f7366a);
                    }
                    CoroutineScope coroutineScope = c;
                    if (coroutineScope != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new S3(c4066s32, y92, null), 3, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        r3 = new R3(this, continuationImpl);
        Object obj2 = r3.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = r3.f;
        if (i2 != 0) {
        }
        if (c3582b02 != null) {
        }
        if (Sf.a() == null) {
        }
        return Unit.INSTANCE;
    }

    public static void a(C4066s3 click, String reason) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(reason, "error");
        LinkedHashMap linkedHashMap = j;
        C3582b0 c3582b0 = (C3582b0) linkedHashMap.get(Integer.valueOf(click.f7366a));
        if (c3582b0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            Intrinsics.checkNotNullParameter(reason, "error");
            C4113tm c4113tm = c3582b0.b;
            Intrinsics.checkNotNullParameter(reason, "reason");
            LinkedHashMap a2 = c4113tm.a();
            a2.put("networkType", Y5.g());
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
            a2.put("reason", reason);
            String str = c4113tm.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("AdImpressionSuccessful", a2, EnumC3944nm.f7271a);
        }
        linkedHashMap.remove(Integer.valueOf(click.f7366a));
    }
}
