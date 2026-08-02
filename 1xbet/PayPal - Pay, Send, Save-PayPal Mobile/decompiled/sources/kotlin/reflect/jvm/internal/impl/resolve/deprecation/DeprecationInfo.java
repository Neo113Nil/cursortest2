package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* loaded from: classes5.dex */
public abstract class DeprecationInfo implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo> {
    public abstract kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();

    @Override // java.lang.Comparable
    public int compareTo(kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo deprecationInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deprecationInfo, "");
        int compareTo = getDeprecationLevel().compareTo(deprecationInfo.getDeprecationLevel());
        if (compareTo == 0 && !getPropagatesToOverrides() && deprecationInfo.getPropagatesToOverrides()) {
            return 1;
        }
        return compareTo;
    }
}
