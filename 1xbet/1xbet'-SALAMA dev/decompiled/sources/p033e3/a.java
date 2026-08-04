package p033e3;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025d3.c;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f12651c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f12652d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f12653a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12654b;

    public a(Context context) {
        this.f12654b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        D.i(context);
        ReentrantLock reentrantLock = f12651c;
        reentrantLock.lock();
        try {
            if (f12652d == null) {
                f12652d = new a(context.getApplicationContext());
            }
            return f12652d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String g(String str, String str2) {
        return k.f(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(g("googleSignInAccount", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.j(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(g("googleSignInOptions", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.j(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        D.i(googleSignInAccount);
        D.i(googleSignInOptions);
        String str = googleSignInAccount.f11029z;
        f("defaultGoogleSignInAccount", str);
        String strG = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f11022b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f11023c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f11024d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f11025e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f11018B;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f11019C;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f11026f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f11027x;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f11028y);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f11017A;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, c.f12405b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f11076b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(strG, jSONObject.toString());
            String strG2 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f11043y;
            String str10 = googleSignInOptions.f11042x;
            ArrayList arrayList2 = googleSignInOptions.f11037b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f11034F);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f11076b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f11038c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f11039d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f11041f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f11040e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(strG2, jSONObject2.toString());
            } catch (JSONException e7) {
                throw new RuntimeException(e7);
            }
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f12653a;
        reentrantLock.lock();
        try {
            return this.f12654b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f12653a;
        reentrantLock.lock();
        try {
            this.f12654b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
