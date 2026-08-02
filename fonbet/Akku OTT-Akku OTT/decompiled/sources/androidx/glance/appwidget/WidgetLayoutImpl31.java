package androidx.glance.appwidget;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.glance.appwidget.proto.LayoutProto;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;

@RequiresApi(31)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/WidgetLayoutImpl31;", "", "()V", "toProto", "Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "dimension", "Landroidx/glance/unit/Dimension;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WidgetLayoutImpl31 {
    public static final WidgetLayoutImpl31 INSTANCE = new WidgetLayoutImpl31();

    private WidgetLayoutImpl31() {
    }

    @DoNotInline
    public final LayoutProto.DimensionType toProto(Dimension dimension) {
        return dimension instanceof Dimension.Expand ? LayoutProto.DimensionType.EXPAND : LayoutProto.DimensionType.WRAP;
    }
}
