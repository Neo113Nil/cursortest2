package aZ;

import Ae.x0;
import gZ.C6696d;
import gZ.C6699g;
import gZ.C6701i;
import hZ.C6894a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: aZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4983a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6696d f36516a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6701i.a f36517b;

    /* renamed from: c, reason: collision with root package name */
    private C6701i f36518c;

    /* renamed from: aZ.a$a, reason: collision with other inner class name */
    public interface InterfaceC0703a {
        @NotNull
        C4983a create();
    }

    public C4983a(@NotNull C6699g newConfigInteractor, @NotNull C6696d cachedConfigInteractor, @NotNull C6701i.a updaterFactory) {
        Intrinsics.checkNotNullParameter(newConfigInteractor, "newConfigInteractor");
        Intrinsics.checkNotNullParameter(cachedConfigInteractor, "cachedConfigInteractor");
        Intrinsics.checkNotNullParameter(updaterFactory, "updaterFactory");
        this.f36516a = cachedConfigInteractor;
        this.f36517b = updaterFactory;
    }

    public final void a(@NotNull x0<C6894a> cdnConfigFlow) {
        Intrinsics.checkNotNullParameter(cdnConfigFlow, "cdnConfigFlow");
        if (this.f36518c == null) {
            this.f36518c = this.f36517b.a(cdnConfigFlow);
        }
        C6701i c6701i = this.f36518c;
        if (c6701i != null) {
            c6701i.c();
        }
    }

    @NotNull
    public final C6894a b() {
        C6894a e11 = this.f36516a.e();
        return e11 == null ? C4986d.a() : e11;
    }
}
