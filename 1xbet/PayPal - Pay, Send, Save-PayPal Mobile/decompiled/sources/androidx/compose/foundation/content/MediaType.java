package androidx.compose.foundation.content;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/content/MediaType;", "", "", "representation", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getRepresentation", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaType {
    public static final int $stable = 0;
    private final java.lang.String representation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.content.MediaType.Companion INSTANCE = new androidx.compose.foundation.content.MediaType.Companion(null);
    private static final androidx.compose.foundation.content.MediaType Text = new androidx.compose.foundation.content.MediaType("text/*");
    private static final androidx.compose.foundation.content.MediaType PlainText = new androidx.compose.foundation.content.MediaType("text/plain");
    private static final androidx.compose.foundation.content.MediaType HtmlText = new androidx.compose.foundation.content.MediaType("text/html");
    private static final androidx.compose.foundation.content.MediaType Image = new androidx.compose.foundation.content.MediaType("image/*");
    private static final androidx.compose.foundation.content.MediaType All = new androidx.compose.foundation.content.MediaType("*/*");

    public MediaType(java.lang.String str) {
        this.representation = str;
    }

    public final java.lang.String getRepresentation() {
        return this.representation;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/foundation/content/MediaType$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/content/MediaType;", "Text", "Landroidx/compose/foundation/content/MediaType;", "getText", "()Landroidx/compose/foundation/content/MediaType;", "PlainText", "getPlainText", "HtmlText", "getHtmlText", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "getImage", "All", "getAll"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.content.MediaType getText() {
            return androidx.compose.foundation.content.MediaType.Text;
        }

        public final androidx.compose.foundation.content.MediaType getPlainText() {
            return androidx.compose.foundation.content.MediaType.PlainText;
        }

        public final androidx.compose.foundation.content.MediaType getHtmlText() {
            return androidx.compose.foundation.content.MediaType.HtmlText;
        }

        public final androidx.compose.foundation.content.MediaType getImage() {
            return androidx.compose.foundation.content.MediaType.Image;
        }

        public final androidx.compose.foundation.content.MediaType getAll() {
            return androidx.compose.foundation.content.MediaType.All;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.compose.foundation.content.MediaType) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.representation, ((androidx.compose.foundation.content.MediaType) other).representation);
        }
        return false;
    }

    public final int hashCode() {
        return this.representation.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaType(representation='");
        sb.append(this.representation);
        sb.append("')");
        return sb.toString();
    }
}
