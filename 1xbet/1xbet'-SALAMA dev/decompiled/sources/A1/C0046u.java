package A1;

import E3.AbstractC0167z;
import E3.C0165x;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.logger.LoggerBatchProcessor;
import java.util.ArrayList;
import p155w1.P2;

/* JADX INFO: renamed from: A1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0046u implements D3.q, D3.g, p151v2.e, InterfaceC0025j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a;

    public /* synthetic */ C0046u(int i7) {
        this.f566a = i7;
    }

    @Override // D3.g
    public Object apply(Object obj) {
        return new B1.h((p151v2.p) obj);
    }

    @Override // A1.InterfaceC0025j
    public InterfaceC0027k d(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        InterfaceC0027k y4;
        int i7;
        C0014d0 c0014d0;
        E3.L lO;
        boolean z4 = false;
        boolean z7 = true;
        z7 = true;
        switch (this.f566a) {
            case 5:
                Format$Builder format$Builder = new Format$Builder();
                if (bundle != null) {
                    ClassLoader classLoader = p151v2.a.class.getClassLoader();
                    int i8 = p151v2.t.f17159a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                X x4 = X.f279X;
                String str = x4.f304a;
                if (string == null) {
                    string = str;
                }
                format$Builder.f10528a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = x4.f305b;
                }
                format$Builder.f10529b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = x4.f306c;
                }
                format$Builder.f10530c = string3;
                format$Builder.f10531d = bundle.getInt(Integer.toString(3, 36), x4.f307d);
                format$Builder.f10532e = bundle.getInt(Integer.toString(4, 36), x4.f308e);
                format$Builder.f10533f = bundle.getInt(Integer.toString(5, 36), x4.f309f);
                format$Builder.f10534g = bundle.getInt(Integer.toString(6, 36), x4.f310x);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = x4.f312z;
                }
                format$Builder.f10535h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(Integer.toString(8, 36));
                if (metadata == null) {
                    metadata = x4.f281A;
                }
                format$Builder.f10536i = metadata;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = x4.f282B;
                }
                format$Builder.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = x4.f283C;
                }
                format$Builder.f10537k = string6;
                format$Builder.f10538l = bundle.getInt(Integer.toString(11, 36), x4.f284D);
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i9, 36));
                    if (byteArray == null) {
                        format$Builder.f10539m = arrayList;
                        format$Builder.f10540n = (DrmInitData) bundle.getParcelable(Integer.toString(13, 36));
                        format$Builder.f10541o = bundle.getLong(Integer.toString(14, 36), x4.f287G);
                        format$Builder.f10542p = bundle.getInt(Integer.toString(15, 36), x4.f288H);
                        format$Builder.f10543q = bundle.getInt(Integer.toString(16, 36), x4.f289I);
                        format$Builder.f10544r = bundle.getFloat(Integer.toString(17, 36), x4.f290J);
                        format$Builder.f10545s = bundle.getInt(Integer.toString(18, 36), x4.f291K);
                        format$Builder.f10546t = bundle.getFloat(Integer.toString(19, 36), x4.f292L);
                        format$Builder.f10547u = bundle.getByteArray(Integer.toString(20, 36));
                        format$Builder.f10548v = bundle.getInt(Integer.toString(21, 36), x4.f294N);
                        Bundle bundle4 = bundle.getBundle(Integer.toString(22, 36));
                        if (bundle4 != null) {
                            format$Builder.f10549w = new p156w2.b(bundle4.getInt(Integer.toString(0, 36), -1), bundle4.getByteArray(Integer.toString(3, 36)), bundle4.getInt(Integer.toString(1, 36), -1), bundle4.getInt(Integer.toString(2, 36), -1));
                        }
                        format$Builder.f10550x = bundle.getInt(Integer.toString(23, 36), x4.f296P);
                        format$Builder.f10551y = bundle.getInt(Integer.toString(24, 36), x4.f297Q);
                        format$Builder.f10552z = bundle.getInt(Integer.toString(25, 36), x4.f298R);
                        format$Builder.f10524A = bundle.getInt(Integer.toString(26, 36), x4.f299S);
                        format$Builder.f10525B = bundle.getInt(Integer.toString(27, 36), x4.f300T);
                        format$Builder.f10526C = bundle.getInt(Integer.toString(28, 36), x4.f301U);
                        format$Builder.f10527D = bundle.getInt(Integer.toString(29, 36), x4.f302V);
                        return new X(format$Builder);
                    }
                    arrayList.add(byteArray);
                    i9++;
                }
                break;
            case 6:
                p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new Y(bundle.getBoolean(Integer.toString(2, 36), false)) : new Y();
            case 7:
                String string7 = bundle.getString(Integer.toString(0, 36), "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(Integer.toString(1, 36));
                C0014d0 c0014d1 = bundle5 == null ? C0014d0.f336f : new C0014d0(bundle5.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle5.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle5.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                Bundle bundle6 = bundle.getBundle(Integer.toString(2, 36));
                C0026j0 c0026j0 = bundle6 == null ? C0026j0.f414X : (C0026j0) C0026j0.f415Y.d(bundle6);
                Bundle bundle7 = bundle.getBundle(Integer.toString(3, 36));
                C0012c0 c0012c0 = bundle7 == null ? C0012c0.f335x : (C0012c0) AbstractC0010b0.f325f.d(bundle7);
                Bundle bundle8 = bundle.getBundle(Integer.toString(4, 36));
                return new C0022h0(string7, c0012c0, null, c0014d1, c0026j0, bundle8 == null ? C0018f0.f352c : (C0018f0) C0018f0.f353d.d(bundle8));
            case 8:
                C0008a0 c0008a0 = new C0008a0();
                long j = bundle.getLong(Integer.toString(0, 36), 0L);
                p151v2.a.f(j >= 0);
                c0008a0.f317a = j;
                long j3 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j3 != Long.MIN_VALUE && j3 < 0) {
                    z7 = false;
                }
                p151v2.a.f(z7);
                c0008a0.f318b = j3;
                c0008a0.f319c = bundle.getBoolean(Integer.toString(2, 36), false);
                c0008a0.f320d = bundle.getBoolean(Integer.toString(3, 36), false);
                c0008a0.f321e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new C0012c0(c0008a0);
            case 9:
                return new C0014d0(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
            case 10:
                P2 p5 = new P2(z7 ? 1 : 0, z4 ? (char) 1 : (char) 0);
                p5.f17514b = (Uri) bundle.getParcelable(Integer.toString(0, 36));
                p5.f17515c = bundle.getString(Integer.toString(1, 36));
                bundle.getBundle(Integer.toString(2, 36));
                return new C0018f0(p5);
            case 11:
                C0024i0 c0024i0 = new C0024i0();
                c0024i0.f389a = bundle.getCharSequence(Integer.toString(0, 36));
                c0024i0.f390b = bundle.getCharSequence(Integer.toString(1, 36));
                c0024i0.f391c = bundle.getCharSequence(Integer.toString(2, 36));
                c0024i0.f392d = bundle.getCharSequence(Integer.toString(3, 36));
                c0024i0.f393e = bundle.getCharSequence(Integer.toString(4, 36));
                c0024i0.f394f = bundle.getCharSequence(Integer.toString(5, 36));
                c0024i0.f395g = bundle.getCharSequence(Integer.toString(6, 36));
                byte[] byteArray2 = bundle.getByteArray(Integer.toString(10, 36));
                Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
                c0024i0.j = byteArray2 == null ? null : (byte[]) byteArray2.clone();
                c0024i0.f398k = numValueOf;
                c0024i0.f399l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
                c0024i0.f410w = bundle.getCharSequence(Integer.toString(22, 36));
                c0024i0.f411x = bundle.getCharSequence(Integer.toString(23, 36));
                c0024i0.f412y = bundle.getCharSequence(Integer.toString(24, 36));
                c0024i0.f385B = bundle.getCharSequence(Integer.toString(27, 36));
                c0024i0.f386C = bundle.getCharSequence(Integer.toString(28, 36));
                c0024i0.f387D = bundle.getCharSequence(Integer.toString(30, 36));
                c0024i0.f388E = bundle.getBundle(Integer.toString(zzbbd.zzq.zzf, 36));
                boolean zContainsKey = bundle.containsKey(Integer.toString(8, 36));
                C0046u c0046u = F0.f95a;
                if (zContainsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
                    c0024i0.f396h = (F0) c0046u.d(bundle3);
                }
                if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
                    c0024i0.f397i = (F0) c0046u.d(bundle2);
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    c0024i0.f400m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    c0024i0.f401n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
                }
                if (bundle.containsKey(Integer.toString(14, 36))) {
                    c0024i0.f402o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    c0024i0.f403p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    c0024i0.f404q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
                }
                if (bundle.containsKey(Integer.toString(17, 36))) {
                    c0024i0.f405r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
                }
                if (bundle.containsKey(Integer.toString(18, 36))) {
                    c0024i0.f406s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
                }
                if (bundle.containsKey(Integer.toString(19, 36))) {
                    c0024i0.f407t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
                }
                if (bundle.containsKey(Integer.toString(20, 36))) {
                    c0024i0.f408u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
                }
                if (bundle.containsKey(Integer.toString(21, 36))) {
                    c0024i0.f409v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
                }
                if (bundle.containsKey(Integer.toString(25, 36))) {
                    c0024i0.f413z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
                }
                if (bundle.containsKey(Integer.toString(26, 36))) {
                    c0024i0.f384A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
                }
                return new C0026j0(c0024i0);
            case 12:
                p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                float f7 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                return f7 == -1.0f ? new u0() : new u0(f7);
            case 13:
                int i10 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i10 == 0) {
                    p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                    if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                        return new Y(bundle.getBoolean(Integer.toString(2, 36), false));
                    }
                    y4 = new Y();
                } else if (i10 == 1) {
                    p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                    float f8 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    if (f8 != -1.0f) {
                        return new u0(f8);
                    }
                    y4 = new u0();
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalArgumentException(p031e1.k.d(i10, "Unknown RatingType: "));
                        }
                        p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                        return bundle.getBoolean(Integer.toString(1, 36), false) ? new N0(bundle.getBoolean(Integer.toString(2, 36), false)) : new N0();
                    }
                    p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                    int i11 = bundle.getInt(Integer.toString(1, 36), 5);
                    float f9 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                    if (f9 != -1.0f) {
                        return new I0(i11, f9);
                    }
                    y4 = new I0(i11);
                }
                return y4;
            case 14:
                p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                int i12 = bundle.getInt(Integer.toString(1, 36), 5);
                float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f10 == -1.0f ? new I0(i12) : new I0(i12, f10);
            case 15:
                p151v2.a.f(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new N0(bundle.getBoolean(Integer.toString(2, 36), false)) : new N0();
            case 16:
                int i13 = bundle.getInt(Integer.toString(0, 36), 0);
                long j7 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j8 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z8 = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle9 = bundle.getBundle(Integer.toString(4, 36));
                p024d2.b bVar = bundle9 != null ? (p024d2.b) p024d2.b.f12389y.d(bundle9) : p024d2.b.f12387f;
                P0 p7 = new P0();
                p7.h(null, null, i13, j7, j8, bVar, z8);
                return p7;
            case 17:
                Bundle bundle10 = bundle.getBundle(Integer.toString(1, 36));
                C0022h0 c0022h0 = bundle10 != null ? (C0022h0) C0022h0.f365x.d(bundle10) : null;
                long j9 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j10 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j11 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z9 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z10 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle11 = bundle.getBundle(Integer.toString(7, 36));
                if (bundle11 != null) {
                    c0014d0 = new C0014d0(bundle11.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle11.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle11.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle11.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle11.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                    i7 = 8;
                } else {
                    i7 = 8;
                    c0014d0 = null;
                }
                boolean z11 = bundle.getBoolean(Integer.toString(i7, 36), false);
                long j12 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j13 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i14 = bundle.getInt(Integer.toString(11, 36), 0);
                int i15 = bundle.getInt(Integer.toString(12, 36), 0);
                long j14 = bundle.getLong(Integer.toString(13, 36), 0L);
                Q0 q1 = new Q0();
                q1.b(Q0.f201J, c0022h0, null, j9, j10, j11, z9, z10, c0014d0, j12, j13, i14, i15, j14);
                q1.f205C = z11;
                return q1;
            default:
                Bundle bundle12 = bundle.getBundle(Integer.toString(0, 36));
                bundle12.getClass();
                ArrayList parcelableArrayList = bundle12.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    C0165x c0165x = AbstractC0167z.f2083b;
                    lO = E3.L.f2000e;
                } else {
                    lO = p151v2.a.o(X.f280Y, parcelableArrayList);
                }
                p018c2.e0 e0Var = new p018c2.e0(bundle12.getString(Integer.toString(1, 36), ""), (X[]) lO.toArray(new X[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i16 = e0Var.f10341a;
                int[] iArr = new int[i16];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i16];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new S0(e0Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }
    }

    @Override // D3.q
    public Object get() {
        return new C0033n(new p146u2.r(), 50000, 50000, 2500, LoggerBatchProcessor.FLUSH_AFTER_MS, -1, false, 0);
    }

    @Override // p151v2.e
    public void invoke(Object obj) {
        switch (this.f566a) {
            case 2:
                ((z0) obj).g();
                break;
            case 3:
                ((z0) obj).s(new r(2, new W("Player release timed out."), 1003));
                break;
            case 4:
                ((z0) obj).getClass();
                break;
            case 19:
                ((B1.b) obj).getClass();
                break;
            case 20:
                ((B1.b) obj).getClass();
                break;
            case zzbbd.zzt.zzm /* 21 */:
                ((B1.b) obj).getClass();
                break;
            case 22:
                ((B1.b) obj).getClass();
                break;
            case 23:
                ((B1.b) obj).getClass();
                break;
            case 24:
                ((B1.b) obj).getClass();
                break;
            case 25:
                ((B1.b) obj).getClass();
                break;
            case 26:
                ((B1.b) obj).getClass();
                break;
            case 27:
                ((B1.b) obj).getClass();
                break;
            case 28:
                ((B1.b) obj).getClass();
                break;
            default:
                ((B1.b) obj).getClass();
                break;
        }
    }
}
