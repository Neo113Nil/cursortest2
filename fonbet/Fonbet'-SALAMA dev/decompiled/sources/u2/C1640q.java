package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v2.AbstractC1664a;

/* renamed from: u2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1640q {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f16807i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16808a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16809b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16810c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f16811d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16812e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16813f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16814g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16815h;

    static {
        A1.V.a("goog.exo.datasource");
    }

    public C1640q(Uri uri, int i7, byte[] bArr, Map map, long j, long j3, String str, int i8) {
        AbstractC1664a.f(j >= 0);
        AbstractC1664a.f(j >= 0);
        AbstractC1664a.f(j3 > 0 || j3 == -1);
        this.f16808a = uri;
        this.f16809b = i7;
        this.f16810c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f16811d = Collections.unmodifiableMap(new HashMap(map));
        this.f16812e = j;
        this.f16813f = j3;
        this.f16814g = str;
        this.f16815h = i8;
    }

    public final C1640q a(long j) {
        long j3 = this.f16813f;
        long j7 = j3 != -1 ? j3 - j : -1L;
        if (j == 0 && j3 == j7) {
            return this;
        }
        return new C1640q(this.f16808a, this.f16809b, this.f16810c, this.f16811d, this.f16812e + j, j7, this.f16814g, this.f16815h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i7 = this.f16809b;
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
        sb.append(this.f16808a);
        sb.append(", ");
        sb.append(this.f16812e);
        sb.append(", ");
        sb.append(this.f16813f);
        sb.append(", ");
        sb.append(this.f16814g);
        sb.append(", ");
        return e1.k.g(sb, this.f16815h, "]");
    }
}
