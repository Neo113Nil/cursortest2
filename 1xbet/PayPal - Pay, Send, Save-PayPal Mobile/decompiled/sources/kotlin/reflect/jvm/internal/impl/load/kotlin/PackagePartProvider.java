package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public interface PackagePartProvider {
    java.util.List<java.lang.String> findPackageParts(java.lang.String str);

    public static final class Empty implements kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider {
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider.Empty INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider.Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public final java.util.List<java.lang.String> findPackageParts(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
