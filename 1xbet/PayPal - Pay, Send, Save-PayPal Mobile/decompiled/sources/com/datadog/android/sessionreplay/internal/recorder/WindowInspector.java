package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R!\u0010\u0014\u001a\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00110\u00118CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00018CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;", "", "<init>", "()V", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "", "Landroid/view/View;", "getGlobalWindowViews", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)Ljava/util/List;", "globalWmInstance", "Ljava/lang/reflect/Field;", "viewsField", "getGlobalWindowViewsLegacy$dd_sdk_android_session_replay_release", "(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/util/List;", "Ljava/lang/Class;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WindowInspector {
    public static final com.datadog.android.sessionreplay.internal.recorder.WindowInspector INSTANCE = new com.datadog.android.sessionreplay.internal.recorder.WindowInspector();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Class<?>>() { // from class: com.datadog.android.sessionreplay.internal.recorder.WindowInspector$GLOBAL_WM_CLASS$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final java.lang.Class<?> invoke() {
            return java.lang.Class.forName("android.view.WindowManagerGlobal");
        }
    });

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.sessionreplay.internal.recorder.WindowInspector$GLOBAL_WM_INSTANCE$2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.lang.reflect.Method method;
            java.lang.Class access$getGLOBAL_WM_CLASS = com.datadog.android.sessionreplay.internal.recorder.WindowInspector.access$getGLOBAL_WM_CLASS(com.datadog.android.sessionreplay.internal.recorder.WindowInspector.INSTANCE);
            if (access$getGLOBAL_WM_CLASS == null || (method = access$getGLOBAL_WM_CLASS.getMethod("getInstance", new java.lang.Class[0])) == null) {
                return null;
            }
            return method.invoke(null, new java.lang.Object[0]);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlin.Lazy getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.reflect.Field>() { // from class: com.datadog.android.sessionreplay.internal.recorder.WindowInspector$VIEWS_FIELD$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.Field invoke() {
            java.lang.Class access$getGLOBAL_WM_CLASS = com.datadog.android.sessionreplay.internal.recorder.WindowInspector.access$getGLOBAL_WM_CLASS(com.datadog.android.sessionreplay.internal.recorder.WindowInspector.INSTANCE);
            if (access$getGLOBAL_WM_CLASS != null) {
                return access$getGLOBAL_WM_CLASS.getDeclaredField("mViews");
            }
            return null;
        }
    });

    private WindowInspector() {
    }

    public static /* synthetic */ java.util.List getGlobalWindowViews$default(com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            buildSdkVersionProvider = com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT();
        }
        return windowInspector.getGlobalWindowViews(internalLogger, buildSdkVersionProvider);
    }

    public final java.util.List<android.view.View> getGlobalWindowViews(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        try {
            if (buildSdkVersionProvider.getIsAtLeastQ()) {
                java.util.List<android.view.View> globalWindowViews = android.view.inspector.WindowInspector.getGlobalWindowViews();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(globalWindowViews, "");
                return globalWindowViews;
            }
            return getGlobalWindowViewsLegacy$dd_sdk_android_session_replay_release(getHighResolutionOutputSizeshNQ4ISI.getValue(), (java.lang.reflect.Field) getHighSpeedVideoSizes.getValue());
        } catch (java.lang.Throwable th) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.WindowInspector$getGlobalWindowViews$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "SR WindowInspector failed to retrieve the decor views";
                }
            }, th, true, (java.util.Map) null, 32, (java.lang.Object) null);
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    public final java.util.List<android.view.View> getGlobalWindowViewsLegacy$dd_sdk_android_session_replay_release(java.lang.Object globalWmInstance, java.lang.reflect.Field viewsField) throws java.lang.NoSuchFieldException, java.lang.NullPointerException, java.lang.SecurityException, java.lang.LinkageError, java.lang.ClassNotFoundException, java.lang.ExceptionInInitializerError {
        if (globalWmInstance != null && viewsField != null) {
            viewsField.setAccessible(true);
            java.lang.Object obj = viewsField.get(globalWmInstance);
            if (!(obj instanceof java.util.List)) {
                if (obj instanceof java.lang.Object[]) {
                    java.util.List list = kotlin.collections.ArraysKt.toList((java.lang.Object[]) obj);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        android.view.View view = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
                        if (view != null) {
                            arrayList.add(view);
                        }
                    }
                    return arrayList;
                }
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : (java.lang.Iterable) obj) {
                android.view.View view2 = obj3 instanceof android.view.View ? (android.view.View) obj3 : null;
                if (view2 != null) {
                    arrayList2.add(view2);
                }
            }
            return arrayList2;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final /* synthetic */ java.lang.Class access$getGLOBAL_WM_CLASS(com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector) {
        return (java.lang.Class) getHighSpeedVideoFpsRanges.getValue();
    }
}
