package Ad0;

import Jd0.e;
import Jd0.h;
import Sc.r;
import Sc.s;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.inapppush.presentation.InAppPushHostImpl$receiveInAppPushInternal$1;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.parsing.AtomParserModel;
import ru.ozon.uni.atoms.parsing.ParserStateHolder;
import zd0.b;
import zd0.g;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Id0.a f751a;

    public a(@NotNull b config) {
        Object a11;
        Intrinsics.checkNotNullParameter(config, "config");
        Dd0.b a12 = Dd0.a.a().a(config);
        Jd0.a aVar = Jd0.a.f14618a;
        Jd0.a.b(config.f());
        this.f751a = a12.a().a(System.currentTimeMillis());
        AtomConfig.INSTANCE.initialize(new AtomConfig.Config(new Bd0.a(), false, false, null, new h(), 12, null));
        ParserStateHolder.INSTANCE.initialize(e0.h(new AtomParserModel(DsAtomsType.ICON.getValue(), IconDTO.class)));
        try {
            r.Companion companion = r.INSTANCE;
            a11 = Pikazon.INSTANCE.getInstance();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (((Pikazon) (a11 instanceof r.b ? null : a11)) == null) {
            e.a();
        }
    }

    public final void a() {
        this.f751a.o();
    }

    public final void b(@NotNull g page, @NotNull J lifecycleOwner, @NotNull FrameLayout container, Long l11, @NotNull InAppPushHostImpl$receiveInAppPushInternal$1 inAppPushListener) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(inAppPushListener, "inAppPushListener");
        this.f751a.q(page, lifecycleOwner, container, l11, inAppPushListener);
    }

    public final void c() {
        this.f751a.r();
    }
}
