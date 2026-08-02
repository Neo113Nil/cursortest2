package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR+\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/InlineTextContent;", "", "Landroidx/compose/ui/text/Placeholder;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "children", "<init>", "(Landroidx/compose/ui/text/Placeholder;Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/ui/text/Placeholder;", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "Lkotlin/jvm/functions/Function3;", "getChildren", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> children;
    private final androidx.compose.ui.text.Placeholder placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(androidx.compose.ui.text.Placeholder placeholder, kotlin.jvm.functions.Function3<? super java.lang.String, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.placeholder = placeholder;
        this.children = function3;
    }

    public final androidx.compose.ui.text.Placeholder getPlaceholder() {
        return this.placeholder;
    }

    public final kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getChildren() {
        return this.children;
    }
}
