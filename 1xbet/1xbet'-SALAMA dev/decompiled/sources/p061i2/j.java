package p061i2;

import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.Q;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13898i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f13901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f13902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DrmInitData f13905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0167z f13906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0167z f13907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Q f13908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f13909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f13910v;

    public j(int i7, String str, List list, long j, boolean z4, long j3, boolean z7, int i8, long j7, int i9, long j8, long j9, boolean z8, boolean z9, boolean z10, DrmInitData drmInitData, List list2, List list3, i iVar, Map map) {
        super(str, list, z8);
        this.f13893d = i7;
        this.f13897h = j3;
        this.f13896g = z4;
        this.f13898i = z7;
        this.j = i8;
        this.f13899k = j7;
        this.f13900l = i9;
        this.f13901m = j8;
        this.f13902n = j9;
        this.f13903o = z9;
        this.f13904p = z10;
        this.f13905q = drmInitData;
        this.f13906r = AbstractC0167z.E(list2);
        this.f13907s = AbstractC0167z.E(list3);
        this.f13908t = Q.a(map);
        if (!list3.isEmpty()) {
            e eVar = (e) AbstractC0158p.f(list3);
            this.f13909u = eVar.f13883e + eVar.f13881c;
        } else if (list2.isEmpty()) {
            this.f13909u = 0L;
        } else {
            g gVar = (g) AbstractC0158p.f(list2);
            this.f13909u = gVar.f13883e + gVar.f13881c;
        }
        this.f13894e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f13909u, j) : Math.max(0L, this.f13909u + j) : -9223372036854775807L;
        this.f13895f = j >= 0;
        this.f13910v = iVar;
    }

    @Override // p012b2.a
    public final Object a(List list) {
        return this;
    }
}
