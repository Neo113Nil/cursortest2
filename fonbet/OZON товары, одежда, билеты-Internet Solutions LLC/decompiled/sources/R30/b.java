package R30;

import De.C2862e;
import De.s;
import android.util.Log;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.J;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class b implements R30.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f24547a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f24548b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f24549c;

    public static final class a extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f24550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J.a aVar, b bVar) {
            super(aVar);
            this.f24550a = bVar;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            b.d(this.f24550a, th2);
        }
    }

    /* renamed from: R30.b$b, reason: collision with other inner class name */
    public static final class C0487b extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f24551a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0487b(J.a aVar, b bVar) {
            super(aVar);
            this.f24551a = bVar;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            b.d(this.f24551a, th2);
        }
    }

    public static final class c extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f24552a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(J.a aVar, b bVar) {
            super(aVar);
            this.f24552a = bVar;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            b.d(this.f24552a, th2);
        }
    }

    public b() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext plus = s.f6650a.plus(X0.b());
        J.a aVar = J.f105405n0;
        this.f24547a = N.a(plus.plus(new a(aVar, this)));
        this.f24548b = N.a(He.b.f10879b.plus(X0.b()).plus(new C0487b(aVar, this)));
        this.f24549c = N.a(C10720e0.a().plus(X0.b()).plus(new c(aVar, this)));
    }

    public static final void d(b bVar, Throwable th2) {
        bVar.getClass();
        L80.a.c("AppCoroutineScopesImpl", "Error while executing exchanger job " + Thread.currentThread() + " " + th2, th2);
    }

    @Override // R30.a
    @NotNull
    public final C2862e a() {
        return this.f24549c;
    }

    @Override // R30.a
    @NotNull
    public final C2862e b() {
        return this.f24548b;
    }

    @Override // R30.a
    @NotNull
    public final C2862e c() {
        return this.f24547a;
    }

    protected final void finalize() {
        try {
            N.c(this.f24547a, null);
            N.c(this.f24548b, null);
            N.c(this.f24549c, null);
        } catch (IllegalStateException e11) {
            Log.d("AppCoroutineScopesImpl", "");
            e11.printStackTrace();
        }
    }
}
