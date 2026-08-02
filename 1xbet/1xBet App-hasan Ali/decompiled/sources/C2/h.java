package C2;

import P2.o;
import U2.j;
import X3.m;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import com.google.android.gms.internal.ads.B;
import com.google.android.gms.internal.ads.C0709Wb;
import com.google.android.gms.internal.ads.C0741a4;
import com.google.android.gms.internal.ads.C0906ds;
import com.google.android.gms.internal.ads.C1589t2;
import com.google.android.gms.internal.ads.C1617tm;
import com.google.android.gms.internal.ads.Ct;
import com.google.android.gms.internal.ads.Jw;
import com.google.android.gms.internal.ads.K3;
import com.google.android.gms.internal.ads.Lq;
import com.google.android.gms.internal.ads.VF;
import com.google.android.gms.internal.ads.W5;
import com.google.android.gms.internal.ads.X3;
import com.google.android.gms.internal.ads.X5;
import com.google.android.gms.internal.ads.Xm;
import com.google.android.gms.internal.ads.Zq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import m3.v;
import r.AbstractC2334l;
import r.C2343v;
import u.AbstractC2478z;
import u.C2439J;
import u.C2465l;

/* loaded from: classes.dex */
public final class h implements U2.f, Jw, D3.a, VF {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f832k;

    /* renamed from: l, reason: collision with root package name */
    public int f833l;

    /* renamed from: m, reason: collision with root package name */
    public Object f834m;

    public /* synthetic */ h(int i, int i5, Object obj) {
        this.f832k = i5;
        this.f834m = obj;
        this.f833l = i;
    }

    @Override // com.google.android.gms.internal.ads.VF
    public int a() {
        if (((MediaCodecInfo[]) this.f834m) == null) {
            this.f834m = new MediaCodecList(this.f833l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f834m).length;
    }

    @Override // com.google.android.gms.internal.ads.VF
    public boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.VF
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.VF
    public boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // U2.f
    public void e(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f833l);
        jsonWriter.endObject();
        U2.g.e(jsonWriter, (Map) this.f834m);
        jsonWriter.endObject();
    }

    public C2439J f(Float f, int i) {
        C2439J c2439j = new C2439J(f, AbstractC2478z.f19971b);
        ((C2343v) this.f834m).g(i, c2439j);
        return c2439j;
    }

    public void g() {
        WeakReference weakReference;
        this.f833l = 0;
        Iterator it = ((LinkedHashMap) this.f834m).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                g gVar = (g) m.Z(arrayList);
                if (((gVar == null || (weakReference = gVar.f829b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    int i6 = i5 - i;
                    if (((g) arrayList.get(i6)).f829b.get() == null) {
                        arrayList.remove(i6);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public boolean h() {
        return this.f833l < ((ArrayList) this.f834m).size();
    }

    public synchronized void i(b bVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f834m;
            Object obj = linkedHashMap.get(bVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(bVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            g gVar = new g(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    arrayList.add(gVar);
                    break;
                }
                g gVar2 = (g) arrayList.get(i5);
                if (i < gVar2.f831d) {
                    i5++;
                } else if (gVar2.f828a == identityHashCode && gVar2.f829b.get() == bitmap) {
                    arrayList.set(i5, gVar);
                } else {
                    arrayList.add(i5, gVar);
                }
            }
            int i6 = this.f833l;
            this.f833l = i6 + 1;
            if (i6 >= 10) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void j(int i) {
        if (i >= 10 && i != 20) {
            g();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String k(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r32 = 0;
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        PriorityQueue priorityQueue = new PriorityQueue(this.f833l, new C1589t2(3));
        int i5 = 0;
        while (i5 < split.length) {
            String[] I5 = AbstractC1668us.I(split[i5], r32);
            if (I5.length != 0) {
                int length = I5.length;
                int i6 = this.f833l;
                if (length < 6) {
                    AbstractC1803xs.L(i6, AbstractC1803xs.P(length, I5), AbstractC1803xs.t(I5, r32, length), length, priorityQueue);
                } else {
                    long P5 = AbstractC1803xs.P(6, I5);
                    AbstractC1803xs.L(i6, P5, AbstractC1803xs.t(I5, r32, 6), 6, priorityQueue);
                    int i7 = 1;
                    while (true) {
                        int length2 = I5.length;
                        if (i7 < length2 - 5) {
                            int d5 = AbstractC1668us.d(I5[i7 - 1]);
                            int d6 = AbstractC1668us.d(I5[i7 + 5]);
                            int i8 = i7;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String t5 = AbstractC1803xs.t(I5, i8, 6);
                            P5 = (((d6 + 2147483647L) % 1073807359) + (((((P5 + 1073807359) - ((((d5 + 2147483647L) % 1073807359) * AbstractC1803xs.c(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            AbstractC1803xs.L(i6, P5, t5, length2, priorityQueue);
                            i7 = i8 + 1;
                            split = split;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i5++;
            split = split;
            byteArrayOutputStream = byteArrayOutputStream;
            r32 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((W5) this.f834m).p1(((X5) it.next()).f12151b));
            } catch (IOException e3) {
                j.g("Error while writing hash to byteStream", e3);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e5) {
            j.g("HashManager: Unable to convert to Base64.", e5);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e6) {
            j.g("HashManager: Unable to convert to Base64.", e6);
            return "";
        }
    }

    public long l(B b3) {
        int i;
        C1617tm c1617tm = (C1617tm) this.f834m;
        int i5 = 0;
        b3.G(c1617tm.f15724a, 0, 1, false);
        int i6 = c1617tm.f15724a[0] & 255;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int i7 = 128;
        int i8 = 0;
        while (true) {
            i = i8 + 1;
            if ((i6 & i7) != 0) {
                break;
            }
            i7 >>= 1;
            i8 = i;
        }
        int i9 = i6 & (~i7);
        b3.G(c1617tm.f15724a, 1, i8, false);
        while (i5 < i8) {
            i5++;
            i9 = (c1617tm.f15724a[i5] & 255) + (i9 << 8);
        }
        this.f833l += i;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        String str = (String) obj;
        Zq zq = (Zq) this.f834m;
        Lq lq = zq.f12529a;
        if (!lq.f10504i0) {
            zq.f12531c.b(str, lq.f10534x0, zq.f12533e);
            return;
        }
        String str2 = zq.f12530b.f10823b;
        C0906ds c0906ds = zq.f12532d;
        c0906ds.getClass();
        o.f4767B.f4776j.getClass();
        K3 k32 = new K3(System.currentTimeMillis(), str2, str, this.f833l);
        Xm xm = c0906ds.f13189a;
        xm.getClass();
        xm.d(new C0709Wb(25, xm, k32));
    }

    @Override // D3.a
    public Object q(D3.o oVar) {
        if (!oVar.d()) {
            return Boolean.FALSE;
        }
        Ct ct = (Ct) oVar.b();
        byte[] d5 = ((C0741a4) ((X3) this.f834m).b()).d();
        ct.getClass();
        M0.e eVar = new M0.e(ct, d5);
        eVar.f3591c = this.f833l;
        eVar.q();
        return Boolean.TRUE;
    }

    public String toString() {
        switch (this.f832k) {
            case 13:
                StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
                int i = this.f833l;
                sb.append(i != 1 ? i != 2 ? "null" : "Finished" : "BoundReached");
                sb.append(", endState=");
                sb.append((C2465l) this.f834m);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        o.f4767B.f4774g.i("BufferingUrlPinger.attributionReportingManager", th);
    }

    @Override // com.google.android.gms.internal.ads.VF
    public MediaCodecInfo z(int i) {
        if (((MediaCodecInfo[]) this.f834m) == null) {
            this.f834m = new MediaCodecList(this.f833l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f834m)[i];
    }

    public /* synthetic */ h(int i, Serializable serializable) {
        this.f832k = i;
        this.f834m = serializable;
        this.f833l = 0;
    }

    public /* synthetic */ h(int i, Map map) {
        this.f832k = 3;
        this.f833l = i;
        this.f834m = map;
    }

    public h(boolean z3, boolean z5) {
        this.f832k = 9;
        int i = 1;
        if (!z3 && !z5) {
            i = 0;
        }
        this.f833l = i;
    }

    public h(int i) {
        this.f832k = 5;
        this.f834m = new W5(2);
        this.f833l = i;
    }

    public h(j3.b bVar, int i) {
        this.f832k = 12;
        v.e(bVar);
        this.f834m = bVar;
        this.f833l = i;
    }

    public h(int i, byte b3) {
        this.f832k = i;
        switch (i) {
            case 4:
                this.f834m = new C1617tm(8);
                break;
            case 11:
                this.f833l = 1;
                this.f834m = Collections.singletonList(null);
                break;
            case 14:
                this.f833l = 300;
                C2343v c2343v = AbstractC2334l.f19016a;
                this.f834m = new C2343v();
                break;
            default:
                this.f834m = new LinkedHashMap();
                break;
        }
    }

    public h(byte[] bArr) {
        this.f832k = 10;
        Objects.requireNonNull(bArr);
        this.f834m = null;
        this.f833l = 1;
    }

    public h(ArrayList arrayList) {
        this.f832k = 1;
        this.f834m = arrayList;
    }
}
