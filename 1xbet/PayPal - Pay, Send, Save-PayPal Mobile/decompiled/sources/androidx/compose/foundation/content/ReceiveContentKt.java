package androidx.compose.foundation.content;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "contentReceiver", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/content/ReceiveContentListener;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReceiveContentKt {
    public static final androidx.compose.ui.Modifier contentReceiver(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
        return modifier.then(new androidx.compose.foundation.content.ReceiveContentElement(receiveContentListener));
    }
}
