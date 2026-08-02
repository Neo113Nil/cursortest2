package com.paypal.oslo.feature.paypalassistant.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PRIMARY", "SECONDARY", "TERTIARY", "OVERLAY", "TERTIARY_CONTAINED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyleSerializer.class)
/* loaded from: classes13.dex */
public final class ButtonStyle {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.Companion INSTANCE;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle OVERLAY;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle PRIMARY;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle SECONDARY;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle TERTIARY;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle TERTIARY_CONTAINED;
    public static final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle UNKNOWN;

    private ButtonStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle("PRIMARY", 0);
        PRIMARY = buttonStyle;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle2 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle("SECONDARY", 1);
        SECONDARY = buttonStyle2;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle3 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle("TERTIARY", 2);
        TERTIARY = buttonStyle3;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle4 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle("OVERLAY", 3);
        OVERLAY = buttonStyle4;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle5 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle("TERTIARY_CONTAINED", 4);
        TERTIARY_CONTAINED = buttonStyle5;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle6 = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle("UNKNOWN", 5);
        UNKNOWN = buttonStyle6;
        com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4, buttonStyle5, buttonStyle6};
        $VALUES = buttonStyleArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(buttonStyleArr);
        INSTANCE = new com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle;", "toButtonStyle", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle> serializer() {
            return com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyleSerializer.INSTANCE;
        }

        public final com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle toButtonStyle(java.lang.String str) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle) obj).name(), str, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle = (com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle) obj;
            return buttonStyle == null ? com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.UNKNOWN : buttonStyle;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle[] values() {
        return (com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle) java.lang.Enum.valueOf(com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle> getEntries() {
        return $ENTRIES;
    }
}
