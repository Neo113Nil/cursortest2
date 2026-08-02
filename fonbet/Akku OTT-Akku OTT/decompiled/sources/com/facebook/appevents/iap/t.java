package com.facebook.appevents.iap;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.iap.u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class t {
    public static final a Companion = new a();
    public static t g;
    public final Class<?> a;
    public final Class<?> b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;

    public static final class a {
        public static t a() {
            Class<?> a = u.a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> a2 = u.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a == null || a2 == null) {
                return null;
            }
            Method c = u.c(a, "newBuilder", new Class[0]);
            Method c2 = u.c(a2, "setType", String.class);
            Method c3 = u.c(a2, "setSkusList", List.class);
            Method c4 = u.c(a2, "build", new Class[0]);
            if (c == null || c2 == null || c3 == null || c4 == null) {
                return null;
            }
            t tVar = new t(a, a2, c, c2, c3, c4);
            if (!com.facebook.internal.instrument.crashshield.a.b(t.class)) {
                try {
                    t.g = tVar;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, t.class);
                }
            }
            if (com.facebook.internal.instrument.crashshield.a.b(t.class)) {
                return null;
            }
            try {
                return t.g;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, t.class);
                return null;
            }
        }
    }

    public t(Class<?> skuDetailsParamsClazz, Class<?> builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.a = skuDetailsParamsClazz;
        this.b = builderClazz;
        this.c = newBuilderMethod;
        this.d = setTypeMethod;
        this.e = setSkusListMethod;
        this.f = buildMethod;
    }

    public final Object a(u.b productType, ArrayList arrayList) {
        Object d;
        Object d2;
        Class<?> cls = this.b;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Intrinsics.checkNotNullParameter(productType, "productType");
                Object d3 = u.d(this.c, this.a, null, new Object[0]);
                if (d3 != null && (d = u.d(this.d, cls, d3, productType.a)) != null && (d2 = u.d(this.e, cls, d, arrayList)) != null) {
                    return u.d(this.f, cls, d2, new Object[0]);
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }
}
