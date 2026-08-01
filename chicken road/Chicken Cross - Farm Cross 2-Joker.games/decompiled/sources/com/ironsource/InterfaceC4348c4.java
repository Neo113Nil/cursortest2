package com.ironsource;

import com.ironsource.InterfaceC4432gg;
import com.ironsource.U6;
import com.ironsource.X6;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4348c4 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8107a = c.f8109a;

    /* renamed from: com.ironsource.c4$a */
    public static final class a implements InterfaceC4348c4 {
        private final T6 b;
        private final InterfaceC4432gg c;
        private final AtomicBoolean d;

        /* renamed from: com.ironsource.c4$a$a, reason: collision with other inner class name */
        public static final class C1320a implements InterfaceC4432gg.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f8108a;
            final /* synthetic */ a b;

            C1320a(d dVar, a aVar) {
                this.f8108a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.InterfaceC4432gg.a
            public void a() {
                this.f8108a.a(new X6.a(new U6.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(T6 config, InterfaceC4432gg timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.b = config;
            this.c = timer;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC4348c4
        public synchronized void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C1320a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC4348c4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* renamed from: com.ironsource.c4$b */
    public static final class b implements InterfaceC4348c4 {
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4348c4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4348c4
        public void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* renamed from: com.ironsource.c4$d */
    public interface d {
        void a(X6 x6);
    }

    @JvmStatic
    static InterfaceC4348c4 a(V6 v6) {
        return f8107a.a(v6);
    }

    void a();

    void a(d dVar);

    /* renamed from: com.ironsource.c4$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f8109a = new c();

        private c() {
        }

        @JvmStatic
        public final InterfaceC4348c4 a(V6 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.b;
            }
            S6 s6 = new S6(featureFlag);
            InterfaceC4432gg.b bVar = new InterfaceC4432gg.b();
            bVar.b(s6.a());
            bVar.a(s6.a());
            return new a(s6, new InterfaceC4432gg.d().a(bVar));
        }

        public final InterfaceC4348c4 a() {
            return b.b;
        }
    }
}
