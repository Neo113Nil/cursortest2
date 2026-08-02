package androidx.compose.foundation.content;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/content/PlatformTransferableContent;", "", "Landroid/net/Uri;", "linkUri", "Landroid/os/Bundle;", "extras", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getLinkUri", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformTransferableContent {
    public static final int $stable = 8;
    private final android.os.Bundle extras;
    private final android.net.Uri linkUri;

    public PlatformTransferableContent(android.net.Uri uri, android.os.Bundle bundle) {
        this.linkUri = uri;
        this.extras = bundle;
    }

    public final android.os.Bundle getExtras() {
        return this.extras;
    }

    public final android.net.Uri getLinkUri() {
        return this.linkUri;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.content.PlatformTransferableContent)) {
            return false;
        }
        androidx.compose.foundation.content.PlatformTransferableContent platformTransferableContent = (androidx.compose.foundation.content.PlatformTransferableContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.linkUri, platformTransferableContent.linkUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, platformTransferableContent.extras);
    }

    public final int hashCode() {
        android.net.Uri uri = this.linkUri;
        return ((uri != null ? uri.hashCode() : 0) * 31) + this.extras.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlatformTransferableContent(linkUri=");
        sb.append(this.linkUri);
        sb.append(", extras=");
        sb.append(this.extras);
        sb.append(')');
        return sb.toString();
    }
}
