package androidx.compose.material;

/* compiled from: Menu.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B4\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\nJ5\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003JF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "copy", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;)Landroidx/compose/material/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DropdownMenuPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {
    private final long contentOffset;
    private final androidx.compose.ui.unit.Density density;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material.DropdownMenuPositionProvider m1376copyrOJDEFc$default(androidx.compose.material.DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i & 4) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1378copyrOJDEFc(j, density, function2);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit> component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc, reason: not valid java name */
    public final androidx.compose.material.DropdownMenuPositionProvider m1378copyrOJDEFc(long contentOffset, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntRect, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit> onPositionCalculated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        return new androidx.compose.material.DropdownMenuPositionProvider(contentOffset, density, onPositionCalculated, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.DropdownMenuPositionProvider)) {
            return false;
        }
        androidx.compose.material.DropdownMenuPositionProvider dropdownMenuPositionProvider = (androidx.compose.material.DropdownMenuPositionProvider) other;
        return androidx.compose.ui.unit.DpOffset.m4538equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && kotlin.jvm.internal.Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((androidx.compose.ui.unit.DpOffset.m4543hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public java.lang.String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((java.lang.Object) androidx.compose.ui.unit.DpOffset.m4546toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntRect, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit> function2) {
        this.contentOffset = j;
        this.density = density;
        this.onPositionCalculated = function2;
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1379getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, androidx.compose.ui.unit.Density density, androidx.compose.material.DropdownMenuPositionProvider.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i & 4) != 0 ? new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit>() { // from class: androidx.compose.material.DropdownMenuPositionProvider.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.unit.IntRect intRect2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRect, "<anonymous parameter 0>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRect2, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.unit.IntRect intRect2) {
                invoke2(intRect, intRect2);
                return kotlin.Unit.INSTANCE;
            }
        } : anonymousClass1, null);
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo1002calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        kotlin.sequences.Sequence sequenceOf;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int mo309roundToPx0680j_4 = this.density.mo309roundToPx0680j_4(androidx.compose.material.MenuKt.getMenuVerticalMargin());
        int mo309roundToPx0680j_42 = this.density.mo309roundToPx0680j_4(androidx.compose.ui.unit.DpOffset.m4539getXD9Ej5fM(this.contentOffset));
        int mo309roundToPx0680j_43 = this.density.mo309roundToPx0680j_4(androidx.compose.ui.unit.DpOffset.m4541getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + mo309roundToPx0680j_42;
        int right = (anchorBounds.getRight() - mo309roundToPx0680j_42) - androidx.compose.ui.unit.IntSize.m4652getWidthimpl(popupContentSize);
        int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(windowSize) - androidx.compose.ui.unit.IntSize.m4652getWidthimpl(popupContentSize);
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            java.lang.Integer[] numArr = new java.lang.Integer[3];
            numArr[0] = java.lang.Integer.valueOf(left);
            numArr[1] = java.lang.Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                m4652getWidthimpl = 0;
            }
            numArr[2] = java.lang.Integer.valueOf(m4652getWidthimpl);
            sequenceOf = kotlin.sequences.SequencesKt.sequenceOf(numArr);
        } else {
            java.lang.Integer[] numArr2 = new java.lang.Integer[3];
            numArr2[0] = java.lang.Integer.valueOf(right);
            numArr2[1] = java.lang.Integer.valueOf(left);
            if (anchorBounds.getRight() <= androidx.compose.ui.unit.IntSize.m4652getWidthimpl(windowSize)) {
                m4652getWidthimpl = 0;
            }
            numArr2[2] = java.lang.Integer.valueOf(m4652getWidthimpl);
            sequenceOf = kotlin.sequences.SequencesKt.sequenceOf(numArr2);
        }
        java.util.Iterator it = sequenceOf.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((java.lang.Number) obj2).intValue();
            if (intValue >= 0 && intValue + androidx.compose.ui.unit.IntSize.m4652getWidthimpl(popupContentSize) <= androidx.compose.ui.unit.IntSize.m4652getWidthimpl(windowSize)) {
                break;
            }
        }
        java.lang.Integer num = (java.lang.Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = java.lang.Math.max(anchorBounds.getBottom() + mo309roundToPx0680j_43, mo309roundToPx0680j_4);
        int top = (anchorBounds.getTop() - mo309roundToPx0680j_43) - androidx.compose.ui.unit.IntSize.m4651getHeightimpl(popupContentSize);
        java.util.Iterator it2 = kotlin.sequences.SequencesKt.sequenceOf(java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(top), java.lang.Integer.valueOf(anchorBounds.getTop() - (androidx.compose.ui.unit.IntSize.m4651getHeightimpl(popupContentSize) / 2)), java.lang.Integer.valueOf((androidx.compose.ui.unit.IntSize.m4651getHeightimpl(windowSize) - androidx.compose.ui.unit.IntSize.m4651getHeightimpl(popupContentSize)) - mo309roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            int intValue2 = ((java.lang.Number) next).intValue();
            if (intValue2 >= mo309roundToPx0680j_4 && intValue2 + androidx.compose.ui.unit.IntSize.m4651getHeightimpl(popupContentSize) <= androidx.compose.ui.unit.IntSize.m4651getHeightimpl(windowSize) - mo309roundToPx0680j_4) {
                obj = next;
                break;
            }
        }
        java.lang.Integer num2 = (java.lang.Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new androidx.compose.ui.unit.IntRect(right, top, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(popupContentSize) + right, androidx.compose.ui.unit.IntSize.m4651getHeightimpl(popupContentSize) + top));
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(right, top);
    }
}
