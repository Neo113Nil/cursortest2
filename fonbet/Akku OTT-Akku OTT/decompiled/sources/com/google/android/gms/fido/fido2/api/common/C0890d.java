package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0890d extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0890d> CREATOR = new r0();

    @Nullable
    public final r a;

    @Nullable
    public final G0 b;

    @Nullable
    public final F c;

    @Nullable
    public final M0 d;

    @Nullable
    public final L e;

    @Nullable
    public final N f;

    @Nullable
    public final I0 i;

    @Nullable
    public final Q j;

    @Nullable
    public final C0914s k;

    @Nullable
    public final V l;

    @Nullable
    public final C0897g0 m;

    @Nullable
    public final T n;

    public C0890d(@Nullable r rVar, @Nullable G0 g0, @Nullable F f, @Nullable M0 m0, @Nullable L l, @Nullable N n, @Nullable I0 i0, @Nullable Q q, @Nullable C0914s c0914s, @Nullable V v, @Nullable C0897g0 c0897g0, @Nullable T t) {
        this.a = rVar;
        this.c = f;
        this.b = g0;
        this.d = m0;
        this.e = l;
        this.f = n;
        this.i = i0;
        this.j = q;
        this.k = c0914s;
        this.l = v;
        this.m = c0897g0;
        this.n = t;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0890d l(@NonNull JSONObject jSONObject) throws JSONException {
        V v;
        V l;
        G0 g0;
        I0 i0;
        r rVar = jSONObject.has("fidoAppIdExtension") ? new r(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
        if (jSONObject.has("appid")) {
            rVar = new r(jSONObject.getString("appid"));
        }
        r rVar2 = rVar;
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            l = V.l(jSONObject.getJSONObject("prf"), false);
        } else {
            if (!jSONObject.has("prfAlreadyHashed")) {
                v = null;
                if (jSONObject.has("cableAuthenticationExtension")) {
                    g0 = null;
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        arrayList.add(new E0(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
                    }
                    g0 = new G0(arrayList);
                }
                F f = !jSONObject.has("userVerificationMethodExtension") ? new F(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                M0 m0 = !jSONObject.has("google_multiAssertionExtension") ? new M0(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                L l2 = !jSONObject.has("google_sessionIdExtension") ? new L(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                N n = !jSONObject.has("google_silentVerificationExtension") ? new N(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                if (jSONObject.has("devicePublicKeyExtension")) {
                    i0 = null;
                } else {
                    jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    i0 = new I0();
                }
                return new C0890d(rVar2, g0, f, m0, l2, n, i0, !jSONObject.has("google_tunnelServerIdExtension") ? new Q(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject.has("google_thirdPartyPaymentExtension") ? new C0914s(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, v, jSONObject.has("txAuthSimple") ? new C0897g0(jSONObject.getString("txAuthSimple")) : null, null);
            }
            l = V.l(jSONObject.getJSONObject("prfAlreadyHashed"), true);
        }
        v = l;
        if (jSONObject.has("cableAuthenticationExtension")) {
        }
        if (!jSONObject.has("userVerificationMethodExtension")) {
        }
        if (!jSONObject.has("google_multiAssertionExtension")) {
        }
        if (!jSONObject.has("google_sessionIdExtension")) {
        }
        if (!jSONObject.has("google_silentVerificationExtension")) {
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
        }
        return new C0890d(rVar2, g0, f, m0, l2, n, i0, !jSONObject.has("google_tunnelServerIdExtension") ? new Q(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject.has("google_thirdPartyPaymentExtension") ? new C0914s(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, v, jSONObject.has("txAuthSimple") ? new C0897g0(jSONObject.getString("txAuthSimple")) : null, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0890d)) {
            return false;
        }
        C0890d c0890d = (C0890d) obj;
        return C0874p.a(this.a, c0890d.a) && C0874p.a(this.b, c0890d.b) && C0874p.a(this.c, c0890d.c) && C0874p.a(this.d, c0890d.d) && C0874p.a(this.e, c0890d.e) && C0874p.a(this.f, c0890d.f) && C0874p.a(this.i, c0890d.i) && C0874p.a(this.j, c0890d.j) && C0874p.a(this.k, c0890d.k) && C0874p.a(this.l, c0890d.l) && C0874p.a(this.m, c0890d.m) && C0874p.a(this.n, c0890d.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k, this.l, this.m, this.n});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        String valueOf11 = String.valueOf(this.m);
        StringBuilder a = androidx.datastore.preferences.protobuf.c.a("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        androidx.collection.e.d(a, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        androidx.collection.e.d(a, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        androidx.collection.e.d(a, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        androidx.collection.e.d(a, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return androidx.concurrent.futures.a.a(a, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 5, this.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 6, this.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 7, this.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 8, this.i, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 9, this.j, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 10, this.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 11, this.l, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 12, this.m, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 13, this.n, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
