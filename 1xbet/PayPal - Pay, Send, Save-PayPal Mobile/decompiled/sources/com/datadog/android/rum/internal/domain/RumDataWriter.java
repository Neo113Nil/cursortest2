package com.datadog.android.rum.internal.domain;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumDataWriter;", "Lcom/datadog/android/api/storage/DataWriter;", "", "Lcom/datadog/android/core/persistence/Serializer;", "eventSerializer", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "eventMetaSerializer", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/core/InternalSdkCore;)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, "", "onDataWritten$dd_sdk_android_rum_release", "(Ljava/lang/Object;[B)V", "Lcom/datadog/android/api/storage/EventBatchWriter;", "writer", "element", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/EventBatchWriter;Ljava/lang/Object;Lcom/datadog/android/api/storage/EventType;)Z", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/persistence/Serializer;", "Camera2StreamConfigurationMap", "getEventSerializer$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/persistence/Serializer;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/InternalSdkCore;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumDataWriter implements com.datadog.android.api.storage.DataWriter<java.lang.Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.RumDataWriter.Companion INSTANCE = new com.datadog.android.rum.internal.domain.RumDataWriter.Companion(null);
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private final com.datadog.android.core.persistence.Serializer<java.lang.Object> eventSerializer;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.core.persistence.Serializer<com.datadog.android.rum.internal.domain.event.RumEventMeta> Camera2StreamConfigurationMap;

    public RumDataWriter(com.datadog.android.core.persistence.Serializer<java.lang.Object> serializer, com.datadog.android.core.persistence.Serializer<com.datadog.android.rum.internal.domain.event.RumEventMeta> serializer2, com.datadog.android.core.InternalSdkCore internalSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        this.eventSerializer = serializer;
        this.Camera2StreamConfigurationMap = serializer2;
        this.getHighSpeedVideoFpsRangesFor = internalSdkCore;
    }

    public final com.datadog.android.core.persistence.Serializer<java.lang.Object> getEventSerializer$dd_sdk_android_rum_release() {
        return this.eventSerializer;
    }

    @Override // com.datadog.android.api.storage.DataWriter
    public final boolean write(com.datadog.android.api.storage.EventBatchWriter writer, java.lang.Object element, com.datadog.android.api.storage.EventType eventType) {
        com.datadog.android.api.storage.RawBatchEvent rawBatchEvent;
        boolean write;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        byte[] serializeToByteArray = com.datadog.android.core.persistence.SerializerKt.serializeToByteArray(this.eventSerializer, element, this.getHighSpeedVideoFpsRangesFor.getInternalLogger());
        if (serializeToByteArray == null) {
            return false;
        }
        if (element instanceof com.datadog.android.rum.model.ViewEvent) {
            com.datadog.android.rum.model.ViewEvent viewEvent = (com.datadog.android.rum.model.ViewEvent) element;
            byte[] serializeToByteArray2 = com.datadog.android.core.persistence.SerializerKt.serializeToByteArray(this.Camera2StreamConfigurationMap, new com.datadog.android.rum.internal.domain.event.RumEventMeta.View(viewEvent.getView().getId(), viewEvent.getDd().getDocumentVersion(), java.lang.Boolean.valueOf(viewEvent.getView().getAccessibility() != null)), this.getHighSpeedVideoFpsRangesFor.getInternalLogger());
            if (serializeToByteArray2 == null) {
                serializeToByteArray2 = EMPTY_BYTE_ARRAY;
            }
            rawBatchEvent = new com.datadog.android.api.storage.RawBatchEvent(serializeToByteArray, serializeToByteArray2);
        } else {
            rawBatchEvent = new com.datadog.android.api.storage.RawBatchEvent(serializeToByteArray, null, 2, null);
        }
        synchronized (this) {
            write = writer.write(rawBatchEvent, null, eventType);
            if (write) {
                onDataWritten$dd_sdk_android_rum_release(element, serializeToByteArray);
            }
        }
        return write;
    }

    public final void onDataWritten$dd_sdk_android_rum_release(java.lang.Object data, byte[] rawData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawData, "");
        if (data instanceof com.datadog.android.rum.model.ViewEvent) {
            this.getHighSpeedVideoFpsRangesFor.writeLastViewEvent(rawData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumDataWriter$Companion;", "", "<init>", "()V", "", "EMPTY_BYTE_ARRAY", "[B", "getEMPTY_BYTE_ARRAY", "()[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final byte[] getEMPTY_BYTE_ARRAY() {
            return com.datadog.android.rum.internal.domain.RumDataWriter.EMPTY_BYTE_ARRAY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
