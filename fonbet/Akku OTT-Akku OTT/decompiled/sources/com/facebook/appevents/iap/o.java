package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.iap.o.b;
import com.facebook.appevents.iap.u;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class o implements j {
    public static o H;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;
    public final Object a;
    public final Class<?> b;
    public final Class<?> c;
    public final Class<?> d;
    public final Class<?> e;
    public final Class<?> f;
    public final Class<?> g;
    public final Class<?> h;
    public final Class<?> i;
    public final Class<?> j;
    public final Class<?> k;
    public final Class<?> l;
    public final Class<?> m;
    public final Class<?> n;
    public final Class<?> o;
    public final Method p;
    public final Method q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;
    public final Method w;
    public final Method x;
    public final Method y;
    public final Method z;
    public static final a Companion = new a();
    public static final AtomicBoolean G = new AtomicBoolean(false);
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public static final ConcurrentHashMap K = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        /* JADX WARN: Removed duplicated region for block: B:52:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0229  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final o a(Context context) {
            Class<?> cls;
            Object obj;
            Class<?> a = u.a("com.android.billingclient.api.BillingClient");
            Class<?> a2 = u.a("com.android.billingclient.api.Purchase");
            Class<?> a3 = u.a("com.android.billingclient.api.ProductDetails");
            Class<?> a4 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> a5 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class<?> a6 = u.a("com.android.billingclient.api.BillingResult");
            Class<?> a7 = u.a("com.android.billingclient.api.QueryProductDetailsParams");
            Class<?> a8 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class<?> a9 = u.a("com.android.billingclient.api.QueryPurchasesParams");
            Class<?> a10 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class<?> a11 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class<?> a12 = u.a("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class<?> a13 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class<?> a14 = u.a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> a15 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
            Class<?> a16 = u.a("com.android.billingclient.api.BillingClientStateListener");
            Class<?> a17 = u.a("com.android.billingclient.api.ProductDetailsResponseListener");
            Class<?> a18 = u.a("com.android.billingclient.api.PurchasesResponseListener");
            Class<?> a19 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a == null || a2 == null || a3 == null || a4 == null || a5 == null || a6 == null || a7 == null || a8 == null || a9 == null || a10 == null || a11 == null || a12 == null || a13 == null || a14 == null || a15 == null || a16 == null || a17 == null || a18 == null || a19 == null) {
                com.facebook.internal.instrument.crashshield.a.b(o.class);
                return null;
            }
            Method c = u.c(a, "queryPurchasesAsync", a9, a18);
            Method c2 = u.c(a9, "newBuilder", new Class[0]);
            Method c3 = u.c(a12, "build", new Class[0]);
            Method c4 = u.c(a12, "setProductType", String.class);
            Method c5 = u.c(a2, "getOriginalJson", new Class[0]);
            Method c6 = u.c(a, "queryPurchaseHistoryAsync", a8, a19);
            Method c7 = u.c(a8, "newBuilder", new Class[0]);
            Method c8 = u.c(a11, "build", new Class[0]);
            Method c9 = u.c(a11, "setProductType", String.class);
            Method c10 = u.c(a4, "getOriginalJson", new Class[0]);
            Method c11 = u.c(a, "queryProductDetailsAsync", a7, a17);
            Method c12 = u.c(a7, "newBuilder", new Class[0]);
            Method c13 = u.c(a10, "build", new Class[0]);
            Method c14 = u.c(a10, "setProductList", List.class);
            Method c15 = u.c(a5, "newBuilder", new Class[0]);
            Method c16 = u.c(a13, "build", new Class[0]);
            Method c17 = u.c(a13, "setProductId", String.class);
            Method c18 = u.c(a13, "setProductType", String.class);
            Method c19 = u.c(a3, "toString", new Class[0]);
            Method c20 = u.c(a, "startConnection", a16);
            Method c21 = u.c(a6, "getResponseCode", new Class[0]);
            if (c == null || c2 == null || c3 == null || c4 == null || c5 == null || c6 == null || c7 == null || c8 == null || c9 == null || c10 == null || c11 == null || c12 == null || c13 == null || c14 == null || c15 == null || c16 == null || c17 == null || c18 == null || c19 == null || c20 == null || c21 == null) {
                com.facebook.internal.instrument.crashshield.a.b(o.class);
                return null;
            }
            Method c22 = u.c(a, "newBuilder", Context.class);
            Method c23 = u.c(a14, "setListener", a15);
            Method c24 = u.c(a14, "enablePendingPurchases", new Class[0]);
            Method c25 = u.c(a14, "build", new Class[0]);
            if (c25 == null || c23 == null || c22 == null || c24 == null) {
                cls = a;
            } else {
                cls = a;
                Object d = u.d(c23, a14, u.d(c22, a, null, context), Proxy.newProxyInstance(a15.getClassLoader(), new Class[]{a15}, this));
                if (d != null) {
                    obj = u.d(c25, a14, u.d(c24, a14, d, new Object[0]), new Object[0]);
                    if (obj != null) {
                        com.facebook.internal.instrument.crashshield.a.b(o.class);
                        return null;
                    }
                    o oVar = new o(obj, cls, a2, a3, a4, a5, a6, a7, a8, a10, a11, a13, a16, a17, a19, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21);
                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            o.H = oVar;
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, o.class);
                        }
                    }
                    if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            return o.H;
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.a.a(th2, o.class);
                        }
                    }
                    return null;
                }
            }
            obj = null;
            if (obj != null) {
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m, "m");
            return null;
        }
    }

    public final class b implements InvocationHandler {
        public final Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m, "m");
            String name = m.getName();
            if (name == null) {
                return null;
            }
            int hashCode = name.hashCode();
            Object[] objArr2 = this.a;
            o oVar = o.this;
            switch (hashCode) {
                case -1642587947:
                    if (name.equals("onPurchaseHistoryResponse") && !com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            oVar.h(objArr2, objArr);
                            break;
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, o.class);
                            return null;
                        }
                    }
                    break;
                case -1599362358:
                    if (name.equals("onQueryPurchasesResponse") && !com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            oVar.i(objArr2, objArr);
                            break;
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.a.a(th2, o.class);
                            return null;
                        }
                    }
                    break;
                case -79406125:
                    if (name.equals("onBillingSetupFinished") && !com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            oVar.f(objArr2, objArr);
                            break;
                        } catch (Throwable th3) {
                            com.facebook.internal.instrument.crashshield.a.a(th3, o.class);
                            return null;
                        }
                    }
                    break;
                case 1227540564:
                    if (name.equals("onBillingServiceDisconnected") && !com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            if (!com.facebook.internal.instrument.crashshield.a.b(oVar)) {
                                try {
                                    o.G.set(false);
                                } catch (Throwable th4) {
                                    com.facebook.internal.instrument.crashshield.a.a(th4, oVar);
                                }
                            }
                            break;
                        } catch (Throwable th5) {
                            com.facebook.internal.instrument.crashshield.a.a(th5, o.class);
                            return null;
                        }
                    }
                    break;
                case 1940131955:
                    if (name.equals("onProductDetailsResponse") && !com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        try {
                            oVar.g(objArr2, objArr);
                            break;
                        } catch (Throwable th6) {
                            com.facebook.internal.instrument.crashshield.a.a(th6, o.class);
                            return null;
                        }
                    }
                    break;
            }
            return null;
        }
    }

    public o() {
        throw null;
    }

    public o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = cls6;
        this.h = cls7;
        this.i = cls8;
        this.j = cls9;
        this.k = cls10;
        this.l = cls11;
        this.m = cls12;
        this.n = cls13;
        this.o = cls14;
        this.p = method;
        this.q = method2;
        this.r = method3;
        this.s = method4;
        this.t = method5;
        this.u = method6;
        this.v = method7;
        this.w = method8;
        this.x = method9;
        this.y = method10;
        this.z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    @Override // com.facebook.appevents.iap.j
    public final void a(final u.b productType, final Runnable completionHandler) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            c(new Runnable() { // from class: com.facebook.appevents.iap.n
                /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Object obj;
                    o this$0 = o.this;
                    Class<?> cls = this$0.o;
                    u.b productType2 = productType;
                    Runnable completionHandler2 = completionHandler;
                    if (com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(productType2, "$productType");
                        Intrinsics.checkNotNullParameter(completionHandler2, "$completionHandler");
                        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this$0.new b(new Object[]{productType2, completionHandler2}));
                        Class<?> cls2 = this$0.b;
                        Method method = this$0.q;
                        Object obj2 = null;
                        if (!com.facebook.internal.instrument.crashshield.a.b(this$0)) {
                            try {
                                obj = this$0.a;
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, this$0);
                            }
                            Class<?> cls3 = this$0.k;
                            if (!com.facebook.internal.instrument.crashshield.a.b(this$0)) {
                                try {
                                    obj2 = u.d(this$0.s, cls3, u.d(this$0.t, cls3, u.d(this$0.r, this$0.i, null, new Object[0]), productType2.a), new Object[0]);
                                } catch (Throwable th2) {
                                    com.facebook.internal.instrument.crashshield.a.a(th2, this$0);
                                }
                            }
                            u.d(method, cls2, obj, obj2, newProxyInstance);
                        }
                        obj = null;
                        Class<?> cls32 = this$0.k;
                        if (!com.facebook.internal.instrument.crashshield.a.b(this$0)) {
                        }
                        u.d(method, cls2, obj, obj2, newProxyInstance);
                    } catch (Throwable th3) {
                        com.facebook.internal.instrument.crashshield.a.a(th3, o.class);
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
            if (G.get()) {
                runnable.run();
                return;
            }
            Class<?> cls = this.m;
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(new Object[]{runnable}));
                Class<?> cls2 = this.b;
                Method method = this.E;
                Object obj = null;
                if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                    try {
                        obj = this.a;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, this);
                    }
                }
                u.d(method, cls2, obj, newProxyInstance);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, this);
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.a.a(th3, this);
        }
    }

    public final String d(String productDetailsString) {
        List<String> groupValues;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Intrinsics.checkNotNullParameter(productDetailsString, "productDetailsString");
                MatchResult find$default = Regex.find$default(new Regex("jsonString='(.*?)'"), productDetailsString, 0, 2, null);
                if (find$default != null && (groupValues = find$default.getGroupValues()) != null) {
                    return (String) CollectionsKt.getOrNull(groupValues, 1);
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final Object e(u.b bVar, ArrayList arrayList) {
        Class<?> cls = this.j;
        Class<?> cls2 = this.l;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        Object d = u.d(this.A, cls2, u.d(this.C, cls2, u.d(this.B, cls2, u.d(this.z, this.f, null, new Object[0]), str), bVar.a), new Object[0]);
                        if (d != null) {
                            arrayList2.add(d);
                        }
                    }
                    return u.d(this.x, cls, u.d(this.y, cls, u.d(this.w, this.h, null, new Object[0]), arrayList2), new Object[0]);
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final void f(Object[] objArr, Object[] objArr2) {
        Runnable runnable;
        if (com.facebook.internal.instrument.crashshield.a.b(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (Intrinsics.areEqual(u.d(this.F, this.g, objArr2[0], new Object[0]), (Object) 0)) {
                G.set(true);
                if (objArr.length == 0) {
                    return;
                }
                Object obj = objArr[0];
                if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
                    return;
                }
                runnable.run();
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void g(Object[] objArr, Object[] objArr2) {
        String d;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Object orNull = ArraysKt.getOrNull(objArr, 0);
            Object orNull2 = objArr2 != null ? ArraysKt.getOrNull(objArr2, 1) : null;
            if (orNull2 != null && (orNull2 instanceof List)) {
                Iterator it = ((List) orNull2).iterator();
                while (it.hasNext()) {
                    try {
                        Object d2 = u.d(this.D, this.d, it.next(), new Object[0]);
                        String str = d2 instanceof String ? (String) d2 : null;
                        if (str != null && (d = d(str)) != null) {
                            JSONObject jSONObject = new JSONObject(d);
                            if (jSONObject.has("productId")) {
                                String productId = jSONObject.getString("productId");
                                ConcurrentHashMap concurrentHashMap = K;
                                Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                concurrentHashMap.put(productId, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (orNull == null || !(orNull instanceof Runnable)) {
                    return;
                }
                ((Runnable) orNull).run();
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void h(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object orNull;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Object orNull2 = ArraysKt.getOrNull(objArr, 0);
                if (orNull2 != null && (orNull2 instanceof u.b)) {
                    Object orNull3 = ArraysKt.getOrNull(objArr, 1);
                    if (orNull3 instanceof Runnable) {
                        if (objArr2 != null) {
                            try {
                                orNull = ArraysKt.getOrNull(objArr2, 1);
                            } catch (Throwable th2) {
                                th = th2;
                                com.facebook.internal.instrument.crashshield.a.a(th, this);
                            }
                        } else {
                            orNull = null;
                        }
                        if (orNull != null && (orNull instanceof List)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((List) orNull).iterator();
                            while (it.hasNext()) {
                                try {
                                    Object d = u.d(this.u, this.e, it.next(), new Object[0]);
                                    String str = d instanceof String ? (String) d : null;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String productId = jSONObject.getString("productId");
                                            if (!K.containsKey(productId)) {
                                                Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                                arrayList.add(productId);
                                            }
                                            if (orNull2 == u.b.INAPP) {
                                                ConcurrentHashMap concurrentHashMap = I;
                                                Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                                concurrentHashMap.put(productId, jSONObject);
                                            } else {
                                                ConcurrentHashMap concurrentHashMap2 = J;
                                                Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                                concurrentHashMap2.put(productId, jSONObject);
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                if (arrayList.isEmpty()) {
                                    ((Runnable) orNull3).run();
                                } else {
                                    u.b bVar = (u.b) orNull2;
                                    Runnable runnable = (Runnable) orNull3;
                                    if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                                        try {
                                            try {
                                                c(new com.csdcorp.speech_to_text.a(1, this, runnable, bVar, arrayList));
                                            } catch (Throwable th3) {
                                                th = th3;
                                                com.facebook.internal.instrument.crashshield.a.a(th, this);
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                com.facebook.internal.instrument.crashshield.a.a(th, this);
                            }
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public final void i(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object orNull;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Object orNull2 = ArraysKt.getOrNull(objArr, 0);
                if (orNull2 != null && (orNull2 instanceof u.b)) {
                    Object orNull3 = ArraysKt.getOrNull(objArr, 1);
                    if (orNull3 instanceof Runnable) {
                        if (objArr2 != null) {
                            try {
                                orNull = ArraysKt.getOrNull(objArr2, 1);
                            } catch (Throwable th2) {
                                th = th2;
                                com.facebook.internal.instrument.crashshield.a.a(th, this);
                            }
                        } else {
                            orNull = null;
                        }
                        if (orNull != null && (orNull instanceof List)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((List) orNull).iterator();
                            while (it.hasNext()) {
                                Object d = u.d(this.p, this.c, it.next(), new Object[0]);
                                String str = d instanceof String ? (String) d : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String productId = jSONObject.getString("productId");
                                        if (!K.containsKey(productId)) {
                                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                            arrayList.add(productId);
                                        }
                                        if (orNull2 == u.b.INAPP) {
                                            ConcurrentHashMap concurrentHashMap = I;
                                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                            concurrentHashMap.put(productId, jSONObject);
                                        } else {
                                            ConcurrentHashMap concurrentHashMap2 = J;
                                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                            concurrentHashMap2.put(productId, jSONObject);
                                        }
                                    }
                                }
                            }
                            try {
                                if (arrayList.isEmpty()) {
                                    ((Runnable) orNull3).run();
                                    return;
                                }
                                u.b bVar = (u.b) orNull2;
                                Runnable runnable = (Runnable) orNull3;
                                if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                                    try {
                                        try {
                                            c(new com.csdcorp.speech_to_text.a(1, this, runnable, bVar, arrayList));
                                        } catch (Throwable th3) {
                                            th = th3;
                                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                com.facebook.internal.instrument.crashshield.a.a(th, this);
                            }
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }
}
