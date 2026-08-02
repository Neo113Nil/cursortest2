package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle;", "", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", "p0", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "p1", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "p2", "Landroidx/compose/ui/Alignment;", "p3", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;Landroidx/compose/ui/Alignment;)V", "cardStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", "getCardStyle", "()Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", "dismissButtonAlignment", "Landroidx/compose/ui/Alignment;", "getDismissButtonAlignment", "()Landroidx/compose/ui/Alignment;", "dismissButtonStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "getDismissButtonStyle", "()Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "imageStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "getImageStyle", "()Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "Companion", "Builder"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageOnlyUIStyle {
    private final com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle cardStyle;
    private final androidx.compose.ui.Alignment dismissButtonAlignment;
    private final com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle dismissButtonStyle;
    private final com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle imageStyle;
    public static final int $stable = 8;
    private static final com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), null, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), null, null, null, 58, null);
    private static final com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle getHighSpeedVideoSizes = new com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f)), null, androidx.compose.ui.Alignment.INSTANCE.getCenter(), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), null, null, 50, null);
    private static final com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle getHighSpeedVideoFpsRanges = new com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), androidx.compose.ui.unit.Dp.m8601constructorimpl(13.0f)), null, null, 6, null);
    private static final androidx.compose.ui.Alignment Camera2StreamConfigurationMap = androidx.compose.ui.Alignment.INSTANCE.getTopEnd();

    private ImageOnlyUIStyle(com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle, androidx.compose.ui.Alignment alignment) {
        this.cardStyle = aepCardStyle;
        this.imageStyle = aepImageStyle;
        this.dismissButtonStyle = aepIconStyle;
        this.dismissButtonAlignment = alignment;
    }

    public final com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle getCardStyle() {
        return this.cardStyle;
    }

    public final com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle getImageStyle() {
        return this.imageStyle;
    }

    public final com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle getDismissButtonStyle() {
        return this.dismissButtonStyle;
    }

    public final androidx.compose.ui.Alignment getDismissButtonAlignment() {
        return this.dismissButtonAlignment;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle$Builder;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle;", "build", "()Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle;", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "cardStyle", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle$Builder;", "Landroidx/compose/ui/Alignment;", "alignment", "dismissButtonAlignment", "(Landroidx/compose/ui/Alignment;)Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle$Builder;", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "dismissButtonStyle", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle$Builder;", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "imageStyle", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle$Builder;", "Camera2StreamConfigurationMap", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/Alignment;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle getHighSpeedVideoSizes;
        private com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle getHighResolutionOutputSizeshNQ4ISI;
        private com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.compose.ui.Alignment getHighSpeedVideoFpsRanges;

        public final com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.Builder cardStyle(com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle style) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            this.getHighSpeedVideoSizes = style;
            return this;
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.Builder imageStyle(com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle style) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            this.getHighResolutionOutputSizeshNQ4ISI = style;
            return this;
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.Builder dismissButtonStyle(com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle style) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            this.getHighSpeedVideoFpsRangesFor = style;
            return this;
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.Builder dismissButtonAlignment(androidx.compose.ui.Alignment alignment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
            this.getHighSpeedVideoFpsRanges = alignment;
            return this;
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle build() {
            com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle merge$messaging_phoneRelease = com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle.INSTANCE.merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle merge$messaging_phoneRelease2 = com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle.INSTANCE.merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle merge$messaging_phoneRelease3 = com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle.INSTANCE.merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            androidx.compose.ui.Alignment alignment = this.getHighSpeedVideoFpsRanges;
            if (alignment == null) {
                alignment = com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle.Camera2StreamConfigurationMap;
            }
            return new com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle(merge$messaging_phoneRelease, merge$messaging_phoneRelease2, merge$messaging_phoneRelease3, alignment, null);
        }
    }

    public /* synthetic */ ImageOnlyUIStyle(com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle, androidx.compose.ui.Alignment alignment, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aepCardStyle, aepImageStyle, aepIconStyle, alignment);
    }
}
