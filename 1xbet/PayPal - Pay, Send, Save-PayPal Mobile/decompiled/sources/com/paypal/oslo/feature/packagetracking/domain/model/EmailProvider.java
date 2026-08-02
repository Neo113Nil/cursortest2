package com.paypal.oslo.feature.packagetracking.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "", "<init>", "(Ljava/lang/String;I)V", "GMAIL", "OUTLOOK"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailProvider {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider GMAIL;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider OUTLOOK;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider[] getHighSpeedVideoFpsRanges;

    private EmailProvider(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = new com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider("GMAIL", 0);
        GMAIL = emailProvider;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider2 = new com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider("OUTLOOK", 1);
        OUTLOOK = emailProvider2;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider[] emailProviderArr = {emailProvider, emailProvider2};
        getHighSpeedVideoFpsRanges = emailProviderArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(emailProviderArr);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider[] values() {
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) java.lang.Enum.valueOf(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
