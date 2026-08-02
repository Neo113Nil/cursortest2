package com.paypal.android.threeds.interfaces;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0014À\u0006\u0003"}, d2 = {"Lcom/paypal/android/threeds/interfaces/Transaction;", "", "Lcom/paypal/android/threeds/data/model/AuthenticationRequestParameters;", "getAuthenticationRequestParameters", "()Lcom/paypal/android/threeds/data/model/AuthenticationRequestParameters;", "Landroid/app/Activity;", "activity", "Lcom/paypal/android/threeds/data/model/ChallengeParameters;", "challengeParameters", "Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;", "challengeStatusReceiver", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "", "doChallenge", "(Landroid/app/Activity;Lcom/paypal/android/threeds/data/model/ChallengeParameters;Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;I)V", "Lcom/paypal/android/threeds/ui/customviews/ProgressDialog;", "getProgressView", "(Landroid/app/Activity;)Lcom/paypal/android/threeds/ui/customviews/ProgressDialog;", "close", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface Transaction {
    void close();

    void doChallenge(android.app.Activity activity, com.paypal.android.threeds.data.model.ChallengeParameters challengeParameters, com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver, int timeout);

    com.paypal.android.threeds.data.model.AuthenticationRequestParameters getAuthenticationRequestParameters();

    com.paypal.android.threeds.ui.customviews.ProgressDialog getProgressView(android.app.Activity activity);
}
