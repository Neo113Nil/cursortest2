package bh;

import Fj.f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.common.CornerRadius;
import ru.ozon.app.android.atoms.data.common.Spacings;

/* renamed from: bh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5663a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C5664b f56016a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C5664b f56017b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C5664b f56018c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C5664b f56019d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C5664b f56020e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C5664b f56021f;

    static {
        f fVar = f.BODY_CONTROL_300_X_SMALL;
        c cVar = new c(fVar.b(), f.BODY_ACCENT_300_X_SMALL.b(), fVar.b(), fVar.b(), fVar.b(), fVar.b());
        Spacings spacings = Spacings.SPACING_4;
        f56016a = new C5664b(cVar, 12, spacings.getPx(), Spacings.SPACING_3.getPx(), CornerRadius.RADIUS_200.getPx(), 16);
        c cVar2 = new c(fVar.b(), f.BODY_ACCENT_400_SMALL.b(), fVar.b(), fVar.b(), fVar.b(), fVar.b());
        int px = spacings.getPx();
        int px2 = spacings.getPx();
        CornerRadius cornerRadius = CornerRadius.RADIUS_250;
        f56017b = new C5664b(cVar2, 14, px, px2, cornerRadius.getPx(), 20);
        f56018c = new C5664b(new c(fVar.b(), f.HEADLINE_400_SMALL.b(), fVar.b(), fVar.b(), fVar.b(), fVar.b()), 16, spacings.getPx(), Spacings.SPACING_5.getPx(), cornerRadius.getPx(), 20);
        f fVar2 = f.BODY_CONTROL_400_SMALL;
        c cVar3 = new c(fVar2.b(), f.HEADLINE_500_MEDIUM.b(), fVar2.b(), fVar2.b(), fVar2.b(), fVar2.b());
        int px3 = spacings.getPx();
        Spacings spacings2 = Spacings.SPACING_6;
        f56019d = new C5664b(cVar3, 20, px3, spacings2.getPx(), cornerRadius.getPx(), 24);
        f fVar3 = f.BODY_CONTROL_500_MEDIUM;
        f56020e = new C5664b(new c(fVar3.b(), f.HEADLINE_600_LARGE.b(), fVar3.b(), fVar3.b(), fVar3.b(), fVar3.b()), 24, spacings2.getPx(), Spacings.SPACING_8.getPx(), CornerRadius.RADIUS_300.getPx(), 28);
        f56021f = new C5664b(new c(fVar3.b(), f.HEADLINE_800_X_X_LARGE.b(), fVar3.b(), fVar3.b(), fVar3.b(), fVar3.b()), 32, spacings2.getPx(), Spacings.SPACING_10.getPx(), CornerRadius.RADIUS_350.getPx(), 36);
    }

    @NotNull
    public static final C5664b a() {
        return f56016a;
    }

    @NotNull
    public static final C5664b b() {
        return f56017b;
    }

    @NotNull
    public static final C5664b c() {
        return f56018c;
    }

    @NotNull
    public static final C5664b d() {
        return f56019d;
    }

    @NotNull
    public static final C5664b e() {
        return f56020e;
    }

    @NotNull
    public static final C5664b f() {
        return f56021f;
    }
}
