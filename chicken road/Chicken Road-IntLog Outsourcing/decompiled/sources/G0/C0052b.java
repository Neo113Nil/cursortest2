package G0;

import M2.C0097a;
import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;

/* renamed from: G0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052b {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0062l f814a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f815b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC0069t f816c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0097a f817d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f818e;

    public /* synthetic */ C0052b(Context context) {
        this.f815b = context;
    }

    public final C0054d a() {
        if (this.f815b == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (this.f816c == null) {
            if (this.f817d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (!this.f818e) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            Context context = this.f815b;
            return b() ? new J(context) : new C0054d(context);
        }
        if (this.f814a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        this.f814a.getClass();
        if (this.f816c == null) {
            C0062l c0062l = this.f814a;
            Context context2 = this.f815b;
            return b() ? new J(c0062l, context2) : new C0054d(c0062l, context2);
        }
        if (this.f817d == null) {
            C0062l c0062l2 = this.f814a;
            Context context3 = this.f815b;
            InterfaceC0069t interfaceC0069t = this.f816c;
            return b() ? new J(c0062l2, context3, interfaceC0069t) : new C0054d(c0062l2, context3, interfaceC0069t);
        }
        C0062l c0062l3 = this.f814a;
        Context context4 = this.f815b;
        InterfaceC0069t interfaceC0069t2 = this.f816c;
        C0097a c0097a = this.f817d;
        return b() ? new J(c0062l3, context4, interfaceC0069t2, c0097a) : new C0054d(c0062l3, context4, interfaceC0069t2, c0097a);
    }

    public final boolean b() {
        Context context = this.f815b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e3) {
            AbstractC0357o0.h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e3);
            return false;
        }
    }
}
