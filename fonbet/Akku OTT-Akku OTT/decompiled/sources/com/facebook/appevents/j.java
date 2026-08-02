package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.C0688a;
import com.facebook.appevents.p;
import com.facebook.internal.u;
import com.facebook.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes3.dex */
public final class j {
    public static final String a;
    public static final int b;
    public static volatile C0693e c;
    public static final ScheduledExecutorService d;
    public static ScheduledFuture<?> e;
    public static final RunnableC0695g f;

    static {
        new j();
        a = j.class.getName();
        b = 100;
        c = new C0693e();
        d = Executors.newSingleThreadScheduledExecutor();
        f = new RunnableC0695g(0);
    }

    @JvmStatic
    public static final com.facebook.z a(final C0689a accessTokenAppId, final E appEvents, boolean z, final y flushState) {
        if (!com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                Intrinsics.checkNotNullParameter(flushState, "flushState");
                String str = accessTokenAppId.a;
                com.facebook.internal.n k = com.facebook.internal.p.k(str, false);
                z.c cVar = com.facebook.z.Companion;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                cVar.getClass();
                final com.facebook.z h = z.c.h(null, format, null, null);
                h.i = true;
                Bundle bundle = h.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String str2 = accessTokenAppId.b;
                if (str2 == null) {
                    C0688a.Companion.getClass();
                    C0688a b2 = C0688a.b.b();
                    str2 = b2 != null ? b2.e : null;
                }
                if (str2 != null) {
                    bundle.putString("access_token", str2);
                }
                z.Companion.getClass();
                p.Companion.getClass();
                synchronized (p.c()) {
                    com.facebook.internal.instrument.crashshield.a.b(p.class);
                }
                String d2 = p.a.d();
                if (d2 != null) {
                    bundle.putString("install_referrer", d2);
                }
                Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                h.d = bundle;
                int c2 = appEvents.c(h, com.facebook.w.a(), k != null ? k.a : false, z);
                if (c2 != 0) {
                    flushState.a += c2;
                    h.j(new z.b() { // from class: com.facebook.appevents.i
                        @Override // com.facebook.z.b
                        public final void a(com.facebook.E response) {
                            C0689a accessTokenAppId2 = C0689a.this;
                            com.facebook.z postRequest = h;
                            E appEvents2 = appEvents;
                            y flushState2 = flushState;
                            if (com.facebook.internal.instrument.crashshield.a.b(j.class)) {
                                return;
                            }
                            try {
                                Intrinsics.checkNotNullParameter(accessTokenAppId2, "$accessTokenAppId");
                                Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
                                Intrinsics.checkNotNullParameter(appEvents2, "$appEvents");
                                Intrinsics.checkNotNullParameter(flushState2, "$flushState");
                                Intrinsics.checkNotNullParameter(response, "response");
                                j.e(accessTokenAppId2, postRequest, response, appEvents2, flushState2);
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, j.class);
                            }
                        }
                    });
                    return h;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, j.class);
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final ArrayList b(C0693e appEventCollection, y flushResults) {
        if (com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean f2 = com.facebook.w.f(com.facebook.w.a());
            ArrayList arrayList = new ArrayList();
            for (C0689a c0689a : appEventCollection.e()) {
                E b2 = appEventCollection.b(c0689a);
                if (b2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                com.facebook.z request = a(c0689a, b2, f2, flushResults);
                if (request != null) {
                    arrayList.add(request);
                    com.facebook.appevents.cloudbridge.d.a.getClass();
                    if (com.facebook.appevents.cloudbridge.d.c) {
                        HashSet<Integer> hashSet = com.facebook.appevents.cloudbridge.h.a;
                        Intrinsics.checkNotNullParameter(request, "request");
                        androidx.room.j jVar = new androidx.room.j(request, 1);
                        com.facebook.internal.E e2 = com.facebook.internal.E.a;
                        try {
                            com.facebook.w.c().execute(jVar);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, j.class);
            return null;
        }
    }

    @JvmStatic
    public static final void c(w reason) {
        if (com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            d.execute(new androidx.core.view.E(reason, 2));
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, j.class);
        }
    }

    @JvmStatic
    public static final void d(w reason) {
        if (com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            c.a(C0694f.a());
            try {
                y f2 = f(reason, c);
                if (f2 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f2.a);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", f2.b);
                    LocalBroadcastManager.getInstance(com.facebook.w.a()).sendBroadcast(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, j.class);
        }
    }

    @JvmStatic
    public static final void e(C0689a accessTokenAppId, com.facebook.z request, com.facebook.E response, E appEvents, y flushState) {
        x xVar;
        x xVar2 = x.c;
        if (com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            com.facebook.t tVar = response.c;
            x xVar3 = x.a;
            if (tVar == null) {
                xVar = xVar3;
            } else if (tVar.b == -1) {
                xVar = xVar2;
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), tVar.toString()}, 2)), "format(format, *args)");
                xVar = x.b;
            }
            com.facebook.w.h(com.facebook.G.d);
            int i = 1;
            boolean z = tVar != null;
            synchronized (appEvents) {
                if (!com.facebook.internal.instrument.crashshield.a.b(appEvents)) {
                    if (z) {
                        try {
                            appEvents.c.addAll(appEvents.d);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, appEvents);
                        }
                    }
                    appEvents.d.clear();
                    appEvents.e = 0;
                }
            }
            if (xVar == xVar2) {
                com.facebook.w.c().execute(new androidx.webkit.d(i, accessTokenAppId, appEvents));
            }
            if (xVar == xVar3 || flushState.b == xVar2) {
                return;
            }
            Intrinsics.checkNotNullParameter(xVar, "<set-?>");
            flushState.b = xVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, j.class);
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    public static final y f(w reason, C0693e appEventCollection) {
        if (!com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            try {
                Intrinsics.checkNotNullParameter(reason, "reason");
                Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
                y yVar = new y();
                yVar.b = x.a;
                ArrayList b2 = b(appEventCollection, yVar);
                if (!b2.isEmpty()) {
                    u.a aVar = com.facebook.internal.u.Companion;
                    com.facebook.G g = com.facebook.G.d;
                    String TAG = a;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    Object[] objArr = {Integer.valueOf(yVar.a), reason.toString()};
                    aVar.getClass();
                    u.a.b(g, TAG, "Flushing %d events due to %s.", objArr);
                    Iterator it = b2.iterator();
                    while (it.hasNext()) {
                        ((com.facebook.z) it.next()).c();
                    }
                    return yVar;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, j.class);
                return null;
            }
        }
        return null;
    }
}
