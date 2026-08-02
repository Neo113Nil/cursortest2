package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "", "Lkotlin/ExtensionFunctionType;", "builder", "appendTextContextMenuComponents", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "filterTextContextMenuComponents", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "collectTextContextMenuData", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuModifierKt {
    public static final androidx.compose.ui.Modifier appendTextContextMenuComponents(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsElement(function1));
    }

    public static final androidx.compose.ui.Modifier filterTextContextMenuComponents(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean> function1) {
        return modifier.then(new androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsElement(function1));
    }

    public static final androidx.compose.foundation.text.contextmenu.data.TextContextMenuData collectTextContextMenuData(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        final androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope = new androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope();
        final androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt$collectTextContextMenuData$1$1 textContextMenuModifierKt$collectTextContextMenuData$1$1 = new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt$collectTextContextMenuData$1$1(textContextMenuBuilderScope);
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt.m2161$r8$lambda$LLriKWEFE_LyCAYjmXR_goM8k(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope.this, (kotlin.jvm.functions.Function1) obj);
            }
        };
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(delegatableNode, androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuDataTraverseKey.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt.$r8$lambda$L293b28jBfitOXZ6WjW_Y5GQXl0(kotlin.jvm.functions.Function1.this, textContextMenuModifierKt$collectTextContextMenuData$1$1, (androidx.compose.ui.node.TraversableNode) obj));
            }
        });
        return textContextMenuBuilderScope.build$foundation();
    }

    public static /* synthetic */ boolean $r8$lambda$L293b28jBfitOXZ6WjW_Y5GQXl0(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.node.TraversableNode traversableNode) {
        if (traversableNode instanceof androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsNode) {
            function1.invoke(((androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsNode) traversableNode).getBuilder());
            return true;
        }
        if (traversableNode instanceof androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsNode) {
            function12.invoke(((androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsNode) traversableNode).getHighSpeedVideoFpsRanges);
            return true;
        }
        throw new java.lang.IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
    }

    /* renamed from: $r8$lambda$LLriK-WEFE_LyCA-YjmXR_goM8k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2161$r8$lambda$LLriKWEFE_LyCAYjmXR_goM8k(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, kotlin.jvm.functions.Function1 function1) {
        function1.invoke(textContextMenuBuilderScope);
        return kotlin.Unit.INSTANCE;
    }
}
