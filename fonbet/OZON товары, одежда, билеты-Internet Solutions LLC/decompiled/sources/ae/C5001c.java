package ae;

import Dd.k;
import Fd.j;
import Gd.F;
import Jd.C;
import Jd.g;
import ce.l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import zd.u;

/* renamed from: ae.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5001c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f36617a;

    public C5001c(@NotNull j packageFragmentProvider) {
        k javaResolverCache = k.f6583a;
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.f36617a = packageFragmentProvider;
    }

    @NotNull
    public final j a() {
        return this.f36617a;
    }

    public final InterfaceC9839e b(@NotNull g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Sd.c c11 = javaClass.c();
        if (c11 == null || C.SOURCE != null) {
            u w11 = javaClass.w();
            if (w11 != null) {
                InterfaceC9839e b11 = b(w11);
                l H11 = b11 != null ? b11.H() : null;
                InterfaceC9842h d11 = H11 != null ? H11.d(javaClass.getName(), Bd.c.FROM_JAVA_LOADER) : null;
                if (d11 instanceof InterfaceC9839e) {
                    return (InterfaceC9839e) d11;
                }
            } else if (c11 != null) {
                Sd.c e11 = c11.e();
                Intrinsics.checkNotNullExpressionValue(e11, "parent(...)");
                F f7 = (F) C7714v.M(this.f36617a.b(e11));
                if (f7 != null) {
                    return f7.G0(javaClass);
                }
            }
        }
        return null;
    }
}
