package androidx.compose.ui.semantics;

/* compiled from: SemanticsModifier.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a#\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000f\u001a-\u0010\u0010\u001a\u00020\u000b*\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000f\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "generateSemanticsId", "", "addSemanticsPropertiesFrom", "", "Landroidx/compose/ui/platform/InspectorInfo;", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "clearAndSetSemantics", "Landroidx/compose/ui/Modifier;", "properties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "semantics", "mergeDescendants", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsModifierKt {
    private static java.util.concurrent.atomic.AtomicInteger lastIdentifier = new java.util.concurrent.atomic.AtomicInteger(0);

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier semantics$default(androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semantics(modifier, z, function1);
    }

    public static final androidx.compose.ui.Modifier semantics(androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.semantics.AppendedSemanticsElement(z, function1));
    }

    public static final androidx.compose.ui.Modifier clearAndSetSemantics(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.semantics.ClearAndSetSemanticsElement(function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(androidx.compose.ui.platform.InspectorInfo inspectorInfo, androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        androidx.compose.ui.platform.ValueElementSequence properties = inspectorInfo.getProperties();
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration2 = semanticsConfiguration;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(semanticsConfiguration2, 10)), 16));
        for (java.util.Map.Entry<? extends androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object> entry : semanticsConfiguration2) {
            androidx.compose.ui.semantics.SemanticsPropertyKey<?> key = entry.getKey();
            kotlin.Pair pair = kotlin.TuplesKt.to(key.getName(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        properties.set("properties", linkedHashMap);
    }
}
