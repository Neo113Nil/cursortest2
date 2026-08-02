package com.datadog.android.core.internal.persistence.tlvformat;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "", "Lkotlin/UShort;", "p0", "<init>", "(Ljava/lang/String;IS)V", "rawValue", "S", "getRawValue-Mh2AYeg", "()S", "Companion", "VERSION_CODE", "DATA"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum TLVBlockType {
    VERSION_CODE(0),
    DATA(1);

    private static final java.util.Map<kotlin.UShort, com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType> Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.Companion INSTANCE = new com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.Companion(null);
    private final short rawValue;

    TLVBlockType(short s) {
        this.rawValue = s;
    }

    /* renamed from: getRawValue-Mh2AYeg, reason: not valid java name and from getter */
    public final short getRawValue() {
        return this.rawValue;
    }

    static {
        com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType[] values = values();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(values.length), 16));
        for (com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType tLVBlockType : values) {
            linkedHashMap.put(kotlin.UShort.m23517boximpl(tLVBlockType.rawValue), tLVBlockType);
        }
        Camera2StreamConfigurationMap = linkedHashMap;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType$Companion;", "", "<init>", "()V", "Lkotlin/UShort;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "fromValue-xj2QHRw", "(S)Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "fromValue", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: fromValue-xj2QHRw, reason: not valid java name */
        public final com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType m10012fromValuexj2QHRw(short value) {
            return (com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType) com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.Camera2StreamConfigurationMap.get(kotlin.UShort.m23517boximpl(value));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
