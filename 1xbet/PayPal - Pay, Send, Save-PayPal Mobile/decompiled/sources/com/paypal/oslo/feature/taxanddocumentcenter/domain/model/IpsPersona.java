package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/IpsPersona;", "", "<init>", "(Ljava/lang/String;I)V", "FAQ", "MTS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IpsPersona {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona FAQ;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona MTS;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private IpsPersona(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona ipsPersona = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona("FAQ", 0);
        FAQ = ipsPersona;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona ipsPersona2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona("MTS", 1);
        MTS = ipsPersona2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona[] ipsPersonaArr = {ipsPersona, ipsPersona2};
        getHighSpeedVideoFpsRangesFor = ipsPersonaArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(ipsPersonaArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsPersona> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
