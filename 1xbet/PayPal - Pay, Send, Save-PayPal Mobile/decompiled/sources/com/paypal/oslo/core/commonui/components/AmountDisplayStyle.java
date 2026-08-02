package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B3\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0003!\"#"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "", "p3", "Landroidx/compose/ui/Alignment$Vertical;", "p4", "<init>", "(Landroidx/compose/ui/unit/Dp;FFZLandroidx/compose/ui/Alignment$Vertical;)V", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-lTKBWiU$common_ui_release", "()Landroidx/compose/ui/unit/Dp;", "topPadding", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTopPadding-D9Ej5fM$common_ui_release", "()F", "bottomPadding", "getBottomPadding-D9Ej5fM$common_ui_release", "usesDynamicTypography", "Z", "getUsesDynamicTypography$common_ui_release", "()Z", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "getVerticalArrangement$common_ui_release", "()Landroidx/compose/ui/Alignment$Vertical;", "Large", "Compact", "DynamicCompact", "Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle$Compact;", "Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle$DynamicCompact;", "Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle$Large;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AmountDisplayStyle {
    public static final int $stable = 0;
    private final float bottomPadding;
    private final androidx.compose.ui.unit.Dp height;
    private final float topPadding;
    private final boolean usesDynamicTypography;
    private final androidx.compose.ui.Alignment.Vertical verticalArrangement;

    private AmountDisplayStyle(androidx.compose.ui.unit.Dp dp, float f, float f2, boolean z, androidx.compose.ui.Alignment.Vertical vertical) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vertical, "");
        this.height = dp;
        this.topPadding = f;
        this.bottomPadding = f2;
        this.usesDynamicTypography = z;
        this.verticalArrangement = vertical;
    }

    /* renamed from: getHeight-lTKBWiU$common_ui_release, reason: not valid java name and from getter */
    public final androidx.compose.ui.unit.Dp getHeight() {
        return this.height;
    }

    /* renamed from: getTopPadding-D9Ej5fM$common_ui_release, reason: not valid java name and from getter */
    public final float getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: getBottomPadding-D9Ej5fM$common_ui_release, reason: not valid java name and from getter */
    public final float getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: getUsesDynamicTypography$common_ui_release, reason: from getter */
    public final boolean getUsesDynamicTypography() {
        return this.usesDynamicTypography;
    }

    /* renamed from: getVerticalArrangement$common_ui_release, reason: from getter */
    public final androidx.compose.ui.Alignment.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle$Large;", "Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Large extends com.paypal.oslo.core.commonui.components.AmountDisplayStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Large INSTANCE = new com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Large();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Large() {
            super(androidx.compose.ui.unit.Dp.m8599boximpl(r0), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing8(), true, androidx.compose.ui.Alignment.INSTANCE.getTop(), null);
            float f;
            f = com.paypal.oslo.core.commonui.components.AmountDisplayKt.Camera2StreamConfigurationMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle$Compact;", "Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Compact extends com.paypal.oslo.core.commonui.components.AmountDisplayStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Compact INSTANCE = new com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Compact();

        private Compact() {
            super(null, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), false, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle$DynamicCompact;", "Lcom/paypal/oslo/core/commonui/components/AmountDisplayStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DynamicCompact extends com.paypal.oslo.core.commonui.components.AmountDisplayStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.commonui.components.AmountDisplayStyle.DynamicCompact INSTANCE = new com.paypal.oslo.core.commonui.components.AmountDisplayStyle.DynamicCompact();

        private DynamicCompact() {
            super(null, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), true, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), null);
        }
    }

    public /* synthetic */ AmountDisplayStyle(androidx.compose.ui.unit.Dp dp, float f, float f2, boolean z, androidx.compose.ui.Alignment.Vertical vertical, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dp, f, f2, z, vertical);
    }
}
