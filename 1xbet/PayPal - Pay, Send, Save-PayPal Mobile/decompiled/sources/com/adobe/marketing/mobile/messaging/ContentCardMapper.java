package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/ContentCardMapper;", "", "<init>", "()V", "", "clear$messaging_phoneRelease", "", "propositionId", "Lcom/adobe/marketing/mobile/messaging/ContentCardSchemaData;", "getContentCardSchemaData", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/messaging/ContentCardSchemaData;", "removeContentCardSchemaData", "(Ljava/lang/String;)V", "contentCardSchemaData", "storeContentCardSchemaData", "(Lcom/adobe/marketing/mobile/messaging/ContentCardSchemaData;)V", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentCardMapper {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.adobe.marketing.mobile.messaging.ContentCardSchemaData> getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.messaging.ContentCardMapper.Companion INSTANCE = new com.adobe.marketing.mobile.messaging.ContentCardMapper.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<com.adobe.marketing.mobile.messaging.ContentCardMapper> instance$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.adobe.marketing.mobile.messaging.ContentCardMapper>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardMapper$Companion$instance$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final com.adobe.marketing.mobile.messaging.ContentCardMapper invoke() {
            return new com.adobe.marketing.mobile.messaging.ContentCardMapper(null);
        }
    });

    private ContentCardMapper() {
        this.getHighSpeedVideoSizes = new java.util.HashMap();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/ContentCardMapper$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/messaging/ContentCardMapper;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/adobe/marketing/mobile/messaging/ContentCardMapper;", "getInstance$annotations", "instance"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        private Companion() {
        }

        public final com.adobe.marketing.mobile.messaging.ContentCardMapper getInstance() {
            return (com.adobe.marketing.mobile.messaging.ContentCardMapper) com.adobe.marketing.mobile.messaging.ContentCardMapper.instance$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.adobe.marketing.mobile.messaging.ContentCardSchemaData getContentCardSchemaData(java.lang.String propositionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propositionId, "");
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(propositionId)) {
            return null;
        }
        return this.getHighSpeedVideoSizes.get(propositionId);
    }

    public final void storeContentCardSchemaData(com.adobe.marketing.mobile.messaging.ContentCardSchemaData contentCardSchemaData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentCardSchemaData, "");
        if (contentCardSchemaData.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI == null) {
            return;
        }
        java.util.Map<java.lang.String, com.adobe.marketing.mobile.messaging.ContentCardSchemaData> map = this.getHighSpeedVideoSizes;
        java.lang.String uniqueId = contentCardSchemaData.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.get().getUniqueId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uniqueId, "");
        map.put(uniqueId, contentCardSchemaData);
    }

    public final void removeContentCardSchemaData(java.lang.String propositionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propositionId, "");
        this.getHighSpeedVideoSizes.remove(propositionId);
    }

    public final void clear$messaging_phoneRelease() {
        this.getHighSpeedVideoSizes.clear();
    }

    public static final com.adobe.marketing.mobile.messaging.ContentCardMapper getInstance() {
        return INSTANCE.getInstance();
    }

    public /* synthetic */ ContentCardMapper(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
