package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a@\u0010\b\u001a\u00020\u0000*\u00020\u00002+\b\u0002\u0010\u0007\u001a%\b\u0001\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "onPreShowContextMenu", "showTextContextMenuOnSecondaryClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuGesturesModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier showTextContextMenuOnSecondaryClick$default(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        return showTextContextMenuOnSecondaryClick(modifier, function2);
    }

    public static final androidx.compose.ui.Modifier showTextContextMenuOnSecondaryClick(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return modifier.then(new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureElement(function2));
    }
}
