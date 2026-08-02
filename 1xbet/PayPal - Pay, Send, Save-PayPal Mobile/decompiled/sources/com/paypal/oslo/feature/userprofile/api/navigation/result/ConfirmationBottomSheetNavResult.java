package com.paypal.oslo.feature.userprofile.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Action;", "action", "<init>", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Action;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Action;", "copy", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Action;)Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$user_profile_api_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Action;", "getAction", "Companion", "Action", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ConfirmationBottomSheetNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action", com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult> serializer() {
            return com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConfirmationBottomSheetNavResult(int i, com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.action = action;
    }

    public ConfirmationBottomSheetNavResult(com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        this.action = action;
    }

    public final com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action getAction() {
        return this.action;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/ConfirmationBottomSheetNavResult$Action;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action PRIMARY;
        public static final com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action SECONDARY;
        private static final /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action[] getHighSpeedVideoSizes;

        private Action(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action = new com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action("PRIMARY", 0);
            PRIMARY = action;
            com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action2 = new com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action("SECONDARY", 1);
            SECONDARY = action2;
            com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action[] actionArr = {action, action2};
            getHighSpeedVideoSizes = actionArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(actionArr);
        }

        public static com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action[] values() {
            return (com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action) java.lang.Enum.valueOf(com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationBottomSheetNavResult(action=");
        sb.append(action);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.action.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult) && this.action == ((com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult) other).action;
    }

    public final com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult copy(com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult(action);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action getAction() {
        return this.action;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult copy$default(com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult confirmationBottomSheetNavResult, com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            action = confirmationBottomSheetNavResult.action;
        }
        return confirmationBottomSheetNavResult.copy(action);
    }
}
