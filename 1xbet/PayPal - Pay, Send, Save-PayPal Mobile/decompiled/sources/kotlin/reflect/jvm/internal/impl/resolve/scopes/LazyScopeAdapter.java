package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class LazyScopeAdapter extends kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> getHighSpeedVideoSizes;

    public LazyScopeAdapter(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, final kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(function0) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$$Lambda$0
            private final kotlin.jvm.functions.Function0 getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = function0;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LazyScopeAdapter(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, function0);
        if ((i & 1) != 0) {
            storageManager = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageManager, "");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    protected final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getWorkerScope() {
        return this.getHighSpeedVideoSizes.invoke();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0 function0) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) function0.invoke();
        return memberScope instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter) memberScope).getActualScope() : memberScope;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> function0) {
        this(null, function0, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
    }
}
