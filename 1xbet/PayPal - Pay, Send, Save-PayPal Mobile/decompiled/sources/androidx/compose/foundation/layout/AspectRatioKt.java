package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\r\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "ratio", "", "matchHeightConstraintsFirst", "aspectRatio", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Constraints;", "", "width", "height", "isSatisfiedBy-NN6Ew-U", "(JII)Z", "isSatisfiedBy"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AspectRatioKt {
    public static /* synthetic */ androidx.compose.ui.Modifier aspectRatio$default(androidx.compose.ui.Modifier modifier, float f, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aspectRatio(modifier, f, z);
    }

    /* renamed from: isSatisfiedBy-NN6Ew-U, reason: not valid java name */
    public static final boolean m1619isSatisfiedByNN6EwU(long j, int i, int i2) {
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        if (i > androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) || m8556getMinWidthimpl > i) {
            return false;
        }
        return i2 <= androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) && androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) <= i2;
    }

    public static final androidx.compose.ui.Modifier aspectRatio(androidx.compose.ui.Modifier modifier, final float f, final boolean z) {
        return modifier.then(new androidx.compose.foundation.layout.AspectRatioElement(f, z, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("aspectRatio");
                inspectorInfo.getProperties().set("ratio", java.lang.Float.valueOf(f));
                inspectorInfo.getProperties().set("matchHeightConstraintsFirst", java.lang.Boolean.valueOf(z));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }
}
