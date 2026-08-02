package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/LinkedAccount;", "", "<init>", "(Ljava/lang/String;I)V", "PAYPAL", "HONEY", "XOOM", "ZETTLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LinkedAccount {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount HONEY;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount PAYPAL;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount XOOM;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount ZETTLE;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private LinkedAccount(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount linkedAccount = new com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount("PAYPAL", 0);
        PAYPAL = linkedAccount;
        com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount linkedAccount2 = new com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount("HONEY", 1);
        HONEY = linkedAccount2;
        com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount linkedAccount3 = new com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount("XOOM", 2);
        XOOM = linkedAccount3;
        com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount linkedAccount4 = new com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount("ZETTLE", 3);
        ZETTLE = linkedAccount4;
        com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount[] linkedAccountArr = {linkedAccount, linkedAccount2, linkedAccount3, linkedAccount4};
        getHighResolutionOutputSizeshNQ4ISI = linkedAccountArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(linkedAccountArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
