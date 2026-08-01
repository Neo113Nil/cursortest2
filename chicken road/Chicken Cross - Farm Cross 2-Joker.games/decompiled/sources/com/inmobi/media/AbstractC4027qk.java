package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.qk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4027qk {
    public static byte c;
    public static boolean d;
    public static byte f;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f7332a = new AtomicBoolean(false);
    public static final AtomicLong b = new AtomicLong(-1);
    public static final ArrayList e = new ArrayList();
    public static volatile C3825ji g = new C3825ji(null, false);

    public static Long a() {
        long j = b.get();
        String str = "Provider ts from PUB INIT=" + j;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(SystemClock.elapsedRealtime() - j);
    }

    public static final void b(final Context context, long j, final long j2, final Function1 function1) {
        final C3999pk a2 = a(context);
        g = new C3825ji(a2.f7309a, a2.b);
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.qk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4027qk.b(context, j2, elapsedRealtime, a2, function1);
            }
        });
    }

    public static void a(Context context, long j, long j2, C3999pk c3999pk, Function1 function1) {
        String str;
        if (!d) {
            byte b2 = c;
            if (b2 == 1) {
                str = "PROVIDER";
            } else if (b2 == 2) {
                str = "PUBLISHER";
            } else {
                str = "NONE";
            }
            String str2 = "Provider settings read ignored; activeSource=" + str + ".";
            return;
        }
        AbstractC4055rk.a(j2, c3999pk.d);
        Short sh = c3999pk.d;
        if (sh != null && sh.shortValue() == 2424) {
            Short sh2 = c3999pk.d;
            Ta ta = Ta.f6869a;
            Ta.a(context, "PreInitCompleted", Long.valueOf(j2), sh2);
            d = false;
            return;
        }
        if (c3999pk.c) {
            Context context2 = AbstractC3914mk.f7252a;
            if (j > 0) {
                AbstractC3914mk.e.compareAndSet(0L, j);
            }
        }
        Context context3 = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC3914mk.f7252a = context.getApplicationContext();
        if (!AbstractC3914mk.c() && AbstractC3914mk.j != 1) {
            Short sh3 = c3999pk.d;
            if (sh3 != null) {
                Ta ta2 = Ta.f6869a;
                Ta.a(context, "PreInitCompleted", Long.valueOf(j2), sh3);
                d = false;
                return;
            }
            String str3 = c3999pk.f7309a;
            if (str3 == null) {
                Ta ta3 = Ta.f6869a;
                Ta.a(context, "PreInitCompleted", Long.valueOf(j2), (short) 2420);
                d = false;
                return;
            }
            d = false;
            c = (byte) 1;
            AtomicLong atomicLong = b;
            atomicLong.set(SystemClock.elapsedRealtime());
            String str4 = "Provider ts=" + atomicLong.get();
            function1.invoke(str3);
            return;
        }
        Ta ta4 = Ta.f6869a;
        Ta.a(context, "PreInitCompleted", Long.valueOf(j2), (short) 2421);
        d = false;
    }

    public static final void b(Context context, long j, long j2, C3999pk c3999pk, Function1 function1) {
        a(context, j, j2, c3999pk, function1);
    }

    public static C3999pk a(Context context) {
        String str;
        Short sh;
        try {
            boolean a2 = AbstractC4140uk.a(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            ConcurrentHashMap concurrentHashMap = Db.b;
            boolean z = applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).getBoolean("enabled", false);
            boolean b2 = AbstractC4140uk.b(context);
            Context context2 = AbstractC3914mk.f7252a;
            Intrinsics.checkNotNullParameter(context, "context");
            Db a3 = Cb.a(context, "coppa_store");
            Intrinsics.checkNotNullParameter("im_accid", "key");
            String string = a3.f6510a.getString("im_accid", null);
            if (string == null || (str = StringsKt.trim((CharSequence) string).toString()) == null || str.length() <= 0) {
                str = null;
            }
            if (a2) {
                sh = (short) 2423;
            } else if (!z) {
                sh = (short) 2424;
            } else {
                sh = str == null ? (short) 2420 : null;
            }
            return new C3999pk(str, a2, b2, sh);
        } catch (Exception e2) {
            String str2 = "Provider full init failed to read settings: " + e2.getMessage();
            return new C3999pk(null, false, false, (short) 2422);
        }
    }

    public static boolean a(final Context appContext, final long j, final long j2, final Function1 startProviderInit) {
        String str;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(startProviderInit, "startProviderInit");
        if (c == 0 && !AbstractC3914mk.c() && AbstractC3914mk.j != 1) {
            d = true;
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.qk$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4027qk.b(appContext, j2, j, startProviderInit);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC3914mk.h.submit(runnable);
            return true;
        }
        byte b2 = c;
        if (b2 == 1) {
            str = "PROVIDER";
        } else if (b2 == 2) {
            str = "PUBLISHER";
        } else {
            str = "NONE";
        }
        String str2 = "Provider full init skipped; reason=sdk_init_active activeSource=" + str + ".";
        long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        Ta ta = Ta.f6869a;
        Ta.a(appContext, "PreInitCompleted", Long.valueOf(elapsedRealtime), (short) 2421);
        return false;
    }
}
