package w1;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: w1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1757x extends AbstractC1765z1 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17915A;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f17916B;

    /* renamed from: z, reason: collision with root package name */
    public String f17917z;

    public C1757x() {
        super(AbstractC1753v1.a(EnumC1747t1.f17865c), false);
        this.f17916B = new AtomicBoolean(false);
        this.f17917z = "";
        this.f17915A = false;
    }

    public final void h() {
        try {
            Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, AbstractC1707i1.f17743c);
            this.f17917z = (String) AdvertisingIdClient.Info.class.getMethod("getId", null).invoke(invoke, null);
            Boolean bool = (Boolean) AdvertisingIdClient.Info.class.getMethod("isLimitAdTrackingEnabled", null).invoke(invoke, null);
            this.f17915A = (bool == null || bool.booleanValue()) ? false : true;
            this.f17916B.set(true);
            AbstractC1707i1.g("advertising_id", this.f17917z);
            boolean z4 = true ^ this.f17915A;
            try {
                SharedPreferences.Editor edit = AbstractC1707i1.f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
                edit.putBoolean("com.flurry.sdk.".concat("ad_tracking_enabled"), z4);
                edit.apply();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            AbstractC1706i0.o(5, "Google Play services is not available: " + th.getMessage());
            AbstractC1706i0.o(5, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library is recommended to be integrated in any app shipping in the Play Store that uses analytics or advertising.");
        }
    }
}
