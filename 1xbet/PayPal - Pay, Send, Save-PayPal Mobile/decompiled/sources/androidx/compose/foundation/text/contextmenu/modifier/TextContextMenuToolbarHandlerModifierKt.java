package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001az\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012 \b\u0002\u0010\u0007\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032 \b\u0002\u0010\b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0019\u0010\f\u001a\u0015\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "requester", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onShow", "onHide", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/geometry/Rect;", "computeContentBounds", "textContextMenuToolbarHandler", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "rootContentBounds", "localCoordinates", "destinationCoordinates", "translateRootToDestination", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuToolbarHandlerModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier textContextMenuToolbarHandler$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        return textContextMenuToolbarHandler(modifier, toolbarRequester, function1, function12, function13);
    }

    public static final androidx.compose.ui.Modifier textContextMenuToolbarHandler(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function13) {
        return modifier.then(new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerElement(toolbarRequester, function1, function12, function13));
    }

    public static final androidx.compose.ui.geometry.Rect translateRootToDestination(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2) {
        if (!layoutCoordinates.isAttached() || !layoutCoordinates2.isAttached()) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        return androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(layoutCoordinates2.mo7362localPositionOfR5De75A(androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates), rect.m5787getTopLeftF1C5BW0()), rect.m5785getSizeNHjbRc());
    }
}
