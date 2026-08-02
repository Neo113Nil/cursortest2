package G3;

import F3.C3013s;
import J3.j;
import android.net.Uri;
import j3.C7272n;
import java.util.List;
import java.util.Map;
import p3.InterfaceC8846f;
import p3.i;
import p3.x;

/* loaded from: classes8.dex */
public abstract class b implements j.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f9670a = C3013s.a();

    /* renamed from: b, reason: collision with root package name */
    public final i f9671b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9672c;

    /* renamed from: d, reason: collision with root package name */
    public final C7272n f9673d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9674e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9675f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9676g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9677h;

    /* renamed from: i, reason: collision with root package name */
    protected final x f9678i;

    public b(InterfaceC8846f interfaceC8846f, i iVar, int i11, C7272n c7272n, int i12, Object obj, long j11, long j12) {
        this.f9678i = new x(interfaceC8846f);
        this.f9671b = iVar;
        this.f9672c = i11;
        this.f9673d = c7272n;
        this.f9674e = i12;
        this.f9675f = obj;
        this.f9676g = j11;
        this.f9677h = j12;
    }

    public final long a() {
        return this.f9678i.i();
    }

    public final Map<String, List<String>> b() {
        return this.f9678i.k();
    }

    public final Uri c() {
        return this.f9678i.j();
    }
}
