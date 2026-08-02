package M4;

import L4.z;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final z f3635a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3636b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3637c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3638d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3639e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3640g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3641h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3642j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f3643k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f3644l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f3645m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f3646n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f3647o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f3648p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f3649q;

    public g(z zVar, boolean z3, String str, long j5, long j6, long j7, int i, long j8, int i5, int i6, Long l5, Long l6, Long l7, Integer num, Integer num2, Integer num3) {
        l.f("canonicalPath", zVar);
        l.f("comment", str);
        this.f3635a = zVar;
        this.f3636b = z3;
        this.f3637c = str;
        this.f3638d = j5;
        this.f3639e = j6;
        this.f = j7;
        this.f3640g = i;
        this.f3641h = j8;
        this.i = i5;
        this.f3642j = i6;
        this.f3643k = l5;
        this.f3644l = l6;
        this.f3645m = l7;
        this.f3646n = num;
        this.f3647o = num2;
        this.f3648p = num3;
        this.f3649q = new ArrayList();
    }

    public /* synthetic */ g(z zVar, boolean z3, String str, long j5, long j6, long j7, int i, long j8, int i5, int i6, Long l5, Long l6, Long l7, int i7) {
        this(zVar, z3, (i7 & 4) != 0 ? "" : str, (i7 & 8) != 0 ? -1L : j5, (i7 & 16) != 0 ? -1L : j6, (i7 & 32) != 0 ? -1L : j7, (i7 & 64) != 0 ? -1 : i, (i7 & 128) != 0 ? -1L : j8, (i7 & 256) != 0 ? -1 : i5, (i7 & 512) != 0 ? -1 : i6, (i7 & 1024) != 0 ? null : l5, (i7 & 2048) != 0 ? null : l6, (i7 & 4096) != 0 ? null : l7, null, null, null);
    }
}
