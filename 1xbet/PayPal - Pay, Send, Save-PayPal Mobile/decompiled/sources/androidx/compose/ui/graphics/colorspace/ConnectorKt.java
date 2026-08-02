package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"", "src", "dst", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "connectorKey-YBCOT_4", "(III)I", "connectorKey", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Connectors", "Landroidx/collection/MutableIntObjectMap;", "getConnectors", "()Landroidx/collection/MutableIntObjectMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectorKt {
    private static final androidx.collection.MutableIntObjectMap<androidx.compose.ui.graphics.colorspace.Connector> Connectors;

    /* renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m6411connectorKeyYBCOT_4(int i, int i2, int i3) {
        return i | (i2 << 6) | (i3 << 12);
    }

    public static final androidx.collection.MutableIntObjectMap<androidx.compose.ui.graphics.colorspace.Connector> getConnectors() {
        return Connectors;
    }

    static {
        int id = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb().getId();
        int id2 = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb().getId();
        int m6420getPerceptualuksYyKA = androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6420getPerceptualuksYyKA();
        androidx.compose.ui.graphics.colorspace.Connector identity$ui_graphics = androidx.compose.ui.graphics.colorspace.Connector.INSTANCE.identity$ui_graphics(androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb());
        int id3 = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb().getId();
        int id4 = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab().getId();
        int m6420getPerceptualuksYyKA2 = androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6420getPerceptualuksYyKA();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        int i = id | (id2 << 6) | (m6420getPerceptualuksYyKA << 12);
        int i2 = (id4 << 6) | id3 | (m6420getPerceptualuksYyKA2 << 12);
        Connectors = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf(i, identity$ui_graphics, i2, new androidx.compose.ui.graphics.colorspace.Connector(androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb(), androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab(), androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6420getPerceptualuksYyKA(), defaultConstructorMarker), (androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb().getId() << 6) | androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab().getId() | (androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6420getPerceptualuksYyKA() << 12), new androidx.compose.ui.graphics.colorspace.Connector(androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab(), androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb(), androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6420getPerceptualuksYyKA(), defaultConstructorMarker));
    }
}
