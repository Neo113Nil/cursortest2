package com.payair.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/payair/model/AssetType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "UNKNOWN", "IMAGE", "PDF", "TEXT", "HTML"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.model.AssetType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.model.AssetType.Companion INSTANCE;
    private final java.lang.String type;
    public static final com.payair.model.AssetType UNKNOWN = new com.payair.model.AssetType("UNKNOWN", 0, "unknown");
    public static final com.payair.model.AssetType IMAGE = new com.payair.model.AssetType("IMAGE", 1, androidx.media3.common.MimeTypes.IMAGE_PNG);
    public static final com.payair.model.AssetType PDF = new com.payair.model.AssetType("PDF", 2, "application/pdf");
    public static final com.payair.model.AssetType TEXT = new com.payair.model.AssetType("TEXT", 3, "text/plain");
    public static final com.payair.model.AssetType HTML = new com.payair.model.AssetType("HTML", 4, "text/html");

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/model/AssetType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/payair/model/AssetType;", "enumByValue", "(Ljava/lang/String;)Lcom/payair/model/AssetType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.payair.model.AssetType enumByValue(java.lang.String value) {
            com.payair.model.AssetType assetType;
            com.payair.model.AssetType[] values = com.payair.model.AssetType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    assetType = null;
                    break;
                }
                assetType = values[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(assetType.getType(), value)) {
                    break;
                }
                i++;
            }
            return assetType == null ? com.payair.model.AssetType.UNKNOWN : assetType;
        }

        public Companion() {
        }

        public static /* synthetic */ void getHighSpeedVideoSizes(com.google.gson.stream.JsonReader jsonReader, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
                jsonReader.skipValue();
            }
            jsonReader.endObject();
        }
    }

    static {
        com.payair.model.AssetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.payair.model.AssetType.Companion(null);
    }

    private AssetType(java.lang.String str, int i, java.lang.String str2) {
        this.type = str2;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public static com.payair.model.AssetType[] values() {
        return (com.payair.model.AssetType[]) $VALUES.clone();
    }

    public static com.payair.model.AssetType valueOf(java.lang.String str) {
        return (com.payair.model.AssetType) java.lang.Enum.valueOf(com.payair.model.AssetType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.model.AssetType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.model.AssetType[] $values() {
        return new com.payair.model.AssetType[]{UNKNOWN, IMAGE, PDF, TEXT, HTML};
    }
}
