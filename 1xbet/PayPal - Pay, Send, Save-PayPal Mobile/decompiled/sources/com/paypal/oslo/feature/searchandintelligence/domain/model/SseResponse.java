package com.paypal.oslo.feature.searchandintelligence.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "", "<init>", "()V", "StreamStarted", "Component", "StreamCompleted", "StreamProcessing", "ErrorReceived", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$Component;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$ErrorReceived;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamCompleted;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamProcessing;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamStarted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SseResponse {
    public static final int $stable = 0;

    private SseResponse() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamStarted;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StreamStarted extends com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse {
        public static final int $stable = 0;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreamStarted(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamStarted(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted) other).id);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted streamStarted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = streamStarted.id;
            }
            return streamStarted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\b\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$Component;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "", "id", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "components", "", "isFinalEvent", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$Component;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getComponents", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Component extends com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components;
        private final java.lang.String id;
        private final boolean isFinalEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Component(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.components = list;
            this.isFinalEvent = z;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public /* synthetic */ Component(java.lang.String str, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> getComponents() {
            return this.components;
        }

        public final boolean isFinalEvent() {
            return this.isFinalEvent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> list = this.components;
            boolean z = this.isFinalEvent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Component(id=");
            sb.append(str);
            sb.append(", components=");
            sb.append(list);
            sb.append(", isFinalEvent=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.components.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isFinalEvent);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component component = (com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, component.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.components, component.components) && this.isFinalEvent == component.isFinalEvent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component copy(java.lang.String id, java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> components, boolean isFinalEvent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component(id, components, isFinalEvent);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsFinalEvent() {
            return this.isFinalEvent;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> component2() {
            return this.components;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component component, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = component.id;
            }
            if ((i & 2) != 0) {
                list = component.components;
            }
            if ((i & 4) != 0) {
                z = component.isFinalEvent;
            }
            return component.copy(str, list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamCompleted;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StreamCompleted extends com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse {
        public static final int $stable = 0;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreamCompleted(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamCompleted(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted) other).id);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted streamCompleted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = streamCompleted.id;
            }
            return streamCompleted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamProcessing;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$StreamProcessing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StreamProcessing extends com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse {
        public static final int $stable = 0;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreamProcessing(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamProcessing(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing) other).id);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing streamProcessing, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = streamProcessing.id;
            }
            return streamProcessing.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$ErrorReceived;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse$ErrorReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorReceived extends com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse {
        public static final int $stable = 0;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorReceived(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorReceived(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived) other).id);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived errorReceived, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = errorReceived.id;
            }
            return errorReceived.copy(str);
        }
    }

    public /* synthetic */ SseResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
