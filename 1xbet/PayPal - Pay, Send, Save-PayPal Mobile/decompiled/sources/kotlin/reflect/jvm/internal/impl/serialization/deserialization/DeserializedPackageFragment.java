package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes3.dex */
public abstract class DeserializedPackageFragment extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl {
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoSizes;

    public abstract kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder getClassDataFinder();

    public abstract void initialize(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        super(moduleDescriptor, fqName);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        this.getHighSpeedVideoSizes = storageManager;
    }

    public boolean hasTopLevelClass(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = getMemberScope();
        return (memberScope instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) && ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope) memberScope).getClassNames$deserialization().contains(name2);
    }
}
