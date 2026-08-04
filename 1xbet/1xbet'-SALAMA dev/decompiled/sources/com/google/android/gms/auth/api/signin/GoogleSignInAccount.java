package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025d3.d;
import p150v0.a;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f11017A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f11018B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f11019C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final HashSet f11020D = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f11026f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f11027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f11028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f11029z;

    public GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f11021a = i7;
        this.f11022b = str;
        this.f11023c = str2;
        this.f11024d = str3;
        this.f11025e = str4;
        this.f11026f = uri;
        this.f11027x = str5;
        this.f11028y = j;
        this.f11029z = str6;
        this.f11017A = arrayList;
        this.f11018B = str7;
        this.f11019C = str8;
    }

    public static GoogleSignInAccount j(String str) throws JSONException {
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
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        D.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f11027x = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (googleSignInAccount.f11029z.equals(this.f11029z)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f11017A);
            hashSet.addAll(googleSignInAccount.f11020D);
            HashSet hashSet2 = new HashSet(this.f11017A);
            hashSet2.addAll(this.f11020D);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = a.d(527, 31, this.f11029z);
        HashSet hashSet = new HashSet(this.f11017A);
        hashSet.addAll(this.f11020D);
        return hashSet.hashCode() + iD;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11021a);
        Y4.D.s0(parcel, 2, this.f11022b, false);
        Y4.D.s0(parcel, 3, this.f11023c, false);
        Y4.D.s0(parcel, 4, this.f11024d, false);
        Y4.D.s0(parcel, 5, this.f11025e, false);
        Y4.D.r0(parcel, 6, this.f11026f, i7, false);
        Y4.D.s0(parcel, 7, this.f11027x, false);
        Y4.D.B0(parcel, 8, 8);
        parcel.writeLong(this.f11028y);
        Y4.D.s0(parcel, 9, this.f11029z, false);
        Y4.D.w0(parcel, 10, this.f11017A, false);
        Y4.D.s0(parcel, 11, this.f11018B, false);
        Y4.D.s0(parcel, 12, this.f11019C, false);
        Y4.D.z0(iX0, parcel);
    }
}
