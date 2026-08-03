package com.inmobi.unifiedId;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "", "md5", "", "sha1", "sha256", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMd5", "()Ljava/lang/String;", "getSha1", "getSha256", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Builder", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InMobiUserDataTypes {
    private final java.lang.String md5;
    private final java.lang.String sha1;
    private final java.lang.String sha256;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataTypes$Builder;", "", "<init>", "()V", "", "md5", "(Ljava/lang/String;)Lcom/inmobi/unifiedId/InMobiUserDataTypes$Builder;", "sha1", "sha256", "Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "build", "()Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f5604a;
        public java.lang.String b;
        public java.lang.String c;

        public final com.inmobi.unifiedId.InMobiUserDataTypes build() {
            return new com.inmobi.unifiedId.InMobiUserDataTypes(this.f5604a, this.b, this.c);
        }

        public final com.inmobi.unifiedId.InMobiUserDataTypes.Builder md5(java.lang.String md5) {
            this.f5604a = md5;
            return this;
        }

        public final com.inmobi.unifiedId.InMobiUserDataTypes.Builder sha1(java.lang.String sha1) {
            this.b = sha1;
            return this;
        }

        public final com.inmobi.unifiedId.InMobiUserDataTypes.Builder sha256(java.lang.String sha256) {
            this.c = sha256;
            return this;
        }
    }

    public InMobiUserDataTypes(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }

    public static /* synthetic */ com.inmobi.unifiedId.InMobiUserDataTypes copy$default(com.inmobi.unifiedId.InMobiUserDataTypes inMobiUserDataTypes, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = inMobiUserDataTypes.md5;
        }
        if ((i & 2) != 0) {
            str2 = inMobiUserDataTypes.sha1;
        }
        if ((i & 4) != 0) {
            str3 = inMobiUserDataTypes.sha256;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMd5() {
        return this.md5;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSha1() {
        return this.sha1;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSha256() {
        return this.sha256;
    }

    public final com.inmobi.unifiedId.InMobiUserDataTypes copy(java.lang.String md5, java.lang.String sha1, java.lang.String sha256) {
        return new com.inmobi.unifiedId.InMobiUserDataTypes(md5, sha1, sha256);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.inmobi.unifiedId.InMobiUserDataTypes)) {
            return false;
        }
        com.inmobi.unifiedId.InMobiUserDataTypes inMobiUserDataTypes = (com.inmobi.unifiedId.InMobiUserDataTypes) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.md5, inMobiUserDataTypes.md5) && kotlin.jvm.internal.Intrinsics.areEqual(this.sha1, inMobiUserDataTypes.sha1) && kotlin.jvm.internal.Intrinsics.areEqual(this.sha256, inMobiUserDataTypes.sha256);
    }

    public final java.lang.String getMd5() {
        return this.md5;
    }

    public final java.lang.String getSha1() {
        return this.sha1;
    }

    public final java.lang.String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        java.lang.String str = this.md5;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.sha1;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.sha256;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "InMobiUserDataTypes(md5=" + this.md5 + ", sha1=" + this.sha1 + ", sha256=" + this.sha256 + ")";
    }
}
