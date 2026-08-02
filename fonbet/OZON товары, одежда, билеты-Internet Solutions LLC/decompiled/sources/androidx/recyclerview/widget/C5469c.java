package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5469c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ExecutorService f44839a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final i.d<T> f44840b;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class a<T> {

        /* renamed from: c, reason: collision with root package name */
        private static final Object f44841c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private static ExecutorService f44842d;

        /* renamed from: a, reason: collision with root package name */
        private ExecutorService f44843a;

        /* renamed from: b, reason: collision with root package name */
        private final i.d<T> f44844b;

        public a(@NonNull i.d<T> dVar) {
            this.f44844b = dVar;
        }

        @NonNull
        public final C5469c<T> a() {
            if (this.f44843a == null) {
                synchronized (f44841c) {
                    try {
                        if (f44842d == null) {
                            f44842d = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f44843a = f44842d;
            }
            return new C5469c<>(this.f44843a, this.f44844b);
        }
    }

    C5469c(@NonNull ExecutorService executorService, @NonNull i.d dVar) {
        this.f44839a = executorService;
        this.f44840b = dVar;
    }

    @NonNull
    public final Executor a() {
        return this.f44839a;
    }

    @NonNull
    public final i.d<T> b() {
        return this.f44840b;
    }
}
