package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class XE implements PE {

    /* renamed from: A, reason: collision with root package name */
    public C1667ur f12166A;

    /* renamed from: B, reason: collision with root package name */
    public C1407p f12167B;

    /* renamed from: C, reason: collision with root package name */
    public C1407p f12168C;

    /* renamed from: D, reason: collision with root package name */
    public C1407p f12169D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f12170E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f12171F;

    /* renamed from: G, reason: collision with root package name */
    public int f12172G;

    /* renamed from: H, reason: collision with root package name */
    public int f12173H;

    /* renamed from: I, reason: collision with root package name */
    public int f12174I;
    public boolean J;

    /* renamed from: k, reason: collision with root package name */
    public final Context f12175k;

    /* renamed from: l, reason: collision with root package name */
    public final UE f12176l;

    /* renamed from: m, reason: collision with root package name */
    public final PlaybackSession f12177m;

    /* renamed from: s, reason: collision with root package name */
    public String f12183s;

    /* renamed from: t, reason: collision with root package name */
    public PlaybackMetrics.Builder f12184t;

    /* renamed from: u, reason: collision with root package name */
    public int f12185u;

    /* renamed from: x, reason: collision with root package name */
    public K7 f12188x;

    /* renamed from: y, reason: collision with root package name */
    public C1667ur f12189y;

    /* renamed from: z, reason: collision with root package name */
    public C1667ur f12190z;

    /* renamed from: o, reason: collision with root package name */
    public final C0603Ha f12179o = new C0603Ha();

    /* renamed from: p, reason: collision with root package name */
    public final C1785xa f12180p = new C1785xa();

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f12182r = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f12181q = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final long f12178n = SystemClock.elapsedRealtime();

    /* renamed from: v, reason: collision with root package name */
    public int f12186v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f12187w = 0;

    public XE(Context context, PlaybackSession playbackSession) {
        this.f12175k = context.getApplicationContext();
        this.f12177m = playbackSession;
        UE ue = new UE();
        this.f12176l = ue;
        ue.f11764d = this;
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void a(OE oe, C1469qG c1469qG) {
        C1603tG c1603tG = oe.f10944d;
        if (c1603tG == null) {
            return;
        }
        C1407p c1407p = c1469qG.f15118b;
        c1407p.getClass();
        C1667ur c1667ur = new C1667ur(10, c1407p, this.f12176l.a(oe.f10942b, c1603tG), false);
        int i = c1469qG.f15117a;
        if (i != 0) {
            if (i == 1) {
                this.f12190z = c1667ur;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f12166A = c1667ur;
                return;
            }
        }
        this.f12189y = c1667ur;
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void b(OE oe, int i, long j5) {
        C1603tG c1603tG = oe.f10944d;
        if (c1603tG != null) {
            String a5 = this.f12176l.a(oe.f10942b, c1603tG);
            HashMap hashMap = this.f12182r;
            Long l5 = (Long) hashMap.get(a5);
            HashMap hashMap2 = this.f12181q;
            Long l6 = (Long) hashMap2.get(a5);
            hashMap.put(a5, Long.valueOf((l5 == null ? 0L : l5.longValue()) + j5));
            hashMap2.put(a5, Long.valueOf((l6 != null ? l6.longValue() : 0L) + i));
        }
    }

    public final void c(OE oe, String str) {
        C1603tG c1603tG = oe.f10944d;
        if ((c1603tG == null || !c1603tG.b()) && str.equals(this.f12183s)) {
            f();
        }
        this.f12181q.remove(str);
        this.f12182r.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void d(K7 k7) {
        this.f12188x = k7;
    }

    public final void f() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f12184t;
        if (builder != null && this.J) {
            builder.setAudioUnderrunCount(this.f12174I);
            this.f12184t.setVideoFramesDropped(this.f12172G);
            this.f12184t.setVideoFramesPlayed(this.f12173H);
            Long l5 = (Long) this.f12181q.get(this.f12183s);
            this.f12184t.setNetworkTransferDurationMillis(l5 == null ? 0L : l5.longValue());
            Long l6 = (Long) this.f12182r.get(this.f12183s);
            this.f12184t.setNetworkBytesRead(l6 == null ? 0L : l6.longValue());
            this.f12184t.setStreamSource((l6 == null || l6.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f12177m;
            build = this.f12184t.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f12184t = null;
        this.f12183s = null;
        this.f12174I = 0;
        this.f12172G = 0;
        this.f12173H = 0;
        this.f12167B = null;
        this.f12168C = null;
        this.f12169D = null;
        this.J = false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void g(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG) {
        PlaybackMetrics.Builder builder = this.f12184t;
        if (c1603tG == null) {
            return;
        }
        int a5 = abstractC0715Xa.a(c1603tG.f15679a);
        char c5 = 65535;
        if (a5 != -1) {
            C1785xa c1785xa = this.f12180p;
            int i = 0;
            abstractC0715Xa.d(a5, c1785xa, false);
            int i5 = c1785xa.f16290c;
            C0603Ha c0603Ha = this.f12179o;
            abstractC0715Xa.e(i5, c0603Ha, 0L);
            C1859z2 c1859z2 = c0603Ha.f9398b.f11161b;
            if (c1859z2 != null) {
                int i6 = AbstractC1260lo.f14419a;
                Uri uri = c1859z2.f16540a;
                String scheme = uri.getScheme();
                if (scheme == null || !AbstractC0952et.Q(scheme, "rtsp")) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (lastIndexOf >= 0) {
                            String n5 = AbstractC0952et.n(lastPathSegment.substring(lastIndexOf + 1));
                            switch (n5.hashCode()) {
                                case 104579:
                                    if (n5.equals("ism")) {
                                        c5 = 2;
                                        break;
                                    }
                                    break;
                                case 108321:
                                    if (n5.equals("mpd")) {
                                        c5 = 0;
                                        break;
                                    }
                                    break;
                                case 3242057:
                                    if (n5.equals("isml")) {
                                        c5 = 3;
                                        break;
                                    }
                                    break;
                                case 3299913:
                                    if (n5.equals("m3u8")) {
                                        c5 = 1;
                                        break;
                                    }
                                    break;
                            }
                            int i7 = c5 != 0 ? c5 != 1 ? (c5 == 2 || c5 == 3) ? 1 : 4 : 2 : 0;
                            if (i7 != 4) {
                                i = i7;
                            }
                        }
                        String path = uri.getPath();
                        path.getClass();
                        Matcher matcher = AbstractC1260lo.f14424g.matcher(path);
                        if (matcher.matches()) {
                            String group = matcher.group(2);
                            if (group != null) {
                                if (!group.contains("format=mpd-time-csf")) {
                                    if (group.contains("format=m3u8-aapl")) {
                                        i = 2;
                                    }
                                }
                            }
                            i = 1;
                        }
                    }
                    i = 4;
                } else {
                    i = 3;
                }
                i = i != 0 ? i != 1 ? i != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            long j5 = c0603Ha.f9404j;
            if (j5 != -9223372036854775807L && !c0603Ha.i && !c0603Ha.f9402g && !c0603Ha.b()) {
                builder.setMediaDurationMillis(AbstractC1260lo.v(j5));
            }
            builder.setPlaybackType(true != c0603Ha.b() ? 1 : 2);
            this.J = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void i(SD sd) {
        this.f12172G += sd.f11516g;
        this.f12173H += sd.f11515e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0263, code lost:
    
        if (r10 != 1) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cd A[PHI: r6
      0x01cd: PHI (r6v48 int) = (r6v31 int), (r6v80 int) binds: [B:205:0x02be, B:132:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d0 A[PHI: r6
      0x01d0: PHI (r6v47 int) = (r6v31 int), (r6v80 int) binds: [B:205:0x02be, B:132:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d3 A[PHI: r6
      0x01d3: PHI (r6v46 int) = (r6v31 int), (r6v80 int) binds: [B:205:0x02be, B:132:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d6 A[PHI: r6
      0x01d6: PHI (r6v45 int) = (r6v31 int), (r6v80 int) binds: [B:205:0x02be, B:132:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x03f5  */
    @Override // com.google.android.gms.internal.ads.PE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ME me, Er er) {
        C1667ur c1667ur;
        int i;
        int i5;
        C1109iE c1109iE;
        int i6;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        NetworkEvent build2;
        boolean z3;
        int i7;
        int errorCode;
        int i8;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build3;
        C1334nG c1334nG;
        int i9;
        int i10;
        if (((WG) er.f8617l).f12034a.size() == 0) {
            return;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < ((WG) er.f8617l).f12034a.size(); i12++) {
            int a5 = ((WG) er.f8617l).a(i12);
            OE oe = (OE) ((SparseArray) er.f8618m).get(a5);
            oe.getClass();
            if (a5 == 0) {
                UE ue = this.f12176l;
                synchronized (ue) {
                    try {
                        if (ue.f11764d == null) {
                            throw null;
                        }
                        AbstractC0715Xa abstractC0715Xa = ue.f11765e;
                        ue.f11765e = oe.f10942b;
                        Iterator it = ue.f11763c.values().iterator();
                        while (it.hasNext()) {
                            TE te = (TE) it.next();
                            if (te.b(abstractC0715Xa, ue.f11765e) && !te.a(oe)) {
                            }
                            it.remove();
                            if (te.f11640e) {
                                if (te.f11636a.equals(ue.f)) {
                                    ue.f(te);
                                }
                                ue.f11764d.c(oe, te.f11636a);
                            }
                        }
                        ue.g(oe);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (a5 == 11) {
                this.f12176l.d(oe, this.f12185u);
            } else {
                this.f12176l.c(oe);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (er.w(0)) {
            OE oe2 = (OE) ((SparseArray) er.f8618m).get(0);
            oe2.getClass();
            if (this.f12184t != null) {
                g(oe2.f10942b, oe2.f10944d);
            }
        }
        if (er.w(2) && this.f12184t != null) {
            AbstractC1044gv abstractC1044gv = me.v1().f13474a;
            int size = abstractC1044gv.size();
            int i13 = 0;
            loop2: while (true) {
                if (i13 >= size) {
                    c1334nG = null;
                    break;
                }
                C0682Sc c0682Sc = (C0682Sc) abstractC1044gv.get(i13);
                int i14 = 0;
                while (true) {
                    i10 = i13 + 1;
                    if (i14 < c0682Sc.f11532a) {
                        if (c0682Sc.f11536e[i14] && (c1334nG = c0682Sc.f11533b.f14498d[i14].f14908q) != null) {
                            break loop2;
                        } else {
                            i14++;
                        }
                    }
                }
                i13 = i10;
            }
            if (c1334nG != null) {
                PlaybackMetrics.Builder builder = this.f12184t;
                int i15 = AbstractC1260lo.f14419a;
                PlaybackMetrics.Builder c5 = VE.c(builder);
                int i16 = 0;
                while (true) {
                    if (i16 >= c1334nG.f14648n) {
                        i9 = 1;
                        break;
                    }
                    UUID uuid = c1334nG.f14645k[i16].f12192l;
                    if (uuid.equals(AbstractC1644uC.f15806d)) {
                        i9 = 3;
                        break;
                    } else if (uuid.equals(AbstractC1644uC.f15807e)) {
                        i9 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC1644uC.f15805c)) {
                            i9 = 6;
                            break;
                        }
                        i16++;
                    }
                }
                c5.setDrmType(i9);
            }
        }
        if (er.w(1011)) {
            this.f12174I++;
        }
        K7 k7 = this.f12188x;
        if (k7 != null) {
            Context context = this.f12175k;
            if (k7.f10130k == 1001) {
                i7 = 20;
            } else {
                XD xd = (XD) k7;
                boolean z5 = xd.f12159m == 1;
                int i17 = xd.f12163q;
                Throwable cause = k7.getCause();
                cause.getClass();
                int i18 = 28;
                int i19 = 23;
                if (!(cause instanceof IOException)) {
                    if (z5) {
                        i7 = 35;
                        if (i17 != 0) {
                        }
                        i11 = 0;
                    }
                    if (z5 && i17 == 3) {
                        i7 = 15;
                    } else {
                        if (!z5 || i17 != 2) {
                            if (cause instanceof PF) {
                                i11 = AbstractC1260lo.p(((PF) cause).f11076m);
                                i7 = 13;
                            } else {
                                i19 = 14;
                                if (cause instanceof MF) {
                                    i8 = ((MF) cause).f10610k;
                                } else if (!(cause instanceof OutOfMemoryError)) {
                                    if (cause instanceof C1110iF) {
                                        i8 = ((C1110iF) cause).f13926k;
                                        i19 = 17;
                                    } else if (cause instanceof C1153jF) {
                                        i8 = ((C1153jF) cause).f14089k;
                                        i19 = 18;
                                    } else if (cause instanceof MediaCodec.CryptoException) {
                                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        switch (AbstractC1260lo.o(errorCode)) {
                                        }
                                        i11 = errorCode;
                                        i7 = i18;
                                    } else {
                                        i7 = 22;
                                    }
                                }
                                int i20 = i19;
                                i11 = i8;
                                i7 = i20;
                            }
                        }
                        i7 = i19;
                    }
                    i11 = 0;
                } else if (cause instanceof C0792bA) {
                    i11 = ((C0792bA) cause).f12773m;
                    i7 = 5;
                } else {
                    if (cause instanceof B7) {
                        i7 = 11;
                    } else {
                        boolean z6 = cause instanceof Cz;
                        if (z6 || (cause instanceof C0927eC)) {
                            if (C0901dm.f(context).b() == 1) {
                                i7 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                i7 = cause2 instanceof UnknownHostException ? 6 : cause2 instanceof SocketTimeoutException ? 7 : (z6 && ((Cz) cause).f8130l == 1) ? 4 : 8;
                            }
                        } else if (k7.f10130k == 1002) {
                            i7 = 21;
                        } else if (cause instanceof C1782xF) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = AbstractC1260lo.p(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (AbstractC1260lo.o(errorCode)) {
                                    case 6002:
                                        i18 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i18 = 25;
                                        break;
                                    case 6005:
                                        i18 = 26;
                                        break;
                                    default:
                                        i18 = 27;
                                        break;
                                }
                                i11 = errorCode;
                                i7 = i18;
                            } else if (AbstractC1260lo.f14419a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i7 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i7 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i7 = 29;
                            } else {
                                if (!(cause3 instanceof CF)) {
                                    i7 = 30;
                                }
                                i7 = i19;
                            }
                        } else if ((cause instanceof Oy) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            i7 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                        } else {
                            i7 = 9;
                        }
                    }
                    i11 = 0;
                }
            }
            PlaybackSession playbackSession = this.f12177m;
            timeSinceCreatedMillis3 = WE.f().setTimeSinceCreatedMillis(elapsedRealtime - this.f12178n);
            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i7);
            subErrorCode = errorCode2.setSubErrorCode(i11);
            exception = subErrorCode.setException(k7);
            build3 = exception.build();
            playbackSession.reportPlaybackErrorEvent(build3);
            this.J = true;
            this.f12188x = null;
        }
        if (er.w(2)) {
            C0981fd v12 = me.v1();
            boolean a6 = v12.a(2);
            boolean a7 = v12.a(1);
            boolean a8 = v12.a(3);
            if (a6 || a7) {
                z3 = a8;
            } else if (a8) {
                z3 = true;
            }
            if (a6 || Objects.equals(this.f12167B, null)) {
                i = 4;
            } else {
                int i21 = this.f12167B == null ? 1 : 0;
                this.f12167B = null;
                i = 4;
                o(1, elapsedRealtime, null, i21);
            }
            if (!a7 && !Objects.equals(this.f12168C, null)) {
                int i22 = this.f12168C == null ? 1 : 0;
                this.f12168C = null;
                o(0, elapsedRealtime, null, i22);
            }
            if (!z3 && !Objects.equals(this.f12169D, null)) {
                int i23 = this.f12169D == null ? 1 : 0;
                this.f12169D = null;
                o(2, elapsedRealtime, null, i23);
            }
            c1667ur = null;
            if (p(this.f12189y)) {
                C1407p c1407p = (C1407p) this.f12189y.f15914l;
                if (c1407p.f14912u != -1) {
                    if (!Objects.equals(this.f12167B, c1407p)) {
                        int i24 = this.f12167B == null ? 1 : 0;
                        this.f12167B = c1407p;
                        o(1, elapsedRealtime, c1407p, i24);
                    }
                    this.f12189y = c1667ur;
                }
            }
            if (p(this.f12190z)) {
                C1407p c1407p2 = (C1407p) this.f12190z.f15914l;
                if (!Objects.equals(this.f12168C, c1407p2)) {
                    int i25 = this.f12168C == null ? 1 : 0;
                    this.f12168C = c1407p2;
                    o(0, elapsedRealtime, c1407p2, i25);
                }
                this.f12190z = c1667ur;
            }
            if (p(this.f12166A)) {
                C1407p c1407p3 = (C1407p) this.f12166A.f15914l;
                if (!Objects.equals(this.f12169D, c1407p3)) {
                    int i26 = this.f12169D == null ? 1 : 0;
                    this.f12169D = c1407p3;
                    o(2, elapsedRealtime, c1407p3, i26);
                }
                this.f12166A = c1667ur;
            }
            switch (C0901dm.f(this.f12175k).b()) {
                case 0:
                    i5 = 0;
                    break;
                case 1:
                    i5 = 9;
                    break;
                case 2:
                    i5 = 2;
                    break;
                case 3:
                    i5 = i;
                    break;
                case 4:
                    i5 = 5;
                    break;
                case 5:
                    i5 = 6;
                    break;
                case 6:
                case 8:
                default:
                    i5 = 1;
                    break;
                case 7:
                    i5 = 3;
                    break;
                case 9:
                    i5 = 8;
                    break;
                case 10:
                    i5 = 7;
                    break;
            }
            if (i5 != this.f12187w) {
                this.f12187w = i5;
                PlaybackSession playbackSession2 = this.f12177m;
                networkType = WE.e().setNetworkType(i5);
                timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.f12178n);
                build2 = timeSinceCreatedMillis2.build();
                playbackSession2.reportNetworkEvent(build2);
            }
            if (me.c() != 2) {
                this.f12170E = false;
            }
            me.f10609n.d();
            c1109iE = me.f10608m;
            c1109iE.t0();
            if (c1109iE.f13907a0.f != null) {
                this.f12171F = false;
            } else if (er.w(10)) {
                this.f12171F = true;
            }
            int c6 = me.c();
            if (!this.f12170E) {
                i6 = 5;
            } else if (this.f12171F) {
                i6 = 13;
            } else if (c6 == i) {
                i6 = 11;
            } else {
                i6 = 12;
                if (c6 == 2) {
                    int i27 = this.f12186v;
                    i6 = (i27 == 0 || i27 == 2 || i27 == 12) ? 2 : !me.w1() ? 7 : me.f() != 0 ? 10 : 6;
                } else if (c6 == 3) {
                    i6 = !me.w1() ? i : me.f() != 0 ? 9 : 3;
                } else if (c6 != 1 || this.f12186v == 0) {
                    i6 = this.f12186v;
                }
            }
            if (this.f12186v != i6) {
                this.f12186v = i6;
                this.J = true;
                PlaybackSession playbackSession3 = this.f12177m;
                state = WE.l().setState(this.f12186v);
                timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.f12178n);
                build = timeSinceCreatedMillis.build();
                playbackSession3.reportPlaybackStateEvent(build);
            }
            if (er.w(1028)) {
                return;
            }
            UE ue2 = this.f12176l;
            OE oe3 = (OE) ((SparseArray) er.f8618m).get(1028);
            oe3.getClass();
            ue2.b(oe3);
            return;
        }
        c1667ur = null;
        i = 4;
        if (p(this.f12189y)) {
        }
        if (p(this.f12190z)) {
        }
        if (p(this.f12166A)) {
        }
        switch (C0901dm.f(this.f12175k).b()) {
        }
        if (i5 != this.f12187w) {
        }
        if (me.c() != 2) {
        }
        me.f10609n.d();
        c1109iE = me.f10608m;
        c1109iE.t0();
        if (c1109iE.f13907a0.f != null) {
        }
        int c62 = me.c();
        if (!this.f12170E) {
        }
        if (this.f12186v != i6) {
        }
        if (er.w(1028)) {
        }
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void l(int i) {
        if (i == 1) {
            this.f12170E = true;
            i = 1;
        }
        this.f12185u = i;
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void m(C1519re c1519re) {
        C1667ur c1667ur = this.f12189y;
        if (c1667ur != null) {
            C1407p c1407p = (C1407p) c1667ur.f15914l;
            if (c1407p.f14912u == -1) {
                C1649uH c1649uH = new C1649uH(c1407p);
                c1649uH.f15855s = c1519re.f15322a;
                c1649uH.f15856t = c1519re.f15323b;
                this.f12189y = new C1667ur(10, new C1407p(c1649uH), (String) c1667ur.f15915m, false);
            }
        }
    }

    public final void o(int i, long j5, C1407p c1407p, int i5) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = WE.m(i).setTimeSinceCreatedMillis(j5 - this.f12178n);
        if (c1407p != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i5 != 1 ? 1 : 2);
            String str = c1407p.f14903l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1407p.f14904m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1407p.f14901j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i6 = c1407p.i;
            if (i6 != -1) {
                timeSinceCreatedMillis.setBitrate(i6);
            }
            int i7 = c1407p.f14911t;
            if (i7 != -1) {
                timeSinceCreatedMillis.setWidth(i7);
            }
            int i8 = c1407p.f14912u;
            if (i8 != -1) {
                timeSinceCreatedMillis.setHeight(i8);
            }
            int i9 = c1407p.f14886B;
            if (i9 != -1) {
                timeSinceCreatedMillis.setChannelCount(i9);
            }
            int i10 = c1407p.f14887C;
            if (i10 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i10);
            }
            String str4 = c1407p.f14897d;
            if (str4 != null) {
                int i11 = AbstractC1260lo.f14419a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c1407p.f14913v;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.J = true;
        PlaybackSession playbackSession = this.f12177m;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    public final boolean p(C1667ur c1667ur) {
        String str;
        if (c1667ur == null) {
            return false;
        }
        UE ue = this.f12176l;
        String str2 = (String) c1667ur.f15915m;
        synchronized (ue) {
            str = ue.f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void n() {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void C(int i) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void e(C1407p c1407p) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void f0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final void h(IOException iOException) {
    }

    @Override // com.google.android.gms.internal.ads.PE
    public final /* synthetic */ void k(C1407p c1407p) {
    }
}
