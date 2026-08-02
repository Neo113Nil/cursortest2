package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", "", "", "name", "", "id", "displayName", "<init>", "(Ljava/lang/String;[BLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()[B", "component3", "copy", "(Ljava/lang/String;[BLjava/lang/String;)Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "[B", "getId", "getDisplayName"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PublicKeyCredentialUserEntity {
    private final java.lang.String displayName;
    private final byte[] id;
    private final java.lang.String name;

    public PublicKeyCredentialUserEntity(java.lang.String str, byte[] bArr, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.id = bArr;
        this.displayName = str2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final byte[] getId() {
        return this.id;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialUserEntity(name=");
        sb.append(this.name);
        sb.append(", id=");
        sb.append(java.util.Arrays.toString(this.id));
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + java.util.Arrays.hashCode(this.id)) * 31) + this.displayName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.webauthn.PublicKeyCredentialUserEntity)) {
            return false;
        }
        androidx.view.webauthn.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (androidx.view.webauthn.PublicKeyCredentialUserEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, publicKeyCredentialUserEntity.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, publicKeyCredentialUserEntity.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, publicKeyCredentialUserEntity.displayName);
    }

    public final androidx.view.webauthn.PublicKeyCredentialUserEntity copy(java.lang.String name2, byte[] id, java.lang.String displayName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        return new androidx.view.webauthn.PublicKeyCredentialUserEntity(name2, id, displayName);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ androidx.view.webauthn.PublicKeyCredentialUserEntity copy$default(androidx.view.webauthn.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, java.lang.String str, byte[] bArr, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = publicKeyCredentialUserEntity.name;
        }
        if ((i & 2) != 0) {
            bArr = publicKeyCredentialUserEntity.id;
        }
        if ((i & 4) != 0) {
            str2 = publicKeyCredentialUserEntity.displayName;
        }
        return publicKeyCredentialUserEntity.copy(str, bArr, str2);
    }
}
