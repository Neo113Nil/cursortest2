package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5362h;
import androidx.datastore.preferences.protobuf.C5378y;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import g.C6594f;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class U<T> implements f0<T> {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f42477p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    private static final Unsafe f42478q = p0.t();

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f42479r = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f42480a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f42481b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42482c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42483d;

    /* renamed from: e, reason: collision with root package name */
    private final Q f42484e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f42485f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f42486g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f42487h;

    /* renamed from: i, reason: collision with root package name */
    private final int f42488i;

    /* renamed from: j, reason: collision with root package name */
    private final int f42489j;

    /* renamed from: k, reason: collision with root package name */
    private final W f42490k;

    /* renamed from: l, reason: collision with root package name */
    private final E f42491l;

    /* renamed from: m, reason: collision with root package name */
    private final m0<?, ?> f42492m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC5370p<?> f42493n;

    /* renamed from: o, reason: collision with root package name */
    private final L f42494o;

    private U(int[] iArr, Object[] objArr, int i11, int i12, Q q11, int[] iArr2, int i13, int i14, W w11, E e11, m0 m0Var, AbstractC5370p abstractC5370p, L l11) {
        this.f42480a = iArr;
        this.f42481b = objArr;
        this.f42482c = i11;
        this.f42483d = i12;
        this.f42486g = q11 instanceof AbstractC5376w;
        this.f42485f = abstractC5370p != null && abstractC5370p.e(q11);
        this.f42487h = iArr2;
        this.f42488i = i13;
        this.f42489j = i14;
        this.f42490k = w11;
        this.f42491l = e11;
        this.f42492m = m0Var;
        this.f42493n = abstractC5370p;
        this.f42484e = q11;
        this.f42494o = l11;
    }

    private void A(Object obj, int i11, C5364j c5364j, f0 f0Var, C5369o c5369o) throws IOException {
        c5364j.C(this.f42491l.a(i11 & 1048575, obj), f0Var, c5369o);
    }

    private void B(int i11, C5364j c5364j, Object obj) throws IOException {
        if ((536870912 & i11) != 0) {
            p0.E(obj, i11 & 1048575, c5364j.N());
        } else if (this.f42486g) {
            p0.E(obj, i11 & 1048575, c5364j.L());
        } else {
            p0.E(obj, i11 & 1048575, c5364j.j());
        }
    }

    private void C(int i11, C5364j c5364j, Object obj) throws IOException {
        boolean z11 = (536870912 & i11) != 0;
        E e11 = this.f42491l;
        if (z11) {
            c5364j.M(e11.a(i11 & 1048575, obj), true);
        } else {
            c5364j.M(e11.a(i11 & 1048575, obj), false);
        }
    }

    private static Field D(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder b11 = C6594f.b("Field ", str, " for ");
            b11.append(cls.getName());
            b11.append(" not found. Known fields are ");
            b11.append(Arrays.toString(declaredFields));
            throw new RuntimeException(b11.toString());
        }
    }

    private void E(T t2, int i11) {
        int i12 = this.f42480a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        p0.C(t2, j11, (1 << (i12 >>> 20)) | p0.q(t2, j11));
    }

    private void F(T t2, int i11, int i12) {
        p0.C(t2, this.f42480a[i12 + 2] & 1048575, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void G(Object obj, int i11, Q q11) {
        f42478q.putObject(obj, J(i11) & 1048575, q11);
        E(obj, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H(Object obj, int i11, int i12, Q q11) {
        f42478q.putObject(obj, J(i12) & 1048575, q11);
        F(obj, i11, i12);
    }

    private static int I(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    private int J(int i11) {
        return this.f42480a[i11 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void K(T t2, t0 t0Var) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        U<T> u11 = this;
        boolean z13 = u11.f42485f;
        AbstractC5370p<?> abstractC5370p = u11.f42493n;
        if (z13) {
            C5372s<?> c11 = abstractC5370p.c(t2);
            if (!c11.i()) {
                entry = c11.m().next();
                int[] iArr = u11.f42480a;
                length = iArr.length;
                Unsafe unsafe = f42478q;
                int i14 = 1048575;
                int i15 = 0;
                for (i11 = 0; i11 < length; i11 += 3) {
                    int J11 = u11.J(i11);
                    int i16 = iArr[i11];
                    int I11 = I(J11);
                    if (I11 <= 17) {
                        int i17 = iArr[i11 + 2];
                        z11 = true;
                        int i18 = i17 & 1048575;
                        if (i18 != i14) {
                            i15 = i18 == 1048575 ? 0 : unsafe.getInt(t2, i18);
                            i14 = i18;
                        }
                        i12 = J11;
                        i13 = 1 << (i17 >>> 20);
                    } else {
                        z11 = true;
                        i12 = J11;
                        i13 = 0;
                    }
                    if (entry != null) {
                        abstractC5370p.a(entry);
                        if (i16 >= 0) {
                            abstractC5370p.j(entry);
                            throw null;
                        }
                    }
                    long j11 = i12 & 1048575;
                    switch (I11) {
                        case 0:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).f(i16, p0.o(t2, j11));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).o(i16, p0.p(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 2:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).t(i16, unsafe.getLong(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 3:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).L(i16, unsafe.getLong(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 4:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).r(i16, unsafe.getInt(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 5:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).m(i16, unsafe.getLong(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 6:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).k(i16, unsafe.getInt(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 7:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).b(i16, p0.n(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 8:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                L(i16, unsafe.getObject(t2, j11), t0Var);
                            }
                            u11 = this;
                            break;
                        case 9:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).w(i16, unsafe.getObject(t2, j11), u11.j(i11));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).d(i16, (AbstractC5362h) unsafe.getObject(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 11:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).J(i16, unsafe.getInt(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 12:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).i(i16, unsafe.getInt(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 13:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).y(i16, unsafe.getInt(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 14:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).A(i16, unsafe.getLong(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 15:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).C(i16, unsafe.getInt(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 16:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).E(i16, unsafe.getLong(t2, j11));
                            }
                            u11 = this;
                            break;
                        case 17:
                            if (u11.l(t2, i11, i14, i15, i13)) {
                                ((C5366l) t0Var).q(i16, unsafe.getObject(t2, j11), u11.j(i11));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z12 = false;
                            g0.p(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 19:
                            z12 = false;
                            g0.t(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 20:
                            z12 = false;
                            g0.w(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 21:
                            z12 = false;
                            g0.D(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 22:
                            z12 = false;
                            g0.v(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 23:
                            z12 = false;
                            g0.s(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 24:
                            z12 = false;
                            g0.r(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            z12 = false;
                            g0.o(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            int i19 = iArr[i11];
                            List<String> list = (List) unsafe.getObject(t2, j11);
                            int i21 = g0.f42523d;
                            if (list != null && !list.isEmpty()) {
                                ((C5366l) t0Var).I(i19, list);
                            }
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            g0.x(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, u11.j(i11));
                            break;
                        case 28:
                            int i22 = iArr[i11];
                            List<AbstractC5362h> list2 = (List) unsafe.getObject(t2, j11);
                            int i23 = g0.f42523d;
                            if (list2 != null && !list2.isEmpty()) {
                                ((C5366l) t0Var).e(i22, list2);
                            }
                            break;
                        case 29:
                            z12 = false;
                            g0.C(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            z12 = false;
                            g0.q(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            z12 = false;
                            g0.y(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 32:
                            z12 = false;
                            g0.z(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 33:
                            z12 = false;
                            g0.A(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 34:
                            z12 = false;
                            g0.B(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            g0.p(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            g0.t(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            g0.w(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 38:
                            g0.D(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            g0.v(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 40:
                            g0.s(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 41:
                            g0.r(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 42:
                            g0.o(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 43:
                            g0.C(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            g0.q(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            g0.y(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 46:
                            g0.z(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 47:
                            g0.A(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 48:
                            g0.B(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 49:
                            g0.u(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, u11.j(i11));
                            break;
                        case 50:
                            Object object = unsafe.getObject(t2, j11);
                            if (object != null) {
                                Object i24 = u11.i(i11);
                                L l11 = u11.f42494o;
                                ((C5366l) t0Var).v(i16, l11.forMapMetadata(i24), l11.forMapData(object));
                            }
                            break;
                        case 51:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).f(i16, ((Double) p0.s(t2, j11)).doubleValue());
                            }
                            break;
                        case 52:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).o(i16, ((Float) p0.s(t2, j11)).floatValue());
                            }
                            break;
                        case 53:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).t(i16, x(t2, j11));
                            }
                            break;
                        case 54:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).L(i16, x(t2, j11));
                            }
                            break;
                        case 55:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).r(i16, w(t2, j11));
                            }
                            break;
                        case 56:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).m(i16, x(t2, j11));
                            }
                            break;
                        case 57:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).k(i16, w(t2, j11));
                            }
                            break;
                        case 58:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).b(i16, ((Boolean) p0.s(t2, j11)).booleanValue());
                            }
                            break;
                        case 59:
                            if (u11.n(t2, i16, i11)) {
                                L(i16, unsafe.getObject(t2, j11), t0Var);
                            }
                            break;
                        case 60:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).w(i16, unsafe.getObject(t2, j11), u11.j(i11));
                            }
                            break;
                        case 61:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).d(i16, (AbstractC5362h) unsafe.getObject(t2, j11));
                            }
                            break;
                        case 62:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).J(i16, w(t2, j11));
                            }
                            break;
                        case 63:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).i(i16, w(t2, j11));
                            }
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).y(i16, w(t2, j11));
                            }
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).A(i16, x(t2, j11));
                            }
                            break;
                        case 66:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).C(i16, w(t2, j11));
                            }
                            break;
                        case 67:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).E(i16, x(t2, j11));
                            }
                            break;
                        case 68:
                            if (u11.n(t2, i16, i11)) {
                                ((C5366l) t0Var).q(i16, unsafe.getObject(t2, j11), u11.j(i11));
                            }
                            break;
                    }
                }
                if (entry == null) {
                    abstractC5370p.j(entry);
                    throw null;
                }
                m0<?, ?> m0Var = u11.f42492m;
                m0Var.r(m0Var.g(t2), t0Var);
                return;
            }
        }
        entry = null;
        int[] iArr2 = u11.f42480a;
        length = iArr2.length;
        Unsafe unsafe2 = f42478q;
        int i142 = 1048575;
        int i152 = 0;
        while (i11 < length) {
        }
        if (entry == null) {
        }
    }

    private static void L(int i11, Object obj, t0 t0Var) throws IOException {
        if (obj instanceof String) {
            ((C5366l) t0Var).H(i11, (String) obj);
        } else {
            ((C5366l) t0Var).d(i11, (AbstractC5362h) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean f(AbstractC5376w abstractC5376w, AbstractC5376w abstractC5376w2, int i11) {
        return k(abstractC5376w, i11) == k(abstractC5376w2, i11);
    }

    private <UT, UB> UB g(Object obj, int i11, UB ub2, m0<UT, UB> m0Var, Object obj2) {
        C5378y.b h11;
        int i12 = this.f42480a[i11];
        Object s11 = p0.s(obj, J(i11) & 1048575);
        if (s11 == null || (h11 = h(i11)) == null) {
            return ub2;
        }
        L l11 = this.f42494o;
        K forMutableMapData = l11.forMutableMapData(s11);
        J.a<?, ?> forMapMetadata = l11.forMapMetadata(i(i11));
        Iterator it = forMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!h11.a()) {
                if (ub2 == null) {
                    ub2 = (UB) m0Var.f(obj2);
                }
                AbstractC5362h.e eVar = new AbstractC5362h.e(J.b(forMapMetadata, entry.getKey(), entry.getValue()));
                try {
                    J.e(eVar.b(), forMapMetadata, entry.getKey(), entry.getValue());
                    m0Var.d(ub2, i12, eVar.a());
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private C5378y.b h(int i11) {
        return (C5378y.b) this.f42481b[I1.w.a(i11, 3, 2, 1)];
    }

    private Object i(int i11) {
        return this.f42481b[(i11 / 3) * 2];
    }

    private f0 j(int i11) {
        int i12 = (i11 / 3) * 2;
        Object[] objArr = this.f42481b;
        f0 f0Var = (f0) objArr[i12];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> b11 = c0.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = b11;
        return b11;
    }

    private boolean k(T t2, int i11) {
        int i12 = this.f42480a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int J11 = J(i11);
            long j12 = J11 & 1048575;
            switch (I(J11)) {
                case 0:
                    if (Double.doubleToRawLongBits(p0.o(t2, j12)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(p0.p(t2, j12)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (p0.r(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (p0.r(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (p0.q(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (p0.r(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (p0.q(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return p0.n(t2, j12);
                case 8:
                    Object s11 = p0.s(t2, j12);
                    if (s11 instanceof String) {
                        return !((String) s11).isEmpty();
                    }
                    if (s11 instanceof AbstractC5362h) {
                        return !AbstractC5362h.f42524b.equals(s11);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (p0.s(t2, j12) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC5362h.f42524b.equals(p0.s(t2, j12));
                case 11:
                    if (p0.q(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (p0.q(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (p0.q(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (p0.r(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (p0.q(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (p0.r(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (p0.s(t2, j12) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((p0.q(t2, j11) & (1 << (i12 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean l(T t2, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? k(t2, i11) : (i13 & i14) != 0;
    }

    private static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5376w) {
            return ((AbstractC5376w) obj).n();
        }
        return true;
    }

    private boolean n(T t2, int i11, int i12) {
        return p0.q(t2, (long) (this.f42480a[i12 + 2] & 1048575)) == i11;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private void o(androidx.datastore.preferences.protobuf.m0 r19, androidx.datastore.preferences.protobuf.AbstractC5370p r20, java.lang.Object r21, androidx.datastore.preferences.protobuf.C5364j r22, androidx.datastore.preferences.protobuf.C5369o r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.U.o(androidx.datastore.preferences.protobuf.m0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.o):void");
    }

    private final void p(Object obj, int i11, Object obj2, C5369o c5369o, C5364j c5364j) throws IOException {
        long J11 = J(i11) & 1048575;
        Object s11 = p0.s(obj, J11);
        L l11 = this.f42494o;
        if (s11 == null) {
            s11 = l11.a();
            p0.E(obj, J11, s11);
        } else if (l11.isImmutable(s11)) {
            K a11 = l11.a();
            l11.mergeFrom(a11, s11);
            p0.E(obj, J11, a11);
            s11 = a11;
        }
        c5364j.B(l11.forMutableMapData(s11), l11.forMapMetadata(obj2), c5369o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void q(T t2, T t11, int i11) {
        if (k(t11, i11)) {
            long J11 = J(i11) & 1048575;
            Unsafe unsafe = f42478q;
            Object object = unsafe.getObject(t11, J11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f42480a[i11] + " is present but null: " + t11);
            }
            f0 j11 = j(i11);
            if (!k(t2, i11)) {
                if (m(object)) {
                    Object newInstance = j11.newInstance();
                    j11.mergeFrom(newInstance, object);
                    unsafe.putObject(t2, J11, newInstance);
                } else {
                    unsafe.putObject(t2, J11, object);
                }
                E(t2, i11);
                return;
            }
            Object object2 = unsafe.getObject(t2, J11);
            if (!m(object2)) {
                Object newInstance2 = j11.newInstance();
                j11.mergeFrom(newInstance2, object2);
                unsafe.putObject(t2, J11, newInstance2);
                object2 = newInstance2;
            }
            j11.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(T t2, T t11, int i11) {
        int[] iArr = this.f42480a;
        int i12 = iArr[i11];
        if (n(t11, i12, i11)) {
            long J11 = J(i11) & 1048575;
            Unsafe unsafe = f42478q;
            Object object = unsafe.getObject(t11, J11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + t11);
            }
            f0 j11 = j(i11);
            if (!n(t2, i12, i11)) {
                if (m(object)) {
                    Object newInstance = j11.newInstance();
                    j11.mergeFrom(newInstance, object);
                    unsafe.putObject(t2, J11, newInstance);
                } else {
                    unsafe.putObject(t2, J11, object);
                }
                F(t2, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(t2, J11);
            if (!m(object2)) {
                Object newInstance2 = j11.newInstance();
                j11.mergeFrom(newInstance2, object2);
                unsafe.putObject(t2, J11, newInstance2);
                object2 = newInstance2;
            }
            j11.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object s(T t2, int i11) {
        f0 j11 = j(i11);
        long J11 = J(i11) & 1048575;
        if (!k(t2, i11)) {
            return j11.newInstance();
        }
        Object object = f42478q.getObject(t2, J11);
        if (m(object)) {
            return object;
        }
        Object newInstance = j11.newInstance();
        if (object != null) {
            j11.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object t(T t2, int i11, int i12) {
        f0 j11 = j(i12);
        if (!n(t2, i11, i12)) {
            return j11.newInstance();
        }
        Object object = f42478q.getObject(t2, J(i12) & 1048575);
        if (m(object)) {
            return object;
        }
        Object newInstance = j11.newInstance();
        if (object != null) {
            j11.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> U<T> u(e0 e0Var, W w11, E e11, m0<?, ?> m0Var, AbstractC5370p<?> abstractC5370p, L l11) {
        int i11;
        int charAt;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        char charAt2;
        int i19;
        char charAt3;
        int i21;
        char charAt4;
        int i22;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        char charAt7;
        int i25;
        char charAt8;
        int i26;
        char charAt9;
        int i27;
        int i28;
        int[] iArr2;
        int i29;
        int i31;
        int objectFieldOffset;
        int i32;
        int i33;
        int i34;
        int i35;
        Field D11;
        char charAt10;
        int i36;
        int i37;
        Field D12;
        Field D13;
        int i38;
        char charAt11;
        int i39;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        int i43;
        char charAt14;
        String b11 = e0Var.b();
        int length = b11.length();
        int i44 = 55296;
        if (b11.charAt(0) >= 55296) {
            int i45 = 1;
            while (true) {
                i11 = i45 + 1;
                if (b11.charAt(i45) < 55296) {
                    break;
                }
                i45 = i11;
            }
        } else {
            i11 = 1;
        }
        int i46 = i11 + 1;
        int charAt15 = b11.charAt(i11);
        if (charAt15 >= 55296) {
            int i47 = charAt15 & 8191;
            int i48 = 13;
            while (true) {
                i43 = i46 + 1;
                charAt14 = b11.charAt(i46);
                if (charAt14 < 55296) {
                    break;
                }
                i47 |= (charAt14 & 8191) << i48;
                i48 += 13;
                i46 = i43;
            }
            charAt15 = i47 | (charAt14 << i48);
            i46 = i43;
        }
        if (charAt15 == 0) {
            i13 = 0;
            i16 = 0;
            charAt = 0;
            i12 = 0;
            i15 = 0;
            i17 = 0;
            iArr = f42477p;
            i14 = 0;
        } else {
            int i49 = i46 + 1;
            int charAt16 = b11.charAt(i46);
            if (charAt16 >= 55296) {
                int i51 = charAt16 & 8191;
                int i52 = 13;
                while (true) {
                    i26 = i49 + 1;
                    charAt9 = b11.charAt(i49);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i51 |= (charAt9 & 8191) << i52;
                    i52 += 13;
                    i49 = i26;
                }
                charAt16 = i51 | (charAt9 << i52);
                i49 = i26;
            }
            int i53 = i49 + 1;
            int charAt17 = b11.charAt(i49);
            if (charAt17 >= 55296) {
                int i54 = charAt17 & 8191;
                int i55 = 13;
                while (true) {
                    i25 = i53 + 1;
                    charAt8 = b11.charAt(i53);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i54 |= (charAt8 & 8191) << i55;
                    i55 += 13;
                    i53 = i25;
                }
                charAt17 = i54 | (charAt8 << i55);
                i53 = i25;
            }
            int i56 = i53 + 1;
            int charAt18 = b11.charAt(i53);
            if (charAt18 >= 55296) {
                int i57 = charAt18 & 8191;
                int i58 = 13;
                while (true) {
                    i24 = i56 + 1;
                    charAt7 = b11.charAt(i56);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i57 |= (charAt7 & 8191) << i58;
                    i58 += 13;
                    i56 = i24;
                }
                charAt18 = i57 | (charAt7 << i58);
                i56 = i24;
            }
            int i59 = i56 + 1;
            int charAt19 = b11.charAt(i56);
            if (charAt19 >= 55296) {
                int i61 = charAt19 & 8191;
                int i62 = 13;
                while (true) {
                    i23 = i59 + 1;
                    charAt6 = b11.charAt(i59);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i61 |= (charAt6 & 8191) << i62;
                    i62 += 13;
                    i59 = i23;
                }
                charAt19 = i61 | (charAt6 << i62);
                i59 = i23;
            }
            int i63 = i59 + 1;
            charAt = b11.charAt(i59);
            if (charAt >= 55296) {
                int i64 = charAt & 8191;
                int i65 = 13;
                while (true) {
                    i22 = i63 + 1;
                    charAt5 = b11.charAt(i63);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i64 |= (charAt5 & 8191) << i65;
                    i65 += 13;
                    i63 = i22;
                }
                charAt = i64 | (charAt5 << i65);
                i63 = i22;
            }
            int i66 = i63 + 1;
            int charAt20 = b11.charAt(i63);
            if (charAt20 >= 55296) {
                int i67 = charAt20 & 8191;
                int i68 = 13;
                while (true) {
                    i21 = i66 + 1;
                    charAt4 = b11.charAt(i66);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i67 |= (charAt4 & 8191) << i68;
                    i68 += 13;
                    i66 = i21;
                }
                charAt20 = i67 | (charAt4 << i68);
                i66 = i21;
            }
            int i69 = i66 + 1;
            int charAt21 = b11.charAt(i66);
            if (charAt21 >= 55296) {
                int i71 = charAt21 & 8191;
                int i72 = 13;
                while (true) {
                    i19 = i69 + 1;
                    charAt3 = b11.charAt(i69);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i71 |= (charAt3 & 8191) << i72;
                    i72 += 13;
                    i69 = i19;
                }
                charAt21 = i71 | (charAt3 << i72);
                i69 = i19;
            }
            int i73 = i69 + 1;
            int charAt22 = b11.charAt(i69);
            if (charAt22 >= 55296) {
                int i74 = charAt22 & 8191;
                int i75 = 13;
                while (true) {
                    i18 = i73 + 1;
                    charAt2 = b11.charAt(i73);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i74 |= (charAt2 & 8191) << i75;
                    i75 += 13;
                    i73 = i18;
                }
                charAt22 = i74 | (charAt2 << i75);
                i73 = i18;
            }
            int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
            int i76 = (charAt16 * 2) + charAt17;
            int i77 = charAt20;
            i12 = charAt18;
            i13 = i77;
            i14 = charAt16;
            i46 = i73;
            iArr = iArr3;
            i15 = charAt19;
            i16 = i76;
            i17 = charAt22;
        }
        Unsafe unsafe = f42478q;
        Object[] a11 = e0Var.a();
        Class<?> cls = e0Var.getDefaultInstance().getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i78 = i13 + i17;
        int i79 = i78;
        int i81 = i17;
        int i82 = 0;
        int i83 = 0;
        while (i46 < length) {
            int i84 = i46 + 1;
            int charAt23 = b11.charAt(i46);
            if (charAt23 >= i44) {
                int i85 = charAt23 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i42 = i86 + 1;
                    charAt13 = b11.charAt(i86);
                    i27 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i85 |= (charAt13 & 8191) << i87;
                    i87 += 13;
                    i86 = i42;
                    length = i27;
                }
                charAt23 = i85 | (charAt13 << i87);
                i28 = i42;
            } else {
                i27 = length;
                i28 = i84;
            }
            int i88 = i28 + 1;
            int charAt24 = b11.charAt(i28);
            int i89 = charAt23;
            char c11 = 55296;
            if (charAt24 >= 55296) {
                int i91 = charAt24 & 8191;
                int i92 = 13;
                while (true) {
                    i41 = i88 + 1;
                    charAt12 = b11.charAt(i88);
                    if (charAt12 < c11) {
                        break;
                    }
                    i91 |= (charAt12 & 8191) << i92;
                    i92 += 13;
                    i88 = i41;
                    c11 = 55296;
                }
                charAt24 = i91 | (charAt12 << i92);
                i88 = i41;
            }
            int i93 = charAt24 & 255;
            int i94 = i14;
            if ((charAt24 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i83] = i82;
                i83++;
            }
            if (i93 >= 51) {
                int i95 = i88 + 1;
                int charAt25 = b11.charAt(i88);
                if (charAt25 >= 55296) {
                    int i96 = charAt25 & 8191;
                    int i97 = i95;
                    int i98 = 13;
                    while (true) {
                        i38 = i97 + 1;
                        charAt11 = b11.charAt(i97);
                        i39 = i96;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i96 = i39 | ((charAt11 & 8191) << i98);
                        i98 += 13;
                        i97 = i38;
                    }
                    charAt25 = i39 | (charAt11 << i98);
                    i37 = i38;
                } else {
                    i37 = i95;
                }
                int i99 = charAt25;
                int i100 = i93 - 51;
                int i101 = i37;
                if (i100 == 9 || i100 == 17) {
                    iArr2 = iArr4;
                    objArr[I1.w.a(i82, 3, 2, 1)] = a11[i16];
                    i16++;
                } else if (i100 != 12 || (!e0Var.getSyntax().equals(b0.PROTO2) && (charAt24 & 2048) == 0)) {
                    iArr2 = iArr4;
                } else {
                    iArr2 = iArr4;
                    objArr[I1.w.a(i82, 3, 2, 1)] = a11[i16];
                    i16++;
                }
                int i102 = i99 * 2;
                Object obj = a11[i102];
                if (obj instanceof Field) {
                    D12 = (Field) obj;
                } else {
                    D12 = D(cls, (String) obj);
                    a11[i102] = D12;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(D12);
                int i103 = i102 + 1;
                Object obj2 = a11[i103];
                if (obj2 instanceof Field) {
                    D13 = (Field) obj2;
                } else {
                    D13 = D(cls, (String) obj2);
                    a11[i103] = D13;
                }
                i29 = i78;
                i35 = objectFieldOffset2;
                i33 = i101;
                i32 = (int) unsafe.objectFieldOffset(D13);
                i34 = 0;
            } else {
                iArr2 = iArr4;
                int i104 = i16 + 1;
                Field D14 = D(cls, (String) a11[i16]);
                if (i93 == 9 || i93 == 17) {
                    i29 = i78;
                    objArr[I1.w.a(i82, 3, 2, 1)] = D14.getType();
                } else {
                    if (i93 == 27 || i93 == 49) {
                        i29 = i78;
                        i36 = i16 + 2;
                        objArr[I1.w.a(i82, 3, 2, 1)] = a11[i104];
                    } else if (i93 == 12 || i93 == 30 || i93 == 44) {
                        i29 = i78;
                        if (e0Var.getSyntax() == b0.PROTO2 || (charAt24 & 2048) != 0) {
                            i36 = i16 + 2;
                            objArr[I1.w.a(i82, 3, 2, 1)] = a11[i104];
                        }
                    } else if (i93 == 50) {
                        int i105 = i81 + 1;
                        iArr[i81] = i82;
                        int i106 = (i82 / 3) * 2;
                        int i107 = i16 + 2;
                        objArr[i106] = a11[i104];
                        if ((charAt24 & 2048) != 0) {
                            i31 = i16 + 3;
                            objArr[i106 + 1] = a11[i107];
                            i29 = i78;
                            i81 = i105;
                        } else {
                            i31 = i107;
                            i81 = i105;
                            i29 = i78;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(D14);
                        if ((charAt24 & 4096) != 0 || i93 > 17) {
                            i32 = 1048575;
                            i33 = i88;
                            i34 = 0;
                        } else {
                            int i108 = i88 + 1;
                            int charAt26 = b11.charAt(i88);
                            if (charAt26 >= 55296) {
                                int i109 = charAt26 & 8191;
                                int i110 = 13;
                                while (true) {
                                    i33 = i108 + 1;
                                    charAt10 = b11.charAt(i108);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i109 |= (charAt10 & 8191) << i110;
                                    i110 += 13;
                                    i108 = i33;
                                }
                                charAt26 = i109 | (charAt10 << i110);
                            } else {
                                i33 = i108;
                            }
                            int i111 = (charAt26 / 32) + (i94 * 2);
                            Object obj3 = a11[i111];
                            if (obj3 instanceof Field) {
                                D11 = (Field) obj3;
                            } else {
                                D11 = D(cls, (String) obj3);
                                a11[i111] = D11;
                            }
                            i32 = (int) unsafe.objectFieldOffset(D11);
                            i34 = charAt26 % 32;
                        }
                        if (i93 >= 18 && i93 <= 49) {
                            iArr[i79] = objectFieldOffset;
                            i79++;
                        }
                        i16 = i31;
                        i35 = objectFieldOffset;
                    } else {
                        i29 = i78;
                    }
                    i31 = i36;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(D14);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i32 = 1048575;
                    i33 = i88;
                    i34 = 0;
                    if (i93 >= 18) {
                        iArr[i79] = objectFieldOffset;
                        i79++;
                    }
                    i16 = i31;
                    i35 = objectFieldOffset;
                }
                i31 = i104;
                objectFieldOffset = (int) unsafe.objectFieldOffset(D14);
                if ((charAt24 & 4096) != 0) {
                }
                i32 = 1048575;
                i33 = i88;
                i34 = 0;
                if (i93 >= 18) {
                }
                i16 = i31;
                i35 = objectFieldOffset;
            }
            int i112 = i82 + 1;
            iArr2[i82] = i89;
            int i113 = i82 + 2;
            String str = b11;
            iArr2[i112] = ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? LinearLayoutManager.INVALID_OFFSET : 0) | (i93 << 20) | i35;
            i82 += 3;
            iArr2[i113] = (i34 << 20) | i32;
            b11 = str;
            i14 = i94;
            length = i27;
            i46 = i33;
            i78 = i29;
            iArr4 = iArr2;
            i44 = 55296;
        }
        Q defaultInstance = e0Var.getDefaultInstance();
        e0Var.getSyntax();
        return new U<>(iArr4, objArr, i12, i15, defaultInstance, iArr, i17, i78, w11, e11, m0Var, abstractC5370p, l11);
    }

    private static long v(int i11) {
        return i11 & 1048575;
    }

    private static <T> int w(T t2, long j11) {
        return ((Integer) p0.s(t2, j11)).intValue();
    }

    private static <T> long x(T t2, long j11) {
        return ((Long) p0.s(t2, j11)).longValue();
    }

    private int y(int i11) {
        if (i11 >= this.f42482c && i11 <= this.f42483d) {
            int[] iArr = this.f42480a;
            int length = (iArr.length / 3) - 1;
            int i12 = 0;
            while (i12 <= length) {
                int i13 = (length + i12) >>> 1;
                int i14 = i13 * 3;
                int i15 = iArr[i14];
                if (i11 == i15) {
                    return i14;
                }
                if (i11 < i15) {
                    length = i13 - 1;
                } else {
                    i12 = i13 + 1;
                }
            }
        }
        return -1;
    }

    private void z(Object obj, long j11, C5364j c5364j, f0 f0Var, C5369o c5369o) throws IOException {
        c5364j.w(this.f42491l.a(j11, obj), f0Var, c5369o);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f0
    public final int a(AbstractC5355a abstractC5355a) {
        int i11;
        int i12;
        int h11;
        int h12;
        int j11;
        int h13;
        int j12;
        int h14;
        int h15;
        int i13;
        int h16;
        int i14;
        int c11;
        int h17;
        int e11;
        int c12;
        int size;
        int i15;
        int h18;
        int h19;
        int e12;
        int i16;
        int h21;
        int i17;
        int i18;
        int h22;
        int h23;
        int h24;
        int j13;
        int h25;
        int j14;
        int h26;
        int i19;
        U<T> u11 = this;
        T t2 = abstractC5355a;
        int i21 = 1;
        Unsafe unsafe = f42478q;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        while (true) {
            int[] iArr = u11.f42480a;
            if (i22 >= iArr.length) {
                m0<?, ?> m0Var = u11.f42492m;
                int h27 = i24 + m0Var.h(m0Var.g(t2));
                return u11.f42485f ? h27 + u11.f42493n.c(t2).h() : h27;
            }
            int J11 = u11.J(i22);
            int I11 = I(J11);
            int i26 = iArr[i22];
            int i27 = iArr[i22 + 2];
            int i28 = i27 & 1048575;
            if (I11 <= 17) {
                if (i28 != i25) {
                    i23 = i28 == 1048575 ? 0 : unsafe.getInt(t2, i28);
                    i25 = i28;
                }
                i11 = i21 << (i27 >>> 20);
            } else {
                i11 = 0;
            }
            long j15 = J11 & 1048575;
            if (I11 >= EnumC5373t.DOUBLE_LIST_PACKED.a()) {
                EnumC5373t.SINT64_LIST_PACKED.a();
            }
            switch (I11) {
                case 0:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        i24 += AbstractC5365k.h(i26) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        h11 = AbstractC5365k.h(i26);
                        h15 = h11 + 4;
                        i24 += h15;
                    }
                    u11 = this;
                    t2 = abstractC5355a;
                    break;
                case 2:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        long j16 = unsafe.getLong(t2, j15);
                        h12 = AbstractC5365k.h(i26);
                        j11 = AbstractC5365k.j(j16);
                        i24 += j11 + h12;
                    }
                    u11 = this;
                    break;
                case 3:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        long j17 = unsafe.getLong(t2, j15);
                        h12 = AbstractC5365k.h(i26);
                        j11 = AbstractC5365k.j(j17);
                        i24 += j11 + h12;
                    }
                    u11 = this;
                    break;
                case 4:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        int i29 = unsafe.getInt(t2, j15);
                        h13 = AbstractC5365k.h(i26);
                        j12 = AbstractC5365k.j(i29);
                        c11 = j12 + h13;
                        i24 += c11;
                    }
                    u11 = this;
                    break;
                case 5:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        h14 = AbstractC5365k.h(i26);
                        h15 = h14 + 8;
                        i24 += h15;
                    }
                    u11 = this;
                    t2 = abstractC5355a;
                    break;
                case 6:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        h11 = AbstractC5365k.h(i26);
                        h15 = h11 + 4;
                        i24 += h15;
                    }
                    u11 = this;
                    t2 = abstractC5355a;
                    break;
                case 7:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        h15 = AbstractC5365k.h(i26) + 1;
                        i24 += h15;
                    }
                    u11 = this;
                    t2 = abstractC5355a;
                    break;
                case 8:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        Object object = unsafe.getObject(t2, j15);
                        i24 = (object instanceof AbstractC5362h ? AbstractC5365k.c(i26, (AbstractC5362h) object) : AbstractC5365k.g((String) object) + AbstractC5365k.h(i26)) + i24;
                    }
                    u11 = this;
                    break;
                case 9:
                    i12 = i21;
                    if (!u11.l(t2, i22, i25, i23, i11)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t2, j15);
                        f0 j18 = u11.j(i22);
                        int i31 = g0.f42523d;
                        if (object2 instanceof C) {
                            h16 = AbstractC5365k.h(i26);
                            int a11 = ((C) object2).a();
                            i14 = AbstractC5365k.i(a11) + a11;
                            i13 = i14 + h16;
                            i24 += i13;
                            break;
                        } else {
                            int h28 = AbstractC5365k.h(i26);
                            int e13 = ((AbstractC5355a) ((Q) object2)).e(j18);
                            i13 = h28 + AbstractC5365k.i(e13) + e13;
                            i24 += i13;
                        }
                    }
                case 10:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        c11 = AbstractC5365k.c(i26, (AbstractC5362h) unsafe.getObject(t2, j15));
                        i24 += c11;
                    }
                    u11 = this;
                    break;
                case 11:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        int i32 = unsafe.getInt(t2, j15);
                        h13 = AbstractC5365k.h(i26);
                        j12 = AbstractC5365k.i(i32);
                        c11 = j12 + h13;
                        i24 += c11;
                    }
                    u11 = this;
                    break;
                case 12:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        int i33 = unsafe.getInt(t2, j15);
                        h13 = AbstractC5365k.h(i26);
                        j12 = AbstractC5365k.j(i33);
                        c11 = j12 + h13;
                        i24 += c11;
                    }
                    u11 = this;
                    break;
                case 13:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        h11 = AbstractC5365k.h(i26);
                        h15 = h11 + 4;
                        i24 += h15;
                    }
                    u11 = this;
                    t2 = abstractC5355a;
                    break;
                case 14:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        h14 = AbstractC5365k.h(i26);
                        h15 = h14 + 8;
                        i24 += h15;
                    }
                    u11 = this;
                    t2 = abstractC5355a;
                    break;
                case 15:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        int i34 = unsafe.getInt(t2, j15);
                        h13 = AbstractC5365k.h(i26);
                        j12 = AbstractC5365k.e(i34);
                        c11 = j12 + h13;
                        i24 += c11;
                    }
                    u11 = this;
                    break;
                case 16:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        long j19 = unsafe.getLong(t2, j15);
                        h12 = AbstractC5365k.h(i26);
                        j11 = AbstractC5365k.f(j19);
                        i24 += j11 + h12;
                    }
                    u11 = this;
                    break;
                case 17:
                    i12 = i21;
                    if (u11.l(t2, i22, i25, i23, i11)) {
                        Q q11 = (Q) unsafe.getObject(t2, j15);
                        f0 j21 = u11.j(i22);
                        h17 = AbstractC5365k.h(i26) * 2;
                        e11 = ((AbstractC5355a) q11).e(j21);
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i12 = i21;
                    c12 = g0.c(i26, (List) unsafe.getObject(t2, j15));
                    i24 += c12;
                    break;
                case 19:
                    i12 = i21;
                    c12 = g0.b(i26, (List) unsafe.getObject(t2, j15));
                    i24 += c12;
                    break;
                case 20:
                    i12 = i21;
                    List list = (List) unsafe.getObject(t2, j15);
                    int i35 = g0.f42523d;
                    if (list.size() != 0) {
                        h16 = g0.e(list);
                        i14 = AbstractC5365k.h(i26) * list.size();
                        i13 = i14 + h16;
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case 21:
                    i12 = i21;
                    List list2 = (List) unsafe.getObject(t2, j15);
                    int i36 = g0.f42523d;
                    size = list2.size();
                    if (size != 0) {
                        i15 = g0.i(list2);
                        h18 = AbstractC5365k.h(i26);
                        i13 = (h18 * size) + i15;
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case 22:
                    i12 = i21;
                    List list3 = (List) unsafe.getObject(t2, j15);
                    int i37 = g0.f42523d;
                    size = list3.size();
                    if (size != 0) {
                        i15 = g0.d(list3);
                        h18 = AbstractC5365k.h(i26);
                        i13 = (h18 * size) + i15;
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case 23:
                    i12 = i21;
                    c12 = g0.c(i26, (List) unsafe.getObject(t2, j15));
                    i24 += c12;
                    break;
                case 24:
                    i12 = i21;
                    c12 = g0.b(i26, (List) unsafe.getObject(t2, j15));
                    i24 += c12;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    i12 = i21;
                    List list4 = (List) unsafe.getObject(t2, j15);
                    int i38 = g0.f42523d;
                    int size2 = list4.size();
                    i24 += size2 == 0 ? 0 : (AbstractC5365k.h(i26) + 1) * size2;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    i12 = i21;
                    List list5 = (List) unsafe.getObject(t2, j15);
                    int i39 = g0.f42523d;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        i13 = AbstractC5365k.h(i26) * size3;
                        if (list5 instanceof D) {
                            D d11 = (D) list5;
                            for (int i41 = 0; i41 < size3; i41++) {
                                Object y11 = d11.y();
                                i13 = (y11 instanceof AbstractC5362h ? AbstractC5365k.d((AbstractC5362h) y11) : AbstractC5365k.g((String) y11)) + i13;
                            }
                        } else {
                            for (int i42 = 0; i42 < size3; i42++) {
                                Object obj = list5.get(i42);
                                i13 = (obj instanceof AbstractC5362h ? AbstractC5365k.d((AbstractC5362h) obj) : AbstractC5365k.g((String) obj)) + i13;
                            }
                        }
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i12 = i21;
                    List list6 = (List) unsafe.getObject(t2, j15);
                    f0 j22 = u11.j(i22);
                    int i43 = g0.f42523d;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        h19 = 0;
                    } else {
                        h19 = AbstractC5365k.h(i26) * size4;
                        for (int i44 = 0; i44 < size4; i44++) {
                            Object obj2 = list6.get(i44);
                            if (obj2 instanceof C) {
                                e12 = ((C) obj2).a();
                                i16 = AbstractC5365k.i(e12);
                            } else {
                                e12 = ((AbstractC5355a) ((Q) obj2)).e(j22);
                                i16 = AbstractC5365k.i(e12);
                            }
                            h19 = i16 + e12 + h19;
                        }
                    }
                    i24 += h19;
                    break;
                case 28:
                    i12 = i21;
                    List list7 = (List) unsafe.getObject(t2, j15);
                    int i45 = g0.f42523d;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        i13 = AbstractC5365k.h(i26) * size5;
                        for (int i46 = 0; i46 < list7.size(); i46++) {
                            i13 += AbstractC5365k.d((AbstractC5362h) list7.get(i46));
                        }
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case 29:
                    i12 = i21;
                    List list8 = (List) unsafe.getObject(t2, j15);
                    int i47 = g0.f42523d;
                    size = list8.size();
                    if (size != 0) {
                        i15 = g0.h(list8);
                        h18 = AbstractC5365k.h(i26);
                        i13 = (h18 * size) + i15;
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    i12 = i21;
                    List list9 = (List) unsafe.getObject(t2, j15);
                    int i48 = g0.f42523d;
                    size = list9.size();
                    if (size != 0) {
                        i15 = g0.a(list9);
                        h18 = AbstractC5365k.h(i26);
                        i13 = (h18 * size) + i15;
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    i12 = i21;
                    c12 = g0.b(i26, (List) unsafe.getObject(t2, j15));
                    i24 += c12;
                    break;
                case 32:
                    i12 = i21;
                    c12 = g0.c(i26, (List) unsafe.getObject(t2, j15));
                    i24 += c12;
                    break;
                case 33:
                    i12 = i21;
                    List list10 = (List) unsafe.getObject(t2, j15);
                    int i49 = g0.f42523d;
                    size = list10.size();
                    if (size != 0) {
                        i15 = g0.f(list10);
                        h18 = AbstractC5365k.h(i26);
                        i13 = (h18 * size) + i15;
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case 34:
                    i12 = i21;
                    List list11 = (List) unsafe.getObject(t2, j15);
                    int i51 = g0.f42523d;
                    size = list11.size();
                    if (size != 0) {
                        i15 = g0.g(list11);
                        h18 = AbstractC5365k.h(i26);
                        i13 = (h18 * size) + i15;
                        i24 += i13;
                        break;
                    }
                    i13 = 0;
                    i24 += i13;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    i12 = i21;
                    List list12 = (List) unsafe.getObject(t2, j15);
                    int i52 = g0.f42523d;
                    e11 = list12.size() * 8;
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i12 = i21;
                    List list13 = (List) unsafe.getObject(t2, j15);
                    int i53 = g0.f42523d;
                    e11 = list13.size() * 4;
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    i12 = i21;
                    e11 = g0.e((List) unsafe.getObject(t2, j15));
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i12 = i21;
                    e11 = g0.i((List) unsafe.getObject(t2, j15));
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i12 = i21;
                    e11 = g0.d((List) unsafe.getObject(t2, j15));
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i12 = i21;
                    List list14 = (List) unsafe.getObject(t2, j15);
                    int i54 = g0.f42523d;
                    e11 = list14.size() * 8;
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i12 = i21;
                    List list15 = (List) unsafe.getObject(t2, j15);
                    int i55 = g0.f42523d;
                    e11 = list15.size() * 4;
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    i12 = i21;
                    List list16 = (List) unsafe.getObject(t2, j15);
                    int i56 = g0.f42523d;
                    e11 = list16.size();
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i12 = i21;
                    e11 = g0.h((List) unsafe.getObject(t2, j15));
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i12 = i21;
                    e11 = g0.a((List) unsafe.getObject(t2, j15));
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i12 = i21;
                    List list17 = (List) unsafe.getObject(t2, j15);
                    int i57 = g0.f42523d;
                    e11 = list17.size() * 4;
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i12 = i21;
                    List list18 = (List) unsafe.getObject(t2, j15);
                    int i58 = g0.f42523d;
                    e11 = list18.size() * 8;
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i12 = i21;
                    e11 = g0.f((List) unsafe.getObject(t2, j15));
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i12 = i21;
                    e11 = g0.g((List) unsafe.getObject(t2, j15));
                    if (e11 > 0) {
                        h21 = AbstractC5365k.h(i26);
                        i17 = AbstractC5365k.i(e11);
                        h17 = i17 + h21;
                        i24 += h17 + e11;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(t2, j15);
                    f0 j23 = u11.j(i22);
                    int i59 = g0.f42523d;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i18 = 0;
                    } else {
                        int i61 = 0;
                        i18 = 0;
                        while (i61 < size6) {
                            i18 = (AbstractC5365k.h(i26) * 2) + ((AbstractC5355a) ((Q) list19.get(i61))).e(j23) + i18;
                            i61++;
                            i21 = i21;
                        }
                    }
                    i12 = i21;
                    i24 += i18;
                    break;
                case 50:
                    i24 += u11.f42494o.getSerializedSize(i26, unsafe.getObject(t2, j15), u11.i(i22));
                    i12 = i21;
                    break;
                case 51:
                    if (u11.n(t2, i26, i22)) {
                        h22 = AbstractC5365k.h(i26);
                        h26 = h22 + 8;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 52:
                    if (u11.n(t2, i26, i22)) {
                        h23 = AbstractC5365k.h(i26);
                        h26 = h23 + 4;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 53:
                    if (u11.n(t2, i26, i22)) {
                        long x11 = x(t2, j15);
                        h24 = AbstractC5365k.h(i26);
                        j13 = AbstractC5365k.j(x11);
                        i24 += j13 + h24;
                    }
                    i12 = i21;
                    break;
                case 54:
                    if (u11.n(t2, i26, i22)) {
                        long x12 = x(t2, j15);
                        h24 = AbstractC5365k.h(i26);
                        j13 = AbstractC5365k.j(x12);
                        i24 += j13 + h24;
                    }
                    i12 = i21;
                    break;
                case 55:
                    if (u11.n(t2, i26, i22)) {
                        int w11 = w(t2, j15);
                        h25 = AbstractC5365k.h(i26);
                        j14 = AbstractC5365k.j(w11);
                        h26 = j14 + h25;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 56:
                    if (u11.n(t2, i26, i22)) {
                        h22 = AbstractC5365k.h(i26);
                        h26 = h22 + 8;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 57:
                    if (u11.n(t2, i26, i22)) {
                        h23 = AbstractC5365k.h(i26);
                        h26 = h23 + 4;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 58:
                    if (u11.n(t2, i26, i22)) {
                        h26 = AbstractC5365k.h(i26) + i21;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 59:
                    if (u11.n(t2, i26, i22)) {
                        Object object3 = unsafe.getObject(t2, j15);
                        i24 = (object3 instanceof AbstractC5362h ? AbstractC5365k.c(i26, (AbstractC5362h) object3) : AbstractC5365k.g((String) object3) + AbstractC5365k.h(i26)) + i24;
                    }
                    i12 = i21;
                    break;
                case 60:
                    if (u11.n(t2, i26, i22)) {
                        Object object4 = unsafe.getObject(t2, j15);
                        f0 j24 = u11.j(i22);
                        int i62 = g0.f42523d;
                        if (object4 instanceof C) {
                            int h29 = AbstractC5365k.h(i26);
                            int a12 = ((C) object4).a();
                            i19 = AbstractC5365k.i(a12) + a12 + h29;
                        } else {
                            int h31 = AbstractC5365k.h(i26);
                            int e14 = ((AbstractC5355a) ((Q) object4)).e(j24);
                            i19 = h31 + AbstractC5365k.i(e14) + e14;
                        }
                        i24 += i19;
                    }
                    i12 = i21;
                    break;
                case 61:
                    if (u11.n(t2, i26, i22)) {
                        h26 = AbstractC5365k.c(i26, (AbstractC5362h) unsafe.getObject(t2, j15));
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 62:
                    if (u11.n(t2, i26, i22)) {
                        int w12 = w(t2, j15);
                        h25 = AbstractC5365k.h(i26);
                        j14 = AbstractC5365k.i(w12);
                        h26 = j14 + h25;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 63:
                    if (u11.n(t2, i26, i22)) {
                        int w13 = w(t2, j15);
                        h25 = AbstractC5365k.h(i26);
                        j14 = AbstractC5365k.j(w13);
                        h26 = j14 + h25;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (u11.n(t2, i26, i22)) {
                        h23 = AbstractC5365k.h(i26);
                        h26 = h23 + 4;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (u11.n(t2, i26, i22)) {
                        h22 = AbstractC5365k.h(i26);
                        h26 = h22 + 8;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 66:
                    if (u11.n(t2, i26, i22)) {
                        int w14 = w(t2, j15);
                        h25 = AbstractC5365k.h(i26);
                        j14 = AbstractC5365k.e(w14);
                        h26 = j14 + h25;
                        i24 += h26;
                    }
                    i12 = i21;
                    break;
                case 67:
                    if (u11.n(t2, i26, i22)) {
                        long x13 = x(t2, j15);
                        h24 = AbstractC5365k.h(i26);
                        j13 = AbstractC5365k.f(x13);
                        i24 += j13 + h24;
                    }
                    i12 = i21;
                    break;
                case 68:
                    if (u11.n(t2, i26, i22)) {
                        i24 += (AbstractC5365k.h(i26) * 2) + ((AbstractC5355a) ((Q) unsafe.getObject(t2, j15))).e(u11.j(i22));
                    }
                    i12 = i21;
                    break;
                default:
                    i12 = i21;
                    break;
            }
            i22 += 3;
            i21 = i12;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void b(Object obj, C5364j c5364j, C5369o c5369o) throws IOException {
        c5369o.getClass();
        if (!m(obj)) {
            throw new IllegalArgumentException(U7.m.b(obj, "Mutating immutable message: "));
        }
        o(this.f42492m, this.f42493n, obj, c5364j, c5369o);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04f9  */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(T t2, t0 t0Var) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        C5366l c5366l = (C5366l) t0Var;
        c5366l.getClass();
        if (t0.a.ASCENDING != t0.a.DESCENDING) {
            K(t2, t0Var);
            return;
        }
        m0<?, ?> m0Var = this.f42492m;
        m0Var.r(m0Var.g(t2), t0Var);
        boolean z11 = this.f42485f;
        AbstractC5370p<?> abstractC5370p = this.f42493n;
        if (z11) {
            C5372s<?> c11 = abstractC5370p.c(t2);
            if (!c11.i()) {
                entry = c11.d().next();
                int[] iArr = this.f42480a;
                for (length = iArr.length - 3; length >= 0; length -= 3) {
                    int J11 = J(length);
                    int i11 = iArr[length];
                    if (entry != null) {
                        abstractC5370p.a(entry);
                        if (i11 < 0) {
                            abstractC5370p.j(entry);
                            throw null;
                        }
                    }
                    switch (I(J11)) {
                        case 0:
                            if (k(t2, length)) {
                                c5366l.f(i11, p0.o(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (k(t2, length)) {
                                c5366l.o(i11, p0.p(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (k(t2, length)) {
                                c5366l.t(i11, p0.r(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (k(t2, length)) {
                                c5366l.L(i11, p0.r(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (k(t2, length)) {
                                c5366l.r(i11, p0.q(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (k(t2, length)) {
                                c5366l.m(i11, p0.r(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (k(t2, length)) {
                                c5366l.k(i11, p0.q(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (k(t2, length)) {
                                c5366l.b(i11, p0.n(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (k(t2, length)) {
                                L(i11, p0.s(t2, J11 & 1048575), t0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (k(t2, length)) {
                                c5366l.w(i11, p0.s(t2, J11 & 1048575), j(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (k(t2, length)) {
                                c5366l.d(i11, (AbstractC5362h) p0.s(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (k(t2, length)) {
                                c5366l.J(i11, p0.q(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (k(t2, length)) {
                                c5366l.i(i11, p0.q(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (k(t2, length)) {
                                c5366l.y(i11, p0.q(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (k(t2, length)) {
                                c5366l.A(i11, p0.r(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (k(t2, length)) {
                                c5366l.C(i11, p0.q(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (k(t2, length)) {
                                c5366l.E(i11, p0.r(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (k(t2, length)) {
                                c5366l.q(i11, p0.s(t2, J11 & 1048575), j(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            g0.p(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 19:
                            g0.t(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 20:
                            g0.w(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 21:
                            g0.D(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 22:
                            g0.v(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 23:
                            g0.s(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 24:
                            g0.r(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            g0.o(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            int i12 = iArr[length];
                            List<String> list = (List) p0.s(t2, J11 & 1048575);
                            int i13 = g0.f42523d;
                            if (list != null && !list.isEmpty()) {
                                c5366l.I(i12, list);
                                break;
                            }
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            g0.x(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, j(length));
                            break;
                        case 28:
                            int i14 = iArr[length];
                            List<AbstractC5362h> list2 = (List) p0.s(t2, J11 & 1048575);
                            int i15 = g0.f42523d;
                            if (list2 != null && !list2.isEmpty()) {
                                c5366l.e(i14, list2);
                                break;
                            }
                            break;
                        case 29:
                            g0.C(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            g0.q(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            g0.y(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 32:
                            g0.z(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 33:
                            g0.A(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case 34:
                            g0.B(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, false);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            g0.p(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            g0.t(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            g0.w(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 38:
                            g0.D(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            g0.v(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 40:
                            g0.s(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 41:
                            g0.r(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 42:
                            g0.o(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 43:
                            g0.C(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            g0.q(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            g0.y(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 46:
                            g0.z(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 47:
                            g0.A(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 48:
                            g0.B(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, true);
                            break;
                        case 49:
                            g0.u(iArr[length], (List) p0.s(t2, J11 & 1048575), t0Var, j(length));
                            break;
                        case 50:
                            Object s11 = p0.s(t2, J11 & 1048575);
                            if (s11 != null) {
                                Object i16 = i(length);
                                L l11 = this.f42494o;
                                c5366l.v(i11, l11.forMapMetadata(i16), l11.forMapData(s11));
                                break;
                            } else {
                                break;
                            }
                        case 51:
                            if (n(t2, i11, length)) {
                                c5366l.f(i11, ((Double) p0.s(t2, J11 & 1048575)).doubleValue());
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (n(t2, i11, length)) {
                                c5366l.o(i11, ((Float) p0.s(t2, J11 & 1048575)).floatValue());
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (n(t2, i11, length)) {
                                c5366l.t(i11, x(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (n(t2, i11, length)) {
                                c5366l.L(i11, x(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (n(t2, i11, length)) {
                                c5366l.r(i11, w(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (n(t2, i11, length)) {
                                c5366l.m(i11, x(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (n(t2, i11, length)) {
                                c5366l.k(i11, w(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (n(t2, i11, length)) {
                                c5366l.b(i11, ((Boolean) p0.s(t2, J11 & 1048575)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (n(t2, i11, length)) {
                                L(i11, p0.s(t2, J11 & 1048575), t0Var);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (n(t2, i11, length)) {
                                c5366l.w(i11, p0.s(t2, J11 & 1048575), j(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (n(t2, i11, length)) {
                                c5366l.d(i11, (AbstractC5362h) p0.s(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (n(t2, i11, length)) {
                                c5366l.J(i11, w(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (n(t2, i11, length)) {
                                c5366l.i(i11, w(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (n(t2, i11, length)) {
                                c5366l.y(i11, w(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (n(t2, i11, length)) {
                                c5366l.A(i11, x(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (n(t2, i11, length)) {
                                c5366l.C(i11, w(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (n(t2, i11, length)) {
                                c5366l.E(i11, x(t2, J11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (n(t2, i11, length)) {
                                c5366l.q(i11, p0.s(t2, J11 & 1048575), j(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (entry != null) {
                    return;
                }
                abstractC5370p.j(entry);
                throw null;
            }
        }
        entry = null;
        int[] iArr2 = this.f42480a;
        while (length >= 0) {
        }
        if (entry != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (androidx.datastore.preferences.protobuf.g0.l(androidx.datastore.preferences.protobuf.p0.s(r11, r7), androidx.datastore.preferences.protobuf.p0.s(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.r(r11, r7) == androidx.datastore.preferences.protobuf.p0.r(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.q(r11, r7) == androidx.datastore.preferences.protobuf.p0.q(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.r(r11, r7) == androidx.datastore.preferences.protobuf.p0.r(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.q(r11, r7) == androidx.datastore.preferences.protobuf.p0.q(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.q(r11, r7) == androidx.datastore.preferences.protobuf.p0.q(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.q(r11, r7) == androidx.datastore.preferences.protobuf.p0.q(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (androidx.datastore.preferences.protobuf.g0.l(androidx.datastore.preferences.protobuf.p0.s(r11, r7), androidx.datastore.preferences.protobuf.p0.s(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.g0.l(androidx.datastore.preferences.protobuf.p0.s(r11, r7), androidx.datastore.preferences.protobuf.p0.s(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (androidx.datastore.preferences.protobuf.g0.l(androidx.datastore.preferences.protobuf.p0.s(r11, r7), androidx.datastore.preferences.protobuf.p0.s(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0130, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.n(r11, r7) == androidx.datastore.preferences.protobuf.p0.n(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.q(r11, r7) == androidx.datastore.preferences.protobuf.p0.q(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.r(r11, r7) == androidx.datastore.preferences.protobuf.p0.r(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.q(r11, r7) == androidx.datastore.preferences.protobuf.p0.q(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.r(r11, r7) == androidx.datastore.preferences.protobuf.p0.r(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (androidx.datastore.preferences.protobuf.p0.r(r11, r7) == androidx.datastore.preferences.protobuf.p0.r(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
    
        if (java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.p0.p(r11, r7)) == java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.p0.p(r12, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        if (java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.p0.o(r11, r7)) == java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.p0.o(r12, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (androidx.datastore.preferences.protobuf.g0.l(androidx.datastore.preferences.protobuf.p0.s(r11, r7), androidx.datastore.preferences.protobuf.p0.s(r12, r7)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(AbstractC5376w abstractC5376w, AbstractC5376w abstractC5376w2) {
        int[] iArr = this.f42480a;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 < length) {
                int J11 = J(i11);
                long j11 = J11 & 1048575;
                switch (I(J11)) {
                    case 0:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 1:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 2:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 3:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 4:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 5:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 6:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 7:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 8:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 9:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 10:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 11:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 12:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 13:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 14:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 15:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 16:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 17:
                        if (f(abstractC5376w, abstractC5376w2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                    case 29:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z11 = g0.l(p0.s(abstractC5376w, j11), p0.s(abstractC5376w2, j11));
                        break;
                    case 50:
                        z11 = g0.l(p0.s(abstractC5376w, j11), p0.s(abstractC5376w2, j11));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 66:
                    case 67:
                    case 68:
                        long j12 = iArr[i11 + 2] & 1048575;
                        if (p0.q(abstractC5376w, j12) == p0.q(abstractC5376w2, j12)) {
                            break;
                        }
                        z11 = false;
                        break;
                }
                if (z11) {
                    i11 += 3;
                }
            } else {
                m0<?, ?> m0Var = this.f42492m;
                if (m0Var.g(abstractC5376w).equals(m0Var.g(abstractC5376w2))) {
                    if (!this.f42485f) {
                        return true;
                    }
                    AbstractC5370p<?> abstractC5370p = this.f42493n;
                    return abstractC5370p.c(abstractC5376w).equals(abstractC5370p.c(abstractC5376w2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f0, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(AbstractC5376w abstractC5376w) {
        int i11;
        int b11;
        int i12;
        int q11;
        int i13;
        int[] iArr = this.f42480a;
        int length = iArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int J11 = J(i15);
            int i16 = iArr[i15];
            long j11 = 1048575 & J11;
            int i17 = 1237;
            int i18 = 37;
            switch (I(J11)) {
                case 0:
                    i11 = i14 * 53;
                    b11 = C5378y.b(Double.doubleToLongBits(p0.o(abstractC5376w, j11)));
                    i14 = b11 + i11;
                    break;
                case 1:
                    i11 = i14 * 53;
                    b11 = Float.floatToIntBits(p0.p(abstractC5376w, j11));
                    i14 = b11 + i11;
                    break;
                case 2:
                    i11 = i14 * 53;
                    b11 = C5378y.b(p0.r(abstractC5376w, j11));
                    i14 = b11 + i11;
                    break;
                case 3:
                    i11 = i14 * 53;
                    b11 = C5378y.b(p0.r(abstractC5376w, j11));
                    i14 = b11 + i11;
                    break;
                case 4:
                    i12 = i14 * 53;
                    q11 = p0.q(abstractC5376w, j11);
                    i14 = i12 + q11;
                    break;
                case 5:
                    i11 = i14 * 53;
                    b11 = C5378y.b(p0.r(abstractC5376w, j11));
                    i14 = b11 + i11;
                    break;
                case 6:
                    i12 = i14 * 53;
                    q11 = p0.q(abstractC5376w, j11);
                    i14 = i12 + q11;
                    break;
                case 7:
                    i13 = i14 * 53;
                    boolean n11 = p0.n(abstractC5376w, j11);
                    byte[] bArr = C5378y.f42629b;
                    break;
                case 8:
                    i11 = i14 * 53;
                    b11 = ((String) p0.s(abstractC5376w, j11)).hashCode();
                    i14 = b11 + i11;
                    break;
                case 9:
                    Object s11 = p0.s(abstractC5376w, j11);
                    if (s11 != null) {
                        i18 = s11.hashCode();
                    }
                    i14 = (i14 * 53) + i18;
                    break;
                case 10:
                    i11 = i14 * 53;
                    b11 = p0.s(abstractC5376w, j11).hashCode();
                    i14 = b11 + i11;
                    break;
                case 11:
                    i12 = i14 * 53;
                    q11 = p0.q(abstractC5376w, j11);
                    i14 = i12 + q11;
                    break;
                case 12:
                    i12 = i14 * 53;
                    q11 = p0.q(abstractC5376w, j11);
                    i14 = i12 + q11;
                    break;
                case 13:
                    i12 = i14 * 53;
                    q11 = p0.q(abstractC5376w, j11);
                    i14 = i12 + q11;
                    break;
                case 14:
                    i11 = i14 * 53;
                    b11 = C5378y.b(p0.r(abstractC5376w, j11));
                    i14 = b11 + i11;
                    break;
                case 15:
                    i12 = i14 * 53;
                    q11 = p0.q(abstractC5376w, j11);
                    i14 = i12 + q11;
                    break;
                case 16:
                    i11 = i14 * 53;
                    b11 = C5378y.b(p0.r(abstractC5376w, j11));
                    i14 = b11 + i11;
                    break;
                case 17:
                    Object s12 = p0.s(abstractC5376w, j11);
                    if (s12 != null) {
                        i18 = s12.hashCode();
                    }
                    i14 = (i14 * 53) + i18;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i14 * 53;
                    b11 = p0.s(abstractC5376w, j11).hashCode();
                    i14 = b11 + i11;
                    break;
                case 50:
                    i11 = i14 * 53;
                    b11 = p0.s(abstractC5376w, j11).hashCode();
                    i14 = b11 + i11;
                    break;
                case 51:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5378y.b(Double.doubleToLongBits(((Double) p0.s(abstractC5376w, j11)).doubleValue()));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = Float.floatToIntBits(((Float) p0.s(abstractC5376w, j11)).floatValue());
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5378y.b(x(abstractC5376w, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5378y.b(x(abstractC5376w, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (n(abstractC5376w, i16, i15)) {
                        i12 = i14 * 53;
                        q11 = w(abstractC5376w, j11);
                        i14 = i12 + q11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5378y.b(x(abstractC5376w, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (n(abstractC5376w, i16, i15)) {
                        i12 = i14 * 53;
                        q11 = w(abstractC5376w, j11);
                        i14 = i12 + q11;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (n(abstractC5376w, i16, i15)) {
                        i13 = i14 * 53;
                        boolean booleanValue = ((Boolean) p0.s(abstractC5376w, j11)).booleanValue();
                        byte[] bArr2 = C5378y.f42629b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = ((String) p0.s(abstractC5376w, j11)).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = p0.s(abstractC5376w, j11).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = p0.s(abstractC5376w, j11).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (n(abstractC5376w, i16, i15)) {
                        i12 = i14 * 53;
                        q11 = w(abstractC5376w, j11);
                        i14 = i12 + q11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (n(abstractC5376w, i16, i15)) {
                        i12 = i14 * 53;
                        q11 = w(abstractC5376w, j11);
                        i14 = i12 + q11;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (n(abstractC5376w, i16, i15)) {
                        i12 = i14 * 53;
                        q11 = w(abstractC5376w, j11);
                        i14 = i12 + q11;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5378y.b(x(abstractC5376w, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (n(abstractC5376w, i16, i15)) {
                        i12 = i14 * 53;
                        q11 = w(abstractC5376w, j11);
                        i14 = i12 + q11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5378y.b(x(abstractC5376w, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (n(abstractC5376w, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = p0.s(abstractC5376w, j11).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.f42492m.g(abstractC5376w).hashCode() + (i14 * 53);
        return this.f42485f ? (hashCode * 53) + this.f42493n.c(abstractC5376w).hashCode() : hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [androidx.datastore.preferences.protobuf.f0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean isInitialized(T t2) {
        int i11;
        int i12;
        int i13;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < this.f42488i) {
            int i17 = this.f42487h[i16];
            int[] iArr = this.f42480a;
            int i18 = iArr[i17];
            int J11 = J(i17);
            int i19 = iArr[i17 + 2];
            int i21 = i19 & 1048575;
            int i22 = 1 << (i19 >>> 20);
            if (i21 != i14) {
                if (i21 != 1048575) {
                    i15 = f42478q.getInt(t2, i21);
                }
                i12 = i17;
                i13 = i15;
                i11 = i21;
            } else {
                int i23 = i15;
                i11 = i14;
                i12 = i17;
                i13 = i23;
            }
            if ((268435456 & J11) == 0 || l(t2, i12, i11, i13, i22)) {
                int I11 = I(J11);
                if (I11 == 9 || I11 == 17) {
                    if (l(t2, i12, i11, i13, i22) && !j(i12).isInitialized(p0.s(t2, J11 & 1048575))) {
                    }
                    i16++;
                    i14 = i11;
                    i15 = i13;
                } else {
                    if (I11 != 27) {
                        if (I11 == 60 || I11 == 68) {
                            if (n(t2, i18, i12) && !j(i12).isInitialized(p0.s(t2, J11 & 1048575))) {
                            }
                            i16++;
                            i14 = i11;
                            i15 = i13;
                        } else if (I11 != 49) {
                            if (I11 != 50) {
                                continue;
                            } else {
                                Object s11 = p0.s(t2, J11 & 1048575);
                                L l11 = this.f42494o;
                                K forMapData = l11.forMapData(s11);
                                if (!forMapData.isEmpty() && l11.forMapMetadata(i(i12)).f42470b.a() == s0.MESSAGE) {
                                    ?? r52 = 0;
                                    for (Object obj : forMapData.values()) {
                                        r52 = r52;
                                        if (r52 == 0) {
                                            r52 = c0.a().b(obj.getClass());
                                        }
                                        if (!r52.isInitialized(obj)) {
                                        }
                                    }
                                }
                            }
                            i16++;
                            i14 = i11;
                            i15 = i13;
                        }
                    }
                    List list = (List) p0.s(t2, J11 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? j11 = j(i12);
                        for (int i24 = 0; i24 < list.size(); i24++) {
                            if (j11.isInitialized(list.get(i24))) {
                            }
                        }
                    }
                    i16++;
                    i14 = i11;
                    i15 = i13;
                }
            }
            return false;
        }
        if (this.f42485f) {
            this.f42493n.c(t2).k();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f0
    public final void makeImmutable(T t2) {
        if (m(t2)) {
            if (t2 instanceof AbstractC5376w) {
                AbstractC5376w abstractC5376w = (AbstractC5376w) t2;
                abstractC5376w.f(Integer.MAX_VALUE);
                abstractC5376w.memoizedHashCode = 0;
                abstractC5376w.o();
            }
            int[] iArr = this.f42480a;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int J11 = J(i11);
                long j11 = 1048575 & J11;
                int I11 = I(J11);
                if (I11 != 9) {
                    if (I11 != 60 && I11 != 68) {
                        switch (I11) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            case 38:
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f42491l.makeImmutableListAt(t2, j11);
                                break;
                            case 50:
                                Unsafe unsafe = f42478q;
                                Object object = unsafe.getObject(t2, j11);
                                if (object != null) {
                                    unsafe.putObject(t2, j11, this.f42494o.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (n(t2, iArr[i11], i11)) {
                        j(i11).makeImmutable(f42478q.getObject(t2, j11));
                    }
                }
                if (k(t2, i11)) {
                    j(i11).makeImmutable(f42478q.getObject(t2, j11));
                }
            }
            this.f42492m.j(t2);
            if (this.f42485f) {
                this.f42493n.f(t2);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void mergeFrom(T t2, T t11) {
        if (!m(t2)) {
            throw new IllegalArgumentException(U7.m.b(t2, "Mutating immutable message: "));
        }
        t11.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f42480a;
            if (i11 >= iArr.length) {
                int i12 = g0.f42523d;
                m0<?, ?> m0Var = this.f42492m;
                m0Var.o(t2, m0Var.k(m0Var.g(t2), m0Var.g(t11)));
                if (this.f42485f) {
                    AbstractC5370p<?> abstractC5370p = this.f42493n;
                    C5372s<?> c11 = abstractC5370p.c(t11);
                    if (c11.i()) {
                        return;
                    }
                    abstractC5370p.d(t2).o(c11);
                    return;
                }
                return;
            }
            int J11 = J(i11);
            long j11 = 1048575 & J11;
            int i13 = iArr[i11];
            switch (I(J11)) {
                case 0:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.A(t2, j11, p0.o(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 1:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.B(t2, j11, p0.p(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 2:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.D(t2, j11, p0.r(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 3:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.D(t2, j11, p0.r(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 4:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.C(t2, j11, p0.q(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 5:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.D(t2, j11, p0.r(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 6:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.C(t2, j11, p0.q(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 7:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.w(t2, j11, p0.n(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 8:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.E(t2, j11, p0.s(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 9:
                    q(t2, t11, i11);
                    break;
                case 10:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.E(t2, j11, p0.s(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 11:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.C(t2, j11, p0.q(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 12:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.C(t2, j11, p0.q(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 13:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.C(t2, j11, p0.q(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 14:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.D(t2, j11, p0.r(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 15:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.C(t2, j11, p0.q(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 16:
                    if (!k(t11, i11)) {
                        break;
                    } else {
                        p0.D(t2, j11, p0.r(t11, j11));
                        E(t2, i11);
                        break;
                    }
                case 17:
                    q(t2, t11, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f42491l.mergeListsAt(t2, t11, j11);
                    break;
                case 50:
                    int i14 = g0.f42523d;
                    p0.E(t2, j11, this.f42494o.mergeFrom(p0.s(t2, j11), p0.s(t11, j11)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!n(t11, i13, i11)) {
                        break;
                    } else {
                        p0.E(t2, j11, p0.s(t11, j11));
                        F(t2, i13, i11);
                        break;
                    }
                case 60:
                    r(t2, t11, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (!n(t11, i13, i11)) {
                        break;
                    } else {
                        p0.E(t2, j11, p0.s(t11, j11));
                        F(t2, i13, i11);
                        break;
                    }
                case 68:
                    r(t2, t11, i11);
                    break;
            }
            i11 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final T newInstance() {
        return (T) this.f42490k.newInstance(this.f42484e);
    }
}
