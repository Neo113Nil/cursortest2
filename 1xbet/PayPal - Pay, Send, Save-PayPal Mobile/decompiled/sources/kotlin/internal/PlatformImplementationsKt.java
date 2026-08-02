package kotlin.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"", "major", "minor", "patch", "", "apiVersionIsAtLeast", "(III)Z", "Lkotlin/internal/PlatformImplementations;", "IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instance class was loaded from a different classloader: ");
            sb.append(classLoader);
            sb.append(", base type classloader: ");
            sb.append(classLoader2);
            throw new java.lang.ClassNotFoundException(sb.toString(), e);
        }
    }

    public static final boolean apiVersionIsAtLeast(int i, int i2, int i3) {
        return kotlin.KotlinVersion.CURRENT.isAtLeast(i, i2, i3);
    }
}
