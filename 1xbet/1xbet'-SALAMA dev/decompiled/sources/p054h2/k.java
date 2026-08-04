package p054h2;

import A1.X;
import B.v;
import B1.p;
import C1.C0095a;
import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import F1.h;
import M1.d;
import P1.C;
import P1.C0370a;
import P1.C0372c;
import P1.C0373d;
import X1.c;
import Y4.D;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p032e2.j;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;
import p151v2.i;
import p151v2.s;
import p151v2.t;
import q6.a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends j {
    public static final AtomicInteger c0 = new AtomicInteger();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f13399B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f13400C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Uri f13401D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f13402E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f13403F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final InterfaceC0954m f13404G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0958q f13405H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final b f13406I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f13407J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f13408K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final s f13409L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final c f13410M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final List f13411N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final DrmInitData f13412O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final c f13413P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C0095a f13414Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final boolean f13415R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f13416S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public b f13417T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public r f13418U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f13419V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f13420W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public volatile boolean f13421X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13422Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public L f13423Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f13424a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f13425b0;

    public k(c cVar, InterfaceC0954m interfaceC0954m, C0958q c0958q, X x4, boolean z4, InterfaceC0954m interfaceC0954m2, C0958q c0958q2, boolean z7, Uri uri, List list, int i7, Object obj, long j, long j3, long j7, int i8, boolean z8, int i9, boolean z9, boolean z10, s sVar, DrmInitData drmInitData, b bVar, c cVar2, C0095a c0095a, boolean z11, p pVar) {
        super(interfaceC0954m, c0958q, x4, i7, obj, j, j3, j7);
        this.f13415R = z4;
        this.f13403F = i8;
        this.f13425b0 = z8;
        this.f13400C = i9;
        this.f13405H = c0958q2;
        this.f13404G = interfaceC0954m2;
        this.f13420W = c0958q2 != null;
        this.f13416S = z7;
        this.f13401D = uri;
        this.f13407J = z10;
        this.f13409L = sVar;
        this.f13408K = z9;
        this.f13410M = cVar;
        this.f13411N = list;
        this.f13412O = drmInitData;
        this.f13406I = bVar;
        this.f13413P = cVar2;
        this.f13414Q = c0095a;
        this.f13402E = z11;
        C0165x c0165x = AbstractC0167z.f2083b;
        this.f13423Z = L.f2000e;
        this.f13399B = c0.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (D.a0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p032e2.j
    public final boolean b() {
        throw null;
    }

    public final void c(InterfaceC0954m interfaceC0954m, C0958q c0958q, boolean z4, boolean z7) {
        C0958q c0958qA;
        long j;
        long j3;
        boolean z8 = false;
        if (z4) {
            z8 = this.f13419V != 0;
            c0958qA = c0958q;
        } else {
            c0958qA = c0958q.a(this.f13419V);
        }
        try {
            h hVarF = f(interfaceC0954m, c0958qA, z7);
            if (z8) {
                hVarF.q(this.f13419V);
            }
            while (!this.f13421X) {
                try {
                    try {
                        if (this.f13417T.f13366a.f(hVarF, b.f13365d) != 0) {
                            break;
                        }
                    } catch (EOFException e7) {
                        if ((this.f12602d.f308e & 16384) == 0) {
                            throw e7;
                        }
                        this.f13417T.f13366a.g(0L, 0L);
                        j = hVarF.f2534d;
                        j3 = c0958q.f16818e;
                    }
                } catch (Throwable th) {
                    this.f13419V = (int) (hVarF.f2534d - c0958q.f16818e);
                    throw th;
                }
            }
            j = hVarF.f2534d;
            j3 = c0958q.f16818e;
            this.f13419V = (int) (j - j3);
            a.b(interfaceC0954m);
        } catch (Throwable th2) {
            a.b(interfaceC0954m);
            throw th2;
        }
    }

    public final int e(int i7) {
        p151v2.a.h(!this.f13402E);
        if (i7 >= this.f13423Z.size()) {
            return 0;
        }
        return ((Integer) this.f13423Z.get(i7)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    public final h f(InterfaceC0954m interfaceC0954m, C0958q c0958q, boolean z4) throws InterruptedIOException {
        int i7;
        long jN;
        long j;
        b bVar;
        b bVar2;
        F1.k c0370a;
        boolean zA;
        boolean z7;
        List listSingletonList;
        int i8;
        F1.k dVar;
        long jO = interfaceC0954m.o(c0958q);
        int i9 = 1;
        if (z4) {
            try {
                s sVar = this.f13409L;
                boolean z8 = this.f13407J;
                long j3 = this.f12605x;
                synchronized (sVar) {
                    try {
                        p151v2.a.h(sVar.f17155a == 9223372036854775806L);
                        if (sVar.f17156b == -9223372036854775807L) {
                            if (z8) {
                                sVar.f17158d.set(Long.valueOf(j3));
                            } else {
                                while (sVar.f17156b == -9223372036854775807L) {
                                    sVar.wait();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        h hVar = new h(interfaceC0954m, c0958q.f16818e, jO);
        if (this.f13417T == null) {
            C0095a c0095a = this.f13414Q;
            hVar.f2536f = 0;
            try {
                c0095a.A(10);
                hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
                if (c0095a.v() != 4801587) {
                    jN = -9223372036854775807L;
                    break;
                }
                c0095a.E(3);
                int iS = c0095a.s();
                int i10 = iS + 10;
                byte[] bArr = (byte[]) c0095a.f1465c;
                if (i10 > bArr.length) {
                    c0095a.A(i10);
                    System.arraycopy(bArr, 0, (byte[]) c0095a.f1465c, 0, 10);
                }
                hVar.c((byte[]) c0095a.f1465c, 10, iS, false);
                Metadata metadataH0 = this.f13413P.h0(iS, (byte[]) c0095a.f1465c);
                if (metadataH0 == null) {
                    jN = -9223372036854775807L;
                    break;
                }
                Metadata.Entry[] entryArr = metadataH0.f10562a;
                int length = entryArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        jN = -9223372036854775807L;
                        break;
                    }
                    Metadata.Entry entry = entryArr[i11];
                    if (entry instanceof PrivFrame) {
                        PrivFrame privFrame = (PrivFrame) entry;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f10634b)) {
                            System.arraycopy(privFrame.f10635c, 0, (byte[]) c0095a.f1465c, 0, 8);
                            c0095a.D(0);
                            c0095a.C(8);
                            jN = c0095a.n() & 8589934591L;
                            break;
                        }
                    }
                    i11++;
                }
            } catch (EOFException unused2) {
            }
            hVar.f2536f = 0;
            b bVar3 = this.f13406I;
            if (bVar3 != null) {
                F1.k kVar = bVar3.f13366a;
                p151v2.a.h(!((kVar instanceof C) || (kVar instanceof N1.j)));
                F1.k kVar2 = bVar3.f13366a;
                boolean z9 = kVar2 instanceof s;
                s sVar2 = bVar3.f13368c;
                X x4 = bVar3.f13367b;
                if (z9) {
                    dVar = new s(x4.f306c, sVar2);
                } else if (kVar2 instanceof C0373d) {
                    dVar = new C0373d(0);
                } else if (kVar2 instanceof C0370a) {
                    dVar = new C0370a();
                } else if (kVar2 instanceof C0372c) {
                    dVar = new C0372c();
                } else {
                    if (!(kVar2 instanceof d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar2.getClass().getSimpleName()));
                    }
                    dVar = new d(0);
                }
                bVar2 = new b(dVar, x4, sVar2);
                j = jN;
                i7 = 0;
            } else {
                c cVar = this.f13410M;
                Uri uri = c0958q.f16814a;
                X x7 = this.f12602d;
                List list = this.f13411N;
                s sVar3 = this.f13409L;
                Map mapK = interfaceC0954m.k();
                cVar.getClass();
                int iR = p151v2.a.r(x7.f283C);
                List list2 = (List) mapK.get("Content-Type");
                int iR2 = p151v2.a.r((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                int iS2 = p151v2.a.s(uri);
                ArrayList arrayList = new ArrayList(7);
                c.a(arrayList, iR);
                c.a(arrayList, iR2);
                c.a(arrayList, iS2);
                int[] iArr = c.f13369b;
                for (int i12 = 0; i12 < 7; i12++) {
                    c.a(arrayList, iArr[i12]);
                }
                hVar.f2536f = 0;
                int i13 = 0;
                F1.k kVar3 = null;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        j = jN;
                        i7 = 0;
                        kVar3.getClass();
                        bVar = new b(kVar3, x7, sVar3);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i13)).intValue();
                    if (iIntValue == 0) {
                        j = jN;
                        arrayList = arrayList;
                        c0370a = new C0370a();
                    } else if (iIntValue == i9) {
                        j = jN;
                        arrayList = arrayList;
                        c0370a = new C0372c();
                    } else if (iIntValue == 2) {
                        j = jN;
                        arrayList = arrayList;
                        c0370a = new C0373d(0);
                    } else if (iIntValue == 7) {
                        j = jN;
                        arrayList = arrayList;
                        c0370a = new d(0, 0L);
                    } else if (iIntValue == 8) {
                        j = jN;
                        arrayList = arrayList;
                        Metadata metadata = x7.f281A;
                        if (metadata == null) {
                            z7 = false;
                            break;
                        }
                        int i14 = 0;
                        while (true) {
                            Metadata.Entry[] entryArr2 = metadata.f10562a;
                            if (i14 >= entryArr2.length) {
                                z7 = false;
                                break;
                            }
                            Metadata.Entry entry2 = entryArr2[i14];
                            if (entry2 instanceof HlsTrackMetadataEntry) {
                                z7 = !((HlsTrackMetadataEntry) entry2).f10694c.isEmpty();
                                break;
                            }
                            i14++;
                        }
                        c0370a = new N1.j(z7 ? 4 : 0, sVar3, list != null ? list : Collections.emptyList(), null);
                    } else if (iIntValue == 11) {
                        if (list != null) {
                            i8 = 48;
                            listSingletonList = list;
                        } else {
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10537k = "application/cea-608";
                            listSingletonList = Collections.singletonList(new X(format$Builder));
                            i8 = 16;
                        }
                        String str = x7.f312z;
                        if (TextUtils.isEmpty(str)) {
                            j = jN;
                        } else {
                            j = jN;
                            if (i.a(str, "audio/mp4a-latm") == null) {
                                i8 |= 2;
                            }
                            if (i.a(str, "video/avc") == null) {
                                i8 |= 4;
                            }
                        }
                        c0370a = new C(2, sVar3, new v(i8, listSingletonList, 5));
                    } else if (iIntValue != 13) {
                        j = jN;
                        arrayList = arrayList;
                        c0370a = null;
                    } else {
                        c0370a = new s(x7.f306c, sVar3);
                        j = jN;
                        arrayList = arrayList;
                    }
                    c0370a.getClass();
                    try {
                        zA = c0370a.a(hVar);
                        i7 = 0;
                        hVar.f2536f = 0;
                    } catch (EOFException unused3) {
                        i7 = 0;
                        hVar.f2536f = 0;
                        zA = false;
                    } catch (Throwable th2) {
                        hVar.f2536f = 0;
                        throw th2;
                    }
                    if (zA) {
                        bVar = new b(c0370a, x7, sVar3);
                        break;
                    }
                    if (kVar3 == null && (iIntValue == iR || iIntValue == iR2 || iIntValue == iS2 || iIntValue == 11)) {
                        kVar3 = c0370a;
                    }
                    i13++;
                    arrayList = arrayList;
                    jN = j;
                    i9 = 1;
                }
                bVar2 = bVar;
            }
            this.f13417T = bVar2;
            F1.k kVar4 = bVar2.f13366a;
            if ((((kVar4 instanceof C0373d) || (kVar4 instanceof C0370a) || (kVar4 instanceof C0372c) || (kVar4 instanceof d)) ? 1 : i7) != 0) {
                r rVar = this.f13418U;
                long jB = j != -9223372036854775807L ? this.f13409L.b(j) : this.f12605x;
                if (rVar.f13519m0 != jB) {
                    rVar.f13519m0 = jB;
                    q[] qVarArr = rVar.f13488M;
                    int length2 = qVarArr.length;
                    for (int i15 = i7; i15 < length2; i15++) {
                        q qVar = qVarArr[i15];
                        if (qVar.f10266F != jB) {
                            qVar.f10266F = jB;
                            qVar.f10292z = true;
                        }
                    }
                }
            } else {
                r rVar2 = this.f13418U;
                if (rVar2.f13519m0 != 0) {
                    rVar2.f13519m0 = 0L;
                    q[] qVarArr2 = rVar2.f13488M;
                    int length3 = qVarArr2.length;
                    for (int i16 = i7; i16 < length3; i16++) {
                        q qVar2 = qVarArr2[i16];
                        if (qVar2.f10266F != 0) {
                            qVar2.f10266F = 0L;
                            qVar2.f10292z = true;
                        }
                    }
                }
            }
            this.f13418U.f13490O.clear();
            this.f13417T.f13366a.e(this.f13418U);
        } else {
            i7 = 0;
        }
        r rVar3 = this.f13418U;
        DrmInitData drmInitData = this.f13412O;
        if (!t.a(rVar3.f13520n0, drmInitData)) {
            rVar3.f13520n0 = drmInitData;
            int i17 = i7;
            while (true) {
                q[] qVarArr3 = rVar3.f13488M;
                if (i17 >= qVarArr3.length) {
                    break;
                }
                if (rVar3.f13512f0[i17]) {
                    q qVar3 = qVarArr3[i17];
                    qVar3.f13474I = drmInitData;
                    qVar3.f10292z = true;
                }
                i17++;
            }
        }
        return hVar;
    }

    @Override // p146u2.H
    public final void l() {
        this.f13421X = true;
    }

    @Override // p146u2.H
    public final void load() {
        b bVar;
        this.f13418U.getClass();
        if (this.f13417T == null && (bVar = this.f13406I) != null) {
            F1.k kVar = bVar.f13366a;
            if ((kVar instanceof C) || (kVar instanceof N1.j)) {
                this.f13417T = bVar;
                this.f13420W = false;
            }
        }
        if (this.f13420W) {
            InterfaceC0954m interfaceC0954m = this.f13404G;
            interfaceC0954m.getClass();
            C0958q c0958q = this.f13405H;
            c0958q.getClass();
            c(interfaceC0954m, c0958q, this.f13416S, false);
            this.f13419V = 0;
            this.f13420W = false;
        }
        if (this.f13421X) {
            return;
        }
        if (!this.f13408K) {
            c(this.f12607z, this.f12600b, this.f13415R, true);
        }
        this.f13422Y = !this.f13421X;
    }
}
