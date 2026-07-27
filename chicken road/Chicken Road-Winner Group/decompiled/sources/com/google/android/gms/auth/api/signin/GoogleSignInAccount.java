package com.google.android.gms.auth.api.signin;

import F2.b;
import H.j;
import T0.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2552b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2553c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2554d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2555e;
    public final Uri f;

    /* renamed from: g, reason: collision with root package name */
    public String f2556g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2557h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2558i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2559j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2560k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2561l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f2562m = new HashSet();

    public GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2551a = i3;
        this.f2552b = str;
        this.f2553c = str2;
        this.f2554d = str3;
        this.f2555e = str4;
        this.f = uri;
        this.f2556g = str5;
        this.f2557h = j3;
        this.f2558i = str6;
        this.f2559j = arrayList;
        this.f2560k = str7;
        this.f2561l = str8;
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
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(1, jSONArray.getString(i3)));
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
        googleSignInAccount.f2556g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.f2558i.equals(this.f2558i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f2559j);
        hashSet.addAll(googleSignInAccount.f2562m);
        HashSet hashSet2 = new HashSet(this.f2559j);
        hashSet2.addAll(this.f2562m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f2558i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2559j);
        hashSet.addAll(this.f2562m);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = b.Q(parcel, 20293);
        b.S(parcel, 1, 4);
        parcel.writeInt(this.f2551a);
        b.N(parcel, 2, this.f2552b);
        b.N(parcel, 3, this.f2553c);
        b.N(parcel, 4, this.f2554d);
        b.N(parcel, 5, this.f2555e);
        b.M(parcel, 6, this.f, i3);
        b.N(parcel, 7, this.f2556g);
        b.S(parcel, 8, 8);
        parcel.writeLong(this.f2557h);
        b.N(parcel, 9, this.f2558i);
        b.P(parcel, 10, this.f2559j);
        b.N(parcel, 11, this.f2560k);
        b.N(parcel, 12, this.f2561l);
        b.R(parcel, Q2);
    }
}
