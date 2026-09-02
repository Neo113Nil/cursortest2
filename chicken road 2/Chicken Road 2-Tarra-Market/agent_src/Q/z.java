package Q;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f484d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f486b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f487c;

    public z(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f485a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f486b = "com.google.android.gms";
        this.f487c = z2;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f485a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f487c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f484d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e2) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f486b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return s.e(this.f485a, zVar.f485a) && s.e(this.f486b, zVar.f486b) && s.e(null, null) && this.f487c == zVar.f487c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f485a, this.f486b, null, 4225, Boolean.valueOf(this.f487c)});
    }

    public final String toString() {
        String str = this.f485a;
        if (str != null) {
            return str;
        }
        s.c(null);
        throw null;
    }
}
