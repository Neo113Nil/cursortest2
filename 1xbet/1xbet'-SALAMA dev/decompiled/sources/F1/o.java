package F1;

import A1.X;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Collections;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2557i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final P2 f2558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Metadata f2559l;

    public o(byte[] bArr, int i7) {
        x xVar = new x(bArr, bArr.length);
        xVar.o(i7 * 8);
        this.f2549a = xVar.i(16);
        this.f2550b = xVar.i(16);
        this.f2551c = xVar.i(24);
        this.f2552d = xVar.i(24);
        int i8 = xVar.i(20);
        this.f2553e = i8;
        this.f2554f = d(i8);
        this.f2555g = xVar.i(3) + 1;
        int i9 = xVar.i(5) + 1;
        this.f2556h = i9;
        this.f2557i = a(i9);
        int i10 = xVar.i(4);
        int i11 = xVar.i(32);
        int i12 = p151v2.t.f17159a;
        this.j = ((((long) i10) & 4294967295L) << 32) | (((long) i11) & 4294967295L);
        this.f2558k = null;
        this.f2559l = null;
    }

    public static int a(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f2553e);
    }

    public final X c(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i7 = this.f2552d;
        if (i7 <= 0) {
            i7 = -1;
        }
        Metadata metadata2 = this.f2559l;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f10562a;
                if (entryArr.length != 0) {
                    int i8 = p151v2.t.f17159a;
                    Metadata.Entry[] entryArr2 = metadata2.f10562a;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata2 = new Metadata((Metadata.Entry[]) objArrCopyOf);
                }
            }
            metadata = metadata2;
        }
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "audio/flac";
        format$Builder.f10538l = i7;
        format$Builder.f10550x = this.f2555g;
        format$Builder.f10551y = this.f2553e;
        format$Builder.f10539m = Collections.singletonList(bArr);
        format$Builder.f10536i = metadata;
        return new X(format$Builder);
    }

    public o(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, P2 p5, Metadata metadata) {
        this.f2549a = i7;
        this.f2550b = i8;
        this.f2551c = i9;
        this.f2552d = i10;
        this.f2553e = i11;
        this.f2554f = d(i11);
        this.f2555g = i12;
        this.f2556h = i13;
        this.f2557i = a(i13);
        this.j = j;
        this.f2558k = p5;
        this.f2559l = metadata;
    }
}
