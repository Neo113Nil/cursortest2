package B4;

import B4.W;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: B4.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2578g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W<Object> f2624a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2625b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2626c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2627d;

    /* renamed from: B4.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private W<Object> f2628a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2629b;

        /* renamed from: c, reason: collision with root package name */
        private Object f2630c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2631d;

        @NotNull
        public final C2578g a() {
            W uVar;
            W w11 = this.f2628a;
            if (w11 == null) {
                Object obj = this.f2630c;
                if (obj instanceof Integer) {
                    w11 = W.f2575b;
                } else if (obj instanceof int[]) {
                    w11 = W.f2577d;
                } else if (obj instanceof Long) {
                    w11 = W.f2579f;
                } else if (obj instanceof long[]) {
                    w11 = W.f2580g;
                } else if (obj instanceof Float) {
                    w11 = W.f2582i;
                } else if (obj instanceof float[]) {
                    w11 = W.f2583j;
                } else if (obj instanceof Boolean) {
                    w11 = W.f2585l;
                } else if (obj instanceof boolean[]) {
                    w11 = W.f2586m;
                } else if ((obj instanceof String) || obj == null) {
                    w11 = W.f2588o;
                } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    w11 = W.f2589p;
                } else {
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        Intrinsics.f(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            Intrinsics.g(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            uVar = new W.r(componentType2);
                            w11 = uVar;
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        Intrinsics.f(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            Intrinsics.g(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            uVar = new W.t(componentType4);
                            w11 = uVar;
                        }
                    }
                    if (obj instanceof Parcelable) {
                        uVar = new W.s(obj.getClass());
                    } else if (obj instanceof Enum) {
                        uVar = new W.q(obj.getClass());
                    } else {
                        if (!(obj instanceof Serializable)) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        uVar = new W.u(obj.getClass());
                    }
                    w11 = uVar;
                }
            }
            return new C2578g(w11, this.f2629b, this.f2630c, this.f2631d);
        }

        @NotNull
        public final void b(Object obj) {
            this.f2630c = obj;
            this.f2631d = true;
        }

        @NotNull
        public final void c(boolean z11) {
            this.f2629b = z11;
        }

        @NotNull
        public final void d(@NotNull W type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f2628a = type;
        }
    }

    public C2578g(@NotNull W type, boolean z11, Object obj, boolean z12) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.c() && z11) {
            throw new IllegalArgumentException(type.b().concat(" does not allow nullable values").toString());
        }
        if (!z11 && z12 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f2624a = type;
        this.f2625b = z11;
        this.f2627d = obj;
        this.f2626c = z12;
    }

    @NotNull
    public final W<Object> a() {
        return this.f2624a;
    }

    public final boolean b() {
        return this.f2626c;
    }

    public final boolean c() {
        return this.f2625b;
    }

    public final void d(@NotNull Bundle bundle, @NotNull String name) {
        Object obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f2626c || (obj = this.f2627d) == null) {
            return;
        }
        this.f2624a.f(bundle, name, obj);
    }

    public final boolean e(@NotNull Bundle bundle, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f2625b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f2624a.a(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2578g.class.equals(obj.getClass())) {
            C2578g c2578g = (C2578g) obj;
            if (this.f2625b != c2578g.f2625b || this.f2626c != c2578g.f2626c || !Intrinsics.d(this.f2624a, c2578g.f2624a)) {
                return false;
            }
            Object obj2 = c2578g.f2627d;
            Object obj3 = this.f2627d;
            if (obj3 != null) {
                return Intrinsics.d(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f2624a.hashCode() * 31) + (this.f2625b ? 1 : 0)) * 31) + (this.f2626c ? 1 : 0)) * 31;
        Object obj = this.f2627d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2578g.class.getSimpleName());
        sb2.append(" Type: " + this.f2624a);
        sb2.append(" Nullable: " + this.f2625b);
        if (this.f2626c) {
            sb2.append(" DefaultValue: " + this.f2627d);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
