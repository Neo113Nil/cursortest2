package androidx.lifecycle;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import o.C8620b;

/* loaded from: classes.dex */
public class T<T> extends V<T> {

    /* renamed from: a, reason: collision with root package name */
    private C8620b<P<?>, a<?>> f43246a;

    private static class a<V> implements W<V> {

        /* renamed from: a, reason: collision with root package name */
        final P<V> f43247a;

        /* renamed from: b, reason: collision with root package name */
        final W<? super V> f43248b;

        /* renamed from: c, reason: collision with root package name */
        int f43249c = -1;

        a(P<V> p11, W<? super V> w11) {
            this.f43247a = p11;
            this.f43248b = w11;
        }

        @Override // androidx.lifecycle.W
        public final void onChanged(V v11) {
            int i11 = this.f43249c;
            P<V> p11 = this.f43247a;
            if (i11 != p11.getVersion()) {
                this.f43249c = p11.getVersion();
                this.f43248b.onChanged(v11);
            }
        }
    }

    public T() {
        this.f43246a = new C8620b<>();
    }

    public <S> void a(@NonNull P<S> p11, @NonNull W<? super S> w11) {
        if (p11 == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(p11, w11);
        a<?> g10 = this.f43246a.g(p11, aVar);
        if (g10 != null && g10.f43248b != w11) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (g10 == null && hasActiveObservers()) {
            p11.observeForever(aVar);
        }
    }

    public final <S> void b(@NonNull P<S> p11) {
        a<?> h11 = this.f43246a.h(p11);
        if (h11 != null) {
            h11.f43247a.removeObserver(h11);
        }
    }

    @Override // androidx.lifecycle.P
    protected void onActive() {
        Iterator<Map.Entry<P<?>, a<?>>> it = this.f43246a.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.f43247a.observeForever(value);
        }
    }

    @Override // androidx.lifecycle.P
    protected void onInactive() {
        Iterator<Map.Entry<P<?>, a<?>>> it = this.f43246a.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.f43247a.removeObserver(value);
        }
    }

    public T(T t2) {
        super(t2);
        this.f43246a = new C8620b<>();
    }
}
