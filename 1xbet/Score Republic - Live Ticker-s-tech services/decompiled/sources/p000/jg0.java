package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements xm0, InterfaceC0921yo, t10, InterfaceC0670rw, InterfaceC0714t2, qu0, InterfaceC0501nb, y01, iu0, e72, nb1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3921j;

    /* JADX INFO: renamed from: k */
    public Object f3922k;

    public jg0(int i) {
        this.f3921j = i;
        switch (i) {
            case 2:
                this.f3922k = new LinkedHashMap(0, 0.75f, true);
                break;
            case 5:
                this.f3922k = new eq0(500L);
                break;
            case 10:
                break;
            case 17:
                this.f3922k = ByteBuffer.allocate(8);
                break;
            case 23:
                this.f3922k = new EnumMap(k12.class);
                break;
            default:
                this.f3922k = new HashMap();
                new HashMap();
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public void mo975a(InterfaceC0187eu interfaceC0187eu) {
        EnumC0262gu.m2149e((im0) this.f3922k, interfaceC0187eu);
    }

    @Override // p000.y01
    public void accept(Object obj, Object obj2) {
        qc1 qc1Var = (qc1) obj2;
        switch (this.f3921j) {
            case 21:
                yl1 yl1Var = (yl1) ((em1) obj).m3890l();
                uc1 uc1Var = (uc1) this.f3922k;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(yl1Var.f9319d);
                int i = il1.f3610a;
                if (uc1Var == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    uc1Var.writeToParcel(parcelObtain, 0);
                }
                try {
                    yl1Var.f9318c.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    qc1Var.m4061b(null);
                    return;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            default:
                int i2 = e22.f1910k;
                w12 w12Var = new w12(qc1Var);
                f22 f22Var = (f22) ((h22) obj).m3890l();
                byte[] bArrM1274a = ((r32) this.f3922k).m1274a();
                Parcel parcelM5810d = f22Var.m5810d();
                iu1.m2703c(parcelM5810d, w12Var);
                parcelM5810d.writeByteArray(bArrM1274a);
                f22Var.m5806F(parcelM5810d, 31);
                return;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public void mo976b(Object obj) {
        ((xm0) ((im0) this.f3922k).f3612k).mo976b(obj);
    }

    @Override // p000.InterfaceC0501nb
    /* JADX INFO: renamed from: c */
    public void mo2852c(C0253gl c0253gl) {
        ((k90) this.f3922k).mo1442c(c0253gl);
    }

    @Override // p000.InterfaceC0921yo
    /* JADX INFO: renamed from: d */
    public Object mo2853d(v60 v60Var, xb1 xb1Var) {
        return ((InterfaceC0921yo) this.f3922k).mo2853d(new ow0(v60Var, null, 0), xb1Var);
    }

    @Override // p000.e72
    /* JADX INFO: renamed from: e */
    public void mo1384e(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        v22 v22Var = (v22) this.f3922k;
        if (zIsEmpty) {
            v22Var.m5023E("auto", "_err", bundle);
        } else {
            v22Var.getClass();
            C0270h1.m2191g("Unexpected call on client side");
        }
    }

    @Override // p000.InterfaceC0921yo
    /* JADX INFO: renamed from: f */
    public t10 mo2854f() {
        return ((InterfaceC0921yo) this.f3922k).mo2854f();
    }

    @Override // p000.InterfaceC0670rw
    /* JADX INFO: renamed from: g */
    public boolean mo2024g(Object obj, File file, uu0 uu0Var) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        nk0 nk0Var = (nk0) this.f3922k;
        byte[] bArr = (byte[]) nk0Var.m3543c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        nk0Var.m3547g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        nk0Var.m3547g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                nk0Var.m3547g(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.nb1
    public Object get() {
        return new cx0(new q72((nb1) ((C0902y5) this.f3922k).f9155b));
    }

    @Override // p000.qu0
    /* JADX INFO: renamed from: i */
    public void mo2594i(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f3922k)) {
            ((ByteBuffer) this.f3922k).position(0);
            messageDigest.update(((ByteBuffer) this.f3922k).putLong(l.longValue()).array());
        }
    }

    @Override // p000.iu0
    /* JADX INFO: renamed from: j */
    public void mo86j(v92 v92Var) {
        switch (this.f3921j) {
            case 24:
                ((CountDownLatch) this.f3922k).countDown();
                return;
            default:
                k22 k22Var = (k22) this.f3922k;
                if (v92Var.f8143d) {
                    k22Var.cancel(false);
                    return;
                }
                if (v92Var.m5133i()) {
                    k22Var.m2177l(v92Var.m5131g());
                    return;
                }
                Exception excM5130f = v92Var.m5130f();
                if (excM5130f == null) {
                    throw new IllegalStateException();
                }
                k22Var.m2178m(excM5130f);
                return;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2855k(np0 np0Var, byte[] bArr) {
        nv0.m3597c();
        try {
            String str = "/" + ((String) ((lt0) this.f3922k).f4900q.f8621m);
            if (bArr != null) {
                ((lt0) this.f3922k).f4907x = true;
                str = str + "?" + C0427lb.f4748d.m3197c(bArr);
            }
            synchronized (((lt0) this.f3922k).f4904u.f4545v) {
                kt0.m3074a(((lt0) this.f3922k).f4904u, np0Var, str);
            }
            nv0.f5555a.getClass();
        } catch (Throwable th) {
            try {
                nv0.f5555a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX INFO: renamed from: m */
    public void m2856m(k12 k12Var, int i) {
        dt1 dt1Var;
        if (i == -30) {
            dt1Var = dt1.TCF;
        } else if (i == -20) {
            dt1Var = dt1.API;
        } else if (i == -10) {
            dt1Var = dt1.MANIFEST;
        } else if (i != 0) {
            dt1Var = i != 30 ? dt1.UNSET : dt1.INITIALIZATION;
        } else {
            dt1Var = dt1.API;
        }
        ((EnumMap) this.f3922k).put(k12Var, dt1Var);
    }

    /* JADX INFO: renamed from: n */
    public void m2857n(k12 k12Var, dt1 dt1Var) {
        ((EnumMap) this.f3922k).put(k12Var, dt1Var);
    }

    /* JADX INFO: renamed from: o */
    public void m2858o(int i, Object obj, hq1 hq1Var) {
        ro1 ro1Var = (ro1) this.f3922k;
        do1 do1Var = (do1) obj;
        ro1Var.mo3556d(i, 2);
        ro1Var.mo3570r(do1Var.mo1276c(hq1Var));
        hq1Var.mo466c(do1Var, this);
    }

    @Override // p000.xm0
    public void onComplete() {
        ((xm0) ((im0) this.f3922k).f3612k).onComplete();
    }

    @Override // p000.xm0
    public void onError(Throwable th) {
        ((xm0) ((im0) this.f3922k).f3612k).onError(th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.t10
    /* JADX INFO: renamed from: r */
    public Object mo622r(u10 u10Var, AbstractC0882xm abstractC0882xm) throws Throwable {
        C0600q c0600q;
        h41 h41Var;
        if (abstractC0882xm instanceof C0600q) {
            c0600q = (C0600q) abstractC0882xm;
            int i = c0600q.f6301p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0600q.f6301p = i - Integer.MIN_VALUE;
            } else {
                c0600q = new C0600q(this, abstractC0882xm);
            }
        } else {
            c0600q = new C0600q(this, abstractC0882xm);
        }
        Object obj = c0600q.f6299n;
        int i2 = c0600q.f6301p;
        kf1 kf1Var = kf1.f4365a;
        if (i2 != 0) {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h41Var = c0600q.f6298m;
            try {
                wo1.m5395v(obj);
                h41Var.mo2013o();
                return kf1Var;
            } catch (Throwable th) {
                th = th;
                h41Var.mo2013o();
                throw th;
            }
        }
        wo1.m5395v(obj);
        InterfaceC0180en interfaceC0180en = c0600q.f8992k;
        interfaceC0180en.getClass();
        h41 h41Var2 = new h41(u10Var, interfaceC0180en);
        try {
            c0600q.f6298m = h41Var2;
            c0600q.f6301p = 1;
            try {
                Object objMo1490g = ((v60) this.f3922k).mo1490g(h41Var2, c0600q);
                EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
                if (objMo1490g != enumC0513nn) {
                    objMo1490g = kf1Var;
                }
                if (objMo1490g == enumC0513nn) {
                    return enumC0513nn;
                }
                h41Var = h41Var2;
                h41Var.mo2013o();
                return kf1Var;
            } catch (Throwable th2) {
                th = th2;
                h41Var = h41Var2;
                h41Var.mo2013o();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String toString() {
        switch (this.f3921j) {
            case 23:
                StringBuilder sb = new StringBuilder("1");
                for (k12 k12Var : k12.values()) {
                    dt1 dt1Var = (dt1) ((EnumMap) this.f3922k).get(k12Var);
                    if (dt1Var == null) {
                        dt1Var = dt1.UNSET;
                    }
                    sb.append(dt1Var.f1825j);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public jg0(C0415l c0415l, bj0 bj0Var) {
        this.f3921j = 19;
        this.f3922k = c0415l;
    }

    public jg0(ro1 ro1Var) {
        this.f3921j = 22;
        this.f3922k = ro1Var;
        ro1Var.f6927a = this;
    }

    public jg0(EnumMap enumMap) {
        this.f3921j = 23;
        EnumMap enumMap2 = new EnumMap(k12.class);
        this.f3922k = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public /* synthetic */ jg0(int i, Object obj) {
        this.f3921j = i;
        this.f3922k = obj;
    }
}
