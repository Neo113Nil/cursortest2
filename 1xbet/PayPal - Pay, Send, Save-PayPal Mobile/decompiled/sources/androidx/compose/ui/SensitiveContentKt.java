package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "isContentSensitive", "sensitiveContent", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SensitiveContentKt {
    public static /* synthetic */ androidx.compose.ui.Modifier sensitiveContent$default(androidx.compose.ui.Modifier modifier, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return sensitiveContent(modifier, z);
    }

    public static final androidx.compose.ui.Modifier sensitiveContent(androidx.compose.ui.Modifier modifier, boolean z) {
        return modifier.then(new androidx.compose.ui.SensitiveNodeElement(z));
    }
}
