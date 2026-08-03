package com.google.android.gms.auth.api.signin;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends q0.AbstractC0980a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new C.l(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f2577a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f2578b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f2579c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f2580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f2581e;

    /* renamed from: f, reason: collision with root package name */
    public final android.net.Uri f2582f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f2583g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2584h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f2585i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f2586j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f2587k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f2588l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f2589m = new java.util.HashSet();

    public GoogleSignInAccount(int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j2, java.lang.String str6, java.util.ArrayList arrayList, java.lang.String str7, java.lang.String str8) {
        this.f2577a = i2;
        this.f2578b = str;
        this.f2579c = str2;
        this.f2580d = str3;
        this.f2581e = str4;
        this.f2582f = uri;
        this.f2583g = str5;
        this.f2584h = j2;
        this.f2585i = str6;
        this.f2586j = arrayList;
        this.f2587k = str7;
        this.f2588l = str8;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("photoUrl");
        android.net.Uri parse = !android.text.TextUtils.isEmpty(optString) ? android.net.Uri.parse(optString) : null;
        long parseLong = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(1, jSONArray.getString(i2)));
        }
        java.lang.String optString2 = jSONObject.optString("id");
        java.lang.String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        java.lang.String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        java.lang.String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        java.lang.String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        java.lang.String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        java.lang.String string = jSONObject.getString("obfuscatedIdentifier");
        if (android.text.TextUtils.isEmpty(string)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new java.util.ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f2583g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        if (googleSignInAccount.f2585i.equals(this.f2585i)) {
            java.util.HashSet hashSet = new java.util.HashSet(googleSignInAccount.f2586j);
            hashSet.addAll(googleSignInAccount.f2589m);
            java.util.HashSet hashSet2 = new java.util.HashSet(this.f2586j);
            hashSet2.addAll(this.f2589m);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2585i.hashCode() + 527;
        java.util.HashSet hashSet = new java.util.HashSet(this.f2586j);
        hashSet.addAll(this.f2589m);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f2577a);
        a.AbstractC0059a.D(parcel, 2, this.f2578b);
        a.AbstractC0059a.D(parcel, 3, this.f2579c);
        a.AbstractC0059a.D(parcel, 4, this.f2580d);
        a.AbstractC0059a.D(parcel, 5, this.f2581e);
        a.AbstractC0059a.C(parcel, 6, this.f2582f, i2);
        a.AbstractC0059a.D(parcel, 7, this.f2583g);
        a.AbstractC0059a.I(parcel, 8, 8);
        parcel.writeLong(this.f2584h);
        a.AbstractC0059a.D(parcel, 9, this.f2585i);
        a.AbstractC0059a.F(parcel, 10, this.f2586j);
        a.AbstractC0059a.D(parcel, 11, this.f2587k);
        a.AbstractC0059a.D(parcel, 12, this.f2588l);
        a.AbstractC0059a.H(parcel, G);
    }
}
