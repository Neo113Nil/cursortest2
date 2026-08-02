package androidx.lifecycle;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import M4.c;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5418g0 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Class<? extends Object>[] f43313f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f43314g = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f43315a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f43316b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f43317c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f43318d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final c.b f43319e;

    /* renamed from: androidx.lifecycle.g0$a */
    public static final class a {
        @NotNull
        public static C5418g0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C5418g0();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new C5418g0(hashMap);
            }
            ClassLoader classLoader = C5418g0.class.getClassLoader();
            Intrinsics.f(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = parcelableArrayList.get(i11);
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i11));
            }
            return new C5418g0(linkedHashMap);
        }
    }

    /* renamed from: androidx.lifecycle.g0$b */
    public static final class b<T> extends V<T> {
    }

    public C5418g0(@NotNull HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f43315a = linkedHashMap;
        this.f43316b = new LinkedHashMap();
        this.f43317c = new LinkedHashMap();
        this.f43318d = new LinkedHashMap();
        this.f43319e = new c.b() { // from class: androidx.lifecycle.f0
            @Override // M4.c.b
            public final Bundle saveState() {
                return C5418g0.a(C5418g0.this);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(C5418g0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.U.t(this$0.f43316b).entrySet()) {
            this$0.g(((c.b) entry.getValue()).saveState(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = this$0.f43315a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return androidx.core.os.d.b(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    public final void b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f43316b.remove(key);
    }

    public final <T> T c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.f43315a.get(key);
        } catch (ClassCastException unused) {
            e(key);
            return null;
        }
    }

    @NotNull
    public final M0 d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f43318d;
        Object obj = linkedHashMap.get(key);
        if (obj == null) {
            LinkedHashMap linkedHashMap2 = this.f43315a;
            if (!linkedHashMap2.containsKey(key)) {
                linkedHashMap2.put(key, null);
            }
            obj = O0.a(linkedHashMap2.get(key));
            linkedHashMap.put(key, obj);
            linkedHashMap.put(key, obj);
        }
        return C2399j.b((Ae.x0) obj);
    }

    public final void e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f43315a.remove(key);
        this.f43318d.remove(key);
    }

    @NotNull
    public final c.b f() {
        return this.f43319e;
    }

    public final void g(Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            Class<? extends Object>[] clsArr = f43313f;
            for (int i11 = 0; i11 < 29; i11++) {
                Class<? extends Object> cls = clsArr[i11];
                Intrinsics.f(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f43317c.get(key);
        V v11 = obj2 instanceof V ? (V) obj2 : null;
        if (v11 != null) {
            v11.setValue(obj);
        } else {
            this.f43315a.put(key, obj);
        }
        Ae.x0 x0Var = (Ae.x0) this.f43318d.get(key);
        if (x0Var == null) {
            return;
        }
        x0Var.setValue(obj);
    }

    public C5418g0() {
        this.f43315a = new LinkedHashMap();
        this.f43316b = new LinkedHashMap();
        this.f43317c = new LinkedHashMap();
        this.f43318d = new LinkedHashMap();
        this.f43319e = new c.b() { // from class: androidx.lifecycle.f0
            @Override // M4.c.b
            public final Bundle saveState() {
                return C5418g0.a(C5418g0.this);
            }
        };
    }
}
