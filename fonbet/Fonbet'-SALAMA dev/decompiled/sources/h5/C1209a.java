package h5;

import A1.A0;
import A1.B;
import A1.C0008a0;
import A1.C0012c0;
import A1.C0014d0;
import A1.C0016e0;
import A1.C0018f0;
import A1.C0019g;
import A1.C0022h0;
import A1.C0026j0;
import A1.C0031m;
import A1.C0033n;
import A1.C0037p;
import A1.C0042s;
import A1.C0046u;
import A1.C0047v;
import A1.C0048w;
import A1.K0;
import A1.L0;
import A1.M0;
import A1.N;
import A1.R0;
import A1.S0;
import A1.T0;
import A1.U;
import A1.V;
import A1.v0;
import A1.w0;
import A1.x0;
import A1.z0;
import A5.f;
import A5.o;
import A5.p;
import A5.q;
import A5.s;
import B1.h;
import C1.C0101g;
import D3.j;
import E3.AbstractC0167z;
import E3.C0165x;
import F1.i;
import R5.F;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.b1;
import c2.AbstractC0795a;
import c2.C0801g;
import c2.C0811q;
import c2.Q;
import c2.Z;
import c2.c0;
import c2.e0;
import c5.RunnableC0821b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads.zzbbd;
import d6.C0977k;
import f2.C1074f;
import h2.C1181c;
import h2.C1191m;
import i2.C1247c;
import i2.InterfaceC1261q;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import j2.C1306c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import r5.C1578c;
import t2.k;
import u2.C1628e;
import u2.C1642t;
import u2.InterfaceC1629f;
import u2.M;
import u2.r;
import v2.AbstractC1664a;
import v2.t;
import w1.L;
import w1.P2;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1209a implements q, z0 {

    /* renamed from: X, reason: collision with root package name */
    public static final Random f13565X = new Random();

    /* renamed from: A, reason: collision with root package name */
    public p f13566A;

    /* renamed from: B, reason: collision with root package name */
    public p f13567B;

    /* renamed from: C, reason: collision with root package name */
    public p f13568C;

    /* renamed from: E, reason: collision with root package name */
    public IcyInfo f13570E;

    /* renamed from: F, reason: collision with root package name */
    public IcyHeaders f13571F;

    /* renamed from: G, reason: collision with root package name */
    public int f13572G;

    /* renamed from: H, reason: collision with root package name */
    public C0101g f13573H;

    /* renamed from: I, reason: collision with root package name */
    public final C0033n f13574I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f13575J;

    /* renamed from: K, reason: collision with root package name */
    public final C0031m f13576K;

    /* renamed from: L, reason: collision with root package name */
    public final List f13577L;

    /* renamed from: P, reason: collision with root package name */
    public HashMap f13581P;

    /* renamed from: Q, reason: collision with root package name */
    public N f13582Q;

    /* renamed from: R, reason: collision with root package name */
    public Integer f13583R;

    /* renamed from: S, reason: collision with root package name */
    public AbstractC0795a f13584S;

    /* renamed from: T, reason: collision with root package name */
    public Integer f13585T;

    /* renamed from: W, reason: collision with root package name */
    public int f13588W;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13589a;

    /* renamed from: b, reason: collision with root package name */
    public final C1211c f13590b;

    /* renamed from: c, reason: collision with root package name */
    public final C1211c f13591c;

    /* renamed from: d, reason: collision with root package name */
    public long f13592d;

    /* renamed from: e, reason: collision with root package name */
    public long f13593e;

    /* renamed from: f, reason: collision with root package name */
    public long f13594f;

    /* renamed from: x, reason: collision with root package name */
    public Long f13595x;

    /* renamed from: y, reason: collision with root package name */
    public long f13596y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f13597z;

    /* renamed from: D, reason: collision with root package name */
    public final HashMap f13569D = new HashMap();

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f13578M = new ArrayList();

    /* renamed from: N, reason: collision with root package name */
    public final HashMap f13579N = new HashMap();

    /* renamed from: O, reason: collision with root package name */
    public int f13580O = 0;

    /* renamed from: U, reason: collision with root package name */
    public final Handler f13586U = new Handler(Looper.getMainLooper());

    /* renamed from: V, reason: collision with root package name */
    public final b1 f13587V = new b1(this, 9);

    public C1209a(Context context, f fVar, String str, Map map, List list, Boolean bool) {
        boolean z4 = false;
        this.f13589a = context;
        this.f13577L = list;
        this.f13575J = bool != null ? bool.booleanValue() : false;
        new s(fVar, L.i("com.ryanheise.just_audio.methods.", str)).b(this);
        this.f13590b = new C1211c(fVar, L.i("com.ryanheise.just_audio.events.", str));
        this.f13591c = new C1211c(fVar, L.i("com.ryanheise.just_audio.data.", str));
        this.f13588W = 1;
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                int longValue = (int) (S(map2.get("minBufferDuration")).longValue() / 1000);
                int longValue2 = (int) (S(map2.get("maxBufferDuration")).longValue() / 1000);
                int longValue3 = (int) (S(map2.get("bufferForPlaybackDuration")).longValue() / 1000);
                int longValue4 = (int) (S(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000);
                C0033n.a(longValue3, 0, "bufferForPlaybackMs", "0");
                C0033n.a(longValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                C0033n.a(longValue, longValue3, "minBufferMs", "bufferForPlaybackMs");
                C0033n.a(longValue, longValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                C0033n.a(longValue2, longValue, "maxBufferMs", "minBufferMs");
                boolean booleanValue = ((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue();
                int longValue5 = (int) (S(map2.get("backBufferDuration")).longValue() / 1000);
                C0033n.a(longValue5, 0, "backBufferDurationMs", "0");
                this.f13574I = new C0033n(new r(), longValue, longValue2, longValue3, longValue4, map2.get("targetBufferBytes") != null ? ((Integer) map2.get("targetBufferBytes")).intValue() : -1, booleanValue, longValue5);
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                int i7 = t.f17153a;
                float doubleValue = (float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue();
                AbstractC1664a.f(0.0f < doubleValue && doubleValue <= 1.0f);
                float doubleValue2 = (float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue();
                AbstractC1664a.f(doubleValue2 >= 1.0f);
                long longValue6 = S(map3.get("minUpdateInterval")).longValue() / 1000;
                AbstractC1664a.f(longValue6 > 0);
                float doubleValue3 = (float) ((Double) map3.get("proportionalControlFactor")).doubleValue();
                AbstractC1664a.f(doubleValue3 > 0.0f);
                float f7 = doubleValue3 / 1000000.0f;
                long longValue7 = S(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000;
                AbstractC1664a.f(longValue7 > 0);
                long E7 = t.E(longValue7);
                long longValue8 = S(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000;
                AbstractC1664a.f(longValue8 >= 0);
                long E8 = t.E(longValue8);
                float doubleValue4 = (float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
                if (doubleValue4 >= 0.0f && doubleValue4 < 1.0f) {
                    z4 = true;
                }
                AbstractC1664a.f(z4);
                this.f13576K = new C0031m(doubleValue, doubleValue2, longValue6, f7, E7, E8, doubleValue4);
            }
        }
    }

    public static Z H(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) list.get(i7)).intValue();
        }
        return new Z(Arrays.copyOf(iArr, size), new Random(f13565X.nextLong()));
    }

    public static Long S(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static Object V(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    public static HashMap W(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    public final C0811q A(Object obj) {
        return (C0811q) this.f13569D.get((String) obj);
    }

    @Override // A1.z0
    public final void F(T0 t02) {
        for (int i7 = 0; i7 < t02.a().size(); i7++) {
            e0 e0Var = ((S0) t02.a().get(i7)).f228b;
            for (int i8 = 0; i8 < e0Var.f10341a; i8++) {
                Metadata metadata = e0Var.f10344d[i8].f281A;
                if (metadata != null) {
                    for (int i9 = 0; i9 < metadata.f10562a.length; i9++) {
                        Metadata.Entry entry = metadata.f10562a[i9];
                        if (entry instanceof IcyHeaders) {
                            this.f13571F = (IcyHeaders) entry;
                            j();
                        }
                    }
                }
            }
        }
    }

    public final void J() {
        String str;
        boolean z4;
        j jVar;
        k kVar;
        AudioTrack audioTrack;
        if (this.f13588W == 2) {
            p pVar = this.f13566A;
            if (pVar != null) {
                pVar.error("abort", "Connection aborted", null);
                this.f13566A = null;
            }
            this.f13590b.b("abort", "Connection aborted", null);
        }
        p pVar2 = this.f13567B;
        if (pVar2 != null) {
            pVar2.success(new HashMap());
            this.f13567B = null;
        }
        this.f13569D.clear();
        this.f13584S = null;
        y();
        N n2 = this.f13582Q;
        if (n2 != null) {
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(n2)));
            sb.append(" [ExoPlayerLib/2.18.0] [");
            sb.append(t.f17157e);
            sb.append("] [");
            HashSet hashSet = V.f277a;
            synchronized (V.class) {
                str = V.f278b;
            }
            sb.append(str);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            n2.W();
            if (t.f17153a < 21 && (audioTrack = n2.f138M) != null) {
                audioTrack.release();
                n2.f138M = null;
            }
            n2.f175w.h();
            M0 m02 = n2.f177y;
            L0 l02 = (L0) m02.f125h;
            if (l02 != null) {
                try {
                    ((Context) m02.f121d).unregisterReceiver(l02);
                } catch (RuntimeException e7) {
                    AbstractC1664a.G(e7, "StreamVolumeManager", "Error unregistering stream volume receiver");
                }
                m02.f125h = null;
            }
            n2.f178z.getClass();
            n2.f126A.getClass();
            C0019g c0019g = n2.f176x;
            c0019g.f358c = null;
            c0019g.a();
            U u4 = n2.f163k;
            synchronized (u4) {
                if (!u4.f252P && u4.f276z.isAlive()) {
                    u4.f275y.c(7);
                    u4.g0(new C0042s(u4, 8), u4.f248L);
                    z4 = u4.f252P;
                }
                z4 = true;
            }
            if (!z4) {
                n2.f164l.k(10, new C0046u(3));
            }
            n2.f164l.j();
            n2.f162i.f17148a.removeCallbacksAndMessages(null);
            InterfaceC1629f interfaceC1629f = n2.f171s;
            h hVar = n2.f169q;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((C1642t) interfaceC1629f).f16831b.f17932b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1628e c1628e = (C1628e) it.next();
                if (c1628e.f16777b == hVar) {
                    c1628e.f16778c = true;
                    copyOnWriteArrayList.remove(c1628e);
                }
            }
            v0 g3 = n2.f154b0.g(1);
            n2.f154b0 = g3;
            v0 a2 = g3.a(g3.f586b);
            n2.f154b0 = a2;
            a2.f600q = a2.f602s;
            n2.f154b0.f601r = 0L;
            h hVar2 = n2.f169q;
            v2.r rVar = hVar2.f993y;
            AbstractC1664a.i(rVar);
            rVar.f17148a.post(new K0(hVar2, 1));
            t2.p pVar3 = (t2.p) n2.f161h;
            synchronized (pVar3.f16385c) {
                try {
                    if (t.f17153a >= 32 && (jVar = pVar3.f16389g) != null && (kVar = (k) jVar.f1726e) != null && ((Handler) jVar.f1725d) != null) {
                        ((Spatializer) jVar.f1723b).removeOnSpatializerStateChangedListener(kVar);
                        ((Handler) jVar.f1725d).removeCallbacksAndMessages(null);
                        jVar.f1725d = null;
                        jVar.f1726e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar3.f16394a = null;
            pVar3.f16395b = null;
            Surface surface = n2.f140O;
            if (surface != null) {
                surface.release();
                n2.f140O = null;
            }
            int i7 = C1306c.f14586a;
            n2.f150Y = true;
            this.f13582Q = null;
            this.f13588W = 1;
            j();
        }
        this.f13590b.a();
        this.f13591c.a();
    }

    public final void K() {
        new HashMap();
        HashMap hashMap = new HashMap();
        Long valueOf = R() == -9223372036854775807L ? null : Long.valueOf(R() * 1000);
        N n2 = this.f13582Q;
        this.f13594f = n2 != null ? n2.t() : 0L;
        hashMap.put("processingState", Integer.valueOf(t.e.e(this.f13588W)));
        hashMap.put("updatePosition", Long.valueOf(this.f13592d * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f13593e));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f13592d, this.f13594f) * 1000));
        HashMap hashMap2 = new HashMap();
        if (this.f13570E != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("title", this.f13570E.f10600b);
            hashMap3.put("url", this.f13570E.f10601c);
            hashMap2.put("info", hashMap3);
        }
        if (this.f13571F != null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("bitrate", Integer.valueOf(this.f13571F.f10593a));
            hashMap4.put("genre", this.f13571F.f10594b);
            hashMap4.put("name", this.f13571F.f10595c);
            hashMap4.put("metadataInterval", Integer.valueOf(this.f13571F.f10598f));
            hashMap4.put("url", this.f13571F.f10596d);
            hashMap4.put("isPublic", Boolean.valueOf(this.f13571F.f10597e));
            hashMap2.put("headers", hashMap4);
        }
        hashMap.put("icyMetadata", hashMap2);
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.f13585T);
        hashMap.put("androidAudioSessionId", this.f13583R);
        this.f13581P = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        Equalizer equalizer;
        if (this.f13582Q == null) {
            Context context = this.f13589a;
            C0047v c0047v = new C0047v(context);
            C0033n c0033n = this.f13574I;
            if (c0033n != null) {
                AbstractC1664a.h(!c0047v.f583q);
                c0047v.f573f = new C0042s(c0033n, 0);
            }
            C0031m c0031m = this.f13576K;
            if (c0031m != null) {
                AbstractC1664a.h(!c0047v.f583q);
                c0047v.f579m = c0031m;
            }
            boolean z4 = this.f13575J;
            if (z4) {
                C0037p c0037p = new C0037p(context);
                c0037p.f527c = true;
                AbstractC1664a.h(!c0047v.f583q);
                c0047v.f570c = new C0042s(c0037p, 1);
            }
            AbstractC1664a.h(!c0047v.f583q);
            c0047v.f583q = true;
            N n2 = new N(c0047v);
            this.f13582Q = n2;
            n2.W();
            v2.r rVar = n2.f163k.f275y;
            rVar.getClass();
            v2.q b7 = v2.r.b();
            b7.f17146a = rVar.f17148a.obtainMessage(24, z4 ? 1 : 0, 0);
            b7.b();
            N n7 = this.f13582Q;
            n7.W();
            int i7 = n7.f144S;
            if (i7 == 0) {
                this.f13583R = null;
            } else {
                this.f13583R = Integer.valueOf(i7);
            }
            y();
            if (this.f13583R != null) {
                for (Map map : this.f13577L) {
                    int intValue = this.f13583R.intValue();
                    String str = (String) map.get("type");
                    str.getClass();
                    if (str.equals("AndroidEqualizer")) {
                        equalizer = new Equalizer(0, intValue);
                    } else {
                        if (!str.equals("AndroidLoudnessEnhancer")) {
                            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
                        }
                        int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
                        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(intValue);
                        loudnessEnhancer.setTargetGain(round);
                        equalizer = loudnessEnhancer;
                    }
                    if (((Boolean) map.get("enabled")).booleanValue()) {
                        equalizer.setEnabled(true);
                    }
                    this.f13578M.add(equalizer);
                    this.f13579N.put((String) map.get("type"), equalizer);
                }
            }
            K();
            N n8 = this.f13582Q;
            n8.getClass();
            n8.f164l.a(this);
        }
    }

    public final HashMap M() {
        Equalizer equalizer = (Equalizer) this.f13579N.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s7 = 0; s7 < equalizer.getNumberOfBands(); s7 = (short) (s7 + 1)) {
            arrayList.add(W("index", Short.valueOf(s7), "lowerFrequency", Double.valueOf(equalizer.getBandFreqRange(s7)[0] / 1000.0d), "upperFrequency", Double.valueOf(equalizer.getBandFreqRange(s7)[1] / 1000.0d), "centerFrequency", Double.valueOf(equalizer.getCenterFreq(s7) / 1000.0d), "gain", Double.valueOf(equalizer.getBandLevel(s7) / 1000.0d)));
        }
        return W("parameters", W("minDecibels", Double.valueOf(equalizer.getBandLevelRange()[0] / 1000.0d), "maxDecibels", Double.valueOf(equalizer.getBandLevelRange()[1] / 1000.0d), "bands", arrayList));
    }

    public final void N(int i7, double d7) {
        ((Equalizer) this.f13579N.get("AndroidEqualizer")).setBandLevel((short) i7, (short) Math.round(d7 * 1000.0d));
    }

    public final AbstractC0795a O(Object obj) {
        Map map;
        String str;
        String str2;
        HashMap hashMap;
        AbstractC0795a c0811q;
        String str3;
        AbstractC0795a c1191m;
        String str4;
        int i7;
        Map map2;
        List list;
        E3.L l7;
        String str5;
        Uri uri;
        float f7;
        float f8;
        C0018f0 c0018f0;
        C0026j0 c0026j0;
        long j;
        C0016e0 c0016e0;
        boolean z4 = true;
        Map map3 = (Map) obj;
        String str6 = (String) map3.get("id");
        HashMap hashMap2 = this.f13569D;
        AbstractC0795a abstractC0795a = (AbstractC0795a) hashMap2.get(str6);
        if (abstractC0795a == null) {
            map = map3;
            str = (String) map.get("id");
            String str7 = (String) map.get("type");
            str7.getClass();
            switch (str7) {
                case "concatenating":
                    str2 = str6;
                    hashMap = hashMap2;
                    ArrayList P7 = P(map.get(ViewHierarchyNode.JsonKeys.CHILDREN));
                    AbstractC0795a[] abstractC0795aArr = new AbstractC0795a[P7.size()];
                    P7.toArray(abstractC0795aArr);
                    c0811q = new C0811q(((Boolean) map.get("useLazyPreparation")).booleanValue(), H((List) V(map, "shuffleOrder")), abstractC0795aArr);
                    str4 = str2;
                    abstractC0795a = c0811q;
                    hashMap.put(str4, abstractC0795a);
                    break;
                case "hls":
                    str3 = str6;
                    hashMap = hashMap2;
                    HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(r((Map) V(map, "headers")));
                    C0008a0 c0008a0 = new C0008a0();
                    C0165x c0165x = AbstractC0167z.f2083b;
                    E3.L l8 = E3.L.f2000e;
                    List emptyList = Collections.emptyList();
                    E3.L l9 = E3.L.f2000e;
                    C0018f0 c0018f02 = C0018f0.f352c;
                    Uri parse = Uri.parse((String) map.get("uri"));
                    C0016e0 c0016e02 = parse != null ? new C0016e0(parse, "application/x-mpegURL", null, emptyList, l9, null) : null;
                    C0022h0 c0022h0 = new C0022h0("", new C0012c0(c0008a0), c0016e02, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f02);
                    c0016e02.getClass();
                    InterfaceC1261q interfaceC1261q = hlsMediaSource$Factory.f10685c;
                    List list2 = c0016e02.f347c;
                    if (!list2.isEmpty()) {
                        interfaceC1261q = new w(7, interfaceC1261q, list2);
                    }
                    C1181c c1181c = hlsMediaSource$Factory.f10684b;
                    E1.h b7 = hlsMediaSource$Factory.f10688f.b(c0022h0);
                    hlsMediaSource$Factory.f10686d.getClass();
                    x0 x0Var = hlsMediaSource$Factory.f10683a;
                    M4.e eVar = hlsMediaSource$Factory.f10689g;
                    c1191m = new C1191m(c0022h0, hlsMediaSource$Factory.f10683a, c1181c, hlsMediaSource$Factory.f10687e, b7, eVar, new C1247c(x0Var, eVar, interfaceC1261q), hlsMediaSource$Factory.j, hlsMediaSource$Factory.f10690h, hlsMediaSource$Factory.f10691i);
                    str4 = str3;
                    abstractC0795a = c1191m;
                    hashMap.put(str4, abstractC0795a);
                    break;
                case "dash":
                    hashMap = hashMap2;
                    DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(r((Map) V(map, "headers")));
                    C0008a0 c0008a02 = new C0008a0();
                    C0165x c0165x2 = AbstractC0167z.f2083b;
                    E3.L l10 = E3.L.f2000e;
                    List emptyList2 = Collections.emptyList();
                    E3.L l11 = E3.L.f2000e;
                    C0018f0 c0018f03 = C0018f0.f352c;
                    Uri parse2 = Uri.parse((String) map.get("uri"));
                    C0016e0 c0016e03 = parse2 != null ? new C0016e0(parse2, "application/dash+xml", null, emptyList2, l11, str) : null;
                    C0022h0 c0022h02 = new C0022h0("", new C0012c0(c0008a02), c0016e03, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f03);
                    c0016e03.getClass();
                    M eVar2 = new g2.e();
                    List list3 = c0016e03.f347c;
                    str4 = str6;
                    abstractC0795a = new C1074f(c0022h02, dashMediaSource$Factory.f10678b, !list3.isEmpty() ? new P2(27, eVar2, list3, r2) : eVar2, dashMediaSource$Factory.f10677a, dashMediaSource$Factory.f10680d, dashMediaSource$Factory.f10679c.b(c0022h02), dashMediaSource$Factory.f10681e, dashMediaSource$Factory.f10682f);
                    hashMap.put(str4, abstractC0795a);
                    break;
                case "looping":
                    str2 = str6;
                    hashMap = hashMap2;
                    Integer num = (Integer) map.get("count");
                    AbstractC0795a O7 = O(map.get("child"));
                    int intValue = num.intValue();
                    AbstractC0795a[] abstractC0795aArr2 = new AbstractC0795a[intValue];
                    for (int i8 = 0; i8 < intValue; i8++) {
                        abstractC0795aArr2[i8] = O7;
                    }
                    c0811q = new C0811q(false, new Z(), abstractC0795aArr2);
                    str4 = str2;
                    abstractC0795a = c0811q;
                    hashMap.put(str4, abstractC0795a);
                    break;
                case "clipping":
                    str3 = str6;
                    hashMap = hashMap2;
                    Long S6 = S(map.get("start"));
                    Long S7 = S(map.get("end"));
                    c1191m = new C0801g(O(map.get("child")), S6 != null ? S6.longValue() : 0L, S7 != null ? S7.longValue() : Long.MIN_VALUE);
                    str4 = str3;
                    abstractC0795a = c1191m;
                    hashMap.put(str4, abstractC0795a);
                    break;
                case "progressive":
                    str3 = str6;
                    hashMap = hashMap2;
                    C0977k r7 = r((Map) V(map, "headers"));
                    Map map4 = (Map) V(map, RRWebOptionsEvent.EVENT_TAG);
                    i iVar = new i();
                    if (map4 == null || (map2 = (Map) map4.get("androidExtractorOptions")) == null) {
                        i7 = 0;
                    } else {
                        z4 = ((Boolean) map2.get("constantBitrateSeekingEnabled")).booleanValue();
                        r2 = ((Boolean) map2.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
                        i7 = ((Integer) map2.get("mp3Flags")).intValue();
                    }
                    synchronized (iVar) {
                        iVar.f2541a = z4;
                    }
                    synchronized (iVar) {
                        iVar.f2542b = r2;
                    }
                    synchronized (iVar) {
                        iVar.f2543c = i7;
                    }
                    F f9 = new F(iVar, 5);
                    M4.e eVar3 = new M4.e();
                    C0008a0 c0008a03 = new C0008a0();
                    C0165x c0165x3 = AbstractC0167z.f2083b;
                    E3.L l12 = E3.L.f2000e;
                    List emptyList3 = Collections.emptyList();
                    E3.L l13 = E3.L.f2000e;
                    C0018f0 c0018f04 = C0018f0.f352c;
                    Uri parse3 = Uri.parse((String) map.get("uri"));
                    C0016e0 c0016e04 = parse3 != null ? new C0016e0(parse3, null, null, emptyList3, l13, str) : null;
                    C0022h0 c0022h03 = new C0022h0("", new C0012c0(c0008a03), c0016e04, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f04);
                    c0016e04.getClass();
                    c0022h03.f367b.getClass();
                    c0022h03.f367b.getClass();
                    c1191m = new Q(c0022h03, r7, f9, E1.h.f1904a, eVar3);
                    str4 = str3;
                    abstractC0795a = c1191m;
                    hashMap.put(str4, abstractC0795a);
                    break;
                case "silence":
                    long longValue = S(map.get("duration")).longValue();
                    AbstractC1664a.h(longValue > 0);
                    C0022h0 c0022h04 = c0.f10312k;
                    c0022h04.getClass();
                    C0165x c0165x4 = AbstractC0167z.f2083b;
                    E3.L l14 = E3.L.f2000e;
                    List emptyList4 = Collections.emptyList();
                    E3.L l15 = E3.L.f2000e;
                    C0018f0 c0018f05 = C0018f0.f352c;
                    C0008a0 c0008a04 = new C0008a0();
                    C0012c0 c0012c0 = c0022h04.f370e;
                    c0008a04.f317a = c0012c0.f326a;
                    c0008a04.f318b = c0012c0.f327b;
                    c0008a04.f319c = c0012c0.f328c;
                    c0008a04.f320d = c0012c0.f329d;
                    c0008a04.f321e = c0012c0.f330e;
                    String str8 = c0022h04.f366a;
                    C0026j0 c0026j02 = c0022h04.f369d;
                    C0014d0 c0014d0 = c0022h04.f368c;
                    long j3 = c0014d0.f337a;
                    long j7 = c0014d0.f338b;
                    long j8 = c0014d0.f339c;
                    float f10 = c0014d0.f340d;
                    float f11 = c0014d0.f341e;
                    C0018f0 c0018f06 = c0022h04.f371f;
                    C0016e0 c0016e05 = c0022h04.f367b;
                    if (c0016e05 != null) {
                        str5 = c0016e05.f346b;
                        uri = c0016e05.f345a;
                        List list4 = c0016e05.f347c;
                        l7 = c0016e05.f348d;
                        C0165x c0165x5 = AbstractC0167z.f2083b;
                        E3.L l16 = E3.L.f2000e;
                        list = list4;
                    } else {
                        list = emptyList4;
                        l7 = l15;
                        str5 = null;
                        uri = null;
                    }
                    if (uri != null) {
                        f7 = f11;
                        Uri uri2 = uri;
                        f8 = f10;
                        String str9 = str5;
                        c0018f0 = c0018f06;
                        c0026j0 = c0026j02;
                        str2 = str6;
                        hashMap = hashMap2;
                        j = longValue;
                        c0016e0 = new C0016e0(uri2, str9, null, list, l7, str);
                    } else {
                        str2 = str6;
                        hashMap = hashMap2;
                        f7 = f11;
                        f8 = f10;
                        c0018f0 = c0018f06;
                        c0026j0 = c0026j02;
                        j = longValue;
                        c0016e0 = null;
                    }
                    if (str8 == null) {
                        str8 = "";
                    }
                    c0811q = new c0(j, new C0022h0(str8, new C0012c0(c0008a04), c0016e0, new C0014d0(j3, j7, j8, f8, f7), c0026j0 != null ? c0026j0 : C0026j0.f414X, c0018f0));
                    str4 = str2;
                    abstractC0795a = c0811q;
                    hashMap.put(str4, abstractC0795a);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
            }
        }
        return abstractC0795a;
    }

    public final ArrayList P(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(O(list.get(i7)));
        }
        return arrayList;
    }

    public final long Q() {
        long j = this.f13596y;
        if (j != -9223372036854775807L) {
            return j;
        }
        int i7 = this.f13588W;
        if (i7 != 1 && i7 != 2) {
            Long l7 = this.f13595x;
            return (l7 == null || l7.longValue() == -9223372036854775807L) ? this.f13582Q.y() : this.f13595x.longValue();
        }
        long y4 = this.f13582Q.y();
        if (y4 < 0) {
            return 0L;
        }
        return y4;
    }

    public final long R() {
        N n2;
        int i7 = this.f13588W;
        if (i7 == 1 || i7 == 2 || (n2 = this.f13582Q) == null) {
            return -9223372036854775807L;
        }
        return n2.C();
    }

    public final void T(AbstractC0795a abstractC0795a, long j, Integer num, p pVar) {
        this.f13596y = j;
        this.f13597z = num;
        this.f13585T = Integer.valueOf(num != null ? num.intValue() : 0);
        int e7 = t.e.e(this.f13588W);
        if (e7 != 0) {
            if (e7 != 1) {
                N n2 = this.f13582Q;
                n2.W();
                n2.W();
                n2.f176x.d(1, n2.D());
                n2.R(null);
                int i7 = C1306c.f14586a;
            } else {
                p pVar2 = this.f13566A;
                if (pVar2 != null) {
                    pVar2.error("abort", "Connection aborted", null);
                    this.f13566A = null;
                }
                this.f13590b.b("abort", "Connection aborted", null);
                N n7 = this.f13582Q;
                n7.W();
                n7.W();
                n7.f176x.d(1, n7.D());
                n7.R(null);
                int i8 = C1306c.f14586a;
            }
        }
        this.f13572G = 0;
        this.f13566A = pVar;
        i0();
        this.f13588W = 2;
        K();
        this.f13584S = abstractC0795a;
        this.f13582Q.O(abstractC0795a);
        this.f13582Q.K();
    }

    public final void U(double d7) {
        ((LoudnessEnhancer) this.f13579N.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d7 * 1000.0d));
    }

    public final void X() {
        if (this.f13582Q.D()) {
            N n2 = this.f13582Q;
            n2.W();
            n2.T(n2.f176x.d(n2.E(), false), 1, false);
            i0();
            p pVar = this.f13567B;
            if (pVar != null) {
                pVar.success(new HashMap());
                this.f13567B = null;
            }
        }
    }

    public final void Y(p pVar) {
        p pVar2;
        if (this.f13582Q.D()) {
            pVar.success(new HashMap());
            return;
        }
        p pVar3 = this.f13567B;
        if (pVar3 != null) {
            pVar3.success(new HashMap());
        }
        this.f13567B = pVar;
        N n2 = this.f13582Q;
        n2.W();
        int d7 = n2.f176x.d(n2.E(), true);
        n2.T(d7, d7 != 1 ? 2 : 1, true);
        i0();
        if (this.f13588W != 5 || (pVar2 = this.f13567B) == null) {
            return;
        }
        pVar2.success(new HashMap());
        this.f13567B = null;
    }

    public final void Z(long j, Integer num, p pVar) {
        int i7 = this.f13588W;
        if (i7 == 1 || i7 == 2) {
            pVar.success(new HashMap());
            return;
        }
        p pVar2 = this.f13568C;
        if (pVar2 != null) {
            try {
                pVar2.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f13568C = null;
            this.f13595x = null;
        }
        this.f13595x = Long.valueOf(j);
        this.f13568C = pVar;
        try {
            this.f13582Q.L(num != null ? num.intValue() : this.f13582Q.x(), j);
        } catch (RuntimeException e7) {
            this.f13568C = null;
            this.f13595x = null;
            throw e7;
        }
    }

    public final void a(String str, boolean z4) {
        ((AudioEffect) this.f13579N.get(str)).setEnabled(z4);
    }

    public final void a0(int i7, int i8, int i9) {
        C0101g c0101g = new C0101g(i7, i8, i9, 1, 0);
        if (this.f13588W == 2) {
            this.f13573H = c0101g;
        } else {
            this.f13582Q.N(c0101g);
        }
    }

    public final void b0(int i7) {
        N n2 = this.f13582Q;
        n2.W();
        if (n2.f128C != i7) {
            n2.f128C = i7;
            v2.r rVar = n2.f163k.f275y;
            rVar.getClass();
            v2.q b7 = v2.r.b();
            b7.f17146a = rVar.f17148a.obtainMessage(11, i7, 0);
            b7.b();
            B b8 = new B(i7, 0);
            C1578c c1578c = n2.f164l;
            c1578c.i(8, b8);
            n2.S();
            c1578c.g();
        }
    }

    public final void c0(float f7) {
        N n2 = this.f13582Q;
        n2.W();
        w0 w0Var = n2.f154b0.f597n;
        if (w0Var.f607b == f7) {
            return;
        }
        this.f13582Q.P(new w0(w0Var.f606a, f7));
        K();
    }

    public final void d0(boolean z4) {
        N n2 = this.f13582Q;
        n2.W();
        if (n2.f129D != z4) {
            n2.f129D = z4;
            v2.r rVar = n2.f163k.f275y;
            rVar.getClass();
            v2.q b7 = v2.r.b();
            b7.f17146a = rVar.f17148a.obtainMessage(12, z4 ? 1 : 0, 0);
            b7.b();
            C0048w c0048w = new C0048w(z4, 0);
            C1578c c1578c = n2.f164l;
            c1578c.i(9, c0048w);
            n2.S();
            c1578c.g();
        }
    }

    public final void e0(Object obj) {
        Map map = (Map) obj;
        AbstractC0795a abstractC0795a = (AbstractC0795a) this.f13569D.get((String) V(map, "id"));
        if (abstractC0795a == null) {
            return;
        }
        String str = (String) V(map, "type");
        str.getClass();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                e0(V(map, "child"));
            }
        } else {
            ((C0811q) abstractC0795a).G(H((List) V(map, "shuffleOrder")));
            Iterator it = ((List) V(map, ViewHierarchyNode.JsonKeys.CHILDREN)).iterator();
            while (it.hasNext()) {
                e0(it.next());
            }
        }
    }

    public final void f0(boolean z4) {
        N n2 = this.f13582Q;
        n2.W();
        if (n2.f147V == z4) {
            return;
        }
        n2.f147V = z4;
        n2.M(1, 9, Boolean.valueOf(z4));
        n2.f164l.k(23, new C0048w(z4, 1));
    }

    public final void g0(float f7) {
        N n2 = this.f13582Q;
        n2.W();
        w0 w0Var = n2.f154b0.f597n;
        if (w0Var.f606a == f7) {
            return;
        }
        this.f13582Q.P(new w0(f7, w0Var.f607b));
        if (this.f13582Q.D()) {
            i0();
        }
        K();
    }

    public final void h0(float f7) {
        N n2 = this.f13582Q;
        n2.W();
        final float i7 = t.i(f7, 0.0f, 1.0f);
        if (n2.f146U == i7) {
            return;
        }
        n2.f146U = i7;
        n2.M(1, 2, Float.valueOf(n2.f176x.f362g * i7));
        n2.f164l.k(22, new v2.e() { // from class: A1.D
            @Override // v2.e
            public final void invoke(Object obj) {
                ((z0) obj).l(i7);
            }
        });
    }

    @Override // A1.z0
    public final void i(int i7, A0 a02, A0 a03) {
        i0();
        if (i7 == 0 || i7 == 1) {
            Integer valueOf = Integer.valueOf(this.f13582Q.x());
            if (!valueOf.equals(this.f13585T)) {
                this.f13585T = valueOf;
            }
        }
        j();
    }

    public final void i0() {
        this.f13592d = Q();
        this.f13593e = System.currentTimeMillis();
    }

    public final void j() {
        K();
        m();
    }

    public final void m() {
        HashMap hashMap = this.f13581P;
        if (hashMap != null) {
            A5.h hVar = this.f13590b.f13599a;
            if (hVar != null) {
                hVar.c(hashMap);
            }
            this.f13581P = null;
        }
    }

    @Override // A1.z0
    public final void n(int i7) {
        if (i7 == 2) {
            if (Q() != this.f13592d) {
                this.f13592d = Q();
                this.f13593e = System.currentTimeMillis();
            }
            int i8 = this.f13588W;
            if (i8 != 3 && i8 != 2) {
                this.f13588W = 3;
                j();
            }
            Handler handler = this.f13586U;
            b1 b1Var = this.f13587V;
            handler.removeCallbacks(b1Var);
            handler.post(b1Var);
            return;
        }
        if (i7 != 3) {
            if (i7 != 4) {
                return;
            }
            if (this.f13588W != 5) {
                i0();
                this.f13588W = 5;
                j();
            }
            if (this.f13566A != null) {
                this.f13566A.success(new HashMap());
                this.f13566A = null;
                C0101g c0101g = this.f13573H;
                if (c0101g != null) {
                    this.f13582Q.N(c0101g);
                    this.f13573H = null;
                }
            }
            p pVar = this.f13567B;
            if (pVar != null) {
                pVar.success(new HashMap());
                this.f13567B = null;
                return;
            }
            return;
        }
        if (this.f13582Q.D()) {
            i0();
        }
        this.f13588W = 4;
        j();
        if (this.f13566A != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", R() == -9223372036854775807L ? null : Long.valueOf(R() * 1000));
            this.f13566A.success(hashMap);
            this.f13566A = null;
            C0101g c0101g2 = this.f13573H;
            if (c0101g2 != null) {
                this.f13582Q.N(c0101g2);
                this.f13573H = null;
            }
        }
        p pVar2 = this.f13568C;
        if (pVar2 != null) {
            this.f13595x = null;
            pVar2.success(new HashMap());
            this.f13568C = null;
        }
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, A5.r rVar) {
        char c3;
        L();
        try {
            try {
                try {
                    String str = oVar.f676a;
                    switch (str.hashCode()) {
                        case -2058172951:
                            if (str.equals("androidEqualizerBandSetGain")) {
                                c3 = 21;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1987605894:
                            if (str.equals("setShuffleMode")) {
                                c3 = '\b';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1875704736:
                            if (str.equals("setSkipSilence")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1540835818:
                            if (str.equals("concatenatingInsertAll")) {
                                c3 = 14;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1484304041:
                            if (str.equals("setShuffleOrder")) {
                                c3 = '\t';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -704119678:
                            if (str.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                                c3 = 11;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -345307082:
                            if (str.equals("androidLoudnessEnhancerSetTargetGain")) {
                                c3 = 19;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -104999328:
                            if (str.equals("setAndroidAudioAttributes")) {
                                c3 = 17;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -48357143:
                            if (str.equals("setLoopMode")) {
                                c3 = 7;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3327206:
                            if (str.equals("load")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3443508:
                            if (str.equals("play")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3526264:
                            if (str.equals("seek")) {
                                c3 = '\r';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 106440182:
                            if (str.equals("pause")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 670514716:
                            if (str.equals("setVolume")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 845471111:
                            if (str.equals("concatenatingRemoveRange")) {
                                c3 = 15;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 986980643:
                            if (str.equals("concatenatingMove")) {
                                c3 = 16;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1401390078:
                            if (str.equals("setPitch")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1404354821:
                            if (str.equals("setSpeed")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1454606831:
                            if (str.equals("setPreferredPeakBitRate")) {
                                c3 = '\f';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1624925565:
                            if (str.equals("androidEqualizerGetParameters")) {
                                c3 = 20;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1631191096:
                            if (str.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                                c3 = '\n';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2117606630:
                            if (str.equals("audioEffectSetEnabled")) {
                                c3 = 18;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    Handler handler = this.f13586U;
                    switch (c3) {
                        case 0:
                            Long S6 = S(oVar.a("initialPosition"));
                            T(O(oVar.a("audioSource")), S6 == null ? -9223372036854775807L : S6.longValue() / 1000, (Integer) oVar.a("initialIndex"), (p) rVar);
                            break;
                        case 1:
                            Y((p) rVar);
                            break;
                        case 2:
                            X();
                            ((p) rVar).success(new HashMap());
                            break;
                        case 3:
                            h0((float) ((Double) oVar.a("volume")).doubleValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case 4:
                            g0((float) ((Double) oVar.a("speed")).doubleValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case 5:
                            c0((float) ((Double) oVar.a("pitch")).doubleValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case 6:
                            f0(((Boolean) oVar.a("enabled")).booleanValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case 7:
                            b0(((Integer) oVar.a("loopMode")).intValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case '\b':
                            d0(((Integer) oVar.a("shuffleMode")).intValue() == 1);
                            ((p) rVar).success(new HashMap());
                            break;
                        case '\t':
                            e0(oVar.a("audioSource"));
                            ((p) rVar).success(new HashMap());
                            break;
                        case '\n':
                            ((p) rVar).success(new HashMap());
                            break;
                        case 11:
                            ((p) rVar).success(new HashMap());
                            break;
                        case '\f':
                            ((p) rVar).success(new HashMap());
                            break;
                        case '\r':
                            Long S7 = S(oVar.a("position"));
                            Z(S7 == null ? -9223372036854775807L : S7.longValue() / 1000, (Integer) oVar.a("index"), (p) rVar);
                            break;
                        case 14:
                            A(oVar.a("id")).u(((Integer) oVar.a("index")).intValue(), P(oVar.a(ViewHierarchyNode.JsonKeys.CHILDREN)), handler, new RunnableC0821b((p) rVar, 3));
                            A(oVar.a("id")).G(H((List) oVar.a("shuffleOrder")));
                            break;
                        case 15:
                            A(oVar.a("id")).D(((Integer) oVar.a(SpellCheckPlugin.START_INDEX_KEY)).intValue(), ((Integer) oVar.a(SpellCheckPlugin.END_INDEX_KEY)).intValue(), handler, new RunnableC0821b((p) rVar, 4));
                            A(oVar.a("id")).G(H((List) oVar.a("shuffleOrder")));
                            break;
                        case 16:
                            A(oVar.a("id")).C(((Integer) oVar.a("currentIndex")).intValue(), ((Integer) oVar.a("newIndex")).intValue(), handler, new RunnableC0821b((p) rVar, 5));
                            A(oVar.a("id")).G(H((List) oVar.a("shuffleOrder")));
                            break;
                        case 17:
                            a0(((Integer) oVar.a("contentType")).intValue(), ((Integer) oVar.a("flags")).intValue(), ((Integer) oVar.a("usage")).intValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case 18:
                            a((String) oVar.a("type"), ((Boolean) oVar.a("enabled")).booleanValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case 19:
                            U(((Double) oVar.a("targetGain")).doubleValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        case 20:
                            ((p) rVar).success(M());
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            N(((Integer) oVar.a("bandIndex")).intValue(), ((Double) oVar.a("gain")).doubleValue());
                            ((p) rVar).success(new HashMap());
                            break;
                        default:
                            ((p) rVar).notImplemented();
                            break;
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                    ((p) rVar).error("Error: " + e7, null, null);
                }
            } catch (IllegalStateException e8) {
                e8.printStackTrace();
                ((p) rVar).error("Illegal state: " + e8.getMessage(), null, null);
            }
            m();
        } catch (Throwable th) {
            m();
            throw th;
        }
    }

    @Override // A1.z0
    public final void q(Metadata metadata) {
        int i7 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f10562a;
            if (i7 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i7];
            if (entry instanceof IcyInfo) {
                this.f13570E = (IcyInfo) entry;
                j();
            }
            i7++;
        }
    }

    public final C0977k r(Map map) {
        HashMap hashMap;
        String str;
        String str2;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (Object obj : map.keySet()) {
                hashMap.put((String) obj, (String) map.get(obj));
            }
        }
        if (hashMap != null) {
            str = (String) hashMap.remove("User-Agent");
            if (str == null) {
                str = (String) hashMap.remove("user-agent");
            }
        } else {
            str = null;
        }
        if (str == null) {
            Context context = this.f13589a;
            int i7 = t.f17153a;
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "?";
            }
            str = e1.k.i(e1.k.k("just_audio/", str2, " (Linux;Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.18.0");
        }
        O1.f fVar = new O1.f(1);
        fVar.f4946e = str;
        fVar.f4944c = true;
        if (hashMap != null && hashMap.size() > 0) {
            w wVar = (w) fVar.f4945d;
            synchronized (wVar) {
                wVar.f11336c = null;
                ((HashMap) wVar.f11335b).clear();
                ((HashMap) wVar.f11335b).putAll(hashMap);
            }
        }
        return new C0977k(this.f13589a, fVar);
    }

    @Override // A1.z0
    public final void s(A1.r rVar) {
        int e7;
        Integer num;
        int intValue;
        boolean z4 = rVar instanceof A1.r;
        C1211c c1211c = this.f13590b;
        if (z4) {
            int i7 = rVar.f537c;
            if (i7 == 0) {
                StringBuilder sb = new StringBuilder("TYPE_SOURCE: ");
                AbstractC1664a.h(i7 == 0);
                Throwable cause = rVar.getCause();
                cause.getClass();
                sb.append(((IOException) cause).getMessage());
                Log.e("AudioPlayer", sb.toString());
            } else if (i7 != 1) {
                int i8 = rVar.f537c;
                if (i7 != 2) {
                    StringBuilder sb2 = new StringBuilder("default ExoPlaybackException: ");
                    AbstractC1664a.h(i8 == 2);
                    Throwable cause2 = rVar.getCause();
                    cause2.getClass();
                    sb2.append(((RuntimeException) cause2).getMessage());
                    Log.e("AudioPlayer", sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("TYPE_UNEXPECTED: ");
                    AbstractC1664a.h(i8 == 2);
                    Throwable cause3 = rVar.getCause();
                    cause3.getClass();
                    sb3.append(((RuntimeException) cause3).getMessage());
                    Log.e("AudioPlayer", sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("TYPE_RENDERER: ");
                AbstractC1664a.h(i7 == 1);
                Throwable cause4 = rVar.getCause();
                cause4.getClass();
                sb4.append(((Exception) cause4).getMessage());
                Log.e("AudioPlayer", sb4.toString());
            }
            String valueOf = String.valueOf(i7);
            String message = rVar.getMessage();
            HashMap W6 = W("index", this.f13585T);
            p pVar = this.f13566A;
            if (pVar != null) {
                pVar.error(valueOf, message, W6);
                this.f13566A = null;
            }
            c1211c.b(valueOf, message, W6);
        } else {
            Log.e("AudioPlayer", "default PlaybackException: " + rVar.getMessage());
            String valueOf2 = String.valueOf(rVar.f535a);
            String message2 = rVar.getMessage();
            HashMap W7 = W("index", this.f13585T);
            p pVar2 = this.f13566A;
            if (pVar2 != null) {
                pVar2.error(valueOf2, message2, W7);
                this.f13566A = null;
            }
            c1211c.b(valueOf2, message2, W7);
        }
        this.f13572G++;
        N n2 = this.f13582Q;
        n2.getClass();
        R0 A7 = n2.A();
        if (A7.p()) {
            e7 = -1;
        } else {
            int x4 = n2.x();
            n2.W();
            int i9 = n2.f128C;
            if (i9 == 1) {
                i9 = 0;
            }
            n2.W();
            e7 = A7.e(x4, i9, n2.f129D);
        }
        if (!(e7 != -1) || (num = this.f13585T) == null || this.f13572G > 5 || (intValue = num.intValue() + 1) >= this.f13582Q.A().o()) {
            return;
        }
        this.f13582Q.O(this.f13584S);
        this.f13582Q.K();
        this.f13582Q.L(intValue, 0L);
    }

    @Override // A1.z0
    public final void w(int i7) {
        int e7;
        int e8;
        int i8 = 0;
        if (this.f13596y != -9223372036854775807L || this.f13597z != null) {
            Integer num = this.f13597z;
            this.f13582Q.L(num != null ? num.intValue() : 0, this.f13596y);
            this.f13597z = null;
            this.f13596y = -9223372036854775807L;
        }
        Integer valueOf = Integer.valueOf(this.f13582Q.x());
        if (!valueOf.equals(this.f13585T)) {
            this.f13585T = valueOf;
            j();
        }
        if (this.f13582Q.E() == 4) {
            try {
                if (this.f13582Q.D()) {
                    if (this.f13580O == 0) {
                        N n2 = this.f13582Q;
                        n2.getClass();
                        if (n2.A().o() > 0) {
                            this.f13582Q.L(0, 0L);
                        }
                    }
                    N n7 = this.f13582Q;
                    n7.getClass();
                    R0 A7 = n7.A();
                    if (A7.p()) {
                        e7 = -1;
                    } else {
                        int x4 = n7.x();
                        n7.W();
                        int i9 = n7.f128C;
                        if (i9 == 1) {
                            i9 = 0;
                        }
                        n7.W();
                        e7 = A7.e(x4, i9, n7.f129D);
                    }
                    if (e7 != -1) {
                        N n8 = this.f13582Q;
                        n8.getClass();
                        R0 A8 = n8.A();
                        if (A8.p()) {
                            e8 = -1;
                        } else {
                            int x7 = n8.x();
                            n8.W();
                            int i10 = n8.f128C;
                            if (i10 != 1) {
                                i8 = i10;
                            }
                            n8.W();
                            e8 = A8.e(x7, i8, n8.f129D);
                        }
                        if (e8 != -1) {
                            n8.L(e8, -9223372036854775807L);
                        }
                    }
                } else {
                    int x8 = this.f13582Q.x();
                    N n9 = this.f13582Q;
                    n9.getClass();
                    if (x8 < n9.A().o()) {
                        N n10 = this.f13582Q;
                        n10.L(n10.x(), 0L);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        N n11 = this.f13582Q;
        n11.getClass();
        this.f13580O = n11.A().o();
    }

    public final void y() {
        Iterator it = this.f13578M.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.f13579N.clear();
    }
}
