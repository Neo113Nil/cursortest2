package com.adobe.marketing.mobile.services.ui.message.mapping;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/mapping/MessageArrangementMapper;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageArrangementMapper {
    public static final com.adobe.marketing.mobile.services.ui.message.mapping.MessageArrangementMapper INSTANCE = new com.adobe.marketing.mobile.services.ui.message.mapping.MessageArrangementMapper();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment, androidx.compose.foundation.layout.Arrangement.Horizontal> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.LEFT, androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.RIGHT, androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.CENTER, androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter()));

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.Map<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment, androidx.compose.foundation.layout.Arrangement.Vertical> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.TOP, androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.BOTTOM, androidx.compose.foundation.layout.Arrangement.INSTANCE.getBottom()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment.CENTER, androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter()));

    private MessageArrangementMapper() {
    }

    public final androidx.compose.foundation.layout.Arrangement.Horizontal getHorizontalArrangement$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment alignment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = Camera2StreamConfigurationMap.get(alignment);
        return horizontal == null ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter() : horizontal;
    }

    public final androidx.compose.foundation.layout.Arrangement.Vertical getVerticalArrangement$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageAlignment alignment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
        androidx.compose.foundation.layout.Arrangement.Vertical vertical = getHighSpeedVideoSizes.get(alignment);
        return vertical == null ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter() : vertical;
    }
}
