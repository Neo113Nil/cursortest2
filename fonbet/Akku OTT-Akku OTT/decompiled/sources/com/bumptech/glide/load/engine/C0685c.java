package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bumptech.glide.load.engine.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0685c {
    public final ExecutorService a;

    @VisibleForTesting
    public final HashMap b;
    public final ReferenceQueue<r<?>> c;
    public m d;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.c$a */
    public static final class a extends WeakReference<r<?>> {
        public final com.bumptech.glide.load.g a;
        public final boolean b;

        @Nullable
        public x<?> c;

        public a(@NonNull com.bumptech.glide.load.g gVar, @NonNull r rVar, @NonNull ReferenceQueue referenceQueue) {
            super(rVar, referenceQueue);
            com.bumptech.glide.util.l.c(gVar, "Argument must not be null");
            this.a = gVar;
            boolean z = rVar.a;
            this.c = null;
            this.b = z;
        }
    }

    public C0685c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0683a());
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new RunnableC0684b(this));
    }

    public final synchronized void a(com.bumptech.glide.load.g gVar, r<?> rVar) {
        a aVar = (a) this.b.put(gVar, new a(gVar, rVar, this.c));
        if (aVar != null) {
            aVar.c = null;
            aVar.clear();
        }
    }

    public final void b(@NonNull a aVar) {
        x<?> xVar;
        synchronized (this) {
            this.b.remove(aVar.a);
            if (aVar.b && (xVar = aVar.c) != null) {
                this.d.a(aVar.a, new r<>(xVar, true, false, aVar.a, this.d));
            }
        }
    }
}
