package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.et, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0952et {

    /* renamed from: l, reason: collision with root package name */
    public static String f13371l;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13372k;

    public /* synthetic */ AbstractC0952et(int i) {
        this.f13372k = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r2 = ((com.google.android.gms.internal.ads.NF) r4.get(r1)).f10791d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A(boolean z3) {
        List supportedPerformancePoints;
        boolean covers;
        try {
            C1649uH c1649uH = new C1649uH();
            c1649uH.c("video/avc");
            C1407p c1407p = new C1407p(c1649uH);
            if (c1407p.f14904m != null) {
                C1761wv c5 = YF.c(C1543s1.f15417x, c1407p, z3, false);
                int i = 0;
                while (i < c5.f16186n) {
                    if (((NF) c5.get(i)).f10791d != null && ((NF) c5.get(i)).f10791d.getVideoCapabilities() != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        OF.k();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint i5 = OF.i();
                        for (int i6 = 0; i6 < supportedPerformancePoints.size(); i6++) {
                            covers = A0.P.c(supportedPerformancePoints.get(i6)).covers(i5);
                            if (covers) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                    i++;
                }
            }
        } catch (UF unused) {
        }
        return 0;
    }

    public static Fv B(AbstractC1177jv abstractC1177jv, AbstractC1177jv abstractC1177jv2) {
        AbstractC1400ot.M("set1", abstractC1177jv);
        AbstractC1400ot.M("set2", abstractC1177jv2);
        return new Fv(abstractC1177jv, abstractC1177jv2);
    }

    public static File D(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(M(file, str), str2);
    }

    public static String E(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c5 = charArray[i];
                    if (c5 >= 'a' && c5 <= 'z') {
                        charArray[i] = (char) (c5 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String F(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e3) {
                    String v4 = AbstractC0467k.v(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(v4), (Throwable) e3);
                    str2 = "<" + v4 + " threw " + e3.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(objArr[i]);
            i++;
            i6 = indexOf + 2;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i7 = i + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static LinkedHashMap G(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void I(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(L1.a.n("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static void J(boolean z3) {
        if (!z3) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static boolean K(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Gv L(Set set, InterfaceC1446pu interfaceC1446pu) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof Gv)) {
                set.getClass();
                return new Gv(set, interfaceC1446pu);
            }
            Gv gv = (Gv) set;
            InterfaceC1446pu interfaceC1446pu2 = gv.f9285l;
            interfaceC1446pu2.getClass();
            return new Gv(gv.f9284k, new C1491qu(Arrays.asList(interfaceC1446pu2, interfaceC1446pu)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof Gv)) {
            set2.getClass();
            return new Hv(set2, interfaceC1446pu);
        }
        Gv gv2 = (Gv) set2;
        InterfaceC1446pu interfaceC1446pu3 = gv2.f9285l;
        interfaceC1446pu3.getClass();
        return new Hv((SortedSet) gv2.f9284k, new C1491qu(Arrays.asList(interfaceC1446pu3, interfaceC1446pu)));
    }

    public static File M(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        p(file2, false);
        return file2;
    }

    public static final void O(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public static void P(List list, InterfaceC1446pu interfaceC1446pu, int i, int i5) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i5) {
                break;
            } else if (interfaceC1446pu.k(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i5--;
            if (i5 < i) {
                return;
            } else {
                list.remove(i5);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean Q(java.lang.CharSequence r6, java.lang.String r7) {
        /*
            int r0 = r7.length()
            if (r7 != r6) goto L7
            goto L30
        L7:
            int r1 = r6.length()
            r2 = 0
            if (r0 != r1) goto L32
            r1 = r2
        Lf:
            if (r1 >= r0) goto L30
            char r3 = r7.charAt(r1)
            char r4 = r6.charAt(r1)
            if (r3 != r4) goto L1c
            goto L2d
        L1c:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L32
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 == r4) goto L2d
            goto L32
        L2d:
            int r1 = r1 + 1
            goto Lf
        L30:
            r6 = 1
            return r6
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0952et.Q(java.lang.CharSequence, java.lang.String):boolean");
    }

    public static Executor R(Executor executor, Gw gw) {
        executor.getClass();
        return executor == Ew.f8627k ? executor : new Sw(executor, gw);
    }

    public static boolean T(File file) {
        boolean z3;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z3 = true;
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                z3 = file2 != null && T(file2) && z3;
            }
        } else {
            z3 = true;
        }
        return file.delete() && z3;
    }

    public static boolean U(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static int V(InterfaceC1554sC interfaceC1554sC, int i, byte[] bArr, int i5, int i6, UB ub, C1598tB c1598tB) {
        MB b3 = interfaceC1554sC.b();
        InterfaceC1554sC interfaceC1554sC2 = interfaceC1554sC;
        byte[] bArr2 = bArr;
        int i7 = i6;
        C1598tB c1598tB2 = c1598tB;
        int j02 = j0(b3, interfaceC1554sC2, bArr2, i5, i7, c1598tB2);
        interfaceC1554sC2.a(b3);
        c1598tB2.f15640c = b3;
        ub.add(b3);
        while (j02 < i7) {
            C1598tB c1598tB3 = c1598tB2;
            int i8 = i7;
            int e02 = e0(bArr2, j02, c1598tB3);
            if (i != c1598tB3.f15638a) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC1554sC interfaceC1554sC3 = interfaceC1554sC2;
            MB b5 = interfaceC1554sC3.b();
            j02 = j0(b5, interfaceC1554sC3, bArr3, e02, i8, c1598tB3);
            interfaceC1554sC2 = interfaceC1554sC3;
            bArr2 = bArr3;
            i7 = i8;
            c1598tB2 = c1598tB3;
            interfaceC1554sC2.a(b5);
            c1598tB2.f15640c = b5;
            ub.add(b5);
        }
        return j02;
    }

    public static boolean W(char c5) {
        return c5 >= 'A' && c5 <= 'Z';
    }

    public static boolean X(Iv iv, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC1626tv) {
            collection = ((InterfaceC1626tv) collection).a();
        }
        boolean z3 = false;
        if (!(collection instanceof Set) || collection.size() <= iv.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z3 |= iv.remove(it.next());
            }
            return z3;
        }
        Iterator<E> it2 = iv.iterator();
        collection.getClass();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z3 = true;
            }
        }
        return z3;
    }

    public static boolean Z(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                AbstractC2309b.c(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                AbstractC2309b.c(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                AbstractC2309b.c(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int a0(byte[] bArr, int i, UB ub, C1598tB c1598tB) {
        NB nb = (NB) ub;
        int e02 = e0(bArr, i, c1598tB);
        int i5 = c1598tB.f15638a + e02;
        while (e02 < i5) {
            e02 = e0(bArr, e02, c1598tB);
            nb.f(c1598tB.f15638a);
        }
        if (e02 == i5) {
            return e02;
        }
        throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int b(int i, int i5) {
        long j5 = i + i5;
        int i6 = (int) j5;
        if (j5 == i6) {
            return i6;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i5 + ")");
    }

    public static int c0(int i, byte[] bArr, int i5, int i6, C1779xC c1779xC, C1598tB c1598tB) {
        if ((i >>> 3) == 0) {
            throw new XB("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int h02 = h0(bArr, i5, c1598tB);
            c1779xC.c(i, Long.valueOf(c1598tB.f15639b));
            return h02;
        }
        if (i7 == 1) {
            c1779xC.c(i, Long.valueOf(k0(i5, bArr)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int e02 = e0(bArr, i5, c1598tB);
            int i8 = c1598tB.f15638a;
            if (i8 < 0) {
                throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - e02) {
                throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                c1779xC.c(i, AbstractC1823yB.f16414l);
            } else {
                c1779xC.c(i, AbstractC1823yB.r(bArr, e02, i8));
            }
            return e02 + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new XB("Protocol message contained an invalid tag (zero).");
            }
            c1779xC.c(i, Integer.valueOf(z(i5, bArr)));
            return i5 + 4;
        }
        int i9 = (i & (-8)) | 4;
        C1779xC b3 = C1779xC.b();
        int i10 = c1598tB.f15641d + 1;
        c1598tB.f15641d = i10;
        if (i10 >= 100) {
            throw new XB("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int e03 = e0(bArr, i5, c1598tB);
            int i12 = c1598tB.f15638a;
            if (i12 == i9) {
                i11 = i12;
                i5 = e03;
                break;
            }
            i5 = c0(i12, bArr, e03, i6, b3, c1598tB);
            i11 = i12;
        }
        c1598tB.f15641d--;
        if (i5 > i6 || i11 != i9) {
            throw new XB("Failed to parse the message.");
        }
        c1779xC.c(i, b3);
        return i5;
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static int e(byte[] bArr, int i, C1598tB c1598tB) {
        int e02 = e0(bArr, i, c1598tB);
        int i5 = c1598tB.f15638a;
        if (i5 < 0) {
            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i5 > bArr.length - e02) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i5 == 0) {
            c1598tB.f15640c = AbstractC1823yB.f16414l;
            return e02;
        }
        c1598tB.f15640c = AbstractC1823yB.r(bArr, e02, i5);
        return e02 + i5;
    }

    public static int e0(byte[] bArr, int i, C1598tB c1598tB) {
        int i5 = i + 1;
        byte b3 = bArr[i];
        if (b3 < 0) {
            return f0(b3, bArr, i5, c1598tB);
        }
        c1598tB.f15638a = b3;
        return i5;
    }

    public static C0905dr f(Dp dp) {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) dp.f8377l;
        try {
            GB gb = GB.f9177a;
            C1285mC c1285mC = C1285mC.f14484c;
            GA A3 = GA.A(byteArrayInputStream, GB.f9178b);
            byteArrayInputStream.close();
            if (A3.w() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            ArrayList arrayList = new ArrayList(A3.w());
            for (FA fa : A3.B()) {
                fa.getClass();
                try {
                    C1136iz a5 = C1136iz.a(fa.x().A(), fa.x().z(), fa.x().x(), fa.z(), fa.z() == UA.f11745o ? null : Integer.valueOf(fa.w()));
                    Vy vy = Vy.f11970b;
                    C1406oz c1406oz = (C1406oz) vy.f11971a.get();
                    c1406oz.getClass();
                    AbstractC1400ot ky = !c1406oz.f14882b.containsKey(new C1316mz(C1136iz.class, a5.f14024b)) ? new Ky(a5) : vy.a(a5);
                    int E5 = fa.E() - 2;
                    if (E5 != 1 && E5 != 2 && E5 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new C1179jx(ky));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            }
            return new C0905dr(A3, Collections.unmodifiableList(arrayList));
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static int f0(int i, byte[] bArr, int i5, C1598tB c1598tB) {
        byte b3 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i & 127;
        if (b3 >= 0) {
            c1598tB.f15638a = i7 | (b3 << 7);
            return i6;
        }
        int i8 = i7 | ((b3 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i6];
        if (b5 >= 0) {
            c1598tB.f15638a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c1598tB.f15638a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c1598tB.f15638a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c1598tB.f15638a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static C1849yt g(Context context, int i, String str, String str2, P.W w5) {
        C1849yt c1849yt;
        C0907dt c0907dt = new C0907dt(context, i, str, str2, w5);
        try {
            c1849yt = (C1849yt) c0907dt.f13193n.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            c0907dt.b(2009, c0907dt.f13196q, e3);
            c1849yt = null;
        }
        c0907dt.b(3004, c0907dt.f13196q, null);
        if (c1849yt != null) {
            if (c1849yt.f16499m == 7) {
                P.W.f4410o = 3;
            } else {
                P.W.f4410o = 2;
            }
        }
        return c1849yt == null ? new C1849yt() : c1849yt;
    }

    public static int g0(int i, byte[] bArr, int i5, int i6, UB ub, C1598tB c1598tB) {
        NB nb = (NB) ub;
        int e02 = e0(bArr, i5, c1598tB);
        nb.f(c1598tB.f15638a);
        while (e02 < i6) {
            int e03 = e0(bArr, e02, c1598tB);
            if (i != c1598tB.f15638a) {
                break;
            }
            e02 = e0(bArr, e03, c1598tB);
            nb.f(c1598tB.f15638a);
        }
        return e02;
    }

    public static int h0(byte[] bArr, int i, C1598tB c1598tB) {
        long j5 = bArr[i];
        int i5 = i + 1;
        if (j5 >= 0) {
            c1598tB.f15639b = j5;
            return i5;
        }
        int i6 = i + 2;
        byte b3 = bArr[i5];
        long j6 = (j5 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b3 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j6 |= (r10 & Byte.MAX_VALUE) << i7;
            b3 = bArr[i6];
            i6 = i8;
        }
        c1598tB.f15639b = j6;
        return i6;
    }

    public static AbstractC1314mx i(byte[] bArr) {
        try {
            GB gb = GB.f9177a;
            C1285mC c1285mC = C1285mC.f14484c;
            BA y5 = BA.y(bArr, GB.f9178b);
            Vy vy = Vy.f11970b;
            C1419pB a5 = AbstractC1451pz.a(y5.B());
            C1181jz c1181jz = new C1181jz(y5, a5);
            C1406oz c1406oz = (C1406oz) vy.f11971a.get();
            c1406oz.getClass();
            return !c1406oz.f14884d.containsKey(new C1316mz(C1181jz.class, a5)) ? new Ly(c1181jz) : vy.b(c1181jz);
        } catch (IOException e3) {
            throw new GeneralSecurityException("Failed to parse proto", e3);
        }
    }

    public static int i0(Object obj, InterfaceC1554sC interfaceC1554sC, byte[] bArr, int i, int i5, int i6, C1598tB c1598tB) {
        C1062hC c1062hC = (C1062hC) interfaceC1554sC;
        int i7 = c1598tB.f15641d + 1;
        c1598tB.f15641d = i7;
        if (i7 >= 100) {
            throw new XB("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int A3 = c1062hC.A(obj, bArr, i, i5, i6, c1598tB);
        c1598tB.f15641d--;
        c1598tB.f15640c = obj;
        return A3;
    }

    public static int j0(Object obj, InterfaceC1554sC interfaceC1554sC, byte[] bArr, int i, int i5, C1598tB c1598tB) {
        int i6 = i + 1;
        int i7 = bArr[i];
        if (i7 < 0) {
            i6 = f0(i7, bArr, i6, c1598tB);
            i7 = c1598tB.f15638a;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = c1598tB.f15641d + 1;
        c1598tB.f15641d = i9;
        if (i9 >= 100) {
            throw new XB("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i10 = i8 + i7;
        interfaceC1554sC.f(obj, bArr, i8, i10, c1598tB);
        c1598tB.f15641d--;
        c1598tB.f15640c = obj;
        return i10;
    }

    public static Object k(Fv fv, String str) {
        C1222kv c1222kv = new C1222kv(fv.f9141k, fv.f9142l);
        return c1222kv.hasNext() ? c1222kv.next() : str;
    }

    public static long k0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static String l(Context context) {
        String str = f13371l;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f13371l = null;
        } else if (arrayList.size() == 1) {
            f13371l = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str2)) {
                    f13371l = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f13371l = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f13371l = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f13371l = "com.chrome.dev";
            }
        }
        return f13371l;
    }

    public static String m(AbstractC1823yB abstractC1823yB) {
        StringBuilder sb = new StringBuilder(abstractC1823yB.g());
        for (int i = 0; i < abstractC1823yB.g(); i++) {
            byte d5 = abstractC1823yB.d(i);
            if (d5 == 34) {
                sb.append("\\\"");
            } else if (d5 == 39) {
                sb.append("\\'");
            } else if (d5 != 92) {
                switch (d5) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (d5 < 32 || d5 > 126) {
                            sb.append('\\');
                            sb.append((char) (((d5 >>> 6) & 3) + 48));
                            sb.append((char) (((d5 >>> 3) & 7) + 48));
                            sb.append((char) ((d5 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) d5);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String n(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (W(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c5 = charArray[i];
                    if (W(c5)) {
                        charArray[i] = (char) (c5 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static Date o(long j5) {
        return new Date((j5 - 2082844800) * 1000);
    }

    public static void p(File file, boolean z3) {
        if (z3 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void q(String str, int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void r(String str, long j5) {
        if (j5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j5 + ") must be >= 0");
    }

    public static boolean s(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !By.a();
        }
        if (!By.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            By.f7922a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static boolean t(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr) {
                hdrCapabilities = display.getHdrCapabilities();
                supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                for (int i : supportedHdrTypes) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean u(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] v(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i5 = i + i;
            int digit = Character.digit(str.charAt(i5), 16);
            int digit2 = Character.digit(str.charAt(i5 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static byte[] w(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i5 = i + 1;
            byte b3 = bArr[i];
            byte b5 = (byte) ((b3 + b3) & 254);
            bArr2[i] = b5;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i5] >> 7) & 1) | b5);
            }
            i = i5;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static int x(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public static int y(int i, int i5) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i5 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i / i5;
        int i7 = i - (i5 * i6);
        if (i7 == 0) {
            return i6;
        }
        int i8 = ((i ^ i5) >> 31) | 1;
        switch (Wv.f12124a[roundingMode.ordinal()]) {
            case 1:
                J(false);
                return i6;
            case 2:
                return i6;
            case 3:
                if (i8 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i7);
                int abs2 = abs - (Math.abs(i5) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i6;
                }
                if (abs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i8;
    }

    public static int z(int i, byte[] bArr) {
        int i5 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public abstract C1358nw C(AbstractC1403ow abstractC1403ow);

    public abstract void H(AbstractC1672uw abstractC1672uw, Set set);

    public abstract void N(C1358nw c1358nw, C1358nw c1358nw2);

    public abstract void S(C1358nw c1358nw, Thread thread);

    public abstract boolean Y(AbstractC1403ow abstractC1403ow, C1000fw c1000fw, C1000fw c1000fw2);

    public abstract boolean b0(AbstractC1403ow abstractC1403ow, Object obj, Object obj2);

    public abstract int c(AbstractC1672uw abstractC1672uw);

    public abstract boolean d0(AbstractC1403ow abstractC1403ow, C1358nw c1358nw, C1358nw c1358nw2);

    public abstract C1000fw h(AbstractC1403ow abstractC1403ow);

    public abstract Object j();

    public String toString() {
        switch (this.f13372k) {
            case 7:
                return j().toString();
            default:
                return super.toString();
        }
    }
}
