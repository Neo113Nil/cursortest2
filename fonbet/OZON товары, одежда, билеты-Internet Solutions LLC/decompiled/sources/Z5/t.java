package Z5;

import Z5.p;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    private static final c f35558e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final p<Object, Object> f35559f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f35560a;

    /* renamed from: b, reason: collision with root package name */
    private final c f35561b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f35562c;

    /* renamed from: d, reason: collision with root package name */
    private final x2.f<List<Throwable>> f35563d;

    private static class a implements p<Object, Object> {
        @Override // Z5.p
        public final p.a<Object> buildLoadData(@NonNull Object obj, int i11, int i12, @NonNull T5.i iVar) {
            return null;
        }

        @Override // Z5.p
        public final boolean handles(@NonNull Object obj) {
            return false;
        }
    }

    private static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Model> f35564a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f35565b;

        /* renamed from: c, reason: collision with root package name */
        final q<? extends Model, ? extends Data> f35566c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull q<? extends Model, ? extends Data> qVar) {
            this.f35564a = cls;
            this.f35565b = cls2;
            this.f35566c = qVar;
        }

        public final boolean a(@NonNull Class<?> cls) {
            return this.f35564a.isAssignableFrom(cls);
        }

        public final boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f35564a.isAssignableFrom(cls) && this.f35565b.isAssignableFrom(cls2);
        }
    }

    static class c {
    }

    public t(@NonNull x2.f<List<Throwable>> fVar) {
        c cVar = f35558e;
        this.f35560a = new ArrayList();
        this.f35562c = new HashSet();
        this.f35563d = fVar;
        this.f35561b = cVar;
    }

    @NonNull
    private <Model, Data> p<Model, Data> b(@NonNull b<?, ?> bVar) {
        p<Model, Data> pVar = (p<Model, Data>) bVar.f35566c.build(this);
        p6.k.c(pVar, "Argument must not be null");
        return pVar;
    }

    final synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull q<? extends Model, ? extends Data> qVar) {
        b bVar = new b(cls, cls2, qVar);
        ArrayList arrayList = this.f35560a;
        arrayList.add(arrayList.size(), bVar);
    }

    @NonNull
    public final synchronized <Model, Data> p<Model, Data> c(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f35560a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                b<?, ?> bVar = (b) it.next();
                if (this.f35562c.contains(bVar)) {
                    z11 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f35562c.add(bVar);
                    arrayList.add(b(bVar));
                    this.f35562c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f35561b;
                x2.f<List<Throwable>> fVar = this.f35563d;
                cVar.getClass();
                return new s(arrayList, fVar);
            }
            if (arrayList.size() == 1) {
                return (p) arrayList.get(0);
            }
            if (!z11) {
                throw new j.c((Class<?>) cls, (Class<?>) cls2);
            }
            return (p<Model, Data>) f35559f;
        } catch (Throwable th2) {
            this.f35562c.clear();
            throw th2;
        }
    }

    @NonNull
    final synchronized ArrayList d(@NonNull Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f35560a.iterator();
            while (it.hasNext()) {
                b<?, ?> bVar = (b) it.next();
                if (!this.f35562c.contains(bVar) && bVar.a(cls)) {
                    this.f35562c.add(bVar);
                    arrayList.add(b(bVar));
                    this.f35562c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @NonNull
    final synchronized ArrayList e(@NonNull Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f35560a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f35565b) && bVar.a(cls)) {
                arrayList.add(bVar.f35565b);
            }
        }
        return arrayList;
    }

    @NonNull
    final synchronized ArrayList f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f35560a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b(h.class, InputStream.class)) {
                it.remove();
                arrayList.add(bVar.f35566c);
            }
        }
        return arrayList;
    }
}
