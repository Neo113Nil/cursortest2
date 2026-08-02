package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument;", "", "<init>", "()V", "BankAccount", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Unknown", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$BankAccount;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$Card;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DepositInstrument {
    public static final int $stable = 0;

    private DepositInstrument() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\\\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$BankAccount;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument;", "", "id", "type", "lastNChars", "nickname", "status", "issuerName", "institutionImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$BankAccount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getType", "getLastNChars", "getNickname", "getStatus", "getIssuerName", "getInstitutionImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount extends com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String institutionImageUrl;
        private final java.lang.String issuerName;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;
        private final java.lang.String status;
        private final java.lang.String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.id = str;
            this.type = str2;
            this.lastNChars = str3;
            this.nickname = str4;
            this.status = str5;
            this.issuerName = str6;
            this.institutionImageUrl = str7;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final java.lang.String getInstitutionImageUrl() {
            return this.institutionImageUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.type;
            java.lang.String str3 = this.lastNChars;
            java.lang.String str4 = this.nickname;
            java.lang.String str5 = this.status;
            java.lang.String str6 = this.issuerName;
            java.lang.String str7 = this.institutionImageUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(str2);
            sb.append(", lastNChars=");
            sb.append(str3);
            sb.append(", nickname=");
            sb.append(str4);
            sb.append(", status=");
            sb.append(str5);
            sb.append(", issuerName=");
            sb.append(str6);
            sb.append(", institutionImageUrl=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            int hashCode3 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.status;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            int hashCode6 = this.issuerName.hashCode();
            java.lang.String str3 = this.institutionImageUrl;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount bankAccount = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, bankAccount.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, bankAccount.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, bankAccount.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, bankAccount.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImageUrl, bankAccount.institutionImageUrl);
        }

        public final com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount copy(java.lang.String id, java.lang.String type, java.lang.String lastNChars, java.lang.String nickname, java.lang.String status, java.lang.String issuerName, java.lang.String institutionImageUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
            return new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount(id, type, lastNChars, nickname, status, issuerName, institutionImageUrl);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getInstitutionImageUrl() {
            return this.institutionImageUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount bankAccount, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.type;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = bankAccount.lastNChars;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = bankAccount.nickname;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = bankAccount.status;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = bankAccount.issuerName;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = bankAccount.institutionImageUrl;
            }
            return bankAccount.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJv\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b,\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$Card;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument;", "", "id", "brand", "lastNChars", "nickname", "productClass", "status", "issuerName", "cardArtUrl", "institutionImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$Card;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getBrand", "getLastNChars", "getNickname", "getProductClass", "getStatus", "getIssuerName", "getCardArtUrl", "getInstitutionImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card extends com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument {
        public static final int $stable = 0;
        private final java.lang.String brand;
        private final java.lang.String cardArtUrl;
        private final java.lang.String id;
        private final java.lang.String institutionImageUrl;
        private final java.lang.String issuerName;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;
        private final java.lang.String productClass;
        private final java.lang.String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.brand = str2;
            this.lastNChars = str3;
            this.nickname = str4;
            this.productClass = str5;
            this.status = str6;
            this.issuerName = str7;
            this.cardArtUrl = str8;
            this.institutionImageUrl = str9;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final java.lang.String getProductClass() {
            return this.productClass;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public final java.lang.String getInstitutionImageUrl() {
            return this.institutionImageUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.brand;
            java.lang.String str3 = this.lastNChars;
            java.lang.String str4 = this.nickname;
            java.lang.String str5 = this.productClass;
            java.lang.String str6 = this.status;
            java.lang.String str7 = this.issuerName;
            java.lang.String str8 = this.cardArtUrl;
            java.lang.String str9 = this.institutionImageUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(id=");
            sb.append(str);
            sb.append(", brand=");
            sb.append(str2);
            sb.append(", lastNChars=");
            sb.append(str3);
            sb.append(", nickname=");
            sb.append(str4);
            sb.append(", productClass=");
            sb.append(str5);
            sb.append(", status=");
            sb.append(str6);
            sb.append(", issuerName=");
            sb.append(str7);
            sb.append(", cardArtUrl=");
            sb.append(str8);
            sb.append(", institutionImageUrl=");
            sb.append(str9);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.brand.hashCode();
            int hashCode3 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.productClass;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.status;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.issuerName;
            int hashCode7 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.cardArtUrl;
            int hashCode8 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.institutionImageUrl;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card)) {
                return false;
            }
            com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card card = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, card.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, card.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, card.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, card.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.productClass, card.productClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, card.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, card.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, card.cardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImageUrl, card.institutionImageUrl);
        }

        public final com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card copy(java.lang.String id, java.lang.String brand, java.lang.String lastNChars, java.lang.String nickname, java.lang.String productClass, java.lang.String status, java.lang.String issuerName, java.lang.String cardArtUrl, java.lang.String institutionImageUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card(id, brand, lastNChars, nickname, productClass, status, issuerName, cardArtUrl, institutionImageUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getInstitutionImageUrl() {
            return this.institutionImageUrl;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getCardArtUrl() {
            return this.cardArtUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getProductClass() {
            return this.productClass;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$Unknown;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Unknown INSTANCE = new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Unknown();

        public final int hashCode() {
            return 108666183;
        }

        private Unknown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Unknown)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DepositInstrument(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
