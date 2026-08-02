package O1;

import S1.p;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f19831a = new p();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap<K, V> f19832b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet<K> f19833c;

    /* renamed from: d, reason: collision with root package name */
    private int f19834d;

    /* renamed from: e, reason: collision with root package name */
    private int f19835e;

    /* renamed from: f, reason: collision with root package name */
    private int f19836f;

    /* renamed from: g, reason: collision with root package name */
    private int f19837g;

    public b(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f19835e = i11;
        this.f19832b = new HashMap<>(0, 0.75f);
        this.f19833c = new LinkedHashSet<>();
    }

    public final V a(K k11) {
        synchronized (this.f19831a) {
            V v11 = this.f19832b.get(k11);
            if (v11 == null) {
                this.f19837g++;
                return null;
            }
            this.f19833c.remove(k11);
            this.f19833c.add(k11);
            this.f19836f++;
            return v11;
        }
    }

    public final V b(K k11, V v11) {
        V put;
        Object obj;
        V v12;
        if (k11 == null) {
            throw null;
        }
        synchronized (this.f19831a) {
            try {
                this.f19834d = d() + 1;
                put = this.f19832b.put(k11, v11);
                if (put != null) {
                    this.f19834d = d() - 1;
                }
                if (this.f19833c.contains(k11)) {
                    this.f19833c.remove(k11);
                }
                this.f19833c.add(k11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i11 = this.f19835e;
        while (true) {
            synchronized (this.f19831a) {
                try {
                    if (d() >= 0) {
                        if (this.f19832b.isEmpty() && d() != 0) {
                            break;
                        }
                        if (this.f19832b.isEmpty() != this.f19833c.isEmpty()) {
                            break;
                        }
                        if (d() <= i11 || this.f19832b.isEmpty()) {
                            obj = null;
                            v12 = null;
                        } else {
                            obj = C7714v.J(this.f19833c);
                            v12 = this.f19832b.get(obj);
                            if (v12 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            U.d(this.f19832b).remove(obj);
                            LinkedHashSet<K> linkedHashSet = this.f19833c;
                            U.a(linkedHashSet);
                            linkedHashSet.remove(obj);
                            int d11 = d();
                            Intrinsics.f(obj);
                            this.f19834d = d11 - 1;
                        }
                        Unit unit = Unit.f71690a;
                    } else {
                        break;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (obj == null && v12 == null) {
                return put;
            }
            Intrinsics.f(obj);
            Intrinsics.f(v12);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public final V c(K k11) {
        V remove;
        synchronized (this.f19831a) {
            try {
                remove = this.f19832b.remove(k11);
                this.f19833c.remove(k11);
                if (remove != null) {
                    this.f19834d = d() - 1;
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return remove;
    }

    public final int d() {
        int i11;
        synchronized (this.f19831a) {
            i11 = this.f19834d;
        }
        return i11;
    }

    @NotNull
    public final String toString() {
        String str;
        synchronized (this.f19831a) {
            try {
                int i11 = this.f19836f;
                int i12 = this.f19837g + i11;
                str = "LruCache[maxSize=" + this.f19835e + ",hits=" + this.f19836f + ",misses=" + this.f19837g + ",hitRate=" + (i12 != 0 ? (i11 * 100) / i12 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
