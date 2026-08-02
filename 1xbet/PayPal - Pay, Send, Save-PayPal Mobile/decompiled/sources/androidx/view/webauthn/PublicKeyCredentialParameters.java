package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialParameters;", "", "", "type", "", "alg", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Landroidx/credentials/webauthn/PublicKeyCredentialParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "J", "getAlg"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PublicKeyCredentialParameters {
    private final long alg;
    private final java.lang.String type;

    public PublicKeyCredentialParameters(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.alg = j;
    }

    public final long getAlg() {
        return this.alg;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialParameters(type=");
        sb.append(this.type);
        sb.append(", alg=");
        sb.append(this.alg);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + java.lang.Long.hashCode(this.alg);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.webauthn.PublicKeyCredentialParameters)) {
            return false;
        }
        androidx.view.webauthn.PublicKeyCredentialParameters publicKeyCredentialParameters = (androidx.view.webauthn.PublicKeyCredentialParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, publicKeyCredentialParameters.type) && this.alg == publicKeyCredentialParameters.alg;
    }

    public final androidx.view.webauthn.PublicKeyCredentialParameters copy(java.lang.String type, long alg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new androidx.view.webauthn.PublicKeyCredentialParameters(type, alg);
    }

    /* renamed from: component2, reason: from getter */
    public final long getAlg() {
        return this.alg;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ androidx.view.webauthn.PublicKeyCredentialParameters copy$default(androidx.view.webauthn.PublicKeyCredentialParameters publicKeyCredentialParameters, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = publicKeyCredentialParameters.type;
        }
        if ((i & 2) != 0) {
            j = publicKeyCredentialParameters.alg;
        }
        return publicKeyCredentialParameters.copy(str, j);
    }
}
