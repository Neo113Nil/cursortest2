package m0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractBinderC0169a;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0182e;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import java.lang.ref.WeakReference;

/* renamed from: m0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1111B extends AbstractBinderC0169a {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f9939d;

    /* renamed from: e, reason: collision with root package name */
    public final x f9940e;

    public BinderC1111B(WeakReference weakReference, x xVar) {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback", 1);
        this.f9939d = weakReference;
        this.f9940e = xVar;
    }

    @Override // c1.AbstractBinderC0169a
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC0182e.a(parcel);
        AbstractC0182e.b(parcel);
        x xVar = this.f9940e;
        if (bundle == null) {
            xVar.send(6, null);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            AbstractC0213o0.g("BillingClient", "Response bundle doesn't contain a response code");
            xVar.send(6, bundle);
            return true;
        }
        int a3 = AbstractC0213o0.a(bundle, "BillingClient");
        if (a3 != 0) {
            AbstractC0213o0.g("BillingClient", "Unable to launch intent for alternative billing only dialog" + a3);
            xVar.send(a3, bundle);
            return true;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            AbstractC0213o0.f("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            xVar.send(0, bundle);
            return true;
        }
        try {
            Activity activity = (Activity) this.f9939d.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", xVar);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
            return true;
        } catch (RuntimeException e3) {
            AbstractC0213o0.h("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e3);
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
            xVar.send(6, bundle2);
            return true;
        }
    }
}
