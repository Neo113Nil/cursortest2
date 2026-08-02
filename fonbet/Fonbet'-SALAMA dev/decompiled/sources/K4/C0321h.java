package K4;

import A1.K0;
import F2.L0;
import P.U;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.widget.TextView;
import androidx.appcompat.widget.P;
import com.google.protobuf.AbstractC0911k;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.WeakHashMap;
import v2.AbstractC1664a;

/* renamed from: K4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0321h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4015a = 3;

    /* renamed from: b, reason: collision with root package name */
    public int f4016b;

    /* renamed from: c, reason: collision with root package name */
    public int f4017c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4018d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4019e;

    public /* synthetic */ C0321h() {
    }

    public static C0321h b(AbstractC0911k abstractC0911k, int i7, int i8) {
        if (i7 < 0 || i7 >= 8) {
            throw new C0320g(e1.k.d(i7, "Invalid padding: "));
        }
        if (i8 < 0) {
            throw new C0320g(e1.k.d(i8, "Invalid hash count: "));
        }
        if (abstractC0911k.size() > 0 && i8 == 0) {
            throw new C0320g(e1.k.d(i8, "Invalid hash count: "));
        }
        if (abstractC0911k.size() != 0 || i7 == 0) {
            return new C0321h(abstractC0911k, i7, i8);
        }
        throw new C0320g(e1.k.d(i7, "Expected padding of 0 when bitmap length is 0, but got "));
    }

    public static long d(int i7, byte[] bArr) {
        long j = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            j |= (bArr[i7 + i8] & 255) << (i8 * 8);
        }
        return j;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new K0(this, 7));
    }

    public void c() {
        int length = ((Object[]) this.f4019e).length;
        if (this.f4017c < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i8 = this.f4016b;
        int i9 = length - i8;
        System.arraycopy((long[]) this.f4018d, i8, jArr, 0, i9);
        System.arraycopy((Object[]) this.f4019e, this.f4016b, objArr, 0, i9);
        int i10 = this.f4016b;
        if (i10 > 0) {
            System.arraycopy((long[]) this.f4018d, 0, jArr, i9, i10);
            System.arraycopy((Object[]) this.f4019e, 0, objArr, i9, this.f4016b);
        }
        this.f4018d = jArr;
        this.f4019e = objArr;
        this.f4016b = 0;
    }

    public void e(Typeface typeface) {
        int i7;
        int i8 = 2;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f4016b) != -1) {
            typeface = P.a(typeface, i7, (this.f4017c & 2) != 0);
        }
        L0 l02 = (L0) this.f4019e;
        if (l02.f2591c) {
            l02.f2600m = typeface;
            TextView textView = (TextView) ((WeakReference) this.f4018d).get();
            if (textView != null) {
                WeakHashMap weakHashMap = U.f5037a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, l02.f2589a, i8));
                } else {
                    textView.setTypeface(typeface, l02.f2589a);
                }
            }
        }
    }

    public Object f() {
        AbstractC1664a.h(this.f4017c > 0);
        Object[] objArr = (Object[]) this.f4019e;
        int i7 = this.f4016b;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f4016b = (i7 + 1) % objArr.length;
        this.f4017c--;
        return obj;
    }

    public String toString() {
        switch (this.f4015a) {
            case 0:
                return "BloomFilter{hashCount=" + this.f4017c + ", size=" + this.f4016b + ", bitmap=\"" + Base64.encodeToString(((AbstractC0911k) this.f4018d).K(), 2) + "\"}";
            default:
                return super.toString();
        }
    }

    public C0321h(AbstractC0911k abstractC0911k, int i7, int i8) {
        if (i7 < 0 || i7 >= 8) {
            throw new IllegalArgumentException(e1.k.d(i7, "Invalid padding: "));
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(e1.k.d(i8, "Invalid hash count: "));
        }
        if (abstractC0911k.size() > 0 && i8 == 0) {
            throw new IllegalArgumentException(e1.k.d(i8, "Invalid hash count: "));
        }
        if (abstractC0911k.size() == 0 && i7 != 0) {
            throw new IllegalArgumentException(e1.k.d(i7, "Expected padding of 0 when bitmap length is 0, but got "));
        }
        this.f4018d = abstractC0911k;
        this.f4017c = i8;
        this.f4016b = (abstractC0911k.size() * 8) - i7;
        try {
            this.f4019e = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e7);
        }
    }

    public C0321h(String str, ByteBuffer byteBuffer, int i7, int i8) {
        this.f4016b = i7;
        this.f4018d = str;
        this.f4017c = i8;
        this.f4019e = byteBuffer;
    }

    public C0321h(L0 l02, int i7, int i8, WeakReference weakReference) {
        this.f4019e = l02;
        this.f4016b = i7;
        this.f4017c = i8;
        this.f4018d = weakReference;
    }

    public C0321h(String str, byte[] bArr, int i7, int i8) {
        this.f4018d = str;
        this.f4019e = bArr;
        this.f4016b = i7;
        this.f4017c = i8;
    }
}
