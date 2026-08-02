package androidx.compose.ui.tooling;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ComposeViewAdapter$processViewInfos$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function4<androidx.compose.runtime.tooling.CompositionGroup, androidx.compose.ui.tooling.data.SourceContext, java.util.List<? extends androidx.compose.ui.tooling.ViewInfo>, java.util.List<? extends androidx.compose.ui.tooling.ViewInfo>, androidx.compose.ui.tooling.ViewInfo> {
    @Override // kotlin.jvm.functions.Function4
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.ui.tooling.ViewInfo invoke(androidx.compose.runtime.tooling.CompositionGroup compositionGroup, androidx.compose.ui.tooling.data.SourceContext sourceContext, java.util.List<androidx.compose.ui.tooling.ViewInfo> list, java.util.List<androidx.compose.ui.tooling.ViewInfo> list2) {
        return androidx.compose.ui.tooling.ComposeViewAdapter.access$toViewInfoFactory((androidx.compose.ui.tooling.ComposeViewAdapter) this.receiver, compositionGroup, sourceContext, list, list2);
    }

    ComposeViewAdapter$processViewInfos$2(java.lang.Object obj) {
        super(4, obj, androidx.compose.ui.tooling.ComposeViewAdapter.class, "toViewInfoFactory", "toViewInfoFactory(Landroidx/compose/runtime/tooling/CompositionGroup;Landroidx/compose/ui/tooling/data/SourceContext;Ljava/util/List;Ljava/util/List;)Landroidx/compose/ui/tooling/ViewInfo;", 0);
    }
}
