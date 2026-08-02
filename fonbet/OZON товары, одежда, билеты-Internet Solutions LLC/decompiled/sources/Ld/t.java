package Ld;

import Qd.C3856a;
import Td.h;
import ae.C5002d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.e0;

/* loaded from: classes10.dex */
public final class t implements he.v {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5002d f16810b;

    /* renamed from: c, reason: collision with root package name */
    private final C5002d f16811c;

    /* renamed from: d, reason: collision with root package name */
    private final y f16812d;

    public t() {
        throw null;
    }

    public t(@NotNull y kotlinClass, @NotNull Nd.k packageProto, @NotNull Rd.f nameResolver, @NotNull he.u abiStability) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        C5002d className = C5002d.b(kotlinClass.b());
        Intrinsics.checkNotNullExpressionValue(className, "byClassId(...)");
        String e11 = kotlinClass.a().e();
        C5002d c5002d = null;
        if (e11 != null && e11.length() > 0) {
            c5002d = C5002d.d(e11);
        }
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f16810b = className;
        this.f16811c = c5002d;
        this.f16812d = kotlinClass;
        h.f<Nd.k, Integer> packageModuleName = C3856a.f23244m;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) Pd.e.a(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @Override // td.d0
    @NotNull
    public final void b() {
        e0 NO_SOURCE_FILE = e0.f99393a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @NotNull
    public final Sd.b c() {
        Sd.c g10 = this.f16810b.g();
        Intrinsics.checkNotNullExpressionValue(g10, "getPackageFqName(...)");
        return new Sd.b(g10, g());
    }

    public final C5002d d() {
        return this.f16811c;
    }

    public final y e() {
        return this.f16812d;
    }

    @NotNull
    public final String f() {
        return "Class '" + c().a().b() + '\'';
    }

    @NotNull
    public final Sd.f g() {
        String f7 = this.f16810b.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getInternalName(...)");
        Sd.f f11 = Sd.f.f(kotlin.text.h.j0('/', f7, f7));
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        return f11;
    }

    @NotNull
    public final String toString() {
        return t.class.getSimpleName() + ": " + this.f16810b;
    }
}
