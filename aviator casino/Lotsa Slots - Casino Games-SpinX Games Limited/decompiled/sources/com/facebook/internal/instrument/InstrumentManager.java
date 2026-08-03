package com.facebook.internal.instrument;

/* compiled from: InstrumentManager.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentManager;", "", "()V", "start", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentManager {
    public static final com.facebook.internal.instrument.InstrumentManager INSTANCE = new com.facebook.internal.instrument.InstrumentManager();

    private InstrumentManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void start() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.CrashReport, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.internal.instrument.InstrumentManager$$ExternalSyntheticLambda0
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.internal.instrument.InstrumentManager.m5208start$lambda0(z);
                }
            });
            com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.ErrorReport, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.internal.instrument.InstrumentManager$$ExternalSyntheticLambda1
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.internal.instrument.InstrumentManager.m5209start$lambda1(z);
                }
            });
            com.facebook.internal.FeatureManager featureManager3 = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.AnrReport, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.internal.instrument.InstrumentManager$$ExternalSyntheticLambda2
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.internal.instrument.InstrumentManager.m5210start$lambda2(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-0, reason: not valid java name */
    public static final void m5208start$lambda0(boolean z) {
        if (z) {
            com.facebook.internal.instrument.crashreport.CrashHandler.INSTANCE.enable();
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.CrashShield)) {
                com.facebook.internal.instrument.ExceptionAnalyzer exceptionAnalyzer = com.facebook.internal.instrument.ExceptionAnalyzer.INSTANCE;
                com.facebook.internal.instrument.ExceptionAnalyzer.enable();
                com.facebook.internal.instrument.crashshield.CrashShieldHandler crashShieldHandler = com.facebook.internal.instrument.crashshield.CrashShieldHandler.INSTANCE;
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.enable();
            }
            com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
            if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.ThreadCheck)) {
                com.facebook.internal.instrument.threadcheck.ThreadCheckHandler threadCheckHandler = com.facebook.internal.instrument.threadcheck.ThreadCheckHandler.INSTANCE;
                com.facebook.internal.instrument.threadcheck.ThreadCheckHandler.enable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-1, reason: not valid java name */
    public static final void m5209start$lambda1(boolean z) {
        if (z) {
            com.facebook.internal.instrument.errorreport.ErrorReportHandler errorReportHandler = com.facebook.internal.instrument.errorreport.ErrorReportHandler.INSTANCE;
            com.facebook.internal.instrument.errorreport.ErrorReportHandler.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-2, reason: not valid java name */
    public static final void m5210start$lambda2(boolean z) {
        if (z) {
            com.facebook.internal.instrument.anrreport.ANRHandler aNRHandler = com.facebook.internal.instrument.anrreport.ANRHandler.INSTANCE;
            com.facebook.internal.instrument.anrreport.ANRHandler.enable();
        }
    }
}
