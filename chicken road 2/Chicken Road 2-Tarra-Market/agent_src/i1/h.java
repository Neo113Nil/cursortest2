package i1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1338a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1339b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1340c;

    /* renamed from: d, reason: collision with root package name */
    public Cloneable f1341d;

    public h(boolean z2) {
        this.f1338a = z2;
    }

    public void a(f... fVarArr) {
        if (!this.f1338a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[fVarArr.length];
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            strArr[i2] = fVarArr[i2].f1330a;
        }
        b(strArr);
    }

    public void b(String... strArr) {
        if (!this.f1338a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f1340c = (String[]) strArr.clone();
    }

    public Bundle c(String str) {
        if (!this.f1339b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1341d;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1341d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1341d;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f1341d = null;
        }
        return bundle2;
    }

    public void d(B... bArr) {
        if (!this.f1338a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            strArr[i2] = bArr[i2].f1278a;
        }
        e(strArr);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Cloneable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.f1338a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f1341d = (String[]) strArr.clone();
    }
}
