package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/window/core/ActivityComponentInfo;", "", "", com.visa.cbp.ConsumerInfo.setSignature, "className", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/ComponentName;", "componentName", "(Landroid/content/ComponentName;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getPackageName", "getClassName"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityComponentInfo {
    private final java.lang.String className;
    private final java.lang.String packageName;

    public ActivityComponentInfo(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.packageName = str;
        this.className = str2;
    }

    public final java.lang.String getClassName() {
        return this.className;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActivityComponentInfo(android.content.ComponentName componentName) {
        this(r1, r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        java.lang.String packageName = componentName.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
        java.lang.String className = componentName.getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "");
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.window.core.ActivityComponentInfo activityComponentInfo = (androidx.window.core.ActivityComponentInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, activityComponentInfo.packageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.className, activityComponentInfo.className);
    }

    public final int hashCode() {
        return (this.packageName.hashCode() * 31) + this.className.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassInfo { packageName: ");
        sb.append(this.packageName);
        sb.append(", className: ");
        sb.append(this.className);
        sb.append(" }");
        return sb.toString();
    }
}
