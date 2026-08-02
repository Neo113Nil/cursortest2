package i2;

import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.Q;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import java.util.Map;

/* renamed from: i2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254j extends AbstractC1258n {

    /* renamed from: d, reason: collision with root package name */
    public final int f13887d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13888e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13889f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13890g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13891h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13892i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final long f13893k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13894l;

    /* renamed from: m, reason: collision with root package name */
    public final long f13895m;

    /* renamed from: n, reason: collision with root package name */
    public final long f13896n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13897o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13898p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f13899q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0167z f13900r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0167z f13901s;

    /* renamed from: t, reason: collision with root package name */
    public final Q f13902t;

    /* renamed from: u, reason: collision with root package name */
    public final long f13903u;

    /* renamed from: v, reason: collision with root package name */
    public final C1253i f13904v;

    public C1254j(int i7, String str, List list, long j, boolean z4, long j3, boolean z7, int i8, long j7, int i9, long j8, long j9, boolean z8, boolean z9, boolean z10, DrmInitData drmInitData, List list2, List list3, C1253i c1253i, Map map) {
        super(str, list, z8);
        this.f13887d = i7;
        this.f13891h = j3;
        this.f13890g = z4;
        this.f13892i = z7;
        this.j = i8;
        this.f13893k = j7;
        this.f13894l = i9;
        this.f13895m = j8;
        this.f13896n = j9;
        this.f13897o = z9;
        this.f13898p = z10;
        this.f13899q = drmInitData;
        this.f13900r = AbstractC0167z.E(list2);
        this.f13901s = AbstractC0167z.E(list3);
        this.f13902t = Q.a(map);
        if (!list3.isEmpty()) {
            C1249e c1249e = (C1249e) AbstractC0158p.f(list3);
            this.f13903u = c1249e.f13877e + c1249e.f13875c;
        } else if (list2.isEmpty()) {
            this.f13903u = 0L;
        } else {
            C1251g c1251g = (C1251g) AbstractC0158p.f(list2);
            this.f13903u = c1251g.f13877e + c1251g.f13875c;
        }
        this.f13888e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f13903u, j) : Math.max(0L, this.f13903u + j) : -9223372036854775807L;
        this.f13889f = j >= 0;
        this.f13904v = c1253i;
    }

    @Override // b2.InterfaceC0779a
    public final Object a(List list) {
        return this;
    }
}
