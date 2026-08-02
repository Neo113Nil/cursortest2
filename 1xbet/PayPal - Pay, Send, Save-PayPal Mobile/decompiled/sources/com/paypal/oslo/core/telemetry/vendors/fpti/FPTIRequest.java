package com.paypal.oslo.core.telemetry.vendors.fpti;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0006+,-./*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest;", "", "", "requestUuid", "", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;", "userEvents", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getRequestUuid", "getRequestUuid$annotations", "()V", "Ljava/util/List;", "getUserEvents", "getUserEvents$annotations", "Companion", "UserEvent", "CommonEventParams", "EventParams", "User", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FPTIRequest {
    private final java.lang.String requestUuid;
    private final java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> userEvents;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.Companion INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.$r8$lambda$aAmopTV7hITOpIDftRmkPfxoOgc();
        }
    })};

    @kotlinx.serialization.SerialName("request_uuid")
    public static /* synthetic */ void getRequestUuid$annotations() {
    }

    @kotlinx.serialization.SerialName("user_events")
    public static /* synthetic */ void getUserEvents$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest> serializer() {
            return com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FPTIRequest(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.requestUuid = str;
        this.userEvents = list;
    }

    public FPTIRequest(java.lang.String str, java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.requestUuid = str;
        this.userEvents = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$telemetry_release(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.requestUuid);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.userEvents);
    }

    public final java.lang.String getRequestUuid() {
        return this.requestUuid;
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> getUserEvents() {
        return this.userEvents;
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0011R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u0013R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;", "", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;", "commonEventParams", "", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;", "eventParams", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;", "user", "<init>", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;Ljava/util/List;Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;Ljava/util/List;Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;", "copy", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;Ljava/util/List;Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;", "getCommonEventParams", "getCommonEventParams$annotations", "()V", "Ljava/util/List;", "getEventParams", "getEventParams$annotations", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;", "getUser", "getUser$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class UserEvent {
        private final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams;
        private final java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> eventParams;
        private final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent.Companion INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$UserEvent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent.$r8$lambda$K5Yi5LZwNY_pioyq9UtnQyN37Xs();
            }
        }), null};

        @kotlinx.serialization.SerialName("common_event_params")
        public static /* synthetic */ void getCommonEventParams$annotations() {
        }

        @kotlinx.serialization.SerialName("event_params")
        public static /* synthetic */ void getEventParams$annotations() {
        }

        @kotlinx.serialization.SerialName("user")
        public static /* synthetic */ void getUser$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$UserEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> serializer() {
                return com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$UserEvent$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ UserEvent(int i, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams, java.util.List list, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$UserEvent$$serializer.INSTANCE.getDescriptor());
            }
            this.commonEventParams = commonEventParams;
            this.eventParams = list;
            if ((i & 4) == 0) {
                this.user = null;
            } else {
                this.user = user;
            }
        }

        public UserEvent(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams, java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> list, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonEventParams, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.commonEventParams = commonEventParams;
            this.eventParams = list;
            this.user = user;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$telemetry_release(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$CommonEventParams$$serializer.INSTANCE, self.commonEventParams);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.eventParams);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.user != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$User$$serializer.INSTANCE, self.user);
            }
        }

        public /* synthetic */ UserEvent(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams, java.util.List list, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(commonEventParams, list, (i & 4) != 0 ? null : user);
        }

        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams getCommonEventParams() {
            return this.commonEventParams;
        }

        public final java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> getEventParams() {
            return this.eventParams;
        }

        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User getUser() {
            return this.user;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$K5Yi5LZwNY_pioyq9UtnQyN37Xs() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$EventParams$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams = this.commonEventParams;
            java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> list = this.eventParams;
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user = this.user;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserEvent(commonEventParams=");
            sb.append(commonEventParams);
            sb.append(", eventParams=");
            sb.append(list);
            sb.append(", user=");
            sb.append(user);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.commonEventParams.hashCode();
            int hashCode2 = this.eventParams.hashCode();
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user = this.user;
            return (((hashCode * 31) + hashCode2) * 31) + (user == null ? 0 : user.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent userEvent = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.commonEventParams, userEvent.commonEventParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventParams, userEvent.eventParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.user, userEvent.user);
        }

        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent copy(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams, java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> eventParams, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonEventParams, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventParams, "");
            return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent(commonEventParams, eventParams, user);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User getUser() {
            return this.user;
        }

        public final java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> component2() {
            return this.eventParams;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams getCommonEventParams() {
            return this.commonEventParams;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent copy$default(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent userEvent, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams, java.util.List list, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                commonEventParams = userEvent.commonEventParams;
            }
            if ((i & 2) != 0) {
                list = userEvent.eventParams;
            }
            if ((i & 4) != 0) {
                user = userEvent.user;
            }
            return userEvent.copy(commonEventParams, list, user);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u000fR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0011R \u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;", "", "", "eventSource", "Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "params", "tenantName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/util/AnyMap;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/core/telemetry/util/AnyMap;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/util/AnyMap;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEventSource", "getEventSource$annotations", "()V", "Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "getParams", "getParams$annotations", "getTenantName", "getTenantName$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class CommonEventParams {
        private final java.lang.String eventSource;
        private final com.paypal.oslo.core.telemetry.util.AnyMap params;
        private final java.lang.String tenantName;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams.Companion INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams.Companion(null);
        public static final int $stable = 8;

        @kotlinx.serialization.SerialName("event_source")
        public static /* synthetic */ void getEventSource$annotations() {
        }

        @kotlinx.serialization.SerialName("params")
        public static /* synthetic */ void getParams$annotations() {
        }

        @kotlinx.serialization.SerialName("tenant_name")
        public static /* synthetic */ void getTenantName$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$CommonEventParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams> serializer() {
                return com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$CommonEventParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CommonEventParams(int i, java.lang.String str, com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$CommonEventParams$$serializer.INSTANCE.getDescriptor());
            }
            this.eventSource = str;
            this.params = anyMap;
            this.tenantName = str2;
        }

        public CommonEventParams(java.lang.String str, com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anyMap, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.eventSource = str;
            this.params = anyMap;
            this.tenantName = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$telemetry_release(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.eventSource);
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.core.telemetry.util.AnyMapSerializer.INSTANCE, self.params);
            output.encodeStringElement(serialDesc, 2, self.tenantName);
        }

        public final java.lang.String getEventSource() {
            return this.eventSource;
        }

        public final com.paypal.oslo.core.telemetry.util.AnyMap getParams() {
            return this.params;
        }

        public final java.lang.String getTenantName() {
            return this.tenantName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.eventSource;
            com.paypal.oslo.core.telemetry.util.AnyMap anyMap = this.params;
            java.lang.String str2 = this.tenantName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CommonEventParams(eventSource=");
            sb.append(str);
            sb.append(", params=");
            sb.append(anyMap);
            sb.append(", tenantName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.eventSource.hashCode() * 31) + this.params.hashCode()) * 31) + this.tenantName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.eventSource, commonEventParams.eventSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, commonEventParams.params) && kotlin.jvm.internal.Intrinsics.areEqual(this.tenantName, commonEventParams.tenantName);
        }

        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams copy(java.lang.String eventSource, com.paypal.oslo.core.telemetry.util.AnyMap params, java.lang.String tenantName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenantName, "");
            return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams(eventSource, params, tenantName);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTenantName() {
            return this.tenantName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.telemetry.util.AnyMap getParams() {
            return this.params;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEventSource() {
            return this.eventSource;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams copy$default(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams, java.lang.String str, com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = commonEventParams.eventSource;
            }
            if ((i & 2) != 0) {
                anyMap = commonEventParams.params;
            }
            if ((i & 4) != 0) {
                str2 = commonEventParams.tenantName;
            }
            return commonEventParams.copy(str, anyMap, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JX\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u0015R \u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b6\u0010/\u001a\u0004\b5\u0010\u0015R \u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\u0015R \u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b:\u0010/\u001a\u0004\b9\u0010\u0015R \u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b<\u0010/\u001a\u0004\b;\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;", "", "Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "params", "", "eventName", "product", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "clientEventKey", "eventTime", "spaceKey", "<init>", "(Lcom/paypal/oslo/core/telemetry/util/AnyMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/telemetry/util/AnyMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/paypal/oslo/core/telemetry/util/AnyMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "getParams", "getParams$annotations", "()V", "Ljava/lang/String;", "getEventName", "getEventName$annotations", "getProduct", "getProduct$annotations", "getComponent", "getComponent$annotations", "getClientEventKey", "getClientEventKey$annotations", "getEventTime", "getEventTime$annotations", "getSpaceKey", "getSpaceKey$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class EventParams {
        private final java.lang.String clientEventKey;
        private final java.lang.String component;
        private final java.lang.String eventName;
        private final java.lang.String eventTime;
        private final com.paypal.oslo.core.telemetry.util.AnyMap params;
        private final java.lang.String product;
        private final java.lang.String spaceKey;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams.Companion INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams.Companion(null);
        public static final int $stable = 8;

        @kotlinx.serialization.SerialName("client_event_key")
        public static /* synthetic */ void getClientEventKey$annotations() {
        }

        @kotlinx.serialization.SerialName(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT)
        public static /* synthetic */ void getComponent$annotations() {
        }

        @kotlinx.serialization.SerialName(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME)
        public static /* synthetic */ void getEventName$annotations() {
        }

        @kotlinx.serialization.SerialName("event_time")
        public static /* synthetic */ void getEventTime$annotations() {
        }

        @kotlinx.serialization.SerialName("params")
        public static /* synthetic */ void getParams$annotations() {
        }

        @kotlinx.serialization.SerialName("product")
        public static /* synthetic */ void getProduct$annotations() {
        }

        @kotlinx.serialization.SerialName("space_key")
        public static /* synthetic */ void getSpaceKey$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$EventParams;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams> serializer() {
                return com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$EventParams$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ EventParams(int i, com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (123 != (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$EventParams$$serializer.INSTANCE.getDescriptor());
            }
            this.params = anyMap;
            this.eventName = str;
            if ((i & 4) == 0) {
                this.product = null;
            } else {
                this.product = str2;
            }
            this.component = str3;
            this.clientEventKey = str4;
            this.eventTime = str5;
            this.spaceKey = str6;
        }

        public EventParams(com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anyMap, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.params = anyMap;
            this.eventName = str;
            this.product = str2;
            this.component = str3;
            this.clientEventKey = str4;
            this.eventTime = str5;
            this.spaceKey = str6;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$telemetry_release(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.telemetry.util.AnyMapSerializer.INSTANCE, self.params);
            output.encodeStringElement(serialDesc, 1, self.eventName);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.product != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.product);
            }
            output.encodeStringElement(serialDesc, 3, self.component);
            output.encodeStringElement(serialDesc, 4, self.clientEventKey);
            output.encodeStringElement(serialDesc, 5, self.eventTime);
            output.encodeStringElement(serialDesc, 6, self.spaceKey);
        }

        public /* synthetic */ EventParams(com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(anyMap, str, (i & 4) != 0 ? null : str2, str3, str4, str5, str6);
        }

        public final com.paypal.oslo.core.telemetry.util.AnyMap getParams() {
            return this.params;
        }

        public final java.lang.String getEventName() {
            return this.eventName;
        }

        public final java.lang.String getProduct() {
            return this.product;
        }

        public final java.lang.String getComponent() {
            return this.component;
        }

        public final java.lang.String getClientEventKey() {
            return this.clientEventKey;
        }

        public final java.lang.String getEventTime() {
            return this.eventTime;
        }

        public final java.lang.String getSpaceKey() {
            return this.spaceKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.util.AnyMap anyMap = this.params;
            java.lang.String str = this.eventName;
            java.lang.String str2 = this.product;
            java.lang.String str3 = this.component;
            java.lang.String str4 = this.clientEventKey;
            java.lang.String str5 = this.eventTime;
            java.lang.String str6 = this.spaceKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EventParams(params=");
            sb.append(anyMap);
            sb.append(", eventName=");
            sb.append(str);
            sb.append(", product=");
            sb.append(str2);
            sb.append(", component=");
            sb.append(str3);
            sb.append(", clientEventKey=");
            sb.append(str4);
            sb.append(", eventTime=");
            sb.append(str5);
            sb.append(", spaceKey=");
            sb.append(str6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.params.hashCode();
            int hashCode2 = this.eventName.hashCode();
            java.lang.String str = this.product;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.component.hashCode()) * 31) + this.clientEventKey.hashCode()) * 31) + this.eventTime.hashCode()) * 31) + this.spaceKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams eventParams = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.params, eventParams.params) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventName, eventParams.eventName) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, eventParams.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.component, eventParams.component) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientEventKey, eventParams.clientEventKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, eventParams.eventTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.spaceKey, eventParams.spaceKey);
        }

        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams copy(com.paypal.oslo.core.telemetry.util.AnyMap params, java.lang.String eventName, java.lang.String product, java.lang.String component, java.lang.String clientEventKey, java.lang.String eventTime, java.lang.String spaceKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientEventKey, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spaceKey, "");
            return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams(params, eventName, product, component, clientEventKey, eventTime, spaceKey);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getSpaceKey() {
            return this.spaceKey;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getEventTime() {
            return this.eventTime;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getClientEventKey() {
            return this.clientEventKey;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getComponent() {
            return this.component;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEventName() {
            return this.eventName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.util.AnyMap getParams() {
            return this.params;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams copy$default(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams eventParams, com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                anyMap = eventParams.params;
            }
            if ((i & 2) != 0) {
                str = eventParams.eventName;
            }
            java.lang.String str7 = str;
            if ((i & 4) != 0) {
                str2 = eventParams.product;
            }
            java.lang.String str8 = str2;
            if ((i & 8) != 0) {
                str3 = eventParams.component;
            }
            java.lang.String str9 = str3;
            if ((i & 16) != 0) {
                str4 = eventParams.clientEventKey;
            }
            java.lang.String str10 = str4;
            if ((i & 32) != 0) {
                str5 = eventParams.eventTime;
            }
            java.lang.String str11 = str5;
            if ((i & 64) != 0) {
                str6 = eventParams.spaceKey;
            }
            return eventParams.copy(anyMap, str7, str8, str9, str10, str11, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;", "", "", "encryptedCustomerId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEncryptedCustomerId", "getEncryptedCustomerId$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class User {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User.Companion INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User.Companion(null);
        private final java.lang.String encryptedCustomerId;

        @kotlinx.serialization.SerialName("encrypted_customer_id")
        public static /* synthetic */ void getEncryptedCustomerId$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIRequest$User;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User> serializer() {
                return com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$User$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ User(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$User$$serializer.INSTANCE.getDescriptor());
            }
            this.encryptedCustomerId = str;
        }

        public User(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.encryptedCustomerId = str;
        }

        public final java.lang.String getEncryptedCustomerId() {
            return this.encryptedCustomerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.encryptedCustomerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("User(encryptedCustomerId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.encryptedCustomerId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedCustomerId, ((com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User) other).encryptedCustomerId);
        }

        public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User copy(java.lang.String encryptedCustomerId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCustomerId, "");
            return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User(encryptedCustomerId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEncryptedCustomerId() {
            return this.encryptedCustomerId;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User copy$default(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User user, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = user.encryptedCustomerId;
            }
            return user.copy(str);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$aAmopTV7hITOpIDftRmkPfxoOgc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest$UserEvent$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.requestUuid;
        java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> list = this.userEvents;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FPTIRequest(requestUuid=");
        sb.append(str);
        sb.append(", userEvents=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.requestUuid.hashCode() * 31) + this.userEvents.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest fPTIRequest = (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.requestUuid, fPTIRequest.requestUuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEvents, fPTIRequest.userEvents);
    }

    public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest copy(java.lang.String requestUuid, java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> userEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestUuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEvents, "");
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest(requestUuid, userEvents);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent> component2() {
        return this.userEvents;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRequestUuid() {
        return this.requestUuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest copy$default(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest fPTIRequest, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fPTIRequest.requestUuid;
        }
        if ((i & 2) != 0) {
            list = fPTIRequest.userEvents;
        }
        return fPTIRequest.copy(str, list);
    }
}
