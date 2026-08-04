package p146u2;

import A1.V;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p031e1.k;
import p151v2.a;

/* JADX INFO: renamed from: u2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0958q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f16813i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f16817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16821h;

    static {
        V.a("goog.exo.datasource");
    }

    public C0958q(Uri uri, int i7, byte[] bArr, Map map, long j, long j3, String str, int i8) {
        a.f(j >= 0);
        a.f(j >= 0);
        a.f(j3 > 0 || j3 == -1);
        this.f16814a = uri;
        this.f16815b = i7;
        this.f16816c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f16817d = Collections.unmodifiableMap(new HashMap(map));
        this.f16818e = j;
        this.f16819f = j3;
        this.f16820g = str;
        this.f16821h = i8;
    }

    public final C0958q a(long j) {
        long j3 = this.f16819f;
        long j7 = j3 != -1 ? j3 - j : -1L;
        if (j == 0 && j3 == j7) {
            return this;
        }
        return new C0958q(this.f16814a, this.f16815b, this.f16816c, this.f16817d, this.f16818e + j, j7, this.f16820g, this.f16821h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i7 = this.f16815b;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f16814a);
        sb.append(", ");
        sb.append(this.f16818e);
        sb.append(", ");
        sb.append(this.f16819f);
        sb.append(", ");
        sb.append(this.f16820g);
        sb.append(", ");
        return k.g(sb, this.f16821h, "]");
    }
}
