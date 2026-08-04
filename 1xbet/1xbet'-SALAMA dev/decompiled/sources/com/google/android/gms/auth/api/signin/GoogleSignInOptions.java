package com.google.android.gms.auth.api.signin;

import Y4.D;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.ProfileContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025d3.c;
import p025d3.d;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements e, ReflectedParcelable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final GoogleSignInOptions f11030B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Scope f11031C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Scope f11032D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Scope f11033E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final c f11034F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f11035A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f11038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11041f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f11042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f11043y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f11044z;

    static {
        Scope scope = new Scope(1, ProfileContext.TYPE);
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f11031C = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f11032D = scope3;
        f11033E = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f11033E)) {
            Scope scope4 = f11032D;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f11030B = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f11033E)) {
            Scope scope5 = f11032D;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new d(1);
        f11034F = new c(1);
    }

    public GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z4, boolean z7, boolean z8, String str, String str2, HashMap map, String str3) {
        this.f11036a = i7;
        this.f11037b = arrayList;
        this.f11038c = account;
        this.f11039d = z4;
        this.f11040e = z7;
        this.f11041f = z8;
        this.f11042x = str;
        this.f11043y = str2;
        this.f11044z = new ArrayList(map.values());
        this.f11035A = str3;
    }

    public static GoogleSignInOptions j(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap k(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList == null) {
            return map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f11049b), googleSignInOptionsExtensionParcelable);
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    public final boolean equals(Object obj) {
        String str = this.f11042x;
        ArrayList arrayList = this.f11037b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f11037b;
            String str2 = googleSignInOptions.f11042x;
            Account account = googleSignInOptions.f11038c;
            if (this.f11044z.size() <= 0 && googleSignInOptions.f11044z.size() <= 0 && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f11038c;
                if (account2 == null) {
                    if (account == null) {
                        if (TextUtils.isEmpty(str)) {
                            if (TextUtils.isEmpty(str2)) {
                                if (this.f11041f != googleSignInOptions.f11041f && this.f11039d == googleSignInOptions.f11039d && this.f11040e == googleSignInOptions.f11040e && TextUtils.equals(this.f11035A, googleSignInOptions.f11035A)) {
                                    return true;
                                }
                            }
                        } else if (!str.equals(str2)) {
                            if (this.f11041f != googleSignInOptions.f11041f) {
                            }
                        }
                    }
                } else if (account2.equals(account)) {
                    if (TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(str2)) {
                            if (this.f11041f != googleSignInOptions.f11041f) {
                            }
                        }
                    } else if (!str.equals(str2)) {
                        if (this.f11041f != googleSignInOptions.f11041f) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f11037b;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).f11076b);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (31 * 1);
        Account account = this.f11038c;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f11042x;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f11041f ? 1 : 0)) * 31) + (this.f11039d ? 1 : 0)) * 31) + (this.f11040e ? 1 : 0);
        String str2 = this.f11035A;
        return (31 * iHashCode3) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11036a);
        D.w0(parcel, 2, new ArrayList(this.f11037b), false);
        D.r0(parcel, 3, this.f11038c, i7, false);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f11039d ? 1 : 0);
        D.B0(parcel, 5, 4);
        parcel.writeInt(this.f11040e ? 1 : 0);
        D.B0(parcel, 6, 4);
        parcel.writeInt(this.f11041f ? 1 : 0);
        D.s0(parcel, 7, this.f11042x, false);
        D.s0(parcel, 8, this.f11043y, false);
        D.w0(parcel, 9, this.f11044z, false);
        D.s0(parcel, 10, this.f11035A, false);
        D.z0(iX0, parcel);
    }
}
