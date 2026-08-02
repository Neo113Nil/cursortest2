package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\n\u001a%\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\n\u001a9\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u0019\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u0019\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u0004\u001a!\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\n\u001a\u0019\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010\r\u001a%\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b#\u0010\n\u001a%\u0010&\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b%\u0010\n\u001a9\u0010(\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b'\u0010\u0019\u001a\u001b\u0010+\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010\u0004\u001a\u001b\u0010,\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b,\u0010\u0004\u001a\u001b\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b-\u0010\u0004\u001a%\u00102\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103\u001a%\u00105\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u0002042\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b5\u00106\u001a%\u00108\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u0002072\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b8\u00109\u001a%\u0010;\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b:\u0010\n\"\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>\"\u0014\u0010B\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>\"\u0014\u0010=\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\"\u0014\u0010A\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010E\"\u0014\u0010G\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010E\"\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010E\"\u0014\u0010I\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010E\"\u0014\u0010H\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010E"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "width-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "height-3ABfNKs", io.ktor.http.ContentDisposition.Parameters.Size, "size-3ABfNKs", "size-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "size-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "widthIn-VpY3zN4", "widthIn", "heightIn-VpY3zN4", "heightIn", "minWidth", "minHeight", "maxWidth", "maxHeight", "sizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "sizeIn", "requiredWidth-3ABfNKs", "requiredWidth", "requiredHeight-3ABfNKs", "requiredHeight", "requiredSize-3ABfNKs", "requiredSize", "requiredSize-VpY3zN4", "requiredSize-6HolHcs", "requiredWidthIn-VpY3zN4", "requiredWidthIn", "requiredHeightIn-VpY3zN4", "requiredHeightIn", "requiredSizeIn-qDBjuR0", "requiredSizeIn", "", "fraction", "fillMaxWidth", "fillMaxHeight", "fillMaxSize", "Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "unbounded", "wrapContentWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "wrapContentHeight", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "wrapContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/Modifier;", "defaultMinSize-VpY3zN4", "defaultMinSize", "Landroidx/compose/foundation/layout/FillElement;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/FillElement;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/WrapContentElement;", "getOutputFormats", "Landroidx/compose/foundation/layout/WrapContentElement;", "getInputFormats", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    private static final androidx.compose.foundation.layout.FillElement getHighSpeedVideoSizes = androidx.compose.foundation.layout.FillElement.INSTANCE.width(1.0f);
    private static final androidx.compose.foundation.layout.FillElement getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.FillElement.INSTANCE.height(1.0f);
    private static final androidx.compose.foundation.layout.FillElement Camera2StreamConfigurationMap = androidx.compose.foundation.layout.FillElement.INSTANCE.size(1.0f);
    private static final androidx.compose.foundation.layout.WrapContentElement getOutputFormats = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.width(androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement getInputFormats = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.width(androidx.compose.ui.Alignment.INSTANCE.getStart(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement getHighSpeedVideoFpsRanges = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.height(androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.height(androidx.compose.ui.Alignment.INSTANCE.getTop(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement getHighSpeedVideoSizesFor = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.size(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
    private static final androidx.compose.foundation.layout.WrapContentElement getOutputMinFrameDuration = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.size(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1741size6HolHcs(androidx.compose.ui.Modifier modifier, long j) {
        return m1742sizeVpY3zN4(modifier, androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1747widthInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1746widthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1728heightInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1727heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1744sizeInqDBjuR0$default(androidx.compose.ui.Modifier modifier, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1743sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1733requiredSize6HolHcs(androidx.compose.ui.Modifier modifier, long j) {
        return m1734requiredSizeVpY3zN4(modifier, androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1739requiredWidthInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1738requiredWidthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1731requiredHeightInVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1730requiredHeightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1736requiredSizeInqDBjuR0$default(androidx.compose.ui.Modifier modifier, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1735requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier fillMaxWidth$default(androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    public static final androidx.compose.ui.Modifier fillMaxWidth(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? getHighSpeedVideoSizes : androidx.compose.foundation.layout.FillElement.INSTANCE.width(f));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier fillMaxHeight$default(androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    public static final androidx.compose.ui.Modifier fillMaxHeight(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? getHighResolutionOutputSizeshNQ4ISI : androidx.compose.foundation.layout.FillElement.INSTANCE.height(f));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier fillMaxSize$default(androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    public static final androidx.compose.ui.Modifier fillMaxSize(androidx.compose.ui.Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? Camera2StreamConfigurationMap : androidx.compose.foundation.layout.FillElement.INSTANCE.size(f));
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
            width = getOutputFormats;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getStart()) && !z) {
            width = getInputFormats;
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
            height = getHighSpeedVideoFpsRanges;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.ui.Alignment.INSTANCE.getTop()) && !z) {
            height = getHighSpeedVideoFpsRangesFor;
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
            size = getHighSpeedVideoSizesFor;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(alignment, androidx.compose.ui.Alignment.INSTANCE.getTopStart()) && !z) {
            size = getOutputMinFrameDuration;
        } else {
            size = androidx.compose.foundation.layout.WrapContentElement.INSTANCE.size(alignment, z);
        }
        return modifier.then(size);
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1725defaultMinSizeVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1724defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1724defaultMinSizeVpY3zN4(androidx.compose.ui.Modifier modifier, float f, float f2) {
        return modifier.then(new androidx.compose.foundation.layout.UnspecifiedConstraintsElement(f, f2, null));
    }

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1745width3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f, 0.0f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("width");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1726height3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("height");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1740size3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f, f, f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName(io.ktor.http.ContentDisposition.Parameters.Size);
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1742sizeVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f, f2, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName(io.ktor.http.ContentDisposition.Parameters.Size);
                inspectorInfo.getProperties().set("width", androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set("height", androidx.compose.ui.unit.Dp.m8599boximpl(f2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1746widthInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f2, 0.0f, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1727heightInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f2, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1743sizeInqDBjuR0(androidx.compose.ui.Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f3, f4, true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set("minHeight", androidx.compose.ui.unit.Dp.m8599boximpl(f2));
                inspectorInfo.getProperties().set("maxWidth", androidx.compose.ui.unit.Dp.m8599boximpl(f3));
                inspectorInfo.getProperties().set("maxHeight", androidx.compose.ui.unit.Dp.m8599boximpl(f4));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1737requiredWidth3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f, 0.0f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1729requiredHeight3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1732requiredSize3ABfNKs(androidx.compose.ui.Modifier modifier, final float f) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f, f, f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1734requiredSizeVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f, f2, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set("height", androidx.compose.ui.unit.Dp.m8599boximpl(f2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1738requiredWidthInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, 0.0f, f2, 0.0f, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1730requiredHeightInVpY3zN4(androidx.compose.ui.Modifier modifier, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(0.0f, f, 0.0f, f2, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, androidx.compose.ui.unit.Dp.m8599boximpl(f2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1735requiredSizeInqDBjuR0(androidx.compose.ui.Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new androidx.compose.foundation.layout.SizeElement(f, f2, f3, f4, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set("minHeight", androidx.compose.ui.unit.Dp.m8599boximpl(f2));
                inspectorInfo.getProperties().set("maxWidth", androidx.compose.ui.unit.Dp.m8599boximpl(f3));
                inspectorInfo.getProperties().set("maxHeight", androidx.compose.ui.unit.Dp.m8599boximpl(f4));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }
}
