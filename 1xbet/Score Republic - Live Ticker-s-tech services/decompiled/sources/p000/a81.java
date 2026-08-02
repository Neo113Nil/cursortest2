package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import live.football.scorerepublic.MainActivity;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class a81 implements c81, InterfaceC0514no, InterfaceC0705su, iu0, InterfaceC0845wm, y01, nb1, f82, InterfaceC0350j8 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f62j;

    /* JADX INFO: renamed from: k */
    public Object f63k;

    /* JADX INFO: renamed from: l */
    public Object f64l;

    public a81(int i) {
        this.f62j = i;
        switch (i) {
            case 8:
                h90 h90Var = h90.f3130e;
                this.f63k = new SparseIntArray();
                this.f64l = h90Var;
                break;
            case 10:
                this.f63k = new HashMap();
                this.f64l = new ot1(6);
                ot1 ot1Var = new ot1(0);
                gu1 gu1Var = gu1.f2920o;
                ArrayList arrayList = ot1Var.f5911a;
                arrayList.add(gu1Var);
                arrayList.add(gu1.f2922p);
                arrayList.add(gu1.f2924q);
                arrayList.add(gu1.f2926r);
                arrayList.add(gu1.f2928s);
                arrayList.add(gu1.f2930t);
                arrayList.add(gu1.f2932u);
                m95s(ot1Var);
                ot1 ot1Var2 = new ot1(1);
                gu1 gu1Var2 = gu1.f2881F;
                ArrayList arrayList2 = ot1Var2.f5911a;
                arrayList2.add(gu1Var2);
                arrayList2.add(gu1.f2894S);
                arrayList2.add(gu1.f2895T);
                arrayList2.add(gu1.f2896U);
                arrayList2.add(gu1.f2897V);
                arrayList2.add(gu1.f2899X);
                arrayList2.add(gu1.f2900Y);
                arrayList2.add(gu1.f2905d0);
                m95s(ot1Var2);
                ot1 ot1Var3 = new ot1(2);
                gu1 gu1Var3 = gu1.f2916m;
                ArrayList arrayList3 = ot1Var3.f5911a;
                arrayList3.add(gu1Var3);
                arrayList3.add(gu1.f2934v);
                arrayList3.add(gu1.f2936w);
                arrayList3.add(gu1.f2937x);
                arrayList3.add(gu1.f2878C);
                arrayList3.add(gu1.f2939z);
                arrayList3.add(gu1.f2879D);
                arrayList3.add(gu1.f2883H);
                arrayList3.add(gu1.f2898W);
                arrayList3.add(gu1.f2910i0);
                arrayList3.add(gu1.f2915l0);
                arrayList3.add(gu1.f2921o0);
                arrayList3.add(gu1.f2923p0);
                m95s(ot1Var3);
                ot1 ot1Var4 = new ot1(3);
                gu1 gu1Var4 = gu1.f2914l;
                ArrayList arrayList4 = ot1Var4.f5911a;
                arrayList4.add(gu1Var4);
                arrayList4.add(gu1.f2904c0);
                arrayList4.add(gu1.f2907f0);
                m95s(ot1Var4);
                ot1 ot1Var5 = new ot1(4);
                gu1 gu1Var5 = gu1.f2884I;
                ArrayList arrayList5 = ot1Var5.f5911a;
                arrayList5.add(gu1Var5);
                arrayList5.add(gu1.f2885J);
                arrayList5.add(gu1.f2886K);
                arrayList5.add(gu1.f2887L);
                arrayList5.add(gu1.f2888M);
                arrayList5.add(gu1.f2889N);
                arrayList5.add(gu1.f2890O);
                arrayList5.add(gu1.f2931t0);
                m95s(ot1Var5);
                ot1 ot1Var6 = new ot1(5);
                gu1 gu1Var6 = gu1.f2912k;
                ArrayList arrayList6 = ot1Var6.f5911a;
                arrayList6.add(gu1Var6);
                arrayList6.add(gu1.f2880E);
                arrayList6.add(gu1.f2901Z);
                arrayList6.add(gu1.f2902a0);
                arrayList6.add(gu1.f2903b0);
                arrayList6.add(gu1.f2908g0);
                arrayList6.add(gu1.f2909h0);
                arrayList6.add(gu1.f2911j0);
                arrayList6.add(gu1.f2913k0);
                arrayList6.add(gu1.f2919n0);
                m95s(ot1Var6);
                ot1 ot1Var7 = new ot1(7);
                gu1 gu1Var7 = gu1.f2918n;
                ArrayList arrayList7 = ot1Var7.f5911a;
                arrayList7.add(gu1Var7);
                arrayList7.add(gu1.f2938y);
                arrayList7.add(gu1.f2876A);
                arrayList7.add(gu1.f2877B);
                arrayList7.add(gu1.f2882G);
                arrayList7.add(gu1.f2891P);
                arrayList7.add(gu1.f2892Q);
                arrayList7.add(gu1.f2893R);
                arrayList7.add(gu1.f2906e0);
                arrayList7.add(gu1.f2917m0);
                arrayList7.add(gu1.f2925q0);
                arrayList7.add(gu1.f2927r0);
                arrayList7.add(gu1.f2929s0);
                m95s(ot1Var7);
                break;
            case 23:
                break;
            case 27:
                this.f63k = new TreeMap();
                this.f64l = new TreeMap();
                break;
            default:
                this.f63k = Collections.synchronizedMap(new WeakHashMap());
                this.f64l = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    @Override // p000.c81
    /* JADX INFO: renamed from: a */
    public void mo77a(InterfaceC0187eu interfaceC0187eu) {
        ((c81) this.f63k).mo77a(interfaceC0187eu);
    }

    @Override // p000.y01
    public void accept(Object obj, Object obj2) {
        int i = e22.f1910k;
        w12 w12Var = new w12((qc1) obj2);
        f22 f22Var = (f22) ((h22) obj).m3890l();
        String[] strArr = (String[]) this.f64l;
        String str = (String) this.f63k;
        Parcel parcelM5810d = f22Var.m5810d();
        iu1.m2703c(parcelM5810d, w12Var);
        parcelM5810d.writeString(str);
        parcelM5810d.writeInt(0);
        parcelM5810d.writeStringArray(strArr);
        parcelM5810d.writeByteArray(null);
        f22Var.m5806F(parcelM5810d, 1);
    }

    @Override // p000.c81
    /* JADX INFO: renamed from: b */
    public void mo78b(Object obj) {
        c81 c81Var = (c81) this.f63k;
        try {
            ((InterfaceC0254gm) ((xs0) this.f64l).f9050c).accept(obj);
            c81Var.mo78b(obj);
        } catch (Throwable th) {
            wo1.m5394u(th);
            c81Var.onError(th);
        }
    }

    @Override // p000.f82
    /* JADX INFO: renamed from: c */
    public Object mo79c(e82 e82Var) throws IOException {
        Uri uri = e82Var.f2016d;
        AtomicLong atomicLong = v82.f8133a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = v82.f8133a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        w82 w82Var = e82Var.f2013a;
        ArrayList arrayListM1386a = e82Var.m1386a(w82Var.mo2567c(uriBuild));
        a81[] a81VarArr = (a81[]) this.f64l;
        if (a81VarArr != null) {
            a81VarArr[0].m94r(arrayListM1386a);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListM1386a.get(0);
            try {
                ((do1) this.f63k).m1275b(outputStream);
                a81[] a81VarArr2 = (a81[]) this.f64l;
                if (a81VarArr2 != null) {
                    a81 a81Var = a81VarArr2[0];
                    if (((q82) a81Var.f64l) == null) {
                        throw new C0287hi("Cannot sync underlying stream");
                    }
                    ((OutputStream) a81Var.f63k).flush();
                    ((q82) a81Var.f64l).f6417j.getFD().sync();
                }
                outputStream.close();
                w82Var.mo2569e(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                w82Var.mo2568d(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    @Override // p000.InterfaceC0350j8
    public ListenableFuture call() {
        switch (this.f62j) {
            case 25:
                a92 a92Var = (a92) this.f64l;
                String strValueOf = String.valueOf(a92Var.f96a);
                bx1 bx1Var = a92Var.f103h;
                String strConcat = "Initialize ".concat(strValueOf);
                bx1Var.getClass();
                aa2 aa2VarM796c = bx1.m796c(strConcat);
                try {
                    synchronized (a92Var.f102g) {
                        try {
                            if (((List) this.f63k) == null) {
                                this.f63k = a92Var.f104i;
                                a92Var.f104i = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    ArrayList arrayList = new ArrayList(((List) this.f63k).size());
                    f92 f92Var = new f92((a92) this.f64l);
                    Iterator it = ((List) this.f63k).iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((InterfaceC0387k8) it.next()).apply(f92Var));
                        } catch (Exception e) {
                            arrayList.add(k70.m2992c(e));
                        }
                    }
                    qc0 qc0VarM4057p = qc0.m4057p(arrayList);
                    CallableC0445lt callableC0445lt = new CallableC0445lt(4, this);
                    C0915yi c0915yi = new C0915yi(qc0VarM4057p, true);
                    c0915yi.f9307w = new C0878xi(c0915yi, callableC0445lt);
                    c0915yi.m5804s();
                    aa2VarM796c.m168a(c0915yi);
                    aa2VarM796c.close();
                    return c0915yi;
                } catch (Throwable th2) {
                    try {
                        aa2VarM796c.close();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                ha2 ha2Var = (ha2) this.f63k;
                ga2 ga2VarM4511c = s92.m4511c();
                ha2 ha2VarM4510b = s92.m4510b(ga2VarM4511c, ha2Var);
                try {
                    ListenableFuture listenableFutureCall = ((InterfaceC0350j8) this.f64l).call();
                    s92.m4510b(ga2VarM4511c, ha2VarM4510b);
                    listenableFutureCall.getClass();
                    return listenableFutureCall;
                } catch (Throwable th4) {
                    try {
                        r92.m4282a(th4);
                        throw th4;
                    } catch (Throwable th5) {
                        s92.m4510b(ga2VarM4511c, ha2VarM4510b);
                        throw th5;
                    }
                }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m80d() {
        ((fc1) this.f63k).f2376k = true;
        ((ScheduledFuture) this.f64l).cancel(false);
    }

    /* JADX INFO: renamed from: e */
    public String m81e(String str) {
        String str2 = (String) this.f64l;
        Resources resources = (Resources) this.f63k;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: f */
    public void mo82f(Exception exc) {
        c91 c91Var = (c91) this.f64l;
        gq0 gq0Var = (gq0) this.f63k;
        gq0 gq0Var2 = c91Var.f1174o;
        if (gq0Var2 == null || gq0Var2 != gq0Var) {
            return;
        }
        c91 c91Var2 = (c91) this.f64l;
        gq0 gq0Var3 = (gq0) this.f63k;
        RunnableC0146dq runnableC0146dq = c91Var2.f1170k;
        C0403ko c0403ko = c91Var2.f1175p;
        InterfaceC0551oo interfaceC0551oo = gq0Var3.f2848c;
        runnableC0146dq.mo902a(c0403ko, exc, interfaceC0551oo, interfaceC0551oo.mo1074g());
    }

    @Override // p000.InterfaceC0705su
    /* JADX INFO: renamed from: g */
    public void mo83g(InterfaceC0318ic interfaceC0318ic, Bitmap bitmap) throws IOException {
        IOException iOException = ((C0708sx) this.f64l).f7224k;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0318ic.mo2591h(bitmap);
            throw iOException;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.nb1
    public Object get() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        switch (this.f62j) {
            case 16:
                oq0 oq0Var = (oq0) this.f63k;
                String str = (String) this.f64l;
                int i = pa0.f6040a;
                int i2 = xq0.f9030p;
                wq0 wq0VarM5414c = new wq0().m5414c(str.getBytes());
                ByteBuffer byteBuffer = wq0VarM5414c.f8633a;
                byteBuffer.put((byte) 0);
                char c = '\b';
                if (byteBuffer.remaining() < 8) {
                    wq0VarM5414c.m5412a();
                }
                wq0 wq0VarM5414c2 = wq0VarM5414c.m5414c("".getBytes());
                wq0VarM5414c2.m5412a();
                ByteBuffer byteBuffer2 = wq0VarM5414c2.f8633a;
                byteBuffer2.flip();
                if (byteBuffer2.remaining() > 0) {
                    wq0VarM5414c2.f8638f = byteBuffer2.remaining() + wq0VarM5414c2.f8638f;
                    long j8 = 0;
                    switch (byteBuffer2.remaining()) {
                        case 1:
                            j = 0;
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 2:
                            c = '\b';
                            j2 = 0;
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 3:
                            c = '\b';
                            j3 = 0;
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 4:
                            c = '\b';
                            j4 = 0;
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 5:
                            j5 = 0;
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 6:
                            j6 = 0;
                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 7:
                            j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                            j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                            j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                            j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                            j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 8:
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 9:
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 10:
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 14:
                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 15:
                            j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                            j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                            j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                            j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j8 ^= (long) (byteBuffer2.get(8) & 255);
                            j7 = byteBuffer2.getLong();
                            wq0VarM5414c2.f8636d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ wq0VarM5414c2.f8636d;
                            wq0VarM5414c2.f8637e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        default:
                            throw new AssertionError("Should never get here.");
                    }
                }
                long j9 = wq0VarM5414c2.f8636d;
                long j10 = wq0VarM5414c2.f8638f;
                long j11 = j9 ^ j10;
                long j12 = j10 ^ wq0VarM5414c2.f8637e;
                long j13 = j11 + j12;
                long j14 = j12 + j13;
                long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                long j19 = j18 ^ (j18 >>> 33);
                long j20 = (j16 ^ (j16 >>> 33)) + j19;
                wq0VarM5414c2.f8636d = j20;
                wq0VarM5414c2.f8637e = j19 + j20;
                byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(wq0VarM5414c2.f8636d).putLong(wq0VarM5414c2.f8637e).array();
                bArrArray.getClass();
                return ((C0353jb) oq0Var.f5840k).m3197c((byte[]) bArrArray.clone());
            default:
                return ((C0353jb) ((oq0) this.f63k).f5840k).m3197c(((ko1) this.f64l).m3067p());
        }
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: h */
    public void mo84h(Object obj) {
        c91 c91Var = (c91) this.f64l;
        gq0 gq0Var = (gq0) this.f63k;
        gq0 gq0Var2 = c91Var.f1174o;
        if (gq0Var2 == null || gq0Var2 != gq0Var) {
            return;
        }
        c91 c91Var2 = (c91) this.f64l;
        gq0 gq0Var3 = (gq0) this.f63k;
        C0371jt c0371jt = c91Var2.f1169j.f957p;
        if (obj == null || !c0371jt.m2963a(gq0Var3.f2848c.mo1074g())) {
            RunnableC0146dq runnableC0146dq = c91Var2.f1170k;
            xg0 xg0Var = gq0Var3.f2846a;
            InterfaceC0551oo interfaceC0551oo = gq0Var3.f2848c;
            runnableC0146dq.mo904c(xg0Var, obj, interfaceC0551oo, interfaceC0551oo.mo1074g(), c91Var2.f1175p);
            return;
        }
        c91Var2.f1173n = obj;
        RunnableC0146dq runnableC0146dq2 = c91Var2.f1170k;
        runnableC0146dq2.f1774O = 2;
        C0078bx c0078bx = runnableC0146dq2.f1791y;
        (c0078bx.f1034v ? c0078bx.f1030r : c0078bx.f1029q).execute(runnableC0146dq2);
    }

    /* JADX INFO: renamed from: i */
    public void mo85i() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.f63k;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            j22.m2807p(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i);
    }

    @Override // p000.iu0
    /* JADX INFO: renamed from: j */
    public void mo86j(v92 v92Var) {
        ((Map) ((a81) this.f64l).f64l).remove((qc1) this.f63k);
    }

    /* JADX INFO: renamed from: k */
    public void m87k(Throwable th) {
        v22 v22Var = (v22) this.f64l;
        v22Var.mo11z();
        f02 f02Var = (f02) v22Var.f7192j;
        v22Var.f8016r = false;
        v22Var.m5043Y().add((y52) this.f63k);
        if (v22Var.f8017s > ((Integer) jx1.f4217v0.m2715a(null)).intValue()) {
            v22Var.f8017s = 1;
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5314c(ky1.m3106I(f02Var.m1575r().m5219G()), ky1.m3106I(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        ky1 ky1Var2 = f02Var.f2247o;
        f02.m1560m(ky1Var2);
        ky1Var2.f4603r.m5315d("registerTriggerAsync failed. App ID, delay in seconds, throwable", ky1.m3106I(f02Var.m1575r().m5219G()), ky1.m3106I(String.valueOf(v22Var.f8017s)), ky1.m3106I(th.toString()));
        int i = v22Var.f8017s;
        if (v22Var.f8018t == null) {
            v22Var.f8018t = new t12(v22Var, f02Var, 1);
        }
        v22Var.f8018t.m4403b(((long) i) * 1000);
        int i2 = v22Var.f8017s;
        v22Var.f8017s = i2 + i2;
    }

    /* JADX INFO: renamed from: l */
    public void mo88l(tk0 tk0Var) {
        this.f64l = tk0Var;
        View viewFindViewById = ((MainActivity) this.f63k).findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new l91(this, viewFindViewById, 0));
    }

    /* JADX INFO: renamed from: m */
    public int m89m(Context context, e90 e90Var) {
        int i;
        int iM2575b;
        p80.m3863h(context);
        p80.m3863h(e90Var);
        int iMo719i = e90Var.mo719i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f63k;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(iMo719i, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f63k;
        synchronized (sparseIntArray2) {
            iM2575b = 0;
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= sparseIntArray2.size()) {
                        iM2575b = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i2);
                    if (iKeyAt > iMo719i && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iM2575b == -1) {
                iM2575b = ((h90) this.f64l).m2575b(context, iMo719i);
            }
            sparseIntArray2.put(iMo719i, iM2575b);
        }
        return iM2575b;
    }

    @Override // p000.InterfaceC0705su
    /* JADX INFO: renamed from: n */
    public void mo90n() {
        h01 h01Var = (h01) this.f63k;
        synchronized (h01Var) {
            h01Var.f2987l = h01Var.f2985j.length;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m91o(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f63k;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f64l;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                dd0.m1158c();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((qc1) entry2.getKey()).m4062c(new C0642r4(status));
            }
        }
    }

    @Override // p000.c81
    public void onError(Throwable th) {
        ((c81) this.f63k).onError(th);
    }

    @Override // p000.InterfaceC0845wm
    /* JADX INFO: renamed from: p */
    public Object mo92p(v92 v92Var) {
        Bundle bundle;
        switch (this.f62j) {
            case 14:
                boolean z = v92Var.m5130f() instanceof hg1;
                r32 r32Var = (r32) this.f64l;
                e22 e22Var = (e22) this.f63k;
                if (z) {
                    return e22Var.m1349c(r32Var.m4239t());
                }
                if (!(v92Var.m5130f() instanceof C0642r4)) {
                    return v92Var;
                }
                C0642r4 c0642r4 = (C0642r4) v92Var.m5130f();
                c0642r4.getClass();
                return c0642r4.f6704j.f1341j == 29514 ? e22Var.m1349c(r32Var.m4239t()) : v92Var;
            default:
                w31 w31Var = (w31) this.f63k;
                Bundle bundle2 = (Bundle) this.f64l;
                w31Var.getClass();
                return (v92Var.m5133i() && (bundle = (Bundle) v92Var.m5131g()) != null && bundle.containsKey("google.messenger")) ? w31Var.m5231a(bundle2).m5134j(iw1.f3685l, wa0.f8478r) : v92Var;
        }
    }

    /* JADX INFO: renamed from: q */
    public x52 m93q(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f63k;
        x52 x52Var = (x52) atomicReferenceArray.get(i);
        if (x52Var != null) {
            return x52Var;
        }
        l52 l52VarM845a = ((c32) this.f64l).m845a(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, l52VarM845a)) {
            if (atomicReferenceArray.get(i) != null) {
                x52 x52Var2 = (x52) atomicReferenceArray.get(i);
                x52Var2.getClass();
                return x52Var2;
            }
        }
        return l52VarM845a;
    }

    /* JADX INFO: renamed from: r */
    public void m94r(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) xe1.m5639g(arrayList);
        if (outputStream instanceof q82) {
            this.f64l = (q82) outputStream;
            this.f63k = (OutputStream) arrayList.get(0);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m95s(ot1 ot1Var) {
        ArrayList arrayList = ot1Var.f5911a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.f63k).put(Integer.valueOf(((gu1) obj).f2940j).toString(), ot1Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public ht1 m96t(f71 f71Var, ht1 ht1Var) {
        wo1.m5377H(f71Var);
        if (!(ht1Var instanceof it1)) {
            return ht1Var;
        }
        it1 it1Var = (it1) ht1Var;
        ArrayList arrayList = it1Var.f3659k;
        String str = it1Var.f3658j;
        HashMap map = (HashMap) this.f63k;
        return (map.containsKey(str) ? (ot1) map.get(str) : (ot1) this.f64l).m3793a(str, f71Var, arrayList);
    }

    public String toString() {
        switch (this.f62j) {
            case 26:
                InterfaceC0350j8 interfaceC0350j8 = (InterfaceC0350j8) this.f64l;
                StringBuilder sb = new StringBuilder(interfaceC0350j8.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC0350j8);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public x52 m97u(int i, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f63k;
        x52 x52Var = (x52) atomicReferenceArray.get(i);
        if (x52Var != null) {
            return x52Var;
        }
        r52 r52Var = new r52(str, (p90) ((c32) this.f64l).f1083k, j);
        while (!atomicReferenceArray.compareAndSet(i, null, r52Var)) {
            if (atomicReferenceArray.get(i) != null) {
                x52 x52Var2 = (x52) atomicReferenceArray.get(i);
                x52Var2.getClass();
                return x52Var2;
            }
        }
        return r52Var;
    }

    /* JADX INFO: renamed from: v */
    public void m98v(f71 f71Var, oq0 oq0Var) {
        m22 m22Var = new m22(oq0Var);
        TreeMap treeMap = (TreeMap) this.f63k;
        for (Integer num : treeMap.keySet()) {
            pm1 pm1VarM3971a = ((pm1) oq0Var.f5841l).clone();
            ht1 ht1VarMo749a = ((ft1) treeMap.get(num)).mo749a(f71Var, Collections.singletonList(m22Var));
            int iM5373D = ht1VarMo749a instanceof gr1 ? wo1.m5373D(((gr1) ht1VarMo749a).f2863j.doubleValue()) : -1;
            if (iM5373D == 2 || iM5373D == -1) {
                oq0Var.f5841l = pm1VarM3971a;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f64l;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            ht1 ht1VarMo749a2 = ((ft1) treeMap2.get((Integer) it.next())).mo749a(f71Var, Collections.singletonList(m22Var));
            if (ht1VarMo749a2 instanceof gr1) {
                wo1.m5373D(((gr1) ht1VarMo749a2).f2863j.doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public x52 m99w(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f63k;
        x52 x52Var = (x52) atomicReferenceArray.get(i);
        if (x52Var != null) {
            return x52Var;
        }
        u52 u52Var = new u52(str, (p90) ((c32) this.f64l).f1083k, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, u52Var)) {
            if (atomicReferenceArray.get(i) != null) {
                x52 x52Var2 = (x52) atomicReferenceArray.get(i);
                x52Var2.getClass();
                return x52Var2;
            }
        }
        return u52Var;
    }

    public /* synthetic */ a81(int i, Object obj, Object obj2) {
        this.f62j = i;
        this.f64l = obj;
        this.f63k = obj2;
    }

    public /* synthetic */ a81(Object obj, Object obj2, int i, boolean z) {
        this.f62j = i;
        this.f63k = obj;
        this.f64l = obj2;
    }

    public a81(do1 do1Var) {
        this.f62j = 24;
        this.f63k = do1Var;
    }

    public /* synthetic */ a81(int i, Object obj) {
        this.f62j = i;
        this.f64l = obj;
    }

    public a81(a81 a81Var, qc1 qc1Var) {
        this.f62j = 9;
        this.f63k = qc1Var;
        Objects.requireNonNull(a81Var);
        this.f64l = a81Var;
    }

    public a81(Context context) {
        this.f62j = 4;
        p80.m3863h(context);
        Resources resources = context.getResources();
        this.f63k = resources;
        this.f64l = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public a81(IBinder iBinder) throws RemoteException {
        this.f62j = 21;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f63k = new Messenger(iBinder);
            this.f64l = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f64l = new uv1(iBinder);
            this.f63k = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public a81(c32 c32Var, int i) {
        this.f62j = 20;
        this.f64l = c32Var;
        this.f63k = new AtomicReferenceArray(i);
    }

    public a81(p72 p72Var, s72 s72Var) {
        this.f62j = 22;
        Objects.requireNonNull(p72Var);
        this.f64l = p72Var;
        this.f63k = s72Var;
    }

    public a81(fc1 fc1Var, ScheduledFuture scheduledFuture) {
        this.f62j = 5;
        this.f63k = fc1Var;
        a90.m127k(scheduledFuture, "future");
        this.f64l = scheduledFuture;
    }

    public a81(MainActivity mainActivity) {
        this.f62j = 2;
        this.f63k = mainActivity;
        this.f64l = new k91();
    }
}
