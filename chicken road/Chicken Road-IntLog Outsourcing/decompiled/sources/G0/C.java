package G0;

import M2.C0101e;
import M2.C0103g;
import M2.C0104h;
import M2.C0108l;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC0326e;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import n2.AbstractC1341c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class C extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f744e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final B0.l f745f;

    /* renamed from: g, reason: collision with root package name */
    public final int f746g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f747h;

    public C(D3.g gVar, B0.l lVar, int i2) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback", 2);
        this.f747h = gVar;
        this.f745f = lVar;
        this.f746g = i2;
    }

    @Override // A1.a
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        switch (this.f744e) {
            case 0:
                if (i2 != 1) {
                    return false;
                }
                Bundle bundle = (Bundle) AbstractC0326e.a(parcel, Bundle.CREATOR);
                AbstractC0326e.b(parcel);
                int i3 = this.f746g;
                B0.l lVar = this.f745f;
                D3.g gVar = (D3.g) this.f747h;
                if (bundle == null) {
                    C0060j c0060j = O.f779i;
                    lVar.j(M.b(71, 15, c0060j), i3);
                    gVar.g(c0060j);
                    return true;
                }
                int a6 = AbstractC0357o0.a(bundle, "BillingClient");
                C0060j a7 = O.a(a6, AbstractC0357o0.e(bundle, "BillingClient"));
                if (a6 != 0) {
                    AbstractC0357o0.g("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + a6);
                    lVar.j(M.b(23, 15, a7), i3);
                    gVar.g(a7);
                    return true;
                }
                try {
                    String optString = new JSONObject(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")).optString("externalTransactionToken");
                    gVar.getClass();
                    M2.r j2 = AbstractC1341c.j(a7);
                    C0108l c0108l = new C0108l();
                    c0108l.f1880a = j2;
                    if (optString == null) {
                        throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                    }
                    c0108l.f1881b = optString;
                    ((C0101e) gVar.f448b).a(c0108l);
                    return true;
                } catch (JSONException e3) {
                    AbstractC0357o0.h("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e3);
                    C0060j c0060j2 = O.f779i;
                    lVar.j(M.b(72, 15, c0060j2), i3);
                    gVar.g(c0060j2);
                    return true;
                }
            case 1:
                if (i2 != 1) {
                    return false;
                }
                Bundle bundle2 = (Bundle) AbstractC0326e.a(parcel, Bundle.CREATOR);
                AbstractC0326e.b(parcel);
                int i6 = this.f746g;
                B0.l lVar2 = this.f745f;
                D3.g gVar2 = (D3.g) this.f747h;
                if (bundle2 == null) {
                    C0060j c0060j3 = O.f779i;
                    lVar2.j(M.b(63, 13, c0060j3), i6);
                    gVar2.h(c0060j3);
                } else {
                    int a8 = AbstractC0357o0.a(bundle2, "BillingClient");
                    String e6 = AbstractC0357o0.e(bundle2, "BillingClient");
                    C0058h b6 = C0060j.b();
                    b6.f854a = a8;
                    b6.f855b = e6;
                    if (a8 != 0) {
                        AbstractC0357o0.g("BillingClient", "getBillingConfig() failed. Response code: " + a8);
                        C0060j a9 = b6.a();
                        lVar2.j(M.b(23, 13, a9), i6);
                        gVar2.h(a9);
                    } else if (bundle2.containsKey("BILLING_CONFIG")) {
                        try {
                            String optString2 = new JSONObject(bundle2.getString("BILLING_CONFIG")).optString("countryCode");
                            C0060j a10 = b6.a();
                            gVar2.getClass();
                            M2.r j6 = AbstractC1341c.j(a10);
                            M2.o oVar = new M2.o();
                            oVar.f1886a = j6;
                            if (optString2 == null) {
                                throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
                            }
                            oVar.f1887b = optString2;
                            ((C0103g) gVar2.f448b).a(oVar);
                        } catch (JSONException e7) {
                            AbstractC0357o0.h("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e7);
                            C0060j c0060j4 = O.f779i;
                            lVar2.j(M.b(65, 13, c0060j4), i6);
                            gVar2.h(c0060j4);
                        }
                    } else {
                        AbstractC0357o0.g("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        b6.f854a = 6;
                        C0060j a11 = b6.a();
                        lVar2.j(M.b(64, 13, a11), i6);
                        gVar2.h(a11);
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i2 != 1) {
                    return false;
                }
                Bundle bundle3 = (Bundle) AbstractC0326e.a(parcel, Bundle.CREATOR);
                AbstractC0326e.b(parcel);
                D3.g gVar3 = (D3.g) this.f747h;
                int i7 = this.f746g;
                B0.l lVar3 = this.f745f;
                if (bundle3 == null) {
                    C0060j c0060j5 = O.f779i;
                    lVar3.j(M.b(67, 14, c0060j5), i7);
                    gVar3.getClass();
                    ((C0104h) gVar3.f448b).a(AbstractC1341c.j(c0060j5));
                    return true;
                }
                int a12 = AbstractC0357o0.a(bundle3, "BillingClient");
                C0060j a13 = O.a(a12, AbstractC0357o0.e(bundle3, "BillingClient"));
                if (a12 != 0) {
                    AbstractC0357o0.g("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + a12);
                    lVar3.j(M.b(23, 14, a13), i7);
                }
                gVar3.getClass();
                ((C0104h) gVar3.f448b).a(AbstractC1341c.j(a13));
                return true;
        }
    }

    public C(D3.g gVar, B0.l lVar, int i2, byte b6) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 2);
        this.f747h = gVar;
        this.f745f = lVar;
        this.f746g = i2;
    }

    public C(D3.g gVar, B0.l lVar, int i2, char c2) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback", 2);
        this.f747h = gVar;
        this.f745f = lVar;
        this.f746g = i2;
    }
}
