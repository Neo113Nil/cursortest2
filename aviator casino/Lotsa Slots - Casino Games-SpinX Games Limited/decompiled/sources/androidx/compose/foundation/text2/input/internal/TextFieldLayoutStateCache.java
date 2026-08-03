package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldLayoutStateCache.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003@ABB\u0005¢\u0006\u0002\u0010\u0004J*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002J0\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+ø\u0001\u0000¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016J\u0010\u00102\u001a\u0002032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\"\u00104\u001a\u0002032\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020306¢\u0006\u0002\b7H\u0082\bJ&\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "<set-?>", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "measureInputs", "getMeasureInputs", "()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "setMeasureInputs", "(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)V", "measureInputs$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "nonMeasureInputs", "getNonMeasureInputs", "()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "setNonMeasureInputs", "(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;)V", "nonMeasureInputs$delegate", "record", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;", "value", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "computeLayout", "visualText", "", "prevResult", "getOrComputeLayout", "layoutWithNewMeasureInputs", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "", "updateCacheIfWritable", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "updateNonMeasureInputs", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "", "softWrap", "CacheRecord", "MeasureInputs", "NonMeasureInputs", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache implements androidx.compose.runtime.State<androidx.compose.ui.text.TextLayoutResult>, androidx.compose.runtime.snapshots.StateObject {
    public static final int $stable = 0;

    /* renamed from: nonMeasureInputs$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState nonMeasureInputs = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs.INSTANCE.getMutationPolicy());

    /* renamed from: measureInputs$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState measureInputs = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs.INSTANCE.getMutationPolicy());
    private androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord record = new androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord();

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        return applied;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs getNonMeasureInputs() {
        return (androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs) this.nonMeasureInputs.getValue();
    }

    private final void setNonMeasureInputs(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs) {
        this.nonMeasureInputs.setValue(nonMeasureInputs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs getMeasureInputs() {
        return (androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs) this.measureInputs.getValue();
    }

    private final void setMeasureInputs(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs) {
        this.measureInputs.setValue(measureInputs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public androidx.compose.ui.text.TextLayoutResult getValue() {
        androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs;
        androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null || (measureInputs = getMeasureInputs()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    public final void updateNonMeasureInputs(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean singleLine, boolean softWrap) {
        setNonMeasureInputs(new androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs(textFieldState, textStyle, singleLine, softWrap));
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final androidx.compose.ui.text.TextLayoutResult m1148layoutWithNewMeasureInputshBUhpc(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, long constraints) {
        androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs = new androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs(density, layoutDirection, fontFamilyResolver, constraints, null);
        setMeasureInputs(measureInputs);
        androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null) {
            throw new java.lang.IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs".toString());
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    private final androidx.compose.ui.text.TextLayoutResult getOrComputeLayout(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs) {
        java.lang.CharSequence visualText;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = nonMeasureInputs.getTextFieldState().getText();
        androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord cacheRecord = (androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.record);
        androidx.compose.ui.text.TextLayoutResult layoutResult = cacheRecord.getLayoutResult();
        if (layoutResult != null && (visualText = cacheRecord.getVisualText()) != null && kotlin.text.StringsKt.contentEquals(visualText, text) && cacheRecord.getSingleLine() == nonMeasureInputs.getSingleLine() && cacheRecord.getSoftWrap() == nonMeasureInputs.getSoftWrap() && cacheRecord.getLayoutDirection() == measureInputs.getLayoutDirection() && cacheRecord.getDensityValue() == measureInputs.getDensity().getDensity() && cacheRecord.getFontScale() == measureInputs.getDensity().getFontScale() && androidx.compose.ui.unit.Constraints.m4417equalsimpl0(cacheRecord.getConstraints(), measureInputs.getConstraints()) && kotlin.jvm.internal.Intrinsics.areEqual(cacheRecord.getFontFamilyResolver(), measureInputs.getFontFamilyResolver())) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(cacheRecord.getTextStyle(), nonMeasureInputs.getTextStyle())) {
                return layoutResult;
            }
            androidx.compose.ui.text.TextStyle textStyle = cacheRecord.getTextStyle();
            if (textStyle != null && textStyle.hasSameDrawAffectingAttributes(nonMeasureInputs.getTextStyle())) {
                return androidx.compose.ui.text.TextLayoutResult.m3934copyO0kMr_c$default(layoutResult, new androidx.compose.ui.text.TextLayoutInput(layoutResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), layoutResult.getLayoutInput().getPlaceholders(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().getOverflow(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().getConstraints(), (kotlin.jvm.internal.DefaultConstructorMarker) null), 0L, 2, null);
            }
        }
        androidx.compose.ui.text.TextLayoutResult computeLayout = computeLayout(text, nonMeasureInputs, measureInputs, layoutResult);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(computeLayout, layoutResult)) {
            androidx.compose.runtime.snapshots.Snapshot current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
            if (!current.getReadOnly()) {
                androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord cacheRecord2 = this.record;
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord cacheRecord3 = (androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(cacheRecord2, this, current);
                    cacheRecord3.setVisualText(text);
                    cacheRecord3.setSingleLine(nonMeasureInputs.getSingleLine());
                    cacheRecord3.setSoftWrap(nonMeasureInputs.getSoftWrap());
                    cacheRecord3.setTextStyle(nonMeasureInputs.getTextStyle());
                    cacheRecord3.setLayoutDirection(measureInputs.getLayoutDirection());
                    cacheRecord3.setDensityValue(measureInputs.getDensityValue());
                    cacheRecord3.setFontScale(measureInputs.getFontScale());
                    cacheRecord3.m1150setConstraintsBRTryo0(measureInputs.getConstraints());
                    cacheRecord3.setFontFamilyResolver(measureInputs.getFontFamilyResolver());
                    cacheRecord3.setLayoutResult(computeLayout);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
            }
        }
        return computeLayout;
    }

    private final void updateCacheIfWritable(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord, kotlin.Unit> block) {
        androidx.compose.runtime.snapshots.Snapshot current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
        if (current.getReadOnly()) {
            return;
        }
        androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord cacheRecord = this.record;
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            try {
                block.invoke(androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(cacheRecord, this, current));
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
    }

    private final androidx.compose.ui.text.TextLayoutResult computeLayout(java.lang.CharSequence visualText, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs, androidx.compose.ui.text.TextLayoutResult prevResult) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        return new androidx.compose.foundation.text.TextDelegate(new androidx.compose.ui.text.AnnotatedString(visualText.toString(), null, null, 6, null), nonMeasureInputs.getTextStyle(), i, i2, nonMeasureInputs.getSoftWrap(), i3, measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), kotlin.collections.CollectionsKt.emptyList(), 44, null).m915layoutNN6EwU(measureInputs.getConstraints(), measureInputs.getLayoutDirection(), prevResult);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.record;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord) value;
    }

    /* compiled from: TextFieldLayoutStateCache.kt */
    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0001H\u0016J\b\u0010=\u001a\u00020\u0001H\u0016J\b\u0010>\u001a\u00020?H\u0016R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "()V", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-msEJaDk", "()J", "setConstraints-BRTryo0", "(J)V", "J", "densityValue", "", "getDensityValue", "()F", "setDensityValue", "(F)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontScale", "getFontScale", "setFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "singleLine", "", "getSingleLine", "()Z", "setSingleLine", "(Z)V", "softWrap", "getSoftWrap", "setSoftWrap", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "setTextStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "visualText", "", "getVisualText", "()Ljava/lang/CharSequence;", "setVisualText", "(Ljava/lang/CharSequence;)V", "assign", "", "value", "create", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CacheRecord extends androidx.compose.runtime.snapshots.StateRecord {
        private androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
        private androidx.compose.ui.unit.LayoutDirection layoutDirection;
        private androidx.compose.ui.text.TextLayoutResult layoutResult;
        private boolean singleLine;
        private boolean softWrap;
        private androidx.compose.ui.text.TextStyle textStyle;
        private java.lang.CharSequence visualText;
        private float densityValue = Float.NaN;
        private float fontScale = Float.NaN;
        private long constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        public final java.lang.CharSequence getVisualText() {
            return this.visualText;
        }

        public final void setVisualText(java.lang.CharSequence charSequence) {
            this.visualText = charSequence;
        }

        public final androidx.compose.ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final void setTextStyle(androidx.compose.ui.text.TextStyle textStyle) {
            this.textStyle = textStyle;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final void setSingleLine(boolean z) {
            this.singleLine = z;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final void setSoftWrap(boolean z) {
            this.softWrap = z;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final void setDensityValue(float f) {
            this.densityValue = f;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public final void setFontScale(float f) {
            this.fontScale = f;
        }

        public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final void setFontFamilyResolver(androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
            this.fontFamilyResolver = resolver;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m1150setConstraintsBRTryo0(long j) {
            this.constraints = j;
        }

        public final androidx.compose.ui.text.TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final void setLayoutResult(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public androidx.compose.runtime.snapshots.StateRecord create() {
            return new androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord();
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord");
            androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord cacheRecord = (androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord) value;
            this.visualText = cacheRecord.visualText;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        public java.lang.String toString() {
            return "CacheRecord(visualText=" + ((java.lang.Object) this.visualText) + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((java.lang.Object) androidx.compose.ui.unit.Constraints.m4429toStringimpl(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFieldLayoutStateCache.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "", "softWrap", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V", "getSingleLine", "()Z", "getSoftWrap", "getTextFieldState", "()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class NonMeasureInputs {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs.Companion INSTANCE = new androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs.Companion(null);
        private static final androidx.compose.runtime.SnapshotMutationPolicy<androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs> mutationPolicy = new androidx.compose.runtime.SnapshotMutationPolicy<androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1
            /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$NonMeasureInputs, java.lang.Object] */
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs merge(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs3) {
                return androidx.compose.runtime.SnapshotMutationPolicy.CC.$default$merge(this, nonMeasureInputs, nonMeasureInputs2, nonMeasureInputs3);
            }

            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs a2, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs b) {
                if (a2 == null || b == null) {
                    if (!((a2 == null) ^ (b == null))) {
                        return true;
                    }
                } else if (a2.getTextFieldState() == b.getTextFieldState() && kotlin.jvm.internal.Intrinsics.areEqual(a2.getTextStyle(), b.getTextStyle()) && a2.getSingleLine() == b.getSingleLine() && a2.getSoftWrap() == b.getSoftWrap()) {
                    return true;
                }
                return false;
            }
        };
        private final boolean singleLine;
        private final boolean softWrap;
        private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
        private final androidx.compose.ui.text.TextStyle textStyle;

        public NonMeasureInputs(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean z, boolean z2) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z;
            this.softWrap = z2;
        }

        public final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        public final androidx.compose.ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public java.lang.String toString() {
            return "NonMeasureInputs(textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ')';
        }

        /* compiled from: TextFieldLayoutStateCache.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;", "", "()V", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "getMutationPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.compose.runtime.SnapshotMutationPolicy<androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs> getMutationPolicy() {
                return androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs.mutationPolicy;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFieldLayoutStateCache.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "densityValue", "", "getDensityValue", "()F", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontScale", "getFontScale", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class MeasureInputs {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs.Companion INSTANCE = new androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs.Companion(null);
        private static final androidx.compose.runtime.SnapshotMutationPolicy<androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs> mutationPolicy = new androidx.compose.runtime.SnapshotMutationPolicy<androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1
            /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$MeasureInputs, java.lang.Object] */
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs merge(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs2, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs measureInputs3) {
                return androidx.compose.runtime.SnapshotMutationPolicy.CC.$default$merge(this, measureInputs, measureInputs2, measureInputs3);
            }

            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs a2, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs b) {
                if (a2 == null || b == null) {
                    if (!((a2 == null) ^ (b == null))) {
                        return true;
                    }
                } else if (a2.getDensityValue() == b.getDensityValue() && a2.getFontScale() == b.getFontScale() && a2.getLayoutDirection() == b.getLayoutDirection() && kotlin.jvm.internal.Intrinsics.areEqual(a2.getFontFamilyResolver(), b.getFontFamilyResolver()) && androidx.compose.ui.unit.Constraints.m4417equalsimpl0(a2.getConstraints(), b.getConstraints())) {
                    return true;
                }
                return false;
            }
        };
        private final long constraints;
        private final androidx.compose.ui.unit.Density density;
        private final float densityValue;
        private final androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;
        private final float fontScale;
        private final androidx.compose.ui.unit.LayoutDirection layoutDirection;

        public /* synthetic */ MeasureInputs(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.font.FontFamily.Resolver resolver, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, resolver, j);
        }

        private MeasureInputs(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.font.FontFamily.Resolver resolver, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = resolver;
            this.constraints = j;
            this.densityValue = density.getDensity();
            this.fontScale = density.getFontScale();
        }

        public final androidx.compose.ui.unit.Density getDensity() {
            return this.density;
        }

        public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public java.lang.String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((java.lang.Object) androidx.compose.ui.unit.Constraints.m4429toStringimpl(this.constraints)) + ')';
        }

        /* compiled from: TextFieldLayoutStateCache.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion;", "", "()V", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "getMutationPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.compose.runtime.SnapshotMutationPolicy<androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs> getMutationPolicy() {
                return androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs.mutationPolicy;
            }
        }
    }
}
