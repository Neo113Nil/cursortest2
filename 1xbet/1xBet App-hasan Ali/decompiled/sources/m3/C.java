package m3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f18003d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f18004a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18005b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18006c;

    public C(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f18004a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f18005b = "com.google.android.gms";
        this.f18006c = z3;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f18004a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f18006c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f18003d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e3) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e3.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f18005b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c5 = (C) obj;
        return v.g(this.f18004a, c5.f18004a) && v.g(this.f18005b, c5.f18005b) && v.g(null, null) && this.f18006c == c5.f18006c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18004a, this.f18005b, null, 4225, Boolean.valueOf(this.f18006c)});
    }

    public final String toString() {
        String str = this.f18004a;
        if (str != null) {
            return str;
        }
        v.e(null);
        throw null;
    }
}
