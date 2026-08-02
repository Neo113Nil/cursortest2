package Le0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.Layer;

/* loaded from: classes3.dex */
public final class v {
    public static final void a(@NotNull Style style) {
        Object obj;
        Intrinsics.checkNotNullParameter(style, "<this>");
        List<Layer> k11 = style.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getLayers(...)");
        Iterator<T> it = k11.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((Layer) obj).b(), "House number labels")) {
                    break;
                }
            }
        }
        Layer layer = (Layer) obj;
        if (layer != null) {
            double d11 = 1;
            layer.h((float) (layer.d() - d11));
            layer.g((float) (layer.c() - d11));
            layer.i(new org.maplibre.android.style.layers.c("text-padding", 14));
        }
    }
}
