package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "ReturnResult", "ContinueNavigation", "Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ContinueNavigation;", "Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ReturnResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class PostLoginIntent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.model.PostLoginIntent.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.PostLoginIntent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.api.model.PostLoginIntent.$r8$lambda$t1LFk4BLiz0pnTe9aXdkGiJRS_o();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.identity.api.model.PostLoginIntent self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.PostLoginIntent> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.api.model.PostLoginIntent.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PostLoginIntent() {
    }

    public /* synthetic */ PostLoginIntent(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ReturnResult;", "Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes5.dex */
    public static final /* data */ class ReturnResult extends com.paypal.oslo.feature.identity.api.model.PostLoginIntent {
        public static final com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult INSTANCE = new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.PostLoginIntent$ReturnResult$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.$r8$lambda$KcSlON08HDHy3wdoLla4za9K5s0();
            }
        });

        public final int hashCode() {
            return -113423314;
        }

        private ReturnResult() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$KcSlON08HDHy3wdoLla4za9K5s0() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "ReturnResult";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ContinueNavigation;", "Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent;", "Landroidx/navigation3/runtime/NavKey;", "postLoginDestination", "postSignUpFlowDestination", "<init>", "(Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILandroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "copy", "(Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ContinueNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ContinueNavigation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroidx/navigation3/runtime/NavKey;", "getPostLoginDestination", "getPostSignUpFlowDestination", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ContinueNavigation extends com.paypal.oslo.feature.identity.api.model.PostLoginIntent {
        private final androidx.navigation3.runtime.NavKey postLoginDestination;
        private final androidx.navigation3.runtime.NavKey postSignUpFlowDestination;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.PostLoginIntent$ContinueNavigation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation.$r8$lambda$kSW_fx6Z4sxnEPmt3m3wZZihRVg();
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.PostLoginIntent$ContinueNavigation$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation.$r8$lambda$hJVLZSq9zK3nc5weCJezieUjaMQ();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ContinueNavigation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/PostLoginIntent$ContinueNavigation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation> serializer() {
                return com.paypal.oslo.feature.identity.api.model.PostLoginIntent$ContinueNavigation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ContinueNavigation(int i, androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.model.PostLoginIntent$ContinueNavigation$$serializer.INSTANCE.getDescriptor());
            }
            this.postLoginDestination = navKey;
            if ((i & 2) == 0) {
                this.postSignUpFlowDestination = navKey;
            } else {
                this.postSignUpFlowDestination = navKey2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContinueNavigation(androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey2, "");
            this.postLoginDestination = navKey;
            this.postSignUpFlowDestination = navKey2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.api.model.PostLoginIntent.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.postLoginDestination);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.postSignUpFlowDestination, self.postLoginDestination)) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.postSignUpFlowDestination);
            }
        }

        public /* synthetic */ ContinueNavigation(androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(navKey, (i & 2) != 0 ? navKey : navKey2);
        }

        public final androidx.navigation3.runtime.NavKey getPostLoginDestination() {
            return this.postLoginDestination;
        }

        public final androidx.navigation3.runtime.NavKey getPostSignUpFlowDestination() {
            return this.postSignUpFlowDestination;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$hJVLZSq9zK3nc5weCJezieUjaMQ() {
            return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.navigation3.runtime.NavKey.class), new java.lang.annotation.Annotation[0]);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$kSW_fx6Z4sxnEPmt3m3wZZihRVg() {
            return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.navigation3.runtime.NavKey.class), new java.lang.annotation.Annotation[0]);
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.postLoginDestination;
            androidx.navigation3.runtime.NavKey navKey2 = this.postSignUpFlowDestination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContinueNavigation(postLoginDestination=");
            sb.append(navKey);
            sb.append(", postSignUpFlowDestination=");
            sb.append(navKey2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.postLoginDestination.hashCode() * 31) + this.postSignUpFlowDestination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation)) {
                return false;
            }
            com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation continueNavigation = (com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.postLoginDestination, continueNavigation.postLoginDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.postSignUpFlowDestination, continueNavigation.postSignUpFlowDestination);
        }

        public final com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation copy(androidx.navigation3.runtime.NavKey postLoginDestination, androidx.navigation3.runtime.NavKey postSignUpFlowDestination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoginDestination, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postSignUpFlowDestination, "");
            return new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation(postLoginDestination, postSignUpFlowDestination);
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getPostSignUpFlowDestination() {
            return this.postSignUpFlowDestination;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getPostLoginDestination() {
            return this.postLoginDestination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation copy$default(com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation continueNavigation, androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = continueNavigation.postLoginDestination;
            }
            if ((i & 2) != 0) {
                navKey2 = continueNavigation.postSignUpFlowDestination;
            }
            return continueNavigation.copy(navKey, navKey2);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$t1LFk4BLiz0pnTe9aXdkGiJRS_o() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.api.model.PostLoginIntent", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.PostLoginIntent.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.identity.api.model.PostLoginIntent$ContinueNavigation$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult", com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ PostLoginIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
