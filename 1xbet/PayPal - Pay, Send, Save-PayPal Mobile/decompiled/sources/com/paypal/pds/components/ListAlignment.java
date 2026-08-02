package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/pds/components/ListAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Top"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListAlignment {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.ListAlignment Center;
    public static final com.paypal.pds.components.ListAlignment Top;
    private static final /* synthetic */ com.paypal.pds.components.ListAlignment[] getHighSpeedVideoSizes;

    private ListAlignment(java.lang.String str, int i) {
    }

    static {
        com.paypal.pds.components.ListAlignment listAlignment = new com.paypal.pds.components.ListAlignment("Center", 0);
        Center = listAlignment;
        com.paypal.pds.components.ListAlignment listAlignment2 = new com.paypal.pds.components.ListAlignment("Top", 1);
        Top = listAlignment2;
        com.paypal.pds.components.ListAlignment[] listAlignmentArr = {listAlignment, listAlignment2};
        getHighSpeedVideoSizes = listAlignmentArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(listAlignmentArr);
    }

    public static com.paypal.pds.components.ListAlignment[] values() {
        return (com.paypal.pds.components.ListAlignment[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.pds.components.ListAlignment valueOf(java.lang.String str) {
        return (com.paypal.pds.components.ListAlignment) java.lang.Enum.valueOf(com.paypal.pds.components.ListAlignment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.ListAlignment> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
