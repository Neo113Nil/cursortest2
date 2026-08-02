package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.work.PeriodicWorkRequest;
import com.facebook.G;
import com.facebook.S;
import com.facebook.appevents.l;
import com.facebook.appevents.p;
import com.facebook.appevents.z;
import com.facebook.internal.u;
import com.facebook.w;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class n {
    public static final n a = new n();
    public static final String b = n.class.getCanonicalName();
    public static final long[] c = {300000, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 1800000, DurationKt.MILLIS_IN_HOUR, 21600000, 43200000, DurationKt.MILLIS_IN_DAY, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    @JvmStatic
    public static final void a(Context context, String activityName, String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            z.Companion.getClass();
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            p loggerImpl = new p(activityName, str);
            Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
            w wVar = w.a;
            if (S.c()) {
                loggerImpl.e("fb_mobile_activate_app", bundle);
            }
            p.Companion.getClass();
            if (p.a.c() == l.b.b || com.facebook.internal.instrument.crashshield.a.b(loggerImpl)) {
                return;
            }
            try {
                com.facebook.appevents.j.c(com.facebook.appevents.w.a);
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, loggerImpl);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, n.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0010, B:9:0x0017, B:11:0x001d, B:12:0x0021, B:15:0x002b, B:16:0x0033, B:18:0x0037, B:21:0x003c, B:24:0x004b, B:25:0x004f, B:41:0x007e, B:42:0x0081, B:44:0x009e, B:46:0x00a6, B:48:0x00b1, B:49:0x00b8, B:51:0x00e5, B:30:0x006c, B:32:0x0071), top: B:3:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0010, B:9:0x0017, B:11:0x001d, B:12:0x0021, B:15:0x002b, B:16:0x0033, B:18:0x0037, B:21:0x003c, B:24:0x004b, B:25:0x004f, B:41:0x007e, B:42:0x0081, B:44:0x009e, B:46:0x00a6, B:48:0x00b1, B:49:0x00b8, B:51:0x00e5, B:30:0x006c, B:32:0x0071), top: B:3:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0010, B:9:0x0017, B:11:0x001d, B:12:0x0021, B:15:0x002b, B:16:0x0033, B:18:0x0037, B:21:0x003c, B:24:0x004b, B:25:0x004f, B:41:0x007e, B:42:0x0081, B:44:0x009e, B:46:0x00a6, B:48:0x00b1, B:49:0x00b8, B:51:0x00e5, B:30:0x006c, B:32:0x0071), top: B:3:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String activityName, m mVar, String str) {
        long j;
        o oVar;
        Long l;
        if (com.facebook.internal.instrument.crashshield.a.b(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (mVar == null) {
                return;
            }
            Long l2 = mVar.e;
            if (l2 == null) {
                l2 = 0L;
            }
            long longValue = l2.longValue();
            n nVar = a;
            if (longValue < 0) {
                nVar.b();
                longValue = 0;
            }
            Long l3 = mVar.a;
            if (l3 != null && (l = mVar.b) != null) {
                j = l.longValue() - l3.longValue();
                if (j < 0) {
                    nVar.b();
                    j = 0;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("fb_mobile_app_interruptions", mVar.d);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.ROOT;
                int i = 0;
                if (!com.facebook.internal.instrument.crashshield.a.b(n.class)) {
                    int i2 = 0;
                    while (true) {
                        try {
                            long[] jArr = c;
                            if (i2 >= jArr.length || jArr[i2] >= longValue) {
                                break;
                            } else {
                                i2++;
                            }
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, n.class);
                        }
                    }
                    i = i2;
                }
                String format = String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                bundle.putString("fb_mobile_time_between_sessions", format);
                oVar = mVar.f;
                if (oVar != null || (r0 = oVar.toString()) == null) {
                    String str2 = "Unclassified";
                }
                bundle.putString("fb_mobile_launch_source", str2);
                Long l4 = mVar.b;
                bundle.putLong("_logTime", (l4 == null ? l4.longValue() : 0L) / 1000);
                z.Companion.getClass();
                Intrinsics.checkNotNullParameter(activityName, "activityName");
                Intrinsics.checkNotNullParameter(activityName, "activityName");
                p loggerImpl = new p(activityName, str);
                Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                double d = j / 1000;
                w wVar = w.a;
                if (S.c()) {
                    return;
                }
                loggerImpl.d(bundle, "fb_mobile_deactivate_app", d);
                return;
            }
            j = 0;
            if (j < 0) {
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("fb_mobile_app_interruptions", mVar.d);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale2 = Locale.ROOT;
            int i3 = 0;
            if (!com.facebook.internal.instrument.crashshield.a.b(n.class)) {
            }
            String format2 = String.format(locale2, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
            bundle2.putString("fb_mobile_time_between_sessions", format2);
            oVar = mVar.f;
            if (oVar != null) {
            }
            String str22 = "Unclassified";
            bundle2.putString("fb_mobile_launch_source", str22);
            Long l42 = mVar.b;
            bundle2.putLong("_logTime", (l42 == null ? l42.longValue() : 0L) / 1000);
            z.Companion.getClass();
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            p loggerImpl2 = new p(activityName, str);
            Intrinsics.checkNotNullParameter(loggerImpl2, "loggerImpl");
            double d2 = j / 1000;
            w wVar2 = w.a;
            if (S.c()) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, n.class);
        }
    }

    public final void b() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            u.a aVar = u.Companion;
            G g = G.d;
            String str = b;
            Intrinsics.checkNotNull(str);
            aVar.getClass();
            u.a.a(g, str, "Clock skew detected");
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
