package i2;

import com.google.android.exoplayer2.drm.DrmInitData;

/* renamed from: i2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1252h implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final long f13871A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f13872B;

    /* renamed from: a, reason: collision with root package name */
    public final String f13873a;

    /* renamed from: b, reason: collision with root package name */
    public final C1251g f13874b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13876d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13877e;

    /* renamed from: f, reason: collision with root package name */
    public final DrmInitData f13878f;

    /* renamed from: x, reason: collision with root package name */
    public final String f13879x;

    /* renamed from: y, reason: collision with root package name */
    public final String f13880y;

    /* renamed from: z, reason: collision with root package name */
    public final long f13881z;

    public AbstractC1252h(String str, C1251g c1251g, long j, int i7, long j3, DrmInitData drmInitData, String str2, String str3, long j7, long j8, boolean z4) {
        this.f13873a = str;
        this.f13874b = c1251g;
        this.f13875c = j;
        this.f13876d = i7;
        this.f13877e = j3;
        this.f13878f = drmInitData;
        this.f13879x = str2;
        this.f13880y = str3;
        this.f13881z = j7;
        this.f13871A = j8;
        this.f13872B = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l7 = (Long) obj;
        long longValue = l7.longValue();
        long j = this.f13877e;
        if (j > longValue) {
            return 1;
        }
        return j < l7.longValue() ? -1 : 0;
    }
}
