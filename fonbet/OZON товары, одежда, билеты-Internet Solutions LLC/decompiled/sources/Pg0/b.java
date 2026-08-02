package Pg0;

import Sc.InterfaceC4008j;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.start.dialog.AppProtectionAppDialogConfig;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f22526l = new a();

    /* renamed from: m, reason: collision with root package name */
    private static volatile b f22527m;

    /* renamed from: a, reason: collision with root package name */
    private final int f22528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Og0.a> f22529b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Og0.j> f22530c;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Tg0.a> f22532e;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f22537j;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Tg0.f> f22531d = Sc.k.b(new j(this));

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Tg0.c> f22533f = Sc.k.b(new e(this));

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Tg0.d> f22534g = Sc.k.b(new h(this));

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Tg0.g> f22535h = Sc.k.b(new l(this));

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Tg0.e> f22536i = Sc.k.b(new i(this));

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f22538k = Sc.k.b(new f(this));

    public static final class a {
        @NotNull
        public final b a(@NotNull AppProtectionAppDialogConfig config) {
            b bVar;
            Intrinsics.checkNotNullParameter(config, "config");
            b bVar2 = b.f22527m;
            if (bVar2 != null) {
                return bVar2;
            }
            synchronized (this) {
                bVar = b.f22527m;
                if (bVar == null) {
                    Application application = config.getApplication();
                    config.getCustomAlertDialogProvider();
                    b bVar3 = new b(application, new Pg0.a(config), config.getDialogThemeResId());
                    b.f22527m = bVar3;
                    bVar = bVar3;
                }
            }
            return bVar;
        }
    }

    public b(Application application, Ug0.a aVar, int i11) {
        this.f22528a = i11;
        this.f22529b = Sc.k.b(new g(application));
        this.f22530c = Sc.k.b(new k(aVar));
        this.f22532e = Sc.k.b(new d(application));
        this.f22537j = Sc.k.b(new c(application));
    }

    @NotNull
    public final String k() {
        return ((Qg0.a) this.f22537j.getValue()).b();
    }

    @NotNull
    public final Rg0.c l() {
        return (Rg0.c) this.f22538k.getValue();
    }

    public final int m() {
        return this.f22528a;
    }
}
