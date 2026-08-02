package Z5;

import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ozon.app.android.pikazon.glide.loaders.ResizeUrlLoader;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final t f35545a;

    /* renamed from: b, reason: collision with root package name */
    private final a f35546b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f35547a = new HashMap();

        /* renamed from: Z5.r$a$a, reason: collision with other inner class name */
        private static class C0670a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<p<Model, ?>> f35548a;

            public C0670a(List<p<Model, ?>> list) {
                this.f35548a = list;
            }
        }

        a() {
        }

        public final void a() {
            this.f35547a.clear();
        }

        public final <Model> List<p<Model, ?>> b(Class<Model> cls) {
            C0670a c0670a = (C0670a) this.f35547a.get(cls);
            if (c0670a == null) {
                return null;
            }
            return c0670a.f35548a;
        }

        public final <Model> void c(Class<Model> cls, List<p<Model, ?>> list) {
            if (((C0670a) this.f35547a.put(cls, new C0670a(list))) != null) {
                throw new IllegalStateException(U7.m.a(cls, "Already cached loaders for model: "));
            }
        }
    }

    public r(@NonNull x2.f<List<Throwable>> fVar) {
        t tVar = new t(fVar);
        this.f35546b = new a();
        this.f35545a = tVar;
    }

    public final synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull q<? extends Model, ? extends Data> qVar) {
        this.f35545a.a(cls, cls2, qVar);
        this.f35546b.a();
    }

    @NonNull
    public final synchronized ArrayList b(@NonNull Class cls) {
        return this.f35545a.e(cls);
    }

    @NonNull
    public final <A> List<p<A, ?>> c(@NonNull A a11) {
        List b11;
        Class<?> cls = a11.getClass();
        synchronized (this) {
            b11 = this.f35546b.b(cls);
            if (b11 == null) {
                b11 = Collections.unmodifiableList(this.f35545a.d(cls));
                this.f35546b.c(cls, b11);
            }
        }
        if (b11.isEmpty()) {
            throw new j.c(a11);
        }
        int size = b11.size();
        List<p<A, ?>> list = Collections.EMPTY_LIST;
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            p<A, ?> pVar = (p) b11.get(i11);
            if (pVar.handles(a11)) {
                if (z11) {
                    list = new ArrayList<>(size - i11);
                    z11 = false;
                }
                list.add(pVar);
            }
        }
        if (list.isEmpty()) {
            throw new j.c(a11, (List<p<A, ?>>) b11);
        }
        return list;
    }

    public final synchronized void d(@NonNull ResizeUrlLoader.Factory factory) {
        ArrayList f7;
        t tVar = this.f35545a;
        synchronized (tVar) {
            f7 = tVar.f();
            tVar.a(h.class, InputStream.class, factory);
        }
        Iterator it = f7.iterator();
        while (it.hasNext()) {
            ((q) it.next()).teardown();
        }
        this.f35546b.a();
    }
}
