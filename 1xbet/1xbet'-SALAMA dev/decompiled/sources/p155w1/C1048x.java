package p155w1;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: w1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048x extends AbstractC1056z1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f17921A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f17922B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f17923z;

    public C1048x() {
        super(AbstractC1044v1.a(EnumC1038t1.f17871c), false);
        this.f17922B = new AtomicBoolean(false);
        this.f17923z = "";
        this.f17921A = false;
    }

    public final void h() {
        try {
            Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, AbstractC0998i1.f17749c);
            this.f17923z = (String) AdvertisingIdClient.Info.class.getMethod("getId", null).invoke(objInvoke, null);
            Boolean bool = (Boolean) AdvertisingIdClient.Info.class.getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
            this.f17921A = (bool == null || bool.booleanValue()) ? false : true;
            this.f17922B.set(true);
            AbstractC0998i1.g("advertising_id", this.f17923z);
            boolean z4 = true ^ this.f17921A;
            try {
                SharedPreferences.Editor editorEdit = AbstractC0998i1.f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
                editorEdit.putBoolean("com.flurry.sdk.".concat("ad_tracking_enabled"), z4);
                editorEdit.apply();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            AbstractC0997i0.o(5, "Google Play services is not available: " + th.getMessage());
            AbstractC0997i0.o(5, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library is recommended to be integrated in any app shipping in the Play Store that uses analytics or advertising.");
        }
    }
}
