package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialDescriptor;", "", "", "type", "", "id", "", "transports", "<init>", "(Ljava/lang/String;[BLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()[B", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;[BLjava/util/List;)Landroidx/credentials/webauthn/PublicKeyCredentialDescriptor;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "[B", "getId", "Ljava/util/List;", "getTransports"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PublicKeyCredentialDescriptor {
    private final byte[] id;
    private final java.util.List<java.lang.String> transports;
    private final java.lang.String type;

    public PublicKeyCredentialDescriptor(java.lang.String str, byte[] bArr, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.id = bArr;
        this.transports = list;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final byte[] getId() {
        return this.id;
    }

    public final java.util.List<java.lang.String> getTransports() {
        return this.transports;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialDescriptor(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(java.util.Arrays.toString(this.id));
        sb.append(", transports=");
        sb.append(this.transports);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + java.util.Arrays.hashCode(this.id)) * 31) + this.transports.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.webauthn.PublicKeyCredentialDescriptor)) {
            return false;
        }
        androidx.view.webauthn.PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (androidx.view.webauthn.PublicKeyCredentialDescriptor) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, publicKeyCredentialDescriptor.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, publicKeyCredentialDescriptor.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.transports, publicKeyCredentialDescriptor.transports);
    }

    public final androidx.view.webauthn.PublicKeyCredentialDescriptor copy(java.lang.String type, byte[] id, java.util.List<java.lang.String> transports) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transports, "");
        return new androidx.view.webauthn.PublicKeyCredentialDescriptor(type, id, transports);
    }

    public final java.util.List<java.lang.String> component3() {
        return this.transports;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.view.webauthn.PublicKeyCredentialDescriptor copy$default(androidx.view.webauthn.PublicKeyCredentialDescriptor publicKeyCredentialDescriptor, java.lang.String str, byte[] bArr, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = publicKeyCredentialDescriptor.type;
        }
        if ((i & 2) != 0) {
            bArr = publicKeyCredentialDescriptor.id;
        }
        if ((i & 4) != 0) {
            list = publicKeyCredentialDescriptor.transports;
        }
        return publicKeyCredentialDescriptor.copy(str, bArr, list);
    }
}
