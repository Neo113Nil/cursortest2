package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f11264d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f11265a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11266b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11267c;

    public K(String str, String str2, boolean z4) {
        D.e(str);
        this.f11265a = str;
        D.e(str2);
        this.f11266b = str2;
        this.f11267c = z4;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f11265a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f11267c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f11264d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e7) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e7.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f11266b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        return D.m(this.f11265a, k7.f11265a) && D.m(this.f11266b, k7.f11266b) && D.m(null, null) && this.f11267c == k7.f11267c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11265a, this.f11266b, null, 4225, Boolean.valueOf(this.f11267c)});
    }

    public final String toString() {
        String str = this.f11265a;
        if (str != null) {
            return str;
        }
        D.i(null);
        throw null;
    }
}
