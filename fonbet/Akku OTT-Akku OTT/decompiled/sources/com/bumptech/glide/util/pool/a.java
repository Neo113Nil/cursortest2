package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.util.pool.d;

/* loaded from: classes3.dex */
public final class a {
    public static final C0068a a = new C0068a();

    /* renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    public class C0068a implements e<Object> {
        @Override // com.bumptech.glide.util.pool.a.e
        public final void a(@NonNull Object obj) {
        }
    }

    public interface b<T> {
        T create();
    }

    public static final class c<T> implements Pools.Pool<T> {
        public final b<T> a;
        public final e<T> b;
        public final Pools.SynchronizedPool c;

        public c(@NonNull Pools.SynchronizedPool synchronizedPool, @NonNull b bVar, @NonNull e eVar) {
            this.c = synchronizedPool;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public final T acquire() {
            T acquire = this.c.acquire();
            if (acquire == null) {
                acquire = this.a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    acquire.getClass().toString();
                }
            }
            if (acquire instanceof d) {
                acquire.b().a = false;
            }
            return (T) acquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public final boolean release(@NonNull T t) {
            if (t instanceof d) {
                ((d) t).b().a = true;
            }
            this.b.a(t);
            return this.c.release(t);
        }
    }

    public interface d {
        @NonNull
        d.a b();
    }

    public interface e<T> {
        void a(@NonNull T t);
    }

    @NonNull
    public static c a(int i, @NonNull b bVar) {
        return new c(new Pools.SynchronizedPool(i), bVar, a);
    }
}
