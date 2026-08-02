package com.paypal.oslo.feature.paypalassistant.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "LARGE", "MEDIUM", "SMALL", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSizeSerializer.class)
/* loaded from: classes13.dex */
public final class ButtonSize {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.Companion INSTANCE;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize LARGE;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize MEDIUM;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize SMALL;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize UNKNOWN;

    private ButtonSize(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize buttonSize = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize("LARGE", 0);
        LARGE = buttonSize;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize buttonSize2 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize("MEDIUM", 1);
        MEDIUM = buttonSize2;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize buttonSize3 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize("SMALL", 2);
        SMALL = buttonSize3;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize buttonSize4 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize("UNKNOWN", 3);
        UNKNOWN = buttonSize4;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize[] buttonSizeArr = {buttonSize, buttonSize2, buttonSize3, buttonSize4};
        $VALUES = buttonSizeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(buttonSizeArr);
        INSTANCE = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize;", "toButtonSize", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize> serializer() {
            return com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSizeSerializer.INSTANCE;
        }

        public final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize toButtonSize(java.lang.String str) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize) obj).name(), str, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize buttonSize = (com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize) obj;
            return buttonSize == null ? com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.UNKNOWN : buttonSize;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize[] values() {
        return (com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize) java.lang.Enum.valueOf(com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize> getEntries() {
        return $ENTRIES;
    }
}
