package Kd0;

import Sc.InterfaceC4008j;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class e {

    @NotNull
    private final InterfaceC4008j libs$delegate = Sc.k.b(new a());
    private final Object ozonInAppReview;
    private final Object ozonLogger;
    private final Object pikazonDebugMenu;

    static final class a extends AbstractC7737t implements Function0<List<? extends Sd0.d>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Sd0.d> invoke() {
            e eVar = e.this;
            Sd0.d[] elements = {eVar.getCdnChooserInternal$ozon_limb_release(), eVar.getOzonLoggerInternal$ozon_limb_release(), eVar.getOzonTrackerDebugMenuInternal$ozon_limb_release(), eVar.getOzonDebugMenuInternal$ozon_limb_release(), eVar.getPikazonInternal$ozon_limb_release(), eVar.getPikazonDebugMenuInternal$ozon_limb_release(), eVar.getOzonInAppReviewInternal$ozon_limb_release()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.B(elements);
        }
    }

    public abstract Object getCdnChooser();

    public final Ud0.b getCdnChooserInternal$ozon_limb_release() {
        return (Ud0.b) getCdnChooser();
    }

    @NotNull
    public final List<Sd0.d> getLibs$ozon_limb_release() {
        return (List) this.libs$delegate.getValue();
    }

    public abstract Object getOzonDebugMenu();

    public final Vd0.c getOzonDebugMenuInternal$ozon_limb_release() {
        return (Vd0.c) getOzonDebugMenu();
    }

    public Object getOzonInAppReview() {
        return this.ozonInAppReview;
    }

    public final Wd0.a getOzonInAppReviewInternal$ozon_limb_release() {
        return (Wd0.a) getOzonInAppReview();
    }

    public Object getOzonLogger() {
        return this.ozonLogger;
    }

    public final Xd0.a getOzonLoggerInternal$ozon_limb_release() {
        return (Xd0.a) getOzonLogger();
    }

    public abstract Object getOzonTrackerDebugMenu();

    public final Zd0.a getOzonTrackerDebugMenuInternal$ozon_limb_release() {
        return (Zd0.a) getOzonTrackerDebugMenu();
    }

    public abstract Object getPikazon();

    public Object getPikazonDebugMenu() {
        return this.pikazonDebugMenu;
    }

    public final Yd0.a getPikazonDebugMenuInternal$ozon_limb_release() {
        return (Yd0.a) getPikazonDebugMenu();
    }

    public final Yd0.c getPikazonInternal$ozon_limb_release() {
        return (Yd0.c) getPikazon();
    }
}
