package com.paypal.oslo.feature.wallet.api.ui.cards.add.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm;", "", "Config", "Slots", "Result", "ProgressEvents", "Events"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AddCardForm {

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018Jf\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b4\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b6\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "", "", "headerTitle", "headerDescription", "formSubmitButtonLabel", "", "showBillingAddress", "showUserName", "showCardScan", "allowEditBillingAddress", "disableBackNavigation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getHeaderTitle", "getHeaderDescription", "getFormSubmitButtonLabel", "Z", "getShowBillingAddress", "getShowUserName", "getShowCardScan", "getAllowEditBillingAddress", "getDisableBackNavigation", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Config {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config.Companion(null);
        private final boolean allowEditBillingAddress;
        private final boolean disableBackNavigation;
        private final java.lang.String formSubmitButtonLabel;
        private final java.lang.String headerDescription;
        private final java.lang.String headerTitle;
        private final boolean showBillingAddress;
        private final boolean showCardScan;
        private final boolean showUserName;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config> serializer() {
                return com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Config(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.headerTitle = null;
            } else {
                this.headerTitle = str;
            }
            if ((i & 2) == 0) {
                this.headerDescription = null;
            } else {
                this.headerDescription = str2;
            }
            if ((i & 4) == 0) {
                this.formSubmitButtonLabel = null;
            } else {
                this.formSubmitButtonLabel = str3;
            }
            if ((i & 8) == 0) {
                this.showBillingAddress = true;
            } else {
                this.showBillingAddress = z;
            }
            if ((i & 16) == 0) {
                this.showUserName = true;
            } else {
                this.showUserName = z2;
            }
            if ((i & 32) == 0) {
                this.showCardScan = true;
            } else {
                this.showCardScan = z3;
            }
            if ((i & 64) == 0) {
                this.allowEditBillingAddress = true;
            } else {
                this.allowEditBillingAddress = z4;
            }
            if ((i & 128) == 0) {
                this.disableBackNavigation = false;
            } else {
                this.disableBackNavigation = z5;
            }
        }

        public Config(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.headerTitle = str;
            this.headerDescription = str2;
            this.formSubmitButtonLabel = str3;
            this.showBillingAddress = z;
            this.showUserName = z2;
            this.showCardScan = z3;
            this.allowEditBillingAddress = z4;
            this.disableBackNavigation = z5;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.headerTitle != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.headerTitle);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headerDescription != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.headerDescription);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.formSubmitButtonLabel != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.formSubmitButtonLabel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.showBillingAddress) {
                output.encodeBooleanElement(serialDesc, 3, self.showBillingAddress);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || !self.showUserName) {
                output.encodeBooleanElement(serialDesc, 4, self.showUserName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || !self.showCardScan) {
                output.encodeBooleanElement(serialDesc, 5, self.showCardScan);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || !self.allowEditBillingAddress) {
                output.encodeBooleanElement(serialDesc, 6, self.allowEditBillingAddress);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.disableBackNavigation) {
                output.encodeBooleanElement(serialDesc, 7, self.disableBackNavigation);
            }
        }

        public /* synthetic */ Config(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3, (i & 64) == 0 ? z4 : true, (i & 128) != 0 ? false : z5);
        }

        public final java.lang.String getHeaderTitle() {
            return this.headerTitle;
        }

        public final java.lang.String getHeaderDescription() {
            return this.headerDescription;
        }

        public final java.lang.String getFormSubmitButtonLabel() {
            return this.formSubmitButtonLabel;
        }

        public final boolean getShowBillingAddress() {
            return this.showBillingAddress;
        }

        public final boolean getShowUserName() {
            return this.showUserName;
        }

        public final boolean getShowCardScan() {
            return this.showCardScan;
        }

        public final boolean getAllowEditBillingAddress() {
            return this.allowEditBillingAddress;
        }

        public final boolean getDisableBackNavigation() {
            return this.disableBackNavigation;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.headerTitle;
            java.lang.String str2 = this.headerDescription;
            java.lang.String str3 = this.formSubmitButtonLabel;
            boolean z = this.showBillingAddress;
            boolean z2 = this.showUserName;
            boolean z3 = this.showCardScan;
            boolean z4 = this.allowEditBillingAddress;
            boolean z5 = this.disableBackNavigation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(headerTitle=");
            sb.append(str);
            sb.append(", headerDescription=");
            sb.append(str2);
            sb.append(", formSubmitButtonLabel=");
            sb.append(str3);
            sb.append(", showBillingAddress=");
            sb.append(z);
            sb.append(", showUserName=");
            sb.append(z2);
            sb.append(", showCardScan=");
            sb.append(z3);
            sb.append(", allowEditBillingAddress=");
            sb.append(z4);
            sb.append(", disableBackNavigation=");
            sb.append(z5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.headerTitle;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.headerDescription;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.formSubmitButtonLabel;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.showBillingAddress)) * 31) + java.lang.Boolean.hashCode(this.showUserName)) * 31) + java.lang.Boolean.hashCode(this.showCardScan)) * 31) + java.lang.Boolean.hashCode(this.allowEditBillingAddress)) * 31) + java.lang.Boolean.hashCode(this.disableBackNavigation);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.headerTitle, config.headerTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.headerDescription, config.headerDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.formSubmitButtonLabel, config.formSubmitButtonLabel) && this.showBillingAddress == config.showBillingAddress && this.showUserName == config.showUserName && this.showCardScan == config.showCardScan && this.allowEditBillingAddress == config.allowEditBillingAddress && this.disableBackNavigation == config.disableBackNavigation;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config copy(java.lang.String headerTitle, java.lang.String headerDescription, java.lang.String formSubmitButtonLabel, boolean showBillingAddress, boolean showUserName, boolean showCardScan, boolean allowEditBillingAddress, boolean disableBackNavigation) {
            return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config(headerTitle, headerDescription, formSubmitButtonLabel, showBillingAddress, showUserName, showCardScan, allowEditBillingAddress, disableBackNavigation);
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getDisableBackNavigation() {
            return this.disableBackNavigation;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAllowEditBillingAddress() {
            return this.allowEditBillingAddress;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowCardScan() {
            return this.showCardScan;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowUserName() {
            return this.showUserName;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowBillingAddress() {
            return this.showBillingAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFormSubmitButtonLabel() {
            return this.formSubmitButtonLabel;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderDescription() {
            return this.headerDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getHeaderTitle() {
            return this.headerTitle;
        }

        public Config() {
            this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, 255, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004\u0012\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004\u0012\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004\u0012\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJl\u0010\u0010\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR'\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\fR'\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\fR'\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Slots;", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "beforeForm", "afterForm", "beforeFooter", "afterFooter", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "component2", "component3", "component4", "copy", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Slots;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getBeforeForm", "getAfterForm", "getBeforeFooter", "getAfterFooter"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Slots {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> afterFooter;
        private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> afterForm;
        private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> beforeFooter;
        private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> beforeForm;

        /* JADX WARN: Multi-variable type inference failed */
        public Slots(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24) {
            this.beforeForm = function2;
            this.afterForm = function22;
            this.beforeFooter = function23;
            this.afterFooter = function24;
        }

        public /* synthetic */ Slots(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function22, (i & 4) != 0 ? null : function23, (i & 8) != 0 ? null : function24);
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getBeforeForm() {
            return this.beforeForm;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getAfterForm() {
            return this.afterForm;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getBeforeFooter() {
            return this.beforeFooter;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getAfterFooter() {
            return this.afterFooter;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.beforeForm;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.afterForm;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.beforeFooter;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.afterFooter;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Slots(beforeForm=");
            sb.append(function2);
            sb.append(", afterForm=");
            sb.append(function22);
            sb.append(", beforeFooter=");
            sb.append(function23);
            sb.append(", afterFooter=");
            sb.append(function24);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.beforeForm;
            int hashCode = function2 == null ? 0 : function2.hashCode();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.afterForm;
            int hashCode2 = function22 == null ? 0 : function22.hashCode();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.beforeFooter;
            int hashCode3 = function23 == null ? 0 : function23.hashCode();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.afterFooter;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (function24 != null ? function24.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots slots = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.beforeForm, slots.beforeForm) && kotlin.jvm.internal.Intrinsics.areEqual(this.afterForm, slots.afterForm) && kotlin.jvm.internal.Intrinsics.areEqual(this.beforeFooter, slots.beforeFooter) && kotlin.jvm.internal.Intrinsics.areEqual(this.afterFooter, slots.afterFooter);
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots copy(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> beforeForm, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> afterForm, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> beforeFooter, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> afterFooter) {
            return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots(beforeForm, afterForm, beforeFooter, afterFooter);
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component4() {
            return this.afterFooter;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component3() {
            return this.beforeFooter;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component2() {
            return this.afterForm;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component1() {
            return this.beforeForm;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots slots, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function2 = slots.beforeForm;
            }
            if ((i & 2) != 0) {
                function22 = slots.afterForm;
            }
            if ((i & 4) != 0) {
                function23 = slots.beforeFooter;
            }
            if ((i & 8) != 0) {
                function24 = slots.afterFooter;
            }
            return slots.copy(function2, function22, function23, function24);
        }

        public Slots() {
            this(null, null, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result;", "", "Success", "Error", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result$Error;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public interface Result {

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result$Success;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result;", "", "successMsg", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSuccessMsg"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result {
            public static final int $stable = 0;
            private final java.lang.String successMsg;

            public Success(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.successMsg = str;
            }

            public final java.lang.String getSuccessMsg() {
                return this.successMsg;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.successMsg;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(successMsg=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.successMsg.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.successMsg, ((com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Success) other).successMsg);
            }

            public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Success copy(java.lang.String successMsg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successMsg, "");
                return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Success(successMsg);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getSuccessMsg() {
                return this.successMsg;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Success copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Success success, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.successMsg;
                }
                return success.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result$Error;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result;", "", "errorMsg", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMsg"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result {
            public static final int $stable = 0;
            private final java.lang.String errorMsg;

            public Error(java.lang.String str) {
                this.errorMsg = str;
            }

            public final java.lang.String getErrorMsg() {
                return this.errorMsg;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMsg;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMsg=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorMsg;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMsg, ((com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Error) other).errorMsg);
            }

            public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Error copy(java.lang.String errorMsg) {
                return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Error(errorMsg);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMsg() {
                return this.errorMsg;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Error copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMsg;
                }
                return error.copy(str);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents;", "", "Initializing", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Validating", "LinkingCard", "Processing3DS", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Initializing;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$LinkingCard;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Processing3DS;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Ready;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Validating;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public interface ProgressEvents {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Initializing;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initializing implements com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Initializing INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Initializing();

            public final int hashCode() {
                return 1621275434;
            }

            private Initializing() {
            }

            public final java.lang.String toString() {
                return "Initializing";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Initializing)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Ready;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready implements com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Ready INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Ready();

            public final int hashCode() {
                return 815184230;
            }

            private Ready() {
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Ready)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Validating;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Validating implements com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Validating INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Validating();

            public final int hashCode() {
                return -54867344;
            }

            private Validating() {
            }

            public final java.lang.String toString() {
                return "Validating";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Validating)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$LinkingCard;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LinkingCard implements com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.LinkingCard INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.LinkingCard();

            public final int hashCode() {
                return -2111059365;
            }

            private LinkingCard() {
            }

            public final java.lang.String toString() {
                return "LinkingCard";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.LinkingCard)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents$Processing3DS;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Processing3DS implements com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Processing3DS INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Processing3DS();

            public final int hashCode() {
                return 183453906;
            }

            private Processing3DS() {
            }

            public final java.lang.String toString() {
                return "Processing3DS";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents.Processing3DS)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ<\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Events;", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Result;", "", "onComplete", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$ProgressEvents;", "onProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Events;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnComplete", "getOnProgress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Events {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result, kotlin.Unit> onComplete;
        private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents, kotlin.Unit> onProgress;

        /* JADX WARN: Multi-variable type inference failed */
        public Events(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents, kotlin.Unit> function12) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
            this.onComplete = function1;
            this.onProgress = function12;
        }

        public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result, kotlin.Unit> getOnComplete() {
            return this.onComplete;
        }

        public /* synthetic */ Events(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(function1, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Events$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events.$r8$lambda$A1wdLFL5RU3R7l2MZiqZFyF6OVY((com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents) obj);
                }
            } : function12);
        }

        public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents, kotlin.Unit> getOnProgress() {
            return this.onProgress;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$A1wdLFL5RU3R7l2MZiqZFyF6OVY(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents progressEvents) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressEvents, "");
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.String toString() {
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result, kotlin.Unit> function1 = this.onComplete;
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents, kotlin.Unit> function12 = this.onProgress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Events(onComplete=");
            sb.append(function1);
            sb.append(", onProgress=");
            sb.append(function12);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.onComplete.hashCode() * 31) + this.onProgress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events events = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.onComplete, events.onComplete) && kotlin.jvm.internal.Intrinsics.areEqual(this.onProgress, events.onProgress);
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events copy(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result, kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents, kotlin.Unit> onProgress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onProgress, "");
            return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events(onComplete, onProgress);
        }

        public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.ProgressEvents, kotlin.Unit> component2() {
            return this.onProgress;
        }

        public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Result, kotlin.Unit> component1() {
            return this.onComplete;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events events, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = events.onComplete;
            }
            if ((i & 2) != 0) {
                function12 = events.onProgress;
            }
            return events.copy(function1, function12);
        }
    }
}
