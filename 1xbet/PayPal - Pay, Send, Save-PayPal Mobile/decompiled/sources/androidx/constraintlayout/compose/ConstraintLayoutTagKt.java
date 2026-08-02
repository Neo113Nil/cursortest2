package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a%\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0002\u0010\u0004\"\u0017\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "layoutId", "tag", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Measurable;", "", "getConstraintLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "constraintLayoutId", "getConstraintLayoutTag", "constraintLayoutTag"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintLayoutTagKt {
    public static /* synthetic */ androidx.compose.ui.Modifier layoutId$default(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return layoutId(modifier, str, str2);
    }

    public static final androidx.compose.ui.Modifier layoutId(androidx.compose.ui.Modifier modifier, final java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return androidx.compose.ui.layout.LayoutIdKt.layoutId(modifier, str);
        }
        return modifier.then(new androidx.constraintlayout.compose.ConstraintLayoutTag(str2, str, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("constraintLayoutId");
                inspectorInfo.setValue(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }

    public static final java.lang.Object getConstraintLayoutTag(androidx.compose.ui.layout.Measurable measurable) {
        java.lang.Object parentData = measurable.getParentData();
        androidx.constraintlayout.compose.ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof androidx.constraintlayout.compose.ConstraintLayoutTagParentData ? (androidx.constraintlayout.compose.ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getGetHighSpeedVideoFpsRangesFor();
        }
        return null;
    }

    public static final java.lang.Object getConstraintLayoutId(androidx.compose.ui.layout.Measurable measurable) {
        java.lang.Object parentData = measurable.getParentData();
        androidx.constraintlayout.compose.ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof androidx.constraintlayout.compose.ConstraintLayoutTagParentData ? (androidx.constraintlayout.compose.ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getCamera2StreamConfigurationMap();
        }
        return null;
    }
}
