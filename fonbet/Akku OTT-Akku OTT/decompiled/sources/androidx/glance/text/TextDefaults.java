package androidx.glance.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.ColorProviderKt;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/glance/text/TextDefaults;", "", "()V", "defaultTextColor", "Landroidx/glance/unit/ColorProvider;", "getDefaultTextColor", "()Landroidx/glance/unit/ColorProvider;", "defaultTextStyle", "Landroidx/glance/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/glance/text/TextStyle;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextDefaults {
    public static final int $stable;
    public static final TextDefaults INSTANCE = new TextDefaults();
    private static final ColorProvider defaultTextColor;
    private static final TextStyle defaultTextStyle;

    static {
        ColorProvider m1505ColorProvider8_81llA = ColorProviderKt.m1505ColorProvider8_81llA(Color.INSTANCE.m533getBlack0d7_KjU());
        defaultTextColor = m1505ColorProvider8_81llA;
        defaultTextStyle = new TextStyle(m1505ColorProvider8_81llA, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        $stable = 8;
    }

    private TextDefaults() {
    }

    public final ColorProvider getDefaultTextColor() {
        return defaultTextColor;
    }

    public final TextStyle getDefaultTextStyle() {
        return defaultTextStyle;
    }
}
