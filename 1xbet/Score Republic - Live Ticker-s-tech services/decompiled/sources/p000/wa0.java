package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class wa0 implements InterfaceC0951zh, InterfaceC0436lk, InterfaceC0144dn, InterfaceC0845wm, kb1, InterfaceC0318ic, InterfaceC0014ad, iq0, InterfaceC0725td, InterfaceC0695sk, InterfaceC0705su, InterfaceC0043az, g00, r60, h21 {

    /* JADX INFO: renamed from: k */
    public static final wa0 f8471k = new wa0(1);

    /* JADX INFO: renamed from: l */
    public static final wa0 f8472l = new wa0(2);

    /* JADX INFO: renamed from: m */
    public static final wa0 f8473m = new wa0(3);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ wa0 f8474n = new wa0(4);

    /* JADX INFO: renamed from: o */
    public static final wa0 f8475o = new wa0(6);

    /* JADX INFO: renamed from: p */
    public static final wa0 f8476p = new wa0(7);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ wa0 f8477q = new wa0(8);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ wa0 f8478r = new wa0(10);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8479j;

    public /* synthetic */ wa0(int i) {
        this.f8479j = i;
    }

    /* JADX INFO: renamed from: r */
    public static zq0 m5304r(FileInputStream fileInputStream) throws C0661rn {
        byte[] bArr;
        try {
            ww0 ww0VarM5421o = ww0.m5421o(fileInputStream);
            zq0 zq0Var = new zq0(false);
            sw0[] sw0VarArr = (sw0[]) Arrays.copyOf(new sw0[0], 0);
            zq0Var.m6023b();
            if (sw0VarArr.length > 0) {
                sw0 sw0Var = sw0VarArr[0];
                throw null;
            }
            Map mapM5422m = ww0VarM5421o.m5422m();
            mapM5422m.getClass();
            for (Map.Entry entry : mapM5422m.entrySet()) {
                String str = (String) entry.getKey();
                ax0 ax0Var = (ax0) entry.getValue();
                str.getClass();
                ax0Var.getClass();
                int iM506C = ax0Var.m506C();
                switch (iM506C == 0 ? -1 : tw0.f7620a[AbstractC0024an.m292o(iM506C)]) {
                    case -1:
                        throw new C0661rn("Value case is null.", null);
                    case 0:
                    default:
                        throw new C0694sj(5);
                    case 1:
                        zq0Var.m6025d(new rw0(str), Boolean.valueOf(ax0Var.m508t()));
                        break;
                    case 2:
                        zq0Var.m6025d(new rw0(str), Float.valueOf(ax0Var.m511x()));
                        break;
                    case 3:
                        zq0Var.m6025d(new rw0(str), Double.valueOf(ax0Var.m510w()));
                        break;
                    case 4:
                        zq0Var.m6025d(new rw0(str), Integer.valueOf(ax0Var.m512y()));
                        break;
                    case 5:
                        zq0Var.m6025d(new rw0(str), Long.valueOf(ax0Var.m513z()));
                        break;
                    case 6:
                        rw0 rw0Var = new rw0(str);
                        String strM504A = ax0Var.m504A();
                        strM504A.getClass();
                        zq0Var.m6025d(rw0Var, strM504A);
                        break;
                    case 7:
                        rw0 rw0Var2 = new rw0(str);
                        ee0 ee0VarM5850n = ax0Var.m505B().m5850n();
                        ee0VarM5850n.getClass();
                        zq0Var.m6025d(rw0Var2, AbstractC0471mi.m3390x(ee0VarM5850n));
                        break;
                    case 8:
                        rw0 rw0Var3 = new rw0(str);
                        C0799vd c0799vdM509u = ax0Var.m509u();
                        int size = c0799vdM509u.size();
                        if (size == 0) {
                            bArr = ge0.f2711b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0799vdM509u.mo4339e(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        zq0Var.m6025d(rw0Var3, bArr);
                        break;
                    case 9:
                        throw new C0661rn("Value not set.", null);
                }
            }
            return new zq0(new LinkedHashMap(zq0Var.m6022a()), true);
        } catch (if0 e) {
            throw new C0661rn("Unable to parse preferences proto.", e);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m5305s(Object obj, mo0 mo0Var) {
        t70 t70VarM3854a;
        Map mapM6022a = ((zq0) obj).m6022a();
        uw0 uw0VarM5420n = ww0.m5420n();
        for (Map.Entry entry : mapM6022a.entrySet()) {
            rw0 rw0Var = (rw0) entry.getKey();
            Object value = entry.getValue();
            String str = rw0Var.f6986a;
            if (value instanceof Boolean) {
                zw0 zw0VarM494D = ax0.m494D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                zw0VarM494D.m3856c();
                ax0.m500q((ax0) zw0VarM494D.f6003k, zBooleanValue);
                t70VarM3854a = zw0VarM494D.m3854a();
            } else if (value instanceof Float) {
                zw0 zw0VarM494D2 = ax0.m494D();
                float fFloatValue = ((Number) value).floatValue();
                zw0VarM494D2.m3856c();
                ax0.m501r((ax0) zw0VarM494D2.f6003k, fFloatValue);
                t70VarM3854a = zw0VarM494D2.m3854a();
            } else if (value instanceof Double) {
                zw0 zw0VarM494D3 = ax0.m494D();
                double dDoubleValue = ((Number) value).doubleValue();
                zw0VarM494D3.m3856c();
                ax0.m498o((ax0) zw0VarM494D3.f6003k, dDoubleValue);
                t70VarM3854a = zw0VarM494D3.m3854a();
            } else if (value instanceof Integer) {
                zw0 zw0VarM494D4 = ax0.m494D();
                int iIntValue = ((Number) value).intValue();
                zw0VarM494D4.m3856c();
                ax0.m502s((ax0) zw0VarM494D4.f6003k, iIntValue);
                t70VarM3854a = zw0VarM494D4.m3854a();
            } else if (value instanceof Long) {
                zw0 zw0VarM494D5 = ax0.m494D();
                long jLongValue = ((Number) value).longValue();
                zw0VarM494D5.m3856c();
                ax0.m495l((ax0) zw0VarM494D5.f6003k, jLongValue);
                t70VarM3854a = zw0VarM494D5.m3854a();
            } else if (value instanceof String) {
                zw0 zw0VarM494D6 = ax0.m494D();
                zw0VarM494D6.m3856c();
                ax0.m496m((ax0) zw0VarM494D6.f6003k, (String) value);
                t70VarM3854a = zw0VarM494D6.m3854a();
            } else if (value instanceof Set) {
                zw0 zw0VarM494D7 = ax0.m494D();
                xw0 xw0VarM5849o = yw0.m5849o();
                xw0VarM5849o.m3856c();
                yw0.m5847l((yw0) xw0VarM5849o.f6003k, (Set) value);
                zw0VarM494D7.m3856c();
                ax0.m497n((ax0) zw0VarM494D7.f6003k, (yw0) xw0VarM5849o.m3854a());
                t70VarM3854a = zw0VarM494D7.m3854a();
            } else {
                if (!(value instanceof byte[])) {
                    C0270h1.m2191g("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                zw0 zw0VarM494D8 = ax0.m494D();
                byte[] bArr = (byte[]) value;
                C0799vd c0799vdM5148d = C0799vd.m5148d(bArr, 0, bArr.length);
                zw0VarM494D8.m3856c();
                ax0.m499p((ax0) zw0VarM494D8.f6003k, c0799vdM5148d);
                t70VarM3854a = zw0VarM494D8.m3854a();
            }
            uw0VarM5420n.getClass();
            str.getClass();
            uw0VarM5420n.m3856c();
            ww0.m5419l((ww0) uw0VarM5420n.f6003k).put(str, (ax0) t70VarM3854a);
        }
        ww0 ww0Var = (ww0) uw0VarM5420n.m3854a();
        int iMo2975a = ww0Var.mo2975a(null);
        Logger logger = C0360ji.f3932f;
        if (iMo2975a > 4096) {
            iMo2975a = 4096;
        }
        C0360ji c0360ji = new C0360ji(mo0Var, iMo2975a);
        ww0Var.mo2976b(c0360ji);
        if (c0360ji.f3937d > 0) {
            c0360ji.m2886k();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ oq1 m5306u(Object obj) {
        zo1 zo1Var = (zo1) obj;
        oq1 oq1Var = zo1Var.zzc;
        if (oq1Var != oq1.f5843f) {
            return oq1Var;
        }
        oq1 oq1VarM3748a = oq1.m3748a();
        zo1Var.zzc = oq1VarM3748a;
        return oq1VarM3748a;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m5307w(int i, C0212fi c0212fi, Object obj) throws mp1 {
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) c0212fi.f2412e;
        int i2 = c0212fi.f2409b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c0212fi.m1842k0(0);
            ((oq1) obj).m3751d(i3 << 3, Long.valueOf(abstractC0860x0.mo3253U()));
            return true;
        }
        if (i4 == 1) {
            c0212fi.m1842k0(1);
            ((oq1) obj).m3751d((i3 << 3) | 1, Long.valueOf(abstractC0860x0.mo3255W()));
            return true;
        }
        if (i4 == 2) {
            ((oq1) obj).m3751d((i3 << 3) | 2, c0212fi.m1856s0());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                re1.m4350e("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                re1.m4347b();
                return false;
            }
            c0212fi.m1842k0(5);
            ((oq1) obj).m3751d(5 | (i3 << 3), Integer.valueOf(abstractC0860x0.mo3256X()));
            return true;
        }
        oq1 oq1VarM3748a = oq1.m3748a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            re1.m4350e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (c0212fi.m1854r0() != Integer.MAX_VALUE && m5307w(i6, c0212fi, oq1VarM3748a)) {
        }
        if ((i5 | 4) != c0212fi.f2409b) {
            re1.m4350e("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (oq1VarM3748a.f5848e) {
            oq1VarM3748a.f5848e = false;
        }
        ((oq1) obj).m3751d(i5 | 3, oq1VarM3748a);
        return true;
    }

    @Override // p000.g00
    /* JADX INFO: renamed from: A */
    public Object mo1914A(File file) {
        return new FileInputStream(file);
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: a */
    public Class mo175a() {
        switch (this.f8479j) {
        }
        return InputStream.class;
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        switch (this.f8479j) {
            case 27:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    return new C0011aa((String) objArr[0], (C0091ca) objArr[1]);
                }
                C0042ay.m528e("Array of size 2 expected but got ", objArr.length);
                return null;
            default:
                return obj;
        }
    }

    @Override // p000.g00
    /* JADX INFO: renamed from: b */
    public void mo1916b(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // p000.InterfaceC0043az
    /* JADX INFO: renamed from: c */
    public Object mo155c() {
        return new ArrayList();
    }

    @Override // p000.InterfaceC0725td
    /* JADX INFO: renamed from: d */
    public byte[] mo3518d(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: e */
    public Bitmap mo2589e(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: f */
    public Bitmap mo2590f(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: h */
    public void mo2591h(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: j */
    public Object mo176j(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // p000.kb1
    /* JADX INFO: renamed from: k */
    public v92 mo3002k(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = w31.f8356h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? hn0.m2316j(bundle) : hn0.m2316j(null);
    }

    @Override // p000.h21
    /* JADX INFO: renamed from: o */
    public v11 mo1764o(v11 v11Var, uu0 uu0Var) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((b80) v11Var.get()).f756j.f61a.f3081a.f9233d.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC0429ld.f4762a;
        C0392kd c0392kd = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C0392kd(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (c0392kd != null && c0392kd.f4346a == 0 && c0392kd.f4347b == ((byte[]) c0392kd.f4348c).length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new C0310i4(bArrArray);
    }

    @Override // p000.InterfaceC0845wm
    /* JADX INFO: renamed from: p */
    public Object mo92p(v92 v92Var) throws IOException {
        if (v92Var.m5133i()) {
            return (Bundle) v92Var.m5131g();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(v92Var.m5130f())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", v92Var.m5130f());
    }

    /* JADX INFO: renamed from: q */
    public List m5308q(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0805vj c0805vj : componentRegistrar.getComponents()) {
            String str = c0805vj.f8198a;
            if (str != null) {
                c0805vj = new C0805vj(str, c0805vj.f8199b, c0805vj.f8200c, c0805vj.f8201d, c0805vj.f8202e, new C0615qe(1, str, c0805vj), c0805vj.f8204g);
            }
            arrayList.add(c0805vj);
        }
        return arrayList;
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        return new lf1(1);
    }

    public String toString() {
        switch (this.f8479j) {
            case 28:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0951zh
    /* JADX INFO: renamed from: v */
    public String mo3520v() {
        return "identity";
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        Object objMo2288h = c0902y5.mo2288h(new cz0(InterfaceC0391kc.class, Executor.class));
        objMo2288h.getClass();
        return new C0930yx((Executor) objMo2288h);
    }

    @Override // p000.InterfaceC0732tk
    /* JADX INFO: renamed from: y */
    public int mo3521y(AbstractC0527o0 abstractC0527o0, int i, Object obj, int i2) {
        abstractC0527o0.mo828o((byte[]) obj, i2, i);
        return i2 + i;
    }

    public /* synthetic */ wa0(int i, Object obj) {
        this.f8479j = i;
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: l */
    public void mo2593l() {
    }

    @Override // p000.InterfaceC0705su
    /* JADX INFO: renamed from: n */
    public void mo90n() {
    }

    @Override // p000.InterfaceC0951zh
    /* JADX INFO: renamed from: F */
    public InputStream mo3516F(b01 b01Var) {
        return b01Var;
    }

    @Override // p000.InterfaceC0318ic
    /* JADX INFO: renamed from: i */
    public void mo2592i(int i) {
    }

    @Override // p000.InterfaceC0951zh
    /* JADX INFO: renamed from: m */
    public OutputStream mo3519m(lo0 lo0Var) {
        return lo0Var;
    }

    @Override // p000.InterfaceC0705su
    /* JADX INFO: renamed from: g */
    public void mo83g(InterfaceC0318ic interfaceC0318ic, Bitmap bitmap) {
    }
}
