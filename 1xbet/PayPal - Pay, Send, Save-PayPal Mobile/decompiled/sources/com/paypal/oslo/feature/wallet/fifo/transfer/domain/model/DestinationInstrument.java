package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\f\r\u000eR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\u0082\u0001\u0003\u000f\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument;", "", "", "getId", "()Ljava/lang/String;", "id", "getLastNChars", "lastNChars", "getCurrencyCode", "currencyCode", "getThumbnail", "thumbnail", "BankAccount", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Unknown", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$BankAccount;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$Card;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DestinationInstrument {
    java.lang.String getCurrencyCode();

    java.lang.String getId();

    java.lang.String getLastNChars();

    java.lang.String getThumbnail();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJR\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$BankAccount;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument;", "", "id", "lastNChars", "currencyCode", "type", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/BankName;", "bankName", "thumbnail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/BankName;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/BankName;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/BankName;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$BankAccount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getCurrencyCode", "getType", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/BankName;", "getBankName", "getThumbnail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount implements com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName;
        private final java.lang.String currencyCode;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String thumbnail;
        private final java.lang.String type;

        public BankAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName, java.lang.String str5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.lastNChars = str2;
            this.currencyCode = str3;
            this.type = str4;
            this.bankName = bankName;
            this.thumbnail = str5;
        }

        public /* synthetic */ BankAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bankName, (i & 32) != 0 ? null : str5);
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName getBankName() {
            return this.bankName;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getThumbnail() {
            return this.thumbnail;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.currencyCode;
            java.lang.String str4 = this.type;
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName = this.bankName;
            java.lang.String str5 = this.thumbnail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", type=");
            sb.append(str4);
            sb.append(", bankName=");
            sb.append(bankName);
            sb.append(", thumbnail=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.currencyCode.hashCode();
            java.lang.String str = this.type;
            int hashCode4 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName = this.bankName;
            int hashCode5 = bankName == null ? 0 : bankName.hashCode();
            java.lang.String str2 = this.thumbnail;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, bankAccount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, bankAccount.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, bankAccount.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnail, bankAccount.thumbnail);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount copy(java.lang.String id, java.lang.String lastNChars, java.lang.String currencyCode, java.lang.String type, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName, java.lang.String thumbnail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount(id, lastNChars, currencyCode, type, bankName, thumbnail);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getThumbnail() {
            return this.thumbnail;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName getBankName() {
            return this.bankName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount bankAccount, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.lastNChars;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = bankAccount.currencyCode;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = bankAccount.type;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                bankName = bankAccount.bankName;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName2 = bankName;
            if ((i & 32) != 0) {
                str5 = bankAccount.thumbnail;
            }
            return bankAccount.copy(str, str6, str7, str8, bankName2, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b,\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$Card;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument;", "", "id", "lastNChars", "currencyCode", "expirationDate", "brand", "productClass", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/CardIssuer;", "issuer", "thumbnail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/CardIssuer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/CardIssuer;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/CardIssuer;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$Card;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getCurrencyCode", "getExpirationDate", "getBrand", "getProductClass", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/CardIssuer;", "getIssuer", "getThumbnail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card implements com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument {
        public static final int $stable = 0;
        private final java.lang.String brand;
        private final java.lang.String currencyCode;
        private final java.lang.String expirationDate;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer issuer;
        private final java.lang.String lastNChars;
        private final java.lang.String productClass;
        private final java.lang.String thumbnail;

        public Card(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer, java.lang.String str7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.lastNChars = str2;
            this.currencyCode = str3;
            this.expirationDate = str4;
            this.brand = str5;
            this.productClass = str6;
            this.issuer = cardIssuer;
            this.thumbnail = str7;
        }

        public /* synthetic */ Card(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : cardIssuer, (i & 128) != 0 ? null : str7);
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getProductClass() {
            return this.productClass;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer getIssuer() {
            return this.issuer;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getThumbnail() {
            return this.thumbnail;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.currencyCode;
            java.lang.String str4 = this.expirationDate;
            java.lang.String str5 = this.brand;
            java.lang.String str6 = this.productClass;
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer = this.issuer;
            java.lang.String str7 = this.thumbnail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", expirationDate=");
            sb.append(str4);
            sb.append(", brand=");
            sb.append(str5);
            sb.append(", productClass=");
            sb.append(str6);
            sb.append(", issuer=");
            sb.append(cardIssuer);
            sb.append(", thumbnail=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.currencyCode.hashCode();
            java.lang.String str = this.expirationDate;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.brand;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.productClass;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer = this.issuer;
            int hashCode7 = cardIssuer == null ? 0 : cardIssuer.hashCode();
            java.lang.String str4 = this.thumbnail;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Card)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Card card = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, card.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, card.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, card.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, card.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, card.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.productClass, card.productClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, card.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnail, card.thumbnail);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Card copy(java.lang.String id, java.lang.String lastNChars, java.lang.String currencyCode, java.lang.String expirationDate, java.lang.String brand, java.lang.String productClass, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer issuer, java.lang.String thumbnail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Card(id, lastNChars, currencyCode, expirationDate, brand, productClass, issuer, thumbnail);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getThumbnail() {
            return this.thumbnail;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getProductClass() {
            return this.productClass;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument$Unknown;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "id", "Ljava/lang/String;", "getId", "lastNChars", "getLastNChars", "currencyCode", "getCurrencyCode", "thumbnail", "getThumbnail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown implements com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument {
        public static final int $stable = 0;
        private static final java.lang.String thumbnail = null;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Unknown INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Unknown();
        private static final java.lang.String id = "";
        private static final java.lang.String lastNChars = "";
        private static final java.lang.String currencyCode = "";

        public final int hashCode() {
            return -1551965369;
        }

        private Unknown() {
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getId() {
            return id;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getLastNChars() {
            return lastNChars;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getCurrencyCode() {
            return currencyCode;
        }

        @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument
        public final java.lang.String getThumbnail() {
            return thumbnail;
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Unknown)) {
                return false;
            }
            return true;
        }
    }
}
