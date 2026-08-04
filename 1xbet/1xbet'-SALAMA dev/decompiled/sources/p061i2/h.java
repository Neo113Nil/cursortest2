package p061i2;

import com.google.android.exoplayer2.drm.DrmInitData;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f13877A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f13878B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DrmInitData f13884f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f13885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f13886y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f13887z;

    public h(String str, g gVar, long j, int i7, long j3, DrmInitData drmInitData, String str2, String str3, long j7, long j8, boolean z4) {
        this.f13879a = str;
        this.f13880b = gVar;
        this.f13881c = j;
        this.f13882d = i7;
        this.f13883e = j3;
        this.f13884f = drmInitData;
        this.f13885x = str2;
        this.f13886y = str3;
        this.f13887z = j7;
        this.f13877A = j8;
        this.f13878B = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l7 = (Long) obj;
        long jLongValue = l7.longValue();
        long j = this.f13883e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l7.longValue() ? -1 : 0;
    }
}
