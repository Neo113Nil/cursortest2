package com.paypal.oslo.feature.smartroute.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u0000 S2\u00020\u0001:\u0001SB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b+\u0010*J¨\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b4\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b>\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bA\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bB\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bC\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bD\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bE\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010*R\u001a\u0010\u0015\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bH\u0010*R\u0011\u0010J\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bI\u0010\u001bR\u0011\u0010L\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bK\u0010\u001bR\u0011\u0010M\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bM\u0010#R\u0011\u0010N\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bN\u0010#R\u0011\u0010P\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bO\u0010#R\u0011\u0010Q\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bQ\u0010#R\u0011\u0010R\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bR\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "", "Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "status", "", "savingsPercentage", "cryptoPercentage", "", "cryptoApyRate", "Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;", "cryptoOptInStatus", "savingsApy", "", "autoReloadEnabled", "autoReloadThresholdAmount", "autoReloadAmount", "autoReloadCurrency", "autoReloadFinancialInstrumentId", "version", "Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;", "savingsEligibilityStatus", "pyusdEligibilityStatus", "<init>", "(Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;FFLjava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "component2", "()F", "component3", "component4", "()Ljava/lang/String;", "component5", "()Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;", "component6", "component7", "()Z", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;", "component14", "copy", "(Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;FFLjava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;)Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/smartroute/api/model/SmartRouteStatus;", "getStatus", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSavingsPercentage", "getCryptoPercentage", "Ljava/lang/String;", "getCryptoApyRate", "Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;", "getCryptoOptInStatus", "getSavingsApy", "Z", "getAutoReloadEnabled", "getAutoReloadThresholdAmount", "getAutoReloadAmount", "getAutoReloadCurrency", "getAutoReloadFinancialInstrumentId", "getVersion", "Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;", "getSavingsEligibilityStatus", "getPyusdEligibilityStatus", "getBalancePercentage", "balancePercentage", "getTotalTargetPercentage", "totalTargetPercentage", "isSavingsTargetAvailable", "isPyusdTargetAvailable", "getHasAvailableTargets", "hasAvailableTargets", "isUsingSavingsForAutoReload", "isAutoReloadConfigured", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DistributionConfiguration {
    public static final int $stable = 0;
    private final java.lang.String autoReloadAmount;
    private final java.lang.String autoReloadCurrency;
    private final boolean autoReloadEnabled;
    private final java.lang.String autoReloadFinancialInstrumentId;
    private final java.lang.String autoReloadThresholdAmount;
    private final java.lang.String cryptoApyRate;
    private final com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoOptInStatus;
    private final float cryptoPercentage;
    private final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus pyusdEligibilityStatus;
    private final java.lang.String savingsApy;
    private final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus savingsEligibilityStatus;
    private final float savingsPercentage;
    private final com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus status;
    private final java.lang.String version;

    public DistributionConfiguration(com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus, float f, float f2, java.lang.String str, com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus, com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetEligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetEligibilityStatus2, "");
        this.status = smartRouteStatus;
        this.savingsPercentage = f;
        this.cryptoPercentage = f2;
        this.cryptoApyRate = str;
        this.cryptoOptInStatus = cryptoStatus;
        this.savingsApy = str2;
        this.autoReloadEnabled = z;
        this.autoReloadThresholdAmount = str3;
        this.autoReloadAmount = str4;
        this.autoReloadCurrency = str5;
        this.autoReloadFinancialInstrumentId = str6;
        this.version = str7;
        this.savingsEligibilityStatus = targetEligibilityStatus;
        this.pyusdEligibilityStatus = targetEligibilityStatus2;
        if (0.0f > f || f > 100.0f) {
            throw new java.lang.IllegalArgumentException("Savings percentage must be between 0 and 100, got: ".concat(java.lang.String.valueOf(f)).toString());
        }
        if (0.0f > f2 || f2 > 100.0f) {
            throw new java.lang.IllegalArgumentException("Crypto percentage must be between 0 and 100, got: ".concat(java.lang.String.valueOf(f2)).toString());
        }
        float f3 = f + f2;
        if (f3 <= 100.0f) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Total distribution cannot exceed 100%, got: ");
        sb.append(f3);
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus getStatus() {
        return this.status;
    }

    public final float getSavingsPercentage() {
        return this.savingsPercentage;
    }

    public final float getCryptoPercentage() {
        return this.cryptoPercentage;
    }

    public final java.lang.String getCryptoApyRate() {
        return this.cryptoApyRate;
    }

    public final com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus getCryptoOptInStatus() {
        return this.cryptoOptInStatus;
    }

    public final java.lang.String getSavingsApy() {
        return this.savingsApy;
    }

    public final boolean getAutoReloadEnabled() {
        return this.autoReloadEnabled;
    }

    public final java.lang.String getAutoReloadThresholdAmount() {
        return this.autoReloadThresholdAmount;
    }

    public final java.lang.String getAutoReloadAmount() {
        return this.autoReloadAmount;
    }

    public final java.lang.String getAutoReloadCurrency() {
        return this.autoReloadCurrency;
    }

    public final java.lang.String getAutoReloadFinancialInstrumentId() {
        return this.autoReloadFinancialInstrumentId;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public /* synthetic */ DistributionConfiguration(com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus, float f, float f2, java.lang.String str, com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus, com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(smartRouteStatus, f, f2, str, cryptoStatus, str2, z, str3, str4, str5, (i & 1024) != 0 ? null : str6, str7, (i & 4096) != 0 ? com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.UNKNOWN : targetEligibilityStatus, (i & 8192) != 0 ? com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.UNKNOWN : targetEligibilityStatus2);
    }

    public final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus getSavingsEligibilityStatus() {
        return this.savingsEligibilityStatus;
    }

    public final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus getPyusdEligibilityStatus() {
        return this.pyusdEligibilityStatus;
    }

    public final float getBalancePercentage() {
        return (100.0f - this.savingsPercentage) - this.cryptoPercentage;
    }

    public final float getTotalTargetPercentage() {
        return this.savingsPercentage + this.cryptoPercentage;
    }

    public final boolean isSavingsTargetAvailable() {
        return this.savingsEligibilityStatus == com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.ELIGIBLE || this.savingsEligibilityStatus == com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.PROVISIONED;
    }

    public final boolean isPyusdTargetAvailable() {
        return this.pyusdEligibilityStatus == com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.PROVISIONED;
    }

    public final boolean getHasAvailableTargets() {
        return isSavingsTargetAvailable() || isPyusdTargetAvailable();
    }

    public final boolean isUsingSavingsForAutoReload() {
        java.lang.String str = this.autoReloadFinancialInstrumentId;
        return str != null && kotlin.text.StringsKt.startsWith(str, "mb", true);
    }

    public final boolean isAutoReloadConfigured() {
        return this.autoReloadFinancialInstrumentId != null;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus smartRouteStatus = this.status;
        float f = this.savingsPercentage;
        float f2 = this.cryptoPercentage;
        java.lang.String str = this.cryptoApyRate;
        com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus = this.cryptoOptInStatus;
        java.lang.String str2 = this.savingsApy;
        boolean z = this.autoReloadEnabled;
        java.lang.String str3 = this.autoReloadThresholdAmount;
        java.lang.String str4 = this.autoReloadAmount;
        java.lang.String str5 = this.autoReloadCurrency;
        java.lang.String str6 = this.autoReloadFinancialInstrumentId;
        java.lang.String str7 = this.version;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus = this.savingsEligibilityStatus;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus2 = this.pyusdEligibilityStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DistributionConfiguration(status=");
        sb.append(smartRouteStatus);
        sb.append(", savingsPercentage=");
        sb.append(f);
        sb.append(", cryptoPercentage=");
        sb.append(f2);
        sb.append(", cryptoApyRate=");
        sb.append(str);
        sb.append(", cryptoOptInStatus=");
        sb.append(cryptoStatus);
        sb.append(", savingsApy=");
        sb.append(str2);
        sb.append(", autoReloadEnabled=");
        sb.append(z);
        sb.append(", autoReloadThresholdAmount=");
        sb.append(str3);
        sb.append(", autoReloadAmount=");
        sb.append(str4);
        sb.append(", autoReloadCurrency=");
        sb.append(str5);
        sb.append(", autoReloadFinancialInstrumentId=");
        sb.append(str6);
        sb.append(", version=");
        sb.append(str7);
        sb.append(", savingsEligibilityStatus=");
        sb.append(targetEligibilityStatus);
        sb.append(", pyusdEligibilityStatus=");
        sb.append(targetEligibilityStatus2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode();
        int hashCode2 = java.lang.Float.hashCode(this.savingsPercentage);
        int hashCode3 = java.lang.Float.hashCode(this.cryptoPercentage);
        java.lang.String str = this.cryptoApyRate;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int hashCode5 = this.cryptoOptInStatus.hashCode();
        java.lang.String str2 = this.savingsApy;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        int hashCode7 = java.lang.Boolean.hashCode(this.autoReloadEnabled);
        java.lang.String str3 = this.autoReloadThresholdAmount;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.autoReloadAmount;
        int hashCode9 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.autoReloadCurrency;
        int hashCode10 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.autoReloadFinancialInstrumentId;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.version.hashCode()) * 31) + this.savingsEligibilityStatus.hashCode()) * 31) + this.pyusdEligibilityStatus.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) other;
        return this.status == distributionConfiguration.status && java.lang.Float.compare(this.savingsPercentage, distributionConfiguration.savingsPercentage) == 0 && java.lang.Float.compare(this.cryptoPercentage, distributionConfiguration.cryptoPercentage) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoApyRate, distributionConfiguration.cryptoApyRate) && this.cryptoOptInStatus == distributionConfiguration.cryptoOptInStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsApy, distributionConfiguration.savingsApy) && this.autoReloadEnabled == distributionConfiguration.autoReloadEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadThresholdAmount, distributionConfiguration.autoReloadThresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadAmount, distributionConfiguration.autoReloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadCurrency, distributionConfiguration.autoReloadCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadFinancialInstrumentId, distributionConfiguration.autoReloadFinancialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, distributionConfiguration.version) && this.savingsEligibilityStatus == distributionConfiguration.savingsEligibilityStatus && this.pyusdEligibilityStatus == distributionConfiguration.pyusdEligibilityStatus;
    }

    public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy(com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus status, float savingsPercentage, float cryptoPercentage, java.lang.String cryptoApyRate, com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoOptInStatus, java.lang.String savingsApy, boolean autoReloadEnabled, java.lang.String autoReloadThresholdAmount, java.lang.String autoReloadAmount, java.lang.String autoReloadCurrency, java.lang.String autoReloadFinancialInstrumentId, java.lang.String version, com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus savingsEligibilityStatus, com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus pyusdEligibilityStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoOptInStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsEligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pyusdEligibilityStatus, "");
        return new com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration(status, savingsPercentage, cryptoPercentage, cryptoApyRate, cryptoOptInStatus, savingsApy, autoReloadEnabled, autoReloadThresholdAmount, autoReloadAmount, autoReloadCurrency, autoReloadFinancialInstrumentId, version, savingsEligibilityStatus, pyusdEligibilityStatus);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getAutoReloadAmount() {
        return this.autoReloadAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getAutoReloadThresholdAmount() {
        return this.autoReloadThresholdAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAutoReloadEnabled() {
        return this.autoReloadEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSavingsApy() {
        return this.savingsApy;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus getCryptoOptInStatus() {
        return this.cryptoOptInStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCryptoApyRate() {
        return this.cryptoApyRate;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCryptoPercentage() {
        return this.cryptoPercentage;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSavingsPercentage() {
        return this.savingsPercentage;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus getPyusdEligibilityStatus() {
        return this.pyusdEligibilityStatus;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus getSavingsEligibilityStatus() {
        return this.savingsEligibilityStatus;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getAutoReloadFinancialInstrumentId() {
        return this.autoReloadFinancialInstrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAutoReloadCurrency() {
        return this.autoReloadCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus getStatus() {
        return this.status;
    }
}
