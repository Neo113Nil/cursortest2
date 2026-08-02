package Ql0;

import De.C2862e;
import Yl0.p;
import Yl0.r;
import db.InterfaceC6134a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10747s0;
import xe.I;
import yl0.C10923h;

/* loaded from: classes4.dex */
public final class j implements InterfaceC6134a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C2862e f23811a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final r f23812b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Za.d f23813c;

    public j(@NotNull C2862e scope, @NotNull p subscribeToTopicUseCase, @NotNull r unsubscribeFromTopicUseCase, @NotNull Za.d rootLogger) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(subscribeToTopicUseCase, "subscribeToTopicUseCase");
        Intrinsics.checkNotNullParameter(unsubscribeFromTopicUseCase, "unsubscribeFromTopicUseCase");
        Intrinsics.checkNotNullParameter(rootLogger, "rootLogger");
        this.f23811a = scope;
        this.f23812b = unsubscribeFromTopicUseCase;
        this.f23813c = rootLogger.c("TopicComponent");
    }

    @Override // db.InterfaceC6134a
    @NotNull
    public final C10923h b() {
        Intrinsics.checkNotNullParameter("ru.vk.store_ads", "topic");
        this.f23813c.info("Unsubscribe From Topic ru.vk.store_ads");
        C2862e c2862e = this.f23811a;
        g block = new g(c2862e, this);
        Intrinsics.checkNotNullParameter(block, "block");
        C10923h c10923h = new C10923h(0);
        block.invoke(new C10923h.a());
        I i11 = (I) c2862e.getCoroutineContext().get(I.f105397a);
        Executor a11 = i11 != null ? C10747s0.a(i11) : null;
        if (a11 == null) {
            c10923h.g(new h());
            return c10923h;
        }
        c10923h.f(a11, new i());
        return c10923h;
    }
}
