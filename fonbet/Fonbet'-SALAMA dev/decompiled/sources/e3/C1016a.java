package e3;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.D;
import d3.C0962c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f12645c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C1016a f12646d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f12647a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12648b;

    public C1016a(Context context) {
        this.f12648b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C1016a a(Context context) {
        D.i(context);
        ReentrantLock reentrantLock = f12645c;
        reentrantLock.lock();
        try {
            if (f12646d == null) {
                f12646d = new C1016a(context.getApplicationContext());
            }
            C1016a c1016a = f12646d;
            reentrantLock.unlock();
            return c1016a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        return e1.k.f(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e7;
        String e8 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e8) || (e7 = e(g("googleSignInAccount", e8))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.j(e7);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String e7;
        String e8 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e8) || (e7 = e(g("googleSignInOptions", e8))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.j(e7);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        D.i(googleSignInAccount);
        D.i(googleSignInOptions);
        String str = googleSignInAccount.f11029z;
        f("defaultGoogleSignInAccount", str);
        String g3 = g("googleSignInAccount", str);
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
            Arrays.sort(scopeArr, C0962c.f12399b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f11076b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g3, jSONObject.toString());
            String g7 = g("googleSignInOptions", str);
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
                f(g7, jSONObject2.toString());
            } catch (JSONException e7) {
                throw new RuntimeException(e7);
            }
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f12647a;
        reentrantLock.lock();
        try {
            return this.f12648b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f12647a;
        reentrantLock.lock();
        try {
            this.f12648b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
