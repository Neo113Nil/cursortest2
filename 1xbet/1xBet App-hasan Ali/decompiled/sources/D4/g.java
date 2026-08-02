package D4;

import L4.C;
import L4.C0226i;
import L4.InterfaceC0228k;
import java.util.regex.Pattern;
import v.AbstractC2528x;
import y4.B;
import y4.q;

/* loaded from: classes.dex */
public final class g extends B {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f983l;

    /* renamed from: m, reason: collision with root package name */
    public final long f984m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f985n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0228k f986o;

    public /* synthetic */ g(Object obj, long j5, InterfaceC0228k interfaceC0228k, int i) {
        this.f983l = i;
        this.f985n = obj;
        this.f984m = j5;
        this.f986o = interfaceC0228k;
    }

    @Override // y4.B
    public final long b() {
        switch (this.f983l) {
        }
        return this.f984m;
    }

    @Override // y4.B
    public final q d() {
        Object obj = this.f985n;
        switch (this.f983l) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = q.f21370d;
                try {
                    return AbstractC2528x.d(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (q) obj;
        }
    }

    @Override // y4.B
    public final InterfaceC0228k f() {
        switch (this.f983l) {
            case 0:
                return (C) this.f986o;
            default:
                return (C0226i) this.f986o;
        }
    }
}
