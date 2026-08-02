package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.iap.m;
import com.facebook.appevents.iap.o;
import com.facebook.appevents.iap.u;
import com.facebook.internal.C0715k;
import com.facebook.w;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class i {
    public static final i a = new i();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x000d, B:14:0x0021, B:16:0x002b, B:17:0x002d, B:24:0x004c, B:25:0x004d, B:26:0x0080, B:28:0x0085, B:31:0x008a, B:33:0x0092, B:38:0x00a9, B:40:0x00ad, B:47:0x00a3, B:48:0x00bc, B:56:0x0054, B:57:0x0055, B:59:0x0059, B:60:0x005b, B:67:0x007a, B:68:0x007b, B:76:0x007f, B:44:0x009f, B:62:0x005c, B:65:0x0073, B:73:0x006e, B:19:0x002e, B:22:0x0045, B:53:0x0040), top: B:9:0x000d, outer: #2, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x000d, B:14:0x0021, B:16:0x002b, B:17:0x002d, B:24:0x004c, B:25:0x004d, B:26:0x0080, B:28:0x0085, B:31:0x008a, B:33:0x0092, B:38:0x00a9, B:40:0x00ad, B:47:0x00a3, B:48:0x00bc, B:56:0x0054, B:57:0x0055, B:59:0x0059, B:60:0x005b, B:67:0x007a, B:68:0x007b, B:76:0x007f, B:44:0x009f, B:62:0x005c, B:65:0x0073, B:73:0x006e, B:19:0x002e, B:22:0x0045, B:53:0x0040), top: B:9:0x000d, outer: #2, inners: #1, #3, #4 }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [T] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.facebook.appevents.iap.m] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [T] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.facebook.appevents.iap.o] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void b(Context context, u.a billingClientVersion) {
        boolean z;
        synchronized (i.class) {
            if (com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
                AtomicBoolean atomicBoolean = b;
                if (atomicBoolean.get()) {
                    return;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? r4 = 0;
                r4 = 0;
                r4 = 0;
                ?? r42 = 0;
                if (billingClientVersion == u.a.V2_V4) {
                    synchronized (m.Companion) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                            try {
                                r42 = m.l;
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, m.class);
                            }
                        }
                        if (r42 == 0) {
                            r42 = m.b.a(context);
                        }
                    }
                    objectRef.element = r42;
                    if (objectRef.element != null) {
                        atomicBoolean.set(true);
                        return;
                    }
                    if (C0715k.b(C0715k.b.AndroidIAPSubscriptionAutoLogging)) {
                        com.facebook.appevents.integrity.e eVar = com.facebook.appevents.integrity.e.a;
                        int i = 0;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.e.class)) {
                            try {
                                z = com.facebook.appevents.integrity.e.b;
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.integrity.e.class);
                            }
                            if (z || billingClientVersion == u.a.V2_V4) {
                                ((j) objectRef.element).a(u.b.INAPP, new g(objectRef, billingClientVersion, context, i));
                                return;
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        ((j) objectRef.element).a(u.b.INAPP, new g(objectRef, billingClientVersion, context, i));
                        return;
                    }
                    ((j) objectRef.element).a(u.b.INAPP, new androidx.work.impl.constraints.trackers.a(1, billingClientVersion, context));
                    return;
                }
                if (billingClientVersion == u.a.V5_V7) {
                    o.a aVar = o.Companion;
                    synchronized (aVar) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                            try {
                                r4 = o.H;
                            } catch (Throwable th3) {
                                com.facebook.internal.instrument.crashshield.a.a(th3, o.class);
                            }
                        }
                        if (r4 == 0) {
                            r4 = aVar.a(context);
                        }
                    }
                    objectRef.element = r4;
                }
                if (objectRef.element != null) {
                }
            } catch (Throwable th4) {
                com.facebook.internal.instrument.crashshield.a.a(th4, i.class);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u.a aVar, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            r rVar = r.a;
            boolean z = false;
            if (!com.facebook.internal.instrument.crashshield.a.b(r.class)) {
                try {
                    z = !w.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, r.class);
                }
            }
            boolean z2 = z;
            if (z2) {
                r.e();
            }
            if (aVar == u.a.V2_V4) {
                m.Companion.getClass();
                r.d(m.b.b(), m.b.c(), false, str, aVar, z2);
                r.d(m.b.d(), m.b.c(), true, str, aVar, z2);
                m.b.b().clear();
                m.b.d().clear();
            } else {
                o.Companion.getClass();
                ConcurrentHashMap concurrentHashMap6 = null;
                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                    try {
                        concurrentHashMap = o.I;
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, o.class);
                    }
                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            concurrentHashMap2 = o.K;
                        } catch (Throwable th3) {
                            com.facebook.internal.instrument.crashshield.a.a(th3, o.class);
                        }
                        r.d(concurrentHashMap, concurrentHashMap2, false, str, aVar, z2);
                        if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                            try {
                                concurrentHashMap3 = o.J;
                            } catch (Throwable th4) {
                                com.facebook.internal.instrument.crashshield.a.a(th4, o.class);
                            }
                            if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                                try {
                                    concurrentHashMap4 = o.K;
                                } catch (Throwable th5) {
                                    com.facebook.internal.instrument.crashshield.a.a(th5, o.class);
                                }
                                r.d(concurrentHashMap3, concurrentHashMap4, true, str, aVar, z2);
                                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                                    try {
                                        concurrentHashMap5 = o.I;
                                    } catch (Throwable th6) {
                                        com.facebook.internal.instrument.crashshield.a.a(th6, o.class);
                                    }
                                    concurrentHashMap5.clear();
                                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                                        try {
                                            concurrentHashMap6 = o.J;
                                        } catch (Throwable th7) {
                                            com.facebook.internal.instrument.crashshield.a.a(th7, o.class);
                                        }
                                    }
                                    concurrentHashMap6.clear();
                                }
                                concurrentHashMap5 = null;
                                concurrentHashMap5.clear();
                                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                                }
                                concurrentHashMap6.clear();
                            }
                            concurrentHashMap4 = null;
                            r.d(concurrentHashMap3, concurrentHashMap4, true, str, aVar, z2);
                            if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                            }
                            concurrentHashMap5 = null;
                            concurrentHashMap5.clear();
                            if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                            }
                            concurrentHashMap6.clear();
                        }
                        concurrentHashMap3 = null;
                        if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        }
                        concurrentHashMap4 = null;
                        r.d(concurrentHashMap3, concurrentHashMap4, true, str, aVar, z2);
                        if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        }
                        concurrentHashMap5 = null;
                        concurrentHashMap5.clear();
                        if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        }
                        concurrentHashMap6.clear();
                    }
                    concurrentHashMap2 = null;
                    r.d(concurrentHashMap, concurrentHashMap2, false, str, aVar, z2);
                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                    }
                    concurrentHashMap3 = null;
                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                    }
                    concurrentHashMap4 = null;
                    r.d(concurrentHashMap3, concurrentHashMap4, true, str, aVar, z2);
                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                    }
                    concurrentHashMap5 = null;
                    concurrentHashMap5.clear();
                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                    }
                    concurrentHashMap6.clear();
                }
                concurrentHashMap = null;
                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                }
                concurrentHashMap2 = null;
                r.d(concurrentHashMap, concurrentHashMap2, false, str, aVar, z2);
                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                }
                concurrentHashMap3 = null;
                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                }
                concurrentHashMap4 = null;
                r.d(concurrentHashMap3, concurrentHashMap4, true, str, aVar, z2);
                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                }
                concurrentHashMap5 = null;
                concurrentHashMap5.clear();
                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                }
                concurrentHashMap6.clear();
            }
            if (z2) {
                r.f();
            }
        } catch (Throwable th8) {
            com.facebook.internal.instrument.crashshield.a.a(th8, this);
        }
    }
}
