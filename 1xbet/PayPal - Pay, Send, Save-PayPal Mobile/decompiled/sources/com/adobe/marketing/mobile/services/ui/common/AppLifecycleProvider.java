package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0017\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$AppLifecycleListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerListener$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$AppLifecycleListener;)V", "Landroid/app/Application;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "start$core_phoneRelease", "(Landroid/app/Application;)V", "stop$core_phoneRelease", "unregisterListener$core_phoneRelease", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "Companion", "AppLifecycleListener", "InternalAppLifecycleListener"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AppLifecycleProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.Companion INSTANCE = new com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.Companion(null);
    private static final kotlin.Lazy<com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider> INSTANCE$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider>() { // from class: com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider$Companion$INSTANCE$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider invoke() {
            return new com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider(null);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.AppLifecycleListener> Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$AppLifecycleListener;", "", "Landroid/app/Activity;", "activity", "", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityResumed"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface AppLifecycleListener {
        void onActivityDestroyed(android.app.Activity activity);

        void onActivityResumed(android.app.Activity activity);
    }

    private AppLifecycleProvider() {
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashSet();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "INSTANCE$delegate", "Lkotlin/Lazy;", "getINSTANCE", "()Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "INSTANCE"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider getINSTANCE() {
            return (com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider) com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.INSTANCE$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void start$core_phoneRelease(android.app.Application app2) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            app2.registerActivityLifecycleCallbacks(new com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.InternalAppLifecycleListener(this));
        }
    }

    public final void registerListener$core_phoneRelease(com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.AppLifecycleListener listener) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            this.Camera2StreamConfigurationMap.add(listener);
        }
    }

    public final void unregisterListener$core_phoneRelease(com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.AppLifecycleListener listener) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            this.Camera2StreamConfigurationMap.remove(listener);
        }
    }

    public final void stop$core_phoneRelease(android.app.Application app2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizes = false;
            app2.unregisterActivityLifecycleCallbacks(new com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.InternalAppLifecycleListener(this));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$InternalAppLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "p0", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;)V", "Landroid/app/Activity;", "Landroid/os/Bundle;", "p1", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "getHighSpeedVideoFpsRanges", "Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class InternalAppLifecycleListener implements android.app.Application.ActivityLifecycleCallbacks {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider getHighSpeedVideoSizes;

        public InternalAppLifecycleListener(com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider appLifecycleProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleProvider, "");
            this.getHighSpeedVideoSizes = appLifecycleProvider;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.Iterator it = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                ((com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.AppLifecycleListener) it.next()).onActivityResumed(p0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.Iterator it = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                ((com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.AppLifecycleListener) it.next()).onActivityDestroyed(p0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity p0, android.os.Bundle p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    public /* synthetic */ AppLifecycleProvider(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
