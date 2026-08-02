package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602tF extends RF implements InterfaceC1556sE {

    /* renamed from: I0, reason: collision with root package name */
    public final Context f15665I0;

    /* renamed from: J0, reason: collision with root package name */
    public final Er f15666J0;

    /* renamed from: K0, reason: collision with root package name */
    public final C1557sF f15667K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C1667ur f15668L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f15669M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f15670N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f15671O0;

    /* renamed from: P0, reason: collision with root package name */
    public C1407p f15672P0;

    /* renamed from: Q0, reason: collision with root package name */
    public C1407p f15673Q0;

    /* renamed from: R0, reason: collision with root package name */
    public long f15674R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f15675S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f15676T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f15677U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f15678V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602tF(Context context, C1685v8 c1685v8, Handler handler, SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE, C1557sF c1557sF) {
        super(1, c1685v8, 44100.0f);
        C1667ur c1667ur = AbstractC1260lo.f14419a >= 35 ? new C1667ur(12) : null;
        this.f15665I0 = context.getApplicationContext();
        this.f15667K0 = c1557sF;
        this.f15668L0 = c1667ur;
        this.f15678V0 = -1000;
        this.f15666J0 = new Er(8, handler, surfaceHolderCallbackC0974fE);
        c1557sF.f15464l = new Hq(13, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.RF
    public final int J(C1543s1 c1543s1, C1407p c1407p) {
        int i;
        boolean z3;
        C1761wv c1761wv;
        int i5;
        int i6;
        C0930eF c0930eF;
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        if (!"audio".equals(AbstractC1593t6.h(c1407p.f14904m))) {
            return 128;
        }
        int i7 = 1;
        int i8 = c1407p.f14893I;
        boolean z5 = i8 == 0;
        String str = c1407p.f14904m;
        C1557sF c1557sF = this.f15667K0;
        int i9 = c1407p.f14886B;
        int i10 = c1407p.f14887C;
        if (z5) {
            if (i8 != 0) {
                List b3 = YF.b("audio/raw", false, false);
                if ((b3.isEmpty() ? null : (NF) b3.get(0)) == null) {
                    i = 0;
                }
            }
            if (c1557sF.f15448S) {
                c0930eF = C0930eF.f13241d;
            } else {
                Mm mm = c1557sF.f15472t;
                C1667ur c1667ur = c1557sF.f15454Y;
                c1667ur.getClass();
                mm.getClass();
                int i11 = AbstractC1260lo.f14419a;
                if (i11 < 29 || i10 == -1) {
                    c0930eF = C0930eF.f13241d;
                } else {
                    Boolean bool = (Boolean) c1667ur.f15915m;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Context context = (Context) c1667ur.f15914l;
                        if (context != null) {
                            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                            if (audioManager != null) {
                                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                                c1667ur.f15915m = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                            } else {
                                c1667ur.f15915m = Boolean.FALSE;
                            }
                        } else {
                            c1667ur.f15915m = Boolean.FALSE;
                        }
                        booleanValue = ((Boolean) c1667ur.f15915m).booleanValue();
                    }
                    str.getClass();
                    int a5 = AbstractC1593t6.a(str, c1407p.f14901j);
                    if (a5 == 0 || i11 < AbstractC1260lo.l(a5)) {
                        c0930eF = C0930eF.f13241d;
                    } else {
                        int m5 = AbstractC1260lo.m(i9);
                        if (m5 == 0) {
                            c0930eF = C0930eF.f13241d;
                        } else {
                            try {
                                AudioFormat w5 = AbstractC1260lo.w(i10, m5, a5);
                                if (i11 >= 31) {
                                    playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(w5, (AudioAttributes) mm.a().f10741l);
                                    if (playbackOffloadSupport == 0) {
                                        c0930eF = C0930eF.f13241d;
                                    } else {
                                        J2.s sVar = new J2.s();
                                        boolean z6 = i11 > 32 && playbackOffloadSupport == 2;
                                        sVar.f2729a = true;
                                        sVar.f2730b = z6;
                                        sVar.f2731c = booleanValue;
                                        c0930eF = sVar.a();
                                    }
                                } else {
                                    isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(w5, (AudioAttributes) mm.a().f10741l);
                                    if (isOffloadedPlaybackSupported) {
                                        J2.s sVar2 = new J2.s();
                                        sVar2.f2729a = true;
                                        sVar2.f2731c = booleanValue;
                                        c0930eF = sVar2.a();
                                    } else {
                                        c0930eF = C0930eF.f13241d;
                                    }
                                }
                            } catch (IllegalArgumentException unused) {
                                c0930eF = C0930eF.f13241d;
                            }
                        }
                    }
                }
            }
            if (c0930eF.f13242a) {
                i = true != c0930eF.f13243b ? 512 : 1536;
                if (c0930eF.f13244c) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (c1557sF.l(c1407p) != 0) {
                return i | 172;
            }
        } else {
            i = 0;
        }
        if (!"audio/raw".equals(str) || c1557sF.l(c1407p) != 0) {
            C1649uH c1649uH = new C1649uH();
            c1649uH.c("audio/raw");
            c1649uH.f15831A = i9;
            c1649uH.f15832B = i10;
            c1649uH.f15833C = 2;
            if (c1557sF.l(new C1407p(c1649uH)) != 0) {
                if (str == null) {
                    c1761wv = C1761wv.f16184o;
                    i5 = 0;
                } else {
                    if (c1557sF.l(c1407p) != 0) {
                        z3 = 0;
                        i5 = 0;
                        List b5 = YF.b("audio/raw", false, false);
                        NF nf = b5.isEmpty() ? null : (NF) b5.get(0);
                        if (nf != null) {
                            c1761wv = AbstractC1044gv.n(nf);
                        }
                    } else {
                        z3 = 0;
                    }
                    C1761wv c5 = YF.c(c1543s1, c1407p, z3, z3);
                    i5 = z3;
                    c1761wv = c5;
                }
                if (!c1761wv.isEmpty()) {
                    if (z5) {
                        NF nf2 = (NF) c1761wv.get(i5);
                        boolean c6 = nf2.c(c1407p);
                        if (!c6) {
                            for (int i12 = 1; i12 < c1761wv.f16186n; i12++) {
                                NF nf3 = (NF) c1761wv.get(i12);
                                if (nf3.c(c1407p)) {
                                    c6 = true;
                                    i6 = i5;
                                    nf2 = nf3;
                                    break;
                                }
                            }
                        }
                        i6 = true;
                        int i13 = true != c6 ? 3 : 4;
                        int i14 = 8;
                        if (c6 && nf2.d(c1407p)) {
                            i14 = 16;
                        }
                        return (true != nf2.f10793g ? i5 : 64) | i13 | i14 | 32 | (true != i6 ? i5 : 128) | i;
                    }
                    i7 = 2;
                }
            }
        }
        return 128 | i7;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final TD K(NF nf, C1407p c1407p, C1407p c1407p2) {
        int i;
        int i5;
        TD a5 = nf.a(c1407p, c1407p2);
        boolean z3 = this.f11360G0 == null && a0(c1407p2);
        int i6 = a5.f11635e;
        if (z3) {
            i6 |= 32768;
        }
        if (m0(nf, c1407p2) > this.f15669M0) {
            i6 |= 64;
        }
        if (i6 != 0) {
            i = 0;
            i5 = i6;
        } else {
            i = a5.f11634d;
            i5 = 0;
        }
        return new TD(nf.f10788a, c1407p, c1407p2, i, i5);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final TD L(C1667ur c1667ur) {
        C1407p c1407p = (C1407p) c1667ur.f15914l;
        c1407p.getClass();
        this.f15672P0 = c1407p;
        TD L5 = super.L(c1667ur);
        Er er = this.f15666J0;
        Handler handler = (Handler) er.f8617l;
        if (handler != null) {
            handler.post(new RunnableC1362o(er, c1407p, L5, 11));
        }
        return L5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        if ("AXON 7 mini".equals(r2) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    @Override // com.google.android.gms.internal.ads.RF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0375o O(NF nf, C1407p c1407p, float f) {
        boolean z3;
        MediaFormat mediaFormat;
        C1407p c1407p2;
        C1407p[] c1407pArr = this.f11406t;
        c1407pArr.getClass();
        int length = c1407pArr.length;
        int m02 = m0(nf, c1407p);
        if (length != 1) {
            for (C1407p c1407p3 : c1407pArr) {
                if (nf.a(c1407p, c1407p3).f11634d != 0) {
                    m02 = Math.max(m02, m0(nf, c1407p3));
                }
            }
        }
        this.f15669M0 = m02;
        int i = AbstractC1260lo.f14419a;
        String str = nf.f10788a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC1260lo.f14421c)) {
            String str2 = AbstractC1260lo.f14420b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z3 = true;
                this.f15670N0 = z3;
                this.f15671O0 = !str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
                int i5 = this.f15669M0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", nf.f10790c);
                mediaFormat.setInteger("channel-count", c1407p.f14886B);
                int i6 = c1407p.f14887C;
                mediaFormat.setInteger("sample-rate", i6);
                AbstractC1803xs.w(mediaFormat, c1407p.f14907p);
                AbstractC1803xs.l(mediaFormat, "max-input-size", i5);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        if (i == 23) {
                            String str3 = AbstractC1260lo.f14422d;
                            if (!"ZTE B2017G".equals(str3)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                String str4 = c1407p.f14904m;
                if (i <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i >= 24) {
                    C1649uH c1649uH = new C1649uH();
                    c1649uH.c("audio/raw");
                    c1649uH.f15831A = c1407p.f14886B;
                    c1649uH.f15832B = i6;
                    c1649uH.f15833C = 4;
                    if (this.f15667K0.l(new C1407p(c1649uH)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.f15678V0));
                }
                c1407p2 = null;
                if ("audio/raw".equals(nf.f10789b) && !"audio/raw".equals(str4)) {
                    c1407p2 = c1407p;
                }
                this.f15673Q0 = c1407p2;
                return new C0375o(nf, mediaFormat, c1407p, (Object) null, this.f15668L0, 20);
            }
        }
        z3 = false;
        this.f15670N0 = z3;
        this.f15671O0 = !str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i52 = this.f15669M0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", nf.f10790c);
        mediaFormat.setInteger("channel-count", c1407p.f14886B);
        int i62 = c1407p.f14887C;
        mediaFormat.setInteger("sample-rate", i62);
        AbstractC1803xs.w(mediaFormat, c1407p.f14907p);
        AbstractC1803xs.l(mediaFormat, "max-input-size", i52);
        if (i >= 23) {
        }
        String str42 = c1407p.f14904m;
        if (i <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
        }
        if (i >= 32) {
        }
        if (i >= 35) {
        }
        c1407p2 = null;
        if ("audio/raw".equals(nf.f10789b)) {
            c1407p2 = c1407p;
        }
        this.f15673Q0 = c1407p2;
        return new C0375o(nf, mediaFormat, c1407p, (Object) null, this.f15668L0, 20);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final ArrayList P(C1543s1 c1543s1, C1407p c1407p) {
        C1761wv c5;
        if (c1407p.f14904m == null) {
            c5 = C1761wv.f16184o;
        } else {
            if (this.f15667K0.l(c1407p) != 0) {
                List b3 = YF.b("audio/raw", false, false);
                NF nf = b3.isEmpty() ? null : (NF) b3.get(0);
                if (nf != null) {
                    c5 = AbstractC1044gv.n(nf);
                }
            }
            c5 = YF.c(c1543s1, c1407p, false, false);
        }
        HashMap hashMap = YF.f12311a;
        ArrayList arrayList = new ArrayList(c5);
        Collections.sort(arrayList, new SF(new Hq(14, c1407p)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void S(OD od) {
        C1407p c1407p;
        if (AbstractC1260lo.f14419a < 29 || (c1407p = od.f10936c) == null || !Objects.equals(c1407p.f14904m, "audio/opus") || !this.f11393m0) {
            return;
        }
        ByteBuffer byteBuffer = od.f10940h;
        byteBuffer.getClass();
        od.f10936c.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            AudioTrack audioTrack = this.f15667K0.f15468p;
            if (audioTrack != null) {
                C1557sF.m(audioTrack);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void T(Exception exc) {
        JB.g("MediaCodecAudioRenderer", "Audio codec error", exc);
        Er er = this.f15666J0;
        Handler handler = (Handler) er.f8617l;
        if (handler != null) {
            handler.post(new RunnableC0975fF(er, exc, 5));
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void U(long j5, long j6, String str) {
        Er er = this.f15666J0;
        Handler handler = (Handler) er.f8617l;
        if (handler != null) {
            handler.post(new RunnableC0975fF(er, str, j5, j6));
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void V(String str) {
        Er er = this.f15666J0;
        Handler handler = (Handler) er.f8617l;
        if (handler != null) {
            handler.post(new RunnableC0975fF(er, str, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void W(C1407p c1407p, MediaFormat mediaFormat) {
        int i;
        C1407p c1407p2 = this.f15673Q0;
        int[] iArr = null;
        boolean z3 = true;
        if (c1407p2 != null) {
            c1407p = c1407p2;
        } else if (this.f11368Q != null) {
            mediaFormat.getClass();
            int q5 = "audio/raw".equals(c1407p.f14904m) ? c1407p.f14888D : (AbstractC1260lo.f14419a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC1260lo.q(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            C1649uH c1649uH = new C1649uH();
            c1649uH.c("audio/raw");
            c1649uH.f15833C = q5;
            c1649uH.f15834D = c1407p.f14889E;
            c1649uH.f15835E = c1407p.f14890F;
            c1649uH.f15846j = c1407p.f14902k;
            c1649uH.f15839a = c1407p.f14894a;
            c1649uH.f15840b = c1407p.f14895b;
            c1649uH.f15841c = AbstractC1044gv.l(c1407p.f14896c);
            c1649uH.f15842d = c1407p.f14897d;
            c1649uH.f15843e = c1407p.f14898e;
            c1649uH.f = c1407p.f;
            c1649uH.f15831A = mediaFormat.getInteger("channel-count");
            c1649uH.f15832B = mediaFormat.getInteger("sample-rate");
            C1407p c1407p3 = new C1407p(c1649uH);
            boolean z5 = this.f15670N0;
            int i5 = c1407p3.f14886B;
            if (z5 && i5 == 6 && (i = c1407p.f14886B) < 6) {
                iArr = new int[i];
                for (int i6 = 0; i6 < i; i6++) {
                    iArr[i6] = i6;
                }
            } else if (this.f15671O0) {
                if (i5 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i5 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i5 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i5 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i5 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            c1407p = c1407p3;
        }
        try {
            int i7 = AbstractC1260lo.f14419a;
            if (i7 >= 29) {
                if (this.f11393m0) {
                    g0();
                }
                if (i7 < 29) {
                    z3 = false;
                }
                AbstractC1668us.a0(z3);
            }
            this.f15667K0.o(c1407p, iArr);
        } catch (C1065hF e3) {
            throw d0(e3, e3.f13738k, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void X() {
        this.f15667K0.f15435D = true;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void Y() {
        try {
            C1557sF c1557sF = this.f15667K0;
            if (!c1557sF.K && c1557sF.k() && c1557sF.j()) {
                c1557sF.g();
                c1557sF.K = true;
            }
        } catch (C1153jF e3) {
            throw d0(e3, e3.f14091m, e3.f14090l, true != this.f11393m0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean Z(long j5, long j6, KF kf, ByteBuffer byteBuffer, int i, int i5, int i6, long j7, boolean z3, boolean z5, C1407p c1407p) {
        byteBuffer.getClass();
        if (this.f15673Q0 != null && (i5 & 2) != 0) {
            kf.getClass();
            kf.m(i);
            return true;
        }
        C1557sF c1557sF = this.f15667K0;
        if (z3) {
            if (kf != null) {
                kf.m(i);
            }
            this.B0.f += i6;
            c1557sF.f15435D = true;
            return true;
        }
        try {
            if (!c1557sF.s(byteBuffer, j7, i6)) {
                return false;
            }
            if (kf != null) {
                kf.m(i);
            }
            this.B0.f11515e += i6;
            return true;
        } catch (C1110iF e3) {
            C1407p c1407p2 = this.f15672P0;
            if (this.f11393m0) {
                g0();
            }
            throw d0(e3, c1407p2, e3.f13927l, 5001);
        } catch (C1153jF e5) {
            if (this.f11393m0) {
                g0();
            }
            throw d0(e5, c1407p, e5.f14090l, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final long a() {
        if (this.f11402r == 2) {
            n0();
        }
        return this.f15674R0;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean a0(C1407p c1407p) {
        g0();
        return this.f15667K0.l(c1407p) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final void b(Y7 y7) {
        C1557sF c1557sF = this.f15667K0;
        c1557sF.getClass();
        c1557sF.f15475w = new Y7(Math.max(0.1f, Math.min(y7.f12280a, 8.0f)), Math.max(0.1f, Math.min(y7.f12281b, 8.0f)));
        C1423pF c1423pF = new C1423pF(y7, -9223372036854775807L, -9223372036854775807L);
        if (c1557sF.k()) {
            c1557sF.f15473u = c1423pF;
        } else {
            c1557sF.f15474v = c1423pF;
        }
    }

    @Override // com.google.android.gms.internal.ads.GE
    public final void c(int i, Object obj) {
        Dp dp;
        C1667ur c1667ur;
        LoudnessCodecController create;
        boolean addMediaCodec;
        C1557sF c1557sF = this.f15667K0;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (c1557sF.f15438G != floatValue) {
                c1557sF.f15438G = floatValue;
                if (c1557sF.k()) {
                    c1557sF.f15468p.setVolume(c1557sF.f15438G);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            Mm mm = (Mm) obj;
            mm.getClass();
            if (c1557sF.f15472t.equals(mm)) {
                return;
            }
            c1557sF.f15472t = mm;
            C0802bc c0802bc = c1557sF.f15470r;
            if (c0802bc != null) {
                c0802bc.f12829s = mm;
                c0802bc.i(C0797bF.b((Context) c0802bc.f12821k, mm, (Dp) c0802bc.f12828r));
            }
            c1557sF.p();
            return;
        }
        if (i == 6) {
            C1891zq c1891zq = (C1891zq) obj;
            c1891zq.getClass();
            if (c1557sF.f15445P.equals(c1891zq)) {
                return;
            }
            if (c1557sF.f15468p != null) {
                c1557sF.f15445P.getClass();
            }
            c1557sF.f15445P = c1891zq;
            return;
        }
        if (i == 12) {
            if (AbstractC1260lo.f14419a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    dp = null;
                } else {
                    c1557sF.getClass();
                    dp = new Dp(13, audioDeviceInfo);
                }
                c1557sF.f15446Q = dp;
                C0802bc c0802bc2 = c1557sF.f15470r;
                if (c0802bc2 != null) {
                    c0802bc2.h(audioDeviceInfo);
                }
                AudioTrack audioTrack = c1557sF.f15468p;
                if (audioTrack != null) {
                    Dp dp2 = c1557sF.f15446Q;
                    audioTrack.setPreferredDevice(dp2 != null ? (AudioDeviceInfo) dp2.f8377l : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f15678V0 = ((Integer) obj).intValue();
            KF kf = this.f11368Q;
            if (kf == null || AbstractC1260lo.f14419a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f15678V0));
            kf.p(bundle);
            return;
        }
        if (i == 9) {
            obj.getClass();
            c1557sF.f15476x = ((Boolean) obj).booleanValue();
            C1423pF c1423pF = new C1423pF(c1557sF.f15475w, -9223372036854775807L, -9223372036854775807L);
            if (c1557sF.k()) {
                c1557sF.f15473u = c1423pF;
                return;
            } else {
                c1557sF.f15474v = c1423pF;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                this.f11365N = (C1152jE) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        if (c1557sF.f15444O != intValue) {
            c1557sF.f15444O = intValue;
            c1557sF.p();
        }
        if (AbstractC1260lo.f14419a < 35 || (c1667ur = this.f15668L0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1667ur.f15915m;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            c1667ur.f15915m = null;
        }
        create = LoudnessCodecController.create(intValue, Ew.f8627k, new JF());
        c1667ur.f15915m = create;
        Iterator it = ((HashSet) c1667ur.f15914l).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void d() {
        C1667ur c1667ur;
        C0841cF c0841cF;
        C0802bc c0802bc = this.f15667K0.f15470r;
        if (c0802bc != null && c0802bc.f12823m) {
            c0802bc.f12827q = null;
            int i = AbstractC1260lo.f14419a;
            Context context = (Context) c0802bc.f12821k;
            if (i >= 23 && (c0841cF = (C0841cF) c0802bc.f12825o) != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(c0841cF);
            }
            context.unregisterReceiver((T2.E) c0802bc.f12826p);
            C0886dF c0886dF = (C0886dF) c0802bc.f12822l;
            if (c0886dF != null) {
                c0886dF.f13105a.unregisterContentObserver(c0886dF);
            }
            c0802bc.f12823m = false;
        }
        if (AbstractC1260lo.f14419a < 35 || (c1667ur = this.f15668L0) == null) {
            return;
        }
        ((HashSet) c1667ur.f15914l).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1667ur.f15915m;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void e() {
        C1557sF c1557sF = this.f15667K0;
        this.f15677U0 = false;
        try {
            try {
                M();
                y();
                if (this.f15676T0) {
                    this.f15676T0 = false;
                    c1557sF.r();
                }
            } finally {
                this.f11360G0 = null;
            }
        } catch (Throwable th) {
            if (this.f15676T0) {
                this.f15676T0 = false;
                c1557sF.r();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void f() {
        this.f15667K0.q();
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final InterfaceC1556sE f0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void g() {
        n0();
        C1557sF c1557sF = this.f15667K0;
        c1557sF.f15443N = false;
        if (c1557sF.k()) {
            C1243lF c1243lF = c1557sF.f;
            c1243lF.f14353k = 0L;
            c1243lF.f14365w = 0;
            c1243lF.f14364v = 0;
            c1243lF.f14354l = 0L;
            c1243lF.f14340C = 0L;
            c1243lF.f14343F = 0L;
            c1243lF.f14352j = false;
            if (c1243lF.f14366x == -9223372036854775807L) {
                C1198kF c1198kF = c1243lF.f14349e;
                c1198kF.getClass();
                c1198kF.a(0);
            } else {
                c1243lF.f14368z = c1243lF.d();
                if (!C1557sF.m(c1557sF.f15468p)) {
                    return;
                }
            }
            c1557sF.f15468p.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final boolean h() {
        boolean z3 = this.f15677U0;
        this.f15677U0 = false;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final Y7 i() {
        return this.f15667K0.f15475w;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void j0() {
        Er er = this.f15666J0;
        this.f15676T0 = true;
        this.f15672P0 = null;
        try {
            try {
                this.f15667K0.p();
                super.j0();
                SD sd = this.B0;
                er.getClass();
                synchronized (sd) {
                }
                Handler handler = (Handler) er.f8617l;
                if (handler != null) {
                    handler.post(new RunnableC1081hn(15, er, sd));
                }
            } catch (Throwable th) {
                super.j0();
                er.x(this.B0);
                throw th;
            }
        } catch (Throwable th2) {
            er.x(this.B0);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void k0(boolean z3, boolean z5) {
        SD sd = new SD();
        this.B0 = sd;
        Er er = this.f15666J0;
        Handler handler = (Handler) er.f8617l;
        if (handler != null) {
            handler.post(new RunnableC0975fF(er, sd, 0));
        }
        g0();
        ZE ze = this.f11398p;
        ze.getClass();
        C1557sF c1557sF = this.f15667K0;
        c1557sF.f15463k = ze;
        Nm nm = this.f11400q;
        nm.getClass();
        c1557sF.f.f14344G = nm;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void l0(long j5, boolean z3) {
        super.l0(j5, z3);
        this.f15667K0.p();
        this.f15674R0 = j5;
        this.f15677U0 = false;
        this.f15675S0 = true;
    }

    public final int m0(NF nf, C1407p c1407p) {
        int i;
        if (!"OMX.google.raw.decoder".equals(nf.f10788a) || (i = AbstractC1260lo.f14419a) >= 24 || (i == 23 && AbstractC1260lo.e(this.f15665I0))) {
            return c1407p.f14905n;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final String n() {
        return "MediaCodecAudioRenderer";
    }

    public final void n0() {
        long j5;
        ArrayDeque arrayDeque;
        long r5;
        boolean p5 = p();
        C1557sF c1557sF = this.f15667K0;
        if (!c1557sF.k() || c1557sF.f15436E) {
            j5 = Long.MIN_VALUE;
        } else {
            long min = Math.min(c1557sF.f.a(p5), AbstractC1260lo.t(c1557sF.f15466n.f14795e, c1557sF.b()));
            while (true) {
                arrayDeque = c1557sF.f15460g;
                if (arrayDeque.isEmpty() || min < ((C1423pF) arrayDeque.getFirst()).f14978c) {
                    break;
                } else {
                    c1557sF.f15474v = (C1423pF) arrayDeque.remove();
                }
            }
            long j6 = min - c1557sF.f15474v.f14978c;
            boolean isEmpty = arrayDeque.isEmpty();
            Fx fx = c1557sF.f15453X;
            if (isEmpty) {
                C0685Sf c0685Sf = (C0685Sf) fx.f9144l;
                if (c0685Sf.f()) {
                    long j7 = c0685Sf.f11570o;
                    if (j7 >= 1024) {
                        long j8 = c0685Sf.f11569n;
                        C0615If c0615If = c0685Sf.f11565j;
                        c0615If.getClass();
                        int i = c0615If.f9575k * c0615If.f9568b;
                        long j9 = j8 - (i + i);
                        int i5 = c0685Sf.f11564h.f11555a;
                        int i6 = c0685Sf.f11563g.f11555a;
                        j6 = i5 == i6 ? AbstractC1260lo.u(j6, j9, j7, RoundingMode.DOWN) : AbstractC1260lo.u(j6, j9 * i5, j7 * i6, RoundingMode.DOWN);
                    } else {
                        j6 = (long) (c0685Sf.f11560c * j6);
                    }
                }
                r5 = c1557sF.f15474v.f14977b + j6;
            } else {
                C1423pF c1423pF = (C1423pF) arrayDeque.getFirst();
                r5 = c1423pF.f14977b - AbstractC1260lo.r(c1557sF.f15474v.f14976a.f12280a, c1423pF.f14978c - min);
            }
            long j10 = ((C1647uF) fx.f9143k).f15825l;
            j5 = AbstractC1260lo.t(c1557sF.f15466n.f14795e, j10) + r5;
            long j11 = c1557sF.f15450U;
            if (j10 > j11) {
                long t5 = AbstractC1260lo.t(c1557sF.f15466n.f14795e, j10 - j11);
                c1557sF.f15450U = j10;
                c1557sF.f15451V += t5;
                if (c1557sF.f15452W == null) {
                    c1557sF.f15452W = new Handler(Looper.myLooper());
                }
                c1557sF.f15452W.removeCallbacksAndMessages(null);
                c1557sF.f15452W.postDelayed(new RunnableC1303mm(20, c1557sF), 100L);
            }
        }
        if (j5 != Long.MIN_VALUE) {
            if (!this.f15675S0) {
                j5 = Math.max(this.f15674R0, j5);
            }
            this.f15674R0 = j5;
            this.f15675S0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean p() {
        if (!this.f11419z0) {
            return false;
        }
        C1557sF c1557sF = this.f15667K0;
        if (c1557sF.k()) {
            return c1557sF.K && !c1557sF.t();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean q() {
        return this.f15667K0.t() || super.q();
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final float s(float f, C1407p[] c1407pArr) {
        int i = -1;
        for (C1407p c1407p : c1407pArr) {
            int i5 = c1407p.f14887C;
            if (i5 != -1) {
                i = Math.max(i, i5);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }
}
