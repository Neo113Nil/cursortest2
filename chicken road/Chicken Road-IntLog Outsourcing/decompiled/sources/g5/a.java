package g5;

import B0.o;
import B4.k;
import K1.b;
import M0.e;
import g4.AbstractC0465j;
import g4.C0471p;
import j5.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final i f5755b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f5756c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f5757d;

    /* renamed from: a, reason: collision with root package name */
    public final e f5758a;

    static {
        byte[] copyOf = Arrays.copyOf(new byte[]{42}, 1);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        f5755b = new i(copyOf);
        f5756c = b.W("*");
        f5757d = new a(new e(4));
    }

    public a(e eVar) {
        this.f5758a = eVar;
    }

    public static List b(String str) {
        List i02 = k.i0(str, new char[]{'.'});
        if (!kotlin.jvm.internal.i.a(AbstractC0465j.L0(i02), "")) {
            return i02;
        }
        int size = i02.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(o.g(size, "Requested element count ", " is less than zero.").toString());
        }
        C0471p c0471p = C0471p.f5750a;
        if (size == 0) {
            return c0471p;
        }
        if (size >= i02.size()) {
            return AbstractC0465j.S0(i02);
        }
        if (size == 1) {
            return b.W(AbstractC0465j.F0(i02));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = i02.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : b.W(arrayList.get(0)) : c0471p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r4 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r6 = (j5.i[]) r5.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r11 >= r10) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r6[r11] = g5.a.f5755b;
        r12 = (j5.i) r3.f1785e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r12 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        r12 = l1.j.b(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r4 = r4 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r6 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        r7 = (j5.i) r3.f1786f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r7 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r7 = l1.j.b(r7, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        r3 = B4.k.i0("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        if (r2.size() != r3.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0124, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        r2 = r2.size();
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0139, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0145, code lost:
    
        r3 = new A4.h(1, b(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        if (r2 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0150, code lost:
    
        if (r2 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
    
        r3 = new A4.c(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append((java.lang.CharSequence) "");
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r3.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        r4 = r3.next();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        if (r0 <= 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        r14.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        e5.g.d(r14, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        r14.append((java.lang.CharSequence) "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0184, code lost:
    
        return r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0196, code lost:
    
        throw new java.lang.IllegalArgumentException(B0.o.g(r2, "Requested element count ", " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013b, code lost:
    
        r2 = r2.size();
        r3 = r3.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e2, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e4, code lost:
    
        r3 = g5.a.f5756c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e7, code lost:
    
        r4 = g4.C0471p.f5750a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e9, code lost:
    
        if (r9 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00eb, code lost:
    
        r5 = B4.k.i0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f5, code lost:
    
        if (r12 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f7, code lost:
    
        r4 = B4.k.i0(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0107, code lost:
    
        if (r5.size() <= r4.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0109, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010b, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f4, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c6, code lost:
    
        kotlin.jvm.internal.i.l("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00cb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00cc, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ac, code lost:
    
        kotlin.jvm.internal.i.l("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b0, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        int i2 = 0;
        String unicode = IDN.toUnicode(str);
        kotlin.jvm.internal.i.b(unicode);
        List b6 = b(unicode);
        e eVar = this.f5758a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) eVar.f1783c;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) eVar.f1784d).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        eVar.m();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e3) {
                        eVar.f1787g = e3;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((i) eVar.f1785e) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(eVar.f1788h);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) eVar.f1787g);
            throw illegalStateException;
        }
        int size = b6.size();
        i[] iVarArr = new i[size];
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = i.f10496d;
            iVarArr[i3] = j.h((String) b6.get(i3));
        }
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                str2 = null;
                break;
            }
            i iVar2 = (i) eVar.f1785e;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.l("bytes");
                throw null;
            }
            str2 = j.b(iVar2, iVarArr, i6);
            if (str2 != null) {
                break;
            }
            i6++;
        }
    }
}
