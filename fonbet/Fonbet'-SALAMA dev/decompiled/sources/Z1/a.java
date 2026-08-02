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
import n3.AbstractC1464a;
import v2.s;

/* loaded from: classes.dex */
public final class a extends AbstractC1464a {

    /* renamed from: g, reason: collision with root package name */
    public final C0095a f7834g = new C0095a(4, false);

    /* renamed from: h, reason: collision with root package name */
    public final x f7835h = new x();

    /* renamed from: i, reason: collision with root package name */
    public s f7836i;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r6 != r8) goto L14;
     */
    @Override // n3.AbstractC1464a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        int i9;
        int i10;
        int i11;
        long j8;
        boolean z9;
        List list;
        long j9;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        boolean z14;
        int i15 = 32;
        boolean z15 = true;
        s sVar = this.f7836i;
        if (sVar != null) {
            long j11 = cVar.f6315z;
            synchronized (sVar) {
                long j12 = sVar.f17150b;
            }
        }
        s sVar2 = new s(cVar.f1699f);
        this.f7836i = sVar2;
        sVar2.a(cVar.f1699f - cVar.f6315z);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C0095a c0095a = this.f7834g;
        c0095a.B(limit, array);
        x xVar = this.f7835h;
        xVar.n(limit, array);
        xVar.r(39);
        long i16 = (xVar.i(1) << 32) | xVar.i(32);
        xVar.r(20);
        int i17 = xVar.i(12);
        int i18 = xVar.i(8);
        c0095a.E(14);
        if (i18 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (i18 != 255) {
            long j13 = 1;
            long j14 = -9223372036854775807L;
            if (i18 == 4) {
                int t7 = c0095a.t();
                ArrayList arrayList2 = new ArrayList(t7);
                int i19 = 0;
                while (i19 < t7) {
                    long u4 = c0095a.u();
                    boolean z16 = (c0095a.t() & 128) != 0 ? z15 : false;
                    ArrayList arrayList3 = new ArrayList();
                    if (z16) {
                        i7 = i15;
                        i8 = i19;
                        j = j13;
                        arrayList = arrayList3;
                        j3 = -9223372036854775807L;
                        j7 = -9223372036854775807L;
                        z4 = false;
                        z7 = false;
                        z8 = false;
                        i9 = 0;
                        i10 = 0;
                        i11 = 0;
                    } else {
                        int t8 = c0095a.t();
                        boolean z17 = (t8 & 128) != 0 ? z15 : false;
                        boolean z18 = (t8 & 64) != 0 ? z15 : false;
                        boolean z19 = (t8 & i15) != 0 ? z15 : false;
                        long u7 = z18 ? c0095a.u() : -9223372036854775807L;
                        if (z18) {
                            i8 = i19;
                        } else {
                            int t9 = c0095a.t();
                            ArrayList arrayList4 = new ArrayList(t9);
                            int i20 = 0;
                            while (i20 < t9) {
                                arrayList4.add(new c(c0095a.t(), c0095a.u()));
                                i20++;
                                i19 = i19;
                            }
                            i8 = i19;
                            arrayList3 = arrayList4;
                        }
                        if (z19) {
                            long t10 = c0095a.t();
                            z9 = (t10 & 128) != 0;
                            j = 1;
                            i7 = 32;
                            j8 = ((((t10 & 1) << 32) | c0095a.u()) * 1000) / 90;
                        } else {
                            i7 = 32;
                            j = 1;
                            j8 = -9223372036854775807L;
                            z9 = false;
                        }
                        j7 = j8;
                        z8 = z9;
                        arrayList = arrayList3;
                        z4 = z17;
                        z7 = z18;
                        j3 = u7;
                        i9 = c0095a.y();
                        i10 = c0095a.t();
                        i11 = c0095a.t();
                    }
                    arrayList2.add(new d(u4, z16, z4, z7, arrayList, j3, z8, j7, i9, i10, i11));
                    i19 = i8 + 1;
                    z15 = true;
                    i15 = i7;
                    j13 = j;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList2);
            } else if (i18 == 5) {
                s sVar3 = this.f7836i;
                long u8 = c0095a.u();
                boolean z20 = (c0095a.t() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (z20) {
                    list = emptyList;
                    j9 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                } else {
                    int t11 = c0095a.t();
                    boolean z21 = (t11 & 128) != 0;
                    boolean z22 = (t11 & 64) != 0;
                    boolean z23 = (t11 & 32) != 0;
                    boolean z24 = (t11 & 16) != 0;
                    long a2 = (!z22 || z24) ? -9223372036854775807L : TimeSignalCommand.a(i16, c0095a);
                    if (!z22) {
                        int t12 = c0095a.t();
                        ArrayList arrayList5 = new ArrayList(t12);
                        for (int i21 = 0; i21 < t12; i21++) {
                            int t13 = c0095a.t();
                            long a4 = !z24 ? TimeSignalCommand.a(i16, c0095a) : -9223372036854775807L;
                            arrayList5.add(new b(t13, a4, sVar3.b(a4)));
                        }
                        emptyList = arrayList5;
                    }
                    if (z23) {
                        long t14 = c0095a.t();
                        z14 = (t14 & 128) != 0;
                        j14 = ((((t14 & 1) << 32) | c0095a.u()) * 1000) / 90;
                    } else {
                        z14 = false;
                    }
                    int y4 = c0095a.y();
                    int t15 = c0095a.t();
                    z13 = z14;
                    i12 = y4;
                    list = emptyList;
                    i14 = c0095a.t();
                    i13 = t15;
                    z10 = z21;
                    j10 = j14;
                    j9 = a2;
                    z12 = z24;
                    z11 = z22;
                }
                spliceNullCommand = new SpliceInsertCommand(u8, z20, z10, z11, z12, j9, sVar3.b(j9), list, z13, j10, i12, i13, i14);
            } else if (i18 != 6) {
                spliceNullCommand = null;
            } else {
                s sVar4 = this.f7836i;
                long a7 = TimeSignalCommand.a(i16, c0095a);
                spliceNullCommand = new TimeSignalCommand(a7, sVar4.b(a7));
            }
        } else {
            long u9 = c0095a.u();
            int i22 = i17 - 4;
            byte[] bArr = new byte[i22];
            c0095a.f(bArr, 0, i22);
            spliceNullCommand = new PrivateCommand(u9, bArr, i16);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
