package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Landroidx/work/impl/model/Dependency;", "", "", "workSpecId", "prerequisiteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getWorkSpecId", "()Ljava/lang/String;", "getPrerequisiteId"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Dependency {
    private final java.lang.String prerequisiteId;
    private final java.lang.String workSpecId;

    public Dependency(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.workSpecId = str;
        this.prerequisiteId = str2;
    }

    public final java.lang.String getWorkSpecId() {
        return this.workSpecId;
    }

    public final java.lang.String getPrerequisiteId() {
        return this.prerequisiteId;
    }
}
