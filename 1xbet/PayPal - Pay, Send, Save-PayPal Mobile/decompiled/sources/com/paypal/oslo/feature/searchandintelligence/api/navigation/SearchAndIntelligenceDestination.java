package com.paypal.oslo.feature.searchandintelligence.api.navigation;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0003()'B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;", "initialMessage", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;)Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_api_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;", "getInitialMessage", "Companion", "InitialMessage", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SearchAndIntelligenceDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;
    private final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceDestinationAnalytics $$delegate_0;
    private final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination> serializer() {
            return com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SearchAndIntelligenceDestination(int i, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.initialMessage = null;
        } else {
            this.initialMessage = initialMessage;
        }
        this.$$delegate_0 = com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceDestinationAnalytics.INSTANCE;
    }

    public SearchAndIntelligenceDestination(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage) {
        this.$$delegate_0 = com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceDestinationAnalytics.INSTANCE;
        this.initialMessage = initialMessage;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$search_and_intelligence_api_prodRelease(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.initialMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.initialMessage);
        }
    }

    public /* synthetic */ SearchAndIntelligenceDestination(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : initialMessage);
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getMessage", "()Ljava/lang/String;", "message", "Companion", "Prompt", "Local", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Local;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Prompt;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static abstract class InitialMessage {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.$r8$lambda$nt4YmQnVk89WMK6FXeQTVmGTle8();
            }
        });

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }

        public abstract java.lang.String getMessage();

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage> serializer() {
                return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.$cachedSerializer$delegate.getValue();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private InitialMessage() {
        }

        public /* synthetic */ InitialMessage(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Prompt;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;", "", "message", "", androidx.core.app.NotificationCompat.GROUP_KEY_SILENT, "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Prompt;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_api_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Prompt;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMessage", "Z", "getSilent", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Prompt extends com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt.Companion(null);
            private final java.lang.String message;
            private final boolean silent;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Prompt$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Prompt;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes14.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt> serializer() {
                    return com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage$Prompt$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Prompt(int i, java.lang.String str, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage$Prompt$$serializer.INSTANCE.getDescriptor());
                }
                this.message = str;
                if ((i & 2) == 0) {
                    this.silent = true;
                } else {
                    this.silent = z;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Prompt(java.lang.String str, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
                this.silent = z;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$search_and_intelligence_api_prodRelease(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.write$Self(self, output, serialDesc);
                output.encodeStringElement(serialDesc, 0, self.getMessage());
                if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.silent) {
                    output.encodeBooleanElement(serialDesc, 1, self.silent);
                }
            }

            public /* synthetic */ Prompt(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? true : z);
            }

            @Override // com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage
            public final java.lang.String getMessage() {
                return this.message;
            }

            public final boolean getSilent() {
                return this.silent;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                boolean z = this.silent;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Prompt(message=");
                sb.append(str);
                sb.append(", silent=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.message.hashCode() * 31) + java.lang.Boolean.hashCode(this.silent);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt)) {
                    return false;
                }
                com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt prompt = (com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.message, prompt.message) && this.silent == prompt.silent;
            }

            public final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt copy(java.lang.String message, boolean silent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt(message, silent);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getSilent() {
                return this.silent;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt copy$default(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt prompt, java.lang.String str, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = prompt.message;
                }
                if ((i & 2) != 0) {
                    z = prompt.silent;
                }
                return prompt.copy(str, z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Local;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Local;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_api_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Local;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Local extends com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local.Companion(null);
            private final java.lang.String message;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Local$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination$InitialMessage$Local;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes14.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local> serializer() {
                    return com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage$Local$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Local(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage$Local$$serializer.INSTANCE.getDescriptor());
                }
                this.message = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Local(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$search_and_intelligence_api_prodRelease(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.write$Self(self, output, serialDesc);
                output.encodeStringElement(serialDesc, 0, self.getMessage());
            }

            @Override // com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage
            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Local(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local) other).message);
            }

            public final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local copy$default(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local local, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = local.message;
                }
                return local.copy(str);
            }
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$nt4YmQnVk89WMK6FXeQTVmGTle8() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Local.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.Prompt.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage$Local$$serializer.INSTANCE, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage$Prompt$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }

        public /* synthetic */ InitialMessage(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage getInitialMessage() {
        return this.initialMessage;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage = this.initialMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchAndIntelligenceDestination(initialMessage=");
        sb.append(initialMessage);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return this.$$delegate_0.toAnalyticsScreenDescriptor();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage = this.initialMessage;
        if (initialMessage == null) {
            return 0;
        }
        return initialMessage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialMessage, ((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination) other).initialMessage);
    }

    public final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination copy(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage) {
        return new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination(initialMessage);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage getInitialMessage() {
        return this.initialMessage;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination copy$default(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            initialMessage = searchAndIntelligenceDestination.initialMessage;
        }
        return searchAndIntelligenceDestination.copy(initialMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchAndIntelligenceDestination() {
        this((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
