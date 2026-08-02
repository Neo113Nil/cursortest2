package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m80 implements li1 {

    /* JADX INFO: renamed from: k */
    public static final g72 f5000k = new g72("RESUME_TOKEN", 3);

    /* JADX INFO: renamed from: l */
    public static final Object f5001l = new Object();

    /* JADX INFO: renamed from: m */
    public static final Object f5002m = new Object();

    /* JADX INFO: renamed from: n */
    public static volatile p61 f5003n;

    /* JADX INFO: renamed from: o */
    public static volatile p61 f5004o;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5005j;

    public /* synthetic */ m80(int i) {
        this.f5005j = i;
    }

    /* JADX INFO: renamed from: e */
    public static final C0734tm m3339e(InterfaceC0180en interfaceC0180en) {
        if (interfaceC0180en.mo1466j(wa0.f8474n) == null) {
            interfaceC0180en = interfaceC0180en.mo1465i(new cg0());
        }
        return new C0734tm(interfaceC0180en);
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m3340f(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3341h(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = ir0.f3639j;
            }
        } else {
            if (!(collection instanceof uc0)) {
                return false;
            }
            objComparator = ((uc0) collection).f7793m;
        }
        return comparator.equals(objComparator);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m3342i(AssertionError assertionError) {
        int i = wt0.f8666a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? fb1.m1759u(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static void m3343j(String str) {
        if (Log.isLoggable("FIAM.Display", 3)) {
            Log.d("FIAM.Display", str);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m3344k(String str, float f) {
        m3343j(str + ": " + f);
    }

    /* JADX INFO: renamed from: l */
    public static void m3345l(String str, float f, float f2) {
        m3343j(str + ": (" + f + ", " + f2 + ")");
    }

    /* JADX INFO: renamed from: m */
    public static void m3346m(String str) {
        Log.e("FIAM.Display", str);
    }

    /* JADX INFO: renamed from: n */
    public static void m3347n(String str) {
        if (Log.isLoggable("FIAM.Display", 4)) {
            Log.i("FIAM.Display", str);
        }
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m3348o(C0503nd c0503nd) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = c0503nd.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m3340f(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (c0503nd.read() == -1) {
            return m3340f(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: p */
    public static File m3349p(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        C0270h1.m2191g("getFilesDir returned null twice.");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo3068g();

    public String toString() {
        switch (this.f5005j) {
            case 6:
                return mo3068g().toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: b */
    public void mo1068b() {
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: d */
    public void mo1069d() {
    }
}
