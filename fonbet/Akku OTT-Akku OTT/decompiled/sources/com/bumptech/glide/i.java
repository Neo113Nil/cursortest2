package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.f;
import com.bumptech.glide.provider.a;
import com.bumptech.glide.provider.e;
import com.bumptech.glide.provider.f;
import com.bumptech.glide.util.pool.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class i {
    public final ModelLoaderRegistry a;
    public final com.bumptech.glide.provider.a b;
    public final com.bumptech.glide.provider.e c;
    public final com.bumptech.glide.provider.f d;
    public final com.bumptech.glide.load.data.f e;
    public final com.bumptech.glide.load.resource.transcode.f f;
    public final com.bumptech.glide.provider.b g;
    public final com.bumptech.glide.provider.d h = new com.bumptech.glide.provider.d();
    public final com.bumptech.glide.provider.c i = new com.bumptech.glide.provider.c();
    public final a.c j;

    public static class a extends RuntimeException {
    }

    public static final class b extends a {
    }

    public static class c extends a {
    }

    public static class d extends a {
        public d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
    }

    public i() {
        a.c cVar = new a.c(new Pools.SynchronizedPool(20), new com.bumptech.glide.util.pool.b(), new com.bumptech.glide.util.pool.c());
        this.j = cVar;
        this.a = new ModelLoaderRegistry(cVar);
        this.b = new com.bumptech.glide.provider.a();
        this.c = new com.bumptech.glide.provider.e();
        this.d = new com.bumptech.glide.provider.f();
        this.e = new com.bumptech.glide.load.data.f();
        this.f = new com.bumptech.glide.load.resource.transcode.f();
        this.g = new com.bumptech.glide.provider.b();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        com.bumptech.glide.provider.e eVar = this.c;
        synchronized (eVar) {
            try {
                ArrayList arrayList2 = new ArrayList(eVar.a);
                eVar.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    eVar.a.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        eVar.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public final void a(@NonNull Class cls, @NonNull com.bumptech.glide.load.d dVar) {
        com.bumptech.glide.provider.a aVar = this.b;
        synchronized (aVar) {
            aVar.a.add(new a.C0065a(cls, dVar));
        }
    }

    @NonNull
    public final void b(@NonNull Class cls, @NonNull com.bumptech.glide.load.l lVar) {
        com.bumptech.glide.provider.f fVar = this.d;
        synchronized (fVar) {
            fVar.a.add(new f.a(cls, lVar));
        }
    }

    @NonNull
    public final void c(@NonNull String str, @NonNull Class cls, @NonNull Class cls2, @NonNull com.bumptech.glide.load.k kVar) {
        com.bumptech.glide.provider.e eVar = this.c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a<>(cls, cls2, kVar));
        }
    }

    @NonNull
    public final ArrayList d() {
        ArrayList arrayList;
        com.bumptech.glide.provider.b bVar = this.g;
        synchronized (bVar) {
            arrayList = bVar.a;
        }
        if (arrayList.isEmpty()) {
            throw new b("Failed to find image header parser.");
        }
        return arrayList;
    }

    @NonNull
    public final <X> com.bumptech.glide.load.data.e<X> e(@NonNull X x) {
        com.bumptech.glide.load.data.e<X> a2;
        com.bumptech.glide.load.data.f fVar = this.e;
        synchronized (fVar) {
            try {
                com.bumptech.glide.util.l.b(x);
                e.a aVar = (e.a) fVar.a.get(x.getClass());
                if (aVar == null) {
                    Iterator it = fVar.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        e.a aVar2 = (e.a) it.next();
                        if (aVar2.getDataClass().isAssignableFrom(x.getClass())) {
                            aVar = aVar2;
                            break;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = com.bumptech.glide.load.data.f.b;
                }
                a2 = aVar.a(x);
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    @NonNull
    public final void f(@NonNull e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.e;
        synchronized (fVar) {
            fVar.a.put(aVar.getDataClass(), aVar);
        }
    }

    @NonNull
    public final void g(@NonNull Class cls, @NonNull Class cls2, @NonNull com.bumptech.glide.load.resource.transcode.e eVar) {
        com.bumptech.glide.load.resource.transcode.f fVar = this.f;
        synchronized (fVar) {
            fVar.a.add(new f.a(cls, cls2, eVar));
        }
    }
}
