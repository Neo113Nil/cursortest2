package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* compiled from: HomeTourScrollDebug.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J9\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J9\u0010\u0012\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourScrollDebug;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "log", "", "message", "logOverlayShowTransition", "step", "Lorg/betup/ui/tour/compose/TourStep;", "savedIndex", "", "savedOffset", "indexAtShow", "offsetAtShow", "(Lorg/betup/ui/tour/compose/TourStep;Ljava/lang/Integer;Ljava/lang/Integer;II)V", "logOverlayShowSettled", "index", "offset", "(Lorg/betup/ui/tour/compose/TourStep;IILjava/lang/Integer;Ljava/lang/Integer;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeTourScrollDebug {
    public static final int $stable = 0;
    public static final HomeTourScrollDebug INSTANCE = new HomeTourScrollDebug();
    private static final String TAG = "HomeTourScroll";

    public final void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    private HomeTourScrollDebug() {
    }

    public final void logOverlayShowTransition(TourStep step, Integer savedIndex, Integer savedOffset, int indexAtShow, int offsetAtShow) {
        Object obj = TypeDescription.Generic.OfWildcardType.SYMBOL;
        Object obj2 = savedIndex == null ? TypeDescription.Generic.OfWildcardType.SYMBOL : savedIndex;
        if (savedOffset != null) {
            obj = savedOffset;
        }
        log("overlayShow step=" + step + " savedScroll=" + obj2 + "/" + obj + " atShow=" + indexAtShow + "/" + offsetAtShow + " deltaIndex=" + (savedIndex != null ? Integer.valueOf(indexAtShow - savedIndex.intValue()) : null) + " deltaOffset=" + (savedOffset != null ? Integer.valueOf(offsetAtShow - savedOffset.intValue()) : null));
    }

    public final void logOverlayShowSettled(TourStep step, int index, int offset, Integer savedIndex, Integer savedOffset) {
        Object obj = TypeDescription.Generic.OfWildcardType.SYMBOL;
        Object obj2 = savedIndex;
        if (savedIndex == null) {
            obj2 = TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        if (savedOffset != null) {
            obj = savedOffset;
        }
        log("overlayShow+100ms step=" + step + " scroll=" + index + "/" + offset + " saved=" + obj2 + "/" + obj + " driftOffset=" + (savedOffset != null ? Integer.valueOf(offset - savedOffset.intValue()) : null));
    }
}
