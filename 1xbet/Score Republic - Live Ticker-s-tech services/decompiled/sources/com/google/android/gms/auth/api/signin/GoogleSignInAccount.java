package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0823w0;
import p000.C0936z2;
import p000.p80;
import p000.t22;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC0823w0 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0936z2(22);

    /* JADX INFO: renamed from: j */
    public final String f1325j;

    /* JADX INFO: renamed from: k */
    public final String f1326k;

    /* JADX INFO: renamed from: l */
    public final String f1327l;

    /* JADX INFO: renamed from: m */
    public final String f1328m;

    /* JADX INFO: renamed from: n */
    public final Uri f1329n;

    /* JADX INFO: renamed from: o */
    public String f1330o;

    /* JADX INFO: renamed from: p */
    public final long f1331p;

    /* JADX INFO: renamed from: q */
    public final String f1332q;

    /* JADX INFO: renamed from: r */
    public final List f1333r;

    /* JADX INFO: renamed from: s */
    public final String f1334s;

    /* JADX INFO: renamed from: t */
    public final String f1335t;

    /* JADX INFO: renamed from: u */
    public final HashSet f1336u = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f1325j = str;
        this.f1326k = str2;
        this.f1327l = str3;
        this.f1328m = str4;
        this.f1329n = uri;
        this.f1330o = str5;
        this.f1331p = j;
        this.f1332q = str6;
        this.f1333r = arrayList;
        this.f1334s = str7;
        this.f1335t = str8;
    }

    /* JADX INFO: renamed from: b */
    public static GoogleSignInAccount m990b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i), 1));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        p80.m3860e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f1330o = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f1332q.equals(this.f1332q)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f1333r);
        hashSet.addAll(googleSignInAccount.f1336u);
        HashSet hashSet2 = new HashSet(this.f1333r);
        hashSet2.addAll(this.f1336u);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f1332q.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f1333r);
        hashSet.addAll(this.f1336u);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 2, this.f1325j);
        t22.m4658l(parcel, 3, this.f1326k);
        t22.m4658l(parcel, 4, this.f1327l);
        t22.m4658l(parcel, 5, this.f1328m);
        t22.m4657k(parcel, 6, this.f1329n, i);
        t22.m4658l(parcel, 7, this.f1330o);
        t22.m4662p(parcel, 8, 8);
        parcel.writeLong(this.f1331p);
        t22.m4658l(parcel, 9, this.f1332q);
        t22.m4660n(parcel, 10, this.f1333r);
        t22.m4658l(parcel, 11, this.f1334s);
        t22.m4658l(parcel, 12, this.f1335t);
        t22.m4665s(parcel, iM4663q);
    }
}
