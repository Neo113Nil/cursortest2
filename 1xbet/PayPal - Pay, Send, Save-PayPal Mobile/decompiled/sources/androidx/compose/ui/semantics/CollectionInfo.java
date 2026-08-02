package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\f"}, d2 = {"Landroidx/compose/ui/semantics/CollectionInfo;", "", "", "rowCount", "columnCount", "<init>", "(II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRowCount", "getColumnCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CollectionInfo {
    public static final int $stable = 0;
    private final int columnCount;
    private final int rowCount;

    public CollectionInfo(int i, int i2) {
        this.rowCount = i;
        this.columnCount = i2;
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    public final int getRowCount() {
        return this.rowCount;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.semantics.CollectionInfo)) {
            return false;
        }
        androidx.compose.ui.semantics.CollectionInfo collectionInfo = (androidx.compose.ui.semantics.CollectionInfo) other;
        return this.rowCount == collectionInfo.rowCount && this.columnCount == collectionInfo.columnCount;
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.rowCount) * 31) + java.lang.Integer.hashCode(this.columnCount);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.rowCount);
        sb.append(", columnCount=");
        sb.append(this.columnCount);
        sb.append(')');
        return sb.toString();
    }
}
