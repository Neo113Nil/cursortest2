package n;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18324a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18325b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18326c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f18327d;

    public y4.i a() {
        return new y4.i(this.f18324a, this.f18325b, (String[]) this.f18326c, (String[]) this.f18327d);
    }

    public void b(String... strArr) {
        kotlin.jvm.internal.l.f("cipherSuites", strArr);
        if (!this.f18324a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f18326c = (String[]) strArr.clone();
    }

    public void c(y4.h... hVarArr) {
        kotlin.jvm.internal.l.f("cipherSuites", hVarArr);
        if (!this.f18324a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(hVarArr.length);
        for (y4.h hVar : hVarArr) {
            arrayList.add(hVar.f21336a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        kotlin.jvm.internal.l.f("tlsVersions", strArr);
        if (!this.f18324a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f18327d = (String[]) strArr.clone();
    }

    public void e(y4.D... dArr) {
        if (!this.f18324a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (y4.D d5 : dArr) {
            arrayList.add(d5.f21291k);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
