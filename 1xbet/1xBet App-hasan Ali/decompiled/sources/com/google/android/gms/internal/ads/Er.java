package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class Er implements Ei, Yj, KF {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8616k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8617l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8618m;

    public /* synthetic */ Er(int i, Object obj) {
        this.f8616k = i;
        this.f8618m = obj;
    }

    @Override // com.google.android.gms.internal.ads.KF
    public ByteBuffer B(int i) {
        return ((MediaCodec) this.f8617l).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public int a() {
        return ((MediaCodec) this.f8617l).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f8617l).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void c(int i, C1645uD c1645uD, long j5) {
        ((MediaCodec) this.f8617l).queueSecureInputBuffer(i, 0, c1645uD.i, j5, 0);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void d(int i, long j5) {
        ((MediaCodec) this.f8617l).releaseOutputBuffer(i, j5);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void e() {
        ((MediaCodec) this.f8617l).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void f(int i, int i5, int i6, long j5) {
        ((MediaCodec) this.f8617l).queueInputBuffer(i, 0, i5, j5, i6);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void g(int i) {
        ((MediaCodec) this.f8617l).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void h() {
        ((MediaCodec) this.f8617l).flush();
    }

    @Override // com.google.android.gms.internal.ads.KF
    public MediaFormat i() {
        return ((MediaCodec) this.f8617l).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.KF
    public int j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f8617l).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f8616k) {
            case 0:
                Cr cr = (Cr) this.f8617l;
                ((Hr) obj).q((Dr) cr.f8091k, cr.f8092l, (Throwable) this.f8618m);
                break;
            default:
                ((PE) obj).a((OE) this.f8617l, (C1469qG) this.f8618m);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void l() {
        C1667ur c1667ur = (C1667ur) this.f8618m;
        MediaCodec mediaCodec = (MediaCodec) this.f8617l;
        try {
            int i = AbstractC1260lo.f14419a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && c1667ur != null) {
                c1667ur.f(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (AbstractC1260lo.f14419a >= 35 && c1667ur != null) {
                c1667ur.f(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void m(int i) {
        ((MediaCodec) this.f8617l).releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void n(Surface surface) {
        ((MediaCodec) this.f8617l).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public /* synthetic */ boolean o(Qs qs) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void p(Bundle bundle) {
        ((MediaCodec) this.f8617l).setParameters(bundle);
    }

    public synchronized Map q() {
        try {
            if (((Map) this.f8618m) == null) {
                this.f8618m = Collections.unmodifiableMap(new HashMap((HashMap) this.f8617l));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f8618m;
    }

    public void r(ID id) {
        ((List) this.f8618m).add(id);
    }

    public Enum s(Object obj) {
        Enum r02 = (Enum) ((Map) this.f8618m).get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public void t(ID id) {
        ((List) this.f8617l).add(id);
    }

    public KD u() {
        return new KD((List) this.f8617l, (List) this.f8618m);
    }

    public Object v(Enum r32) {
        Object obj = ((Map) this.f8617l).get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }

    public boolean w(int i) {
        return ((WG) this.f8617l).f12034a.get(i);
    }

    public void x(SD sd) {
        synchronized (sd) {
        }
        Handler handler = (Handler) this.f8617l;
        if (handler != null) {
            handler.post(new RunnableC1081hn(15, this, sd));
        }
    }

    public /* synthetic */ Er(int i, Object obj, Object obj2) {
        this.f8616k = i;
        this.f8617l = obj;
        this.f8618m = obj2;
    }

    public Er(int i) {
        this.f8616k = i;
        switch (i) {
            case 4:
                this.f8617l = new HashMap();
                break;
        }
    }

    public Er(int i, int i5) {
        List arrayList;
        Object arrayList2;
        this.f8616k = 5;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.f8617l = arrayList;
        if (i5 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i5);
        }
        this.f8618m = arrayList2;
    }

    public Er(MediaCodec mediaCodec, C1667ur c1667ur) {
        boolean addMediaCodec;
        this.f8616k = 9;
        this.f8617l = mediaCodec;
        this.f8618m = c1667ur;
        if (AbstractC1260lo.f14419a < 35 || c1667ur == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1667ur.f15915m;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        AbstractC1668us.a0(((HashSet) c1667ur.f15914l).add(mediaCodec));
    }

    public Er(WG wg, SparseArray sparseArray) {
        this.f8616k = 6;
        this.f8617l = wg;
        SparseBooleanArray sparseBooleanArray = wg.f12034a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a5 = wg.a(i);
            OE oe = (OE) sparseArray.get(a5);
            oe.getClass();
            sparseArray2.append(a5, oe);
        }
        this.f8618m = sparseArray2;
    }
}
