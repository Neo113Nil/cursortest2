package W2;

import R2.C3909c;
import R2.a0;
import Sc.o;
import V2.g;
import V2.h;
import V2.i;
import W2.f;
import androidx.datastore.preferences.protobuf.AbstractC5362h;
import androidx.datastore.preferences.protobuf.C5378y;
import androidx.datastore.preferences.protobuf.C5379z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h implements a0<f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f33210a = new h();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33211a;

        static {
            int[] iArr = new int[i.b.values().length];
            try {
                iArr[i.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f33211a = iArr;
        }
    }

    public final Object a(@NotNull InputStream input, @NotNull kotlin.coroutines.jvm.internal.c cVar) throws IOException, C3909c {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            V2.g x11 = V2.g.x(input);
            Intrinsics.checkNotNullExpressionValue(x11, "{\n                Prefer…From(input)\n            }");
            b b11 = g.b(new f.b[0]);
            Map<String, V2.i> v11 = x11.v();
            Intrinsics.checkNotNullExpressionValue(v11, "preferencesProto.preferencesMap");
            for (Map.Entry<String, V2.i> entry : v11.entrySet()) {
                String name = entry.getKey();
                V2.i value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                i.b L11 = value.L();
                switch (L11 == null ? -1 : a.f33211a[L11.ordinal()]) {
                    case -1:
                        throw new C3909c("Value case is null.");
                    case 0:
                    default:
                        throw new o();
                    case 1:
                        f.a<Boolean> key = i.a(name);
                        Boolean valueOf = Boolean.valueOf(value.C());
                        Intrinsics.checkNotNullParameter(key, "key");
                        b11.j(key, valueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        f.a<?> key2 = new f.a<>(name);
                        Float valueOf2 = Float.valueOf(value.G());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        b11.j(key2, valueOf2);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        f.a<?> key3 = new f.a<>(name);
                        Double valueOf3 = Double.valueOf(value.F());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        b11.j(key3, valueOf3);
                        break;
                    case 4:
                        f.a<Integer> key4 = i.b(name);
                        Integer valueOf4 = Integer.valueOf(value.H());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        b11.j(key4, valueOf4);
                        break;
                    case 5:
                        Intrinsics.checkNotNullParameter(name, "name");
                        f.a<?> key5 = new f.a<>(name);
                        Long valueOf5 = Long.valueOf(value.I());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        b11.j(key5, valueOf5);
                        break;
                    case 6:
                        f.a<String> key6 = i.c(name);
                        String J11 = value.J();
                        Intrinsics.checkNotNullExpressionValue(J11, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        b11.j(key6, J11);
                        break;
                    case 7:
                        f.a<Set<String>> key7 = i.d(name);
                        C5378y.c w11 = value.K().w();
                        Intrinsics.checkNotNullExpressionValue(w11, "value.stringSet.stringsList");
                        Set Y02 = C7714v.Y0(w11);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        b11.j(key7, Y02);
                        break;
                    case 8:
                        Intrinsics.checkNotNullParameter(name, "name");
                        f.a<?> key8 = new f.a<>(name);
                        byte[] m11 = value.D().m();
                        Intrinsics.checkNotNullExpressionValue(m11, "value.bytes.toByteArray()");
                        Intrinsics.checkNotNullParameter(key8, "key");
                        b11.j(key8, m11);
                        break;
                    case 9:
                        throw new C3909c("Value not set.");
                }
            }
            return new b(U.u(b11.a()), true);
        } catch (C5379z e11) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new C3909c("Unable to parse preferences proto.", e11);
        }
    }

    public final Object b(Object obj, OutputStream outputStream, kotlin.coroutines.jvm.internal.c cVar) {
        V2.i c11;
        Map<f.a<?>, Object> a11 = ((f) obj).a();
        g.a w11 = V2.g.w();
        for (Map.Entry<f.a<?>, Object> entry : a11.entrySet()) {
            f.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String a12 = key.a();
            if (value instanceof Boolean) {
                i.a M11 = V2.i.M();
                M11.f(((Boolean) value).booleanValue());
                c11 = M11.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                i.a M12 = V2.i.M();
                M12.i(((Number) value).floatValue());
                c11 = M12.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                i.a M13 = V2.i.M();
                M13.h(((Number) value).doubleValue());
                c11 = M13.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                i.a M14 = V2.i.M();
                M14.j(((Number) value).intValue());
                c11 = M14.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                i.a M15 = V2.i.M();
                M15.k(((Number) value).longValue());
                c11 = M15.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                i.a M16 = V2.i.M();
                M16.l((String) value);
                c11 = M16.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                i.a M17 = V2.i.M();
                h.a x11 = V2.h.x();
                Intrinsics.g(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                x11.f((Set) value);
                M17.m(x11);
                c11 = M17.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i.a M18 = V2.i.M();
                byte[] bArr = (byte[]) value;
                AbstractC5362h abstractC5362h = AbstractC5362h.f42524b;
                M18.g(AbstractC5362h.e(0, bArr.length, bArr));
                c11 = M18.c();
                Intrinsics.checkNotNullExpressionValue(c11, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            w11.f(c11, a12);
        }
        w11.c().g(outputStream);
        return Unit.f71690a;
    }
}
