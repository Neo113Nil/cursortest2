package p057h5;

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
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads.zzbbd;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
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
import p018c2.AbstractC0755a;
import p018c2.C0761g;
import p018c2.C0771q;
import p018c2.Q;
import p018c2.Z;
import p018c2.c0;
import p018c2.e0;
import p019c5.b;
import p054h2.m;
import p068j2.c;
import p136t.e;
import p139t2.k;
import p146u2.C0946e;
import p146u2.C0960t;
import p146u2.InterfaceC0947f;
import p146u2.r;
import p151v2.t;
import p155w1.L;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements q, z0 {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Random f13571X = new Random();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p f13572A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p f13573B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p f13574C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public IcyInfo f13576E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public IcyHeaders f13577F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f13578G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C0101g f13579H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0033n f13580I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f13581J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0031m f13582K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final List f13583L;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public HashMap f13587P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public N f13588Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Integer f13589R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public AbstractC0755a f13590S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Integer f13591T;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f13594W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f13597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13600f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Long f13601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f13602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f13603z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final HashMap f13575D = new HashMap();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ArrayList f13584M = new ArrayList();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final HashMap f13585N = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f13586O = 0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Handler f13592U = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final b1 f13593V = new b1(this, 9);

    public a(Context context, f fVar, String str, Map map, List list, Boolean bool) {
        boolean z4 = false;
        this.f13595a = context;
        this.f13583L = list;
        this.f13581J = bool != null ? bool.booleanValue() : false;
        new s(fVar, L.i("com.ryanheise.just_audio.methods.", str)).b(this);
        this.f13596b = new c(fVar, L.i("com.ryanheise.just_audio.events.", str));
        this.f13597c = new c(fVar, L.i("com.ryanheise.just_audio.data.", str));
        this.f13594W = 1;
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                int iLongValue = (int) (S(map2.get("minBufferDuration")).longValue() / 1000);
                int iLongValue2 = (int) (S(map2.get("maxBufferDuration")).longValue() / 1000);
                int iLongValue3 = (int) (S(map2.get("bufferForPlaybackDuration")).longValue() / 1000);
                int iLongValue4 = (int) (S(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000);
                C0033n.a(iLongValue3, 0, "bufferForPlaybackMs", "0");
                C0033n.a(iLongValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                C0033n.a(iLongValue, iLongValue3, "minBufferMs", "bufferForPlaybackMs");
                C0033n.a(iLongValue, iLongValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                C0033n.a(iLongValue2, iLongValue, "maxBufferMs", "minBufferMs");
                boolean zBooleanValue = ((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue();
                int iLongValue5 = (int) (S(map2.get("backBufferDuration")).longValue() / 1000);
                C0033n.a(iLongValue5, 0, "backBufferDurationMs", "0");
                this.f13580I = new C0033n(new r(), iLongValue, iLongValue2, iLongValue3, iLongValue4, map2.get("targetBufferBytes") != null ? ((Integer) map2.get("targetBufferBytes")).intValue() : -1, zBooleanValue, iLongValue5);
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                int i7 = t.f17159a;
                float fDoubleValue = (float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue();
                p151v2.a.f(0.0f < fDoubleValue && fDoubleValue <= 1.0f);
                float fDoubleValue2 = (float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue();
                p151v2.a.f(fDoubleValue2 >= 1.0f);
                long jLongValue = S(map3.get("minUpdateInterval")).longValue() / 1000;
                p151v2.a.f(jLongValue > 0);
                float fDoubleValue3 = (float) ((Double) map3.get("proportionalControlFactor")).doubleValue();
                p151v2.a.f(fDoubleValue3 > 0.0f);
                float f7 = fDoubleValue3 / 1000000.0f;
                long jLongValue2 = S(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000;
                p151v2.a.f(jLongValue2 > 0);
                long jE = t.E(jLongValue2);
                long jLongValue3 = S(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000;
                p151v2.a.f(jLongValue3 >= 0);
                long jE2 = t.E(jLongValue3);
                float fDoubleValue4 = (float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
                if (fDoubleValue4 >= 0.0f && fDoubleValue4 < 1.0f) {
                    z4 = true;
                }
                p151v2.a.f(z4);
                this.f13582K = new C0031m(fDoubleValue, fDoubleValue2, jLongValue, f7, jE, jE2, fDoubleValue4);
            }
        }
    }

    public static Z H(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) list.get(i7)).intValue();
        }
        return new Z(Arrays.copyOf(iArr, size), new Random(f13571X.nextLong()));
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
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            map.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return map;
    }

    public final C0771q A(Object obj) {
        return (C0771q) this.f13575D.get((String) obj);
    }

    @Override // A1.z0
    public final void F(T0 t7) {
        for (int i7 = 0; i7 < t7.a().size(); i7++) {
            e0 e0Var = ((S0) t7.a().get(i7)).f228b;
            for (int i8 = 0; i8 < e0Var.f10341a; i8++) {
                Metadata metadata = e0Var.f10344d[i8].f281A;
                if (metadata != null) {
                    for (int i9 = 0; i9 < metadata.f10562a.length; i9++) {
                        Metadata.Entry entry = metadata.f10562a[i9];
                        if (entry instanceof IcyHeaders) {
                            this.f13577F = (IcyHeaders) entry;
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
        if (this.f13594W == 2) {
            p pVar = this.f13572A;
            if (pVar != null) {
                pVar.error("abort", "Connection aborted", null);
                this.f13572A = null;
            }
            this.f13596b.b("abort", "Connection aborted", null);
        }
        p pVar2 = this.f13573B;
        if (pVar2 != null) {
            pVar2.success(new HashMap());
            this.f13573B = null;
        }
        this.f13575D.clear();
        this.f13590S = null;
        y();
        N n2 = this.f13588Q;
        if (n2 != null) {
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(n2)));
            sb.append(" [ExoPlayerLib/2.18.0] [");
            sb.append(t.f17163e);
            sb.append("] [");
            HashSet hashSet = V.f277a;
            synchronized (V.class) {
                str = V.f278b;
            }
            sb.append(str);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            n2.W();
            if (t.f17159a < 21 && (audioTrack = n2.f138M) != null) {
                audioTrack.release();
                n2.f138M = null;
            }
            n2.f175w.h();
            M0 m7 = n2.f177y;
            L0 l7 = (L0) m7.f125h;
            if (l7 != null) {
                try {
                    ((Context) m7.f121d).unregisterReceiver(l7);
                } catch (RuntimeException e7) {
                    p151v2.a.G(e7, "StreamVolumeManager", "Error unregistering stream volume receiver");
                }
                m7.f125h = null;
            }
            n2.f178z.getClass();
            n2.f126A.getClass();
            C0019g c0019g = n2.f176x;
            c0019g.f358c = null;
            c0019g.a();
            U u4 = n2.f163k;
            synchronized (u4) {
                if (u4.f252P || !u4.f276z.isAlive()) {
                    z4 = true;
                } else {
                    u4.f275y.c(7);
                    u4.g0(new C0042s(u4, 8), u4.f248L);
                    z4 = u4.f252P;
                }
            }
            if (!z4) {
                n2.f164l.k(10, new C0046u(3));
            }
            n2.f164l.j();
            n2.f162i.f17154a.removeCallbacksAndMessages(null);
            InterfaceC0947f interfaceC0947f = n2.f171s;
            h hVar = n2.f169q;
            CopyOnWriteArrayList<C0946e> copyOnWriteArrayList = (CopyOnWriteArrayList) ((C0960t) interfaceC0947f).f16837b.f17938b;
            for (C0946e c0946e : copyOnWriteArrayList) {
                if (c0946e.f16783b == hVar) {
                    c0946e.f16784c = true;
                    copyOnWriteArrayList.remove(c0946e);
                }
            }
            v0 v0VarG = n2.f154b0.g(1);
            n2.f154b0 = v0VarG;
            v0 v0VarA = v0VarG.a(v0VarG.f586b);
            n2.f154b0 = v0VarA;
            v0VarA.f600q = v0VarA.f602s;
            n2.f154b0.f601r = 0L;
            h hVar2 = n2.f169q;
            p151v2.r rVar = hVar2.f993y;
            p151v2.a.i(rVar);
            rVar.f17154a.post(new K0(hVar2, 1));
            p139t2.p pVar3 = (p139t2.p) n2.f161h;
            synchronized (pVar3.f16391c) {
                try {
                    if (t.f17159a >= 32 && (jVar = pVar3.f16395g) != null && (kVar = (k) jVar.f1726e) != null && ((Handler) jVar.f1725d) != null) {
                        ((Spatializer) jVar.f1723b).removeOnSpatializerStateChangedListener(kVar);
                        ((Handler) jVar.f1725d).removeCallbacksAndMessages(null);
                        jVar.f1725d = null;
                        jVar.f1726e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar3.f16400a = null;
            pVar3.f16401b = null;
            Surface surface = n2.f140O;
            if (surface != null) {
                surface.release();
                n2.f140O = null;
            }
            int i7 = c.f14592a;
            n2.f150Y = true;
            this.f13588Q = null;
            this.f13594W = 1;
            j();
        }
        this.f13596b.a();
        this.f13597c.a();
    }

    public final void K() {
        new HashMap();
        HashMap map = new HashMap();
        Long lValueOf = R() == -9223372036854775807L ? null : Long.valueOf(R() * 1000);
        N n2 = this.f13588Q;
        this.f13600f = n2 != null ? n2.t() : 0L;
        map.put("processingState", Integer.valueOf(e.e(this.f13594W)));
        map.put("updatePosition", Long.valueOf(this.f13598d * 1000));
        map.put("updateTime", Long.valueOf(this.f13599e));
        map.put("bufferedPosition", Long.valueOf(Math.max(this.f13598d, this.f13600f) * 1000));
        HashMap map2 = new HashMap();
        if (this.f13576E != null) {
            HashMap map3 = new HashMap();
            map3.put("title", this.f13576E.f10600b);
            map3.put("url", this.f13576E.f10601c);
            map2.put("info", map3);
        }
        if (this.f13577F != null) {
            HashMap map4 = new HashMap();
            map4.put("bitrate", Integer.valueOf(this.f13577F.f10593a));
            map4.put("genre", this.f13577F.f10594b);
            map4.put("name", this.f13577F.f10595c);
            map4.put("metadataInterval", Integer.valueOf(this.f13577F.f10598f));
            map4.put("url", this.f13577F.f10596d);
            map4.put("isPublic", Boolean.valueOf(this.f13577F.f10597e));
            map2.put("headers", map4);
        }
        map.put("icyMetadata", map2);
        map.put("duration", lValueOf);
        map.put("currentIndex", this.f13591T);
        map.put("androidAudioSessionId", this.f13589R);
        this.f13587P = map;
    }

    public final void L() {
        AudioEffect equalizer;
        if (this.f13588Q == null) {
            Context context = this.f13595a;
            C0047v c0047v = new C0047v(context);
            C0033n c0033n = this.f13580I;
            if (c0033n != null) {
                p151v2.a.h(!c0047v.f583q);
                c0047v.f573f = new C0042s(c0033n, 0);
            }
            C0031m c0031m = this.f13582K;
            if (c0031m != null) {
                p151v2.a.h(!c0047v.f583q);
                c0047v.f579m = c0031m;
            }
            boolean z4 = this.f13581J;
            if (z4) {
                C0037p c0037p = new C0037p(context);
                c0037p.f527c = true;
                p151v2.a.h(!c0047v.f583q);
                c0047v.f570c = new C0042s(c0037p, 1);
            }
            p151v2.a.h(!c0047v.f583q);
            c0047v.f583q = true;
            N n2 = new N(c0047v);
            this.f13588Q = n2;
            n2.W();
            p151v2.r rVar = n2.f163k.f275y;
            rVar.getClass();
            p151v2.q qVarB = p151v2.r.b();
            qVarB.f17152a = rVar.f17154a.obtainMessage(24, z4 ? 1 : 0, 0);
            qVarB.b();
            N n7 = this.f13588Q;
            n7.W();
            int i7 = n7.f144S;
            if (i7 == 0) {
                this.f13589R = null;
            } else {
                this.f13589R = Integer.valueOf(i7);
            }
            y();
            if (this.f13589R != null) {
                for (Map map : this.f13583L) {
                    int iIntValue = this.f13589R.intValue();
                    String str = (String) map.get("type");
                    str.getClass();
                    if (str.equals("AndroidEqualizer")) {
                        equalizer = new Equalizer(0, iIntValue);
                    } else {
                        if (!str.equals("AndroidLoudnessEnhancer")) {
                            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
                        }
                        int iRound = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
                        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(iIntValue);
                        loudnessEnhancer.setTargetGain(iRound);
                        equalizer = loudnessEnhancer;
                    }
                    if (((Boolean) map.get("enabled")).booleanValue()) {
                        equalizer.setEnabled(true);
                    }
                    this.f13584M.add(equalizer);
                    this.f13585N.put((String) map.get("type"), equalizer);
                }
            }
            K();
            N n8 = this.f13588Q;
            n8.getClass();
            n8.f164l.a(this);
        }
    }

    public final HashMap M() {
        Equalizer equalizer = (Equalizer) this.f13585N.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s7 = 0; s7 < equalizer.getNumberOfBands(); s7 = (short) (s7 + 1)) {
            arrayList.add(W("index", Short.valueOf(s7), "lowerFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s7)[0]) / 1000.0d), "upperFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s7)[1]) / 1000.0d), "centerFrequency", Double.valueOf(((double) equalizer.getCenterFreq(s7)) / 1000.0d), "gain", Double.valueOf(((double) equalizer.getBandLevel(s7)) / 1000.0d)));
        }
        return W("parameters", W("minDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[0]) / 1000.0d), "maxDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[1]) / 1000.0d), "bands", arrayList));
    }

    public final void N(int i7, double d7) {
        ((Equalizer) this.f13585N.get("AndroidEqualizer")).setBandLevel((short) i7, (short) Math.round(d7 * 1000.0d));
    }

    public final AbstractC0755a O(Object obj) {
        AbstractC0755a c0771q;
        AbstractC0755a mVar;
        String str;
        int iIntValue;
        Map map;
        List list;
        E3.L l7;
        String str2;
        Uri uri;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = true;
        Map map2 = (Map) obj;
        String str3 = (String) map2.get("id");
        HashMap map3 = this.f13575D;
        AbstractC0755a fVar = (AbstractC0755a) map3.get(str3);
        if (fVar == null) {
            Map map4 = map2;
            String str4 = (String) map4.get("id");
            String str5 = (String) map4.get("type");
            str5.getClass();
            switch (str5) {
                case "concatenating":
                    str3 = str3;
                    map3 = map3;
                    ArrayList arrayListP = P(map4.get(ViewHierarchyNode.JsonKeys.CHILDREN));
                    AbstractC0755a[] abstractC0755aArr = new AbstractC0755a[arrayListP.size()];
                    arrayListP.toArray(abstractC0755aArr);
                    c0771q = new C0771q(((Boolean) map4.get("useLazyPreparation")).booleanValue(), H((List) V(map4, "shuffleOrder")), abstractC0755aArr);
                    str = str3;
                    fVar = c0771q;
                    map3.put(str, fVar);
                    break;
                case "hls":
                    HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(r((Map) V(map4, "headers")));
                    C0008a0 c0008a0 = new C0008a0();
                    C0165x c0165x = AbstractC0167z.f2083b;
                    E3.L l8 = E3.L.f2000e;
                    List listEmptyList = Collections.emptyList();
                    E3.L l9 = E3.L.f2000e;
                    C0018f0 c0018f0 = C0018f0.f352c;
                    Uri uri2 = Uri.parse((String) map4.get("uri"));
                    C0016e0 c0016e0 = uri2 != null ? new C0016e0(uri2, "application/x-mpegURL", null, listEmptyList, l9, null) : null;
                    C0022h0 c0022h0 = new C0022h0("", new C0012c0(c0008a0), c0016e0, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f0);
                    c0016e0.getClass();
                    p061i2.q wVar = hlsMediaSource$Factory.f10685c;
                    List list2 = c0016e0.f347c;
                    if (!list2.isEmpty()) {
                        wVar = new w(7, wVar, list2);
                    }
                    p054h2.c cVar = hlsMediaSource$Factory.f10684b;
                    E1.h hVarB = hlsMediaSource$Factory.f10688f.b(c0022h0);
                    hlsMediaSource$Factory.f10686d.getClass();
                    x0 x0Var = hlsMediaSource$Factory.f10683a;
                    M4.e eVar = hlsMediaSource$Factory.f10689g;
                    mVar = new m(c0022h0, hlsMediaSource$Factory.f10683a, cVar, hlsMediaSource$Factory.f10687e, hVarB, eVar, new p061i2.c(x0Var, eVar, wVar), hlsMediaSource$Factory.j, hlsMediaSource$Factory.f10690h, hlsMediaSource$Factory.f10691i);
                    str = str3;
                    fVar = mVar;
                    map3.put(str, fVar);
                    break;
                case "dash":
                    map3 = map3;
                    DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(r((Map) V(map4, "headers")));
                    C0008a0 c0008a1 = new C0008a0();
                    C0165x c0165x2 = AbstractC0167z.f2083b;
                    E3.L l10 = E3.L.f2000e;
                    List listEmptyList2 = Collections.emptyList();
                    E3.L l11 = E3.L.f2000e;
                    C0018f0 c0018f1 = C0018f0.f352c;
                    Uri uri3 = Uri.parse((String) map4.get("uri"));
                    C0016e0 c0016e1 = uri3 != null ? new C0016e0(uri3, "application/dash+xml", null, listEmptyList2, l11, str4) : null;
                    C0022h0 c0022h1 = new C0022h0("", new C0012c0(c0008a1), c0016e1, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f1);
                    c0016e1.getClass();
                    g2.e eVar2 = new g2.e();
                    List list3 = c0016e1.f347c;
                    str = str3;
                    fVar = new p040f2.f(c0022h1, dashMediaSource$Factory.f10678b, !list3.isEmpty() ? new P2(27, eVar2, list3, zBooleanValue) : eVar2, dashMediaSource$Factory.f10677a, dashMediaSource$Factory.f10680d, dashMediaSource$Factory.f10679c.b(c0022h1), dashMediaSource$Factory.f10681e, dashMediaSource$Factory.f10682f);
                    map3.put(str, fVar);
                    break;
                case "looping":
                    str3 = str3;
                    map3 = map3;
                    Integer num = (Integer) map4.get("count");
                    AbstractC0755a abstractC0755aO = O(map4.get("child"));
                    int iIntValue2 = num.intValue();
                    AbstractC0755a[] abstractC0755aArr2 = new AbstractC0755a[iIntValue2];
                    for (int i7 = 0; i7 < iIntValue2; i7++) {
                        abstractC0755aArr2[i7] = abstractC0755aO;
                    }
                    c0771q = new C0771q(false, new Z(), abstractC0755aArr2);
                    str = str3;
                    fVar = c0771q;
                    map3.put(str, fVar);
                    break;
                case "clipping":
                    Long lS = S(map4.get("start"));
                    Long lS2 = S(map4.get("end"));
                    mVar = new C0761g(O(map4.get("child")), lS != null ? lS.longValue() : 0L, lS2 != null ? lS2.longValue() : Long.MIN_VALUE);
                    str = str3;
                    fVar = mVar;
                    map3.put(str, fVar);
                    break;
                case "progressive":
                    p028d6.k kVarR = r((Map) V(map4, "headers"));
                    Map map5 = (Map) V(map4, RRWebOptionsEvent.EVENT_TAG);
                    i iVar = new i();
                    if (map5 == null || (map = (Map) map5.get("androidExtractorOptions")) == null) {
                        iIntValue = 0;
                    } else {
                        zBooleanValue2 = ((Boolean) map.get("constantBitrateSeekingEnabled")).booleanValue();
                        zBooleanValue = ((Boolean) map.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
                        iIntValue = ((Integer) map.get("mp3Flags")).intValue();
                    }
                    synchronized (iVar) {
                        iVar.f2541a = zBooleanValue2;
                    }
                    synchronized (iVar) {
                        iVar.f2542b = zBooleanValue;
                    }
                    synchronized (iVar) {
                        iVar.f2543c = iIntValue;
                    }
                    F f7 = new F(iVar, 5);
                    M4.e eVar3 = new M4.e();
                    C0008a0 c0008a2 = new C0008a0();
                    C0165x c0165x3 = AbstractC0167z.f2083b;
                    E3.L l12 = E3.L.f2000e;
                    List listEmptyList3 = Collections.emptyList();
                    E3.L l13 = E3.L.f2000e;
                    C0018f0 c0018f2 = C0018f0.f352c;
                    Uri uri4 = Uri.parse((String) map4.get("uri"));
                    C0016e0 c0016e2 = uri4 != null ? new C0016e0(uri4, null, null, listEmptyList3, l13, str4) : null;
                    C0022h0 c0022h2 = new C0022h0("", new C0012c0(c0008a2), c0016e2, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f2);
                    c0016e2.getClass();
                    c0022h2.f367b.getClass();
                    c0022h2.f367b.getClass();
                    mVar = new Q(c0022h2, kVarR, f7, E1.h.f1904a, eVar3);
                    str = str3;
                    fVar = mVar;
                    map3.put(str, fVar);
                    break;
                case "silence":
                    long jLongValue = S(map4.get("duration")).longValue();
                    p151v2.a.h(jLongValue > 0);
                    C0022h0 c0022h3 = c0.f10312k;
                    c0022h3.getClass();
                    C0165x c0165x4 = AbstractC0167z.f2083b;
                    E3.L l14 = E3.L.f2000e;
                    List listEmptyList4 = Collections.emptyList();
                    E3.L l15 = E3.L.f2000e;
                    C0018f0 c0018f3 = C0018f0.f352c;
                    C0008a0 c0008a3 = new C0008a0();
                    C0012c0 c0012c0 = c0022h3.f370e;
                    c0008a3.f317a = c0012c0.f326a;
                    c0008a3.f318b = c0012c0.f327b;
                    c0008a3.f319c = c0012c0.f328c;
                    c0008a3.f320d = c0012c0.f329d;
                    c0008a3.f321e = c0012c0.f330e;
                    String str6 = c0022h3.f366a;
                    C0026j0 c0026j0 = c0022h3.f369d;
                    C0014d0 c0014d0 = c0022h3.f368c;
                    long j = c0014d0.f337a;
                    long j3 = c0014d0.f338b;
                    long j7 = c0014d0.f339c;
                    float f8 = c0014d0.f340d;
                    float f9 = c0014d0.f341e;
                    C0018f0 c0018f4 = c0022h3.f371f;
                    C0016e0 c0016e3 = c0022h3.f367b;
                    if (c0016e3 != null) {
                        str2 = c0016e3.f346b;
                        uri = c0016e3.f345a;
                        List list4 = c0016e3.f347c;
                        l7 = c0016e3.f348d;
                        C0165x c0165x5 = AbstractC0167z.f2083b;
                        E3.L l16 = E3.L.f2000e;
                        list = list4;
                    } else {
                        list = listEmptyList4;
                        l7 = l15;
                        str2 = null;
                        uri = null;
                    }
                    C0016e0 c0016e4 = uri != null ? new C0016e0(uri, str2, null, list, l7, str4) : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    c0771q = new c0(jLongValue, new C0022h0(str6, new C0012c0(c0008a3), c0016e4, new C0014d0(j, j3, j7, f8, f9), r13 != 0 ? c0026j0 : C0026j0.f414X, c0018f4));
                    str = str3;
                    fVar = c0771q;
                    map3.put(str, fVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown AudioSource type: " + map4.get("type"));
            }
        }
        return fVar;
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
        long j = this.f13602y;
        if (j != -9223372036854775807L) {
            return j;
        }
        int i7 = this.f13594W;
        if (i7 != 1 && i7 != 2) {
            Long l7 = this.f13601x;
            return (l7 == null || l7.longValue() == -9223372036854775807L) ? this.f13588Q.y() : this.f13601x.longValue();
        }
        long jY = this.f13588Q.y();
        if (jY < 0) {
            return 0L;
        }
        return jY;
    }

    public final long R() {
        N n2;
        int i7 = this.f13594W;
        if (i7 == 1 || i7 == 2 || (n2 = this.f13588Q) == null) {
            return -9223372036854775807L;
        }
        return n2.C();
    }

    public final void T(AbstractC0755a abstractC0755a, long j, Integer num, p pVar) {
        this.f13602y = j;
        this.f13603z = num;
        this.f13591T = Integer.valueOf(num != null ? num.intValue() : 0);
        int iE = e.e(this.f13594W);
        if (iE != 0) {
            if (iE != 1) {
                N n2 = this.f13588Q;
                n2.W();
                n2.W();
                n2.f176x.d(1, n2.D());
                n2.R(null);
                int i7 = c.f14592a;
            } else {
                p pVar2 = this.f13572A;
                if (pVar2 != null) {
                    pVar2.error("abort", "Connection aborted", null);
                    this.f13572A = null;
                }
                this.f13596b.b("abort", "Connection aborted", null);
                N n7 = this.f13588Q;
                n7.W();
                n7.W();
                n7.f176x.d(1, n7.D());
                n7.R(null);
                int i8 = c.f14592a;
            }
        }
        this.f13578G = 0;
        this.f13572A = pVar;
        i0();
        this.f13594W = 2;
        K();
        this.f13590S = abstractC0755a;
        this.f13588Q.O(abstractC0755a);
        this.f13588Q.K();
    }

    public final void U(double d7) {
        ((LoudnessEnhancer) this.f13585N.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d7 * 1000.0d));
    }

    public final void X() {
        if (this.f13588Q.D()) {
            N n2 = this.f13588Q;
            n2.W();
            n2.T(n2.f176x.d(n2.E(), false), 1, false);
            i0();
            p pVar = this.f13573B;
            if (pVar != null) {
                pVar.success(new HashMap());
                this.f13573B = null;
            }
        }
    }

    public final void Y(p pVar) {
        p pVar2;
        if (this.f13588Q.D()) {
            pVar.success(new HashMap());
            return;
        }
        p pVar3 = this.f13573B;
        if (pVar3 != null) {
            pVar3.success(new HashMap());
        }
        this.f13573B = pVar;
        N n2 = this.f13588Q;
        n2.W();
        int iD = n2.f176x.d(n2.E(), true);
        n2.T(iD, iD != 1 ? 2 : 1, true);
        i0();
        if (this.f13594W != 5 || (pVar2 = this.f13573B) == null) {
            return;
        }
        pVar2.success(new HashMap());
        this.f13573B = null;
    }

    public final void Z(long j, Integer num, p pVar) {
        int i7 = this.f13594W;
        if (i7 == 1 || i7 == 2) {
            pVar.success(new HashMap());
            return;
        }
        p pVar2 = this.f13574C;
        if (pVar2 != null) {
            try {
                pVar2.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f13574C = null;
            this.f13601x = null;
        }
        this.f13601x = Long.valueOf(j);
        this.f13574C = pVar;
        try {
            this.f13588Q.L(num != null ? num.intValue() : this.f13588Q.x(), j);
        } catch (RuntimeException e7) {
            this.f13574C = null;
            this.f13601x = null;
            throw e7;
        }
    }

    public final void a(String str, boolean z4) {
        ((AudioEffect) this.f13585N.get(str)).setEnabled(z4);
    }

    public final void a0(int i7, int i8, int i9) {
        C0101g c0101g = new C0101g(i7, i8, i9, 1, 0);
        if (this.f13594W == 2) {
            this.f13579H = c0101g;
        } else {
            this.f13588Q.N(c0101g);
        }
    }

    public final void b0(int i7) {
        N n2 = this.f13588Q;
        n2.W();
        if (n2.f128C != i7) {
            n2.f128C = i7;
            p151v2.r rVar = n2.f163k.f275y;
            rVar.getClass();
            p151v2.q qVarB = p151v2.r.b();
            qVarB.f17152a = rVar.f17154a.obtainMessage(11, i7, 0);
            qVarB.b();
            B b7 = new B(i7, 0);
            p128r5.c cVar = n2.f164l;
            cVar.i(8, b7);
            n2.S();
            cVar.g();
        }
    }

    public final void c0(float f7) {
        N n2 = this.f13588Q;
        n2.W();
        w0 w0Var = n2.f154b0.f597n;
        if (w0Var.f607b == f7) {
            return;
        }
        this.f13588Q.P(new w0(w0Var.f606a, f7));
        K();
    }

    public final void d0(boolean z4) {
        N n2 = this.f13588Q;
        n2.W();
        if (n2.f129D != z4) {
            n2.f129D = z4;
            p151v2.r rVar = n2.f163k.f275y;
            rVar.getClass();
            p151v2.q qVarB = p151v2.r.b();
            qVarB.f17152a = rVar.f17154a.obtainMessage(12, z4 ? 1 : 0, 0);
            qVarB.b();
            C0048w c0048w = new C0048w(z4, 0);
            p128r5.c cVar = n2.f164l;
            cVar.i(9, c0048w);
            n2.S();
            cVar.g();
        }
    }

    public final void e0(Object obj) {
        Map map = (Map) obj;
        AbstractC0755a abstractC0755a = (AbstractC0755a) this.f13575D.get((String) V(map, "id"));
        if (abstractC0755a == null) {
            return;
        }
        String str = (String) V(map, "type");
        str.getClass();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                e0(V(map, "child"));
            }
        } else {
            ((C0771q) abstractC0755a).G(H((List) V(map, "shuffleOrder")));
            Iterator it = ((List) V(map, ViewHierarchyNode.JsonKeys.CHILDREN)).iterator();
            while (it.hasNext()) {
                e0(it.next());
            }
        }
    }

    public final void f0(boolean z4) {
        N n2 = this.f13588Q;
        n2.W();
        if (n2.f147V == z4) {
            return;
        }
        n2.f147V = z4;
        n2.M(1, 9, Boolean.valueOf(z4));
        n2.f164l.k(23, new C0048w(z4, 1));
    }

    public final void g0(float f7) {
        N n2 = this.f13588Q;
        n2.W();
        w0 w0Var = n2.f154b0.f597n;
        if (w0Var.f606a == f7) {
            return;
        }
        this.f13588Q.P(new w0(f7, w0Var.f607b));
        if (this.f13588Q.D()) {
            i0();
        }
        K();
    }

    public final void h0(float f7) {
        N n2 = this.f13588Q;
        n2.W();
        final float fI = t.i(f7, 0.0f, 1.0f);
        if (n2.f146U == fI) {
            return;
        }
        n2.f146U = fI;
        n2.M(1, 2, Float.valueOf(n2.f176x.f362g * fI));
        n2.f164l.k(22, new p151v2.e() { // from class: A1.D
            @Override // p151v2.e
            public final void invoke(Object obj) {
                ((z0) obj).l(fI);
            }
        });
    }

    @Override // A1.z0
    public final void i(int i7, A0 a2, A0 a4) {
        i0();
        if (i7 == 0 || i7 == 1) {
            Integer numValueOf = Integer.valueOf(this.f13588Q.x());
            if (!numValueOf.equals(this.f13591T)) {
                this.f13591T = numValueOf;
            }
        }
        j();
    }

    public final void i0() {
        this.f13598d = Q();
        this.f13599e = System.currentTimeMillis();
    }

    public final void j() {
        K();
        m();
    }

    public final void m() {
        HashMap map = this.f13587P;
        if (map != null) {
            A5.h hVar = this.f13596b.f13605a;
            if (hVar != null) {
                hVar.c(map);
            }
            this.f13587P = null;
        }
    }

    @Override // A1.z0
    public final void n(int i7) {
        if (i7 == 2) {
            if (Q() != this.f13598d) {
                this.f13598d = Q();
                this.f13599e = System.currentTimeMillis();
            }
            int i8 = this.f13594W;
            if (i8 != 3 && i8 != 2) {
                this.f13594W = 3;
                j();
            }
            Handler handler = this.f13592U;
            b1 b1Var = this.f13593V;
            handler.removeCallbacks(b1Var);
            handler.post(b1Var);
            return;
        }
        if (i7 != 3) {
            if (i7 != 4) {
                return;
            }
            if (this.f13594W != 5) {
                i0();
                this.f13594W = 5;
                j();
            }
            if (this.f13572A != null) {
                this.f13572A.success(new HashMap());
                this.f13572A = null;
                C0101g c0101g = this.f13579H;
                if (c0101g != null) {
                    this.f13588Q.N(c0101g);
                    this.f13579H = null;
                }
            }
            p pVar = this.f13573B;
            if (pVar != null) {
                pVar.success(new HashMap());
                this.f13573B = null;
                return;
            }
            return;
        }
        if (this.f13588Q.D()) {
            i0();
        }
        this.f13594W = 4;
        j();
        if (this.f13572A != null) {
            HashMap map = new HashMap();
            map.put("duration", R() == -9223372036854775807L ? null : Long.valueOf(R() * 1000));
            this.f13572A.success(map);
            this.f13572A = null;
            C0101g c0101g2 = this.f13579H;
            if (c0101g2 != null) {
                this.f13588Q.N(c0101g2);
                this.f13579H = null;
            }
        }
        p pVar2 = this.f13574C;
        if (pVar2 != null) {
            this.f13601x = null;
            pVar2.success(new HashMap());
            this.f13574C = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x011b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // A5.q
    public final void onMethodCall(o oVar, A5.r rVar) {
        byte b7;
        L();
        try {
            try {
                try {
                    String str = oVar.f676a;
                    switch (str.hashCode()) {
                        case -2058172951:
                            if (!str.equals("androidEqualizerBandSetGain")) {
                                b7 = -1;
                            } else {
                                b7 = 21;
                            }
                            break;
                        case -1987605894:
                            if (!str.equals("setShuffleMode")) {
                                b7 = -1;
                            } else {
                                b7 = 8;
                            }
                            break;
                        case -1875704736:
                            if (!str.equals("setSkipSilence")) {
                                b7 = -1;
                            } else {
                                b7 = 6;
                            }
                            break;
                        case -1540835818:
                            if (!str.equals("concatenatingInsertAll")) {
                                b7 = -1;
                            } else {
                                b7 = 14;
                            }
                            break;
                        case -1484304041:
                            if (!str.equals("setShuffleOrder")) {
                                b7 = -1;
                            } else {
                                b7 = 9;
                            }
                            break;
                        case -704119678:
                            if (!str.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                                b7 = -1;
                            } else {
                                b7 = 11;
                            }
                            break;
                        case -345307082:
                            if (!str.equals("androidLoudnessEnhancerSetTargetGain")) {
                                b7 = -1;
                            } else {
                                b7 = 19;
                            }
                            break;
                        case -104999328:
                            if (!str.equals("setAndroidAudioAttributes")) {
                                b7 = -1;
                            } else {
                                b7 = 17;
                            }
                            break;
                        case -48357143:
                            if (!str.equals("setLoopMode")) {
                                b7 = -1;
                            } else {
                                b7 = 7;
                            }
                            break;
                        case 3327206:
                            if (!str.equals("load")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 3443508:
                            if (!str.equals("play")) {
                                b7 = -1;
                            } else {
                                b7 = 1;
                            }
                            break;
                        case 3526264:
                            if (!str.equals("seek")) {
                                b7 = -1;
                            } else {
                                b7 = 13;
                            }
                            break;
                        case 106440182:
                            if (!str.equals("pause")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case 670514716:
                            if (!str.equals("setVolume")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        case 845471111:
                            if (!str.equals("concatenatingRemoveRange")) {
                                b7 = -1;
                            } else {
                                b7 = 15;
                            }
                            break;
                        case 986980643:
                            if (!str.equals("concatenatingMove")) {
                                b7 = -1;
                            } else {
                                b7 = 16;
                            }
                            break;
                        case 1401390078:
                            if (!str.equals("setPitch")) {
                                b7 = -1;
                            } else {
                                b7 = 5;
                            }
                            break;
                        case 1404354821:
                            if (!str.equals("setSpeed")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 1454606831:
                            if (!str.equals("setPreferredPeakBitRate")) {
                                b7 = -1;
                            } else {
                                b7 = 12;
                            }
                            break;
                        case 1624925565:
                            if (!str.equals("androidEqualizerGetParameters")) {
                                b7 = -1;
                            } else {
                                b7 = 20;
                            }
                            break;
                        case 1631191096:
                            if (!str.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                                b7 = -1;
                            } else {
                                b7 = 10;
                            }
                            break;
                        case 2117606630:
                            if (!str.equals("audioEffectSetEnabled")) {
                                b7 = -1;
                            } else {
                                b7 = 18;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    Handler handler = this.f13592U;
                    switch (b7) {
                        case 0:
                            Long lS = S(oVar.a("initialPosition"));
                            T(O(oVar.a("audioSource")), lS == null ? -9223372036854775807L : lS.longValue() / 1000, (Integer) oVar.a("initialIndex"), (p) rVar);
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
                        case 8:
                            d0(((Integer) oVar.a("shuffleMode")).intValue() == 1);
                            ((p) rVar).success(new HashMap());
                            break;
                        case 9:
                            e0(oVar.a("audioSource"));
                            ((p) rVar).success(new HashMap());
                            break;
                        case 10:
                            ((p) rVar).success(new HashMap());
                            break;
                        case 11:
                            ((p) rVar).success(new HashMap());
                            break;
                        case 12:
                            ((p) rVar).success(new HashMap());
                            break;
                        case 13:
                            Long lS2 = S(oVar.a("position"));
                            Z(lS2 == null ? -9223372036854775807L : lS2.longValue() / 1000, (Integer) oVar.a("index"), (p) rVar);
                            break;
                        case 14:
                            A(oVar.a("id")).u(((Integer) oVar.a("index")).intValue(), P(oVar.a(ViewHierarchyNode.JsonKeys.CHILDREN)), handler, new b((p) rVar, 3));
                            A(oVar.a("id")).G(H((List) oVar.a("shuffleOrder")));
                            break;
                        case 15:
                            A(oVar.a("id")).D(((Integer) oVar.a(SpellCheckPlugin.START_INDEX_KEY)).intValue(), ((Integer) oVar.a(SpellCheckPlugin.END_INDEX_KEY)).intValue(), handler, new b((p) rVar, 4));
                            A(oVar.a("id")).G(H((List) oVar.a("shuffleOrder")));
                            break;
                        case 16:
                            A(oVar.a("id")).C(((Integer) oVar.a("currentIndex")).intValue(), ((Integer) oVar.a("newIndex")).intValue(), handler, new b((p) rVar, 5));
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
        } finally {
            m();
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
                this.f13576E = (IcyInfo) entry;
                j();
            }
            i7++;
        }
    }

    public final p028d6.k r(Map map) {
        HashMap map2;
        String strI;
        String str;
        if (map == null) {
            map2 = null;
        } else {
            map2 = new HashMap();
            for (Object obj : map.keySet()) {
                map2.put((String) obj, (String) map.get(obj));
            }
        }
        if (map2 != null) {
            strI = (String) map2.remove("User-Agent");
            if (strI == null) {
                strI = (String) map2.remove("user-agent");
            }
        } else {
            strI = null;
        }
        if (strI == null) {
            Context context = this.f13595a;
            int i7 = t.f17159a;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "?";
            }
            strI = p031e1.k.i(p031e1.k.k("just_audio/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.18.0");
        }
        O1.f fVar = new O1.f(1);
        fVar.f4946e = strI;
        fVar.f4944c = true;
        if (map2 != null && map2.size() > 0) {
            w wVar = (w) fVar.f4945d;
            synchronized (wVar) {
                wVar.f11336c = null;
                ((HashMap) wVar.f11335b).clear();
                ((HashMap) wVar.f11335b).putAll(map2);
            }
        }
        return new p028d6.k(this.f13595a, fVar);
    }

    @Override // A1.z0
    public final void s(A1.r rVar) {
        int iE;
        Integer num;
        int iIntValue;
        boolean z4 = rVar instanceof A1.r;
        c cVar = this.f13596b;
        if (z4) {
            int i7 = rVar.f537c;
            if (i7 == 0) {
                StringBuilder sb = new StringBuilder("TYPE_SOURCE: ");
                p151v2.a.h(i7 == 0);
                Throwable cause = rVar.getCause();
                cause.getClass();
                sb.append(((IOException) cause).getMessage());
                Log.e("AudioPlayer", sb.toString());
            } else if (i7 != 1) {
                int i8 = rVar.f537c;
                if (i7 != 2) {
                    StringBuilder sb2 = new StringBuilder("default ExoPlaybackException: ");
                    p151v2.a.h(i8 == 2);
                    Throwable cause2 = rVar.getCause();
                    cause2.getClass();
                    sb2.append(((RuntimeException) cause2).getMessage());
                    Log.e("AudioPlayer", sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("TYPE_UNEXPECTED: ");
                    p151v2.a.h(i8 == 2);
                    Throwable cause3 = rVar.getCause();
                    cause3.getClass();
                    sb3.append(((RuntimeException) cause3).getMessage());
                    Log.e("AudioPlayer", sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("TYPE_RENDERER: ");
                p151v2.a.h(i7 == 1);
                Throwable cause4 = rVar.getCause();
                cause4.getClass();
                sb4.append(((Exception) cause4).getMessage());
                Log.e("AudioPlayer", sb4.toString());
            }
            String strValueOf = String.valueOf(i7);
            String message = rVar.getMessage();
            HashMap mapW = W("index", this.f13591T);
            p pVar = this.f13572A;
            if (pVar != null) {
                pVar.error(strValueOf, message, mapW);
                this.f13572A = null;
            }
            cVar.b(strValueOf, message, mapW);
        } else {
            Log.e("AudioPlayer", "default PlaybackException: " + rVar.getMessage());
            String strValueOf2 = String.valueOf(rVar.f535a);
            String message2 = rVar.getMessage();
            HashMap mapW2 = W("index", this.f13591T);
            p pVar2 = this.f13572A;
            if (pVar2 != null) {
                pVar2.error(strValueOf2, message2, mapW2);
                this.f13572A = null;
            }
            cVar.b(strValueOf2, message2, mapW2);
        }
        this.f13578G++;
        N n2 = this.f13588Q;
        n2.getClass();
        R0 r0A = n2.A();
        if (r0A.p()) {
            iE = -1;
        } else {
            int iX = n2.x();
            n2.W();
            int i9 = n2.f128C;
            if (i9 == 1) {
                i9 = 0;
            }
            n2.W();
            iE = r0A.e(iX, i9, n2.f129D);
        }
        if (!(iE != -1) || (num = this.f13591T) == null || this.f13578G > 5 || (iIntValue = num.intValue() + 1) >= this.f13588Q.A().o()) {
            return;
        }
        this.f13588Q.O(this.f13590S);
        this.f13588Q.K();
        this.f13588Q.L(iIntValue, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x0046, B:18:0x0050, B:20:0x0054, B:22:0x0063, B:25:0x006d, B:36:0x009c, B:45:0x00c5, B:39:0x00ad, B:43:0x00ba, B:28:0x0080, B:31:0x008c, B:46:0x00c9, B:48:0x00de), top: B:53:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x0046, B:18:0x0050, B:20:0x0054, B:22:0x0063, B:25:0x006d, B:36:0x009c, B:45:0x00c5, B:39:0x00ad, B:43:0x00ba, B:28:0x0080, B:31:0x008c, B:46:0x00c9, B:48:0x00de), top: B:53:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x0046, B:18:0x0050, B:20:0x0054, B:22:0x0063, B:25:0x006d, B:36:0x009c, B:45:0x00c5, B:39:0x00ad, B:43:0x00ba, B:28:0x0080, B:31:0x008c, B:46:0x00c9, B:48:0x00de), top: B:53:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x0046, B:18:0x0050, B:20:0x0054, B:22:0x0063, B:25:0x006d, B:36:0x009c, B:45:0x00c5, B:39:0x00ad, B:43:0x00ba, B:28:0x0080, B:31:0x008c, B:46:0x00c9, B:48:0x00de), top: B:53:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x0046, B:18:0x0050, B:20:0x0054, B:22:0x0063, B:25:0x006d, B:36:0x009c, B:45:0x00c5, B:39:0x00ad, B:43:0x00ba, B:28:0x0080, B:31:0x008c, B:46:0x00c9, B:48:0x00de), top: B:53:0x0046 }] */
    @Override // A1.z0
    public final void w(int i7) {
        N n2;
        R0 r0A;
        int i8;
        int iE;
        boolean z4;
        N n7;
        R0 r0A2;
        int i9;
        int iE2;
        int i10 = 0;
        if (this.f13602y != -9223372036854775807L || this.f13603z != null) {
            Integer num = this.f13603z;
            this.f13588Q.L(num != null ? num.intValue() : 0, this.f13602y);
            this.f13603z = null;
            this.f13602y = -9223372036854775807L;
        }
        Integer numValueOf = Integer.valueOf(this.f13588Q.x());
        if (!numValueOf.equals(this.f13591T)) {
            this.f13591T = numValueOf;
            j();
        }
        if (this.f13588Q.E() == 4) {
            try {
                if (!this.f13588Q.D()) {
                    int iX = this.f13588Q.x();
                    N n8 = this.f13588Q;
                    n8.getClass();
                    if (iX < n8.A().o()) {
                        N n9 = this.f13588Q;
                        n9.L(n9.x(), 0L);
                    }
                } else if (this.f13586O == 0) {
                    N n10 = this.f13588Q;
                    n10.getClass();
                    if (n10.A().o() > 0) {
                        this.f13588Q.L(0, 0L);
                    } else {
                        n2 = this.f13588Q;
                        n2.getClass();
                        r0A = n2.A();
                        if (r0A.p()) {
                            iE = -1;
                        } else {
                            int iX2 = n2.x();
                            n2.W();
                            i8 = n2.f128C;
                            if (i8 == 1) {
                                i8 = 0;
                            }
                            n2.W();
                            iE = r0A.e(iX2, i8, n2.f129D);
                        }
                        if (iE != -1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            n7 = this.f13588Q;
                            n7.getClass();
                            r0A2 = n7.A();
                            if (r0A2.p()) {
                                iE2 = -1;
                            } else {
                                int iX3 = n7.x();
                                n7.W();
                                i9 = n7.f128C;
                                if (i9 == 1) {
                                    i10 = i9;
                                }
                                n7.W();
                                iE2 = r0A2.e(iX3, i10, n7.f129D);
                            }
                            if (iE2 != -1) {
                                n7.L(iE2, -9223372036854775807L);
                            }
                        }
                    }
                } else {
                    n2 = this.f13588Q;
                    n2.getClass();
                    r0A = n2.A();
                    if (r0A.p()) {
                        iE = -1;
                    } else {
                        int iX4 = n2.x();
                        n2.W();
                        i8 = n2.f128C;
                        if (i8 == 1) {
                            i8 = 0;
                        }
                        n2.W();
                        iE = r0A.e(iX4, i8, n2.f129D);
                    }
                    if (iE != -1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        n7 = this.f13588Q;
                        n7.getClass();
                        r0A2 = n7.A();
                        if (r0A2.p()) {
                            iE2 = -1;
                        } else {
                            int iX5 = n7.x();
                            n7.W();
                            i9 = n7.f128C;
                            if (i9 == 1) {
                                i10 = i9;
                            }
                            n7.W();
                            iE2 = r0A2.e(iX5, i10, n7.f129D);
                        }
                        if (iE2 != -1) {
                            n7.L(iE2, -9223372036854775807L);
                        }
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        N n11 = this.f13588Q;
        n11.getClass();
        this.f13586O = n11.A().o();
    }

    public final void y() {
        Iterator it = this.f13584M.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.f13585N.clear();
    }
}
