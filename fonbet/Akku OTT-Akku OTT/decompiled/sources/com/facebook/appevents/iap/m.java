package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.iap.m;
import com.facebook.appevents.iap.t;
import com.facebook.appevents.iap.u;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class m implements j {
    public static m l;
    public final Object a;
    public final Class<?> b;
    public final Class<?> c;
    public final Class<?> d;
    public final Class<?> e;
    public final Class<?> f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final t k;
    public static final b Companion = new b();
    public static final AtomicBoolean m = new AtomicBoolean(false);
    public static final ConcurrentHashMap n = new ConcurrentHashMap();
    public static final ConcurrentHashMap o = new ConcurrentHashMap();
    public static final ConcurrentHashMap p = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        public final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m, Object[] objArr) {
            boolean endsWith$default;
            AtomicBoolean atomicBoolean;
            Method c;
            AtomicBoolean atomicBoolean2;
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    Intrinsics.checkNotNullParameter(proxy, "proxy");
                    Intrinsics.checkNotNullParameter(m, "m");
                    if (Intrinsics.areEqual(m.getName(), "onBillingSetupFinished")) {
                        Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 0) : null;
                        Class<?> a = u.a("com.android.billingclient.api.BillingResult");
                        if (a != null && (c = u.c(a, "getResponseCode", new Class[0])) != null && Intrinsics.areEqual(u.d(c, a, orNull, new Object[0]), (Object) 0)) {
                            m.Companion.getClass();
                            if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                try {
                                    atomicBoolean2 = m.m;
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, m.class);
                                }
                                atomicBoolean2.set(true);
                                this.a.run();
                            }
                            atomicBoolean2 = null;
                            atomicBoolean2.set(true);
                            this.a.run();
                        }
                    } else {
                        String name = m.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "m.name");
                        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(name, "onBillingServiceDisconnected", false, 2, null);
                        if (endsWith$default) {
                            m.Companion.getClass();
                            if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                try {
                                    atomicBoolean = m.m;
                                } catch (Throwable th2) {
                                    com.facebook.internal.instrument.crashshield.a.a(th2, m.class);
                                }
                                atomicBoolean.set(false);
                            }
                            atomicBoolean = null;
                            atomicBoolean.set(false);
                        }
                    }
                } catch (Throwable th3) {
                    com.facebook.internal.instrument.crashshield.a.a(th3, this);
                    return null;
                }
            }
            return null;
        }
    }

    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:9:0x0018, B:86:0x0012, B:83:0x000e), top: B:3:0x0003, inners: #0 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static m a(Context context) {
            t tVar;
            t tVar2;
            Class<?> cls;
            Class<?> cls2;
            Class<?> cls3;
            Object obj;
            Object d;
            Object d2;
            synchronized (t.Companion) {
                if (!com.facebook.internal.instrument.crashshield.a.b(t.class)) {
                    try {
                        tVar = t.g;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, t.class);
                    }
                    if (tVar == null) {
                        tVar = t.a.a();
                    }
                    tVar2 = tVar;
                }
                tVar = null;
                if (tVar == null) {
                }
                tVar2 = tVar;
            }
            if (tVar2 == null) {
                return null;
            }
            Class<?> a = u.a("com.android.billingclient.api.BillingClient");
            Class<?> a2 = u.a("com.android.billingclient.api.Purchase");
            Class<?> a3 = u.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> a4 = u.a("com.android.billingclient.api.SkuDetails");
            Class<?> a5 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> a6 = u.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> a7 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a == null || a3 == null || a2 == null || a4 == null || a6 == null || a5 == null || a7 == null) {
                com.facebook.internal.instrument.crashshield.a.b(m.class);
                return null;
            }
            Method c = u.c(a, "queryPurchases", String.class);
            Method c2 = u.c(a3, "getPurchasesList", new Class[0]);
            Method c3 = u.c(a2, "getOriginalJson", new Class[0]);
            Method c4 = u.c(a4, "getOriginalJson", new Class[0]);
            Method c5 = u.c(a5, "getOriginalJson", new Class[0]);
            if (!com.facebook.internal.instrument.crashshield.a.b(tVar2)) {
                try {
                    cls = tVar2.a;
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, tVar2);
                }
                Method c6 = u.c(a, "querySkuDetailsAsync", cls, a6);
                Method c7 = u.c(a, "queryPurchaseHistoryAsync", String.class, a7);
                if (c != null || c2 == null || c3 == null || c4 == null || c5 == null || c6 == null || c7 == null) {
                    com.facebook.internal.instrument.crashshield.a.b(m.class);
                    return null;
                }
                Class<?> a8 = u.a("com.android.billingclient.api.BillingClient$Builder");
                Class<?> a9 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
                if (a8 == null || a9 == null) {
                    cls2 = a;
                    cls3 = a4;
                } else {
                    Method c8 = u.c(a, "newBuilder", Context.class);
                    Method c9 = u.c(a8, "enablePendingPurchases", new Class[0]);
                    Method c10 = u.c(a8, "setListener", a9);
                    cls3 = a4;
                    Method c11 = u.c(a8, "build", new Class[0]);
                    if (c8 == null || c9 == null || c10 == null || c11 == null || (d = u.d(c8, a, null, context)) == null) {
                        cls2 = a;
                    } else {
                        cls2 = a;
                        Object d3 = u.d(c10, a8, d, Proxy.newProxyInstance(a9.getClassLoader(), new Class[]{a9}, new d()));
                        if (d3 != null && (d2 = u.d(c9, a8, d3, new Object[0])) != null) {
                            obj = u.d(c11, a8, d2, new Object[0]);
                            if (obj != null) {
                                com.facebook.internal.instrument.crashshield.a.b(m.class);
                                return null;
                            }
                            m mVar = new m(obj, cls2, cls3, a5, a6, a7, c4, c5, c6, c7, tVar2);
                            if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                try {
                                    m.l = mVar;
                                } catch (Throwable th3) {
                                    com.facebook.internal.instrument.crashshield.a.a(th3, m.class);
                                }
                            }
                            if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                try {
                                    return m.l;
                                } catch (Throwable th4) {
                                    com.facebook.internal.instrument.crashshield.a.a(th4, m.class);
                                }
                            }
                            return null;
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                }
            }
            cls = null;
            Method c62 = u.c(a, "querySkuDetailsAsync", cls, a6);
            Method c72 = u.c(a, "queryPurchaseHistoryAsync", String.class, a7);
            if (c != null) {
            }
            com.facebook.internal.instrument.crashshield.a.b(m.class);
            return null;
        }

        public static ConcurrentHashMap b() {
            if (com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                return null;
            }
            try {
                return m.n;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, m.class);
                return null;
            }
        }

        public static ConcurrentHashMap c() {
            if (com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                return null;
            }
            try {
                return m.p;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, m.class);
                return null;
            }
        }

        public static ConcurrentHashMap d() {
            if (com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                return null;
            }
            try {
                return m.o;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, m.class);
                return null;
            }
        }
    }

    public final class c implements InvocationHandler {
        public final u.b a;
        public final Runnable b;
        public final /* synthetic */ m c;

        public c(m mVar, u.b skuType, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.c = mVar;
            this.a = skuType;
            this.b = completionHandler;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[Catch: all -> 0x002b, Exception -> 0x0042, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x000a, B:11:0x0025, B:13:0x0031, B:17:0x0037, B:18:0x0042, B:21:0x004e, B:23:0x0052, B:28:0x0062, B:31:0x0072, B:33:0x007d, B:36:0x0084, B:39:0x0090, B:46:0x00a1, B:42:0x00ae, B:59:0x006e, B:64:0x005e, B:67:0x00bb, B:70:0x00c3, B:85:0x00e0, B:88:0x00e4, B:73:0x00ca, B:80:0x00db), top: B:3:0x000a, inners: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(Object proxy, Method method, Object[] objArr) {
            final u.b bVar;
            final m mVar;
            Class<?> cls;
            Method method2;
            String str;
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method.getName(), "onPurchaseHistoryResponse")) {
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        final ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) orNull).iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            bVar = this.a;
                            mVar = this.c;
                            if (!hasNext) {
                                break;
                            }
                            Object next = it.next();
                            if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                try {
                                    cls = mVar.d;
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, m.class);
                                }
                                if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                    try {
                                        method2 = mVar.h;
                                    } catch (Throwable th2) {
                                        com.facebook.internal.instrument.crashshield.a.a(th2, m.class);
                                    }
                                    Object d = u.d(method2, cls, next, new Object[0]);
                                    str = d instanceof String ? (String) d : null;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String skuID = jSONObject.getString("productId");
                                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                            arrayList.add(skuID);
                                            if (bVar == u.b.INAPP) {
                                                m.Companion.getClass();
                                                b.b().put(skuID, jSONObject);
                                            } else {
                                                m.Companion.getClass();
                                                b.d().put(skuID, jSONObject);
                                            }
                                        }
                                    }
                                }
                                method2 = null;
                                Object d2 = u.d(method2, cls, next, new Object[0]);
                                if (d2 instanceof String) {
                                }
                                if (str != null) {
                                }
                            }
                            cls = null;
                            if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                            }
                            method2 = null;
                            Object d22 = u.d(method2, cls, next, new Object[0]);
                            if (d22 instanceof String) {
                            }
                            if (str != null) {
                            }
                        }
                        boolean isEmpty = arrayList.isEmpty();
                        final Runnable runnable = this.b;
                        if (isEmpty) {
                            runnable.run();
                            return;
                        }
                        if (com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                            return;
                        }
                        try {
                            if (com.facebook.internal.instrument.crashshield.a.b(mVar)) {
                                return;
                            }
                            try {
                                mVar.c(new Runnable() { // from class: com.facebook.appevents.iap.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        m this$0 = m.this;
                                        Class<?> cls2 = this$0.e;
                                        Runnable completionHandler = runnable;
                                        u.b skuType = bVar;
                                        ArrayList skuIDs = arrayList;
                                        if (com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                            return;
                                        }
                                        try {
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
                                            Intrinsics.checkNotNullParameter(skuType, "$skuType");
                                            Intrinsics.checkNotNullParameter(skuIDs, "$skuIDs");
                                            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new m.e(this$0, completionHandler));
                                            Object a = this$0.k.a(skuType, skuIDs);
                                            Class<?> cls3 = this$0.b;
                                            Method method3 = this$0.i;
                                            Object obj = null;
                                            if (!com.facebook.internal.instrument.crashshield.a.b(this$0)) {
                                                try {
                                                    obj = this$0.a;
                                                } catch (Throwable th3) {
                                                    com.facebook.internal.instrument.crashshield.a.a(th3, this$0);
                                                }
                                            }
                                            u.d(method3, cls3, obj, a, newProxyInstance);
                                        } catch (Throwable th4) {
                                            com.facebook.internal.instrument.crashshield.a.a(th4, m.class);
                                        }
                                    }
                                });
                            } catch (Throwable th3) {
                                com.facebook.internal.instrument.crashshield.a.a(th3, mVar);
                            }
                        } catch (Throwable th4) {
                            com.facebook.internal.instrument.crashshield.a.a(th4, m.class);
                        }
                    }
                }
            } catch (Throwable th5) {
                com.facebook.internal.instrument.crashshield.a.a(th5, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m, Object[] objArr) {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m, "m");
                return null;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {
        public final Runnable a;
        public final /* synthetic */ m b;

        public e(m mVar, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.b = mVar;
            this.a = completionHandler;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: all -> 0x002d, Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:22:0x0049, B:28:0x005b, B:31:0x006b, B:33:0x0076, B:36:0x007d, B:39:0x0089, B:53:0x0067, B:58:0x0057), top: B:21:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x007c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(Object proxy, Method m, Object[] objArr) {
            boolean b;
            m mVar;
            Class<?> cls;
            Method method;
            String str;
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m, "m");
                if (Intrinsics.areEqual(m.getName(), "onSkuDetailsResponse")) {
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        for (Object obj : (List) orNull) {
                            try {
                                b = com.facebook.internal.instrument.crashshield.a.b(m.class);
                                mVar = this.b;
                            } catch (Exception unused) {
                            }
                            if (!b) {
                                try {
                                    cls = mVar.c;
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, m.class);
                                }
                                if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                                    try {
                                        method = mVar.g;
                                    } catch (Throwable th2) {
                                        com.facebook.internal.instrument.crashshield.a.a(th2, m.class);
                                    }
                                    Object d = u.d(method, cls, obj, new Object[0]);
                                    str = d instanceof String ? (String) d : null;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String skuID = jSONObject.getString("productId");
                                            m.Companion.getClass();
                                            ConcurrentHashMap c = b.c();
                                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                            c.put(skuID, jSONObject);
                                        }
                                    }
                                }
                                method = null;
                                Object d2 = u.d(method, cls, obj, new Object[0]);
                                if (d2 instanceof String) {
                                }
                                if (str != null) {
                                }
                            }
                            cls = null;
                            if (!com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                            }
                            method = null;
                            Object d22 = u.d(method, cls, obj, new Object[0]);
                            if (d22 instanceof String) {
                            }
                            if (str != null) {
                            }
                        }
                        this.a.run();
                    }
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.a.a(th3, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
    }

    public m() {
        throw null;
    }

    public m(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, t tVar) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = method;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = tVar;
    }

    @Override // com.facebook.appevents.iap.j
    public final void a(final u.b productType, final Runnable completionHandler) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            c(new Runnable() { // from class: com.facebook.appevents.iap.k
                @Override // java.lang.Runnable
                public final void run() {
                    m this$0 = m.this;
                    Class<?> cls = this$0.f;
                    u.b productType2 = productType;
                    Runnable completionHandler2 = completionHandler;
                    if (com.facebook.internal.instrument.crashshield.a.b(m.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(productType2, "$productType");
                        Intrinsics.checkNotNullParameter(completionHandler2, "$completionHandler");
                        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new m.c(this$0, productType2, completionHandler2));
                        Class<?> cls2 = this$0.b;
                        Method method = this$0.j;
                        Object obj = null;
                        if (!com.facebook.internal.instrument.crashshield.a.b(this$0)) {
                            try {
                                obj = this$0.a;
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, this$0);
                            }
                        }
                        u.d(method, cls2, obj, productType2.a, newProxyInstance);
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, m.class);
                    }
                }
            });
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void c(Runnable runnable) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (m.get()) {
                runnable.run();
            } else {
                d(runnable);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void d(Runnable runnable) {
        Method c2;
        Class<?> cls = this.b;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Class<?> a2 = u.a("com.android.billingclient.api.BillingClientStateListener");
            if (a2 == null || (c2 = u.c(cls, "startConnection", a2)) == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new a(runnable));
            Object obj = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    obj = this.a;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            }
            u.d(c2, cls, obj, newProxyInstance);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }
}
