package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    @NonNull
    @VisibleForTesting
    public static final Clock p = DefaultClock.getInstance();
    public final int a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final Uri f;

    @Nullable
    public String i;
    public final long j;
    public final String k;
    public final List l;

    @Nullable
    public final String m;

    @Nullable
    public final String n;
    public final HashSet o = new HashSet();

    public GoogleSignInAccount(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Uri uri, @Nullable String str5, long j, String str6, ArrayList arrayList, @Nullable String str7, @Nullable String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.i = str5;
        this.j = j;
        this.k = str6;
        this.l = arrayList;
        this.m = str7;
        this.n = str8;
    }

    @Nullable
    public static GoogleSignInAccount m(@Nullable String str) throws JSONException {
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
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        C0875q.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.i = jSONObject.has(Constants.SERVER_AUTH_CODE) ? jSONObject.optString(Constants.SERVER_AUTH_CODE) : null;
        return googleSignInAccount;
    }

    public final boolean equals(@Nullable Object obj) {
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
        return googleSignInAccount.k.equals(this.k) && googleSignInAccount.l().equals(l());
    }

    public final int hashCode() {
        return ((this.k.hashCode() + 527) * 31) + l().hashCode();
    }

    @NonNull
    public final HashSet l() {
        HashSet hashSet = new HashSet(this.l);
        hashSet.addAll(this.o);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 5, this.e, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 6, this.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 8, 8);
        parcel.writeLong(this.j);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 9, this.k, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 10, this.l, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 11, this.m, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 12, this.n, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
