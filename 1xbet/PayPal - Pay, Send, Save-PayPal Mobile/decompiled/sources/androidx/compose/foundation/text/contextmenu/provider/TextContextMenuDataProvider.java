package androidx.compose.foundation.text.contextmenu.provider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "destinationCoordinates", "Landroidx/compose/ui/geometry/Offset;", "position-tuRUvjQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", com.daon.sdk.face.license.License.FEATURE_POSITION, "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TextContextMenuDataProvider {
    androidx.compose.ui.geometry.Rect contentBounds(androidx.compose.ui.layout.LayoutCoordinates destinationCoordinates);

    androidx.compose.foundation.text.contextmenu.data.TextContextMenuData data();

    /* renamed from: position-tuRUvjQ */
    long mo2160positiontuRUvjQ(androidx.compose.ui.layout.LayoutCoordinates destinationCoordinates);
}
