package com.paypal.oslo.feature.searchandintelligence.domain.model.sse;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \n2\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;", "", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "getSource", "source", "Companion", "Started", "Component", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Processing", "Error", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Completed;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Component;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Error;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Processing;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Started;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CloudSseEvent {
    public static final int $stable = 0;
    public static final java.lang.String TYPE_COMPLETED = "com.paypal.agentic-sessions.messagestream.completed";
    public static final java.lang.String TYPE_COMPONENT = "com.paypal.agentic-sessions.messagestream.component";
    public static final java.lang.String TYPE_ERROR = "com.paypal.agentic-sessions.messagestream.error";
    public static final java.lang.String TYPE_PROCESSING = "com.paypal.agentic-sessions.messagestream.processing";
    public static final java.lang.String TYPE_STARTED = "com.paypal.agentic-sessions.messagestream.started";

    public abstract java.lang.String getId();

    public abstract java.lang.String getSource();

    private CloudSseEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Started;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;", "", "id", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Started;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Started extends com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Started(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.source = str2;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Started(id=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started started = (com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, started.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, started.source);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started copy(java.lang.String id, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started(id, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started started, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = started.id;
            }
            if ((i & 2) != 0) {
                str2 = started.source;
            }
            return started.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8G¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Component;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;", "", "id", "source", "", "sequence", "", "isFinalEvent", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Z", "component5", "()Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;", "copy", "(Ljava/lang/String;Ljava/lang/String;IZLcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Component;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", "getSource", com.visa.cbp.getEncExpo.warmup, "getSequence", "Z", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;", "getData", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "getComponents", "()Ljava/util/List;", "components"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Component extends com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData data;
        private final java.lang.String id;
        private final boolean isFinalEvent;
        private final int sequence;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Component(java.lang.String str, java.lang.String str2, int i, boolean z, com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData cloudSseEventData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSseEventData, "");
            this.id = str;
            this.source = str2;
            this.sequence = i;
            this.isFinalEvent = z;
            this.data = cloudSseEventData;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getSource() {
            return this.source;
        }

        public final int getSequence() {
            return this.sequence;
        }

        public final boolean isFinalEvent() {
            return this.isFinalEvent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData getData() {
            return this.data;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> getComponents() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> components = this.data.getComponents();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(components, 10));
            java.util.Iterator<T> it = components.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent) it.next()).getComponent());
            }
            return arrayList;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.source;
            int i = this.sequence;
            boolean z = this.isFinalEvent;
            com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData cloudSseEventData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Component(id=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(", sequence=");
            sb.append(i);
            sb.append(", isFinalEvent=");
            sb.append(z);
            sb.append(", data=");
            sb.append(cloudSseEventData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.source.hashCode()) * 31) + java.lang.Integer.hashCode(this.sequence)) * 31) + java.lang.Boolean.hashCode(this.isFinalEvent)) * 31) + this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component component = (com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, component.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, component.source) && this.sequence == component.sequence && this.isFinalEvent == component.isFinalEvent && kotlin.jvm.internal.Intrinsics.areEqual(this.data, component.data);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component copy(java.lang.String id, java.lang.String source, int sequence, boolean isFinalEvent, com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component(id, source, sequence, isFinalEvent, data);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData getData() {
            return this.data;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFinalEvent() {
            return this.isFinalEvent;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSequence() {
            return this.sequence;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component component, java.lang.String str, java.lang.String str2, int i, boolean z, com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData cloudSseEventData, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = component.id;
            }
            if ((i2 & 2) != 0) {
                str2 = component.source;
            }
            java.lang.String str3 = str2;
            if ((i2 & 4) != 0) {
                i = component.sequence;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = component.isFinalEvent;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                cloudSseEventData = component.data;
            }
            return component.copy(str, str3, i3, z2, cloudSseEventData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Completed;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;", "", "id", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Completed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed extends com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.source = str2;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(id=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed completed = (com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, completed.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, completed.source);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed copy(java.lang.String id, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed(id, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed completed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = completed.id;
            }
            if ((i & 2) != 0) {
                str2 = completed.source;
            }
            return completed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Processing;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;", "", "id", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Processing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing extends com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.source = str2;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(id=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing processing = (com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, processing.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, processing.source);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing copy(java.lang.String id, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing(id, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing processing, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = processing.id;
            }
            if ((i & 2) != 0) {
                str2 = processing.source;
            }
            return processing.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Error;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;", "", "id", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.source = str2;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent
        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(id=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error error = (com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, error.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, error.source);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error copy(java.lang.String id, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error(id, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.id;
            }
            if ((i & 2) != 0) {
                str2 = error.source;
            }
            return error.copy(str, str2);
        }
    }

    public /* synthetic */ CloudSseEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
