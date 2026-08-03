package I1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f723a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f724b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f725c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f726d;

    public h(int i2) {
        switch (i2) {
            case 1:
                this.f725c = new j.C0915f();
                break;
            default:
                this.f723a = true;
                break;
        }
    }

    public I1.i a() {
        return new I1.i(this.f723a, this.f724b, (java.lang.String[]) this.f725c, (java.lang.String[]) this.f726d);
    }

    public void b(I1.g... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f723a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(cipherSuites.length);
        for (I1.g gVar : cipherSuites) {
            arrayList.add(gVar.f722a);
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        java.lang.String[] strArr = (java.lang.String[]) array;
        c((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public void c(java.lang.String... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f723a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one cipher suite is required");
        }
        this.f725c = (java.lang.String[]) cipherSuites.clone();
    }

    public android.os.Bundle d(java.lang.String str) {
        if (!this.f724b) {
            throw new java.lang.IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        android.os.Bundle bundle = (android.os.Bundle) this.f726d;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = bundle.getBundle(str);
        android.os.Bundle bundle3 = (android.os.Bundle) this.f726d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        android.os.Bundle bundle4 = (android.os.Bundle) this.f726d;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f726d = null;
        }
        return bundle2;
    }

    public void e(I1.B... bArr) {
        if (!this.f723a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (I1.B b2 : bArr) {
            arrayList.add(b2.f669a);
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        java.lang.String[] strArr = (java.lang.String[]) array;
        f((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public void f(java.lang.String... tlsVersions) {
        kotlin.jvm.internal.i.e(tlsVersions, "tlsVersions");
        if (!this.f723a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one TLS version is required");
        }
        this.f726d = (java.lang.String[]) tlsVersions.clone();
    }
}
