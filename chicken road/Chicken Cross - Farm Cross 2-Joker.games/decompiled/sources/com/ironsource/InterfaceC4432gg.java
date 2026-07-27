package com.ironsource;

import com.ironsource.C4467ig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4432gg {

    /* renamed from: com.ironsource.gg$a */
    public interface a {
        void a();
    }

    /* renamed from: com.ironsource.gg$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f8214a;
        private long b;

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.f8214a;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void b(long j) {
            this.f8214a = j;
        }
    }

    /* renamed from: com.ironsource.gg$c */
    public interface c {
        InterfaceC4432gg a(b bVar);
    }

    /* renamed from: com.ironsource.gg$d */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC4432gg.c
        public InterfaceC4432gg a(b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new C4467ig(timerConfig.b()));
        }
    }

    /* renamed from: com.ironsource.gg$e */
    private static final class e implements InterfaceC4432gg {

        /* renamed from: a, reason: collision with root package name */
        private final C4467ig f8215a;

        /* renamed from: com.ironsource.gg$e$a */
        public static final class a implements C4467ig.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f8216a;

            a(a aVar) {
                this.f8216a = aVar;
            }

            @Override // com.ironsource.C4467ig.a
            public void a() {
                this.f8216a.a();
            }
        }

        public e(C4467ig timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f8215a = timer;
        }

        @Override // com.ironsource.InterfaceC4432gg
        public void a(a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f8215a.a((C4467ig.a) new a(callback));
        }

        @Override // com.ironsource.InterfaceC4432gg
        public void cancel() {
            this.f8215a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
