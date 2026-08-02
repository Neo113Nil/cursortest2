package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/plaid/link/result/LinkExit;", "Lcom/plaid/link/result/LinkResult;", "Lcom/plaid/link/result/LinkError;", "error", "Lcom/plaid/link/result/LinkExitMetadata;", "metadata", "<init>", "(Lcom/plaid/link/result/LinkError;Lcom/plaid/link/result/LinkExitMetadata;)V", "component1", "()Lcom/plaid/link/result/LinkError;", "component2", "()Lcom/plaid/link/result/LinkExitMetadata;", "copy", "(Lcom/plaid/link/result/LinkError;Lcom/plaid/link/result/LinkExitMetadata;)Lcom/plaid/link/result/LinkExit;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/result/LinkError;", "getError", "Lcom/plaid/link/result/LinkExitMetadata;", "getMetadata", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LinkExit implements com.plaid.link.result.LinkResult {
    private final com.plaid.link.result.LinkError error;
    private final com.plaid.link.result.LinkExitMetadata metadata;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkExit.Companion INSTANCE = new com.plaid.link.result.LinkExit.Companion(null);
    public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkExit> CREATOR = new com.plaid.link.result.LinkExit.Creator();

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/plaid/link/result/LinkExit$Companion;", "", "<init>", "()V", "", "", "linkData", "Lcom/plaid/link/result/LinkExit;", "fromMap$link_sdk_release", "(Ljava/util/Map;)Lcom/plaid/link/result/LinkExit;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.plaid.link.result.LinkExit fromMap$link_sdk_release(java.util.Map<java.lang.String, java.lang.String> linkData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkData, "");
            com.plaid.link.result.LinkInstitution linkInstitution = null;
            com.plaid.link.result.LinkError linkError = linkData.get(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE) != null ? new com.plaid.link.result.LinkError(com.plaid.link.result.LinkErrorCode.INSTANCE.convert(com.plaid.internal.C0460b4.a(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, "", linkData)), com.plaid.internal.C0460b4.a("error_message", "", linkData), com.plaid.internal.C0460b4.a("error_display_message", "", linkData), com.plaid.internal.C0460b4.a("error_json", "", linkData)) : null;
            com.plaid.link.result.LinkExitMetadataStatus fromString = com.plaid.link.result.LinkExitMetadataStatus.INSTANCE.fromString(com.plaid.internal.C0460b4.a("status", "", linkData));
            java.lang.String a2 = com.plaid.internal.C0460b4.a("institution_id", "", linkData);
            java.lang.String a3 = com.plaid.internal.C0460b4.a("institution_name", "", linkData);
            if (a2 != null && a2.length() != 0 && a3 != null && a3.length() != 0) {
                linkInstitution = new com.plaid.link.result.LinkInstitution(a2, a3);
            }
            return new com.plaid.link.result.LinkExit(linkError, new com.plaid.link.result.LinkExitMetadata(fromString, linkInstitution, com.plaid.internal.C0460b4.a("link_session_id", "", linkData), com.plaid.internal.C0460b4.a("request_id", "", linkData), com.plaid.internal.C0460b4.a("metadata_json", "", linkData)));
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkExit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkExit createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.link.result.LinkExit(parcel.readInt() == 0 ? null : com.plaid.link.result.LinkError.CREATOR.createFromParcel(parcel), com.plaid.link.result.LinkExitMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkExit[] newArray(int i) {
            return new com.plaid.link.result.LinkExit[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkExit() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.plaid.link.result.LinkError getError() {
        return this.error;
    }

    public final com.plaid.link.result.LinkExitMetadata getMetadata() {
        return this.metadata;
    }

    public LinkExit(com.plaid.link.result.LinkError linkError, com.plaid.link.result.LinkExitMetadata linkExitMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkExitMetadata, "");
        this.error = linkError;
        this.metadata = linkExitMetadata;
    }

    public /* synthetic */ LinkExit(com.plaid.link.result.LinkError linkError, com.plaid.link.result.LinkExitMetadata linkExitMetadata, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkError, (i & 2) != 0 ? new com.plaid.link.result.LinkExitMetadata(null, null, null, null, null, 15, null) : linkExitMetadata);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        com.plaid.link.result.LinkError linkError = this.error;
        if (linkError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkError.writeToParcel(parcel, flags);
        }
        this.metadata.writeToParcel(parcel, flags);
    }

    public final java.lang.String toString() {
        com.plaid.link.result.LinkError linkError = this.error;
        com.plaid.link.result.LinkExitMetadata linkExitMetadata = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkExit(error=");
        sb.append(linkError);
        sb.append(", metadata=");
        sb.append(linkExitMetadata);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.plaid.link.result.LinkError linkError = this.error;
        return this.metadata.hashCode() + ((linkError == null ? 0 : linkError.hashCode()) * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.link.result.LinkExit)) {
            return false;
        }
        com.plaid.link.result.LinkExit linkExit = (com.plaid.link.result.LinkExit) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.error, linkExit.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, linkExit.metadata);
    }

    public final com.plaid.link.result.LinkExit copy(com.plaid.link.result.LinkError error, com.plaid.link.result.LinkExitMetadata metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.plaid.link.result.LinkExit(error, metadata);
    }

    /* renamed from: component2, reason: from getter */
    public final com.plaid.link.result.LinkExitMetadata getMetadata() {
        return this.metadata;
    }

    /* renamed from: component1, reason: from getter */
    public final com.plaid.link.result.LinkError getError() {
        return this.error;
    }

    public static /* synthetic */ com.plaid.link.result.LinkExit copy$default(com.plaid.link.result.LinkExit linkExit, com.plaid.link.result.LinkError linkError, com.plaid.link.result.LinkExitMetadata linkExitMetadata, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            linkError = linkExit.error;
        }
        if ((i & 2) != 0) {
            linkExitMetadata = linkExit.metadata;
        }
        return linkExit.copy(linkError, linkExitMetadata);
    }
}
