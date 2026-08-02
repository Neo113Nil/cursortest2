package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B>\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/material3/BasicAlertDialogOverrideScope;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function0;", "getOnDismissRequest", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/window/DialogProperties;", "getProperties", "()Landroidx/compose/ui/window/DialogProperties;", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicAlertDialogOverrideScope {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final androidx.compose.ui.Modifier modifier;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest;
    private final androidx.compose.ui.window.DialogProperties properties;

    /* JADX WARN: Multi-variable type inference failed */
    public BasicAlertDialogOverrideScope(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.ui.window.DialogProperties dialogProperties, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.onDismissRequest = function0;
        this.modifier = modifier;
        this.properties = dialogProperties;
        this.content = function2;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismissRequest() {
        return this.onDismissRequest;
    }

    public /* synthetic */ BasicAlertDialogOverrideScope(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier.Companion companion, androidx.compose.ui.window.DialogProperties dialogProperties, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? androidx.compose.ui.Modifier.INSTANCE : companion, (i & 4) != 0 ? new androidx.compose.ui.window.DialogProperties(false, false, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : dialogProperties, function2);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final androidx.compose.ui.window.DialogProperties getProperties() {
        return this.properties;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }
}
