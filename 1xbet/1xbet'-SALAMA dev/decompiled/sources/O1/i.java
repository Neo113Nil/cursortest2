package O1;

import A1.X;
import C1.AbstractC0096b;
import C1.C0095a;
import E3.AbstractC0167z;
import F1.z;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import p151v2.t;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f4954o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f4955p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4956n;

    public static boolean e(C0095a c0095a, byte[] bArr) {
        if (c0095a.d() < bArr.length) {
            return false;
        }
        int i7 = c0095a.f1463a;
        byte[] bArr2 = new byte[bArr.length];
        c0095a.f(bArr2, 0, bArr.length);
        c0095a.D(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // O1.j
    public final long b(C0095a c0095a) {
        int i7;
        int i8;
        byte[] bArr = (byte[]) c0095a.f1465c;
        byte b7 = bArr[0];
        int i9 = b7 & 255;
        int i10 = b7 & 3;
        if (i10 != 0) {
            i7 = 2;
            if (i10 != 1 && i10 != 2) {
                i7 = bArr[1] & 63;
            }
        } else {
            i7 = 1;
        }
        int i11 = i9 >> 3;
        int i12 = i11 & 3;
        if (i11 >= 16) {
            i8 = 2500 << i12;
        } else if (i11 >= 12) {
            i8 = 10000 << (i11 & 1);
        } else {
            i8 = i12 == 3 ? 60000 : 10000 << i12;
        }
        return (((long) this.f4965i) * (((long) i7) * ((long) i8))) / 1000000;
    }

    @Override // O1.j
    public final boolean c(C0095a c0095a, long j, P2 p5) {
        if (e(c0095a, f4954o)) {
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) c0095a.f1465c, c0095a.f1464b);
            int i7 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = AbstractC0096b.a(bArrCopyOf);
            if (((X) p5.f17514b) != null) {
                return true;
            }
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10537k = "audio/opus";
            format$Builder.f10550x = i7;
            format$Builder.f10551y = 48000;
            format$Builder.f10539m = arrayListA;
            p5.f17514b = new X(format$Builder);
            return true;
        }
        if (!e(c0095a, f4955p)) {
            p151v2.a.i((X) p5.f17514b);
            return false;
        }
        p151v2.a.i((X) p5.f17514b);
        if (this.f4956n) {
            return true;
        }
        this.f4956n = true;
        c0095a.E(8);
        Metadata metadataB = z.b(AbstractC0167z.F((String[]) z.c(c0095a, false, false).f17938b));
        if (metadataB == null) {
            return true;
        }
        Format$Builder format$BuilderA = ((X) p5.f17514b).a();
        Metadata metadata = ((X) p5.f17514b).f281A;
        if (metadata != null) {
            Metadata.Entry[] entryArr = metadata.f10562a;
            if (entryArr.length != 0) {
                int i8 = t.f17159a;
                Metadata.Entry[] entryArr2 = metadataB.f10562a;
                Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                metadataB = new Metadata((Metadata.Entry[]) objArrCopyOf);
            }
        }
        format$BuilderA.f10536i = metadataB;
        p5.f17514b = new X(format$BuilderA);
        return true;
    }

    @Override // O1.j
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f4956n = false;
        }
    }
}
