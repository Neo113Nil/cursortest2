package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/plaid/link/result/LinkSuccess;", "Lcom/plaid/link/result/LinkResult;", "", "publicToken", "Lcom/plaid/link/result/LinkSuccessMetadata;", "metadata", "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkSuccessMetadata;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/plaid/link/result/LinkSuccessMetadata;", "copy", "(Ljava/lang/String;Lcom/plaid/link/result/LinkSuccessMetadata;)Lcom/plaid/link/result/LinkSuccess;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/result/LinkSuccessMetadata;", "getMetadata", "Ljava/lang/String;", "getPublicToken", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LinkSuccess implements com.plaid.link.result.LinkResult {
    private final com.plaid.link.result.LinkSuccessMetadata metadata;
    private final java.lang.String publicToken;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkSuccess.Companion INSTANCE = new com.plaid.link.result.LinkSuccess.Companion(null);
    public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkSuccess> CREATOR = new com.plaid.link.result.LinkSuccess.Creator();

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkSuccess$Companion;", "", "<init>", "()V", "", "", "linkData", "", "Lcom/plaid/link/result/LinkAccount;", "accounts", "Lcom/plaid/link/result/LinkSuccess;", "fromMap$link_sdk_release", "(Ljava/util/Map;Ljava/util/List;)Lcom/plaid/link/result/LinkSuccess;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.plaid.link.result.LinkSuccess fromMap$link_sdk_release(java.util.Map<java.lang.String, java.lang.String> linkData, java.util.List<com.plaid.link.result.LinkAccount> accounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accounts, "");
            java.lang.String a2 = com.plaid.internal.C0460b4.a("public_token", "", linkData);
            java.lang.String a3 = com.plaid.internal.C0460b4.a("institution_id", "", linkData);
            java.lang.String a4 = com.plaid.internal.C0460b4.a("institution_name", "", linkData);
            java.lang.String a5 = com.plaid.internal.C0460b4.a("link_session_id", "", linkData);
            java.lang.String a6 = com.plaid.internal.C0460b4.a("metadata_json", "", linkData);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a6, "");
            return new com.plaid.link.result.LinkSuccess(a2, new com.plaid.link.result.LinkSuccessMetadata((a3 == null || a3.length() == 0 || a4 == null || a4.length() == 0) ? null : new com.plaid.link.result.LinkInstitution(a3, a4), accounts, a5, a6));
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkSuccess> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkSuccess createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.link.result.LinkSuccess(parcel.readString(), com.plaid.link.result.LinkSuccessMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkSuccess[] newArray(int i) {
            return new com.plaid.link.result.LinkSuccess[i];
        }
    }

    public LinkSuccess(java.lang.String str, com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSuccessMetadata, "");
        this.publicToken = str;
        this.metadata = linkSuccessMetadata;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.plaid.link.result.LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    public final java.lang.String getPublicToken() {
        return this.publicToken;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.publicToken);
        this.metadata.writeToParcel(parcel, flags);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.publicToken;
        com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkSuccess(publicToken=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(linkSuccessMetadata);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.metadata.hashCode() + (this.publicToken.hashCode() * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.link.result.LinkSuccess)) {
            return false;
        }
        com.plaid.link.result.LinkSuccess linkSuccess = (com.plaid.link.result.LinkSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.publicToken, linkSuccess.publicToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, linkSuccess.metadata);
    }

    public final com.plaid.link.result.LinkSuccess copy(java.lang.String publicToken, com.plaid.link.result.LinkSuccessMetadata metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.plaid.link.result.LinkSuccess(publicToken, metadata);
    }

    /* renamed from: component2, reason: from getter */
    public final com.plaid.link.result.LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPublicToken() {
        return this.publicToken;
    }

    public static /* synthetic */ com.plaid.link.result.LinkSuccess copy$default(com.plaid.link.result.LinkSuccess linkSuccess, java.lang.String str, com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkSuccess.publicToken;
        }
        if ((i & 2) != 0) {
            linkSuccessMetadata = linkSuccess.metadata;
        }
        return linkSuccess.copy(str, linkSuccessMetadata);
    }
}
