package com.paypal.oslo.feature.paypalassistant.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "EXTRA_SMALL", "SMALL", "MEDIUM", "LARGE", "EXTRA_LARGE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSizeSerializer.class)
/* loaded from: classes13.dex */
public final class AvatarSize {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.Companion INSTANCE;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize EXTRA_LARGE;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize EXTRA_SMALL;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize LARGE;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize MEDIUM;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize SMALL;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize UNKNOWN;

    private AvatarSize(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize = new com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize("EXTRA_SMALL", 0);
        EXTRA_SMALL = avatarSize;
        com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize2 = new com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize("SMALL", 1);
        SMALL = avatarSize2;
        com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize3 = new com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize("MEDIUM", 2);
        MEDIUM = avatarSize3;
        com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize4 = new com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize("LARGE", 3);
        LARGE = avatarSize4;
        com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize5 = new com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize("EXTRA_LARGE", 4);
        EXTRA_LARGE = avatarSize5;
        com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize6 = new com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize("UNKNOWN", 5);
        UNKNOWN = avatarSize6;
        com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize[] avatarSizeArr = {avatarSize, avatarSize2, avatarSize3, avatarSize4, avatarSize5, avatarSize6};
        $VALUES = avatarSizeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(avatarSizeArr);
        INSTANCE = new com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize;", "toAvatarSize", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize> serializer() {
            return com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSizeSerializer.INSTANCE;
        }

        public final com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize toAvatarSize(java.lang.String str) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize) obj).name(), str, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize = (com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize) obj;
            return avatarSize == null ? com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.UNKNOWN : avatarSize;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize[] values() {
        return (com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize) java.lang.Enum.valueOf(com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize> getEntries() {
        return $ENTRIES;
    }
}
