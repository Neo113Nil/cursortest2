package androidx.glance;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/glance/ColorFilter;", "", "colorFilterParams", "Landroidx/glance/ColorFilterParams;", "(Landroidx/glance/ColorFilterParams;)V", "getColorFilterParams$glance_release", "()Landroidx/glance/ColorFilterParams;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorFilter {
    private final ColorFilterParams colorFilterParams;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/ColorFilter$Companion;", "", "()V", "tint", "Landroidx/glance/ColorFilter;", "colorProvider", "Landroidx/glance/unit/ColorProvider;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ColorFilter tint(ColorProvider colorProvider) {
            return new ColorFilter(new TintColorFilterParams(colorProvider));
        }

        private Companion() {
        }
    }

    public ColorFilter(ColorFilterParams colorFilterParams) {
        this.colorFilterParams = colorFilterParams;
    }

    /* renamed from: getColorFilterParams$glance_release, reason: from getter */
    public final ColorFilterParams getColorFilterParams() {
        return this.colorFilterParams;
    }
}
