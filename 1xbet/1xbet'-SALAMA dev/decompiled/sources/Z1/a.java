package Z1;

import C1.C0095a;
import F1.x;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p151v2.s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p097n3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0095a f7834g = new C0095a(4, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f7835h = new x();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f7836i;

    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    @Override // p097n3.a
    public final Metadata o(S1.c cVar, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        int i7;
        int i8;
        long j;
        ArrayList arrayList;
        long j3;
        long j7;
        boolean z4;
        boolean z7;
        boolean z8;
        int iY;
        int iT;
        int iT2;
        long jU;
        boolean z9;
        List list;
        long j8;
        long j9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        int i10;
        int iT3;
        boolean z14;
        long j10;
        int i11 = 32;
        boolean z15 = true;
        s sVar = this.f7836i;
        if (sVar != null) {
            long j11 = cVar.f6315z;
            synchronized (sVar) {
                j10 = sVar.f17156b;
            }
            if (j11 != j10) {
                s sVar2 = new s(cVar.f1699f);
                this.f7836i = sVar2;
                sVar2.a(cVar.f1699f - cVar.f6315z);
            }
        } else {
            s sVar3 = new s(cVar.f1699f);
            this.f7836i = sVar3;
            sVar3.a(cVar.f1699f - cVar.f6315z);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0095a c0095a = this.f7834g;
        c0095a.B(iLimit, bArrArray);
        x xVar = this.f7835h;
        xVar.n(iLimit, bArrArray);
        xVar.r(39);
        long jI = (((long) xVar.i(1)) << 32) | ((long) xVar.i(32));
        xVar.r(20);
        int i12 = xVar.i(12);
        int i13 = xVar.i(8);
        c0095a.E(14);
        if (i13 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (i13 != 255) {
            long j12 = 1;
            long jU2 = -9223372036854775807L;
            if (i13 == 4) {
                int iT4 = c0095a.t();
                ArrayList arrayList2 = new ArrayList(iT4);
                int i14 = 0;
                while (i14 < iT4) {
                    long jU3 = c0095a.u();
                    boolean z16 = (c0095a.t() & 128) != 0 ? z15 : false;
                    ArrayList arrayList3 = new ArrayList();
                    if (z16) {
                        i7 = i11;
                        i8 = i14;
                        j = j12;
                        arrayList = arrayList3;
                        j3 = -9223372036854775807L;
                        j7 = -9223372036854775807L;
                        z4 = false;
                        z7 = false;
                        z8 = false;
                        iY = 0;
                        iT = 0;
                        iT2 = 0;
                    } else {
                        int iT5 = c0095a.t();
                        boolean z17 = (iT5 & 128) != 0 ? z15 : false;
                        boolean z18 = (iT5 & 64) != 0 ? z15 : false;
                        boolean z19 = (iT5 & i11) != 0 ? z15 : false;
                        long jU4 = z18 ? c0095a.u() : -9223372036854775807L;
                        if (z18) {
                            i8 = i14;
                        } else {
                            int iT6 = c0095a.t();
                            ArrayList arrayList4 = new ArrayList(iT6);
                            int i15 = 0;
                            while (i15 < iT6) {
                                arrayList4.add(new c(c0095a.t(), c0095a.u()));
                                i15++;
                                i14 = i14;
                            }
                            i8 = i14;
                            arrayList3 = arrayList4;
                        }
                        if (z19) {
                            long jT = c0095a.t();
                            z9 = (jT & 128) != 0;
                            j = 1;
                            i7 = 32;
                            jU = ((((jT & 1) << 32) | c0095a.u()) * 1000) / 90;
                        } else {
                            i7 = 32;
                            j = 1;
                            jU = -9223372036854775807L;
                            z9 = false;
                        }
                        j7 = jU;
                        z8 = z9;
                        arrayList = arrayList3;
                        z4 = z17;
                        z7 = z18;
                        j3 = jU4;
                        iY = c0095a.y();
                        iT = c0095a.t();
                        iT2 = c0095a.t();
                    }
                    arrayList2.add(new d(jU3, z16, z4, z7, arrayList, j3, z8, j7, iY, iT, iT2));
                    i14 = i8 + 1;
                    z15 = true;
                    i11 = i7;
                    j12 = j;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList2);
            } else if (i13 == 5) {
                s sVar4 = this.f7836i;
                long jU5 = c0095a.u();
                boolean z20 = (c0095a.t() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z20) {
                    list = listEmptyList;
                    j8 = -9223372036854775807L;
                    j9 = -9223372036854775807L;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    i9 = 0;
                    i10 = 0;
                    iT3 = 0;
                } else {
                    int iT7 = c0095a.t();
                    boolean z21 = (iT7 & 128) != 0;
                    boolean z22 = (iT7 & 64) != 0;
                    boolean z23 = (iT7 & 32) != 0;
                    boolean z24 = (iT7 & 16) != 0;
                    long jA = (!z22 || z24) ? -9223372036854775807L : TimeSignalCommand.a(jI, c0095a);
                    if (!z22) {
                        int iT8 = c0095a.t();
                        ArrayList arrayList5 = new ArrayList(iT8);
                        for (int i16 = 0; i16 < iT8; i16++) {
                            int iT9 = c0095a.t();
                            long jA2 = !z24 ? TimeSignalCommand.a(jI, c0095a) : -9223372036854775807L;
                            arrayList5.add(new b(iT9, jA2, sVar4.b(jA2)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z23) {
                        long jT2 = c0095a.t();
                        z14 = (jT2 & 128) != 0;
                        jU2 = ((((jT2 & 1) << 32) | c0095a.u()) * 1000) / 90;
                    } else {
                        z14 = false;
                    }
                    int iY2 = c0095a.y();
                    int iT10 = c0095a.t();
                    z13 = z14;
                    i9 = iY2;
                    list = listEmptyList;
                    iT3 = c0095a.t();
                    i10 = iT10;
                    z10 = z21;
                    j9 = jU2;
                    j8 = jA;
                    z12 = z24;
                    z11 = z22;
                }
                spliceNullCommand = new SpliceInsertCommand(jU5, z20, z10, z11, z12, j8, sVar4.b(j8), list, z13, j9, i9, i10, iT3);
            } else if (i13 != 6) {
                spliceNullCommand = null;
            } else {
                s sVar5 = this.f7836i;
                long jA3 = TimeSignalCommand.a(jI, c0095a);
                spliceNullCommand = new TimeSignalCommand(jA3, sVar5.b(jA3));
            }
        } else {
            long jU6 = c0095a.u();
            int i17 = i12 - 4;
            byte[] bArr = new byte[i17];
            c0095a.f(bArr, 0, i17);
            spliceNullCommand = new PrivateCommand(jU6, bArr, jI);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
