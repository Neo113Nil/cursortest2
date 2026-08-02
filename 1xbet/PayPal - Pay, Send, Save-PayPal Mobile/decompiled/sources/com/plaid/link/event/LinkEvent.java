package com.plaid.link.event;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "Landroid/os/Parcelable;", "Lcom/plaid/link/event/LinkEventName;", "eventName", "Lcom/plaid/link/event/LinkEventMetadata;", "metadata", "<init>", "(Lcom/plaid/link/event/LinkEventName;Lcom/plaid/link/event/LinkEventMetadata;)V", "component1", "()Lcom/plaid/link/event/LinkEventName;", "component2", "()Lcom/plaid/link/event/LinkEventMetadata;", "copy", "(Lcom/plaid/link/event/LinkEventName;Lcom/plaid/link/event/LinkEventMetadata;)Lcom/plaid/link/event/LinkEvent;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/event/LinkEventName;", "getEventName", "Lcom/plaid/link/event/LinkEventMetadata;", "getMetadata", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LinkEvent implements android.os.Parcelable {
    private final com.plaid.link.event.LinkEventName eventName;
    private final com.plaid.link.event.LinkEventMetadata metadata;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.event.LinkEvent.Companion INSTANCE = new com.plaid.link.event.LinkEvent.Companion(null);
    public static final android.os.Parcelable.Creator<com.plaid.link.event.LinkEvent> CREATOR = new com.plaid.link.event.LinkEvent.Creator();

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/plaid/link/event/LinkEvent$Companion;", "", "<init>", "()V", "", "", "linkData", "Lcom/plaid/link/event/LinkEvent;", "fromMap$link_sdk_release", "(Ljava/util/Map;)Lcom/plaid/link/event/LinkEvent;", "getTimestamp", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final java.lang.String getTimestamp() {
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", java.util.Locale.ENGLISH).format(new java.util.Date());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }

        public final com.plaid.link.event.LinkEvent fromMap$link_sdk_release(java.util.Map<java.lang.String, java.lang.String> linkData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkData, "");
            return new com.plaid.link.event.LinkEvent(com.plaid.link.event.LinkEventName.INSTANCE.fromString$link_sdk_release(com.plaid.internal.C0460b4.a(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME, "", linkData)), new com.plaid.link.event.LinkEventMetadata(null, com.plaid.internal.C0460b4.a(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, "", linkData), com.plaid.internal.C0460b4.a("error_message", "", linkData), com.plaid.internal.C0460b4.a(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "", linkData), com.plaid.internal.C0460b4.a("exit_status", "", linkData), com.plaid.internal.C0460b4.a("institution_id", "", linkData), com.plaid.internal.C0460b4.a("institution_name", "", linkData), com.plaid.internal.C0460b4.a("institution_search_query", "", linkData), com.plaid.internal.C0460b4.a("issue_description", "", linkData), com.plaid.internal.C0460b4.a("issue_detected_at", "", linkData), com.plaid.internal.C0460b4.a("issue_id", "", linkData), com.plaid.internal.C0460b4.a("link_session_id", "", linkData), com.plaid.internal.C0460b4.a("mfa_type", "", linkData), com.plaid.internal.C0460b4.a("request_id", "", linkData), com.plaid.internal.C0460b4.a("selection", "", linkData), com.plaid.internal.C0460b4.a("timestamp", getTimestamp(), linkData), com.plaid.link.event.LinkEventViewName.INSTANCE.fromString$link_sdk_release(com.plaid.internal.C0460b4.a(com.datadog.android.rum.internal.domain.RumContext.VIEW_NAME, "", linkData)), com.plaid.internal.C0460b4.a("metadata_json", "", linkData), null, linkData.containsKey("is_update_mode") ? linkData.get("is_update_mode") : null, linkData.containsKey("match_reason") ? linkData.get("match_reason") : null, linkData.containsKey("account_number_mask") ? linkData.get("account_number_mask") : null, 262145, null));
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.event.LinkEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.event.LinkEvent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.link.event.LinkEvent((com.plaid.link.event.LinkEventName) parcel.readParcelable(com.plaid.link.event.LinkEvent.class.getClassLoader()), com.plaid.link.event.LinkEventMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.event.LinkEvent[] newArray(int i) {
            return new com.plaid.link.event.LinkEvent[i];
        }
    }

    public LinkEvent(com.plaid.link.event.LinkEventName linkEventName, com.plaid.link.event.LinkEventMetadata linkEventMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEventMetadata, "");
        this.eventName = linkEventName;
        this.metadata = linkEventMetadata;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.plaid.link.event.LinkEventName getEventName() {
        return this.eventName;
    }

    public final com.plaid.link.event.LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.eventName, flags);
        this.metadata.writeToParcel(parcel, flags);
    }

    public final java.lang.String toString() {
        com.plaid.link.event.LinkEventName linkEventName = this.eventName;
        com.plaid.link.event.LinkEventMetadata linkEventMetadata = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkEvent(eventName=");
        sb.append(linkEventName);
        sb.append(", metadata=");
        sb.append(linkEventMetadata);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.metadata.hashCode() + (this.eventName.hashCode() * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.link.event.LinkEvent)) {
            return false;
        }
        com.plaid.link.event.LinkEvent linkEvent = (com.plaid.link.event.LinkEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.eventName, linkEvent.eventName) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, linkEvent.metadata);
    }

    public final com.plaid.link.event.LinkEvent copy(com.plaid.link.event.LinkEventName eventName, com.plaid.link.event.LinkEventMetadata metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.plaid.link.event.LinkEvent(eventName, metadata);
    }

    /* renamed from: component2, reason: from getter */
    public final com.plaid.link.event.LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    /* renamed from: component1, reason: from getter */
    public final com.plaid.link.event.LinkEventName getEventName() {
        return this.eventName;
    }

    public static /* synthetic */ com.plaid.link.event.LinkEvent copy$default(com.plaid.link.event.LinkEvent linkEvent, com.plaid.link.event.LinkEventName linkEventName, com.plaid.link.event.LinkEventMetadata linkEventMetadata, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            linkEventName = linkEvent.eventName;
        }
        if ((i & 2) != 0) {
            linkEventMetadata = linkEvent.metadata;
        }
        return linkEvent.copy(linkEventName, linkEventMetadata);
    }
}
