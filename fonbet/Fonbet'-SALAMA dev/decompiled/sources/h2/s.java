package h2;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import E4.y;
import F1.v;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s implements F1.k {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f13519g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f13520h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f13521a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.s f13522b;

    /* renamed from: d, reason: collision with root package name */
    public F1.m f13524d;

    /* renamed from: f, reason: collision with root package name */
    public int f13526f;

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f13523c = new C0095a(4, false);

    /* renamed from: e, reason: collision with root package name */
    public byte[] f13525e = new byte[1024];

    public s(String str, v2.s sVar) {
        this.f13521a = str;
        this.f13522b = sVar;
    }

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        F1.h hVar = (F1.h) lVar;
        hVar.c(this.f13525e, 0, 6, false);
        byte[] bArr = this.f13525e;
        C0095a c0095a = this.f13523c;
        c0095a.B(6, bArr);
        if (s2.j.a(c0095a)) {
            return true;
        }
        hVar.c(this.f13525e, 6, 3, false);
        c0095a.B(9, this.f13525e);
        return s2.j.a(c0095a);
    }

    public final v b(long j) {
        v r7 = this.f13524d.r(0, 3);
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "text/vtt";
        format$Builder.f10530c = this.f13521a;
        format$Builder.f10541o = j;
        r7.a(new X(format$Builder));
        this.f13524d.n();
        return r7;
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.f13524d = mVar;
        mVar.m(new F1.n(-9223372036854775807L));
    }

    @Override // F1.k
    public final int f(F1.l lVar, y yVar) {
        String h6;
        this.f13524d.getClass();
        int i7 = (int) ((F1.h) lVar).f2533c;
        int i8 = this.f13526f;
        byte[] bArr = this.f13525e;
        if (i8 == bArr.length) {
            this.f13525e = Arrays.copyOf(bArr, ((i7 != -1 ? i7 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f13525e;
        int i9 = this.f13526f;
        int read = ((F1.h) lVar).read(bArr2, i9, bArr2.length - i9);
        if (read != -1) {
            int i10 = this.f13526f + read;
            this.f13526f = i10;
            if (i7 == -1 || i10 != i7) {
                return 0;
            }
        }
        C0095a c0095a = new C0095a(this.f13525e);
        s2.j.d(c0095a);
        String h7 = c0095a.h();
        long j = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(h7)) {
                while (true) {
                    String h8 = c0095a.h();
                    if (h8 == null) {
                        break;
                    }
                    if (s2.j.f16144a.matcher(h8).matches()) {
                        do {
                            h6 = c0095a.h();
                            if (h6 != null) {
                            }
                        } while (!h6.isEmpty());
                    } else {
                        Matcher matcher2 = s2.h.f16138a.matcher(h8);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c3 = s2.j.c(group);
                long b7 = this.f13522b.b(((((j + c3) - j3) * 90000) / 1000000) % 8589934592L);
                v b8 = b(b7 - c3);
                byte[] bArr3 = this.f13525e;
                int i11 = this.f13526f;
                C0095a c0095a2 = this.f13523c;
                c0095a2.B(i11, bArr3);
                b8.c(this.f13526f, c0095a2);
                b8.e(b7, 1, this.f13526f, 0, null);
                return -1;
            }
            if (h7.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f13519g.matcher(h7);
                if (!matcher3.find()) {
                    throw C0045t0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(h7));
                }
                Matcher matcher4 = f13520h.matcher(h7);
                if (!matcher4.find()) {
                    throw C0045t0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(h7));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j3 = s2.j.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j = (Long.parseLong(group3) * 1000000) / 90000;
            }
            h7 = c0095a.h();
        }
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        throw new IllegalStateException();
    }

    @Override // F1.k
    public final void release() {
    }
}
