package m0;

import Y1.C0081e;
import Y1.C0084h;
import a0.C0087a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractBinderC0169a;
import com.google.android.gms.internal.play_billing.AbstractC0182e;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1110A extends AbstractBinderC0169a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9936d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final V1.b f9937e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9938g;

    public BinderC1110A(F1.b bVar, V1.b bVar2, int i3) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback", 1);
        this.f9938g = bVar;
        this.f9937e = bVar2;
        this.f = i3;
    }

    @Override // c1.AbstractBinderC0169a
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        switch (this.f9936d) {
            case 0:
                if (i3 != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) AbstractC0182e.a(parcel);
                AbstractC0182e.b(parcel);
                int i4 = this.f;
                V1.b bVar = this.f9937e;
                F1.b bVar2 = (F1.b) this.f9938g;
                if (bundle == null) {
                    C1120h c1120h = O.f9975i;
                    bVar.w(M.b(71, 15, c1120h), i4);
                    bVar2.d(c1120h);
                    return true;
                }
                int a3 = AbstractC0213o0.a(bundle, "BillingClient");
                C1120h a4 = O.a(a3, AbstractC0213o0.e(bundle, "BillingClient"));
                if (a3 != 0) {
                    AbstractC0213o0.g("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + a3);
                    bVar.w(M.b(23, 15, a4), i4);
                    bVar2.d(a4);
                    return true;
                }
                try {
                    String optString = new JSONObject(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")).optString("externalTransactionToken");
                    bVar2.getClass();
                    Y1.n s3 = F2.b.s(a4);
                    C0084h c0084h = new C0084h();
                    c0084h.f1680a = s3;
                    if (optString == null) {
                        throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                    }
                    c0084h.f1681b = optString;
                    ((C0081e) bVar2.f378b).a(c0084h);
                    return true;
                } catch (JSONException e3) {
                    AbstractC0213o0.h("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e3);
                    C1120h c1120h2 = O.f9975i;
                    bVar.w(M.b(72, 15, c1120h2), i4);
                    bVar2.d(c1120h2);
                    return true;
                }
            case 1:
                if (i3 != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) AbstractC0182e.a(parcel);
                AbstractC0182e.b(parcel);
                int i5 = this.f;
                V1.b bVar3 = this.f9937e;
                F1.b bVar4 = (F1.b) this.f9938g;
                if (bundle2 == null) {
                    C1120h c1120h3 = O.f9975i;
                    bVar3.w(M.b(63, 13, c1120h3), i5);
                    bVar4.f(c1120h3);
                } else {
                    int a5 = AbstractC0213o0.a(bundle2, "BillingClient");
                    String e4 = AbstractC0213o0.e(bundle2, "BillingClient");
                    C0087a a6 = C1120h.a();
                    a6.f1781b = a5;
                    a6.f1780a = e4;
                    if (a5 != 0) {
                        AbstractC0213o0.g("BillingClient", "getBillingConfig() failed. Response code: " + a5);
                        C1120h a7 = a6.a();
                        bVar3.w(M.b(23, 13, a7), i5);
                        bVar4.f(a7);
                    } else if (bundle2.containsKey("BILLING_CONFIG")) {
                        try {
                            String optString2 = new JSONObject(bundle2.getString("BILLING_CONFIG")).optString("countryCode");
                            C1120h a8 = a6.a();
                            bVar4.getClass();
                            Y1.n s4 = F2.b.s(a8);
                            Y1.k kVar = new Y1.k();
                            kVar.f1686a = s4;
                            if (optString2 == null) {
                                throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
                            }
                            kVar.f1687b = optString2;
                            ((C0081e) bVar4.f378b).a(kVar);
                        } catch (JSONException e5) {
                            AbstractC0213o0.h("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e5);
                            C1120h c1120h4 = O.f9975i;
                            bVar3.w(M.b(65, 13, c1120h4), i5);
                            bVar4.f(c1120h4);
                        }
                    } else {
                        AbstractC0213o0.g("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        a6.f1781b = 6;
                        C1120h a9 = a6.a();
                        bVar3.w(M.b(64, 13, a9), i5);
                        bVar4.f(a9);
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i3 != 1) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) AbstractC0182e.a(parcel);
                AbstractC0182e.b(parcel);
                F1.b bVar5 = (F1.b) this.f9938g;
                int i6 = this.f;
                V1.b bVar6 = this.f9937e;
                if (bundle3 == null) {
                    C1120h c1120h5 = O.f9975i;
                    bVar6.w(M.b(67, 14, c1120h5), i6);
                    bVar5.getClass();
                    ((C0081e) bVar5.f378b).a(F2.b.s(c1120h5));
                    return true;
                }
                int a10 = AbstractC0213o0.a(bundle3, "BillingClient");
                C1120h a11 = O.a(a10, AbstractC0213o0.e(bundle3, "BillingClient"));
                if (a10 != 0) {
                    AbstractC0213o0.g("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + a10);
                    bVar6.w(M.b(23, 14, a11), i6);
                }
                bVar5.getClass();
                ((C0081e) bVar5.f378b).a(F2.b.s(a11));
                return true;
        }
    }

    public BinderC1110A(F1.b bVar, V1.b bVar2, int i3, byte b3) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 1);
        this.f9938g = bVar;
        this.f9937e = bVar2;
        this.f = i3;
    }

    public BinderC1110A(F1.b bVar, V1.b bVar2, int i3, char c3) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback", 1);
        this.f9938g = bVar;
        this.f9937e = bVar2;
        this.f = i3;
    }
}
