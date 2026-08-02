package com.paypal.oslo.core.telemetry.vendors.pie;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0003()'B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest;", "", "", "timestamp", "", "Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest$Event;", "events", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTimestamp", "Ljava/util/List;", "getEvents", "Companion", "Event", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PieRequest {
    private final java.util.List<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event> events;
    private final java.lang.String timestamp;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Companion INSTANCE = new com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.vendors.pie.PieRequest$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.$r8$lambda$bCzGmyFQH_YGsWg65J5fb2ksHGQ();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest> serializer() {
            return com.paypal.oslo.core.telemetry.vendors.pie.PieRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PieRequest(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.telemetry.vendors.pie.PieRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = str;
        this.events = list;
    }

    public PieRequest(java.lang.String str, java.util.List<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.timestamp = str;
        this.events = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$telemetry_release(com.paypal.oslo.core.telemetry.vendors.pie.PieRequest self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.timestamp);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.events);
    }

    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest$Event;", "", "", "activityType", "trackingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest$Event;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest$Event;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getActivityType", "getActivityType$annotations", "()V", "getTrackingId", "getTrackingId$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Event {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event.Companion INSTANCE = new com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event.Companion(null);
        private final java.lang.String activityType;
        private final java.lang.String trackingId;

        @kotlinx.serialization.SerialName(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE)
        public static /* synthetic */ void getActivityType$annotations() {
        }

        @kotlinx.serialization.SerialName("tracking_id")
        public static /* synthetic */ void getTrackingId$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest$Event$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/vendors/pie/PieRequest$Event;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event> serializer() {
                return com.paypal.oslo.core.telemetry.vendors.pie.PieRequest$Event$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Event(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.telemetry.vendors.pie.PieRequest$Event$$serializer.INSTANCE.getDescriptor());
            }
            this.activityType = str;
            this.trackingId = str2;
        }

        public Event(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.activityType = str;
            this.trackingId = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$telemetry_release(com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.activityType);
            output.encodeStringElement(serialDesc, 1, self.trackingId);
        }

        public final java.lang.String getActivityType() {
            return this.activityType;
        }

        public final java.lang.String getTrackingId() {
            return this.trackingId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.activityType;
            java.lang.String str2 = this.trackingId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Event(activityType=");
            sb.append(str);
            sb.append(", trackingId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.activityType.hashCode() * 31) + this.trackingId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event event = (com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activityType, event.activityType) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingId, event.trackingId);
        }

        public final com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event copy(java.lang.String activityType, java.lang.String trackingId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingId, "");
            return new com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event(activityType, trackingId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTrackingId() {
            return this.trackingId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getActivityType() {
            return this.activityType;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event copy$default(com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event event, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = event.activityType;
            }
            if ((i & 2) != 0) {
                str2 = event.trackingId;
            }
            return event.copy(str, str2);
        }
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event> getEvents() {
        return this.events;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$bCzGmyFQH_YGsWg65J5fb2ksHGQ() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.telemetry.vendors.pie.PieRequest$Event$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.timestamp;
        java.util.List<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event> list = this.events;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PieRequest(timestamp=");
        sb.append(str);
        sb.append(", events=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.timestamp.hashCode() * 31) + this.events.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.vendors.pie.PieRequest)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.vendors.pie.PieRequest pieRequest = (com.paypal.oslo.core.telemetry.vendors.pie.PieRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.timestamp, pieRequest.timestamp) && kotlin.jvm.internal.Intrinsics.areEqual(this.events, pieRequest.events);
    }

    public final com.paypal.oslo.core.telemetry.vendors.pie.PieRequest copy(java.lang.String timestamp, java.util.List<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event> events) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamp, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "");
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieRequest(timestamp, events);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event> component2() {
        return this.events;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.vendors.pie.PieRequest copy$default(com.paypal.oslo.core.telemetry.vendors.pie.PieRequest pieRequest, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pieRequest.timestamp;
        }
        if ((i & 2) != 0) {
            list = pieRequest.events;
        }
        return pieRequest.copy(str, list);
    }
}
