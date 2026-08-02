package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
final class FallbackBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns {
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns();

    private FallbackBuiltIns() {
        super(new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getInstance() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
