package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class StdlibClassFinderKt {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder> getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<>("StdlibClassFinder");

    public static final kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder getStdlibClassFinder(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder stdlibClassFinder = (kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder) moduleDescriptor.getCapability(getHighSpeedVideoFpsRanges);
        return stdlibClassFinder == null ? kotlin.reflect.jvm.internal.impl.resolve.CliStdlibClassFinderImpl.getHighResolutionOutputSizeshNQ4ISI : stdlibClassFinder;
    }
}
