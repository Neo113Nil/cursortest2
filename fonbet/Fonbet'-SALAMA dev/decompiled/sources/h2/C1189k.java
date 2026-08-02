package h2;

import A1.X;
import B.v;
import C1.C0095a;
import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import P1.C;
import P1.C0370a;
import P1.C0372c;
import P1.C0373d;
import Y4.D;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import e2.AbstractC1013j;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import u2.C1640q;
import u2.InterfaceC1636m;
import v2.AbstractC1664a;
import v2.t;

/* renamed from: h2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189k extends AbstractC1013j {
    public static final AtomicInteger c0 = new AtomicInteger();

    /* renamed from: B, reason: collision with root package name */
    public final int f13393B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13394C;

    /* renamed from: D, reason: collision with root package name */
    public final Uri f13395D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f13396E;

    /* renamed from: F, reason: collision with root package name */
    public final int f13397F;

    /* renamed from: G, reason: collision with root package name */
    public final InterfaceC1636m f13398G;

    /* renamed from: H, reason: collision with root package name */
    public final C1640q f13399H;

    /* renamed from: I, reason: collision with root package name */
    public final C1180b f13400I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f13401J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f13402K;

    /* renamed from: L, reason: collision with root package name */
    public final v2.s f13403L;

    /* renamed from: M, reason: collision with root package name */
    public final C1181c f13404M;

    /* renamed from: N, reason: collision with root package name */
    public final List f13405N;

    /* renamed from: O, reason: collision with root package name */
    public final DrmInitData f13406O;

    /* renamed from: P, reason: collision with root package name */
    public final X1.c f13407P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0095a f13408Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f13409R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean f13410S;

    /* renamed from: T, reason: collision with root package name */
    public C1180b f13411T;

    /* renamed from: U, reason: collision with root package name */
    public C1196r f13412U;

    /* renamed from: V, reason: collision with root package name */
    public int f13413V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f13414W;

    /* renamed from: X, reason: collision with root package name */
    public volatile boolean f13415X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f13416Y;

    /* renamed from: Z, reason: collision with root package name */
    public L f13417Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f13418a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f13419b0;

    public C1189k(C1181c c1181c, InterfaceC1636m interfaceC1636m, C1640q c1640q, X x4, boolean z4, InterfaceC1636m interfaceC1636m2, C1640q c1640q2, boolean z7, Uri uri, List list, int i7, Object obj, long j, long j3, long j7, int i8, boolean z8, int i9, boolean z9, boolean z10, v2.s sVar, DrmInitData drmInitData, C1180b c1180b, X1.c cVar, C0095a c0095a, boolean z11, B1.p pVar) {
        super(interfaceC1636m, c1640q, x4, i7, obj, j, j3, j7);
        this.f13409R = z4;
        this.f13397F = i8;
        this.f13419b0 = z8;
        this.f13394C = i9;
        this.f13399H = c1640q2;
        this.f13398G = interfaceC1636m2;
        this.f13414W = c1640q2 != null;
        this.f13410S = z7;
        this.f13395D = uri;
        this.f13401J = z10;
        this.f13403L = sVar;
        this.f13402K = z9;
        this.f13404M = c1181c;
        this.f13405N = list;
        this.f13406O = drmInitData;
        this.f13400I = c1180b;
        this.f13407P = cVar;
        this.f13408Q = c0095a;
        this.f13396E = z11;
        C0165x c0165x = AbstractC0167z.f2083b;
        this.f13417Z = L.f2000e;
        this.f13393B = c0.getAndIncrement();
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

    @Override // e2.AbstractC1013j
    public final boolean b() {
        throw null;
    }

    public final void c(InterfaceC1636m interfaceC1636m, C1640q c1640q, boolean z4, boolean z7) {
        C1640q a2;
        long j;
        long j3;
        if (z4) {
            r0 = this.f13413V != 0;
            a2 = c1640q;
        } else {
            a2 = c1640q.a(this.f13413V);
        }
        try {
            F1.h f7 = f(interfaceC1636m, a2, z7);
            if (r0) {
                f7.q(this.f13413V);
            }
            while (!this.f13415X) {
                try {
                    try {
                        if (this.f13411T.f13360a.f(f7, C1180b.f13359d) != 0) {
                            break;
                        }
                    } catch (EOFException e7) {
                        if ((this.f12596d.f308e & 16384) == 0) {
                            throw e7;
                        }
                        this.f13411T.f13360a.g(0L, 0L);
                        j = f7.f2534d;
                        j3 = c1640q.f16812e;
                    }
                } catch (Throwable th) {
                    this.f13413V = (int) (f7.f2534d - c1640q.f16812e);
                    throw th;
                }
            }
            j = f7.f2534d;
            j3 = c1640q.f16812e;
            this.f13413V = (int) (j - j3);
        } finally {
            q6.a.b(interfaceC1636m);
        }
    }

    public final int e(int i7) {
        AbstractC1664a.h(!this.f13396E);
        if (i7 >= this.f13417Z.size()) {
            return 0;
        }
        return ((Integer) this.f13417Z.get(i7)).intValue();
    }

    public final F1.h f(InterfaceC1636m interfaceC1636m, C1640q c1640q, boolean z4) {
        int i7;
        long j;
        long j3;
        C1180b c1180b;
        C1180b c1180b2;
        ArrayList arrayList;
        F1.k c0370a;
        boolean z7;
        boolean z8;
        List singletonList;
        int i8;
        F1.k dVar;
        long o7 = interfaceC1636m.o(c1640q);
        int i9 = 1;
        if (z4) {
            try {
                v2.s sVar = this.f13403L;
                boolean z9 = this.f13401J;
                long j7 = this.f12599x;
                synchronized (sVar) {
                    try {
                        AbstractC1664a.h(sVar.f17149a == 9223372036854775806L);
                        if (sVar.f17150b == -9223372036854775807L) {
                            if (z9) {
                                sVar.f17152d.set(Long.valueOf(j7));
                            } else {
                                while (sVar.f17150b == -9223372036854775807L) {
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
        F1.h hVar = new F1.h(interfaceC1636m, c1640q.f16812e, o7);
        if (this.f13411T == null) {
            C0095a c0095a = this.f13408Q;
            hVar.f2536f = 0;
            try {
                c0095a.A(10);
                hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
                if (c0095a.v() == 4801587) {
                    c0095a.E(3);
                    int s7 = c0095a.s();
                    int i10 = s7 + 10;
                    byte[] bArr = (byte[]) c0095a.f1465c;
                    if (i10 > bArr.length) {
                        c0095a.A(i10);
                        System.arraycopy(bArr, 0, (byte[]) c0095a.f1465c, 0, 10);
                    }
                    hVar.c((byte[]) c0095a.f1465c, 10, s7, false);
                    Metadata h02 = this.f13407P.h0(s7, (byte[]) c0095a.f1465c);
                    if (h02 != null) {
                        for (Metadata.Entry entry : h02.f10562a) {
                            if (entry instanceof PrivFrame) {
                                PrivFrame privFrame = (PrivFrame) entry;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f10634b)) {
                                    System.arraycopy(privFrame.f10635c, 0, (byte[]) c0095a.f1465c, 0, 8);
                                    c0095a.D(0);
                                    c0095a.C(8);
                                    j = c0095a.n() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j = -9223372036854775807L;
            hVar.f2536f = 0;
            C1180b c1180b3 = this.f13400I;
            if (c1180b3 != null) {
                F1.k kVar = c1180b3.f13360a;
                AbstractC1664a.h(!((kVar instanceof C) || (kVar instanceof N1.j)));
                F1.k kVar2 = c1180b3.f13360a;
                boolean z10 = kVar2 instanceof s;
                v2.s sVar2 = c1180b3.f13362c;
                X x4 = c1180b3.f13361b;
                if (z10) {
                    dVar = new s(x4.f306c, sVar2);
                } else if (kVar2 instanceof C0373d) {
                    dVar = new C0373d(0);
                } else if (kVar2 instanceof C0370a) {
                    dVar = new C0370a();
                } else if (kVar2 instanceof C0372c) {
                    dVar = new C0372c();
                } else {
                    if (!(kVar2 instanceof M1.d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar2.getClass().getSimpleName()));
                    }
                    dVar = new M1.d(0);
                }
                c1180b2 = new C1180b(dVar, x4, sVar2);
                j3 = j;
                i7 = 0;
            } else {
                C1181c c1181c = this.f13404M;
                Uri uri = c1640q.f16808a;
                X x7 = this.f12596d;
                List list = this.f13405N;
                v2.s sVar3 = this.f13403L;
                Map k7 = interfaceC1636m.k();
                c1181c.getClass();
                int r7 = AbstractC1664a.r(x7.f283C);
                List list2 = (List) k7.get("Content-Type");
                int r8 = AbstractC1664a.r((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                int s8 = AbstractC1664a.s(uri);
                ArrayList arrayList2 = new ArrayList(7);
                C1181c.a(arrayList2, r7);
                C1181c.a(arrayList2, r8);
                C1181c.a(arrayList2, s8);
                int[] iArr = C1181c.f13363b;
                for (int i11 = 0; i11 < 7; i11++) {
                    C1181c.a(arrayList2, iArr[i11]);
                }
                hVar.f2536f = 0;
                int i12 = 0;
                F1.k kVar3 = null;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        j3 = j;
                        i7 = 0;
                        kVar3.getClass();
                        c1180b = new C1180b(kVar3, x7, sVar3);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i12)).intValue();
                    if (intValue == 0) {
                        j3 = j;
                        arrayList = arrayList2;
                        c0370a = new C0370a();
                    } else if (intValue == i9) {
                        j3 = j;
                        arrayList = arrayList2;
                        c0370a = new C0372c();
                    } else if (intValue == 2) {
                        j3 = j;
                        arrayList = arrayList2;
                        c0370a = new C0373d(0);
                    } else if (intValue == 7) {
                        j3 = j;
                        arrayList = arrayList2;
                        c0370a = new M1.d(0, 0L);
                    } else if (intValue == 8) {
                        j3 = j;
                        arrayList = arrayList2;
                        Metadata metadata = x7.f281A;
                        if (metadata != null) {
                            int i13 = 0;
                            while (true) {
                                Metadata.Entry[] entryArr = metadata.f10562a;
                                if (i13 >= entryArr.length) {
                                    break;
                                }
                                Metadata.Entry entry2 = entryArr[i13];
                                if (entry2 instanceof HlsTrackMetadataEntry) {
                                    z8 = !((HlsTrackMetadataEntry) entry2).f10694c.isEmpty();
                                    break;
                                }
                                i13++;
                            }
                        }
                        z8 = false;
                        c0370a = new N1.j(z8 ? 4 : 0, sVar3, list != null ? list : Collections.emptyList(), null);
                    } else if (intValue == 11) {
                        if (list != null) {
                            i8 = 48;
                            arrayList = arrayList2;
                            singletonList = list;
                        } else {
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10537k = "application/cea-608";
                            arrayList = arrayList2;
                            singletonList = Collections.singletonList(new X(format$Builder));
                            i8 = 16;
                        }
                        String str = x7.f312z;
                        if (TextUtils.isEmpty(str)) {
                            j3 = j;
                        } else {
                            j3 = j;
                            if (v2.i.a(str, "audio/mp4a-latm") == null) {
                                i8 |= 2;
                            }
                            if (v2.i.a(str, "video/avc") == null) {
                                i8 |= 4;
                            }
                        }
                        c0370a = new C(2, sVar3, new v(i8, singletonList, 5));
                    } else if (intValue != 13) {
                        j3 = j;
                        arrayList = arrayList2;
                        c0370a = null;
                    } else {
                        c0370a = new s(x7.f306c, sVar3);
                        j3 = j;
                        arrayList = arrayList2;
                    }
                    c0370a.getClass();
                    try {
                        z7 = c0370a.a(hVar);
                        i7 = 0;
                        hVar.f2536f = 0;
                    } catch (EOFException unused3) {
                        i7 = 0;
                        hVar.f2536f = 0;
                        z7 = false;
                    } catch (Throwable th2) {
                        hVar.f2536f = 0;
                        throw th2;
                    }
                    if (z7) {
                        c1180b = new C1180b(c0370a, x7, sVar3);
                        break;
                    }
                    if (kVar3 == null && (intValue == r7 || intValue == r8 || intValue == s8 || intValue == 11)) {
                        kVar3 = c0370a;
                    }
                    i12++;
                    arrayList2 = arrayList;
                    j = j3;
                    i9 = 1;
                }
                c1180b2 = c1180b;
            }
            this.f13411T = c1180b2;
            F1.k kVar4 = c1180b2.f13360a;
            if ((((kVar4 instanceof C0373d) || (kVar4 instanceof C0370a) || (kVar4 instanceof C0372c) || (kVar4 instanceof M1.d)) ? 1 : i7) != 0) {
                C1196r c1196r = this.f13412U;
                long b7 = j3 != -9223372036854775807L ? this.f13403L.b(j3) : this.f12599x;
                if (c1196r.f13513m0 != b7) {
                    c1196r.f13513m0 = b7;
                    C1195q[] c1195qArr = c1196r.f13482M;
                    int length = c1195qArr.length;
                    for (int i14 = i7; i14 < length; i14++) {
                        C1195q c1195q = c1195qArr[i14];
                        if (c1195q.f10266F != b7) {
                            c1195q.f10266F = b7;
                            c1195q.f10292z = true;
                        }
                    }
                }
            } else {
                C1196r c1196r2 = this.f13412U;
                if (c1196r2.f13513m0 != 0) {
                    c1196r2.f13513m0 = 0L;
                    C1195q[] c1195qArr2 = c1196r2.f13482M;
                    int length2 = c1195qArr2.length;
                    for (int i15 = i7; i15 < length2; i15++) {
                        C1195q c1195q2 = c1195qArr2[i15];
                        if (c1195q2.f10266F != 0) {
                            c1195q2.f10266F = 0L;
                            c1195q2.f10292z = true;
                        }
                    }
                }
            }
            this.f13412U.f13484O.clear();
            this.f13411T.f13360a.e(this.f13412U);
        } else {
            i7 = 0;
        }
        C1196r c1196r3 = this.f13412U;
        DrmInitData drmInitData = this.f13406O;
        if (!t.a(c1196r3.f13514n0, drmInitData)) {
            c1196r3.f13514n0 = drmInitData;
            int i16 = i7;
            while (true) {
                C1195q[] c1195qArr3 = c1196r3.f13482M;
                if (i16 >= c1195qArr3.length) {
                    break;
                }
                if (c1196r3.f13506f0[i16]) {
                    C1195q c1195q3 = c1195qArr3[i16];
                    c1195q3.f13468I = drmInitData;
                    c1195q3.f10292z = true;
                }
                i16++;
            }
        }
        return hVar;
    }

    @Override // u2.H
    public final void l() {
        this.f13415X = true;
    }

    @Override // u2.H
    public final void load() {
        C1180b c1180b;
        this.f13412U.getClass();
        if (this.f13411T == null && (c1180b = this.f13400I) != null) {
            F1.k kVar = c1180b.f13360a;
            if ((kVar instanceof C) || (kVar instanceof N1.j)) {
                this.f13411T = c1180b;
                this.f13414W = false;
            }
        }
        if (this.f13414W) {
            InterfaceC1636m interfaceC1636m = this.f13398G;
            interfaceC1636m.getClass();
            C1640q c1640q = this.f13399H;
            c1640q.getClass();
            c(interfaceC1636m, c1640q, this.f13410S, false);
            this.f13413V = 0;
            this.f13414W = false;
        }
        if (this.f13415X) {
            return;
        }
        if (!this.f13402K) {
            c(this.f12601z, this.f12594b, this.f13409R, true);
        }
        this.f13416Y = !this.f13415X;
    }
}
