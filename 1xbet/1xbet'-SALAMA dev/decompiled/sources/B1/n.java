package B1;

import A1.C0016e0;
import A1.P0;
import A1.Q0;
import A1.R0;
import A1.X;
import A1.r;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.regex.Matcher;
import p018c2.D;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1017A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f1020c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1026i;
    public PlaybackMetrics.Builder j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1027k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f1030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f1031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f1032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m f1033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X f1034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public X f1035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public X f1036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1041y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1042z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q0 f1022e = new Q0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P0 f1023f = new P0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f1025h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1024g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1021d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1028l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1029m = 0;

    public n(Context context, PlaybackSession playbackSession) {
        this.f1018a = context.getApplicationContext();
        this.f1020c = playbackSession;
        j jVar = new j();
        this.f1019b = jVar;
        jVar.f1007d = this;
    }

    public final boolean a(m mVar) {
        String str;
        if (mVar != null) {
            String str2 = (String) mVar.f1016d;
            j jVar = this.f1019b;
            synchronized (jVar) {
                str = jVar.f1009f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.f1017A) {
            builder.setAudioUnderrunCount(this.f1042z);
            this.j.setVideoFramesDropped(this.f1040x);
            this.j.setVideoFramesPlayed(this.f1041y);
            Long l7 = (Long) this.f1024g.get(this.f1026i);
            this.j.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = (Long) this.f1025h.get(this.f1026i);
            this.j.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.j.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            this.f1020c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.f1026i = null;
        this.f1042z = 0;
        this.f1040x = 0;
        this.f1041y = 0;
        this.f1034r = null;
        this.f1035s = null;
        this.f1036t = null;
        this.f1017A = false;
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    public final void c(R0 r7, D d7) {
        int iB;
        Matcher matcher;
        String strGroup;
        char c3;
        int i7 = 3;
        char c4 = 0;
        PlaybackMetrics.Builder builder = this.j;
        if (d7 == null || (iB = r7.b(d7.f10161a)) == -1) {
            return;
        }
        P0 p5 = this.f1023f;
        r7.f(iB, p5, false);
        int i8 = p5.f188c;
        Q0 q1 = this.f1022e;
        r7.n(i8, q1);
        C0016e0 c0016e0 = q1.f213c.f367b;
        if (c0016e0 == null) {
            i7 = 0;
        } else {
            int i9 = t.f17159a;
            String str = c0016e0.f346b;
            if (str != null) {
                switch (str) {
                    case "application/x-mpegURL":
                        c4 = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        c4 = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        c4 = 3;
                        break;
                    default:
                        c4 = 4;
                        break;
                }
            } else {
                Uri uri = c0016e0.f345a;
                String scheme = uri.getScheme();
                if (scheme == null || !Y4.D.n("rtsp", scheme)) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        c4 = 4;
                    } else {
                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (iLastIndexOf >= 0) {
                            String strA0 = Y4.D.a0(lastPathSegment.substring(iLastIndexOf + 1));
                            strA0.getClass();
                            switch (strA0.hashCode()) {
                                case 104579:
                                    if (strA0.equals("ism")) {
                                    }
                                    break;
                                case 108321:
                                    if (strA0.equals("mpd")) {
                                    }
                                    break;
                                case 3242057:
                                    if (strA0.equals("isml")) {
                                    }
                                    break;
                                case 3299913:
                                    if (strA0.equals("m3u8")) {
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                */
                            /*
                                Method dump skipped, instruction units count: 386
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: B1.n.c(A1.R0, c2.D):void");
                        }

                        public final void d(a aVar, String str) {
                            D d7 = aVar.f971d;
                            if ((d7 == null || !d7.a()) && str.equals(this.f1026i)) {
                                b();
                            }
                            this.f1024g.remove(str);
                            this.f1025h.remove(str);
                        }

                        public final void e(int i7, long j, X x4, int i8) {
                            int i9;
                            TrackChangeEvent.Builder timeSinceCreatedMillis = k.m(i7).setTimeSinceCreatedMillis(j - this.f1021d);
                            if (x4 != null) {
                                timeSinceCreatedMillis.setTrackState(1);
                                if (i8 != 1) {
                                    i9 = 3;
                                    if (i8 != 2) {
                                        i9 = i8 != 3 ? 1 : 4;
                                    }
                                } else {
                                    i9 = 2;
                                }
                                timeSinceCreatedMillis.setTrackChangeReason(i9);
                                String str = x4.f282B;
                                if (str != null) {
                                    timeSinceCreatedMillis.setContainerMimeType(str);
                                }
                                String str2 = x4.f283C;
                                if (str2 != null) {
                                    timeSinceCreatedMillis.setSampleMimeType(str2);
                                }
                                String str3 = x4.f312z;
                                if (str3 != null) {
                                    timeSinceCreatedMillis.setCodecName(str3);
                                }
                                int i10 = x4.f311y;
                                if (i10 != -1) {
                                    timeSinceCreatedMillis.setBitrate(i10);
                                }
                                int i11 = x4.f288H;
                                if (i11 != -1) {
                                    timeSinceCreatedMillis.setWidth(i11);
                                }
                                int i12 = x4.f289I;
                                if (i12 != -1) {
                                    timeSinceCreatedMillis.setHeight(i12);
                                }
                                int i13 = x4.f296P;
                                if (i13 != -1) {
                                    timeSinceCreatedMillis.setChannelCount(i13);
                                }
                                int i14 = x4.f297Q;
                                if (i14 != -1) {
                                    timeSinceCreatedMillis.setAudioSampleRate(i14);
                                }
                                String str4 = x4.f306c;
                                if (str4 != null) {
                                    int i15 = t.f17159a;
                                    String[] strArrSplit = str4.split("-", -1);
                                    Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                                    timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                                    Object obj = pairCreate.second;
                                    if (obj != null) {
                                        timeSinceCreatedMillis.setLanguageRegion((String) obj);
                                    }
                                }
                                float f7 = x4.f290J;
                                if (f7 != -1.0f) {
                                    timeSinceCreatedMillis.setVideoFrameRate(f7);
                                }
                            } else {
                                timeSinceCreatedMillis.setTrackState(0);
                            }
                            this.f1017A = true;
                            this.f1020c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
                        }
                    }
