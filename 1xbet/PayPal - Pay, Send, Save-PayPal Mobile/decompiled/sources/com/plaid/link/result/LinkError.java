package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b&\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b'\u0010\r"}, d2 = {"Lcom/plaid/link/result/LinkError;", "Landroid/os/Parcelable;", "Lcom/plaid/link/result/LinkErrorCode;", "errorCode", "", "errorMessage", "displayMessage", "errorJson", "<init>", "(Lcom/plaid/link/result/LinkErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/plaid/link/result/LinkErrorCode;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/plaid/link/result/LinkErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LinkError;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDisplayMessage", "Lcom/plaid/link/result/LinkErrorCode;", "getErrorCode", "getErrorJson", "getErrorMessage", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LinkError implements android.os.Parcelable {
    private final java.lang.String displayMessage;
    private final com.plaid.link.result.LinkErrorCode errorCode;
    private final java.lang.String errorJson;
    private final java.lang.String errorMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkError.Companion INSTANCE = new com.plaid.link.result.LinkError.Companion(null);
    public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkError> CREATOR = new com.plaid.link.result.LinkError.Creator();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/plaid/link/result/LinkError$Companion;", "", "<init>", "()V", "", "exception", "Lcom/plaid/link/result/LinkError;", "fromException$link_sdk_release", "(Ljava/lang/Throwable;)Lcom/plaid/link/result/LinkError;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.plaid.link.result.LinkError fromException$link_sdk_release(java.lang.Throwable exception) {
            java.lang.String str;
            java.lang.String str2;
            if (exception == null || (str = exception.getMessage()) == null) {
                str = "Internal Error";
            }
            java.lang.String simpleName = exception != null ? exception.getClass().getSimpleName() : null;
            com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR internal_error = new com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR(str, new com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE(simpleName != null ? simpleName : "Internal Error"));
            java.lang.String localizedMessage = exception != null ? exception.getLocalizedMessage() : null;
            java.lang.String str3 = localizedMessage == null ? "Internal exception occurred" : localizedMessage;
            if (exception == null || (str2 = exception.getMessage()) == null) {
                str2 = "An unknown error occurred, please try again later";
            }
            return new com.plaid.link.result.LinkError(internal_error, str3, str2, null, 8, null);
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkError createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.link.result.LinkError((com.plaid.link.result.LinkErrorCode) parcel.readParcelable(com.plaid.link.result.LinkError.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.plaid.link.result.LinkError[] newArray(int i) {
            return new com.plaid.link.result.LinkError[i];
        }
    }

    public LinkError(com.plaid.link.result.LinkErrorCode linkErrorCode, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkErrorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = linkErrorCode;
        this.errorMessage = str;
        this.displayMessage = str2;
        this.errorJson = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String getDisplayMessage() {
        return this.displayMessage;
    }

    public final com.plaid.link.result.LinkErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getErrorJson() {
        return this.errorJson;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final int hashCode() {
        int a2 = com.plaid.internal.C0679x.a(this.errorMessage, this.errorCode.hashCode() * 31, 31);
        java.lang.String str = this.displayMessage;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.errorJson;
        return ((a2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ LinkError(com.plaid.link.result.LinkErrorCode linkErrorCode, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(linkErrorCode, str, str2, (i & 8) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.errorCode, flags);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.displayMessage);
        parcel.writeString(this.errorJson);
    }

    public final java.lang.String toString() {
        com.plaid.link.result.LinkErrorCode linkErrorCode = this.errorCode;
        java.lang.String str = this.errorMessage;
        java.lang.String str2 = this.displayMessage;
        java.lang.String str3 = this.errorJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkError(errorCode=");
        sb.append(linkErrorCode);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", displayMessage=");
        sb.append(str2);
        sb.append(", errorJson=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.link.result.LinkError)) {
            return false;
        }
        com.plaid.link.result.LinkError linkError = (com.plaid.link.result.LinkError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, linkError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, linkError.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayMessage, linkError.displayMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorJson, linkError.errorJson);
    }

    public final com.plaid.link.result.LinkError copy(com.plaid.link.result.LinkErrorCode errorCode, java.lang.String errorMessage, java.lang.String displayMessage, java.lang.String errorJson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        return new com.plaid.link.result.LinkError(errorCode, errorMessage, displayMessage, errorJson);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getErrorJson() {
        return this.errorJson;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayMessage() {
        return this.displayMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final com.plaid.link.result.LinkErrorCode getErrorCode() {
        return this.errorCode;
    }

    public static /* synthetic */ com.plaid.link.result.LinkError copy$default(com.plaid.link.result.LinkError linkError, com.plaid.link.result.LinkErrorCode linkErrorCode, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            linkErrorCode = linkError.errorCode;
        }
        if ((i & 2) != 0) {
            str = linkError.errorMessage;
        }
        if ((i & 4) != 0) {
            str2 = linkError.displayMessage;
        }
        if ((i & 8) != 0) {
            str3 = linkError.errorJson;
        }
        return linkError.copy(linkErrorCode, str, str2, str3);
    }
}
