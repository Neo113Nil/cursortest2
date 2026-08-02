package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsInfo;", "nearestParentThatHasSemantics", "(Landroidx/compose/ui/semantics/SemanticsInfo;)Landroidx/compose/ui/semantics/SemanticsInfo;", "findMergingSemanticsParent", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "mergedSemanticsConfiguration", "(Landroidx/compose/ui/semantics/SemanticsInfo;)Landroidx/compose/ui/semantics/SemanticsConfiguration;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsInfoKt {
    public static final androidx.compose.ui.semantics.SemanticsInfo nearestParentThatHasSemantics(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo) {
        for (androidx.compose.ui.semantics.SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            if (parentInfo.getSemanticsConfiguration() != null) {
                return parentInfo;
            }
        }
        return null;
    }

    public static final androidx.compose.ui.semantics.SemanticsInfo findMergingSemanticsParent(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo) {
        for (androidx.compose.ui.semantics.SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = parentInfo.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                return parentInfo;
            }
        }
        return null;
    }

    public static final androidx.compose.ui.semantics.SemanticsConfiguration mergedSemanticsConfiguration(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo) {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants() && !semanticsConfiguration.getIsClearingSemantics()) {
            semanticsConfiguration = semanticsConfiguration.copy();
            androidx.collection.MutableObjectList mutableObjectList = new androidx.collection.MutableObjectList(semanticsInfo.getChildrenInfo().size());
            mutableObjectList.addAll((java.util.List) semanticsInfo.getChildrenInfo());
            while (mutableObjectList.isNotEmpty()) {
                androidx.compose.ui.semantics.SemanticsInfo semanticsInfo2 = (androidx.compose.ui.semantics.SemanticsInfo) mutableObjectList.removeAt(mutableObjectList._size - 1);
                androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration2 = semanticsInfo2.getSemanticsConfiguration();
                if (semanticsConfiguration2 != null && !semanticsConfiguration2.getIsMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui(semanticsConfiguration2);
                    if (!semanticsConfiguration2.getIsClearingSemantics()) {
                        mutableObjectList.addAll((java.util.List) semanticsInfo2.getChildrenInfo());
                    }
                }
            }
        }
        return semanticsConfiguration;
    }
}
