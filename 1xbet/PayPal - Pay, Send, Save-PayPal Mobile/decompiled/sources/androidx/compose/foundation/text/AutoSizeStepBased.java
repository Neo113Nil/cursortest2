package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "Landroidx/compose/ui/unit/TextUnit;", "p0", "p1", "p2", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/text/AnnotatedString;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "getFontSize", "Landroidx/compose/ui/text/TextLayoutResult;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/text/TextLayoutResult;)Z", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AutoSizeStepBased implements androidx.compose.foundation.text.TextAutoSize {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;
    private final long getHighSpeedVideoSizes;

    private AutoSizeStepBased(long j, long j2, long j3) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoSizes = j3;
        if (androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(j, androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE())) {
            throw new java.lang.IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(j2, androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE())) {
            throw new java.lang.IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(j3, androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE())) {
            throw new java.lang.IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(this.getHighSpeedVideoFpsRangesFor), androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(j2))) {
            long j4 = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.unit.TextUnitKt.m8809checkArithmeticNB67dxo(j4, j2);
            if (java.lang.Float.compare(androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j4), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j2)) > 0) {
                this.getHighSpeedVideoFpsRangesFor = j2;
            }
        }
        if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(j3), androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA())) {
            long sp = androidx.compose.ui.unit.TextUnitKt.getSp(1.0E-4f);
            androidx.compose.ui.unit.TextUnitKt.m8809checkArithmeticNB67dxo(j3, sp);
            if (java.lang.Float.compare(androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j3), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(sp)) < 0) {
                throw new java.lang.IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (androidx.compose.ui.unit.TextUnit.m8795getValueimpl(this.getHighSpeedVideoFpsRangesFor) < 0.0f) {
            throw new java.lang.IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j2) < 0.0f) {
            throw new java.lang.IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public final long mo1979getFontSizeCi0_558(androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j, androidx.compose.ui.text.AnnotatedString annotatedString) {
        float f = textAutoSizeLayoutScope.mo1417toPxR2X_6o(this.getHighSpeedVideoSizes);
        float f2 = textAutoSizeLayoutScope.mo1417toPxR2X_6o(this.getHighSpeedVideoFpsRangesFor);
        float f3 = textAutoSizeLayoutScope.mo1417toPxR2X_6o(this.Camera2StreamConfigurationMap);
        float f4 = (f2 + f3) / 2.0f;
        float f5 = f2;
        float f6 = f3;
        while (f6 - f5 >= f) {
            if (getHighSpeedVideoSizes(textAutoSizeLayoutScope.mo2352performLayout5ZSfY2I(j, annotatedString, textAutoSizeLayoutScope.mo1421toSpkPz2Gy4(f4)))) {
                f6 = f4;
            } else {
                f5 = f4;
            }
            f4 = (f5 + f6) / 2.0f;
        }
        float floor = f2 + (((float) java.lang.Math.floor((f5 - f2) / f)) * f);
        float f7 = f + floor;
        if (f7 <= f3 && !getHighSpeedVideoSizes(textAutoSizeLayoutScope.mo2352performLayout5ZSfY2I(j, annotatedString, textAutoSizeLayoutScope.mo1421toSpkPz2Gy4(f7)))) {
            floor = f7;
        }
        return textAutoSizeLayoutScope.mo1421toSpkPz2Gy4(floor);
    }

    private final boolean getHighSpeedVideoSizes(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        if (androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8())) {
            return Camera2StreamConfigurationMap(textLayoutResult);
        }
        if (androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8503getStartEllipsisgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8502getMiddleEllipsisgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8())) {
            return getHighResolutionOutputSizeshNQ4ISI(textLayoutResult);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextOverflow type ");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.TextOverflow.m8493toStringimpl(textLayoutResult.getLayoutInput().getOverflow()));
        sb.append(" is not supported.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static boolean Camera2StreamConfigurationMap(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        return textLayoutResult.getDidOverflowWidth() || textLayoutResult.getDidOverflowHeight();
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        int lineCount = textLayoutResult.getLineCount();
        if (lineCount == 0) {
            return false;
        }
        if (lineCount == 1) {
            return textLayoutResult.isLineEllipsized(0);
        }
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        if (androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8503getStartEllipsisgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8502getMiddleEllipsisgIe3tQ8())) {
            return Camera2StreamConfigurationMap(textLayoutResult);
        }
        if (androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(overflow, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8())) {
            return textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public final boolean equals(java.lang.Object p0) {
        if (p0 == this) {
            return true;
        }
        if (p0 == null || !(p0 instanceof androidx.compose.foundation.text.AutoSizeStepBased)) {
            return false;
        }
        androidx.compose.foundation.text.AutoSizeStepBased autoSizeStepBased = (androidx.compose.foundation.text.AutoSizeStepBased) p0;
        return androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(autoSizeStepBased.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(autoSizeStepBased.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(autoSizeStepBased.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public final int hashCode() {
        return (((androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.getHighSpeedVideoFpsRangesFor) * 31) + androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.Camera2StreamConfigurationMap)) * 31) + androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public /* synthetic */ AutoSizeStepBased(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
