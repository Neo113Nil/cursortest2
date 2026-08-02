package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a4\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0012\u001a\u00060\u0014j\u0002`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"", "generateSemanticsId", "()I", "Landroidx/compose/ui/Modifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "semantics", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "clearAndSetSemantics", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/platform/InspectorInfo;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/platform/InspectorInfo;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/getHighSpeedVideoSizes;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicInteger;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsModifierKt {
    private static java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(0);

    public static final int generateSemanticsId() {
        return getHighResolutionOutputSizeshNQ4ISI.addAndGet(1);
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
    public static final void Camera2StreamConfigurationMap(androidx.compose.ui.platform.InspectorInfo inspectorInfo, androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
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
