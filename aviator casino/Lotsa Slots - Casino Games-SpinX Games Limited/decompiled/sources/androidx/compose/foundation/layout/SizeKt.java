package androidx.compose.foundation.layout;

/* compiled from: Size.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u001e\u0010\u0017\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001a\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011\u001a\u001e\u0010\u001e\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0019\u001a*\u0010 \u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0019\u001a&\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a>\u0010*\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001e\u0010/\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a*\u00101\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0019\u001a&\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010)\u001a>\u00106\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010.\u001a\u001e\u0010%\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0019\u001a*\u00109\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0011\u001a \u0010;\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010@\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020A2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010B\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020C2\b\b\u0002\u0010>\u001a\u00020?H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "defaultMinSize", "Landroidx/compose/ui/Modifier;", com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, "Landroidx/compose/ui/unit/Dp;", com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fraction", "", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "wrapContentSize", "Landroidx/compose/ui/Alignment;", "wrapContentWidth", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    private static final androidx.compose.foundation.layout.FillElement FillWholeMaxWidth = androidx.compose.foundation.layout.FillElement.INSTANCE.width(1.0f);
    private static final androidx.compose.foundation.layout.FillElement FillWholeMaxHeight = androidx.compose.foundation.layout.FillElement.INSTANCE.height(1.0f);
    private static final androidx.compose.foundation.layout.FillElement FillWholeMaxSize = androidx.compose.foundation.layout.FillElement.INSTANCE.size(1.0f);
    private static final androidx.compose.foundation.layout.WrapContentElement WrapContentWidthCenter = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.width(androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement WrapContentWidthStart = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.width(androidx.compose.ui.Alignment.INSTANCE.getStart(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement WrapContentHeightCenter = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.height(androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement WrapContentHeightTop = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.height(androidx.compose.ui.Alignment.INSTANCE.getTop(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement WrapContentSizeCenter = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.size(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement WrapContentSizeTopStart = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.size(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m622width3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f, 0.0f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("width");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m603height3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("height");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m618size6HolHcs(androidx.compose.ui.Modifier modifier, long j) {
        return m619sizeVpY3zN4(modifier, androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m624widthInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m623widthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m623widthInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f2, 0.0f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m605heightInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m604heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m604heightInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f2, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m621sizeInqDBjuR0$default(androidx.compose.ui.Modifier modifier, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m620sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m620sizeInqDBjuR0(androidx.compose.ui.Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f3, f4, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, androidx.compose.ui.unit.Dp.m4476boximpl(f2));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, androidx.compose.ui.unit.Dp.m4476boximpl(f3));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, androidx.compose.ui.unit.Dp.m4476boximpl(f4));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m614requiredWidth3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f, 0.0f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m606requiredHeight3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m610requiredSize6HolHcs(androidx.compose.ui.Modifier modifier, long j) {
        return m611requiredSizeVpY3zN4(modifier, androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m616requiredWidthInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m615requiredWidthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m615requiredWidthInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f2, 0.0f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m608requiredHeightInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m607requiredHeightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m607requiredHeightInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f2, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m613requiredSizeInqDBjuR0$default(androidx.compose.ui.Modifier modifier, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m612requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m612requiredSizeInqDBjuR0(androidx.compose.ui.Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f3, f4, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, androidx.compose.ui.unit.Dp.m4476boximpl(f2));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, androidx.compose.ui.unit.Dp.m4476boximpl(f3));
                inspectorInfo.getProperties().set(com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, androidx.compose.ui.unit.Dp.m4476boximpl(f4));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier fillMaxWidth$default(androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    public static final androidx.compose.ui.Modifier fillMaxWidth(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxWidth : androidx.compose.foundation.layout.FillElement.INSTANCE.width(f));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier fillMaxHeight$default(androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    public static final androidx.compose.ui.Modifier fillMaxHeight(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxHeight : androidx.compose.foundation.layout.FillElement.INSTANCE.height(f));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier fillMaxSize$default(androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    public static final androidx.compose.ui.Modifier fillMaxSize(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxSize : androidx.compose.foundation.layout.FillElement.INSTANCE.size(f));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier wrapContentWidth$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            horizontal = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }

    public static final androidx.compose.ui.Modifier wrapContentWidth(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z) {
        androidx.compose.foundation.layout.WrapContentElement width;
        if (kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()) && !z) {
            width = WrapContentWidthCenter;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getStart()) && !z) {
            width = WrapContentWidthStart;
        } else {
            width = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.width(horizontal, z);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier wrapContentHeight$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Vertical vertical, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vertical = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    public static final androidx.compose.ui.Modifier wrapContentHeight(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Vertical vertical, boolean z) {
        androidx.compose.foundation.layout.WrapContentElement height;
        if (kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()) && !z) {
            height = WrapContentHeightCenter;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.ui.Alignment.INSTANCE.getTop()) && !z) {
            height = WrapContentHeightTop;
        } else {
            height = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.height(vertical, z);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier wrapContentSize$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    public static final androidx.compose.ui.Modifier wrapContentSize(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, boolean z) {
        androidx.compose.foundation.layout.WrapContentElement size;
        if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.compose.ui.Alignment.INSTANCE.getCenter()) && !z) {
            size = WrapContentSizeCenter;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.compose.ui.Alignment.INSTANCE.getTopStart()) && !z) {
            size = WrapContentSizeTopStart;
        } else {
            size = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.size(alignment, z);
        }
        return modifier.then(size);
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m602defaultMinSizeVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m601defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m601defaultMinSizeVpY3zN4(androidx.compose.ui.Modifier modifier, float f, float f2) {
        return modifier.then(new androidx.compose.foundation.layout.UnspecifiedConstraintsElement(f, f2, null));
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m617size3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f, f, f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m619sizeVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f, f2, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set("height", androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m609requiredSize3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f, f, f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m611requiredSizeVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f, f2, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set("height", androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }
}
