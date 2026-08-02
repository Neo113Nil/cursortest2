package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012$\b\u0002\u0010\f\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010 \u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b \u0010!JT\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062$\b\u0002\u0010\f\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001fR6\u0010\f\u001a\u001e\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010!R\u0014\u00109\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010=\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u0014\u0010:\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u0014\u0010<\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010>\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010AR\u0014\u0010B\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010AR\u0014\u00107\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010C\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010A"}, d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "contentOffset", "Landroidx/compose/ui/unit/Density;", "density", "", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "component1-RKDOV3M", "()J", "component1", "component2", "()Landroidx/compose/ui/unit/Density;", "component3", "()I", "component4", "()Lkotlin/jvm/functions/Function2;", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;)Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getContentOffset-RKDOV3M", "Landroidx/compose/ui/unit/Density;", "getDensity", com.visa.cbp.getEncExpo.warmup, "getVerticalMargin", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "getOutputMinFrameDuration", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "getInputSizeshNQ4ISI", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "getHighSpeedVideoSizesFor", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DropdownMenuPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Horizontal getHighResolutionOutputSizeshNQ4ISI;
    private final long contentOffset;
    private final androidx.compose.ui.unit.Density density;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Vertical getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Horizontal getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Vertical getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Vertical getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Vertical getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Horizontal getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Vertical Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.MenuPosition.Horizontal getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit> onPositionCalculated;
    private final int verticalMargin;

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, androidx.compose.ui.unit.Density density, int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntRect, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit> function2) {
        this.contentOffset = j;
        this.density = density;
        this.verticalMargin = i;
        this.onPositionCalculated = function2;
        int mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpOffset.m8662getXD9Ej5fM(j));
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.material3.internal.MenuPosition.INSTANCE.startToAnchorStart(mo1412roundToPx0680j_4);
        this.getHighSpeedVideoSizes = androidx.compose.material3.internal.MenuPosition.INSTANCE.endToAnchorEnd(mo1412roundToPx0680j_4);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.material3.internal.MenuPosition.INSTANCE.leftToWindowLeft(0);
        this.getHighSpeedVideoFpsRanges = androidx.compose.material3.internal.MenuPosition.INSTANCE.rightToWindowRight(0);
        int mo1412roundToPx0680j_42 = density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpOffset.m8664getYD9Ej5fM(j));
        this.Camera2StreamConfigurationMap = androidx.compose.material3.internal.MenuPosition.INSTANCE.topToAnchorBottom(mo1412roundToPx0680j_42);
        this.getInputFormats = androidx.compose.material3.internal.MenuPosition.INSTANCE.bottomToAnchorTop(mo1412roundToPx0680j_42);
        this.getHighSpeedVideoSizesFor = androidx.compose.material3.internal.MenuPosition.INSTANCE.centerToAnchorTop(mo1412roundToPx0680j_42);
        this.getOutputMinFrameDuration = androidx.compose.material3.internal.MenuPosition.INSTANCE.topToWindowTop(i);
        this.getOutputFormats = androidx.compose.material3.internal.MenuPosition.INSTANCE.bottomToWindowBottom(i);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m4299getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, androidx.compose.ui.unit.Density density, int i, kotlin.jvm.functions.Function2 function2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i2 & 4) != 0 ? density.mo1412roundToPx0680j_4(androidx.compose.material3.MenuKt.getMenuVerticalMargin()) : i, (i2 & 8) != 0 ? new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function2, null);
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        androidx.compose.material3.internal.MenuPosition.Horizontal horizontal;
        int i;
        androidx.compose.material3.internal.MenuPosition.Vertical vertical;
        int i2;
        int i3;
        androidx.compose.material3.internal.MenuPosition.Horizontal[] horizontalArr = new androidx.compose.material3.internal.MenuPosition.Horizontal[3];
        horizontalArr[0] = this.getHighSpeedVideoFpsRangesFor;
        horizontalArr[1] = this.getHighSpeedVideoSizes;
        char c = ' ';
        int i4 = (int) (windowSize >> 32);
        if (androidx.compose.ui.unit.IntOffset.m8729getXimpl(anchorBounds.m8753getCenternOccac()) < i4 / 2) {
            horizontal = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            horizontal = this.getHighSpeedVideoFpsRanges;
        }
        horizontalArr[2] = horizontal;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) horizontalArr);
        int size = listOf.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i = 0;
                break;
            }
            int i6 = (int) (popupContentSize >> c);
            int i7 = size;
            int i8 = i5;
            java.util.List list = listOf;
            int i9 = i4;
            i = ((androidx.compose.material3.internal.MenuPosition.Horizontal) listOf.get(i5)).mo4270position95KtPRI(anchorBounds, windowSize, i6, layoutDirection);
            if (i8 == kotlin.collections.CollectionsKt.getLastIndex(list) || (i >= 0 && i6 + i <= i9)) {
                break;
            }
            i5 = i8 + 1;
            size = i7;
            i4 = i9;
            listOf = list;
            c = ' ';
        }
        androidx.compose.material3.internal.MenuPosition.Vertical[] verticalArr = new androidx.compose.material3.internal.MenuPosition.Vertical[4];
        verticalArr[0] = this.Camera2StreamConfigurationMap;
        verticalArr[1] = this.getInputFormats;
        verticalArr[2] = this.getHighSpeedVideoSizesFor;
        int i10 = (int) (windowSize & 4294967295L);
        if (androidx.compose.ui.unit.IntOffset.m8730getYimpl(anchorBounds.m8753getCenternOccac()) < i10 / 2) {
            vertical = this.getOutputMinFrameDuration;
        } else {
            vertical = this.getOutputFormats;
        }
        verticalArr[3] = vertical;
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) verticalArr);
        int size2 = listOf2.size();
        int i11 = 0;
        while (i11 < size2) {
            int i12 = size2;
            int i13 = (int) (popupContentSize & 4294967295L);
            int mo4271positionJVtK1S4 = ((androidx.compose.material3.internal.MenuPosition.Vertical) listOf2.get(i11)).mo4271positionJVtK1S4(anchorBounds, windowSize, i13);
            if (i11 == kotlin.collections.CollectionsKt.getLastIndex(listOf2) || (mo4271positionJVtK1S4 >= (i3 = this.verticalMargin) && i13 + mo4271positionJVtK1S4 <= i10 - i3)) {
                i2 = mo4271positionJVtK1S4;
                break;
            }
            i11++;
            size2 = i12;
        }
        i2 = 0;
        long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i << 32) | (i2 & 4294967295L));
        this.onPositionCalculated.invoke(anchorBounds, androidx.compose.ui.unit.IntRectKt.m8762IntRectVbeCjmY(m8723constructorimpl, popupContentSize));
        return m8723constructorimpl;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DropdownMenuPositionProvider(contentOffset=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.DpOffset.m8669toStringimpl(this.contentOffset));
        sb.append(", density=");
        sb.append(this.density);
        sb.append(", verticalMargin=");
        sb.append(this.verticalMargin);
        sb.append(", onPositionCalculated=");
        sb.append(this.onPositionCalculated);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((androidx.compose.ui.unit.DpOffset.m8666hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + java.lang.Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.internal.DropdownMenuPositionProvider)) {
            return false;
        }
        androidx.compose.material3.internal.DropdownMenuPositionProvider dropdownMenuPositionProvider = (androidx.compose.material3.internal.DropdownMenuPositionProvider) other;
        return androidx.compose.ui.unit.DpOffset.m8661equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && kotlin.jvm.internal.Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && kotlin.jvm.internal.Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final androidx.compose.material3.internal.DropdownMenuPositionProvider m4298copyuVxBXkw(long contentOffset, androidx.compose.ui.unit.Density density, int verticalMargin, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntRect, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit> onPositionCalculated) {
        return new androidx.compose.material3.internal.DropdownMenuPositionProvider(contentOffset, density, verticalMargin, onPositionCalculated, null);
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit> component4() {
        return this.onPositionCalculated;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.internal.DropdownMenuPositionProvider m4296copyuVxBXkw$default(androidx.compose.material3.internal.DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, androidx.compose.ui.unit.Density density, int i, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        androidx.compose.ui.unit.Density density2 = density;
        if ((i2 & 4) != 0) {
            i = dropdownMenuPositionProvider.verticalMargin;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m4298copyuVxBXkw(j2, density2, i3, function2);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, androidx.compose.ui.unit.Density density, int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, i, function2);
    }
}
