package p000;

import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class nc1 implements InterfaceC0144dn, InterfaceC0436lk, InterfaceC0507nh, h21, xp1, rh0, iq0, InterfaceC0670rw, InterfaceC0688sd, InterfaceC0725td, InterfaceC0951zh, InterfaceC0695sk, InterfaceC0732tk, InterfaceC0119cz, g00, fi1, InterfaceC0254gm, nw0 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ nc1 f5372k = new nc1(1);

    /* JADX INFO: renamed from: l */
    public static final nc1 f5373l = new nc1(2);

    /* JADX INFO: renamed from: m */
    public static final nc1 f5374m = new nc1(3);

    /* JADX INFO: renamed from: n */
    public static final nc1 f5375n = new nc1(4);

    /* JADX INFO: renamed from: o */
    public static final nc1 f5376o = new nc1(5);

    /* JADX INFO: renamed from: p */
    public static final nc1 f5377p = new nc1(6);

    /* JADX INFO: renamed from: q */
    public static final nc1 f5378q = new nc1(7);

    /* JADX INFO: renamed from: r */
    public static final nc1 f5379r = new nc1(8);

    /* JADX INFO: renamed from: s */
    public static final nc1 f5380s = new nc1(9);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5381j;

    public /* synthetic */ nc1(int i) {
        this.f5381j = i;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m3515I(C0743tv c0743tv, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                bf1[] bf1VarArr = (bf1[]) editable.getSpans(selectionStart, iMin, bf1.class);
                if (bf1VarArr != null && bf1VarArr.length > 0) {
                    for (bf1 bf1Var : bf1VarArr) {
                        int spanStart = editable.getSpanStart(bf1Var);
                        int spanEnd = editable.getSpanEnd(bf1Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c0743tv.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c0743tv.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.g00
    /* JADX INFO: renamed from: A */
    public Object mo1914A(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // p000.rh0
    /* JADX INFO: renamed from: B */
    public void mo986B(wh0 wh0Var) {
        wh0Var.mo246b();
    }

    @Override // p000.xp1
    /* JADX INFO: renamed from: E */
    public gq1 mo304E(Class cls) {
        if (!zo1.class.isAssignableFrom(cls)) {
            C0270h1.m2190f("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (gq1) zo1.m5959n(cls.asSubclass(zo1.class)).mo14s(3);
        } catch (Exception e) {
            C0270h1.m2189e("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p000.InterfaceC0951zh
    /* JADX INFO: renamed from: F */
    public InputStream mo3516F(b01 b01Var) {
        return new GZIPInputStream(b01Var);
    }

    /* JADX INFO: renamed from: H */
    public long m3517H() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // p000.g00
    /* JADX INFO: renamed from: a */
    public Class mo1915a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p000.g00
    /* JADX INFO: renamed from: b */
    public void mo1916b(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // p000.InterfaceC0688sd, p000.InterfaceC0725td
    /* JADX INFO: renamed from: d */
    public byte[] mo3518d(byte[] bArr, int i, int i2) {
        switch (this.f5381j) {
            case 14:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }

    @Override // p000.fi1
    /* JADX INFO: renamed from: f */
    public di1 mo1870f(Class cls) {
        return new v50(true);
    }

    @Override // p000.InterfaceC0670rw
    /* JADX INFO: renamed from: g */
    public boolean mo2024g(Object obj, File file, uu0 uu0Var) throws Throwable {
        try {
            AbstractC0429ld.m3212d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // p000.InterfaceC0951zh
    /* JADX INFO: renamed from: m */
    public OutputStream mo3519m(lo0 lo0Var) {
        return new GZIPOutputStream(lo0Var);
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: q */
    public boolean mo1633q() {
        return false;
    }

    @Override // p000.xp1
    /* JADX INFO: renamed from: r */
    public boolean mo320r(Class cls) {
        return zo1.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: s */
    public void mo1327s(xd0 xd0Var) {
        xd0Var.f8895b.add("noop");
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        return new C0058bd(0, new o31(12));
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        return true;
    }

    public String toString() {
        switch (this.f5381j) {
            case 27:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0951zh
    /* JADX INFO: renamed from: v */
    public String mo3520v() {
        return "gzip";
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        Object objMo2288h = c0902y5.mo2288h(new cz0(ci0.class, Executor.class));
        objMo2288h.getClass();
        return new C0930yx((Executor) objMo2288h);
    }

    @Override // p000.InterfaceC0732tk
    /* JADX INFO: renamed from: y */
    public int mo3521y(AbstractC0527o0 abstractC0527o0, int i, Object obj, int i2) {
        switch (this.f5381j) {
            case 17:
                abstractC0527o0.mo832s(i);
                break;
            default:
                abstractC0527o0.mo826l((OutputStream) obj, i);
                break;
        }
        return 0;
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: C */
    public void mo1600C() {
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: D */
    public void mo1601D() {
    }

    @Override // p000.ra1
    public void flush() {
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: z */
    public void mo1641z() {
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: G */
    public void mo1604G(ja1 ja1Var) {
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: c */
    public void mo1624c(InterfaceC0951zh interfaceC0951zh) {
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: e */
    public void mo1625e(int i) {
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: h */
    public void mo1626h(C0258gq c0258gq) {
    }

    @Override // p000.InterfaceC0119cz
    /* JADX INFO: renamed from: i */
    public void mo1049i(Object obj) {
    }

    @Override // p000.rh0
    /* JADX INFO: renamed from: j */
    public void mo987j(wh0 wh0Var) {
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: k */
    public void mo1628k(int i) {
    }

    /* JADX INFO: renamed from: n */
    public void mo1326n(InterfaceC0581ph interfaceC0581ph) {
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: u */
    public void mo1636u(C0885xp c0885xp) {
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: w */
    public void mo1638w(xx0 xx0Var) {
    }

    @Override // p000.h21
    /* JADX INFO: renamed from: o */
    public v11 mo1764o(v11 v11Var, uu0 uu0Var) {
        return v11Var;
    }
}
