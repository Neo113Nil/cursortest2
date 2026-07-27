package m0;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114b {

    /* renamed from: a, reason: collision with root package name */
    public volatile C1122j f10007a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10008b;

    /* renamed from: c, reason: collision with root package name */
    public volatile r f10009c;

    /* renamed from: d, reason: collision with root package name */
    public volatile G0.j f10010d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10011e;

    public /* synthetic */ C1114b(Context context) {
        this.f10008b = context;
    }

    public final C1116d a() {
        if (this.f10008b == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (this.f10009c == null) {
            if (this.f10010d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (!this.f10011e) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            Context context = this.f10008b;
            return b() ? new J(context) : new C1116d(context);
        }
        if (this.f10007a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        this.f10007a.getClass();
        if (this.f10009c == null) {
            C1122j c1122j = this.f10007a;
            Context context2 = this.f10008b;
            return b() ? new J(c1122j, context2) : new C1116d(c1122j, context2);
        }
        if (this.f10010d == null) {
            C1122j c1122j2 = this.f10007a;
            Context context3 = this.f10008b;
            r rVar = this.f10009c;
            return b() ? new J(c1122j2, context3, rVar) : new C1116d(c1122j2, context3, rVar);
        }
        C1122j c1122j3 = this.f10007a;
        Context context4 = this.f10008b;
        r rVar2 = this.f10009c;
        G0.j jVar = this.f10010d;
        return b() ? new J(c1122j3, context4, rVar2, jVar) : new C1116d(c1122j3, context4, rVar2, jVar);
    }

    public final boolean b() {
        Context context = this.f10008b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e3) {
            AbstractC0213o0.h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e3);
            return false;
        }
    }
}
