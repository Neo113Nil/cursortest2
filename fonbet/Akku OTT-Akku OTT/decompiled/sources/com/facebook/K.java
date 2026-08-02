package com.facebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class K {
    public static final a Companion = new a();
    public static volatile K d;
    public final LocalBroadcastManager a;
    public final J b;
    public H c;

    public static final class a {
        @JvmStatic
        public final synchronized K a() {
            K k;
            try {
                if (K.d == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(w.a());
                    Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    K.d = new K(localBroadcastManager, new J());
                }
                k = K.d;
                if (k == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                    k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return k;
        }
    }

    public K(LocalBroadcastManager localBroadcastManager, J profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.a = localBroadcastManager;
        this.b = profileCache;
    }

    public final void a(H profile, boolean z) {
        SharedPreferences sharedPreferences = this.b.a;
        H h = this.c;
        this.c = profile;
        if (z) {
            if (profile != null) {
                Intrinsics.checkNotNullParameter(profile, "profile");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.a);
                    jSONObject.put("first_name", profile.b);
                    jSONObject.put("middle_name", profile.c);
                    jSONObject.put("last_name", profile.d);
                    jSONObject.put("name", profile.e);
                    Uri uri = profile.f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.i;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        com.facebook.internal.E e = com.facebook.internal.E.a;
        if (h == null ? profile == null : Intrinsics.areEqual(h, profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", h);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.a.sendBroadcast(intent);
    }
}
