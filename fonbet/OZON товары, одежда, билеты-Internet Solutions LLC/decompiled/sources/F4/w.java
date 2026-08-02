package F4;

import F4.F;
import Sc.InterfaceC3999a;
import bj.C5678f;
import kotlin.jvm.internal.Intrinsics;
import n.C8358c;
import n.ExecutorC8356a;
import n.ExecutorC8357b;
import org.jetbrains.annotations.NotNull;
import xe.C10747s0;

@InterfaceC3999a
/* loaded from: classes8.dex */
public final class w<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    private final C5678f f8971a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F.c f8972b;

    /* renamed from: c, reason: collision with root package name */
    private F.a<Value> f8973c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private xe.I f8974d;

    @InterfaceC3999a
    public w(@NotNull C5678f dataSourceFactory, @NotNull F.c config) {
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        ExecutorC8357b d11 = C8358c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getIOThreadExecutor()");
        this.f8974d = C10747s0.b(d11);
        this.f8971a = dataSourceFactory;
        this.f8972b = config;
    }

    @NotNull
    public final C3040u a() {
        U u11;
        C5678f c5678f = this.f8971a;
        if (c5678f == null) {
            u11 = null;
        } else {
            xe.I fetchDispatcher = this.f8974d;
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            u11 = new U(fetchDispatcher, new C3029i(fetchDispatcher, c5678f));
        }
        if (u11 == null) {
            throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        F.a<Value> aVar = this.f8973c;
        ExecutorC8356a f7 = C8358c.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getMainThreadExecutor()");
        return new C3040u(this.f8972b, aVar, u11, C10747s0.b(f7), this.f8974d);
    }

    @NotNull
    public final void b(F.a aVar) {
        this.f8973c = aVar;
    }

    @NotNull
    public final void c(@NotNull ExecutorC8357b fetchExecutor) {
        Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
        this.f8974d = C10747s0.b(fetchExecutor);
    }
}
