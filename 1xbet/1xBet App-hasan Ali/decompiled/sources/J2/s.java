package J2;

import Q2.V0;
import com.google.android.gms.internal.ads.C0930eF;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2729a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2730b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2731c;

    public s(V0 v02) {
        this.f2729a = v02.f4943k;
        this.f2730b = v02.f4944l;
        this.f2731c = v02.f4945m;
    }

    public C0930eF a() {
        if (this.f2729a || !(this.f2730b || this.f2731c)) {
            return new C0930eF(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
