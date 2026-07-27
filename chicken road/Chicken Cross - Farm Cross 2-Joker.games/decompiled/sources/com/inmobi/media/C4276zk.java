package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4276zk {
    public static String d;
    public static boolean e;
    public static long f;
    public static long k;
    public static long l;
    public static long m;
    public static long n;
    public static final Db o;
    public static final C3584b2 p;
    public static final C3584b2 q;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(C4276zk.class, "sessionCnt", "getSessionCnt()I", 0)), Reflection.property1(new PropertyReference1Impl(C4276zk.class, "userRetention", "getUserRetention()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final C4276zk f7528a = new C4276zk();
    public static final String c = "zk";
    public static final List g = CollectionsKt.mutableListOf(0, 0, 0, 0);
    public static final AtomicBoolean h = new AtomicBoolean(false);
    public static final Channel i = ChannelKt.Channel$default(-1, null, null, 6, null);
    public static final AtomicBoolean j = new AtomicBoolean(false);

    static {
        int i2 = -1;
        Db db = null;
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            db = Cb.a(context, "session_pref_file");
        }
        o = db;
        int i3 = 12;
        p = new C3584b2(i2, new Function0() { // from class: com.inmobi.media.zk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C4276zk.c());
            }
        }, i3);
        q = new C3584b2(i2, new Function0() { // from class: com.inmobi.media.zk$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C4276zk.d());
            }
        }, i3);
    }

    public static void a(boolean z) {
        if (Kk.a().getSessionEnabled()) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            d = uuid;
            if (z) {
                String str = "Session tracking started. ID: " + uuid;
            }
            String TAG = c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
    }

    public static SignalsConfig.SessionConfig b() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getSession();
    }

    public static final int c() {
        f7528a.getClass();
        Db db = o;
        if (db == null) {
            return 0;
        }
        Intrinsics.checkNotNullParameter("cnt", "key");
        return db.f6510a.getInt("cnt", 0);
    }

    public static final int d() {
        f7528a.getClass();
        Db db = o;
        if (db == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("u-ret", "key");
        return Integer.min((int) ((currentTimeMillis - db.f6510a.getLong("u-ret", currentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void e() {
        if (b().isForegroundBackgroundModelEnabled() && j.get() && m <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            n = (currentTimeMillis - l) + n;
            m = currentTimeMillis;
            String TAG = c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            String str = "Session backgrounded at " + currentTimeMillis + ". Foreground duration so far: " + n + "ms. Timeout: " + b().getTimeoutSeconds() + CmcdData.Factory.STREAMING_FORMAT_SS;
        }
    }

    public static void f() {
        long currentTimeMillis = System.currentTimeMillis();
        AtomicBoolean atomicBoolean = j;
        if (!atomicBoolean.get()) {
            a(true);
            long currentTimeMillis2 = System.currentTimeMillis();
            k = currentTimeMillis2;
            l = currentTimeMillis2;
            m = 0L;
            n = 0L;
            Collections.fill(g, 0);
            atomicBoolean.set(true);
            i.mo7997trySendJP2dKIU(Unit.INSTANCE);
            g();
            String TAG = c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return;
        }
        long j2 = m;
        if (j2 == 0) {
            return;
        }
        if (currentTimeMillis - j2 < b().getTimeoutMillis()) {
            l = currentTimeMillis;
            m = 0L;
            String TAG2 = c;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            String str = "Session resumed. Foreground duration so far: " + n + "ms";
            return;
        }
        a();
        a(true);
        long currentTimeMillis3 = System.currentTimeMillis();
        k = currentTimeMillis3;
        l = currentTimeMillis3;
        m = 0L;
        n = 0L;
        Collections.fill(g, 0);
        atomicBoolean.set(true);
        i.mo7997trySendJP2dKIU(Unit.INSTANCE);
        g();
        String TAG3 = c;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
    }

    public static void g() {
        if (b().getSigControlList().contains(5)) {
            Db db = o;
            if (db != null) {
                Intrinsics.checkNotNullParameter("cnt", "key");
                db.a("cnt", Integer.min(db.f6510a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false);
            }
            p.a();
        }
        if (b().getSigControlList().contains(6)) {
            Db db2 = o;
            if (db2 != null) {
                Intrinsics.checkNotNullParameter("u-ret", "key");
                if (!db2.f6510a.contains("u-ret")) {
                    db2.a("u-ret", System.currentTimeMillis(), false);
                }
            }
            q.a();
        }
    }

    public static void a() {
        j.set(false);
        String TAG = c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "Session expired after timeout. Foreground duration: " + n + "ms";
    }

    public static void a(String adtype, Boolean bool) {
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        if (Intrinsics.areEqual(adtype, "banner") && b().getSigControlList().contains(1)) {
            List list = g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(adtype, "int") && !Intrinsics.areEqual(bool, Boolean.TRUE) && b().getSigControlList().contains(2)) {
            List list2 = g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(adtype, "native") && b().getSigControlList().contains(4)) {
            List list3 = g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && b().getSigControlList().contains(3)) {
            List list4 = g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
