package com.inmobi.media;

import android.content.Context;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.compose.material.TextFieldImplKt;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.iab.omid.library.inmobi.Omid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.OkHttpClient;
import okio.BufferedSource;

/* renamed from: com.inmobi.media.kn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3859kn {
    public static boolean b;

    /* renamed from: a, reason: collision with root package name */
    public static final C3859kn f7207a = new C3859kn();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final C3718fn d = new C3718fn();

    public static boolean a() {
        int i;
        try {
            Reflection.getOrCreateKotlinClass(OkHttpClient.class).getSimpleName();
            i = 0;
        } catch (NoClassDefFoundError e) {
            Log.d("kn", "Missing required dependency: com.squareup.okhttp3:okhttp (OkHttpClient)", e);
            i = 1;
        }
        try {
            Reflection.getOrCreateKotlinClass(BufferedSource.class).getSimpleName();
        } catch (NoClassDefFoundError e2) {
            i++;
            Log.d("kn", "Missing required dependency: com.squareup.okio:okio (BufferedSource)", e2);
        }
        try {
            Reflection.getOrCreateKotlinClass(CoroutineScope.class).getSimpleName();
        } catch (NoClassDefFoundError e3) {
            i++;
            Log.d("kn", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (CoroutineScope)", e3);
        }
        try {
            Reflection.getOrCreateKotlinClass(Dispatchers.class).getSimpleName();
        } catch (NoClassDefFoundError e4) {
            i++;
            Log.d("kn", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (Dispatchers)", e4);
        }
        try {
            Reflection.getOrCreateKotlinClass(AdvertisingIdClient.class).getSimpleName();
        } catch (NoClassDefFoundError e5) {
            i++;
            Log.d("kn", "Missing required dependency: com.google.android.gms:play-services-ads-identifier (AdvertisingIdClient)", e5);
        }
        try {
            Reflection.getOrCreateKotlinClass(ContextCompat.class).getSimpleName();
        } catch (NoClassDefFoundError e6) {
            i++;
            Log.d("kn", "Missing required dependency: androidx.core:core-ktx (ContextCompat)", e6);
        }
        try {
            Reflection.getOrCreateKotlinClass(EnumEntries.class).getSimpleName();
        } catch (NoClassDefFoundError e7) {
            i++;
            Log.d("kn", "Missing required dependency: Kotlin stdlib (EnumEntries) - upgrade Kotlin version", e7);
        }
        try {
            Reflection.getOrCreateKotlinClass(CustomTabsClient.class).getSimpleName();
        } catch (NoClassDefFoundError e8) {
            i++;
            Log.d("kn", "Missing required dependency: androidx.browser:browser (CustomTabsClient)", e8);
        }
        try {
            Reflection.getOrCreateKotlinClass(Omid.class).getSimpleName();
        } catch (NoClassDefFoundError e9) {
            i++;
            Log.d("kn", "Missing required dependency: com.iab.omid.library.inmobi:omsdk-android (Omid)", e9);
        }
        if (i > 0) {
            Log.d("kn", "Total no missing dependencies = " + i);
        }
        return i > 0;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("sdk_version", "key");
        if (a2.f6510a.getString("sdk_version", null) == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Db a3 = Cb.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("sdk_version", "key");
        return !Intrinsics.areEqual(a3.f6510a.getString("sdk_version", null), "11.4.0");
    }

    public static void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.checkNotNullExpressionValue("kn", "TAG");
            AbstractC4126u7.a(context);
            Intrinsics.checkNotNullParameter(context, "context");
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db.a(Cb.a(context, "sdk_version_store"), "db_deletion_failed", true);
            Context context2 = AbstractC3914mk.f7252a;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            AbstractC3914mk.a(applicationContext);
        } catch (Exception e) {
            Log.d("kn", "Error while cleaning SDK state for account id difference", e);
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (b(context)) {
                AbstractC4126u7.a(context);
                Intrinsics.checkNotNullParameter(context, "context");
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db.a(Cb.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = AbstractC3914mk.f7252a;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                AbstractC3914mk.a(applicationContext);
            }
        } catch (Exception e) {
            Log.d("kn", "Error in cleaning cache directory", e);
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(8:11|12|(3:14|(2:17|15)|18)|19|(3:21|(1:23)|24)|25|26|27)(2:30|31))(1:32))(2:36|(2:38|39)(5:40|(3:42|(1:44)|45)|46|(1:48)(1:51)|(2:50|35)))|33))|54|6|7|(0)(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        if (r9.b(r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kn", "TAG");
        r0 = "Encountered unexpected error in stopping SDK components; " + r9.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kn", "TAG");
        com.inmobi.media.Kc.a((byte) 1, "kn", "SDK encountered unexpected error while stopping internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ContinuationImpl continuationImpl) {
        C3746gn c3746gn;
        int i;
        if (continuationImpl instanceof C3746gn) {
            c3746gn = (C3746gn) continuationImpl;
            int i2 = c3746gn.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3746gn.b = i2 - Integer.MIN_VALUE;
                Object obj = c3746gn.f7129a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3746gn.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!c.compareAndSet(true, false)) {
                        Intrinsics.checkNotNullExpressionValue("kn", "TAG");
                        return Unit.INSTANCE;
                    }
                    C3829jm.f.set(false);
                    M6 m6 = C3829jm.g;
                    if (m6 != null) {
                        m6.f.set(false);
                        m6.g.set(true);
                        Job job = m6.j;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        m6.j = null;
                        m6.i = null;
                    }
                    C3829jm.g = null;
                    C3829jm.j = null;
                    ((C4214xd) AbstractC3914mk.f.getValue()).a(C3829jm.i);
                    Oi oi = Kk.f6677a;
                    c3746gn.b = 1;
                    Object a2 = AbstractC3727g4.a(Kk.f6677a, new Jk(null), c3746gn);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        V5 v5 = Ba.c;
                        if (v5 != null) {
                            Iterator it = v5.c.iterator();
                            while (it.hasNext()) {
                                ((U5) it.next()).b();
                            }
                        }
                        Kb kb = Ba.d;
                        M6 m62 = kb.b;
                        if (m62 != null) {
                            m62.f.set(false);
                            m62.g.set(true);
                            Job job2 = m62.j;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                            }
                            m62.j = null;
                            m62.i = null;
                        }
                        kb.b = null;
                        ((C4214xd) AbstractC3914mk.f.getValue()).a(kb.d);
                        Yl.a();
                        AbstractC4269zd.f7522a.compareAndSet(true, false);
                        Ml.g.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AbstractC3771hj.c.set(false);
                ((C4214xd) AbstractC3914mk.f.getValue()).a(AbstractC3771hj.f);
                AbstractC3771hj.b = null;
                Zg zg = Zg.f6993a;
                c3746gn.b = 2;
            }
        }
        c3746gn = new C3746gn(continuationImpl);
        Object obj2 = c3746gn.f7129a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3746gn.b;
        if (i != 0) {
        }
        AbstractC3771hj.c.set(false);
        ((C4214xd) AbstractC3914mk.f.getValue()).a(AbstractC3771hj.f);
        AbstractC3771hj.b = null;
        Zg zg2 = Zg.f6993a;
        c3746gn.b = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(2:20|21))(1:24))(2:31|(2:33|34)(2:35|(2:37|23)))|25|(1:27)(1:30)|(2:29|23)|21))|40|6|7|(0)(0)|25|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        if (r11.a(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        com.inmobi.media.C3859kn.c.set(false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kn", "TAG");
        r0 = "Encountered unexpected error in starting SDK components: " + r11.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kn", "TAG");
        com.inmobi.media.Kc.a((byte) 2, "kn", "SDK encountered unexpected error while starting internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:12:0x0030, B:13:0x00b9, B:20:0x003d, B:21:0x0088, B:24:0x0041, B:25:0x006c, B:30:0x0083, B:35:0x0059), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C3775hn c3775hn;
        Object coroutine_suspended;
        int i;
        Object a2;
        if (continuationImpl instanceof C3775hn) {
            c3775hn = (C3775hn) continuationImpl;
            int i2 = c3775hn.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3775hn.c = i2 - Integer.MIN_VALUE;
                Object obj = c3775hn.f7151a;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3775hn.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!c.compareAndSet(false, true)) {
                        Intrinsics.checkNotNullExpressionValue("kn", "TAG");
                        return Unit.INSTANCE;
                    }
                    Mm.a();
                    AppSetIdInfo appSetIdInfo = V1.f6903a;
                    X3 x3 = X3.f6941a;
                    X3.f();
                    c3775hn.c = 1;
                    if (C3829jm.b(c3775hn) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Ba.c();
                        HashMap hashMap = new HashMap();
                        C3829jm c3829jm = C3829jm.f7187a;
                        C3829jm.b("SessionStarted", hashMap, EnumC3944nm.f7271a);
                        Yl.b();
                        AbstractC4269zd.a();
                        Ml.g.setValue(Boolean.TRUE);
                        Eg.a(U1.b);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    xq xqVar = xq.f7488a;
                    AbstractC3771hj.c.set(true);
                    AbstractC3771hj.b();
                    ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{2, 1, 100, 151, TextFieldImplKt.AnimationDuration, 152}, AbstractC3771hj.f);
                    J4 j4 = AbstractC4260z4.f7518a;
                    AbstractC4260z4.a("telemetry", AbstractC3771hj.d);
                    Zg zg = Zg.f6993a;
                    c3775hn.c = 3;
                }
                Oi oi = Kk.f6677a;
                c3775hn.c = 2;
                a2 = AbstractC3727g4.a(Kk.f6677a, new Ik(null), c3775hn);
                if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = Unit.INSTANCE;
                }
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xq xqVar2 = xq.f7488a;
                AbstractC3771hj.c.set(true);
                AbstractC3771hj.b();
                ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{2, 1, 100, 151, TextFieldImplKt.AnimationDuration, 152}, AbstractC3771hj.f);
                J4 j42 = AbstractC4260z4.f7518a;
                AbstractC4260z4.a("telemetry", AbstractC3771hj.d);
                Zg zg2 = Zg.f6993a;
                c3775hn.c = 3;
            }
        }
        c3775hn = new C3775hn(this, continuationImpl);
        Object obj2 = c3775hn.f7151a;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3775hn.c;
        if (i != 0) {
        }
        Oi oi2 = Kk.f6677a;
        c3775hn.c = 2;
        a2 = AbstractC3727g4.a(Kk.f6677a, new Ik(null), c3775hn);
        if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        if (a2 == coroutine_suspended) {
        }
        xq xqVar22 = xq.f7488a;
        AbstractC3771hj.c.set(true);
        AbstractC3771hj.b();
        ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{2, 1, 100, 151, TextFieldImplKt.AnimationDuration, 152}, AbstractC3771hj.f);
        J4 j422 = AbstractC4260z4.f7518a;
        AbstractC4260z4.a("telemetry", AbstractC3771hj.d);
        Zg zg22 = Zg.f6993a;
        c3775hn.c = 3;
    }
}
