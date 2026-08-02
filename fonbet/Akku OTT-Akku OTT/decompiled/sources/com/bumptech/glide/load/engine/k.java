package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.i;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> b;
    public final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> c;
    public final Pools.Pool<List<Throwable>> d;
    public final String e;

    public k(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> list, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.a = cls;
        this.b = list;
        this.c = eVar;
        this.d = pool;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final x a(int i, int i2, @NonNull com.bumptech.glide.load.i iVar, com.bumptech.glide.load.data.e eVar, j.a aVar) throws s {
        x xVar;
        com.bumptech.glide.load.m mVar;
        com.bumptech.glide.load.c cVar;
        boolean z;
        boolean z2;
        boolean z3;
        com.bumptech.glide.load.g fVar;
        Pools.Pool<List<Throwable>> pool = this.d;
        List<Throwable> acquire = pool.acquire();
        com.bumptech.glide.util.l.c(acquire, "Argument must not be null");
        List<Throwable> list = acquire;
        try {
            x<ResourceType> b = b(eVar, i, i2, iVar, list);
            pool.release(list);
            j jVar = j.this;
            com.bumptech.glide.load.a aVar2 = aVar.a;
            i<R> iVar2 = jVar.a;
            Class<?> cls = b.get().getClass();
            com.bumptech.glide.load.l lVar = null;
            if (aVar2 != com.bumptech.glide.load.a.d) {
                com.bumptech.glide.load.m e = iVar2.e(cls);
                mVar = e;
                xVar = e.a(jVar.j, b, jVar.n, jVar.o);
            } else {
                xVar = b;
                mVar = null;
            }
            if (!b.equals(xVar)) {
                b.recycle();
            }
            if (iVar2.c.a().d.a(xVar.c()) != null) {
                lVar = iVar2.c.a().d.a(xVar.c());
                if (lVar == null) {
                    throw new i.d(xVar.c());
                }
                cVar = lVar.a(jVar.q);
            } else {
                cVar = com.bumptech.glide.load.c.c;
            }
            com.bumptech.glide.load.l lVar2 = lVar;
            com.bumptech.glide.load.g gVar = jVar.x;
            ArrayList b2 = iVar2.b();
            int size = b2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((ModelLoader.LoadData) b2.get(i3)).sourceKey.equals(gVar)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (jVar.p.d(!z, aVar2, cVar)) {
                if (lVar2 == null) {
                    throw new i.d(xVar.get().getClass());
                }
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    z2 = false;
                    z3 = true;
                    fVar = new f(jVar.x, jVar.k);
                } else {
                    if (ordinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + cVar);
                    }
                    z2 = false;
                    z3 = true;
                    fVar = new z(iVar2.c.a, jVar.x, jVar.k, jVar.n, jVar.o, mVar, cls, jVar.q);
                }
                w<Z> wVar = (w) w.e.acquire();
                wVar.d = z2;
                wVar.c = z3;
                wVar.b = xVar;
                j.b<?> bVar = jVar.f;
                bVar.a = fVar;
                bVar.b = lVar2;
                bVar.c = wVar;
                xVar = wVar;
            }
            return this.c.a(xVar, iVar);
        } catch (Throwable th) {
            pool.release(list);
            throw th;
        }
    }

    @NonNull
    public final x<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i, int i2, @NonNull com.bumptech.glide.load.i iVar, List<Throwable> list) throws s {
        List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> list2 = this.b;
        int size = list2.size();
        x<ResourceType> xVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            com.bumptech.glide.load.k<DataType, ResourceType> kVar = list2.get(i3);
            try {
                if (kVar.a(eVar.a(), iVar)) {
                    xVar = kVar.b(eVar.a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(kVar);
                }
                list.add(e);
            }
            if (xVar != null) {
                break;
            }
        }
        if (xVar != null) {
            return xVar;
        }
        throw new s(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
