package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroidx/metrics/performance/JankStats$OnFrameListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Landroidx/metrics/performance/JankStats;", "createJankStatsAndTrack", "(Landroid/view/Window;Landroidx/metrics/performance/JankStats$OnFrameListener;Lcom/datadog/android/api/InternalLogger;)Landroidx/metrics/performance/JankStats;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface JankStatsProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.vitals.JankStatsProvider.Companion INSTANCE = com.datadog.android.rum.internal.vitals.JankStatsProvider.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.metrics.performance.JankStats createJankStatsAndTrack(android.view.Window window, androidx.metrics.performance.JankStats.OnFrameListener listener, com.datadog.android.api.InternalLogger internalLogger);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/JankStatsProvider$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "DEFAULT", "Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "getDEFAULT", "()Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.rum.internal.vitals.JankStatsProvider.Companion getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.rum.internal.vitals.JankStatsProvider.Companion();
        private static final com.datadog.android.rum.internal.vitals.JankStatsProvider DEFAULT = new com.datadog.android.rum.internal.vitals.JankStatsProvider() { // from class: com.datadog.android.rum.internal.vitals.JankStatsProvider$Companion$DEFAULT$1
            @Override // com.datadog.android.rum.internal.vitals.JankStatsProvider
            public final androidx.metrics.performance.JankStats createJankStatsAndTrack(android.view.Window window, androidx.metrics.performance.JankStats.OnFrameListener listener, com.datadog.android.api.InternalLogger internalLogger) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
                try {
                    return androidx.metrics.performance.JankStats.INSTANCE.createAndTrack(window, listener);
                } catch (java.lang.IllegalStateException e) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsProvider$Companion$DEFAULT$1$createJankStatsAndTrack$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "Unable to attach JankStats to the current window";
                        }
                    }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                    return null;
                }
            }
        };

        private Companion() {
        }

        public final com.datadog.android.rum.internal.vitals.JankStatsProvider getDEFAULT() {
            return DEFAULT;
        }
    }
}
