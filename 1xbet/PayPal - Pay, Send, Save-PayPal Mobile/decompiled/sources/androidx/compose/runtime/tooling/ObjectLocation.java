package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Landroidx/compose/runtime/tooling/ObjectLocation;", "", "", "group", "dataOffset", "<init>", "(ILjava/lang/Integer;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Landroidx/compose/runtime/tooling/ObjectLocation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getGroup", "Ljava/lang/Integer;", "getDataOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ObjectLocation {
    public static final int $stable = 0;
    private final java.lang.Integer dataOffset;
    private final int group;

    public ObjectLocation(int i, java.lang.Integer num) {
        this.group = i;
        this.dataOffset = num;
    }

    public final java.lang.Integer getDataOffset() {
        return this.dataOffset;
    }

    public final int getGroup() {
        return this.group;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ObjectLocation(group=");
        sb.append(this.group);
        sb.append(", dataOffset=");
        sb.append(this.dataOffset);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.group);
        java.lang.Integer num = this.dataOffset;
        return (hashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.runtime.tooling.ObjectLocation)) {
            return false;
        }
        androidx.compose.runtime.tooling.ObjectLocation objectLocation = (androidx.compose.runtime.tooling.ObjectLocation) other;
        return this.group == objectLocation.group && kotlin.jvm.internal.Intrinsics.areEqual(this.dataOffset, objectLocation.dataOffset);
    }

    public final androidx.compose.runtime.tooling.ObjectLocation copy(int group, java.lang.Integer dataOffset) {
        return new androidx.compose.runtime.tooling.ObjectLocation(group, dataOffset);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getDataOffset() {
        return this.dataOffset;
    }

    /* renamed from: component1, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    public static /* synthetic */ androidx.compose.runtime.tooling.ObjectLocation copy$default(androidx.compose.runtime.tooling.ObjectLocation objectLocation, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = objectLocation.group;
        }
        if ((i2 & 2) != 0) {
            num = objectLocation.dataOffset;
        }
        return objectLocation.copy(i, num);
    }
}
