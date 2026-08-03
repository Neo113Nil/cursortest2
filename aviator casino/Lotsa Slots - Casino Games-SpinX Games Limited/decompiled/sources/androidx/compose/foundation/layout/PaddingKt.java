package androidx.compose.foundation.layout;

/* compiled from: Padding.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL, com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", com.helpshift.proactive.InAppViewConstants.PADDING, "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaddingKt {
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m571paddingqDBjuR0(androidx.compose.ui.Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new androidx.compose.foundation.layout.PaddingElement(f, f2, f3, f4, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
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
                inspectorInfo.setName(com.helpshift.proactive.InAppViewConstants.PADDING);
                inspectorInfo.getProperties().set("start", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set("top", androidx.compose.ui.unit.Dp.m4476boximpl(f2));
                inspectorInfo.getProperties().set("end", androidx.compose.ui.unit.Dp.m4476boximpl(f3));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, androidx.compose.ui.unit.Dp.m4476boximpl(f4));
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m569paddingVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.PaddingElement(f, f2, f, f2, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$2
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
                inspectorInfo.setName(com.helpshift.proactive.InAppViewConstants.PADDING);
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL, androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        }, null));
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m568padding3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.PaddingElement(f, f, f, f, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
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
                inspectorInfo.setName(com.helpshift.proactive.InAppViewConstants.PADDING);
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        }, null));
    }

    public static final androidx.compose.ui.Modifier padding(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.PaddingValues paddingValues) {
        return modifier.then(new androidx.compose.foundation.layout.PaddingValuesElement(paddingValues, new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
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
                inspectorInfo.setName(com.helpshift.proactive.InAppViewConstants.PADDING);
                inspectorInfo.getProperties().set("paddingValues", androidx.compose.foundation.layout.PaddingValues.this);
            }
        }));
    }

    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m566absolutePaddingqDBjuR0(androidx.compose.ui.Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new androidx.compose.foundation.layout.PaddingElement(f, f2, f3, f4, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
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
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set("left", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set("top", androidx.compose.ui.unit.Dp.m4476boximpl(f2));
                inspectorInfo.getProperties().set("right", androidx.compose.ui.unit.Dp.m4476boximpl(f3));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, androidx.compose.ui.unit.Dp.m4476boximpl(f4));
            }
        }, null));
    }

    public static final float calculateStartPadding(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            return paddingValues.mo519calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo520calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateEndPadding(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            return paddingValues.mo520calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo519calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4(float f) {
        return new androidx.compose.foundation.layout.PaddingValuesImpl(f, f, f, f, null);
    }

    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final androidx.compose.foundation.layout.PaddingValues m562PaddingValuesYgX7TsA(float f, float f2) {
        return new androidx.compose.foundation.layout.PaddingValuesImpl(f, f2, f, f2, null);
    }

    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final androidx.compose.foundation.layout.PaddingValues m564PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new androidx.compose.foundation.layout.PaddingValuesImpl(f, f2, f3, f4, null);
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m572paddingqDBjuR0$default(androidx.compose.ui.Modifier modifier, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        return m571paddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m570paddingVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        return m569paddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m567absolutePaddingqDBjuR0$default(androidx.compose.ui.Modifier modifier, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        return m566absolutePaddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.layout.PaddingValues m563PaddingValuesYgX7TsA$default(float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        return m562PaddingValuesYgX7TsA(f, f2);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.layout.PaddingValues m565PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        return m564PaddingValuesa9UjIt4(f, f2, f3, f4);
    }
}
