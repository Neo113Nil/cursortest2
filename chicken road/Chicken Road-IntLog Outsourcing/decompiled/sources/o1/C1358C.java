package o1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* renamed from: o1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1358C {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f11503d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f11504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11505b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11506c;

    public C1358C(String str, boolean z) {
        u.c(str);
        this.f11504a = str;
        u.c("com.google.android.gms");
        this.f11505b = "com.google.android.gms";
        this.f11506c = z;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f11504a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f11506c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f11503d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e3) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e3.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f11505b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358C)) {
            return false;
        }
        C1358C c1358c = (C1358C) obj;
        return u.j(this.f11504a, c1358c.f11504a) && u.j(this.f11505b, c1358c.f11505b) && u.j(null, null) && this.f11506c == c1358c.f11506c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11504a, this.f11505b, null, 4225, Boolean.valueOf(this.f11506c)});
    }

    public final String toString() {
        String str = this.f11504a;
        if (str != null) {
            return str;
        }
        u.g(null);
        throw null;
    }
}
