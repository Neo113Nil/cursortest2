package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017"}, d2 = {"Landroidx/work/impl/model/SystemIdInfo;", "", "", "workSpecId", "", "generation", "systemId", "<init>", "(Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Landroidx/work/impl/model/SystemIdInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getGeneration"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SystemIdInfo {
    private final int generation;
    public final int systemId;
    public final java.lang.String workSpecId;

    public SystemIdInfo(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.workSpecId = str;
        this.generation = i;
        this.systemId = i2;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.workSpecId);
        sb.append(", generation=");
        sb.append(this.generation);
        sb.append(", systemId=");
        sb.append(this.systemId);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.workSpecId.hashCode() * 31) + java.lang.Integer.hashCode(this.generation)) * 31) + java.lang.Integer.hashCode(this.systemId);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.work.impl.model.SystemIdInfo)) {
            return false;
        }
        androidx.work.impl.model.SystemIdInfo systemIdInfo = (androidx.work.impl.model.SystemIdInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    public final androidx.work.impl.model.SystemIdInfo copy(java.lang.String workSpecId, int generation, int systemId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        return new androidx.work.impl.model.SystemIdInfo(workSpecId, generation, systemId);
    }

    /* renamed from: component3, reason: from getter */
    public final int getSystemId() {
        return this.systemId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWorkSpecId() {
        return this.workSpecId;
    }

    public static /* synthetic */ androidx.work.impl.model.SystemIdInfo copy$default(androidx.work.impl.model.SystemIdInfo systemIdInfo, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i3 & 2) != 0) {
            i = systemIdInfo.generation;
        }
        if ((i3 & 4) != 0) {
            i2 = systemIdInfo.systemId;
        }
        return systemIdInfo.copy(str, i, i2);
    }
}
