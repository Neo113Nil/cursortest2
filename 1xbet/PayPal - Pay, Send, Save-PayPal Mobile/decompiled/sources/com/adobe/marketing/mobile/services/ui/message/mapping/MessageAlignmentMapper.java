package com.adobe.marketing.mobile.services.ui.message.mapping;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/mapping/MessageAlignmentMapper;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "getHorizontalAlignment$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;)Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "getVerticalAlignment$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;)Landroidx/compose/ui/Alignment$Vertical;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageAlignmentMapper {
    public static final com.adobe.marketing.mobile.services.ui.message.mapping.MessageAlignmentMapper INSTANCE = new com.adobe.marketing.mobile.services.ui.message.mapping.MessageAlignmentMapper();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment, androidx.compose.ui.Alignment.Vertical> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.TOP, androidx.compose.ui.Alignment.INSTANCE.getTop()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.BOTTOM, androidx.compose.ui.Alignment.INSTANCE.getBottom()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.CENTER, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()));

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Map<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment, androidx.compose.ui.Alignment.Horizontal> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.LEFT, androidx.compose.ui.Alignment.INSTANCE.getStart()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.RIGHT, androidx.compose.ui.Alignment.INSTANCE.getEnd()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.CENTER, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()));

    private MessageAlignmentMapper() {
    }

    public final androidx.compose.ui.Alignment.Vertical getVerticalAlignment$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment alignment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
        androidx.compose.ui.Alignment.Vertical vertical = getHighSpeedVideoFpsRanges.get(alignment);
        return vertical == null ? androidx.compose.ui.Alignment.INSTANCE.getCenterVertically() : vertical;
    }

    public final androidx.compose.ui.Alignment.Horizontal getHorizontalAlignment$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment alignment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
        androidx.compose.ui.Alignment.Horizontal horizontal = getHighSpeedVideoSizes.get(alignment);
        return horizontal == null ? androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally() : horizontal;
    }
}
