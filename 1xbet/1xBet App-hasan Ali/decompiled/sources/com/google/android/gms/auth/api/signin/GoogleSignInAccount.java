package com.google.android.gms.auth.api.signin;

import C2.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import k4.AbstractC2036a;
import n3.AbstractC2187a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC2187a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a(16);

    /* renamed from: k, reason: collision with root package name */
    public final int f7466k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7467l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7468m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7469n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7470o;

    /* renamed from: p, reason: collision with root package name */
    public final Uri f7471p;

    /* renamed from: q, reason: collision with root package name */
    public String f7472q;

    /* renamed from: r, reason: collision with root package name */
    public final long f7473r;

    /* renamed from: s, reason: collision with root package name */
    public final String f7474s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f7475t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7476u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7477v;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f7478w = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j5, String str6, ArrayList arrayList, String str7, String str8) {
        this.f7466k = i;
        this.f7467l = str;
        this.f7468m = str2;
        this.f7469n = str3;
        this.f7470o = str4;
        this.f7471p = uri;
        this.f7472q = str5;
        this.f7473r = j5;
        this.f7474s = str6;
        this.f7475t = arrayList;
        this.f7476u = str7;
        this.f7477v = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i), 1));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f7472q = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f7474s.equals(this.f7474s)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f7475t);
        hashSet.addAll(googleSignInAccount.f7478w);
        HashSet hashSet2 = new HashSet(this.f7475t);
        hashSet2.addAll(this.f7478w);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int i = L1.a.i(527, 31, this.f7474s);
        HashSet hashSet = new HashSet(this.f7475t);
        hashSet.addAll(this.f7478w);
        return hashSet.hashCode() + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f7466k);
        AbstractC2036a.f0(parcel, 2, this.f7467l);
        AbstractC2036a.f0(parcel, 3, this.f7468m);
        AbstractC2036a.f0(parcel, 4, this.f7469n);
        AbstractC2036a.f0(parcel, 5, this.f7470o);
        AbstractC2036a.e0(parcel, 6, this.f7471p, i);
        AbstractC2036a.f0(parcel, 7, this.f7472q);
        AbstractC2036a.n0(parcel, 8, 8);
        parcel.writeLong(this.f7473r);
        AbstractC2036a.f0(parcel, 9, this.f7474s);
        AbstractC2036a.j0(parcel, 10, this.f7475t);
        AbstractC2036a.f0(parcel, 11, this.f7476u);
        AbstractC2036a.f0(parcel, 12, this.f7477v);
        AbstractC2036a.m0(parcel, k02);
    }
}
