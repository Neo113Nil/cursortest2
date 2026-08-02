package com.miteksystems.misnap.document.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument;", "", "<init>", "()V", "Lcom/miteksystems/misnap/core/DocumentData;", "toDocumentData", "()Lcom/miteksystems/misnap/core/DocumentData;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced$DocType;", "advancedDoctype", "Lcom/miteksystems/misnap/core/Mrz;", "toMrz", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced$DocType;)Lcom/miteksystems/misnap/core/Mrz;", "BasicMrz", "Check", "Default", "ExtendedMrz", "Lcom/miteksystems/misnap/document/internal/BaseDocument$BasicMrz;", "Lcom/miteksystems/misnap/document/internal/BaseDocument$Check;", "Lcom/miteksystems/misnap/document/internal/BaseDocument$Default;", "Lcom/miteksystems/misnap/document/internal/BaseDocument$ExtendedMrz;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class BaseDocument {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0005"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$BasicMrz;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "", com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/miteksystems/misnap/document/internal/BaseDocument$BasicMrz;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRawData", "setRawData"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BasicMrz extends com.miteksystems.misnap.document.internal.BaseDocument {
        private java.lang.String rawData;

        /* JADX WARN: Multi-variable type inference failed */
        public BasicMrz() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BasicMrz(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawData = str;
        }

        public /* synthetic */ BasicMrz(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BasicMrz(rawData=");
            sb.append(this.rawData);
            sb.append(')');
            return sb.toString();
        }

        public final void setRawData(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawData = str;
        }

        public final int hashCode() {
            return this.rawData.hashCode();
        }

        public final java.lang.String getRawData() {
            return this.rawData;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawData, ((com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz) other).rawData);
        }

        public final com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz copy(java.lang.String rawData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawData, "");
            return new com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz(rawData);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRawData() {
            return this.rawData;
        }

        public static /* synthetic */ com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz copy$default(com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz basicMrz, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = basicMrz.rawData;
            }
            return basicMrz.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010 R\"\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010 R\"\u0010\u0007\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010 R\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010 "}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$Check;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "", "routingTransit", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "checkNumber", "amount", "irdIndicator", "tranCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/miteksystems/misnap/document/internal/BaseDocument$Check;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountNumber", "setAccountNumber", "(Ljava/lang/String;)V", "getAmount", "setAmount", "getCheckNumber", "setCheckNumber", "getIrdIndicator", "setIrdIndicator", "getRoutingTransit", "setRoutingTransit", "getTranCode", "setTranCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Check extends com.miteksystems.misnap.document.internal.BaseDocument {
        private java.lang.String accountNumber;
        private java.lang.String amount;
        private java.lang.String checkNumber;
        private java.lang.String irdIndicator;
        private java.lang.String routingTransit;
        private java.lang.String tranCode;

        public Check() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Check(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.routingTransit = str;
            this.accountNumber = str2;
            this.checkNumber = str3;
            this.amount = str4;
            this.irdIndicator = str5;
            this.tranCode = str6;
        }

        public /* synthetic */ Check(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Check(routingTransit=");
            sb.append(this.routingTransit);
            sb.append(", accountNumber=");
            sb.append(this.accountNumber);
            sb.append(", checkNumber=");
            sb.append(this.checkNumber);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", irdIndicator=");
            sb.append(this.irdIndicator);
            sb.append(", tranCode=");
            sb.append(this.tranCode);
            sb.append(')');
            return sb.toString();
        }

        public final void setTranCode(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.tranCode = str;
        }

        public final void setRoutingTransit(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.routingTransit = str;
        }

        public final void setIrdIndicator(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.irdIndicator = str;
        }

        public final void setCheckNumber(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.checkNumber = str;
        }

        public final void setAmount(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final void setAccountNumber(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.accountNumber = str;
        }

        public final int hashCode() {
            return (((((((((this.routingTransit.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.checkNumber.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.irdIndicator.hashCode()) * 31) + this.tranCode.hashCode();
        }

        public final java.lang.String getTranCode() {
            return this.tranCode;
        }

        public final java.lang.String getRoutingTransit() {
            return this.routingTransit;
        }

        public final java.lang.String getIrdIndicator() {
            return this.irdIndicator;
        }

        public final java.lang.String getCheckNumber() {
            return this.checkNumber;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.document.internal.BaseDocument.Check)) {
                return false;
            }
            com.miteksystems.misnap.document.internal.BaseDocument.Check check = (com.miteksystems.misnap.document.internal.BaseDocument.Check) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.routingTransit, check.routingTransit) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, check.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkNumber, check.checkNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, check.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.irdIndicator, check.irdIndicator) && kotlin.jvm.internal.Intrinsics.areEqual(this.tranCode, check.tranCode);
        }

        public final com.miteksystems.misnap.document.internal.BaseDocument.Check copy(java.lang.String routingTransit, java.lang.String accountNumber, java.lang.String checkNumber, java.lang.String amount, java.lang.String irdIndicator, java.lang.String tranCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingTransit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(irdIndicator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tranCode, "");
            return new com.miteksystems.misnap.document.internal.BaseDocument.Check(routingTransit, accountNumber, checkNumber, amount, irdIndicator, tranCode);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getTranCode() {
            return this.tranCode;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getIrdIndicator() {
            return this.irdIndicator;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCheckNumber() {
            return this.checkNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRoutingTransit() {
            return this.routingTransit;
        }

        public static /* synthetic */ com.miteksystems.misnap.document.internal.BaseDocument.Check copy$default(com.miteksystems.misnap.document.internal.BaseDocument.Check check, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = check.routingTransit;
            }
            if ((i & 2) != 0) {
                str2 = check.accountNumber;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = check.checkNumber;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = check.amount;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = check.irdIndicator;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = check.tranCode;
            }
            return check.copy(str, str7, str8, str9, str10, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0014HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001aJÐ\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0014HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001aR\"\u0010\u0012\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010;R\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u00108\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010;R\"\u0010\t\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010;R\"\u0010\u000f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u00108\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010;R\"\u0010\u000b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00108\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010;R\"\u0010\u0010\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u0010;R\"\u0010\u0007\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00108\u001a\u0004\bF\u0010\u001a\"\u0004\bG\u0010;R\"\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u00108\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010;R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u00108\u001a\u0004\bJ\u0010\u001a\"\u0004\bK\u0010;R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u00108\u001a\u0004\bL\u0010\u001a\"\u0004\bM\u0010;R\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00108\u001a\u0004\bN\u0010\u001a\"\u0004\bO\u0010;R\"\u0010\f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00108\u001a\u0004\bP\u0010\u001a\"\u0004\bQ\u0010;R.\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010$\"\u0004\bT\u0010UR\"\u0010\u0011\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u00108\u001a\u0004\bV\u0010\u001a\"\u0004\bW\u0010;R\"\u0010\r\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00108\u001a\u0004\bX\u0010\u001a\"\u0004\bY\u0010;R\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u00108\u001a\u0004\bZ\u0010\u001a\"\u0004\b[\u0010;R\"\u0010\n\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00108\u001a\u0004\b\\\u0010\u001a\"\u0004\b]\u0010;R\"\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u00108\u001a\u0004\b^\u0010\u001a\"\u0004\b_\u0010;"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$ExtendedMrz;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "", "docType", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "surname", "firstName", "docNumber", "nationality", "dateOfBirth", "sex", "dateOfExpiration", "optionalData1", "optionalData2", "docNumberCheckDigit", "dateOfBirthCheckDigit", "dateOfExpirationCheckDigit", "optionalData1CheckDigit", "compositeCheckDigit", com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, "", "Landroid/graphics/Point;", "optionalData1CharCorners", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[[Landroid/graphics/Point;)V", "component1", "()Ljava/lang/String;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()[[Landroid/graphics/Point;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[[Landroid/graphics/Point;)Lcom/miteksystems/misnap/document/internal/BaseDocument$ExtendedMrz;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCompositeCheckDigit", "setCompositeCheckDigit", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getDateOfBirth", "setDateOfBirth", "getDateOfBirthCheckDigit", "setDateOfBirthCheckDigit", "getDateOfExpiration", "setDateOfExpiration", "getDateOfExpirationCheckDigit", "setDateOfExpirationCheckDigit", "getDocNumber", "setDocNumber", "getDocNumberCheckDigit", "setDocNumberCheckDigit", "getDocType", "setDocType", "getFirstName", "setFirstName", "getNationality", "setNationality", "getOptionalData1", "setOptionalData1", "[[Landroid/graphics/Point;", "getOptionalData1CharCorners", "setOptionalData1CharCorners", "([[Landroid/graphics/Point;)V", "getOptionalData1CheckDigit", "setOptionalData1CheckDigit", "getOptionalData2", "setOptionalData2", "getRawData", "setRawData", "getSex", "setSex", "getSurname", "setSurname"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ExtendedMrz extends com.miteksystems.misnap.document.internal.BaseDocument {
        private java.lang.String compositeCheckDigit;
        private java.lang.String country;
        private java.lang.String dateOfBirth;
        private java.lang.String dateOfBirthCheckDigit;
        private java.lang.String dateOfExpiration;
        private java.lang.String dateOfExpirationCheckDigit;
        private java.lang.String docNumber;
        private java.lang.String docNumberCheckDigit;
        private java.lang.String docType;
        private java.lang.String firstName;
        private java.lang.String nationality;
        private java.lang.String optionalData1;
        private android.graphics.Point[][] optionalData1CharCorners;
        private java.lang.String optionalData1CheckDigit;
        private java.lang.String optionalData2;
        private java.lang.String rawData;
        private java.lang.String sex;
        private java.lang.String surname;

        public ExtendedMrz() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExtendedMrz(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, android.graphics.Point[][] pointArr) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str17, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr, "");
            this.docType = str;
            this.country = str2;
            this.surname = str3;
            this.firstName = str4;
            this.docNumber = str5;
            this.nationality = str6;
            this.dateOfBirth = str7;
            this.sex = str8;
            this.dateOfExpiration = str9;
            this.optionalData1 = str10;
            this.optionalData2 = str11;
            this.docNumberCheckDigit = str12;
            this.dateOfBirthCheckDigit = str13;
            this.dateOfExpirationCheckDigit = str14;
            this.optionalData1CheckDigit = str15;
            this.compositeCheckDigit = str16;
            this.rawData = str17;
            this.optionalData1CharCorners = pointArr;
        }

        public /* synthetic */ ExtendedMrz(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, android.graphics.Point[][] pointArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? new android.graphics.Point[0][] : pointArr);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtendedMrz(docType=");
            sb.append(this.docType);
            sb.append(", country=");
            sb.append(this.country);
            sb.append(", surname=");
            sb.append(this.surname);
            sb.append(", firstName=");
            sb.append(this.firstName);
            sb.append(", docNumber=");
            sb.append(this.docNumber);
            sb.append(", nationality=");
            sb.append(this.nationality);
            sb.append(", dateOfBirth=");
            sb.append(this.dateOfBirth);
            sb.append(", sex=");
            sb.append(this.sex);
            sb.append(", dateOfExpiration=");
            sb.append(this.dateOfExpiration);
            sb.append(", optionalData1=");
            sb.append(this.optionalData1);
            sb.append(", optionalData2=");
            sb.append(this.optionalData2);
            sb.append(", docNumberCheckDigit=");
            sb.append(this.docNumberCheckDigit);
            sb.append(", dateOfBirthCheckDigit=");
            sb.append(this.dateOfBirthCheckDigit);
            sb.append(", dateOfExpirationCheckDigit=");
            sb.append(this.dateOfExpirationCheckDigit);
            sb.append(", optionalData1CheckDigit=");
            sb.append(this.optionalData1CheckDigit);
            sb.append(", compositeCheckDigit=");
            sb.append(this.compositeCheckDigit);
            sb.append(", rawData=");
            sb.append(this.rawData);
            sb.append(", optionalData1CharCorners=");
            sb.append(java.util.Arrays.toString(this.optionalData1CharCorners));
            sb.append(')');
            return sb.toString();
        }

        public final void setSurname(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.surname = str;
        }

        public final void setSex(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.sex = str;
        }

        public final void setRawData(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawData = str;
        }

        public final void setOptionalData2(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.optionalData2 = str;
        }

        public final void setOptionalData1CheckDigit(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.optionalData1CheckDigit = str;
        }

        public final void setOptionalData1CharCorners(android.graphics.Point[][] pointArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointArr, "");
            this.optionalData1CharCorners = pointArr;
        }

        public final void setOptionalData1(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.optionalData1 = str;
        }

        public final void setNationality(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.nationality = str;
        }

        public final void setFirstName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.firstName = str;
        }

        public final void setDocType(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.docType = str;
        }

        public final void setDocNumberCheckDigit(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.docNumberCheckDigit = str;
        }

        public final void setDocNumber(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.docNumber = str;
        }

        public final void setDateOfExpirationCheckDigit(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.dateOfExpirationCheckDigit = str;
        }

        public final void setDateOfExpiration(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.dateOfExpiration = str;
        }

        public final void setDateOfBirthCheckDigit(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.dateOfBirthCheckDigit = str;
        }

        public final void setDateOfBirth(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.dateOfBirth = str;
        }

        public final void setCountry(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.country = str;
        }

        public final void setCompositeCheckDigit(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.compositeCheckDigit = str;
        }

        public final int hashCode() {
            return (((((((((((((((((((((((((((((((((this.docType.hashCode() * 31) + this.country.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.docNumber.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.sex.hashCode()) * 31) + this.dateOfExpiration.hashCode()) * 31) + this.optionalData1.hashCode()) * 31) + this.optionalData2.hashCode()) * 31) + this.docNumberCheckDigit.hashCode()) * 31) + this.dateOfBirthCheckDigit.hashCode()) * 31) + this.dateOfExpirationCheckDigit.hashCode()) * 31) + this.optionalData1CheckDigit.hashCode()) * 31) + this.compositeCheckDigit.hashCode()) * 31) + this.rawData.hashCode()) * 31) + java.util.Arrays.hashCode(this.optionalData1CharCorners);
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getSex() {
            return this.sex;
        }

        public final java.lang.String getRawData() {
            return this.rawData;
        }

        public final java.lang.String getOptionalData2() {
            return this.optionalData2;
        }

        public final java.lang.String getOptionalData1CheckDigit() {
            return this.optionalData1CheckDigit;
        }

        public final android.graphics.Point[][] getOptionalData1CharCorners() {
            return this.optionalData1CharCorners;
        }

        public final java.lang.String getOptionalData1() {
            return this.optionalData1;
        }

        public final java.lang.String getNationality() {
            return this.nationality;
        }

        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        public final java.lang.String getDocType() {
            return this.docType;
        }

        public final java.lang.String getDocNumberCheckDigit() {
            return this.docNumberCheckDigit;
        }

        public final java.lang.String getDocNumber() {
            return this.docNumber;
        }

        public final java.lang.String getDateOfExpirationCheckDigit() {
            return this.dateOfExpirationCheckDigit;
        }

        public final java.lang.String getDateOfExpiration() {
            return this.dateOfExpiration;
        }

        public final java.lang.String getDateOfBirthCheckDigit() {
            return this.dateOfBirthCheckDigit;
        }

        public final java.lang.String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public final java.lang.String getCountry() {
            return this.country;
        }

        public final java.lang.String getCompositeCheckDigit() {
            return this.compositeCheckDigit;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz)) {
                return false;
            }
            com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz extendedMrz = (com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.docType, extendedMrz.docType) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, extendedMrz.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, extendedMrz.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, extendedMrz.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.docNumber, extendedMrz.docNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationality, extendedMrz.nationality) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirth, extendedMrz.dateOfBirth) && kotlin.jvm.internal.Intrinsics.areEqual(this.sex, extendedMrz.sex) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfExpiration, extendedMrz.dateOfExpiration) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionalData1, extendedMrz.optionalData1) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionalData2, extendedMrz.optionalData2) && kotlin.jvm.internal.Intrinsics.areEqual(this.docNumberCheckDigit, extendedMrz.docNumberCheckDigit) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirthCheckDigit, extendedMrz.dateOfBirthCheckDigit) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfExpirationCheckDigit, extendedMrz.dateOfExpirationCheckDigit) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionalData1CheckDigit, extendedMrz.optionalData1CheckDigit) && kotlin.jvm.internal.Intrinsics.areEqual(this.compositeCheckDigit, extendedMrz.compositeCheckDigit) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawData, extendedMrz.rawData) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionalData1CharCorners, extendedMrz.optionalData1CharCorners);
        }

        public final com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz copy(java.lang.String docType, java.lang.String country, java.lang.String surname, java.lang.String firstName, java.lang.String docNumber, java.lang.String nationality, java.lang.String dateOfBirth, java.lang.String sex, java.lang.String dateOfExpiration, java.lang.String optionalData1, java.lang.String optionalData2, java.lang.String docNumberCheckDigit, java.lang.String dateOfBirthCheckDigit, java.lang.String dateOfExpirationCheckDigit, java.lang.String optionalData1CheckDigit, java.lang.String compositeCheckDigit, java.lang.String rawData, android.graphics.Point[][] optionalData1CharCorners) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surname, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nationality, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirth, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sex, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfExpiration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionalData1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionalData2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docNumberCheckDigit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthCheckDigit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfExpirationCheckDigit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionalData1CheckDigit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compositeCheckDigit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionalData1CharCorners, "");
            return new com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz(docType, country, surname, firstName, docNumber, nationality, dateOfBirth, sex, dateOfExpiration, optionalData1, optionalData2, docNumberCheckDigit, dateOfBirthCheckDigit, dateOfExpirationCheckDigit, optionalData1CheckDigit, compositeCheckDigit, rawData, optionalData1CharCorners);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getDateOfExpiration() {
            return this.dateOfExpiration;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getSex() {
            return this.sex;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getDateOfBirth() {
            return this.dateOfBirth;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getNationality() {
            return this.nationality;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getDocNumber() {
            return this.docNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountry() {
            return this.country;
        }

        /* renamed from: component18, reason: from getter */
        public final android.graphics.Point[][] getOptionalData1CharCorners() {
            return this.optionalData1CharCorners;
        }

        /* renamed from: component17, reason: from getter */
        public final java.lang.String getRawData() {
            return this.rawData;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getCompositeCheckDigit() {
            return this.compositeCheckDigit;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.String getOptionalData1CheckDigit() {
            return this.optionalData1CheckDigit;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.String getDateOfExpirationCheckDigit() {
            return this.dateOfExpirationCheckDigit;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getDateOfBirthCheckDigit() {
            return this.dateOfBirthCheckDigit;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getDocNumberCheckDigit() {
            return this.docNumberCheckDigit;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getOptionalData2() {
            return this.optionalData2;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getOptionalData1() {
            return this.optionalData1;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocType() {
            return this.docType;
        }
    }

    public /* synthetic */ BaseDocument(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final com.miteksystems.misnap.core.Mrz toMrz() {
        return toMrz$default(this, null, 1, null);
    }

    public final com.miteksystems.misnap.core.Mrz toMrz(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType advancedDoctype) {
        if (this instanceof com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz) {
            com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz basicMrz = (com.miteksystems.misnap.document.internal.BaseDocument.BasicMrz) this;
            if (com.miteksystems.misnap.core.ValidationUtil.isValidMrz1Line(basicMrz.getRawData())) {
                return new com.miteksystems.misnap.core.Mrz1Line(basicMrz.getRawData());
            }
        } else if (this instanceof com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz) {
            com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz extendedMrz = (com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz) this;
            if (!kotlin.text.StringsKt.startsWith$default(extendedMrz.getDocType(), "P", false, 2, (java.lang.Object) null) && extendedMrz.getOptionalData1().length() > 0 && com.miteksystems.misnap.core.ValidationUtil.isOptionalData1LengthIncorrect(extendedMrz.getOptionalData1())) {
                java.lang.String substring = extendedMrz.getOptionalData1().substring(0, extendedMrz.getOptionalData1().length() - 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                extendedMrz.setOptionalData1(substring);
            }
            if (extendedMrz.getOptionalData1().length() == 0 && ((kotlin.text.StringsKt.startsWith$default(extendedMrz.getDocType(), "ID", false, 2, (java.lang.Object) null) && kotlin.jvm.internal.Intrinsics.areEqual(extendedMrz.getCountry(), "BEL")) || (kotlin.text.StringsKt.startsWith$default(extendedMrz.getDocType(), com.visa.cbp.getEncExpo.warmup, false, 2, (java.lang.Object) null) && kotlin.jvm.internal.Intrinsics.areEqual(extendedMrz.getCountry(), "PRT")))) {
                extendedMrz.setOptionalData1("<<<<<<<<<<<<<<");
            }
            extendedMrz.setDocNumber(kotlin.text.StringsKt.replace$default(extendedMrz.getDocNumber(), "<", "", false, 4, (java.lang.Object) null));
            com.miteksystems.misnap.core.MrzData mrzData = new com.miteksystems.misnap.core.MrzData(extendedMrz.getDocNumber(), extendedMrz.getDateOfBirth(), extendedMrz.getDateOfExpiration(), extendedMrz.getCountry(), extendedMrz.getDocType(), extendedMrz.getOptionalData1());
            if (advancedDoctype == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.TD2 || com.miteksystems.misnap.core.ValidationUtil.isValidMrzData(extendedMrz.getDocNumber(), extendedMrz.getDateOfBirth(), extendedMrz.getDateOfExpiration(), extendedMrz.getCountry(), extendedMrz.getDocType(), extendedMrz.getOptionalData1())) {
                return mrzData;
            }
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$Default;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Default extends com.miteksystems.misnap.document.internal.BaseDocument {
        public static final com.miteksystems.misnap.document.internal.BaseDocument.Default INSTANCE = new com.miteksystems.misnap.document.internal.BaseDocument.Default();

        private Default() {
            super(null);
        }
    }

    public final com.miteksystems.misnap.core.DocumentData toDocumentData() {
        if (!(this instanceof com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz)) {
            return null;
        }
        com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz extendedMrz = (com.miteksystems.misnap.document.internal.BaseDocument.ExtendedMrz) this;
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.trim(extendedMrz.getDocType()).toString(), "<", "", false, 4, (java.lang.Object) null);
        java.lang.String str = replace$default.length() == 0 ? null : replace$default;
        java.lang.String obj = kotlin.text.StringsKt.trim(extendedMrz.getCountry()).toString();
        java.lang.String str2 = obj.length() == 0 ? null : obj;
        java.lang.String replace$default2 = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.trim(extendedMrz.getSurname()).toString(), "<", " ", false, 4, (java.lang.Object) null);
        java.lang.String str3 = replace$default2.length() == 0 ? null : replace$default2;
        java.lang.String replace$default3 = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.trim(extendedMrz.getFirstName()).toString(), "<", " ", false, 4, (java.lang.Object) null);
        java.lang.String str4 = replace$default3.length() == 0 ? null : replace$default3;
        java.lang.String replace$default4 = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.trim(extendedMrz.getDocNumber()).toString(), "<", "", false, 4, (java.lang.Object) null);
        java.lang.String str5 = replace$default4.length() == 0 ? null : replace$default4;
        java.lang.String obj2 = kotlin.text.StringsKt.trim(extendedMrz.getNationality()).toString();
        java.lang.String str6 = obj2.length() == 0 ? null : obj2;
        java.lang.String formattedDate$default = com.miteksystems.misnap.core.DateUtil.getFormattedDate$default(kotlin.text.StringsKt.trim(extendedMrz.getDateOfBirth()).toString(), com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, "yyyy-MM-dd", false, false, 24, null);
        java.lang.String str7 = formattedDate$default.length() == 0 ? null : formattedDate$default;
        java.lang.String obj3 = kotlin.text.StringsKt.trim(extendedMrz.getSex()).toString();
        java.lang.String str8 = obj3.length() == 0 ? null : obj3;
        java.lang.String formattedDate$default2 = com.miteksystems.misnap.core.DateUtil.getFormattedDate$default(kotlin.text.StringsKt.trim(extendedMrz.getDateOfExpiration()).toString(), com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, "yyyy-MM-dd", false, false, 24, null);
        java.lang.String str9 = formattedDate$default2.length() == 0 ? null : formattedDate$default2;
        java.lang.String replace$default5 = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.trim(extendedMrz.getOptionalData1()).toString(), "<", "", false, 4, (java.lang.Object) null);
        java.lang.String str10 = replace$default5.length() == 0 ? null : replace$default5;
        java.lang.String replace$default6 = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.trim(extendedMrz.getOptionalData2()).toString(), "<", "", false, 4, (java.lang.Object) null);
        return new com.miteksystems.misnap.core.DocumentData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, replace$default6.length() == 0 ? null : replace$default6, extendedMrz.getRawData());
    }

    public static /* synthetic */ com.miteksystems.misnap.core.Mrz toMrz$default(com.miteksystems.misnap.document.internal.BaseDocument baseDocument, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType docType, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toMrz");
        }
        if ((i & 1) != 0) {
            docType = null;
        }
        return baseDocument.toMrz(docType);
    }

    private BaseDocument() {
    }
}
