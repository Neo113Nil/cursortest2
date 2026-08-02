package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118'X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/ui/SdkViewModel;", "", "Lcom/zettle/sdk/ui/ZettleResult;", "withResult", "", "finish", "(Lcom/zettle/sdk/ui/ZettleResult;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "prepareResult", "Lcom/zettle/sdk/features/Action;", "getAction", "()Lcom/zettle/sdk/features/Action;", "action", "Lcom/zettle/sdk/features/FeatureConf;", "getFeature", "()Lcom/zettle/sdk/features/FeatureConf;", "feature", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "getIntent$annotations", "()V", "intent"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SdkViewModel {
    void finish(com.zettle.sdk.ui.ZettleResult withResult);

    com.zettle.sdk.features.Action getAction();

    com.zettle.sdk.features.FeatureConf getFeature();

    android.content.Intent getIntent();

    void prepareResult(com.zettle.sdk.ui.ZettleResult value);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(message = "Only use publicly during migration")
        public static /* synthetic */ void getIntent$annotations() {
        }

        public static /* synthetic */ void finish$default(com.zettle.sdk.ui.SdkViewModel sdkViewModel, com.zettle.sdk.ui.ZettleResult zettleResult, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finish");
            }
            if ((i & 1) != 0) {
                zettleResult = null;
            }
            sdkViewModel.finish(zettleResult);
        }
    }
}
