package Pd0;

import Rd0.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Kd0.e f22276a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b.C0498b f22277b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Rd0.c f22278c;

    static final class a extends AbstractC7737t implements Function0<Sd0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f22279b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Sd0.a invoke() {
            return f.a();
        }
    }

    public i(@NotNull Kd0.e dependencies, @NotNull b.C0498b debugMenuOPLibraryInput, @NotNull Rd0.c pikazonDiModule) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(debugMenuOPLibraryInput, "debugMenuOPLibraryInput");
        Intrinsics.checkNotNullParameter(pikazonDiModule, "pikazonDiModule");
        this.f22276a = dependencies;
        this.f22277b = debugMenuOPLibraryInput;
        this.f22278c = pikazonDiModule;
    }

    public final void a() {
        Kd0.e eVar = this.f22276a;
        for (Sd0.d dVar : eVar.getLibs$ozon_limb_release()) {
            dVar.getSharedInput().getClass();
            dVar.getSharedInput().a(a.f22279b);
        }
        Vd0.c ozonDebugMenuInternal$ozon_limb_release = eVar.getOzonDebugMenuInternal$ozon_limb_release();
        if (ozonDebugMenuInternal$ozon_limb_release != null) {
            ozonDebugMenuInternal$ozon_limb_release.d(this.f22277b);
        }
        Yd0.c pikazonInternal$ozon_limb_release = eVar.getPikazonInternal$ozon_limb_release();
        if (pikazonInternal$ozon_limb_release != null) {
            pikazonInternal$ozon_limb_release.setInput(this.f22278c.b());
        }
    }
}
