package com.paypal.oslo.core.commonui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/Scale;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "FIT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Scale {
    private static final /* synthetic */ com.paypal.oslo.core.commonui.components.Scale[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.commonui.components.Scale FILL;
    public static final com.paypal.oslo.core.commonui.components.Scale FIT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private Scale(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.commonui.components.Scale scale = new com.paypal.oslo.core.commonui.components.Scale("FILL", 0);
        FILL = scale;
        com.paypal.oslo.core.commonui.components.Scale scale2 = new com.paypal.oslo.core.commonui.components.Scale("FIT", 1);
        FIT = scale2;
        com.paypal.oslo.core.commonui.components.Scale[] scaleArr = {scale, scale2};
        Camera2StreamConfigurationMap = scaleArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(scaleArr);
    }

    public static com.paypal.oslo.core.commonui.components.Scale[] values() {
        return (com.paypal.oslo.core.commonui.components.Scale[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.commonui.components.Scale valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.commonui.components.Scale) java.lang.Enum.valueOf(com.paypal.oslo.core.commonui.components.Scale.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.commonui.components.Scale> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
