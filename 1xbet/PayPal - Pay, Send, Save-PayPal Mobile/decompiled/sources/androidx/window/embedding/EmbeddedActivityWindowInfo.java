package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016"}, d2 = {"Landroidx/window/embedding/EmbeddedActivityWindowInfo;", "", "", "isEmbedded", "Landroid/graphics/Rect;", "parentHostBounds", "boundsInParentHost", "<init>", "(ZLandroid/graphics/Rect;Landroid/graphics/Rect;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "Landroid/graphics/Rect;", "getParentHostBounds", "()Landroid/graphics/Rect;", "getBoundsInParentHost"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddedActivityWindowInfo {
    private final android.graphics.Rect boundsInParentHost;
    private final boolean isEmbedded;
    private final android.graphics.Rect parentHostBounds;

    public EmbeddedActivityWindowInfo(boolean z, android.graphics.Rect rect, android.graphics.Rect rect2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect2, "");
        this.isEmbedded = z;
        this.parentHostBounds = rect;
        this.boundsInParentHost = rect2;
    }

    /* renamed from: isEmbedded, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    public final android.graphics.Rect getParentHostBounds() {
        return this.parentHostBounds;
    }

    public final android.graphics.Rect getBoundsInParentHost() {
        return this.boundsInParentHost;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.EmbeddedActivityWindowInfo)) {
            return false;
        }
        androidx.window.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo = (androidx.window.embedding.EmbeddedActivityWindowInfo) other;
        return this.isEmbedded == embeddedActivityWindowInfo.isEmbedded && kotlin.jvm.internal.Intrinsics.areEqual(this.parentHostBounds, embeddedActivityWindowInfo.parentHostBounds) && kotlin.jvm.internal.Intrinsics.areEqual(this.boundsInParentHost, embeddedActivityWindowInfo.boundsInParentHost);
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isEmbedded) * 31) + this.parentHostBounds.hashCode()) * 31) + this.boundsInParentHost.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddedActivityWindowInfo{isEmbedded=");
        sb.append(this.isEmbedded);
        sb.append(", parentHostBounds=");
        sb.append(this.parentHostBounds);
        sb.append(", boundsInParentHost=");
        sb.append(this.boundsInParentHost);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
