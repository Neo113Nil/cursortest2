package p0;

/* renamed from: p0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973y {

    /* renamed from: d, reason: collision with root package name */
    public static final android.net.Uri f8300d = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f8301a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f8302b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8303c;

    public C0973y(java.lang.String str, boolean z2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        this.f8301a = str;
        if (android.text.TextUtils.isEmpty("com.google.android.gms")) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        this.f8302b = "com.google.android.gms";
        this.f8303c = z2;
    }

    public final android.content.Intent a(android.content.Context context) {
        android.os.Bundle bundle;
        java.lang.String str = this.f8301a;
        if (str == null) {
            return new android.content.Intent().setComponent(null);
        }
        if (this.f8303c) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f8300d, "serviceIntentCall", (java.lang.String) null, bundle2);
            } catch (java.lang.IllegalArgumentException e2) {
                android.util.Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (android.content.Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                android.util.Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(java.lang.String.valueOf(str)));
            }
        }
        return r1 == null ? new android.content.Intent(str).setPackage(this.f8302b) : r1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0.C0973y)) {
            return false;
        }
        p0.C0973y c0973y = (p0.C0973y) obj;
        return p0.AbstractC0966r.e(this.f8301a, c0973y.f8301a) && p0.AbstractC0966r.e(this.f8302b, c0973y.f8302b) && p0.AbstractC0966r.e(null, null) && this.f8303c == c0973y.f8303c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f8301a, this.f8302b, null, 4225, java.lang.Boolean.valueOf(this.f8303c)});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f8301a;
        if (str != null) {
            return str;
        }
        p0.AbstractC0966r.c(null);
        throw null;
    }
}
