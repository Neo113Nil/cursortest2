package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import androidx.core.os.EnvironmentCompat;
import com.facebook.C0728q;
import com.facebook.appevents.z;
import com.facebook.internal.C0715k;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {
    public static final a Companion = new a();
    public final p a;

    public static final class a {
        @JvmStatic
        public static void a(Application context, String applicationId) {
            Intrinsics.checkNotNullParameter(context, "application");
            p.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "application");
            if (!com.facebook.w.q.get()) {
                throw new C0728q("The Facebook sdk must be initialized before calling activateApp");
            }
            int i = 0;
            if (!C0691c.d) {
                z.Companion.getClass();
                z.a.a().execute(new RunnableC0690b(i));
            }
            H h = H.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                try {
                    if (!H.c.get()) {
                        H.a.b();
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, H.class);
                }
            }
            if (applicationId == null) {
                applicationId = com.facebook.w.b();
            }
            int i2 = 1;
            if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.w.class)) {
                try {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        if (!com.facebook.internal.m.b("app_events_killswitch", com.facebook.w.b(), false)) {
                            com.facebook.w.c().execute(new androidx.media3.exoplayer.audio.j(i2, applicationContext, applicationId));
                        }
                        if (C0715k.b(C0715k.b.OnDeviceEventProcessing) && com.facebook.appevents.ondeviceprocessing.a.a() && !com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ondeviceprocessing.a.class)) {
                            try {
                                Context a = com.facebook.w.a();
                                if (a != null) {
                                    com.facebook.w.c().execute(new androidx.webkit.d(2, a, applicationId));
                                }
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.ondeviceprocessing.a.class);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    com.facebook.internal.instrument.crashshield.a.a(th3, com.facebook.w.class);
                }
            }
            com.facebook.appevents.internal.f.c(context, applicationId);
            if (C0715k.b(C0715k.b.GPSPACAProcessing)) {
                com.facebook.appevents.gps.pa.a aVar = com.facebook.appevents.gps.pa.a.a;
                aVar.getClass();
                if (!com.facebook.internal.instrument.crashshield.a.b(aVar)) {
                    try {
                        if (!com.facebook.appevents.gps.pa.a.c) {
                            com.facebook.appevents.gps.pa.a.a();
                        }
                        if (com.facebook.appevents.gps.pa.a.b) {
                            aVar.b(applicationId, "fb_mobile_app_install");
                        }
                    } catch (Throwable th4) {
                        com.facebook.internal.instrument.crashshield.a.a(th4, aVar);
                    }
                }
            }
            if (C0715k.b(C0715k.b.GPSARATriggers)) {
                com.facebook.appevents.gps.ara.a.a.d(applicationId, new C0692d(EnvironmentCompat.MEDIA_UNKNOWN, "MOBILE_INSTALL_EVENT", null, null, false, com.facebook.appevents.internal.f.l == 0, com.facebook.appevents.internal.f.b(), null));
            }
        }

        @JvmStatic
        public static String b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            if (p.a() == null) {
                synchronized (p.c()) {
                    try {
                        if (p.a() == null) {
                            String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                            if (!com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                                try {
                                    p.f = string;
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, p.class);
                                }
                            }
                            if (p.a() == null) {
                                String str = "XZ" + UUID.randomUUID();
                                if (!com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                                    try {
                                        p.f = str;
                                    } catch (Throwable th2) {
                                        com.facebook.internal.instrument.crashshield.a.a(th2, p.class);
                                    }
                                }
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", p.a()).apply();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            String a = p.a();
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("AUTO", 0);
            a = bVar;
            b bVar2 = new b("EXPLICIT_ONLY", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public l(Context context) {
        this.a = new p(context, (String) null);
    }
}
