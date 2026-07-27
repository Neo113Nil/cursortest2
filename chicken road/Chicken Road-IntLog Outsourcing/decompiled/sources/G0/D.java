package G0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0326e;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class D extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f748e;

    /* renamed from: f, reason: collision with root package name */
    public final z f749f;

    public D(WeakReference weakReference, z zVar) {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback", 2);
        this.f748e = weakReference;
        this.f749f = zVar;
    }

    @Override // A1.a
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC0326e.a(parcel, Bundle.CREATOR);
        AbstractC0326e.b(parcel);
        z zVar = this.f749f;
        if (bundle == null) {
            zVar.send(6, null);
        } else if (bundle.containsKey("RESPONSE_CODE")) {
            int a6 = AbstractC0357o0.a(bundle, "BillingClient");
            if (a6 != 0) {
                AbstractC0357o0.g("BillingClient", "Unable to launch intent for alternative billing only dialog" + a6);
                zVar.send(a6, bundle);
            } else {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                if (pendingIntent == null) {
                    AbstractC0357o0.f("BillingClient", "User has acknowledged the alternative billing only dialog before.");
                    zVar.send(0, bundle);
                } else {
                    try {
                        Activity activity = (Activity) this.f748e.get();
                        Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
                        intent.putExtra("alternative_billing_only_dialog_result_receiver", zVar);
                        intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
                        activity.startActivity(intent);
                    } catch (RuntimeException e3) {
                        AbstractC0357o0.h("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e3);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("RESPONSE_CODE", 6);
                        bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
                        bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
                        String name = e3.getClass().getName();
                        String message = e3.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
                        zVar.send(6, bundle2);
                    }
                }
            }
        } else {
            AbstractC0357o0.g("BillingClient", "Response bundle doesn't contain a response code");
            zVar.send(6, bundle);
        }
        return true;
    }
}
