package com.paypal.oslo.feature.onboarding.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;", "dismissType", "<init>", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;", "copy", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;)Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;", "getDismissType", "Companion", "DismissType", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class MGMInviteFriendsNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType dismissType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult> serializer() {
            return com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MGMInviteFriendsNavResult(int i, com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType dismissType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.dismissType = dismissType;
    }

    public MGMInviteFriendsNavResult(com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType dismissType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissType, "");
        this.dismissType = dismissType;
    }

    public final com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType getDismissType() {
        return this.dismissType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;", "", "<init>", "(Ljava/lang/String;)V", "Companion", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class DismissType {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType[] $VALUES;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
        public static final com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType CLOSE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType.Companion INSTANCE;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/MGMInviteFriendsNavResult$DismissType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType> serializer() {
                return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType.$cachedSerializer$delegate.getValue();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private DismissType(java.lang.String str) {
        }

        static {
            com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType dismissType = new com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE);
            CLOSE = dismissType;
            com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType[] dismissTypeArr = {dismissType};
            $VALUES = dismissTypeArr;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(dismissTypeArr);
            INSTANCE = new com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType.Companion(null);
            $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult$DismissType$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                    createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType", com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType.values());
                    return createSimpleEnumSerializer;
                }
            });
        }

        public static com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType[] values() {
            return (com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType[]) $VALUES.clone();
        }

        public static com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType> getEntries() {
            return $ENTRIES;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType dismissType = this.dismissType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MGMInviteFriendsNavResult(dismissType=");
        sb.append(dismissType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.dismissType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult) && this.dismissType == ((com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult) other).dismissType;
    }

    public final com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult copy(com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType dismissType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissType, "");
        return new com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult(dismissType);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType getDismissType() {
        return this.dismissType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult copy$default(com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult mGMInviteFriendsNavResult, com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType dismissType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dismissType = mGMInviteFriendsNavResult.dismissType;
        }
        return mGMInviteFriendsNavResult.copy(dismissType);
    }
}
