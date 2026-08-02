package B1;

import A1.C0011c;
import C0.C0083b;
import C1.C0095a;
import E3.AbstractC0158p;
import E3.B;
import E3.C0164w;
import E3.Q;
import G4.A;
import K4.AbstractC0315b;
import P.U;
import R5.M;
import W5.AbstractC0486a1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.appcompat.widget.AbstractC0637f0;
import androidx.appcompat.widget.C0665u;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h.AbstractC1174a;
import i4.C1265b;
import i4.C1266c;
import i4.C1274k;
import i5.C1283e;
import io.sentry.SentryEvent;
import io.sentry.protocol.SentryStackTrace;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.C1450e;
import n3.AbstractC1464a;
import n4.C1473g;
import n4.I;
import p6.AbstractC1539a;
import r4.AbstractC1575b;
import v2.s;
import v2.t;
import v4.r;
import w1.C1726n0;
import w1.D;
import w1.E;
import w1.P2;
import w1.Y0;
import w1.Z0;

/* loaded from: classes.dex */
public final class m implements F1.e, i5.g, Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1013a;

    /* renamed from: b, reason: collision with root package name */
    public int f1014b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1015c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1016d;

    public /* synthetic */ m(Serializable serializable, int i7, Object obj, int i8) {
        this.f1013a = i8;
        this.f1016d = serializable;
        this.f1014b = i7;
        this.f1015c = obj;
    }

    public static m n(String str) {
        int i7;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        Y5.k kVar = Y5.k.HTTP_1_0;
        if (startsWith) {
            i7 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                kVar = Y5.k.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i7 = 4;
        }
        int i8 = i7 + 3;
        if (str.length() < i8) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i7, i8));
            if (str.length() <= i8) {
                str2 = "";
            } else {
                if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i7 + 4);
            }
            return new m((Object) kVar, parseInt, str2, 8);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    @Override // F1.e
    public F1.d b(F1.h hVar, long j) {
        long j3 = hVar.f2534d;
        int min = (int) Math.min(112800, hVar.f2533c - j3);
        C0095a c0095a = (C0095a) this.f1016d;
        c0095a.A(min);
        hVar.c((byte[]) c0095a.f1465c, 0, min, false);
        int i7 = c0095a.f1464b;
        long j7 = -1;
        long j8 = -1;
        long j9 = -9223372036854775807L;
        while (c0095a.d() >= 188) {
            byte[] bArr = (byte[]) c0095a.f1465c;
            int i8 = c0095a.f1463a;
            while (i8 < i7 && bArr[i8] != 71) {
                i8++;
            }
            int i9 = i8 + 188;
            if (i9 > i7) {
                break;
            }
            long F7 = P6.b.F(c0095a, i8, this.f1014b);
            if (F7 != -9223372036854775807L) {
                long b7 = ((s) this.f1015c).b(F7);
                if (b7 > j) {
                    return j9 == -9223372036854775807L ? new F1.d(-1, b7, j3) : new F1.d(0, -9223372036854775807L, j3 + j8);
                }
                if (100000 + b7 > j) {
                    return new F1.d(0, -9223372036854775807L, j3 + i8);
                }
                j8 = i8;
                j9 = b7;
            }
            c0095a.D(i9);
            j7 = i9;
        }
        return j9 != -9223372036854775807L ? new F1.d(-2, j9, j3 + j7) : F1.d.f2514d;
    }

    @Override // i5.g
    public void c(C1283e c1283e) {
        ((Handler) this.f1016d).post(c1283e.f14027b);
    }

    @Override // i5.g
    public void d() {
        HandlerThread handlerThread = (HandlerThread) this.f1015c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1015c = null;
            this.f1016d = null;
        }
    }

    public void e() {
        A a2;
        ImageView imageView = (ImageView) this.f1015c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0637f0.a(drawable);
        }
        if (drawable == null || (a2 = (A) this.f1016d) == null) {
            return;
        }
        C0665u.d(drawable, a2, imageView.getDrawableState());
    }

    public B3.a f() {
        boolean z4 = true;
        if (!zzcu.zza(true) && !((ArrayList) this.f1015c).contains(zzcm.zza((Context) this.f1016d))) {
            z4 = false;
        }
        return new B3.a(z4, this);
    }

    @Override // F1.e
    public void g() {
        byte[] bArr = t.f17158f;
        C0095a c0095a = (C0095a) this.f1016d;
        c0095a.getClass();
        c0095a.B(bArr.length, bArr);
    }

    @Override // w1.Y0
    public Object h(InputStream inputStream) {
        Z0 z02 = (Z0) this.f1015c;
        E e7 = new E(inputStream, 4);
        String readUTF = e7.readUTF();
        if (((String) this.f1016d).equals(readUTF)) {
            return z02.g(e7.readInt()).h(e7);
        }
        throw new IOException(AbstractC0486a1.h("Signature: ", readUTF, " is invalid"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q i() {
        short[] sArr;
        char c3;
        byte[] bArr;
        boolean z4;
        Q q7;
        E3.A a2 = (E3.A) this.f1016d;
        if (a2 != null) {
            throw a2.a();
        }
        int i7 = this.f1014b;
        Object[] objArr = (Object[]) this.f1015c;
        if (i7 == 0) {
            q7 = Q.f2012x;
        } else {
            int i8 = 1;
            Object obj = null;
            if (i7 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                q7 = new Q(null, objArr, 1);
            } else {
                p3.f.n(i7, objArr.length >> 1);
                int B7 = B.B(i7);
                if (i7 == 1) {
                    Objects.requireNonNull(objArr[0]);
                    Objects.requireNonNull(objArr[1]);
                } else {
                    int i9 = B7 - 1;
                    char c4 = 65535;
                    if (B7 <= 128) {
                        bArr = new byte[B7];
                        Arrays.fill(bArr, (byte) -1);
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < i7) {
                            int i12 = i10 * 2;
                            int i13 = i11 * 2;
                            Object obj2 = objArr[i12];
                            Objects.requireNonNull(obj2);
                            Object obj3 = objArr[i12 ^ i8];
                            Objects.requireNonNull(obj3);
                            int k7 = AbstractC0158p.k(obj2.hashCode());
                            while (true) {
                                int i14 = k7 & i9;
                                int i15 = bArr[i14] & 255;
                                if (i15 == 255) {
                                    bArr[i14] = (byte) i13;
                                    if (i11 < i10) {
                                        objArr[i13] = obj2;
                                        objArr[i13 ^ 1] = obj3;
                                    }
                                    i11++;
                                } else {
                                    if (obj2.equals(objArr[i15])) {
                                        int i16 = i15 ^ 1;
                                        Object obj4 = objArr[i16];
                                        Objects.requireNonNull(obj4);
                                        E3.A a4 = new E3.A(obj2, obj3, obj4);
                                        objArr[i16] = obj3;
                                        obj = a4;
                                        break;
                                    }
                                    k7 = i14 + 1;
                                }
                            }
                            i10++;
                            i8 = 1;
                        }
                        if (i11 != i7) {
                            sArr = new Object[]{bArr, Integer.valueOf(i11), obj};
                            obj = sArr;
                        }
                        obj = bArr;
                    } else {
                        if (B7 <= 32768) {
                            sArr = new short[B7];
                            Arrays.fill(sArr, (short) -1);
                            int i17 = 0;
                            for (int i18 = 0; i18 < i7; i18++) {
                                int i19 = i18 * 2;
                                int i20 = i17 * 2;
                                Object obj5 = objArr[i19];
                                Objects.requireNonNull(obj5);
                                Object obj6 = objArr[i19 ^ 1];
                                Objects.requireNonNull(obj6);
                                int k8 = AbstractC0158p.k(obj5.hashCode());
                                while (true) {
                                    int i21 = k8 & i9;
                                    int i22 = sArr[i21] & 65535;
                                    if (i22 == 65535) {
                                        sArr[i21] = (short) i20;
                                        if (i17 < i18) {
                                            objArr[i20] = obj5;
                                            objArr[i20 ^ 1] = obj6;
                                        }
                                        i17++;
                                    } else {
                                        if (obj5.equals(objArr[i22])) {
                                            int i23 = i22 ^ 1;
                                            Object obj7 = objArr[i23];
                                            Objects.requireNonNull(obj7);
                                            obj = new E3.A(obj5, obj6, obj7);
                                            objArr[i23] = obj6;
                                            break;
                                        }
                                        k8 = i21 + 1;
                                    }
                                }
                            }
                            if (i17 != i7) {
                                bArr = new Object[]{sArr, Integer.valueOf(i17), obj};
                                obj = bArr;
                            }
                        } else {
                            sArr = new int[B7];
                            Arrays.fill((int[]) sArr, -1);
                            int i24 = 0;
                            int i25 = 0;
                            while (i24 < i7) {
                                int i26 = i24 * 2;
                                int i27 = i25 * 2;
                                Object obj8 = objArr[i26];
                                Objects.requireNonNull(obj8);
                                Object obj9 = objArr[i26 ^ 1];
                                Objects.requireNonNull(obj9);
                                int k9 = AbstractC0158p.k(obj8.hashCode());
                                while (true) {
                                    int i28 = k9 & i9;
                                    ?? r15 = sArr[i28];
                                    if (r15 == c4) {
                                        sArr[i28] = i27;
                                        if (i25 < i24) {
                                            objArr[i27] = obj8;
                                            objArr[i27 ^ 1] = obj9;
                                        }
                                        i25++;
                                    } else {
                                        if (obj8.equals(objArr[r15])) {
                                            int i29 = r15 ^ 1;
                                            Object obj10 = objArr[i29];
                                            Objects.requireNonNull(obj10);
                                            obj = new E3.A(obj8, obj9, obj10);
                                            objArr[i29] = obj9;
                                            break;
                                        }
                                        k9 = i28 + 1;
                                        c4 = 65535;
                                    }
                                }
                                i24++;
                                c4 = 65535;
                            }
                            if (i25 != i7) {
                                c3 = 2;
                                obj = new Object[]{sArr, Integer.valueOf(i25), obj};
                                z4 = obj instanceof Object[];
                                Object obj11 = obj;
                                if (z4) {
                                    Object[] objArr2 = (Object[]) obj;
                                    this.f1016d = (E3.A) objArr2[c3];
                                    Object obj12 = objArr2[0];
                                    int intValue = ((Integer) objArr2[1]).intValue();
                                    objArr = Arrays.copyOf(objArr, intValue * 2);
                                    obj11 = obj12;
                                    i7 = intValue;
                                }
                                q7 = new Q(obj11, objArr, i7);
                            }
                        }
                        obj = sArr;
                    }
                }
                c3 = 2;
                z4 = obj instanceof Object[];
                Object obj112 = obj;
                if (z4) {
                }
                q7 = new Q(obj112, objArr, i7);
            }
        }
        E3.A a7 = (E3.A) this.f1016d;
        if (a7 == null) {
            return q7;
        }
        throw a7.a();
    }

    public B3.g j(C1274k c1274k) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C1473g c1473g = c1274k.f14005b;
        Comparable comparable = null;
        hashMap.put("key", c1473g.A() != null ? c1473g.A().f17173a : null);
        C1450e c1450e = c1274k.f14004a;
        hashMap.put("value", ((r) c1450e.f15308b).g(c1473g).getValue());
        hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, hashMap);
        hashMap2.put("transactionKey", Integer.valueOf(this.f1014b));
        boolean z4 = false;
        try {
            P2 p22 = new P2((A5.s) this.f1015c);
            new Handler(Looper.getMainLooper()).post(new A0.f(16, p22, hashMap2));
            Object await = Tasks.await(((TaskCompletionSource) p22.f17508b).getTask());
            Objects.requireNonNull(await);
            Map map = (Map) await;
            Object obj = map.get("aborted");
            Objects.requireNonNull(obj);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = map.get(SentryEvent.JsonKeys.EXCEPTION);
            Objects.requireNonNull(obj2);
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            if (!booleanValue && !booleanValue2) {
                Object obj3 = map.get("value");
                new I(c1473g).g(obj3);
                Object a2 = AbstractC1575b.a(obj3);
                q4.l.e(a2);
                c1450e.f15308b = ((r) c1450e.f15308b).q(c1473g, AbstractC1539a.a(a2, v4.j.f17184e));
                return new B3.g(true, ((r) c1450e.f15308b).g(c1473g), 7);
            }
            return new B3.g(z4, comparable, 7);
        } catch (Exception e7) {
            Log.e("firebase_database", "An unexpected exception occurred for a transaction.", e7);
            return new B3.g(z4, comparable, 7);
        }
    }

    public Object k(int i7) {
        SparseArray sparseArray;
        if (this.f1014b == -1) {
            this.f1014b = 0;
        }
        while (true) {
            int i8 = this.f1014b;
            sparseArray = (SparseArray) this.f1015c;
            if (i8 <= 0 || i7 >= sparseArray.keyAt(i8)) {
                break;
            }
            this.f1014b--;
        }
        while (this.f1014b < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f1014b + 1)) {
            this.f1014b++;
        }
        return sparseArray.valueAt(this.f1014b);
    }

    public void l(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1015c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1174a.f13329g;
        C1726n0 F7 = C1726n0.F(context, attributeSet, iArr, i7);
        U.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) F7.f17806c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC1464a.w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0637f0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                V.f.c(imageView, F7.q(2));
            }
            if (typedArray.hasValue(3)) {
                V.f.d(imageView, AbstractC0637f0.c(typedArray.getInt(3, -1), null));
            }
            F7.H();
        } catch (Throwable th) {
            F7.H();
            throw th;
        }
    }

    public void m(C1266c c1266c, boolean z4, C1265b c1265b) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1016d;
        if (c1266c != null) {
            taskCompletionSource.setException(G5.e.a(c1266c));
            return;
        }
        if (c1265b != null) {
            u1.c cVar = new u1.c(c1265b);
            HashMap hashMap = new HashMap();
            hashMap.put("committed", Boolean.valueOf(z4));
            HashMap hashMap2 = (HashMap) cVar.f16591b;
            HashMap hashMap3 = new HashMap();
            cVar.f16591b = hashMap3;
            hashMap3.putAll(hashMap2);
            ((HashMap) cVar.f16591b).putAll(hashMap);
            taskCompletionSource.setResult((HashMap) cVar.f16591b);
        }
    }

    public void o(Object obj, Object obj2) {
        int i7 = (this.f1014b + 1) * 2;
        Object[] objArr = (Object[]) this.f1015c;
        if (i7 > objArr.length) {
            this.f1015c = Arrays.copyOf(objArr, C0164w.e(objArr.length, i7));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.f1015c;
        int i8 = this.f1014b;
        int i9 = i8 * 2;
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        this.f1014b = i8 + 1;
    }

    public C0011c p() {
        return new C0011c(this, H4.j.f3322c, false, 2);
    }

    @Override // w1.Y0
    public void s(Object obj, OutputStream outputStream) {
        Z0 z02 = (Z0) this.f1015c;
        D d7 = new D(outputStream, 4);
        d7.writeUTF((String) this.f1016d);
        int i7 = this.f1014b;
        d7.writeInt(i7);
        z02.g(i7).s(obj, d7);
        d7.flush();
    }

    @Override // i5.g
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f1014b);
        this.f1015c = handlerThread;
        handlerThread.start();
        this.f1016d = new Handler(((HandlerThread) this.f1015c).getLooper());
    }

    public String toString() {
        switch (this.f1013a) {
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append(((Y5.k) this.f1015c) == Y5.k.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f1014b);
                String str = (String) this.f1016d;
                if (str != null) {
                    sb.append(' ');
                    sb.append(str);
                }
                return sb.toString();
            case 9:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f1016d);
                sb2.append("://");
                int i7 = -1;
                if (((String) this.f1015c).indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append((String) this.f1015c);
                    sb2.append(']');
                } else {
                    sb2.append((String) this.f1015c);
                }
                int i8 = this.f1014b;
                if (i8 == -1) {
                    String str2 = (String) this.f1016d;
                    i8 = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
                }
                String str3 = (String) this.f1016d;
                if (str3.equals("http")) {
                    i7 = 80;
                } else if (str3.equals("https")) {
                    i7 = 443;
                }
                if (i8 != i7) {
                    sb2.append(':');
                    sb2.append(i8);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(Object obj, int i7, String str, int i8) {
        this.f1013a = i8;
        this.f1015c = obj;
        this.f1014b = i7;
        this.f1016d = str;
    }

    public m(Context context) {
        this.f1013a = 1;
        this.f1015c = new ArrayList();
        this.f1014b = 0;
        this.f1016d = context.getApplicationContext();
    }

    public m(A5.s sVar, int i7) {
        this.f1013a = 5;
        this.f1015c = sVar;
        this.f1014b = i7;
        this.f1016d = new TaskCompletionSource();
    }

    public m(ImageView imageView) {
        this.f1013a = 10;
        this.f1014b = 0;
        this.f1015c = imageView;
    }

    public m(M m7) {
        this.f1013a = 11;
        this.f1015c = new SparseArray();
        this.f1016d = m7;
        this.f1014b = -1;
    }

    public m(int i7, s sVar) {
        this.f1013a = 7;
        this.f1014b = i7;
        this.f1015c = sVar;
        this.f1016d = new C0095a(4, false);
    }

    public m(AbstractC0315b abstractC0315b, C0083b c0083b) {
        this.f1013a = 6;
        this.f1016d = abstractC0315b;
        this.f1014b = 0;
        this.f1015c = c0083b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(int i7, char c3) {
        this(new CopyOnWriteArrayList(), 0, (Object) null, 2);
        this.f1013a = i7;
        switch (i7) {
            case 9:
                break;
            default:
                break;
        }
    }

    public m(int i7, int i8) {
        this.f1013a = i8;
        switch (i8) {
            case 4:
                this.f1014b = i7;
                this.f1015c = new HashSet();
                this.f1016d = new ArrayList();
                break;
            case 12:
                this.f1014b = i7;
                break;
            default:
                this.f1015c = new Object[i7 * 2];
                this.f1014b = 0;
                break;
        }
    }
}
