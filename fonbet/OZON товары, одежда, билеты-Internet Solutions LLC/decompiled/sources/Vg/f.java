package Vg;

import a00.C4911f;
import a00.h;
import k20.C7475g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes6.dex */
public abstract class f {
    private final boolean manualAnalyticTracking;

    /* loaded from: classes10.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final h f32780a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C4911f f32781b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final l f32782c;

        public a(@NotNull h viewModelOwnerProvider, @NotNull C4911f ownerContainer, @NotNull l widgetViewItem) {
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
            Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
            Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
            this.f32780a = viewModelOwnerProvider;
            this.f32781b = ownerContainer;
            this.f32782c = widgetViewItem;
        }

        @NotNull
        public final C4911f a() {
            return this.f32781b;
        }

        @NotNull
        public final h b() {
            return this.f32780a;
        }

        @NotNull
        public final l c() {
            return this.f32782c;
        }
    }

    @NotNull
    public abstract String getActionId();

    public boolean getManualAnalyticTracking() {
        return this.manualAnalyticTracking;
    }

    public abstract void processWidgetAction(@NotNull Tg.b bVar, @NotNull a aVar, @NotNull C7475g c7475g);
}
