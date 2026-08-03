package com.facebook.appevents;

/* compiled from: AppEventsManager.kt */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/appevents/AppEventsManager$start$1", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "onError", "", "onSuccess", "fetchedAppSettings", "Lcom/facebook/internal/FetchedAppSettings;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsManager$start$1 implements com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback {
    @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
    public void onError() {
    }

    AppEventsManager$start$1() {
    }

    @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
    public void onSuccess(com.facebook.internal.FetchedAppSettings fetchedAppSettings) {
        com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.AAM, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda0
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5093onSuccess$lambda0(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.RestrictiveDataFiltering, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda3
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5094onSuccess$lambda1(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager3 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.PrivacyProtection, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda4
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5096onSuccess$lambda2(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager4 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.EventDeactivation, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda5
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5097onSuccess$lambda3(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager5 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.IapLogging, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda6
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5098onSuccess$lambda4(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager6 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.ProtectedMode, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda7
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5099onSuccess$lambda5(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager7 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.MACARuleMatching, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda8
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5100onSuccess$lambda6(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager8 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.BlocklistEvents, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda9
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5101onSuccess$lambda7(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager9 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.FilterRedactedEvents, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda10
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5102onSuccess$lambda8(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager10 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.FilterSensitiveParams, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda1
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5103onSuccess$lambda9(z);
            }
        });
        com.facebook.internal.FeatureManager featureManager11 = com.facebook.internal.FeatureManager.INSTANCE;
        com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.CloudBridge, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.AppEventsManager$start$1$$ExternalSyntheticLambda2
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                com.facebook.appevents.AppEventsManager$start$1.m5095onSuccess$lambda10(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-0, reason: not valid java name */
    public static final void m5093onSuccess$lambda0(boolean z) {
        if (z) {
            com.facebook.appevents.aam.MetadataIndexer metadataIndexer = com.facebook.appevents.aam.MetadataIndexer.INSTANCE;
            com.facebook.appevents.aam.MetadataIndexer.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-1, reason: not valid java name */
    public static final void m5094onSuccess$lambda1(boolean z) {
        if (z) {
            com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager restrictiveDataManager = com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.INSTANCE;
            com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-2, reason: not valid java name */
    public static final void m5096onSuccess$lambda2(boolean z) {
        if (z) {
            com.facebook.appevents.ml.ModelManager modelManager = com.facebook.appevents.ml.ModelManager.INSTANCE;
            com.facebook.appevents.ml.ModelManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-3, reason: not valid java name */
    public static final void m5097onSuccess$lambda3(boolean z) {
        if (z) {
            com.facebook.appevents.eventdeactivation.EventDeactivationManager eventDeactivationManager = com.facebook.appevents.eventdeactivation.EventDeactivationManager.INSTANCE;
            com.facebook.appevents.eventdeactivation.EventDeactivationManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-4, reason: not valid java name */
    public static final void m5098onSuccess$lambda4(boolean z) {
        if (z) {
            com.facebook.appevents.iap.InAppPurchaseManager inAppPurchaseManager = com.facebook.appevents.iap.InAppPurchaseManager.INSTANCE;
            com.facebook.appevents.iap.InAppPurchaseManager.enableAutoLogging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-5, reason: not valid java name */
    public static final void m5099onSuccess$lambda5(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.ProtectedModeManager protectedModeManager = com.facebook.appevents.integrity.ProtectedModeManager.INSTANCE;
            com.facebook.appevents.integrity.ProtectedModeManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-6, reason: not valid java name */
    public static final void m5100onSuccess$lambda6(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.MACARuleMatchingManager mACARuleMatchingManager = com.facebook.appevents.integrity.MACARuleMatchingManager.INSTANCE;
            com.facebook.appevents.integrity.MACARuleMatchingManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-7, reason: not valid java name */
    public static final void m5101onSuccess$lambda7(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.BlocklistEventsManager blocklistEventsManager = com.facebook.appevents.integrity.BlocklistEventsManager.INSTANCE;
            com.facebook.appevents.integrity.BlocklistEventsManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-8, reason: not valid java name */
    public static final void m5102onSuccess$lambda8(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.RedactedEventsManager redactedEventsManager = com.facebook.appevents.integrity.RedactedEventsManager.INSTANCE;
            com.facebook.appevents.integrity.RedactedEventsManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-9, reason: not valid java name */
    public static final void m5103onSuccess$lambda9(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.SensitiveParamsManager sensitiveParamsManager = com.facebook.appevents.integrity.SensitiveParamsManager.INSTANCE;
            com.facebook.appevents.integrity.SensitiveParamsManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-10, reason: not valid java name */
    public static final void m5095onSuccess$lambda10(boolean z) {
        if (z) {
            com.facebook.appevents.cloudbridge.AppEventsCAPIManager appEventsCAPIManager = com.facebook.appevents.cloudbridge.AppEventsCAPIManager.INSTANCE;
            com.facebook.appevents.cloudbridge.AppEventsCAPIManager.enable();
        }
    }
}
