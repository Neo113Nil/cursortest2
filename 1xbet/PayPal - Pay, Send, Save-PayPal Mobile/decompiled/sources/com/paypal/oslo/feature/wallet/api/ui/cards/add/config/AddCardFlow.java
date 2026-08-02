package com.paypal.oslo.feature.wallet.api.ui.cards.add.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow;", "", "InitScreen", "Options", "Header"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AddCardFlow {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "FORM", "SCANNER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class InitScreen {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen[] $VALUES;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.Companion INSTANCE;
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen FORM;
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen SCANNER;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen> serializer() {
                return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.$cachedSerializer$delegate.getValue();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private InitScreen(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initScreen = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen("FORM", 0);
            FORM = initScreen;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initScreen2 = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen("SCANNER", 1);
            SCANNER = initScreen2;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen[] initScreenArr = {initScreen, initScreen2};
            $VALUES = initScreenArr;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(initScreenArr);
            INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.Companion(null);
            $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$InitScreen$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                    createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen", com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.values());
                    return createSimpleEnumSerializer;
                }
            });
        }

        public static com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen[] values() {
            return (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen[]) $VALUES.clone();
        }

        public static com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen> getEntries() {
            return $ENTRIES;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "", "", "skip3DS2Confirmation", "showSuccessScreen", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;", "initialScreen", "<init>", "(ZZLcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;", "copy", "(ZZLcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getSkip3DS2Confirmation", "getShowSuccessScreen", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;", "getInitialScreen", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Options {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initialScreen;
        private final boolean showSuccessScreen;
        private final boolean skip3DS2Confirmation;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options> serializer() {
                return com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Options(int i, boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initScreen, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.skip3DS2Confirmation = false;
            } else {
                this.skip3DS2Confirmation = z;
            }
            if ((i & 2) == 0) {
                this.showSuccessScreen = false;
            } else {
                this.showSuccessScreen = z2;
            }
            if ((i & 4) == 0) {
                this.initialScreen = com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.FORM;
            } else {
                this.initialScreen = initScreen;
            }
        }

        public Options(boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initScreen) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initScreen, "");
            this.skip3DS2Confirmation = z;
            this.showSuccessScreen = z2;
            this.initialScreen = initScreen;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.skip3DS2Confirmation) {
                output.encodeBooleanElement(serialDesc, 0, self.skip3DS2Confirmation);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.showSuccessScreen) {
                output.encodeBooleanElement(serialDesc, 1, self.showSuccessScreen);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.initialScreen != com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.FORM) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.initialScreen);
            }
        }

        public final boolean getSkip3DS2Confirmation() {
            return this.skip3DS2Confirmation;
        }

        public final boolean getShowSuccessScreen() {
            return this.showSuccessScreen;
        }

        public /* synthetic */ Options(boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initScreen, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.FORM : initScreen);
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen getInitialScreen() {
            return this.initialScreen;
        }

        public final java.lang.String toString() {
            boolean z = this.skip3DS2Confirmation;
            boolean z2 = this.showSuccessScreen;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initScreen = this.initialScreen;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Options(skip3DS2Confirmation=");
            sb.append(z);
            sb.append(", showSuccessScreen=");
            sb.append(z2);
            sb.append(", initialScreen=");
            sb.append(initScreen);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Boolean.hashCode(this.skip3DS2Confirmation) * 31) + java.lang.Boolean.hashCode(this.showSuccessScreen)) * 31) + this.initialScreen.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options) other;
            return this.skip3DS2Confirmation == options.skip3DS2Confirmation && this.showSuccessScreen == options.showSuccessScreen && this.initialScreen == options.initialScreen;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options copy(boolean skip3DS2Confirmation, boolean showSuccessScreen, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initialScreen) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialScreen, "");
            return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(skip3DS2Confirmation, showSuccessScreen, initialScreen);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen getInitialScreen() {
            return this.initialScreen;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowSuccessScreen() {
            return this.showSuccessScreen;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSkip3DS2Confirmation() {
            return this.skip3DS2Confirmation;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initScreen, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = options.skip3DS2Confirmation;
            }
            if ((i & 2) != 0) {
                z2 = options.showSuccessScreen;
            }
            if ((i & 4) != 0) {
                initScreen = options.initialScreen;
            }
            return options.copy(z, z2, initScreen);
        }

        public Options() {
            this(false, false, (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "TopBar", "ProgressBar", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$ProgressBar;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$TopBar;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static abstract class Header {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.m20759$r8$lambda$5jVbjVgkcU1k_6gHSLlyZx7_Q();
            }
        });

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header> serializer() {
                return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.$cachedSerializer$delegate.getValue();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Header() {
        }

        public /* synthetic */ Header(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        }

        @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$TopBar;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "", "appBarTitle", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "startNavAction", "endNavAction", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$TopBar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$TopBar;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAppBarTitle", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "getStartNavAction", "getEndNavAction", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class TopBar extends com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header {
            public static final int $stable = 0;
            private final java.lang.String appBarTitle;
            private final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction endNavAction;
            private final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction startNavAction;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar.Companion(null);
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$TopBar$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                    createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction", com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values());
                    return createSimpleEnumSerializer;
                }
            }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$TopBar$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                    createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction", com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values());
                    return createSimpleEnumSerializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$TopBar$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$TopBar;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar> serializer() {
                    return com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$TopBar$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ TopBar(int i, java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if ((i & 1) == 0) {
                    this.appBarTitle = null;
                } else {
                    this.appBarTitle = str;
                }
                if ((i & 2) == 0) {
                    this.startNavAction = com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK;
                } else {
                    this.startNavAction = navAction;
                }
                if ((i & 4) == 0) {
                    this.endNavAction = null;
                } else {
                    this.endNavAction = navAction2;
                }
            }

            public TopBar(java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2) {
                super(null);
                this.appBarTitle = str;
                this.startNavAction = navAction;
                this.endNavAction = navAction2;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.write$Self(self, output, serialDesc);
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.appBarTitle != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.appBarTitle);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.startNavAction != com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK) {
                    output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.startNavAction);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.endNavAction != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.endNavAction);
                }
            }

            public final java.lang.String getAppBarTitle() {
                return this.appBarTitle;
            }

            public /* synthetic */ TopBar(java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK : navAction, (i & 4) != 0 ? null : navAction2);
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getStartNavAction() {
                return this.startNavAction;
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getEndNavAction() {
                return this.endNavAction;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.appBarTitle;
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction = this.startNavAction;
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2 = this.endNavAction;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TopBar(appBarTitle=");
                sb.append(str);
                sb.append(", startNavAction=");
                sb.append(navAction);
                sb.append(", endNavAction=");
                sb.append(navAction2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.appBarTitle;
                int hashCode = str == null ? 0 : str.hashCode();
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction = this.startNavAction;
                int hashCode2 = navAction == null ? 0 : navAction.hashCode();
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2 = this.endNavAction;
                return (((hashCode * 31) + hashCode2) * 31) + (navAction2 != null ? navAction2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar topBar = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.appBarTitle, topBar.appBarTitle) && this.startNavAction == topBar.startNavAction && this.endNavAction == topBar.endNavAction;
            }

            public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar copy(java.lang.String appBarTitle, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction startNavAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction endNavAction) {
                return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar(appBarTitle, startNavAction, endNavAction);
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getEndNavAction() {
                return this.endNavAction;
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getStartNavAction() {
                return this.startNavAction;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAppBarTitle() {
                return this.appBarTitle;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar topBar, java.lang.String str, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = topBar.appBarTitle;
                }
                if ((i & 2) != 0) {
                    navAction = topBar.startNavAction;
                }
                if ((i & 4) != 0) {
                    navAction2 = topBar.endNavAction;
                }
                return topBar.copy(str, navAction, navAction2);
            }

            public TopBar() {
                this((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$ProgressBar;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "progress", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "startNavAction", "endNavAction", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "component3", "copy", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$ProgressBar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$ProgressBar;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "getProgress", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "getStartNavAction", "getEndNavAction", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class ProgressBar extends com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction endNavAction;
            private final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress;
            private final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction startNavAction;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar.Companion(null);
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$ProgressBar$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.INSTANCE.serializer();
                    return serializer;
                }
            }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$ProgressBar$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                    createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction", com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values());
                    return createSimpleEnumSerializer;
                }
            }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$ProgressBar$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                    createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction", com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values());
                    return createSimpleEnumSerializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$ProgressBar$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header$ProgressBar;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar> serializer() {
                    return com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$ProgressBar$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ProgressBar(int i, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$ProgressBar$$serializer.INSTANCE.getDescriptor());
                }
                this.progress = progress;
                if ((i & 2) == 0) {
                    this.startNavAction = null;
                } else {
                    this.startNavAction = navAction;
                }
                if ((i & 4) == 0) {
                    this.endNavAction = com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP;
                } else {
                    this.endNavAction = navAction2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProgressBar(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
                this.progress = progress;
                this.startNavAction = navAction;
                this.endNavAction = navAction2;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.write$Self(self, output, serialDesc);
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.progress);
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.startNavAction != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.startNavAction);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.endNavAction != com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP) {
                    output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.endNavAction);
                }
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress getProgress() {
                return this.progress;
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getStartNavAction() {
                return this.startNavAction;
            }

            public /* synthetic */ ProgressBar(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(progress, (i & 2) != 0 ? null : navAction, (i & 4) != 0 ? com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP : navAction2);
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getEndNavAction() {
                return this.endNavAction;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress = this.progress;
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction = this.startNavAction;
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2 = this.endNavAction;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ProgressBar(progress=");
                sb.append(progress);
                sb.append(", startNavAction=");
                sb.append(navAction);
                sb.append(", endNavAction=");
                sb.append(navAction2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.progress.hashCode();
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction = this.startNavAction;
                int hashCode2 = navAction == null ? 0 : navAction.hashCode();
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2 = this.endNavAction;
                return (((hashCode * 31) + hashCode2) * 31) + (navAction2 != null ? navAction2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar progressBar = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.progress, progressBar.progress) && this.startNavAction == progressBar.startNavAction && this.endNavAction == progressBar.endNavAction;
            }

            public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar copy(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction startNavAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction endNavAction) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
                return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar(progress, startNavAction, endNavAction);
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getEndNavAction() {
                return this.endNavAction;
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getStartNavAction() {
                return this.startNavAction;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress getProgress() {
                return this.progress;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar copy$default(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar progressBar, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    progress = progressBar.progress;
                }
                if ((i & 2) != 0) {
                    navAction = progressBar.startNavAction;
                }
                if ((i & 4) != 0) {
                    navAction2 = progressBar.endNavAction;
                }
                return progressBar.copy(progress, navAction, navAction2);
            }
        }

        /* renamed from: $r8$lambda$5jVbjVgkcU1k_6gH-SLlyZx7-_Q, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20759$r8$lambda$5jVbjVgkcU1k_6gHSLlyZx7_Q() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.ProgressBar.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$ProgressBar$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Header$TopBar$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }

        public /* synthetic */ Header(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
