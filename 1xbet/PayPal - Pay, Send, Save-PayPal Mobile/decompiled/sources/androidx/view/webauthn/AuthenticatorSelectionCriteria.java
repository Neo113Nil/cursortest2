package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "", "", "authenticatorAttachment", "residentKey", "", "requireResidentKey", "userVerification", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthenticatorAttachment", "getResidentKey", "Z", "getRequireResidentKey", "getUserVerification"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AuthenticatorSelectionCriteria {
    private final java.lang.String authenticatorAttachment;
    private final boolean requireResidentKey;
    private final java.lang.String residentKey;
    private final java.lang.String userVerification;

    public AuthenticatorSelectionCriteria(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.authenticatorAttachment = str;
        this.residentKey = str2;
        this.requireResidentKey = z;
        this.userVerification = str3;
    }

    public final java.lang.String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final java.lang.String getResidentKey() {
        return this.residentKey;
    }

    public final boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    public /* synthetic */ AuthenticatorSelectionCriteria(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "preferred" : str3);
    }

    public final java.lang.String getUserVerification() {
        return this.userVerification;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticatorSelectionCriteria(authenticatorAttachment=");
        sb.append(this.authenticatorAttachment);
        sb.append(", residentKey=");
        sb.append(this.residentKey);
        sb.append(", requireResidentKey=");
        sb.append(this.requireResidentKey);
        sb.append(", userVerification=");
        sb.append(this.userVerification);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.authenticatorAttachment.hashCode() * 31) + this.residentKey.hashCode()) * 31) + java.lang.Boolean.hashCode(this.requireResidentKey)) * 31) + this.userVerification.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.webauthn.AuthenticatorSelectionCriteria)) {
            return false;
        }
        androidx.view.webauthn.AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (androidx.view.webauthn.AuthenticatorSelectionCriteria) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAttachment, authenticatorSelectionCriteria.authenticatorAttachment) && kotlin.jvm.internal.Intrinsics.areEqual(this.residentKey, authenticatorSelectionCriteria.residentKey) && this.requireResidentKey == authenticatorSelectionCriteria.requireResidentKey && kotlin.jvm.internal.Intrinsics.areEqual(this.userVerification, authenticatorSelectionCriteria.userVerification);
    }

    public final androidx.view.webauthn.AuthenticatorSelectionCriteria copy(java.lang.String authenticatorAttachment, java.lang.String residentKey, boolean requireResidentKey, java.lang.String userVerification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAttachment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(residentKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userVerification, "");
        return new androidx.view.webauthn.AuthenticatorSelectionCriteria(authenticatorAttachment, residentKey, requireResidentKey, userVerification);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUserVerification() {
        return this.userVerification;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getResidentKey() {
        return this.residentKey;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public static /* synthetic */ androidx.view.webauthn.AuthenticatorSelectionCriteria copy$default(androidx.view.webauthn.AuthenticatorSelectionCriteria authenticatorSelectionCriteria, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticatorSelectionCriteria.authenticatorAttachment;
        }
        if ((i & 2) != 0) {
            str2 = authenticatorSelectionCriteria.residentKey;
        }
        if ((i & 4) != 0) {
            z = authenticatorSelectionCriteria.requireResidentKey;
        }
        if ((i & 8) != 0) {
            str3 = authenticatorSelectionCriteria.userVerification;
        }
        return authenticatorSelectionCriteria.copy(str, str2, z, str3);
    }
}
