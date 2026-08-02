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
import c2.D;
import java.util.HashMap;
import java.util.regex.Matcher;
import v2.t;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1017A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1019b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f1020c;

    /* renamed from: i, reason: collision with root package name */
    public String f1026i;
    public PlaybackMetrics.Builder j;

    /* renamed from: k, reason: collision with root package name */
    public int f1027k;

    /* renamed from: n, reason: collision with root package name */
    public r f1030n;

    /* renamed from: o, reason: collision with root package name */
    public m f1031o;

    /* renamed from: p, reason: collision with root package name */
    public m f1032p;

    /* renamed from: q, reason: collision with root package name */
    public m f1033q;

    /* renamed from: r, reason: collision with root package name */
    public X f1034r;

    /* renamed from: s, reason: collision with root package name */
    public X f1035s;

    /* renamed from: t, reason: collision with root package name */
    public X f1036t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1037u;

    /* renamed from: v, reason: collision with root package name */
    public int f1038v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1039w;

    /* renamed from: x, reason: collision with root package name */
    public int f1040x;

    /* renamed from: y, reason: collision with root package name */
    public int f1041y;

    /* renamed from: z, reason: collision with root package name */
    public int f1042z;

    /* renamed from: e, reason: collision with root package name */
    public final Q0 f1022e = new Q0();

    /* renamed from: f, reason: collision with root package name */
    public final P0 f1023f = new P0();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f1025h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1024g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f1021d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f1028l = 0;

    /* renamed from: m, reason: collision with root package name */
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
        PlaybackMetrics build;
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
            PlaybackSession playbackSession = this.f1020c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
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

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c7, code lost:
    
        if (r10.contains("format=m3u8-aapl") != false) goto L82;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(R0 r02, D d7) {
        int b7;
        char c3;
        int i7 = 3;
        char c4 = 0;
        PlaybackMetrics.Builder builder = this.j;
        if (d7 == null || (b7 = r02.b(d7.f10161a)) == -1) {
            return;
        }
        P0 p02 = this.f1023f;
        r02.f(b7, p02, false);
        int i8 = p02.f188c;
        Q0 q02 = this.f1022e;
        r02.n(i8, q02);
        C0016e0 c0016e0 = q02.f213c.f367b;
        if (c0016e0 == null) {
            i7 = 0;
        } else {
            int i9 = t.f17153a;
            String str = c0016e0.f346b;
            if (str == null) {
                Uri uri = c0016e0.f345a;
                String scheme = uri.getScheme();
                if (scheme == null || !Y4.D.n("rtsp", scheme)) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (lastIndexOf >= 0) {
                            String a02 = Y4.D.a0(lastPathSegment.substring(lastIndexOf + 1));
                            a02.getClass();
                            switch (a02) {
                                case "ism":
                                case "isml":
                                    c3 = 1;
                                    break;
                                case "mpd":
                                    c3 = 0;
                                    break;
                                case "m3u8":
                                    c3 = 2;
                                    break;
                                default:
                                    c3 = 4;
                                    break;
                            }
                            if (c3 != 4) {
                                c4 = c3;
                                if (c4 != 0) {
                                    i7 = c4 != 1 ? c4 != 2 ? 1 : 4 : 5;
                                }
                            }
                        }
                        String path = uri.getPath();
                        path.getClass();
                        Matcher matcher = t.f17161i.matcher(path);
                        if (matcher.matches()) {
                            String group = matcher.group(2);
                            if (group != null) {
                                if (!group.contains("format=mpd-time-csf")) {
                                }
                                if (c4 != 0) {
                                }
                            }
                            c4 = 1;
                            if (c4 != 0) {
                            }
                        }
                    }
                    c4 = 4;
                    if (c4 != 0) {
                    }
                }
                c4 = 3;
                if (c4 != 0) {
                }
            } else {
                switch (str.hashCode()) {
                    case -979127466:
                        if (str.equals("application/x-mpegURL")) {
                            break;
                        }
                        break;
                    case -156749520:
                        if (str.equals("application/vnd.ms-sstr+xml")) {
                            break;
                        }
                        break;
                    case 64194685:
                        if (str.equals("application/dash+xml")) {
                            break;
                        }
                        break;
                    case 1154777587:
                        if (str.equals("application/x-rtsp")) {
                            break;
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 386
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
                TrackChangeEvent.Builder timeSinceCreatedMillis;
                TrackChangeEvent build;
                int i9;
                timeSinceCreatedMillis = k.m(i7).setTimeSinceCreatedMillis(j - this.f1021d);
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
                        int i15 = t.f17153a;
                        String[] split = str4.split("-", -1);
                        Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                        timeSinceCreatedMillis.setLanguage((String) create.first);
                        Object obj = create.second;
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
                PlaybackSession playbackSession = this.f1020c;
                build = timeSinceCreatedMillis.build();
                playbackSession.reportTrackChangeEvent(build);
            }
        }
