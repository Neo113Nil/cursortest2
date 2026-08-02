package org.betup.services.ads.consent;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AdsConsentManager.kt */
@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lorg/betup/services/ads/consent/AdsConsentManager;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "gatherConsentIfRequired", "", "activity", "Landroid/app/Activity;", "onComplete", "Lkotlin/Function0;", "canRequestAds", "", "logConsentState", "consentInformation", "Lcom/google/android/ump/ConsentInformation;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdsConsentManager {
    public static final int $stable = 0;
    private static final String TAG = "AdsConsentManager";

    private final void logConsentState(ConsentInformation consentInformation) {
    }

    @Inject
    public AdsConsentManager() {
    }

    public final void gatherConsentIfRequired(final Activity activity, final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (activity.isFinishing()) {
            onComplete.invoke();
        } else {
            final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
            consentInformation.requestConsentInfoUpdate(activity, new ConsentRequestParameters.Builder().build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: org.betup.services.ads.consent.AdsConsentManager$$ExternalSyntheticLambda1
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                public final void onConsentInfoUpdateSuccess() {
                    AdsConsentManager.gatherConsentIfRequired$lambda$1(activity, onComplete, consentInformation, this);
                }
            }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: org.betup.services.ads.consent.AdsConsentManager$$ExternalSyntheticLambda2
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                public final void onConsentInfoUpdateFailure(FormError formError) {
                    AdsConsentManager.gatherConsentIfRequired$lambda$2(Function0.this, formError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsentIfRequired$lambda$1(Activity activity, final Function0 function0, final ConsentInformation consentInformation, final AdsConsentManager adsConsentManager) {
        if (activity.isFinishing()) {
            function0.invoke();
        } else {
            if (consentInformation.isConsentFormAvailable()) {
                UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: org.betup.services.ads.consent.AdsConsentManager$$ExternalSyntheticLambda0
                    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                    public final void onConsentFormDismissed(FormError formError) {
                        AdsConsentManager.gatherConsentIfRequired$lambda$1$lambda$0(AdsConsentManager.this, consentInformation, function0, formError);
                    }
                });
                return;
            }
            Intrinsics.checkNotNull(consentInformation);
            adsConsentManager.logConsentState(consentInformation);
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsentIfRequired$lambda$1$lambda$0(AdsConsentManager adsConsentManager, ConsentInformation consentInformation, Function0 function0, FormError formError) {
        if (formError != null) {
            Log.w(TAG, "Consent form error: " + formError.getMessage());
        }
        Intrinsics.checkNotNull(consentInformation);
        adsConsentManager.logConsentState(consentInformation);
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsentIfRequired$lambda$2(Function0 function0, FormError formError) {
        Log.w(TAG, "Consent info update failed: " + formError.getMessage());
        function0.invoke();
    }

    public final boolean canRequestAds(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return UserMessagingPlatform.getConsentInformation(activity).canRequestAds();
    }
}
