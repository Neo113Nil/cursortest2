package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0011"}, d2 = {"Lcom/plaid/link/result/LinkSuccessMetadata;", "Landroid/os/Parcelable;", "Lcom/plaid/link/result/LinkInstitution;", "institution", "", "Lcom/plaid/link/result/LinkAccount;", "accounts", "", "linkSessionId", "metadataJson", "<init>", "(Lcom/plaid/link/result/LinkInstitution;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/plaid/link/result/LinkInstitution;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/plaid/link/result/LinkInstitution;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LinkSuccessMetadata;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getAccounts", "Lcom/plaid/link/result/LinkInstitution;", "getInstitution", "Ljava/lang/String;", "getLinkSessionId", "getMetadataJson"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LinkSuccessMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkSuccessMetadata> CREATOR = new com.plaid.link.result.LinkSuccessMetadata.Creator();
    private final java.util.List<com.plaid.link.result.LinkAccount> accounts;
    private final com.plaid.link.result.LinkInstitution institution;
    private final java.lang.String linkSessionId;
    private final java.lang.String metadataJson;

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkSuccessMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkSuccessMetadata createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            com.plaid.link.result.LinkInstitution createFromParcel = parcel.readInt() == 0 ? null : com.plaid.link.result.LinkInstitution.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(com.plaid.link.result.LinkAccount.CREATOR.createFromParcel(parcel));
            }
            return new com.plaid.link.result.LinkSuccessMetadata(createFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkSuccessMetadata[] newArray(int i) {
            return new com.plaid.link.result.LinkSuccessMetadata[i];
        }
    }

    public LinkSuccessMetadata(com.plaid.link.result.LinkInstitution linkInstitution, java.util.List<com.plaid.link.result.LinkAccount> list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.institution = linkInstitution;
        this.accounts = list;
        this.linkSessionId = str;
        this.metadataJson = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.util.List<com.plaid.link.result.LinkAccount> getAccounts() {
        return this.accounts;
    }

    public final com.plaid.link.result.LinkInstitution getInstitution() {
        return this.institution;
    }

    public final java.lang.String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final java.lang.String getMetadataJson() {
        return this.metadataJson;
    }

    public final int hashCode() {
        com.plaid.link.result.LinkInstitution linkInstitution = this.institution;
        return this.metadataJson.hashCode() + com.plaid.internal.C0679x.a(this.linkSessionId, (this.accounts.hashCode() + ((linkInstitution == null ? 0 : linkInstitution.hashCode()) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        com.plaid.link.result.LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInstitution.writeToParcel(parcel, flags);
        }
        java.util.List<com.plaid.link.result.LinkAccount> list = this.accounts;
        parcel.writeInt(list.size());
        java.util.Iterator<com.plaid.link.result.LinkAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.metadataJson);
    }

    public final java.lang.String toString() {
        com.plaid.link.result.LinkInstitution linkInstitution = this.institution;
        java.util.List<com.plaid.link.result.LinkAccount> list = this.accounts;
        java.lang.String str = this.linkSessionId;
        java.lang.String str2 = this.metadataJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkSuccessMetadata(institution=");
        sb.append(linkInstitution);
        sb.append(", accounts=");
        sb.append(list);
        sb.append(", linkSessionId=");
        sb.append(str);
        sb.append(", metadataJson=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.link.result.LinkSuccessMetadata)) {
            return false;
        }
        com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata = (com.plaid.link.result.LinkSuccessMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.institution, linkSuccessMetadata.institution) && kotlin.jvm.internal.Intrinsics.areEqual(this.accounts, linkSuccessMetadata.accounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkSessionId, linkSuccessMetadata.linkSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadataJson, linkSuccessMetadata.metadataJson);
    }

    public final com.plaid.link.result.LinkSuccessMetadata copy(com.plaid.link.result.LinkInstitution institution, java.util.List<com.plaid.link.result.LinkAccount> accounts, java.lang.String linkSessionId, java.lang.String metadataJson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataJson, "");
        return new com.plaid.link.result.LinkSuccessMetadata(institution, accounts, linkSessionId, metadataJson);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMetadataJson() {
        return this.metadataJson;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final java.util.List<com.plaid.link.result.LinkAccount> component2() {
        return this.accounts;
    }

    /* renamed from: component1, reason: from getter */
    public final com.plaid.link.result.LinkInstitution getInstitution() {
        return this.institution;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.plaid.link.result.LinkSuccessMetadata copy$default(com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata, com.plaid.link.result.LinkInstitution linkInstitution, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            linkInstitution = linkSuccessMetadata.institution;
        }
        if ((i & 2) != 0) {
            list = linkSuccessMetadata.accounts;
        }
        if ((i & 4) != 0) {
            str = linkSuccessMetadata.linkSessionId;
        }
        if ((i & 8) != 0) {
            str2 = linkSuccessMetadata.metadataJson;
        }
        return linkSuccessMetadata.copy(linkInstitution, list, str, str2);
    }
}
