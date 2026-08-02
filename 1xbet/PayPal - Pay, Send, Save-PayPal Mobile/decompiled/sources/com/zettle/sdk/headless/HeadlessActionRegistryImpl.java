package com.zettle.sdk.headless;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R,\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\r\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessActionRegistryImpl;", "Lcom/zettle/sdk/headless/HeadlessActionRegistry;", "Lcom/zettle/sdk/core/permission/PermissionModule;", "permissionModule", "<init>", "(Lcom/zettle/sdk/core/permission/PermissionModule;)V", "T", "Lcom/zettle/sdk/headless/HeadlessAction;", "action", "Lcom/zettle/sdk/headless/HeadlessResult;", "execute", "(Lcom/zettle/sdk/headless/HeadlessAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/reflect/KClass;", "getCapabilities", "()Ljava/util/Set;", "Lcom/zettle/sdk/headless/HeadlessPlugin;", "plugin", "", "register", "(Lcom/zettle/sdk/headless/HeadlessPlugin;)V", "unregister", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/permission/PermissionModule;", "getPermissionModule", "()Lcom/zettle/sdk/core/permission/PermissionModule;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HeadlessActionRegistryImpl implements com.zettle.sdk.headless.HeadlessActionRegistry {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<com.zettle.sdk.headless.HeadlessPlugin> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<? extends com.zettle.sdk.headless.HeadlessAction<?>>, com.zettle.sdk.headless.HeadlessPlugin> getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.core.permission.PermissionModule permissionModule;

    public HeadlessActionRegistryImpl(com.zettle.sdk.core.permission.PermissionModule permissionModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionModule, "");
        this.permissionModule = permissionModule;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
    }

    public final com.zettle.sdk.core.permission.PermissionModule getPermissionModule() {
        return this.permissionModule;
    }

    @Override // com.zettle.sdk.headless.HeadlessActionRegistry
    public final void register(com.zettle.sdk.headless.HeadlessPlugin plugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges.add(plugin);
            java.util.Iterator<T> it = plugin.getCapabilities().iterator();
            while (it.hasNext()) {
                this.getHighResolutionOutputSizeshNQ4ISI.put((kotlin.reflect.KClass) it.next(), plugin);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.zettle.sdk.headless.HeadlessActionRegistry
    public final void unregister(com.zettle.sdk.headless.HeadlessPlugin plugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges.remove(plugin);
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            for (com.zettle.sdk.headless.HeadlessPlugin headlessPlugin : this.getHighSpeedVideoFpsRanges) {
                java.util.Iterator<T> it = headlessPlugin.getCapabilities().iterator();
                while (it.hasNext()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.put((kotlin.reflect.KClass) it.next(), headlessPlugin);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.zettle.sdk.headless.HeadlessActionRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object execute(com.zettle.sdk.headless.HeadlessAction<? extends T> headlessAction, kotlin.coroutines.Continuation<? super com.zettle.sdk.headless.HeadlessResult<? extends T>> continuation) {
        com.zettle.sdk.headless.HeadlessActionRegistryImpl$execute$1 headlessActionRegistryImpl$execute$1;
        int i;
        com.zettle.sdk.headless.HeadlessActionRegistryImpl headlessActionRegistryImpl;
        java.util.List list;
        com.zettle.sdk.headless.HeadlessPlugin headlessPlugin;
        com.zettle.sdk.headless.HeadlessResult headlessResult;
        try {
            if (continuation instanceof com.zettle.sdk.headless.HeadlessActionRegistryImpl$execute$1) {
                headlessActionRegistryImpl$execute$1 = (com.zettle.sdk.headless.HeadlessActionRegistryImpl$execute$1) continuation;
                if ((headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements = headlessAction.requirements();
                        com.zettle.sdk.core.permission.PermissionModule permissionModule = this.permissionModule;
                        headlessActionRegistryImpl$execute$1.getHighSpeedVideoSizes = this;
                        headlessActionRegistryImpl$execute$1.Camera2StreamConfigurationMap = headlessAction;
                        headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = permissionModule.checkApprovedPermissions(requirements, headlessActionRegistryImpl$execute$1);
                        if (obj != coroutine_suspended) {
                            headlessActionRegistryImpl = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        headlessResult = (com.zettle.sdk.headless.HeadlessResult) obj;
                        if (headlessResult != null) {
                            return headlessResult;
                        }
                        return com.zettle.sdk.headless.HeadlessResult.INSTANCE.unsupported();
                    }
                    headlessAction = (com.zettle.sdk.headless.HeadlessAction) headlessActionRegistryImpl$execute$1.Camera2StreamConfigurationMap;
                    headlessActionRegistryImpl = (com.zettle.sdk.headless.HeadlessActionRegistryImpl) headlessActionRegistryImpl$execute$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    list = (java.util.List) obj;
                    if (list.isEmpty()) {
                        return com.zettle.sdk.headless.HeadlessResult.INSTANCE.prerequisitesNotFulfilled(kotlin.collections.CollectionsKt.toSet(list));
                    }
                    synchronized (headlessActionRegistryImpl) {
                        headlessPlugin = headlessActionRegistryImpl.getHighResolutionOutputSizeshNQ4ISI.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(headlessAction.getClass()));
                    }
                    if (headlessPlugin != null) {
                        headlessActionRegistryImpl$execute$1.getHighSpeedVideoSizes = null;
                        headlessActionRegistryImpl$execute$1.Camera2StreamConfigurationMap = null;
                        headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRangesFor = 2;
                        obj = headlessPlugin.execute(headlessAction, headlessActionRegistryImpl$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        headlessResult = (com.zettle.sdk.headless.HeadlessResult) obj;
                        if (headlessResult != null) {
                        }
                    }
                    return com.zettle.sdk.headless.HeadlessResult.INSTANCE.unsupported();
                }
            }
            if (i != 0) {
            }
            list = (java.util.List) obj;
            if (list.isEmpty()) {
            }
        } catch (java.lang.Throwable th) {
            return com.zettle.sdk.headless.HeadlessResult.INSTANCE.failed("Plugin exception", th);
        }
        headlessActionRegistryImpl$execute$1 = new com.zettle.sdk.headless.HeadlessActionRegistryImpl$execute$1(this, continuation);
        java.lang.Object obj2 = headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = headlessActionRegistryImpl$execute$1.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.zettle.sdk.headless.HeadlessActionRegistry
    public final java.util.Set<kotlin.reflect.KClass<? extends com.zettle.sdk.headless.HeadlessAction<?>>> getCapabilities() {
        java.util.Set<kotlin.reflect.KClass<? extends com.zettle.sdk.headless.HeadlessAction<?>>> set;
        synchronized (this) {
            set = kotlin.collections.CollectionsKt.toSet(this.getHighResolutionOutputSizeshNQ4ISI.keySet());
        }
        return set;
    }
}
