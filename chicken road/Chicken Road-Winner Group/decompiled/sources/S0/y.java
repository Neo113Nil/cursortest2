package S0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f1373d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f1374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1375b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1376c;

    public y(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f1374a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f1375b = "com.google.android.gms";
        this.f1376c = z3;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f1374a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f1376c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f1373d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e3) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e3.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f1375b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return r.e(this.f1374a, yVar.f1374a) && r.e(this.f1375b, yVar.f1375b) && r.e(null, null) && this.f1376c == yVar.f1376c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1374a, this.f1375b, null, 4225, Boolean.valueOf(this.f1376c)});
    }

    public final String toString() {
        String str = this.f1374a;
        if (str != null) {
            return str;
        }
        r.c(null);
        throw null;
    }
}
