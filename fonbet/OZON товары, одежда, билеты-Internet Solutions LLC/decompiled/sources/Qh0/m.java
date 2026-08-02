package Qh0;

import Zg0.d;
import dh0.C6200a;
import gh0.InterfaceC6738d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static final long f23472c = kotlin.time.c.g(15, EnumC10311b.SECONDS);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f23473a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ScheduledThreadPoolExecutor f23474b;

    public m(@NotNull h pushTokenUpdatersStorage) {
        Intrinsics.checkNotNullParameter(pushTokenUpdatersStorage, "pushTokenUpdatersStorage");
        this.f23473a = pushTokenUpdatersStorage;
        this.f23474b = new ScheduledThreadPoolExecutor(pushTokenUpdatersStorage.d().size());
    }

    public static void a(m mVar, jh0.c cVar, Function1 function1) {
        if (mVar.f23473a.d().isEmpty()) {
            Zg0.d b11 = C6200a.b();
            if (b11 instanceof d.b) {
                C6200a.c().a(C6200a.a("There are no active providers."), null);
                ((d.b) b11).getClass();
            }
        } else {
            ArrayList d11 = mVar.f23473a.d();
            ArrayList arrayList = new ArrayList(C7714v.z(d11, 10));
            Iterator it = d11.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC6738d) it.next()).getType());
            }
            String V11 = C7714v.V(arrayList, null, null, null, null, 63);
            Zg0.d b12 = C6200a.b();
            if (b12 instanceof d.b) {
                C6200a.c().a(C6200a.a("Active push providers are: " + V11), null);
                ((d.b) b12).getClass();
            }
        }
        mVar.c(cVar, function1);
    }

    private final void c(jh0.c cVar, Function1 function1) {
        ArrayList d11 = this.f23473a.d();
        ArrayList arrayList = new ArrayList(C7714v.z(d11, 10));
        Iterator it = d11.iterator();
        while (it.hasNext()) {
            arrayList.add(Rh0.g.a(((InterfaceC6738d) it.next()).a(cVar), f23472c, this.f23474b));
        }
        CompletableFuture[] completableFutureArr = (CompletableFuture[]) arrayList.toArray(new CompletableFuture[0]);
        CompletableFuture<Void> allOf = CompletableFuture.allOf((CompletableFuture[]) Arrays.copyOf(completableFutureArr, completableFutureArr.length));
        final l lVar = new l(arrayList, function1, cVar);
        Intrinsics.checkNotNullExpressionValue(allOf.thenApply(new Function() { // from class: Qh0.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Unit) Function1.this.invoke(obj);
            }
        }), "thenApply(...)");
    }

    public final void b(@NotNull jh0.c updateTrigger, @NotNull Function1<? super i, Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        h hVar = this.f23473a;
        if (hVar.f()) {
            c(updateTrigger, resultCallback);
        } else {
            hVar.e(new j(this, updateTrigger, resultCallback));
        }
    }
}
