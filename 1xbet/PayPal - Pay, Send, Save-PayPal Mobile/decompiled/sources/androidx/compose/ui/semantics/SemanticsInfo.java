package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/layout/LayoutInfo;", "", "isTransparent", "()Z", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "getParentInfo", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "parentInfo", "", "getChildrenInfo", "()Ljava/util/List;", "childrenInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SemanticsInfo extends androidx.compose.ui.layout.LayoutInfo {
    java.util.List<androidx.compose.ui.semantics.SemanticsInfo> getChildrenInfo();

    @Override // androidx.compose.ui.layout.LayoutInfo
    androidx.compose.ui.semantics.SemanticsInfo getParentInfo();

    androidx.compose.ui.semantics.SemanticsConfiguration getSemanticsConfiguration();

    boolean isTransparent();
}
