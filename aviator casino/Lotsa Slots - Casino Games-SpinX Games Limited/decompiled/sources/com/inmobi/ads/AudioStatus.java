package com.inmobi.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/AudioStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYING", "PAUSED", "COMPLETED", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AudioStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.inmobi.ads.AudioStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.inmobi.ads.AudioStatus.Companion INSTANCE;
    public static final com.inmobi.ads.AudioStatus PLAYING = new com.inmobi.ads.AudioStatus("PLAYING", 0);
    public static final com.inmobi.ads.AudioStatus PAUSED = new com.inmobi.ads.AudioStatus("PAUSED", 1);
    public static final com.inmobi.ads.AudioStatus COMPLETED = new com.inmobi.ads.AudioStatus("COMPLETED", 2);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/ads/AudioStatus$Companion;", "", "Lcom/inmobi/ads/AudioStatus;", "", "<init>", "()V", "value", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "(I)Lcom/inmobi/ads/AudioStatus;", "item", "to", "(Lcom/inmobi/ads/AudioStatus;)Ljava/lang/Integer;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* bridge */ /* synthetic */ java.lang.Object from(java.lang.Object obj) {
            return from(((java.lang.Number) obj).intValue());
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public com.inmobi.ads.AudioStatus from(int value) {
            return value != 0 ? value != 1 ? com.inmobi.ads.AudioStatus.COMPLETED : com.inmobi.ads.AudioStatus.PAUSED : com.inmobi.ads.AudioStatus.PLAYING;
        }

        @kotlin.jvm.JvmStatic
        public java.lang.Integer to(com.inmobi.ads.AudioStatus item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
            return java.lang.Integer.valueOf(item.ordinal());
        }
    }

    private static final /* synthetic */ com.inmobi.ads.AudioStatus[] $values() {
        return new com.inmobi.ads.AudioStatus[]{PLAYING, PAUSED, COMPLETED};
    }

    static {
        com.inmobi.ads.AudioStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.inmobi.ads.AudioStatus.Companion(null);
    }

    private AudioStatus(java.lang.String str, int i) {
    }

    @kotlin.jvm.JvmStatic
    public static com.inmobi.ads.AudioStatus from(int i) {
        return INSTANCE.from(i);
    }

    public static kotlin.enums.EnumEntries<com.inmobi.ads.AudioStatus> getEntries() {
        return $ENTRIES;
    }

    @kotlin.jvm.JvmStatic
    public static int to(com.inmobi.ads.AudioStatus audioStatus) {
        return INSTANCE.to(audioStatus).intValue();
    }

    public static com.inmobi.ads.AudioStatus valueOf(java.lang.String str) {
        return (com.inmobi.ads.AudioStatus) java.lang.Enum.valueOf(com.inmobi.ads.AudioStatus.class, str);
    }

    public static com.inmobi.ads.AudioStatus[] values() {
        return (com.inmobi.ads.AudioStatus[]) $VALUES.clone();
    }
}
