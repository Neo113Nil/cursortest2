package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class TextContextMenuModifierKt$collectTextContextMenuData$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, ? extends java.lang.Boolean>, kotlin.Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, ? extends java.lang.Boolean> function1) {
        ((androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope) this.receiver).addFilter$foundation(function1);
        return kotlin.Unit.INSTANCE;
    }

    TextContextMenuModifierKt$collectTextContextMenuData$1$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0);
    }
}
