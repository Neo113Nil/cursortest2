package com.google.android.gms.internal.play_billing;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C0644l9;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0181d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2737a;

    public /* synthetic */ AbstractC0181d1(int i3) {
        this.f2737a = i3;
    }

    public static int B(byte[] bArr, int i3, InterfaceC0202k1 interfaceC0202k1, V0 v0) {
        C0193h1 c0193h1 = (C0193h1) interfaceC0202k1;
        int G3 = G(bArr, i3, v0);
        int i4 = v0.f2688a + G3;
        while (G3 < i4) {
            G3 = G(bArr, G3, v0);
            c0193h1.d(v0.f2688a);
        }
        if (G3 == i4) {
            return G3;
        }
        throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static String C(int i3, int i4, String str) {
        if (i3 < 0) {
            return f("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(B0.c.h(i4, "negative size: "));
    }

    public static int E(int i3, byte[] bArr, int i4, int i5, H1 h12, V0 v0) {
        if ((i3 >>> 3) == 0) {
            throw new C0211n1("Protocol message contained an invalid tag (zero).");
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            int J2 = J(bArr, i4, v0);
            h12.c(i3, Long.valueOf(v0.f2689b));
            return J2;
        }
        if (i6 == 1) {
            h12.c(i3, Long.valueOf(M(i4, bArr)));
            return i4 + 8;
        }
        if (i6 == 2) {
            int G3 = G(bArr, i4, v0);
            int i7 = v0.f2688a;
            if (i7 < 0) {
                throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i7 > bArr.length - G3) {
                throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i7 == 0) {
                h12.c(i3, Y0.f2714c);
            } else {
                h12.c(i3, Y0.f(bArr, G3, i7));
            }
            return G3 + i7;
        }
        if (i6 != 3) {
            if (i6 != 5) {
                throw new C0211n1("Protocol message contained an invalid tag (zero).");
            }
            h12.c(i3, Integer.valueOf(n(i4, bArr)));
            return i4 + 4;
        }
        int i8 = (i3 & (-8)) | 4;
        H1 b3 = H1.b();
        int i9 = v0.f2691d + 1;
        v0.f2691d = i9;
        if (i9 >= 100) {
            throw new C0211n1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i10 = 0;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            int G4 = G(bArr, i4, v0);
            int i11 = v0.f2688a;
            if (i11 == i8) {
                i10 = i11;
                i4 = G4;
                break;
            }
            i4 = E(i11, bArr, G4, i5, b3, v0);
            i10 = i11;
        }
        v0.f2691d--;
        if (i4 > i5 || i10 != i8) {
            throw new C0211n1("Failed to parse the message.");
        }
        h12.c(i3, b3);
        return i4;
    }

    public static int G(byte[] bArr, int i3, V0 v0) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 < 0) {
            return H(b3, bArr, i4, v0);
        }
        v0.f2688a = b3;
        return i4;
    }

    public static int H(int i3, byte[] bArr, int i4, V0 v0) {
        byte b3 = bArr[i4];
        int i5 = i4 + 1;
        int i6 = i3 & 127;
        if (b3 >= 0) {
            v0.f2688a = i6 | (b3 << 7);
            return i5;
        }
        int i7 = i6 | ((b3 & Byte.MAX_VALUE) << 7);
        int i8 = i4 + 2;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            v0.f2688a = i7 | (b4 << 14);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 14);
        int i10 = i4 + 3;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            v0.f2688a = i9 | (b5 << 21);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 21);
        int i12 = i4 + 4;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            v0.f2688a = i11 | (b6 << 28);
            return i12;
        }
        int i13 = i11 | ((b6 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] >= 0) {
                v0.f2688a = i13;
                return i14;
            }
            i12 = i14;
        }
    }

    public static int I(int i3, byte[] bArr, int i4, int i5, InterfaceC0202k1 interfaceC0202k1, V0 v0) {
        C0193h1 c0193h1 = (C0193h1) interfaceC0202k1;
        int G3 = G(bArr, i4, v0);
        c0193h1.d(v0.f2688a);
        while (G3 < i5) {
            int G4 = G(bArr, G3, v0);
            if (i3 != v0.f2688a) {
                break;
            }
            G3 = G(bArr, G4, v0);
            c0193h1.d(v0.f2688a);
        }
        return G3;
    }

    public static int J(byte[] bArr, int i3, V0 v0) {
        long j3 = bArr[i3];
        int i4 = i3 + 1;
        if (j3 >= 0) {
            v0.f2689b = j3;
            return i4;
        }
        int i5 = i3 + 2;
        byte b3 = bArr[i4];
        long j4 = (j3 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i6 = 7;
        while (b3 < 0) {
            int i7 = i5 + 1;
            i6 += 7;
            j4 |= (r10 & Byte.MAX_VALUE) << i6;
            b3 = bArr[i5];
            i5 = i7;
        }
        v0.f2689b = j4;
        return i5;
    }

    public static int K(Object obj, D1 d12, byte[] bArr, int i3, int i4, int i5, V0 v0) {
        C0237w1 c0237w1 = (C0237w1) d12;
        int i6 = v0.f2691d + 1;
        v0.f2691d = i6;
        if (i6 >= 100) {
            throw new C0211n1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int t3 = c0237w1.t(obj, bArr, i3, i4, i5, v0);
        v0.f2691d--;
        v0.f2690c = obj;
        return t3;
    }

    public static int L(Object obj, D1 d12, byte[] bArr, int i3, int i4, V0 v0) {
        int i5 = i3 + 1;
        int i6 = bArr[i3];
        if (i6 < 0) {
            i5 = H(i6, bArr, i5, v0);
            i6 = v0.f2688a;
        }
        int i7 = i5;
        if (i6 < 0 || i6 > i4 - i7) {
            throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = v0.f2691d + 1;
        v0.f2691d = i8;
        if (i8 >= 100) {
            throw new C0211n1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = i7 + i6;
        d12.b(obj, bArr, i7, i9, v0);
        v0.f2691d--;
        v0.f2690c = obj;
        return i9;
    }

    public static long M(int i3, byte[] bArr) {
        return (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48) | ((bArr[i3 + 7] & 255) << 56);
    }

    public static int b(int i3) {
        return (int) (Integer.rotateLeft((int) (i3 * (-862048943)), 15) * 461845907);
    }

    public static int c(byte[] bArr, int i3, V0 v0) {
        int G3 = G(bArr, i3, v0);
        int i4 = v0.f2688a;
        if (i4 < 0) {
            throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - G3) {
            throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            v0.f2690c = Y0.f2714c;
            return G3;
        }
        v0.f2690c = Y0.f(bArr, G3, i4);
        return G3 + i4;
    }

    public static String e(Y0 y02) {
        StringBuilder sb = new StringBuilder(y02.d());
        for (int i3 = 0; i3 < y02.d(); i3++) {
            byte b3 = y02.b(i3);
            if (b3 == 34) {
                sb.append("\\\"");
            } else if (b3 == 39) {
                sb.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
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
                        if (b3 < 32 || b3 > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((b3 >>> 6) & 3) + 48));
                            sb.append((char) (((b3 >>> 3) & 7) + 48));
                            sb.append((char) ((b3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b3);
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

    public static String f(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                break;
            }
            Object obj = objArr[i4];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e3) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e3);
                    str2 = "<" + str3 + " threw " + e3.getClass().getName() + ">";
                }
            }
            objArr[i4] = str2;
            i4++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i5 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (indexOf = str.indexOf("%s", i5)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i5, indexOf);
            sb.append(objArr[i3]);
            i3++;
            i5 = indexOf + 2;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i3 < length2) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i6 = i3 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void g(int i3, int i4) {
        String f;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                f = f("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(B0.c.h(i4, "negative size: "));
                }
                f = f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(f);
        }
    }

    public static void h(int i3, String str) {
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i3);
    }

    public static boolean j(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = M.f2653b;
            }
        } else {
            if (!(collection instanceof InterfaceC0171a0)) {
                return false;
            }
            obj = ((I) ((InterfaceC0171a0) collection)).f2636c;
        }
        return comparator.equals(obj);
    }

    public static /* synthetic */ boolean k(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC0210n0 abstractC0210n0, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0210n0, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0210n0) != obj && atomicReferenceFieldUpdater.get(abstractC0210n0) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, r2 r2Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(r2Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(r2Var) != obj && atomicReferenceFieldUpdater.get(r2Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int m(int i3) {
        if (i3 == 90) {
            return 91;
        }
        if (i3 == 91) {
            return 92;
        }
        if (i3 == 93) {
            return 94;
        }
        if (i3 == 94) {
            return 95;
        }
        switch (i3) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case C0644l9.f7759C /* 19 */:
                return 20;
            case C0644l9.f7760D /* 20 */:
                return 21;
            case C0644l9.f7761E /* 21 */:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case C0644l9.f7762F /* 25 */:
                return 26;
            case C0644l9.f7763G /* 26 */:
                return 27;
            case C0644l9.f7764H /* 27 */:
                return 28;
            case 28:
                return 29;
            case C0644l9.f7765I /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case C0644l9.f7766J /* 35 */:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case C0644l9.f7767K /* 38 */:
                return 39;
            case 39:
                return 40;
            case C0644l9.L /* 40 */:
                return 41;
            case 41:
                return 42;
            case C0644l9.f7768M /* 42 */:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i3) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND /* 100 */:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return BuildConfig.API_LEVEL;
                    case BuildConfig.API_LEVEL /* 116 */:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    public static int n(int i3, byte[] bArr) {
        int i4 = bArr[i3] & 255;
        int i5 = bArr[i3 + 1] & 255;
        int i6 = bArr[i3 + 2] & 255;
        return ((bArr[i3 + 3] & 255) << 24) | (i5 << 8) | i4 | (i6 << 16);
    }

    public static AbstractC0172a1 p() {
        String str;
        ClassLoader classLoader = AbstractC0181d1.class.getClassLoader();
        if (AbstractC0172a1.class.equals(AbstractC0172a1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!AbstractC0172a1.class.getPackage().equals(AbstractC0181d1.class.getPackage())) {
                throw new IllegalArgumentException(AbstractC0172a1.class.getName());
            }
            str = AbstractC0172a1.class.getPackage().getName() + ".BlazeGenerated" + AbstractC0172a1.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        try {
                            B0.c.n(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (InstantiationException e3) {
                            throw new IllegalStateException(e3);
                        }
                    } catch (IllegalAccessException e4) {
                        throw new IllegalStateException(e4);
                    }
                } catch (NoSuchMethodException e5) {
                    throw new IllegalStateException(e5);
                } catch (InvocationTargetException e6) {
                    throw new IllegalStateException(e6);
                }
            } catch (ClassNotFoundException unused) {
                Iterator it = Arrays.asList(new AbstractC0181d1[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e7) {
                        Logger.getLogger(Z0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(AbstractC0172a1.class.getSimpleName()), (Throwable) e7);
                    }
                }
                if (arrayList.size() == 1) {
                    return (AbstractC0172a1) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (AbstractC0172a1) AbstractC0172a1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e8) {
                    throw new IllegalStateException(e8);
                } catch (NoSuchMethodException e9) {
                    throw new IllegalStateException(e9);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(e10);
                }
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void q(int i3, int i4) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(C(i3, i4, "index"));
        }
    }

    public static int w(D1 d12, int i3, byte[] bArr, int i4, int i5, InterfaceC0202k1 interfaceC0202k1, V0 v0) {
        AbstractC0190g1 g3 = d12.g();
        D1 d13 = d12;
        byte[] bArr2 = bArr;
        int i6 = i5;
        V0 v02 = v0;
        int L = L(g3, d13, bArr2, i4, i6, v02);
        d13.a(g3);
        v02.f2690c = g3;
        interfaceC0202k1.add(g3);
        while (L < i6) {
            V0 v03 = v02;
            int i7 = i6;
            int G3 = G(bArr2, L, v03);
            if (i3 != v03.f2688a) {
                break;
            }
            byte[] bArr3 = bArr2;
            D1 d14 = d13;
            AbstractC0190g1 g4 = d14.g();
            L = L(g4, d14, bArr3, G3, i7, v03);
            d13 = d14;
            bArr2 = bArr3;
            i6 = i7;
            v02 = v03;
            d13.a(g4);
            v02.f2690c = g4;
            interfaceC0202k1.add(g4);
        }
        return L;
    }

    public static void x(int i3, int i4, int i5) {
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i5) ? C(i3, i5, "start index") : (i4 < 0 || i4 > i5) ? C(i4, i5, "end index") : f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3)));
        }
    }

    public static boolean y(byte b3) {
        return b3 > -65;
    }

    public abstract boolean A(r2 r2Var, q2 q2Var, q2 q2Var2);

    public abstract boolean D(AbstractC0210n0 abstractC0210n0, Object obj, Object obj2);

    public abstract boolean F(AbstractC0210n0 abstractC0210n0, C0207m0 c0207m0, C0207m0 c0207m02);

    public abstract C0186f0 d(AbstractC0210n0 abstractC0210n0);

    public abstract void i(q2 q2Var, q2 q2Var2);

    public abstract C0207m0 o(AbstractC0210n0 abstractC0210n0);

    public abstract void r(q2 q2Var, Thread thread);

    public abstract void s(C0207m0 c0207m0, C0207m0 c0207m02);

    public abstract boolean t(r2 r2Var, F1 f12, F1 f13);

    public String toString() {
        switch (this.f2737a) {
            case 4:
                return ((C0) this).f2607b.toString();
            default:
                return super.toString();
        }
    }

    public abstract void u(C0207m0 c0207m0, Thread thread);

    public abstract boolean v(r2 r2Var, Object obj, Object obj2);

    public abstract boolean z(AbstractC0210n0 abstractC0210n0, C0186f0 c0186f0, C0186f0 c0186f02);
}
