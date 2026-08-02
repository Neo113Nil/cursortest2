package com.datadog.android.event;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/event/MapperSerializer;", "", "T", "Lcom/datadog/android/core/persistence/Serializer;", "Lcom/datadog/android/event/EventMapper;", "eventMapper", "serializer", "<init>", "(Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/core/persistence/Serializer;)V", "model", "", "serialize", "(Ljava/lang/Object;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/event/EventMapper;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/persistence/Serializer;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapperSerializer<T> implements com.datadog.android.core.persistence.Serializer<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.core.persistence.Serializer<T> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.event.EventMapper<T> Camera2StreamConfigurationMap;

    public MapperSerializer(com.datadog.android.event.EventMapper<T> eventMapper, com.datadog.android.core.persistence.Serializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        this.Camera2StreamConfigurationMap = eventMapper;
        this.getHighSpeedVideoFpsRanges = serializer;
    }

    @Override // com.datadog.android.core.persistence.Serializer
    public final java.lang.String serialize(T model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        T map = this.Camera2StreamConfigurationMap.map(model);
        if (map == null) {
            return null;
        }
        return this.getHighSpeedVideoFpsRanges.serialize(map);
    }
}
