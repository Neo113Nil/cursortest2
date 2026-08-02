package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class PackagePartScopeCache {
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> getHighSpeedVideoFpsRangesFor;

    public PackagePartScopeCache(kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder reflectKotlinClassFinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reflectKotlinClassFinder, "");
        this.getHighSpeedVideoFpsRanges = deserializedDescriptorResolver;
        this.Camera2StreamConfigurationMap = reflectKotlinClassFinder;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getPackagePartScope(kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass reflectKotlinClass) {
        java.util.ArrayList listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reflectKotlinClass, "");
        java.util.concurrent.ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> concurrentHashMap = this.getHighSpeedVideoFpsRangesFor;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = reflectKotlinClass.getClassId();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = concurrentHashMap.get(classId);
        if (memberScope == null) {
            kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = reflectKotlinClass.getClassId().getPackageFqName();
            if (reflectKotlinClass.getClassHeader().getKind() == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                java.util.List<java.lang.String> multifilePartNames = reflectKotlinClass.getClassHeader().getMultifilePartNames();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : multifilePartNames) {
                    kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
                    kotlin.reflect.jvm.internal.impl.name.FqName fqNameForTopLevelClassMaybeWithDollars = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqNameForTopLevelClassMaybeWithDollars, "");
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(this.Camera2StreamConfigurationMap, companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), this.getHighSpeedVideoFpsRanges.getComponents().getConfiguration().getMetadataVersion());
                    if (findKotlinClass != null) {
                        arrayList.add(findKotlinClass);
                    }
                }
                listOf = arrayList;
            } else {
                listOf = kotlin.collections.CollectionsKt.listOf(reflectKotlinClass);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(this.getHighSpeedVideoFpsRanges.getComponents().getModuleDescriptor(), packageFqName);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createKotlinPackagePartScope = this.getHighSpeedVideoFpsRanges.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass) it.next());
                if (createKotlinPackagePartScope != null) {
                    arrayList2.add(createKotlinPackagePartScope);
                }
            }
            java.util.List list = kotlin.collections.CollectionsKt.toList(arrayList2);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion companion2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("package ");
            sb.append(packageFqName);
            sb.append(" (");
            sb.append(reflectKotlinClass);
            sb.append(')');
            memberScope = companion2.create(sb.toString(), list);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope putIfAbsent = concurrentHashMap.putIfAbsent(classId, memberScope);
            if (putIfAbsent != null) {
                memberScope = putIfAbsent;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(memberScope, "");
        return memberScope;
    }
}
