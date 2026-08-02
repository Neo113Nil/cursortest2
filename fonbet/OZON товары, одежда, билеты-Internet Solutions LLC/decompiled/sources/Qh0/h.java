package Qh0;

import De.C2862e;
import De.s;
import android.app.Application;
import gh0.AbstractC6735a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.N;
import xe.X0;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    private static final long f23453j = kotlin.time.c.g(60, EnumC10311b.SECONDS);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f23454a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Zg0.g f23455b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<AbstractC6735a> f23456c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f23457d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private AtomicBoolean f23458e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f23459f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Je.d f23460g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2862e f23461h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ScheduledThreadPoolExecutor f23462i;

    public static final class a extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            Lm0.a.f17149a.e(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull Application app, @NotNull Zg0.g pushConfiguration, @NotNull List<? extends AbstractC6735a> pushProviders) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(pushConfiguration, "pushConfiguration");
        Intrinsics.checkNotNullParameter(pushProviders, "pushProviders");
        this.f23454a = app;
        this.f23455b = pushConfiguration;
        this.f23456c = pushProviders;
        this.f23457d = new ArrayList();
        this.f23458e = new AtomicBoolean(false);
        this.f23459f = new AtomicBoolean(false);
        this.f23460g = new Je.d(true);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f23461h = N.a(He.b.f10879b.plus(new a(J.f105405n0)).plus(X0.b()));
        this.f23462i = new ScheduledThreadPoolExecutor(pushProviders.size());
    }

    public static final void c(h hVar, j jVar) {
        if (hVar.f23459f.compareAndSet(false, true)) {
            hVar.f23460g.c(null);
            hVar.f23458e.set(false);
        }
        m.a(jVar.f23465a, jVar.f23466b, jVar.f23467c);
    }

    @NotNull
    public final ArrayList d() {
        return this.f23457d;
    }

    public final void e(@NotNull j initializeCallback) {
        Intrinsics.checkNotNullParameter(initializeCallback, "initializeCallback");
        boolean z11 = this.f23459f.get();
        C2862e c2862e = this.f23461h;
        if (z11) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(c2862e, s.f6650a.x(), null, new d(initializeCallback, null), 2);
            return;
        }
        if (!this.f23458e.compareAndSet(false, true)) {
            C10727i.c(c2862e, null, null, new e(this, initializeCallback, null), 3);
            return;
        }
        List<AbstractC6735a> list = this.f23456c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC6735a) obj).d(this.f23455b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6735a abstractC6735a = (AbstractC6735a) it.next();
            CompletableFuture<Boolean> exceptionally = abstractC6735a.c(this.f23454a).exceptionally((Function<Throwable, ? extends Boolean>) new b());
            Intrinsics.checkNotNullExpressionValue(exceptionally, "exceptionally(...)");
            CompletableFuture a11 = Rh0.g.a(exceptionally, f23453j, this.f23462i);
            final g gVar = new g(this, abstractC6735a);
            CompletableFuture thenApply = a11.thenApply(new Function() { // from class: Qh0.c
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return (Unit) Function1.this.invoke(obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(thenApply, "thenApply(...)");
            arrayList2.add(thenApply);
        }
        CompletableFuture[] completableFutureArr = (CompletableFuture[]) arrayList2.toArray(new CompletableFuture[0]);
        CompletableFuture<Void> allOf = CompletableFuture.allOf((CompletableFuture[]) Arrays.copyOf(completableFutureArr, completableFutureArr.length));
        final f fVar = new f(this, initializeCallback);
        allOf.thenAccept(new Consumer() { // from class: Qh0.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                Function1.this.invoke(obj2);
            }
        });
    }

    public final boolean f() {
        return this.f23459f.get();
    }
}
