package androidx.compose.foundation.text.contextmenu.builder;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "", "key", "", "label", "", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "", "Lkotlin/ExtensionFunctionType;", "onClick", "item", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "Landroid/view/textclassifier/TextClassification;", "textClassification", "index", "textClassificationItem", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuBuilderScope_androidKt {
    public static /* synthetic */ void item$default(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, java.lang.Object obj, java.lang.String str, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        item(textContextMenuBuilderScope, obj, str, i, function1);
    }

    public static final void item(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, java.lang.Object obj, java.lang.String str, int i, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, kotlin.Unit> function1) {
        textContextMenuBuilderScope.addComponent$foundation(new androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem(obj, str, i, function1));
    }

    public static final void textClassificationItem(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, java.lang.Object obj, android.view.textclassifier.TextClassification textClassification, int i) {
        textContextMenuBuilderScope.addComponent$foundation(new androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem(obj, textClassification, i));
    }
}
