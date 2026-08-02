package aZ;

import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import eZ.C6335b;
import eZ.InterfaceC6334a;
import gZ.C6695c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mZ.C8116a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f extends Ud0.b implements YY.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6334a f36525a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4983a f36526b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f36527c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f36528d;

    static final class a extends AbstractC7737t implements Function0<C6695c> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6695c invoke() {
            f fVar = f.this;
            return new C6695c(fVar.f36526b, fVar.f36525a.a(), fVar.f36525a.c());
        }
    }

    static final class b extends AbstractC7737t implements Function0<g> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final g invoke() {
            return new g(f.this);
        }
    }

    public f(@NotNull XY.d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        InterfaceC6334a a11 = C6335b.a().a(config);
        this.f36525a = a11;
        this.f36526b = a11.b().create();
        this.f36527c = k.a(n.PUBLICATION, new a());
        this.f36528d = k.b(new b());
        C8116a c8116a = C8116a.f74679a;
        XY.c logConfig = config.c();
        Intrinsics.checkNotNullParameter(logConfig, "logConfig");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final C6695c d(f fVar) {
        return (C6695c) fVar.f36527c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // YY.a
    @NotNull
    public final x0 a() {
        return ((C6695c) this.f36527c.getValue()).e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // YY.a
    public final void b() {
        ((C6695c) this.f36527c.getValue()).d();
    }

    @Override // Ud0.b
    public final Ud0.c c() {
        return (Ud0.c) this.f36528d.getValue();
    }
}
