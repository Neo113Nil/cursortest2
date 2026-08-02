package kotlin.reflect.jvm.internal.impl.metadata.builtins;

/* loaded from: classes5.dex */
public final class ReadPackageFragmentKt {
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion> readBuiltinsPackageFragment(java.io.InputStream inputStream) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.InputStream inputStream2 = inputStream;
        try {
            java.io.InputStream inputStream3 = inputStream2;
            kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion readFrom = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.Companion.readFrom(inputStream3);
            if (readFrom.isCompatibleWithCurrentCompilerVersion()) {
                kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite newInstance = kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.newInstance();
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.registerAllExtensions(newInstance);
                packageFragment = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.parseFrom(inputStream3, newInstance);
            } else {
                packageFragment = null;
            }
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion> pair = kotlin.TuplesKt.to(packageFragment, readFrom);
            kotlin.io.CloseableKt.closeFinally(inputStream2, null);
            return pair;
        } finally {
        }
    }
}
