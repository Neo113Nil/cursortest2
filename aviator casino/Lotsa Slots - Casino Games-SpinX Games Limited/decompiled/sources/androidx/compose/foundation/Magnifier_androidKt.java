package androidx.compose.foundation;

/* compiled from: Magnifier.android.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001\u001a\u0094\u0001\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\b\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a¬\u0001\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\b\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\" \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "isPlatformMagnifierSupported", "", "sdkVersion", "", "magnifier", "Landroidx/compose/ui/Modifier;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clip", "magnifier-UpNRX3w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FJFFZ)Landroidx/compose/ui/Modifier;", "useTextDefault", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "magnifier-jPUL71Q", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Magnifier_androidKt {
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>> MagnifierPositionInRoot = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean isPlatformMagnifierSupported(int i) {
        return i >= 28;
    }

    public static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m280magnifierUpNRX3w(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> function13, float f, long j, float f2, float f3, boolean z) {
        return m283magnifierjPUL71Q$default(modifier, function1, function12, function13, f, false, j, f2, f3, z, null, 512, null);
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m283magnifierjPUL71Q$default(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory, int i, java.lang.Object obj) {
        return m282magnifierjPUL71Q(modifier, function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f2, (i & 128) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f3, (i & 256) != 0 ? true : z2, (i & 512) == 0 ? platformMagnifierFactory : null);
    }

    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m282magnifierjPUL71Q(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> function13, final float f, boolean z, final long j, final float f2, final float f3, final boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new androidx.compose.foundation.MagnifierElement(function1, function12, function13, f, z, j, f2, f3, z2, platformMagnifierFactory == null ? androidx.compose.foundation.PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return androidx.compose.ui.platform.InspectableValueKt.inspectableWrapper(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.Magnifier_androidKt$magnifier-jPUL71Q$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", kotlin.jvm.functions.Function1.this);
                inspectorInfo.getProperties().set("magnifierCenter", function12);
                inspectorInfo.getProperties().set("zoom", java.lang.Float.valueOf(f));
                inspectorInfo.getProperties().set("size", androidx.compose.ui.unit.DpSize.m4564boximpl(j));
                inspectorInfo.getProperties().set("cornerRadius", androidx.compose.ui.unit.Dp.m4476boximpl(f2));
                inspectorInfo.getProperties().set("elevation", androidx.compose.ui.unit.Dp.m4476boximpl(f3));
                inspectorInfo.getProperties().set("clippingEnabled", java.lang.Boolean.valueOf(z2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), androidx.compose.ui.Modifier.INSTANCE);
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = android.os.Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }
}
