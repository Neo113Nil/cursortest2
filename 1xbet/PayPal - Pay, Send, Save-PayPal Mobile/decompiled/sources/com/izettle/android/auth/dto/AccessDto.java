package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016"}, d2 = {"Lcom/izettle/android/auth/dto/AccessDto;", "", "", "eMoney", "apiMerchantDbaData", "apiOrganization", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "cashRegister", com.google.android.libraries.places.api.model.PlaceTypes.LIBRARY, "accountSettings", "extendedReportInsights", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getAccountSettings", "()Ljava/lang/String;", "getApiMerchantDbaData", "getApiOrganization", "getCashRegister", "getEMoney", "getExtendedReportInsights", "getInvoice", "getLibrary"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AccessDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("ACCOUNT_SETTINGS")
    private final java.lang.String accountSettings;

    @com.izettle.android.serialization.annotations.JsonSerialize("API_MERCHANT_DBA_DATA")
    private final java.lang.String apiMerchantDbaData;

    @com.izettle.android.serialization.annotations.JsonSerialize("API_ORGANIZATION")
    private final java.lang.String apiOrganization;

    @com.izettle.android.serialization.annotations.JsonSerialize("CASH_REGISTER")
    private final java.lang.String cashRegister;

    @com.izettle.android.serialization.annotations.JsonSerialize("EMONEY")
    private final java.lang.String eMoney;

    @com.izettle.android.serialization.annotations.JsonSerialize("EXTENDED_REPORT_INSIGHTS")
    private final java.lang.String extendedReportInsights;

    @com.izettle.android.serialization.annotations.JsonSerialize("INVOICE")
    private final java.lang.String invoice;

    @com.izettle.android.serialization.annotations.JsonSerialize("LIBRARY")
    private final java.lang.String library;

    public AccessDto(@com.izettle.android.serialization.annotations.JsonDeserialize("EMONEY") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("API_MERCHANT_DBA_DATA") java.lang.String str2, @com.izettle.android.serialization.annotations.JsonDeserialize("API_ORGANIZATION") java.lang.String str3, @com.izettle.android.serialization.annotations.JsonDeserialize("INVOICE") java.lang.String str4, @com.izettle.android.serialization.annotations.JsonDeserialize("CASH_REGISTER") java.lang.String str5, @com.izettle.android.serialization.annotations.JsonDeserialize("LIBRARY") java.lang.String str6, @com.izettle.android.serialization.annotations.JsonDeserialize("ACCOUNT_SETTINGS") java.lang.String str7, @com.izettle.android.serialization.annotations.JsonDeserialize("EXTENDED_REPORT_INSIGHTS") java.lang.String str8) {
        this.eMoney = str;
        this.apiMerchantDbaData = str2;
        this.apiOrganization = str3;
        this.invoice = str4;
        this.cashRegister = str5;
        this.library = str6;
        this.accountSettings = str7;
        this.extendedReportInsights = str8;
    }

    public final java.lang.String getEMoney() {
        return this.eMoney;
    }

    public final java.lang.String getApiMerchantDbaData() {
        return this.apiMerchantDbaData;
    }

    public final java.lang.String getApiOrganization() {
        return this.apiOrganization;
    }

    public final java.lang.String getInvoice() {
        return this.invoice;
    }

    public final java.lang.String getCashRegister() {
        return this.cashRegister;
    }

    public final java.lang.String getLibrary() {
        return this.library;
    }

    public final java.lang.String getAccountSettings() {
        return this.accountSettings;
    }

    public final java.lang.String getExtendedReportInsights() {
        return this.extendedReportInsights;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.AccessDto)) {
            return false;
        }
        com.izettle.android.auth.dto.AccessDto accessDto = (com.izettle.android.auth.dto.AccessDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(accessDto.eMoney, this.eMoney) && kotlin.jvm.internal.Intrinsics.areEqual(accessDto.apiMerchantDbaData, this.apiMerchantDbaData) && kotlin.jvm.internal.Intrinsics.areEqual(accessDto.apiOrganization, this.apiOrganization) && kotlin.jvm.internal.Intrinsics.areEqual(accessDto.invoice, this.invoice) && kotlin.jvm.internal.Intrinsics.areEqual(accessDto.cashRegister, this.cashRegister) && kotlin.jvm.internal.Intrinsics.areEqual(accessDto.library, this.library) && kotlin.jvm.internal.Intrinsics.areEqual(accessDto.accountSettings, this.accountSettings) && kotlin.jvm.internal.Intrinsics.areEqual(accessDto.extendedReportInsights, this.extendedReportInsights);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.eMoney, this.apiMerchantDbaData, this.apiOrganization, this.invoice, this.cashRegister, this.library, this.accountSettings, this.extendedReportInsights);
    }
}
