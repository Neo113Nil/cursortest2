package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u001dH\u0004¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\"\u0010\u0015\u001a\u00020\u001e8\u0005@\u0005X\u0085.¢\u0006\u0012\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*"}, d2 = {"Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "outState", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V", "T", "Lkotlin/Function1;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "block", "withSdkCore", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getSdkCore", "()Lcom/datadog/android/api/feature/FeatureSdkCore;", "setSdkCore", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ActivityLifecycleTrackingStrategy implements android.app.Application.ActivityLifecycleCallbacks, com.datadog.android.rum.tracking.TrackingStrategy {
    public static final java.lang.String EXTRA_SYNTHETICS_RESULT_ID = "_dd.synthetics.result_id";
    public static final java.lang.String EXTRA_SYNTHETICS_TEST_ID = "_dd.synthetics.test_id";
    protected com.datadog.android.api.feature.FeatureSdkCore sdkCore;

    protected final com.datadog.android.api.feature.FeatureSdkCore getSdkCore() {
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore != null) {
            return featureSdkCore;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    protected final void setSdkCore(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.sdkCore = featureSdkCore;
    }

    public final com.datadog.android.api.InternalLogger getInternalLogger$dd_sdk_android_rum_release() {
        if (this.sdkCore != null) {
            return getSdkCore().getInternalLogger();
        }
        return com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof android.app.Application) {
            setSdkCore((com.datadog.android.api.feature.FeatureSdkCore) sdkCore);
            ((android.app.Application) context).registerActivityLifecycleCallbacks(this);
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(((com.datadog.android.api.feature.FeatureSdkCore) sdkCore).getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy$register$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(android.content.Context context) {
        if (context instanceof android.app.Application) {
            ((android.app.Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        android.content.Intent intent;
        com.datadog.android.rum._RumInternalProxy _getInternal;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.sdkCore == null || (intent = activity.getIntent()) == null || (_getInternal = com.datadog.android.rum.GlobalRumMonitor.get(getSdkCore())._getInternal()) == null) {
            return;
        }
        _getInternal.setSyntheticsAttributeFromIntent(intent);
    }

    protected final <T> T withSdkCore(kotlin.jvm.functions.Function1<? super com.datadog.android.api.feature.FeatureSdkCore, ? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        if (this.sdkCore != null) {
            return block.invoke(getSdkCore());
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy$withSdkCore$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }
}
