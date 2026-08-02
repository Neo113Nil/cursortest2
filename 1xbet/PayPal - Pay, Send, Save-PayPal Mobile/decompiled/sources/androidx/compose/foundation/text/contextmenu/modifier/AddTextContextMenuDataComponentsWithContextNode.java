package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B&\u0012\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR-\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\u00078\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Landroid/content/Context;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddTextContextMenuDataComponentsWithContextNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode {
    kotlin.jvm.functions.Function2<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, ? super android.content.Context, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public AddTextContextMenuDataComponentsWithContextNode(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, ? super android.content.Context, kotlin.Unit> function2) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        delegate(new androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsNode(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode.this, (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) obj);
            }
        }));
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode addTextContextMenuDataComponentsWithContextNode, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope) {
        addTextContextMenuDataComponentsWithContextNode.getHighSpeedVideoFpsRangesFor.invoke(textContextMenuBuilderScope, androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(addTextContextMenuDataComponentsWithContextNode, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
        return kotlin.Unit.INSTANCE;
    }
}
