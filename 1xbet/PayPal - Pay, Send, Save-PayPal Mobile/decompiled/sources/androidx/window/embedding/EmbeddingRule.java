package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/window/embedding/EmbeddingRule;", "", "", "tag", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class EmbeddingRule {
    private final java.lang.String tag;

    public EmbeddingRule(java.lang.String str) {
        this.tag = str;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.window.embedding.EmbeddingRule) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.tag, ((androidx.window.embedding.EmbeddingRule) other).tag);
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.tag;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
