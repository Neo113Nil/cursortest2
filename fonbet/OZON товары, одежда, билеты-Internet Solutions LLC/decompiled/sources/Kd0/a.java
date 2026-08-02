package Kd0;

import Sc.InterfaceC4008j;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$1;
import ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$2;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f15937a = Sc.k.b(C0303a.f15939b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15938b = 0;

    /* renamed from: Kd0.a$a, reason: collision with other inner class name */
    static final class C0303a extends AbstractC7737t implements Function0<Qd0.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0303a f15939b = new C0303a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Qd0.h invoke() {
            return new Qd0.h();
        }
    }

    public static void a(@NotNull LimbActionInitializer$init$1 config, @NotNull LimbActionInitializer$init$2 dependencies) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        InterfaceC4008j interfaceC4008j = f15937a;
        ((Qd0.h) interfaceC4008j.getValue()).b(dependencies);
        if (config.getBuildConfig().getBuildType() == c.f15940QA) {
            int i11 = Pd0.f.f22274b;
            Pd0.f.b(Sd0.a.QA_BUILDS_OR_AUTOTEST);
        }
        config.getUiConfig().getIsUIReady();
        Iterator<T> it = ((Qd0.h) interfaceC4008j.getValue()).a().e().getLibs$ozon_limb_release().iterator();
        while (it.hasNext()) {
            ((Sd0.d) it.next()).libStart();
        }
    }

    @NotNull
    public static f b(@NotNull g link) {
        Intrinsics.checkNotNullParameter(link, "link");
        return ((Qd0.h) f15937a.getValue()).a().f().a(link);
    }

    public static void c() {
        ((Qd0.h) f15937a.getValue()).a().d().c();
    }
}
