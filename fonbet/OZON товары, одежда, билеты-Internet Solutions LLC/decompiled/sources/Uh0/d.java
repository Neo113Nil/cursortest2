package Uh0;

import Wh0.d;
import gh0.InterfaceC6738d;
import java.util.concurrent.CompletableFuture;
import jh0.C7429a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yl0.C10923h;
import yl0.InterfaceC10919d;
import yl0.InterfaceC10920e;

/* loaded from: classes7.dex */
public final class d implements InterfaceC6738d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6738d.b f27724a = InterfaceC6738d.b.RU_STORE;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<C10923h<String>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ jh0.c f27725b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<InterfaceC6738d.a> f27726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CompletableFuture completableFuture, jh0.c cVar) {
            super(0);
            this.f27725b = cVar;
            this.f27726c = completableFuture;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10923h<String> invoke() {
            C10923h<String> b11 = Dl0.a.b();
            final CompletableFuture<InterfaceC6738d.a> completableFuture = this.f27726c;
            final jh0.c cVar = this.f27725b;
            b11.i(new InterfaceC10920e() { // from class: Uh0.b
                @Override // yl0.InterfaceC10920e
                public final void onSuccess(Object obj) {
                    String result = (String) obj;
                    Intrinsics.checkNotNullParameter(result, "result");
                    jh0.b bVar = jh0.b.RUSTORE;
                    jh0.c updateTrigger = cVar;
                    d.b result2 = new d.b(new C7429a(result, bVar, updateTrigger));
                    Intrinsics.checkNotNullParameter(result2, "result");
                    Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
                    completableFuture.complete(new InterfaceC6738d.a(bVar, updateTrigger, result2));
                }
            });
            b11.h(new InterfaceC10919d() { // from class: Uh0.c
                @Override // yl0.InterfaceC10919d
                public final void onFailure(Throwable throwable) {
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    d.a result = new d.a(throwable);
                    Intrinsics.checkNotNullParameter(result, "result");
                    jh0.c updateTrigger = cVar;
                    Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
                    completableFuture.complete(new InterfaceC6738d.a(jh0.b.RUSTORE, updateTrigger, result));
                }
            });
            return b11;
        }
    }

    @Override // gh0.InterfaceC6738d
    @NotNull
    public final CompletableFuture<InterfaceC6738d.a> a(@NotNull jh0.c updateTrigger) {
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        CompletableFuture<InterfaceC6738d.a> completableFuture = new CompletableFuture<>();
        Wh0.c.a(new a(completableFuture, updateTrigger));
        return completableFuture;
    }

    @Override // gh0.InterfaceC6738d
    @NotNull
    public final InterfaceC6738d.b getType() {
        return this.f27724a;
    }
}
