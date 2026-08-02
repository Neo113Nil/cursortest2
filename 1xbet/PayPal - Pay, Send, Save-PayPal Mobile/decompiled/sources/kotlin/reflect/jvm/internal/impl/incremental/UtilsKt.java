package kotlin.reflect.jvm.internal.impl.incremental;

/* loaded from: classes5.dex */
public final class UtilsKt {
    public static final void record(kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo location;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (lookupTracker == kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.incremental.components.Position position = lookupTracker.getRequiresPosition() ? location.getPosition() : kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion.getNO_POSITION();
        java.lang.String filePath = location.getFilePath();
        java.lang.String asString = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptor).asString();
        kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.CLASSIFIER;
        java.lang.String asString2 = name2.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
        lookupTracker.record(filePath, position, asString, scopeKind, asString2);
    }

    public static final void record(kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String asString = packageFragmentDescriptor.getFqName().asString();
        java.lang.String asString2 = name2.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
        recordPackageLookup(lookupTracker, lookupLocation, asString, asString2);
    }

    public static final void recordPackageLookup(kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation, java.lang.String str, java.lang.String str2) {
        kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo location;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (lookupTracker == kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        lookupTracker.record(location.getFilePath(), lookupTracker.getRequiresPosition() ? location.getPosition() : kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion.getNO_POSITION(), str, kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.PACKAGE, str2);
    }
}
