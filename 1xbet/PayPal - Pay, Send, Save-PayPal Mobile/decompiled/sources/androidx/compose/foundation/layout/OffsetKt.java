package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u0006\u0010\r\u001a*\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\b\u0010\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "x", "y", "offset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset", "absoluteOffset-VpY3zN4", "absoluteOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OffsetKt {
    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1678offsetVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.OffsetElement(f, f2, true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.OffsetKt.getHighSpeedVideoFpsRanges(f, f2, (androidx.compose.ui.platform.InspectorInfo) obj);
                return highSpeedVideoFpsRanges;
            }
        }, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(float f, float f2, androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("offset");
        inspectorInfo.getProperties().set("x", androidx.compose.ui.unit.Dp.m8599boximpl(f));
        inspectorInfo.getProperties().set("y", androidx.compose.ui.unit.Dp.m8599boximpl(f2));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1676absoluteOffsetVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.OffsetElement(f, f2, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.OffsetKt.getHighSpeedVideoFpsRangesFor(f, f2, (androidx.compose.ui.platform.InspectorInfo) obj);
                return highSpeedVideoFpsRangesFor;
            }
        }, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(float f, float f2, androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absoluteOffset");
        inspectorInfo.getProperties().set("x", androidx.compose.ui.unit.Dp.m8599boximpl(f));
        inspectorInfo.getProperties().set("y", androidx.compose.ui.unit.Dp.m8599boximpl(f2));
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier offset(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset> function1) {
        return modifier.then(new androidx.compose.foundation.layout.OffsetPxElement(function1, true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.OffsetKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.platform.InspectorInfo) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("offset");
        inspectorInfo.getProperties().set("offset", function1);
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier absoluteOffset(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset> function1) {
        return modifier.then(new androidx.compose.foundation.layout.OffsetPxElement(function1, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.layout.OffsetKt.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.platform.InspectorInfo) obj);
                return Camera2StreamConfigurationMap;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absoluteOffset");
        inspectorInfo.getProperties().set("offset", function1);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1679offsetVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return m1678offsetVpY3zN4(modifier, f, f2);
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1677absoluteOffsetVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return m1676absoluteOffsetVpY3zN4(modifier, f, f2);
    }
}
