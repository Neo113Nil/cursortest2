package androidx.compose.material3.internal;

import Q0.InterfaceC3831c;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class t<T> implements InterfaceC3831c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f40318a;

    public t(@NotNull Map<T, Float> map) {
        this.f40318a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q0.InterfaceC3831c
    public final T a(float f7, boolean z11) {
        T next;
        Iterator<T> it = this.f40318a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f11 = z11 ? floatValue - f7 : f7 - floatValue;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f12 = z11 ? floatValue2 - f7 : f7 - floatValue2;
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q0.InterfaceC3831c
    public final T b(float f7) {
        T next;
        Iterator<T> it = this.f40318a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f7 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f7 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q0.InterfaceC3831c
    public final boolean c(T t2) {
        return this.f40318a.containsKey(t2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q0.InterfaceC3831c
    public final float d() {
        Float i02 = C7714v.i0(this.f40318a.values());
        if (i02 != null) {
            return i02.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q0.InterfaceC3831c
    public final float e(T t2) {
        Float f7 = (Float) this.f40318a.get(t2);
        if (f7 != null) {
            return f7.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return Intrinsics.d(this.f40318a, ((t) obj).f40318a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q0.InterfaceC3831c
    public final float f() {
        Float e02 = C7714v.e0(this.f40318a.values());
        if (e02 != null) {
            return e02.floatValue();
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return this.f40318a.hashCode() * 31;
    }

    @NotNull
    public final String toString() {
        return "MapDraggableAnchors(" + this.f40318a + ')';
    }
}
