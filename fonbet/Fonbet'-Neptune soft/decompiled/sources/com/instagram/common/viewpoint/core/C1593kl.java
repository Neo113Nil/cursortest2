package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

@MetaExoPlayerCustomization("DoNotStrip")
/* renamed from: com.facebook.ads.redexgen.X.kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1593kl implements GX {
    public static byte[] A0K;
    public static String[] A0L = {"", "XN01ItT2bHY64Udo8U0rv5VGSzBxMc17", "LZob5GHcOm1BKJQ2vQEKg44UBdoAB", "Ux8BYUlKxCzUFwXHW791pvzO", "", "EYpHAHesBPuZwNRi93BVygfvwpQNuwRz", "BndnCdJGei78P0VEYjqxuWcWalVGolEJ", "FxTwI"};
    public static final InterfaceC0439Gb A0M;
    public static final InterfaceC0466Hc A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public GY A07;
    public H1 A08;
    public H1 A09;
    public InterfaceC1592kk A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final C4J A0F;
    public final C0446Gi A0G;
    public final C0448Gk A0H;
    public final C0449Gl A0I;
    public final H1 A0J;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{-78, -60, -64, -47, -62, -57, -60, -61, Byte.MAX_VALUE, -45, -50, -50, Byte.MAX_VALUE, -52, -64, -51, -40, Byte.MAX_VALUE, -63, -40, -45, -60, -46, -115, -27, -35, -42, -33};
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "rBULd6kp2sYKxjbrN7jKkVDhSodb4v28";
        strArr[6] = "gBWiztBtWh7JHxCzKYVaG6CraVXBuCHm";
    }

    static {
        A0B();
        A0M = new InterfaceC0439Gb() { // from class: com.facebook.ads.redexgen.X.kn
            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final GX[] A5F() {
                return C1593kl.A0G();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0438Ga.A01(this, uri, map);
            }
        };
        A0N = new InterfaceC0466Hc() { // from class: com.facebook.ads.redexgen.X.km
            @Override // com.instagram.common.viewpoint.core.InterfaceC0466Hc
            public final boolean A6I(int i, int i2, int i3, int i4, int i5) {
                return C1593kl.A0C(i, i2, i3, i4, i5);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1593kl() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1593kl(int i) {
        this(i, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1593kl(int i, long j) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = j;
        this.A0F = new C4J(10);
        this.A0I = new C0449Gl();
        this.A0G = new C0446Gi();
        this.A02 = -9223372036854775807L;
        this.A0H = new C0448Gk();
        this.A0J = new C1620lO();
        this.A08 = this.A0J;
    }

    public static int A00(C4J c4j, int i) {
        if (c4j.A0A() >= i + 4) {
            c4j.A0f(i);
            if (A0L[5].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A0L[3] = "hnNDf1WGfP5HptxyzX0WY3yEy4CiO";
            int A0C = c4j.A0C();
            if (A0C == 1483304551 || A0C == 1231971951) {
                return A0C;
            }
        }
        if (c4j.A0A() >= 40) {
            c4j.A0f(36);
            return c4j.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A01(InterfaceC1619lN interfaceC1619lN) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(interfaceC1619lN, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(interfaceC1619lN);
            this.A07.AIN(this.A0A);
            this.A08.A6W(new C2D().A11(this.A0I.A06).A0h(4096).A0b(this.A0I.A01).A0m(this.A0I.A03).A0d(this.A0G.A00).A0e(this.A0G.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = interfaceC1619lN.A8f();
        } else if (this.A03 != 0) {
            long A8f = interfaceC1619lN.A8f();
            if (A8f < this.A03) {
                interfaceC1619lN.AJJ((int) (this.A03 - A8f));
            }
        }
        return A02(interfaceC1619lN);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A02(InterfaceC1619lN interfaceC1619lN) throws IOException {
        if (this.A00 == 0) {
            interfaceC1619lN.AI1();
            if (A0E(interfaceC1619lN)) {
                return -1;
            }
            this.A0F.A0f(0);
            int A0C = this.A0F.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(A0C, sampleHeaderData)) {
                int sampleHeaderData2 = AbstractC0450Gm.A00(A0C);
                if (sampleHeaderData2 != -1) {
                    this.A0I.A00(A0C);
                    if (this.A02 == -9223372036854775807L) {
                        this.A02 = this.A0A.A99(interfaceC1619lN.A8f());
                        if (this.A0E != -9223372036854775807L) {
                            this.A02 += this.A0E - this.A0A.A99(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0I.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof C02397t) {
                        C02397t c02397t = (C02397t) this.A0A;
                        long j = this.A04;
                        int sampleHeaderData4 = this.A0I.A04;
                        long A03 = A03(j + sampleHeaderData4);
                        long A8f = interfaceC1619lN.A8f();
                        int sampleHeaderData5 = this.A0I.A02;
                        c02397t.A01(A03, A8f + sampleHeaderData5);
                        if (this.A0C && c02397t.A02(this.A05)) {
                            this.A0C = false;
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            interfaceC1619lN.AJJ(1);
            this.A01 = 0;
            return 0;
        }
        int AI5 = this.A08.AI5(interfaceC1619lN, this.A00, true);
        if (AI5 == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AI5;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AIA(A03(this.A04), 1, this.A0I.A02, 0, null);
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        A0L[3] = "39D9RtME66Nzc4lHdRGQvnw";
        long j2 = this.A04;
        int bytesAppended3 = this.A0I.A04;
        this.A04 = j2 + bytesAppended3;
        this.A00 = 0;
        return 0;
    }

    private long A03(long j) {
        return this.A02 + ((1000000 * j) / this.A0I.A03);
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i = 0; i < A02; i++) {
                Metadata.Entry A03 = metadata.A03(i);
                if ((A03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) A03)).A00.equals(A09(24, 4, 101))) {
                    return AbstractC01424a.A0O(Long.parseLong(((TextInformationFrame) A03).A02.get(0)));
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private C02407u A05(InterfaceC1619lN interfaceC1619lN, boolean z) throws IOException {
        interfaceC1619lN.AG9(this.A0F.A0l(), 0, 4);
        this.A0F.A0f(0);
        this.A0I.A00(this.A0F.A0C());
        return new C02407u(interfaceC1619lN.A8G(), interfaceC1619lN.A8f(), this.A0I, z);
    }

    public static C02387s A06(Metadata metadata, long j) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i = 0; i < A02; i++) {
                Metadata.Entry entry = metadata.A03(i);
                if (entry instanceof MlltFrame) {
                    return C02387s.A01(j, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if ((r5 & 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if ((r5 & 2) != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private InterfaceC1592kk A07(InterfaceC1619lN interfaceC1619lN) throws IOException {
        long durationUs;
        InterfaceC1592kk A08 = A08(interfaceC1619lN);
        InterfaceC1592kk seekFrameSeeker = A06(this.A06, interfaceC1619lN.A8f());
        if (this.A0B) {
            return new C02377r();
        }
        InterfaceC1592kk interfaceC1592kk = null;
        if ((this.A0D & 4) != 0) {
            long j = -1;
            if (seekFrameSeeker != null) {
                durationUs = seekFrameSeeker.A7l();
                j = seekFrameSeeker.A7b();
            } else if (A08 != null) {
                durationUs = A08.A7l();
                j = A08.A7b();
            } else {
                durationUs = A04(this.A06);
            }
            interfaceC1592kk = new C02397t(durationUs, interfaceC1619lN.A8f(), j);
        } else if (seekFrameSeeker != null) {
            interfaceC1592kk = seekFrameSeeker;
        } else if (A08 != null) {
            interfaceC1592kk = A08;
        }
        boolean z = true;
        String[] strArr = A0L;
        if (strArr[1].charAt(10) == strArr[6].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[7] = "puIT5";
        strArr2[4] = "";
        if (interfaceC1592kk == null || (!interfaceC1592kk.AAa() && (this.A0D & 1) != 0)) {
            int i = this.A0D;
            if (A0L[5].charAt(24) != 'i') {
                String[] strArr3 = A0L;
                strArr3[7] = "yAfIM";
                strArr3[4] = "";
            } else {
                A0L[5] = "MGo95V6JQFDSGlQkmGWT48KfEqhrmySi";
            }
            return A05(interfaceC1619lN, z);
        }
        return interfaceC1592kk;
    }

    private InterfaceC1592kk A08(InterfaceC1619lN interfaceC1619lN) throws IOException {
        C4J c4j = new C4J(this.A0I.A02);
        interfaceC1619lN.AG9(c4j.A0l(), 0, this.A0I.A02);
        int i = 21;
        if ((this.A0I.A05 & 1) != 0) {
            if (this.A0I.A01 != 1) {
                i = 36;
            }
        } else if (this.A0I.A01 == 1) {
            i = 13;
        }
        int A00 = A00(c4j, i);
        if (A00 == 1483304551 || A00 == 1231971951) {
            C02337n A01 = C02337n.A01(interfaceC1619lN.A8G(), interfaceC1619lN.A8f(), this.A0I, c4j);
            if (A01 != null && !this.A0G.A03()) {
                interfaceC1619lN.AI1();
                interfaceC1619lN.A3z(i + Opcodes.F2D);
                C4J frame = this.A0F;
                interfaceC1619lN.AG9(frame.A0l(), 0, 3);
                C4J frame2 = this.A0F;
                frame2.A0f(0);
                C0446Gi c0446Gi = this.A0G;
                C4J frame3 = this.A0F;
                c0446Gi.A04(frame3.A0K());
            }
            interfaceC1619lN.AJJ(this.A0I.A02);
            if (A01 != null && !A01.AAa() && A00 == 1231971951) {
                C02407u A05 = A05(interfaceC1619lN, false);
                String[] strArr = A0L;
                String str = strArr[7];
                String str2 = strArr[4];
                int xingBase = str.length();
                if (xingBase == str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[1] = "bGvlWKvJjPQrySHefRGmEijHbVzYOxUK";
                strArr2[6] = "fU58RXvZc6f3KsNNOCISAUQgLzoCeDCK";
                return A05;
            }
            return A01;
        }
        if (A00 == 1447187017) {
            C02367q A002 = C02367q.A00(interfaceC1619lN.A8G(), interfaceC1619lN.A8f(), this.A0I, c4j);
            interfaceC1619lN.AJJ(this.A0I.A02);
            return A002;
        }
        interfaceC1619lN.AI1();
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        C3M.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77) {
                if (A0L[5].charAt(24) == 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[2] = "NxAl2v4obD3CfxY1bwrYNdaYMjSl6";
                strArr[0] = "";
                if (i3 != 76 || i4 != 76 || (i5 != 84 && i != 2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0D(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    private boolean A0E(InterfaceC1619lN interfaceC1619lN) throws IOException {
        if (this.A0A != null) {
            long A7b = this.A0A.A7b();
            if (A7b != -1) {
                long dataEndPosition = interfaceC1619lN.A8a();
                if (dataEndPosition > A7b - 4) {
                    return true;
                }
            }
        }
        try {
            return !interfaceC1619lN.AGA(this.A0F.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(InterfaceC1619lN interfaceC1619lN, boolean z) throws IOException {
        int candidateSynchronizedHeaderData;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int searchedBytes = 0;
        int headerData = z ? 32768 : 131072;
        interfaceC1619lN.AI1();
        if (interfaceC1619lN.A8f() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            this.A06 = this.A0H.A00(interfaceC1619lN, validFrameCount2 != 0 ? null : A0N);
            if (this.A06 != null) {
                this.A0G.A05(this.A06);
            }
            i3 = (int) interfaceC1619lN.A8a();
            if (!z) {
                interfaceC1619lN.AJJ(i3);
            }
        }
        while (true) {
            if (A0E(interfaceC1619lN)) {
                if (i <= 0) {
                    throw new EOFException();
                }
            } else {
                this.A0F.A0f(0);
                int A0C = this.A0F.A0C();
                if ((i2 != 0 && !A0D(A0C, i2)) || (candidateSynchronizedHeaderData = AbstractC0450Gm.A00(A0C)) == -1) {
                    int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                    if (searchedBytes == headerData) {
                        if (z) {
                            return false;
                        }
                        throw C00982i.A01(A09(0, 24, 51), null);
                    }
                    i = 0;
                    i2 = 0;
                    if (z) {
                        interfaceC1619lN.AI1();
                        int validFrameCount3 = i3 + candidateSynchronizedHeaderData2;
                        interfaceC1619lN.A3z(validFrameCount3);
                    } else {
                        interfaceC1619lN.AJJ(1);
                    }
                    searchedBytes = candidateSynchronizedHeaderData2;
                } else {
                    i++;
                    if (i == 1) {
                        this.A0I.A00(A0C);
                        i2 = A0C;
                    } else if (i == 4) {
                        break;
                    }
                    int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                    interfaceC1619lN.A3z(validFrameCount4);
                }
            }
        }
        if (z) {
            interfaceC1619lN.AJJ(i3 + searchedBytes);
        } else {
            interfaceC1619lN.AI1();
        }
        this.A01 = i2;
        if (A0L[5].charAt(24) == 105) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[7] = "Yv6sT";
        strArr[4] = "";
        return true;
    }

    public static /* synthetic */ GX[] A0G() {
        return new GX[]{new C1593kl()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A07 = gy;
        this.A09 = this.A07.AJh(0, 1);
        this.A08 = this.A09;
        this.A07.A6G();
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        A0A();
        int A01 = A01(interfaceC1619lN);
        if (A01 == -1 && (this.A0A instanceof C02397t)) {
            long A03 = A03(this.A04);
            long durationUs = this.A0A.A7l();
            if (durationUs != A03) {
                ((C02397t) this.A0A).A00(A03);
                this.A07.AIN(this.A0A);
            }
        }
        return A01;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j2;
        if ((this.A0A instanceof C02397t) && !((C02397t) this.A0A).A02(j2)) {
            this.A0C = true;
            this.A08 = this.A0J;
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1619lN interfaceC1619lN) throws IOException {
        return A0F(interfaceC1619lN, true);
    }
}
