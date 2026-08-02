package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b \u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0003R(\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "node", "", "registerModifier", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;)V", "unregisterModifier", "showSoftwareKeyboard", "hideSoftwareKeyboard", "startStylusHandwriting", "p0", "textInputModifierNode", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "getTextInputModifierNode", "()Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "LegacyPlatformTextInputNode"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LegacyPlatformTextInputServiceAdapter implements androidx.compose.ui.text.input.PlatformTextInputService {
    public static final int $stable = 8;
    private androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode textInputModifierNode;

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u0004\u0018\u00010\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Job;", "launchTextInputSession", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LegacyPlatformTextInputNode {
        androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates();

        androidx.compose.foundation.text.LegacyTextFieldState getLegacyTextFieldState();

        androidx.compose.ui.platform.SoftwareKeyboardController getSoftwareKeyboardController();

        androidx.compose.foundation.text.selection.TextFieldSelectionManager getTextFieldSelectionManager();

        androidx.compose.ui.platform.ViewConfiguration getViewConfiguration();

        kotlinx.coroutines.Job launchTextInputSession(kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSession, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> block);
    }

    public abstract void startStylusHandwriting();

    protected final androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    public final void registerModifier(androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode node) {
        if (this.textInputModifierNode != null) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = node;
    }

    public final void unregisterModifier(androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode node) {
        if (this.textInputModifierNode != node) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected textInputModifierNode to be ");
            sb.append(node);
            sb.append(" but was ");
            sb.append(this.textInputModifierNode);
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        this.textInputModifierNode = null;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController;
        androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController;
        androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }
}
