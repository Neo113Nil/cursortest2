package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class v<Data, ResourceType, Transcode> {
    public final Pools.Pool<List<Throwable>> a;
    public final List<? extends k<Data, ResourceType, Transcode>> b;
    public final String c;

    public v(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<k<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.a = pool;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final x a(int i, int i2, @NonNull com.bumptech.glide.load.i iVar, com.bumptech.glide.load.data.e eVar, j.a aVar) throws s {
        Pools.Pool<List<Throwable>> pool = this.a;
        List<Throwable> acquire = pool.acquire();
        com.bumptech.glide.util.l.c(acquire, "Argument must not be null");
        List<Throwable> list = acquire;
        try {
            List<? extends k<Data, ResourceType, Transcode>> list2 = this.b;
            int size = list2.size();
            x xVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    xVar = list2.get(i3).a(i, i2, iVar, eVar, aVar);
                } catch (s e) {
                    list.add(e);
                }
                if (xVar != null) {
                    break;
                }
            }
            if (xVar != null) {
                return xVar;
            }
            throw new s(this.c, new ArrayList(list));
        } finally {
            pool.release(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
