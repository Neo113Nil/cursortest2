package kotlin.internal;

/* compiled from: PlatformImplementations.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\"\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "castToBaseType", "T", "", com.ironsource.C3232q2.p, "(Ljava/lang/Object;)Ljava/lang/Object;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformImplementationsKt {
    public static final kotlin.internal.PlatformImplementations IMPLEMENTATIONS;

    static {
        kotlin.internal.jdk8.JDK8PlatformImplementations jDK8PlatformImplementations = new kotlin.internal.jdk8.JDK8PlatformImplementations();
        try {
            IMPLEMENTATIONS = jDK8PlatformImplementations;
        } catch (java.lang.ClassCastException e) {
            java.lang.ClassLoader classLoader = jDK8PlatformImplementations.getClass().getClassLoader();
            java.lang.ClassLoader classLoader2 = kotlin.internal.PlatformImplementations.class.getClassLoader();
            if (kotlin.jvm.internal.Intrinsics.areEqual(classLoader, classLoader2)) {
                throw e;
            }
            throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T castToBaseType(java.lang.Object obj) {
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
            java.lang.Object obj2 = obj;
            return obj;
        } catch (java.lang.ClassCastException e) {
            java.lang.ClassLoader classLoader = obj.getClass().getClassLoader();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            java.lang.ClassLoader classLoader2 = java.lang.Object.class.getClassLoader();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(classLoader, classLoader2)) {
                throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        }
    }

    public static final boolean apiVersionIsAtLeast(int i, int i2, int i3) {
        return kotlin.KotlinVersion.CURRENT.isAtLeast(i, i2, i3);
    }
}
