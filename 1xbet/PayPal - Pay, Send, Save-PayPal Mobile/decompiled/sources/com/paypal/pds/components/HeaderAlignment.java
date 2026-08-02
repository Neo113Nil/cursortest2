package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/pds/components/HeaderAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Bottom"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeaderAlignment {
    public static final com.paypal.pds.components.HeaderAlignment Bottom;
    public static final com.paypal.pds.components.HeaderAlignment Top;
    private static final /* synthetic */ com.paypal.pds.components.HeaderAlignment[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    static {
        com.paypal.pds.components.HeaderAlignment headerAlignment = new com.paypal.pds.components.HeaderAlignment("Top", 0);
        Top = headerAlignment;
        com.paypal.pds.components.HeaderAlignment headerAlignment2 = new com.paypal.pds.components.HeaderAlignment("Bottom", 1);
        Bottom = headerAlignment2;
        com.paypal.pds.components.HeaderAlignment[] headerAlignmentArr = {headerAlignment, headerAlignment2};
        getHighResolutionOutputSizeshNQ4ISI = headerAlignmentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(headerAlignmentArr);
    }

    private HeaderAlignment(java.lang.String str, int i) {
    }

    public static com.paypal.pds.components.HeaderAlignment[] values() {
        return (com.paypal.pds.components.HeaderAlignment[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.pds.components.HeaderAlignment valueOf(java.lang.String str) {
        return (com.paypal.pds.components.HeaderAlignment) java.lang.Enum.valueOf(com.paypal.pds.components.HeaderAlignment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.HeaderAlignment> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
