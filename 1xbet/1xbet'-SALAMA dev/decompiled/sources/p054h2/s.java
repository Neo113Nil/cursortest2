package p054h2;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import E4.y;
import F1.h;
import F1.k;
import F1.l;
import F1.m;
import F1.n;
import F1.v;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format$Builder;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p132s2.j;

/* JADX INFO: loaded from: classes.dex */
public final class s implements k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f13525g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f13526h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p151v2.s f13528b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f13530d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13532f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f13529c = new C0095a(4, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f13531e = new byte[1024];

    public s(String str, p151v2.s sVar) {
        this.f13527a = str;
        this.f13528b = sVar;
    }

    @Override // F1.k
    public final boolean a(l lVar) {
        h hVar = (h) lVar;
        hVar.c(this.f13531e, 0, 6, false);
        byte[] bArr = this.f13531e;
        C0095a c0095a = this.f13529c;
        c0095a.B(6, bArr);
        if (j.a(c0095a)) {
            return true;
        }
        hVar.c(this.f13531e, 6, 3, false);
        c0095a.B(9, this.f13531e);
        return j.a(c0095a);
    }

    public final v b(long j) {
        v vVarR = this.f13530d.r(0, 3);
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "text/vtt";
        format$Builder.f10530c = this.f13527a;
        format$Builder.f10541o = j;
        vVarR.a(new X(format$Builder));
        this.f13530d.n();
        return vVarR;
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f13530d = mVar;
        mVar.m(new n(-9223372036854775807L));
    }

    @Override // F1.k
    public final int f(l lVar, y yVar) throws C0045t0, EOFException, InterruptedIOException {
        String strH;
        this.f13530d.getClass();
        int i7 = (int) ((h) lVar).f2533c;
        int i8 = this.f13532f;
        byte[] bArr = this.f13531e;
        if (i8 == bArr.length) {
            this.f13531e = Arrays.copyOf(bArr, ((i7 != -1 ? i7 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f13531e;
        int i9 = this.f13532f;
        int i10 = ((h) lVar).read(bArr2, i9, bArr2.length - i9);
        if (i10 != -1) {
            int i11 = this.f13532f + i10;
            this.f13532f = i11;
            if (i7 == -1 || i11 != i7) {
                return 0;
            }
        }
        C0095a c0095a = new C0095a(this.f13531e);
        j.d(c0095a);
        String strH2 = c0095a.h();
        long j = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = c0095a.h();
                    if (strH3 == null) {
                        break;
                    }
                    if (j.f16150a.matcher(strH3).matches()) {
                        do {
                            strH = c0095a.h();
                            if (strH == null) {
                                break;
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = p132s2.h.f16144a.matcher(strH3);
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
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = j.c(strGroup);
                long jB = this.f13528b.b(((((j + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                v vVarB = b(jB - jC2);
                byte[] bArr3 = this.f13531e;
                int i12 = this.f13532f;
                C0095a c0095a2 = this.f13529c;
                c0095a2.B(i12, bArr3);
                vVarB.c(this.f13532f, c0095a2);
                vVarB.e(jB, 1, this.f13532f, 0, null);
                return -1;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f13525g.matcher(strH2);
                if (!matcher3.find()) {
                    throw C0045t0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2));
                }
                Matcher matcher4 = f13526h.matcher(strH2);
                if (!matcher4.find()) {
                    throw C0045t0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = j.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strH2 = c0095a.h();
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
