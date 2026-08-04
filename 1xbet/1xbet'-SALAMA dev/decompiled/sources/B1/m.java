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
import androidx.appcompat.widget.AbstractC0616f0;
import androidx.appcompat.widget.C0644u;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
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
import p098n4.C0934g;
import p098n4.I;
import p151v2.s;
import p151v2.t;
import p155w1.C1017n0;
import p155w1.D;
import p155w1.E;
import p155w1.P2;
import p155w1.Y0;
import p155w1.Z0;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public final class m implements F1.e, p064i5.g, Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1016d;

    public /* synthetic */ m(Serializable serializable, int i7, Object obj, int i8) {
        this.f1013a = i8;
        this.f1016d = serializable;
        this.f1014b = i7;
        this.f1015c = obj;
    }

    public static m n(String str) throws ProtocolException {
        int i7;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        Y5.k kVar = Y5.k.HTTP_1_0;
        if (zStartsWith) {
            i7 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
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
            int i9 = Integer.parseInt(str.substring(i7, i8));
            if (str.length() <= i8) {
                strSubstring = "";
            } else {
                if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i7 + 4);
            }
            return new m((Object) kVar, i9, strSubstring, 8);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    @Override // F1.e
    public F1.d b(F1.h hVar, long j) {
        long j3 = hVar.f2534d;
        int iMin = (int) Math.min(112800, hVar.f2533c - j3);
        C0095a c0095a = (C0095a) this.f1016d;
        c0095a.A(iMin);
        hVar.c((byte[]) c0095a.f1465c, 0, iMin, false);
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
            long jF = P6.b.F(c0095a, i8, this.f1014b);
            if (jF != -9223372036854775807L) {
                long jB = ((s) this.f1015c).b(jF);
                if (jB > j) {
                    return j9 == -9223372036854775807L ? new F1.d(-1, jB, j3) : new F1.d(0, -9223372036854775807L, j3 + j8);
                }
                if (100000 + jB > j) {
                    return new F1.d(0, -9223372036854775807L, j3 + ((long) i8));
                }
                j8 = i8;
                j9 = jB;
            }
            c0095a.D(i9);
            j7 = i9;
        }
        return j9 != -9223372036854775807L ? new F1.d(-2, j9, j3 + j7) : F1.d.f2514d;
    }

    @Override // p064i5.g
    public void c(p064i5.e eVar) {
        ((Handler) this.f1016d).post(eVar.f14033b);
    }

    @Override // p064i5.g
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
            AbstractC0616f0.a(drawable);
        }
        if (drawable == null || (a2 = (A) this.f1016d) == null) {
            return;
        }
        C0644u.d(drawable, a2, imageView.getDrawableState());
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
        byte[] bArr = t.f17164f;
        C0095a c0095a = (C0095a) this.f1016d;
        c0095a.getClass();
        c0095a.B(bArr.length, bArr);
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) throws IOException {
        Z0 z4 = (Z0) this.f1015c;
        E e7 = new E(inputStream, 4);
        String utf = e7.readUTF();
        if (((String) this.f1016d).equals(utf)) {
            return z4.g(e7.readInt()).h(e7);
        }
        throw new IOException(AbstractC0486a1.h("Signature: ", utf, " is invalid"));
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    public Q i() {
        short[] sArr;
        char c3;
        ?? r7;
        byte[] bArr;
        boolean z4;
        ?? r8;
        Q q7;
        E3.A a2 = (E3.A) this.f1016d;
        if (a2 != null) {
            throw a2.a();
        }
        int i7 = this.f1014b;
        Object[] objArrCopyOf = (Object[]) this.f1015c;
        if (i7 == 0) {
            q7 = Q.f2012x;
        } else {
            int i8 = 1;
            E3.A a4 = null;
            ?? r9 = 0;
            E3.A a7 = null;
            E3.A a8 = null;
            if (i7 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                q7 = new Q(null, objArrCopyOf, 1);
            } else {
                p113p3.f.n(i7, objArrCopyOf.length >> 1);
                int iB = B.B(i7);
                if (i7 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                } else {
                    int i9 = iB - 1;
                    byte b7 = -1;
                    if (iB <= 128) {
                        bArr = new byte[iB];
                        Arrays.fill(bArr, (byte) -1);
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < i7) {
                            int i12 = i10 * 2;
                            int i13 = i11 * 2;
                            Object obj = objArrCopyOf[i12];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i12 ^ i8];
                            Objects.requireNonNull(obj2);
                            int iK = AbstractC0158p.k(obj.hashCode());
                            while (true) {
                                int i14 = iK & i9;
                                int i15 = bArr[i14] & 255;
                                if (i15 == 255) {
                                    bArr[i14] = (byte) i13;
                                    if (i11 < i10) {
                                        objArrCopyOf[i13] = obj;
                                        objArrCopyOf[i13 ^ 1] = obj2;
                                    }
                                    i11++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i15 == true ? 1 : 0])) {
                                    int i16 = ~i15;
                                    Object obj3 = objArrCopyOf[i16 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    E3.A a9 = new E3.A(obj, obj2, obj3);
                                    objArrCopyOf[i16 == true ? 1 : 0] = obj2;
                                    a7 = a9;
                                    break;
                                }
                                iK = i14 + 1;
                            }
                            i10++;
                            i8 = 1;
                        }
                        if (i11 == i7) {
                            r9 = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i11), a7};
                            r9 = sArr;
                        }
                    } else {
                        if (iB <= 32768) {
                            sArr = new short[iB];
                            Arrays.fill(sArr, (short) -1);
                            int i17 = 0;
                            for (int i18 = 0; i18 < i7; i18++) {
                                int i19 = i18 * 2;
                                int i20 = i17 * 2;
                                Object obj4 = objArrCopyOf[i19];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i19 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iK2 = AbstractC0158p.k(obj4.hashCode());
                                while (true) {
                                    int i21 = iK2 & i9;
                                    int i22 = sArr[i21] & 65535;
                                    if (i22 == 65535) {
                                        sArr[i21] = (short) i20;
                                        if (i17 < i18) {
                                            objArrCopyOf[i20] = obj4;
                                            objArrCopyOf[i20 ^ 1] = obj5;
                                        }
                                        i17++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i22 == true ? 1 : 0])) {
                                        int i23 = ~i22;
                                        Object obj6 = objArrCopyOf[i23 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        a8 = new E3.A(obj4, obj5, obj6);
                                        objArrCopyOf[i23 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iK2 = i21 + 1;
                                }
                            }
                            if (i17 != i7) {
                                bArr = new Object[]{sArr, Integer.valueOf(i17), a8};
                                r9 = bArr;
                            }
                        } else {
                            sArr = new int[iB];
                            Arrays.fill((int[]) sArr, -1);
                            int i24 = 0;
                            int i25 = 0;
                            while (i24 < i7) {
                                int i26 = i24 * 2;
                                int i27 = i25 * 2;
                                Object obj7 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i26 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iK3 = AbstractC0158p.k(obj7.hashCode());
                                while (true) {
                                    int i28 = iK3 & i9;
                                    ?? r15 = sArr[i28];
                                    if (r15 == b7) {
                                        sArr[i28] = i27;
                                        if (i25 < i24) {
                                            objArrCopyOf[i27] = obj7;
                                            objArrCopyOf[i27 ^ 1] = obj8;
                                        }
                                        i25++;
                                        break;
                                    }
                                    if (obj7.equals(objArrCopyOf[r15])) {
                                        int i29 = r15 ^ 1;
                                        Object obj9 = objArrCopyOf[i29 == true ? 1 : 0];
                                        Objects.requireNonNull(obj9);
                                        a4 = new E3.A(obj7, obj8, obj9);
                                        objArrCopyOf[i29 == true ? 1 : 0] = obj8;
                                        break;
                                    }
                                    iK3 = i28 + 1;
                                    b7 = -1;
                                }
                                i24++;
                                b7 = -1;
                            }
                            if (i25 != i7) {
                                c3 = 2;
                                r7 = new Object[]{sArr, Integer.valueOf(i25), a4};
                            }
                        }
                        r9 = sArr;
                    }
                    z4 = r7 instanceof Object[];
                    r8 = r7;
                    if (z4) {
                        Object[] objArr = (Object[]) r7;
                        this.f1016d = (E3.A) objArr[c3];
                        Object obj10 = objArr[0];
                        int iIntValue = ((Integer) objArr[1]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r8 = obj10;
                        i7 = iIntValue;
                    }
                    q7 = new Q(r8, objArrCopyOf, i7);
                }
                c3 = 2;
                r7 = r9;
                z4 = r7 instanceof Object[];
                r8 = r7;
                if (z4) {
                    Object[] objArr2 = (Object[]) r7;
                    this.f1016d = (E3.A) objArr2[c3];
                    Object obj11 = objArr2[0];
                    int iIntValue2 = ((Integer) objArr2[1]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r8 = obj11;
                    i7 = iIntValue2;
                }
                q7 = new Q(r8, objArrCopyOf, i7);
            }
        }
        E3.A a10 = (E3.A) this.f1016d;
        if (a10 == null) {
            return q7;
        }
        throw a10.a();
    }

    public B3.g j(p063i4.k kVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C0934g c0934g = kVar.f14011b;
        Comparable comparable = null;
        map.put("key", c0934g.A() != null ? c0934g.A().f17179a : null);
        p096n1.e eVar = kVar.f14010a;
        map.put("value", ((r) eVar.f15314b).g(c0934g).getValue());
        map2.put(SentryStackTrace.JsonKeys.SNAPSHOT, map);
        map2.put("transactionKey", Integer.valueOf(this.f1014b));
        boolean z4 = false;
        try {
            P2 p5 = new P2((A5.s) this.f1015c);
            new Handler(Looper.getMainLooper()).post(new A0.f(16, p5, map2));
            Object objAwait = Tasks.await(((TaskCompletionSource) p5.f17514b).getTask());
            Objects.requireNonNull(objAwait);
            Map map3 = (Map) objAwait;
            Object obj = map3.get("aborted");
            Objects.requireNonNull(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = map3.get(SentryEvent.JsonKeys.EXCEPTION);
            Objects.requireNonNull(obj2);
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            if (!zBooleanValue && !zBooleanValue2) {
                Object obj3 = map3.get("value");
                new I(c0934g).g(obj3);
                Object objA = p127r4.b.a(obj3);
                p120q4.l.e(objA);
                eVar.f15314b = ((r) eVar.f15314b).q(c0934g, p115p6.a.a(objA, v4.j.f17190e));
                return new B3.g(true, ((r) eVar.f15314b).g(c0934g), 7);
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
        int[] iArr = p051h.a.f13335g;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        U.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = p097n3.a.w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0616f0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                V.f.c(imageView, c1017n0F.q(2));
            }
            if (typedArray.hasValue(3)) {
                V.f.d(imageView, AbstractC0616f0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            c1017n0F.H();
        }
    }

    public void m(p063i4.c cVar, boolean z4, p063i4.b bVar) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1016d;
        if (cVar != null) {
            taskCompletionSource.setException(G5.e.a(cVar));
            return;
        }
        if (bVar != null) {
            p145u1.c cVar2 = new p145u1.c(bVar);
            HashMap map = new HashMap();
            map.put("committed", Boolean.valueOf(z4));
            HashMap map2 = (HashMap) cVar2.f16597b;
            HashMap map3 = new HashMap();
            cVar2.f16597b = map3;
            map3.putAll(map2);
            ((HashMap) cVar2.f16597b).putAll(map);
            taskCompletionSource.setResult((HashMap) cVar2.f16597b);
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

    @Override // p155w1.Y0
    public void s(Object obj, OutputStream outputStream) throws IOException {
        Z0 z4 = (Z0) this.f1015c;
        D d7 = new D(outputStream, 4);
        d7.writeUTF((String) this.f1016d);
        int i7 = this.f1014b;
        d7.writeInt(i7);
        z4.g(i7).s(obj, d7);
        d7.flush();
    }

    @Override // p064i5.g
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
                    if (str2.equals("http")) {
                        i8 = 80;
                    } else {
                        i8 = str2.equals("https") ? 443 : -1;
                    }
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
