package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* loaded from: classes5.dex */
public final class BuiltInsPackageFragmentImpl extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl implements kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion(null);
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    private BuiltInsPackageFragmentImpl(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment, kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion builtInsBinaryVersion, boolean z) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, null);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl create(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.io.InputStream inputStream, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion> readBuiltinsPackageFragment = kotlin.reflect.jvm.internal.impl.metadata.builtins.ReadPackageFragmentKt.readBuiltinsPackageFragment(inputStream);
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment component1 = readBuiltinsPackageFragment.component1();
            kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion component2 = readBuiltinsPackageFragment.component2();
            if (component1 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Kotlin built-in definition format version is not supported: expected ");
                sb.append(kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.INSTANCE);
                sb.append(", actual ");
                sb.append(component2);
                sb.append(". Please update Kotlin");
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl(fqName, storageManager, moduleDescriptor, component1, component2, z, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("builtins package fragment for ");
        sb.append(getFqName());
        sb.append(" from ");
        sb.append(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(this));
        return sb.toString();
    }

    public /* synthetic */ BuiltInsPackageFragmentImpl(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment, kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion builtInsBinaryVersion, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z);
    }
}
