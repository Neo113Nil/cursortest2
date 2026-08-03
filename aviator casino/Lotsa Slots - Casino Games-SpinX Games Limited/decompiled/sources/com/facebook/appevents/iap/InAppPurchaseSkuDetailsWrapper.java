package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B=\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ$\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "", "skuDetailsParamsClazz", "Ljava/lang/Class;", "builderClazz", "newBuilderMethod", "Ljava/lang/reflect/Method;", "setTypeMethod", "setSkusListMethod", "buildMethod", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getSkuDetailsParamsClazz", "()Ljava/lang/Class;", "getSkuDetailsParams", "skuType", "", "skuIDs", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseSkuDetailsWrapper {
    private static final java.lang.String CLASSNAME_SKU_DETAILS_PARAMS = "com.android.billingclient.api.SkuDetailsParams";
    private static final java.lang.String CLASSNAME_SKU_DETAILS_PARAMS_BUILDER = "com.android.billingclient.api.SkuDetailsParams$Builder";
    private static final java.lang.String METHOD_BUILD = "build";
    private static final java.lang.String METHOD_NEW_BUILDER = "newBuilder";
    private static final java.lang.String METHOD_SET_SKU_LIST = "setSkusList";
    private static final java.lang.String METHOD_SET_TYPE = "setType";
    private static com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper instance;
    private final java.lang.reflect.Method buildMethod;
    private final java.lang.Class<?> builderClazz;
    private final java.lang.reflect.Method newBuilderMethod;
    private final java.lang.reflect.Method setSkusListMethod;
    private final java.lang.reflect.Method setTypeMethod;
    private final java.lang.Class<?> skuDetailsParamsClazz;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.Companion INSTANCE = new com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.Companion(null);
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return INSTANCE.getOrCreateInstance();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    public InAppPurchaseSkuDetailsWrapper(java.lang.Class<?> skuDetailsParamsClazz, java.lang.Class<?> builderClazz, java.lang.reflect.Method newBuilderMethod, java.lang.reflect.Method setTypeMethod, java.lang.reflect.Method setSkusListMethod, java.lang.reflect.Method buildMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.skuDetailsParamsClazz = skuDetailsParamsClazz;
        this.builderClazz = builderClazz;
        this.newBuilderMethod = newBuilderMethod;
        this.setTypeMethod = setTypeMethod;
        this.setSkusListMethod = setSkusListMethod;
        this.buildMethod = buildMethod;
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$getInitialized$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return initialized;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper access$getInstance$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return instance;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class)) {
            return;
        }
        try {
            instance = inAppPurchaseSkuDetailsWrapper;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.class);
        }
    }

    public final java.lang.Class<?> getSkuDetailsParamsClazz() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final java.lang.Object getSkuDetailsParams(java.lang.String skuType, java.util.List<java.lang.String> skuIDs) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.skuDetailsParamsClazz, this.newBuilderMethod, null, new java.lang.Object[0]);
            if (invokeMethod == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod2 = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setTypeMethod, invokeMethod, skuType);
            if (invokeMethod2 == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils3 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Object invokeMethod3 = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setSkusListMethod, invokeMethod2, skuIDs);
            if (invokeMethod3 == null) {
                return null;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils4 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            return com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(this.builderClazz, this.buildMethod, invokeMethod3, new java.lang.Object[0]);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper$Companion;", "", "()V", "CLASSNAME_SKU_DETAILS_PARAMS", "", "CLASSNAME_SKU_DETAILS_PARAMS_BUILDER", "METHOD_BUILD", "METHOD_NEW_BUILDER", "METHOD_SET_SKU_LIST", "METHOD_SET_TYPE", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.ironsource.C3232q2.p, "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "createInstance", "", "getOrCreateInstance", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
            if (com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.access$getInitialized$cp().get()) {
                return com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
            }
            createInstance();
            com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.access$getInitialized$cp().set(true);
            return com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
        }

        private final void createInstance() {
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils2 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.Class<?> cls2 = com.facebook.appevents.iap.InAppPurchaseUtils.getClass(com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS_BUILDER);
            if (cls == null || cls2 == null) {
                return;
            }
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils3 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls, "newBuilder", new java.lang.Class[0]);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils4 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method2 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls2, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.METHOD_SET_TYPE, java.lang.String.class);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils5 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method3 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls2, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.METHOD_SET_SKU_LIST, java.util.List.class);
            com.facebook.appevents.iap.InAppPurchaseUtils inAppPurchaseUtils6 = com.facebook.appevents.iap.InAppPurchaseUtils.INSTANCE;
            java.lang.reflect.Method method4 = com.facebook.appevents.iap.InAppPurchaseUtils.getMethod(cls2, com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.METHOD_BUILD, new java.lang.Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null) {
                return;
            }
            com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper.access$setInstance$cp(new com.facebook.appevents.iap.InAppPurchaseSkuDetailsWrapper(cls, cls2, method, method2, method3, method4));
        }
    }
}
