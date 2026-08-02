package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B0\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\u0011\u0010\u0017J \u0010\u0018\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/pds/core/Builder;", "", "", "Lcom/paypal/pds/core/RichText$Entry;", "entries", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "inlineComponent", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "isBold", "append", "(Ljava/lang/String;Lcom/paypal/pds/core/Color;Z)V", "href", "appendLink", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/pds/core/RichText;", "(Lcom/paypal/pds/core/RichText;)V", "setTrailingInline", "(Lkotlin/jvm/functions/Function2;)V", "build$pds_release", "()Lcom/paypal/pds/core/RichText;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Builder {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<com.paypal.pds.core.RichText.Entry> getHighSpeedVideoSizes;

    public Builder(java.util.List<com.paypal.pds.core.RichText.Entry> list, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRanges = function2;
    }

    public /* synthetic */ Builder(java.util.ArrayList arrayList, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : arrayList, (i & 2) != 0 ? null : function2);
    }

    public static /* synthetic */ void append$default(com.paypal.pds.core.Builder builder, java.lang.String str, com.paypal.pds.core.Color color, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            color = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        builder.append(str, color, z);
    }

    public final void append(java.lang.String value, com.paypal.pds.core.Color color, boolean isBold) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoSizes.add(new com.paypal.pds.core.RichText.Entry(value, null, color, isBold, 2, null));
    }

    public final void appendLink(java.lang.String value, java.lang.String href) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(href, "");
        this.getHighSpeedVideoSizes.add(new com.paypal.pds.core.RichText.Entry(value, href, null, false, 12, null));
    }

    public final void append(com.paypal.pds.core.RichText value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoSizes.addAll(value.getEntries$pds_release());
        if (value.getTrailingInline$pds_release() != null) {
            this.getHighSpeedVideoFpsRanges = value.getTrailingInline$pds_release();
        }
    }

    public final void setTrailingInline(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> inlineComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineComponent, "");
        this.getHighSpeedVideoFpsRanges = inlineComponent;
    }

    public final com.paypal.pds.core.RichText build$pds_release() {
        return new com.paypal.pds.core.RichText(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Builder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
