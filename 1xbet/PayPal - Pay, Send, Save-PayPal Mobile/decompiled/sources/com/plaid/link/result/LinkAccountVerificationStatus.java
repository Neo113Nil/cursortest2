package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \t2\u00020\u0001:\b\n\t\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus;", "Landroid/os/Parcelable;", "", "json", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "Companion", "AUTOMATICALLY_VERIFIED", "MANUALLY_VERIFIED", "PENDING_AUTOMATIC_VERIFICATION", "PENDING_MANUAL_VERIFICATION", "UNKNOWN", "VERIFICATION_EXPIRED", "VERIFICATION_FAILED", "Lcom/plaid/link/result/LinkAccountVerificationStatus$AUTOMATICALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$MANUALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_AUTOMATIC_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_MANUAL_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_EXPIRED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_FAILED;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkAccountVerificationStatus implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkAccountVerificationStatus.Companion INSTANCE = new com.plaid.link.result.LinkAccountVerificationStatus.Companion(null);
    private static final java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountVerificationStatus> map;
    private final java.lang.String json;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$Companion;", "", "<init>", "()V", "", "string", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "convert", "(Ljava/lang/String;)Lcom/plaid/link/result/LinkAccountVerificationStatus;", "", "map", "Ljava/util/Map;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.plaid.link.result.LinkAccountVerificationStatus convert(java.lang.String string) {
            if (string == null) {
                return null;
            }
            com.plaid.link.result.LinkAccountVerificationStatus linkAccountVerificationStatus = (com.plaid.link.result.LinkAccountVerificationStatus) com.plaid.link.result.LinkAccountVerificationStatus.map.get(string);
            return linkAccountVerificationStatus == null ? new com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN(string) : linkAccountVerificationStatus;
        }

        private Companion() {
        }
    }

    static {
        com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION pending_automatic_verification = com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION.INSTANCE;
        kotlin.Pair pair = kotlin.TuplesKt.to(pending_automatic_verification.getJson(), pending_automatic_verification);
        com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION pending_manual_verification = com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION.INSTANCE;
        kotlin.Pair pair2 = kotlin.TuplesKt.to(pending_manual_verification.getJson(), pending_manual_verification);
        com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED automatically_verified = com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED.INSTANCE;
        kotlin.Pair pair3 = kotlin.TuplesKt.to(automatically_verified.getJson(), automatically_verified);
        com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED manually_verified = com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED.INSTANCE;
        kotlin.Pair pair4 = kotlin.TuplesKt.to(manually_verified.getJson(), manually_verified);
        com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED verification_expired = com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED.INSTANCE;
        kotlin.Pair pair5 = kotlin.TuplesKt.to(verification_expired.getJson(), verification_expired);
        com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED verification_failed = com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED.INSTANCE;
        map = kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, kotlin.TuplesKt.to(verification_failed.getJson(), verification_failed));
    }

    public /* synthetic */ LinkAccountVerificationStatus(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final java.lang.String getJson() {
        return this.json;
    }

    private LinkAccountVerificationStatus(java.lang.String str) {
        this.json = str;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$AUTOMATICALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AUTOMATICALLY_VERIFIED extends com.plaid.link.result.LinkAccountVerificationStatus {
        public static final com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED INSTANCE = new com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED> CREATOR = new com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountVerificationStatus.AUTOMATICALLY_VERIFIED[i];
            }
        }

        private AUTOMATICALLY_VERIFIED() {
            super("automatically_verified", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$MANUALLY_VERIFIED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MANUALLY_VERIFIED extends com.plaid.link.result.LinkAccountVerificationStatus {
        public static final com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED INSTANCE = new com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED> CREATOR = new com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountVerificationStatus.MANUALLY_VERIFIED[i];
            }
        }

        private MANUALLY_VERIFIED() {
            super("manually_verified", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_AUTOMATIC_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PENDING_AUTOMATIC_VERIFICATION extends com.plaid.link.result.LinkAccountVerificationStatus {
        public static final com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION INSTANCE = new com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION> CREATOR = new com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountVerificationStatus.PENDING_AUTOMATIC_VERIFICATION[i];
            }
        }

        private PENDING_AUTOMATIC_VERIFICATION() {
            super("pending_automatic_verification", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$PENDING_MANUAL_VERIFICATION;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PENDING_MANUAL_VERIFICATION extends com.plaid.link.result.LinkAccountVerificationStatus {
        public static final com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION INSTANCE = new com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION> CREATOR = new com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountVerificationStatus.PENDING_MANUAL_VERIFICATION[i];
            }
        }

        private PENDING_MANUAL_VERIFICATION() {
            super("pending_manual_verification", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "", "rawJson", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRawJson", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends com.plaid.link.result.LinkAccountVerificationStatus {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN> CREATOR = new com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN.Creator();
        private final java.lang.String rawJson;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.rawJson = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN.class, other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rawJson, ((com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN) other).rawJson);
        }

        public final java.lang.String getRawJson() {
            return this.rawJson;
        }

        public final int hashCode() {
            return this.rawJson.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.rawJson);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_EXPIRED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFICATION_EXPIRED extends com.plaid.link.result.LinkAccountVerificationStatus {
        public static final com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED INSTANCE = new com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED> CREATOR = new com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_EXPIRED[i];
            }
        }

        private VERIFICATION_EXPIRED() {
            super("verification_expired", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountVerificationStatus$VERIFICATION_FAILED;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFICATION_FAILED extends com.plaid.link.result.LinkAccountVerificationStatus {
        public static final com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED INSTANCE = new com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED> CREATOR = new com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountVerificationStatus.VERIFICATION_FAILED[i];
            }
        }

        private VERIFICATION_FAILED() {
            super("verification_failed", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }
}
