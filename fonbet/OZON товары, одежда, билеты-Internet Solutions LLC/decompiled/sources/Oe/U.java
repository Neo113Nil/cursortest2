package Oe;

import Me.e;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.C7722d;
import kotlin.jvm.internal.C7723e;
import kotlin.jvm.internal.C7725g;
import kotlin.jvm.internal.C7729k;
import kotlin.jvm.internal.C7730l;
import kotlin.jvm.internal.C7738u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import we.C10541a;

/* loaded from: classes10.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f20272a;

    static {
        kotlin.reflect.d b11 = kotlin.jvm.internal.N.b(String.class);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.T.f71792a, "<this>");
        Pair pair = new Pair(b11, Z.f20279a);
        kotlin.reflect.d b12 = kotlin.jvm.internal.N.b(Character.TYPE);
        Intrinsics.checkNotNullParameter(C7725g.f71805a, "<this>");
        Pair pair2 = new Pair(b12, C3692k.f20305a);
        Pair pair3 = new Pair(kotlin.jvm.internal.N.b(char[].class), C3691j.f20302c);
        kotlin.reflect.d b13 = kotlin.jvm.internal.N.b(Double.TYPE);
        Intrinsics.checkNotNullParameter(C7729k.f71812a, "<this>");
        Pair pair4 = new Pair(b13, C3695n.f20309a);
        Pair pair5 = new Pair(kotlin.jvm.internal.N.b(double[].class), C3694m.f20308c);
        kotlin.reflect.d b14 = kotlin.jvm.internal.N.b(Float.TYPE);
        Intrinsics.checkNotNullParameter(C7730l.f71813a, "<this>");
        Pair pair6 = new Pair(b14, C3698q.f20314a);
        Pair pair7 = new Pair(kotlin.jvm.internal.N.b(float[].class), C3697p.f20313c);
        kotlin.reflect.d b15 = kotlin.jvm.internal.N.b(Long.TYPE);
        Intrinsics.checkNotNullParameter(C7738u.f71818a, "<this>");
        Pair pair8 = new Pair(b15, B.f20236a);
        Pair pair9 = new Pair(kotlin.jvm.internal.N.b(long[].class), C3681A.f20235c);
        kotlin.reflect.d b16 = kotlin.jvm.internal.N.b(Sc.C.class);
        Intrinsics.checkNotNullParameter(Sc.C.INSTANCE, "<this>");
        Pair pair10 = new Pair(b16, f0.f20292a);
        Pair pair11 = new Pair(kotlin.jvm.internal.N.b(Sc.D.class), e0.f20289c);
        kotlin.reflect.d b17 = kotlin.jvm.internal.N.b(Integer.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r.f71817a, "<this>");
        Pair pair12 = new Pair(b17, C3703w.f20319a);
        Pair pair13 = new Pair(kotlin.jvm.internal.N.b(int[].class), C3702v.f20318c);
        kotlin.reflect.d b18 = kotlin.jvm.internal.N.b(Sc.A.class);
        Intrinsics.checkNotNullParameter(Sc.A.INSTANCE, "<this>");
        Pair pair14 = new Pair(b18, d0.f20286a);
        Pair pair15 = new Pair(kotlin.jvm.internal.N.b(Sc.B.class), c0.f20284c);
        kotlin.reflect.d b19 = kotlin.jvm.internal.N.b(Short.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.Q.f71790a, "<this>");
        Pair pair16 = new Pair(b19, Y.f20277a);
        Pair pair17 = new Pair(kotlin.jvm.internal.N.b(short[].class), X.f20276c);
        kotlin.reflect.d b21 = kotlin.jvm.internal.N.b(Sc.F.class);
        Intrinsics.checkNotNullParameter(Sc.F.INSTANCE, "<this>");
        Pair pair18 = new Pair(b21, h0.f20298a);
        Pair pair19 = new Pair(kotlin.jvm.internal.N.b(Sc.G.class), g0.f20295c);
        kotlin.reflect.d b22 = kotlin.jvm.internal.N.b(Byte.TYPE);
        Intrinsics.checkNotNullParameter(C7723e.f71803a, "<this>");
        Pair pair20 = new Pair(b22, C3689h.f20296a);
        Pair pair21 = new Pair(kotlin.jvm.internal.N.b(byte[].class), C3688g.f20294c);
        kotlin.reflect.d b23 = kotlin.jvm.internal.N.b(Sc.y.class);
        Intrinsics.checkNotNullParameter(Sc.y.INSTANCE, "<this>");
        Pair pair22 = new Pair(b23, b0.f20282a);
        Pair pair23 = new Pair(kotlin.jvm.internal.N.b(Sc.z.class), a0.f20281c);
        kotlin.reflect.d b24 = kotlin.jvm.internal.N.b(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(C7722d.f71802a, "<this>");
        Pair pair24 = new Pair(b24, C3687f.f20290a);
        Pair pair25 = new Pair(kotlin.jvm.internal.N.b(boolean[].class), C3686e.f20288c);
        kotlin.reflect.d b25 = kotlin.jvm.internal.N.b(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.f71690a, "<this>");
        Pair pair26 = new Pair(b25, i0.f20300b);
        Pair pair27 = new Pair(kotlin.jvm.internal.N.b(Void.class), F.f20245a);
        kotlin.reflect.d b26 = kotlin.jvm.internal.N.b(kotlin.time.b.class);
        Intrinsics.checkNotNullParameter(kotlin.time.b.INSTANCE, "<this>");
        Pair pair28 = new Pair(b26, C3696o.f20311a);
        kotlin.reflect.d b27 = kotlin.jvm.internal.N.b(C10541a.class);
        Intrinsics.checkNotNullParameter(C10541a.f104399a, "<this>");
        f20272a = kotlin.collections.U.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, new Pair(b27, j0.f20303a));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static final T a(@NotNull e.i kind) {
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Iterator it = f20272a.keySet().iterator();
        while (it.hasNext()) {
            String B11 = ((kotlin.reflect.d) it.next()).B();
            Intrinsics.f(B11);
            String b11 = b(B11);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + b11) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(b11)) {
                throw new IllegalArgumentException(kotlin.text.h.E0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + b(b11) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        return new T("kotlinx.serialization.json.JsonLiteral", kind);
    }

    private static final String b(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(charAt) ? CharsKt.d(charAt) : String.valueOf(charAt)));
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }
}
