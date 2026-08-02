package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 implements InterfaceC0144dn, InterfaceC0436lk, mp0, iq0, InterfaceC0845wm, do0, InterfaceC0014ad, InterfaceC0688sd, InterfaceC0695sk, InterfaceC0298ht, o11, InterfaceC0119cz, InterfaceC0003a2, InterfaceC0254gm, b21 {

    /* JADX INFO: renamed from: k */
    public static o31 f5603k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ o31 f5604l = new o31(1);

    /* JADX INFO: renamed from: m */
    public static final o31 f5605m = new o31(2);

    /* JADX INFO: renamed from: n */
    public static final o31 f5606n = new o31(3);

    /* JADX INFO: renamed from: o */
    public static final o31 f5607o = new o31(4);

    /* JADX INFO: renamed from: p */
    public static final byte[] f5608p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: q */
    public static final o31 f5609q = new o31(6);

    /* JADX INFO: renamed from: r */
    public static final o31 f5610r = new o31(7);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ o31 f5611s = new o31(8);

    /* JADX INFO: renamed from: t */
    public static final o31 f5612t = new o31(9);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5613j;

    public /* synthetic */ o31(int i) {
        this.f5613j = i;
    }

    /* JADX INFO: renamed from: k */
    public static ByteArrayInputStream m3626k(String str) {
        if (!str.startsWith("data:image")) {
            C0270h1.m2190f("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            C0270h1.m2190f("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        C0270h1.m2190f("Not a base64 image data URL.");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static C0598py m3627m() {
        C0598py c0598py = new C0598py();
        c0598py.f6283a = new Random();
        c0598py.f6284b = 120000000000L;
        c0598py.f6285c = 1.6d;
        c0598py.f6286d = 0.2d;
        c0598py.f6287e = 1000000000L;
        return c0598py;
    }

    /* JADX INFO: renamed from: n */
    public static synchronized o31 m3628n() {
        try {
            if (f5603k == null) {
                f5603k = new o31(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5603k;
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: a */
    public Class mo175a() {
        return ByteBuffer.class;
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        vt1.m5196h(new ku0((Throwable) obj));
    }

    @Override // p000.InterfaceC0688sd, p000.InterfaceC0725td
    /* JADX INFO: renamed from: d */
    public byte[] mo3518d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: e */
    public byte[] mo157e(Object obj) {
        byte[] bytes = ((String) obj).getBytes(AbstractC0358jg.f3920b);
        int i = 0;
        while (i < bytes.length) {
            byte b = bytes[i];
            if (b < 32 || b >= 126 || b == 37) {
                byte[] bArr = new byte[((bytes.length - i) * 3) + i];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    byte b2 = bytes[i];
                    if (b2 < 32 || b2 >= 126 || b2 == 37) {
                        bArr[i2] = 37;
                        byte[] bArr2 = f5608p;
                        bArr[i2 + 1] = bArr2[(b2 >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b2 & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b2;
                        i2++;
                    }
                    i++;
                }
                return Arrays.copyOf(bArr, i2);
            }
            i++;
        }
        return bytes;
    }

    @Override // p000.InterfaceC0298ht
    /* JADX INFO: renamed from: f */
    public File mo2338f(xg0 xg0Var) {
        return null;
    }

    @Override // p000.InterfaceC0670rw
    /* JADX INFO: renamed from: g */
    public boolean mo2024g(Object obj, File file, uu0 uu0Var) throws Throwable {
        try {
            AbstractC0429ld.m3212d(((b80) ((v11) obj).get()).f756j.f61a.f3081a.f9233d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: h */
    public Object mo160h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                int i2 = 0;
                while (i2 < bArr.length) {
                    if (bArr[i2] == 37 && i2 + 2 < bArr.length) {
                        try {
                            byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, AbstractC0358jg.f3919a), 16));
                            i2 += 3;
                        } catch (NumberFormatException unused) {
                            byteBufferAllocate.put(bArr[i2]);
                            i2++;
                        }
                    }
                    byteBufferAllocate.put(bArr[i2]);
                    i2++;
                }
                return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC0358jg.f3920b);
            }
        }
        return new String(bArr, 0);
    }

    @Override // p000.InterfaceC0119cz
    /* JADX INFO: renamed from: i */
    public void mo1049i(Object obj) {
        ((List) obj).clear();
    }

    @Override // p000.InterfaceC0014ad
    /* JADX INFO: renamed from: j */
    public Object mo176j(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // p000.b21
    /* JADX INFO: renamed from: l */
    public int mo584l(uu0 uu0Var) {
        return 1;
    }

    @Override // p000.InterfaceC0845wm
    /* JADX INFO: renamed from: p */
    public Object mo92p(v92 v92Var) {
        Intent intent = (Intent) ((Bundle) v92Var.m5131g()).getParcelable("notification_data");
        if (intent != null) {
            return new C0914yh(intent);
        }
        return null;
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: q */
    public boolean mo621q(on0 on0Var) {
        return false;
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        switch (this.f5613j) {
            case 6:
                return lf1.f4798b;
            default:
                return new C0058bd(0, new wa0(13));
        }
    }

    public String toString() {
        switch (this.f5613j) {
            case 27:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        switch (this.f5613j) {
            case 2:
                Object objMo2288h = c0902y5.mo2288h(new cz0(InterfaceC0833wa.class, Executor.class));
                objMo2288h.getClass();
                return new C0930yx((Executor) objMo2288h);
            default:
                Object objMo2288h2 = c0902y5.mo2288h(new cz0(df1.class, Executor.class));
                objMo2288h2.getClass();
                return new C0930yx((Executor) objMo2288h2);
        }
    }

    @Override // p000.InterfaceC0732tk
    /* JADX INFO: renamed from: y */
    public int mo3521y(AbstractC0527o0 abstractC0527o0, int i, Object obj, int i2) {
        switch (this.f5613j) {
            case 17:
                return abstractC0527o0.mo829p();
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i);
                abstractC0527o0.mo827m(byteBuffer);
                byteBuffer.limit(iLimit);
                return 0;
        }
    }

    @Override // p000.InterfaceC0003a2
    public void run() {
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: b */
    public void mo609b(on0 on0Var, boolean z) {
    }

    @Override // p000.InterfaceC0298ht
    /* JADX INFO: renamed from: c */
    public void mo2337c(xg0 xg0Var, qd0 qd0Var) {
    }
}
