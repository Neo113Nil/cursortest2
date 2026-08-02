package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType;", "", "SavingsStatementTile", "AccountAgreementTile", "FdicInsuranceTile", "TaxPreferenceTile", "TaxDocumentsTile", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$AccountAgreementTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$FdicInsuranceTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$SavingsStatementTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$TaxDocumentsTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$TaxPreferenceTile;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DocumentTileType {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$SavingsStatementTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsStatementTile implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.SavingsStatementTile INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.SavingsStatementTile();

        public final int hashCode() {
            return 339994551;
        }

        private SavingsStatementTile() {
        }

        public final java.lang.String toString() {
            return "SavingsStatementTile";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.SavingsStatementTile)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$AccountAgreementTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$AccountAgreementTile;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AccountAgreementTile implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType {
        public static final int $stable = 0;
        private final java.lang.String url;

        public AccountAgreementTile(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountAgreementTile(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.AccountAgreementTile) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.AccountAgreementTile) other).url);
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.AccountAgreementTile copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.AccountAgreementTile(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.AccountAgreementTile copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.AccountAgreementTile accountAgreementTile, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = accountAgreementTile.url;
            }
            return accountAgreementTile.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$FdicInsuranceTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FdicInsuranceTile implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.FdicInsuranceTile INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.FdicInsuranceTile();

        public final int hashCode() {
            return 2061435613;
        }

        private FdicInsuranceTile() {
        }

        public final java.lang.String toString() {
            return "FdicInsuranceTile";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.FdicInsuranceTile)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$TaxPreferenceTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxPreferenceTile implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxPreferenceTile INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxPreferenceTile();

        public final int hashCode() {
            return 2028378209;
        }

        private TaxPreferenceTile() {
        }

        public final java.lang.String toString() {
            return "TaxPreferenceTile";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxPreferenceTile)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType$TaxDocumentsTile;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DocumentTileType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxDocumentsTile implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxDocumentsTile INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxDocumentsTile();

        public final int hashCode() {
            return 810998862;
        }

        private TaxDocumentsTile() {
        }

        public final java.lang.String toString() {
            return "TaxDocumentsTile";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxDocumentsTile)) {
                return false;
            }
            return true;
        }
    }
}
