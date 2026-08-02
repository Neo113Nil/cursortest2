package com.paypal.oslo.feature.activity.api.navigation.result.options;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "getNavResultOptions", "()Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "navResultOptions", "Companion", "ActivityDetailResult", "ActivitySearchResult", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult$ActivityDetailResult;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult$ActivitySearchResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class ActivityResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.Companion INSTANCE = new com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.$r8$lambda$zwa1ovjMPuyY5I2N3D9wb1mq2j8();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    public abstract com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions getNavResultOptions();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ActivityResult() {
    }

    public /* synthetic */ ActivityResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult$ActivityDetailResult;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "navResultOptions", "Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;", "payload", "<init>", "(Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;)V", "component1", "()Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "component2", "()Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;", "copy", "(Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;)Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult$ActivityDetailResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "getNavResultOptions", "Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;", "getPayload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class ActivityDetailResult extends com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions;
        private final com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityDetailResult(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultOptions, "");
            this.navResultOptions = navResultOptions;
            this.payload = iPayload;
        }

        public /* synthetic */ ActivityDetailResult(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions(0, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : navResultOptions, (i & 2) != 0 ? null : iPayload);
        }

        @Override // com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult
        public final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions getNavResultOptions() {
            return this.navResultOptions;
        }

        public final com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload getPayload() {
            return this.payload;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions = this.navResultOptions;
            com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload = this.payload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailResult(navResultOptions=");
            sb.append(navResultOptions);
            sb.append(", payload=");
            sb.append(iPayload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.navResultOptions.hashCode();
            com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload = this.payload;
            return (hashCode * 31) + (iPayload == null ? 0 : iPayload.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult)) {
                return false;
            }
            com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult activityDetailResult = (com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.navResultOptions, activityDetailResult.navResultOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, activityDetailResult.payload);
        }

        public final com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult copy(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload payload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultOptions, "");
            return new com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult(navResultOptions, payload);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload getPayload() {
            return this.payload;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions getNavResultOptions() {
            return this.navResultOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult copy$default(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult activityDetailResult, com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navResultOptions = activityDetailResult.navResultOptions;
            }
            if ((i & 2) != 0) {
                iPayload = activityDetailResult.payload;
            }
            return activityDetailResult.copy(navResultOptions, iPayload);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ActivityDetailResult() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult$ActivitySearchResult;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "navResultOptions", "Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;", "payload", "<init>", "(Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;)V", "component1", "()Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "component2", "()Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;", "copy", "(Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;)Lcom/paypal/oslo/feature/activity/api/navigation/result/options/ActivityResult$ActivitySearchResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "getNavResultOptions", "Lcom/paypal/oslo/feature/activity/api/navigation/result/payload/IPayload;", "getPayload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class ActivitySearchResult extends com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions;
        private final com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivitySearchResult(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultOptions, "");
            this.navResultOptions = navResultOptions;
            this.payload = iPayload;
        }

        public /* synthetic */ ActivitySearchResult(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions(0, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : navResultOptions, (i & 2) != 0 ? null : iPayload);
        }

        @Override // com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult
        public final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions getNavResultOptions() {
            return this.navResultOptions;
        }

        public final com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload getPayload() {
            return this.payload;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions = this.navResultOptions;
            com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload = this.payload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivitySearchResult(navResultOptions=");
            sb.append(navResultOptions);
            sb.append(", payload=");
            sb.append(iPayload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.navResultOptions.hashCode();
            com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload = this.payload;
            return (hashCode * 31) + (iPayload == null ? 0 : iPayload.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivitySearchResult)) {
                return false;
            }
            com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivitySearchResult activitySearchResult = (com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivitySearchResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.navResultOptions, activitySearchResult.navResultOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, activitySearchResult.payload);
        }

        public final com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivitySearchResult copy(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload payload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultOptions, "");
            return new com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivitySearchResult(navResultOptions, payload);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload getPayload() {
            return this.payload;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions getNavResultOptions() {
            return this.navResultOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivitySearchResult copy$default(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivitySearchResult activitySearchResult, com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, com.paypal.oslo.feature.activity.api.navigation.result.payload.IPayload iPayload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navResultOptions = activitySearchResult.navResultOptions;
            }
            if ((i & 2) != 0) {
                iPayload = activitySearchResult.payload;
            }
            return activitySearchResult.copy(navResultOptions, iPayload);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ActivitySearchResult() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$zwa1ovjMPuyY5I2N3D9wb1mq2j8() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ ActivityResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
