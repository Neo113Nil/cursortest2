package Cd;

import Cd.H;
import Sc.C4007i;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4786a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Sd.c[] f4787b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final J f4788c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final z f4789d;

    static {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        z zVar5;
        z zVar6;
        z zVar7;
        z zVar8;
        z zVar9;
        z zVar10;
        z zVar11;
        z zVar12;
        Sd.c cVar = new Sd.c("org.jspecify.nullness");
        Sd.c cVar2 = new Sd.c("org.jspecify.annotations");
        f4786a = cVar2;
        Sd.c cVar3 = new Sd.c("io.reactivex.rxjava3.annotations");
        Sd.c cVar4 = new Sd.c("org.checkerframework.checker.nullness.compatqual");
        String b11 = cVar3.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        f4787b = new Sd.c[]{new Sd.c(U7.d.e(b11, ".Nullable")), new Sd.c(U7.d.e(b11, ".NonNull"))};
        Sd.c cVar5 = new Sd.c("org.jetbrains.annotations");
        zVar = z.f4790d;
        Pair pair = new Pair(cVar5, zVar);
        Sd.c cVar6 = new Sd.c("androidx.annotation");
        zVar2 = z.f4790d;
        Pair pair2 = new Pair(cVar6, zVar2);
        Sd.c cVar7 = new Sd.c("android.support.annotation");
        zVar3 = z.f4790d;
        Pair pair3 = new Pair(cVar7, zVar3);
        Sd.c cVar8 = new Sd.c("android.annotation");
        zVar4 = z.f4790d;
        Pair pair4 = new Pair(cVar8, zVar4);
        Sd.c cVar9 = new Sd.c("com.android.annotations");
        zVar5 = z.f4790d;
        Pair pair5 = new Pair(cVar9, zVar5);
        Sd.c cVar10 = new Sd.c("org.eclipse.jdt.annotation");
        zVar6 = z.f4790d;
        Pair pair6 = new Pair(cVar10, zVar6);
        Sd.c cVar11 = new Sd.c("org.checkerframework.checker.nullness.qual");
        zVar7 = z.f4790d;
        Pair pair7 = new Pair(cVar11, zVar7);
        zVar8 = z.f4790d;
        Pair pair8 = new Pair(cVar4, zVar8);
        Sd.c cVar12 = new Sd.c("javax.annotation");
        zVar9 = z.f4790d;
        Pair pair9 = new Pair(cVar12, zVar9);
        Sd.c cVar13 = new Sd.c("edu.umd.cs.findbugs.annotations");
        zVar10 = z.f4790d;
        Pair pair10 = new Pair(cVar13, zVar10);
        Sd.c cVar14 = new Sd.c("io.reactivex.annotations");
        zVar11 = z.f4790d;
        Pair pair11 = new Pair(cVar14, zVar11);
        Sd.c cVar15 = new Sd.c("androidx.annotation.RecentlyNullable");
        L l11 = L.WARN;
        Pair pair12 = new Pair(cVar15, new z(l11, 4));
        Pair pair13 = new Pair(new Sd.c("androidx.annotation.RecentlyNonNull"), new z(l11, 4));
        Sd.c cVar16 = new Sd.c("lombok");
        zVar12 = z.f4790d;
        Pair pair14 = new Pair(cVar16, zVar12);
        C4007i c4007i = new C4007i(2, 1, 0);
        L l12 = L.STRICT;
        f4788c = new J(U.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(cVar, new z(l11, c4007i, l12)), new Pair(cVar2, new z(l11, new C4007i(2, 1, 0), l12)), new Pair(cVar3, new z(l11, new C4007i(1, 8, 0), l12))));
        f4789d = new z(l11, 4);
    }

    public static D a() {
        C4007i configuredKotlinVersion = C4007i.f26099f;
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        z zVar = f4789d;
        L globalReportLevel = (zVar.d() == null || zVar.d().compareTo(configuredKotlinVersion) > 0) ? zVar.c() : zVar.b();
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        return new D(globalReportLevel, globalReportLevel == L.WARN ? null : globalReportLevel);
    }

    @NotNull
    public static final L b(@NotNull Sd.c annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotationFqName");
        H.f4724a.getClass();
        J configuredReportLevels = H.a.a();
        C4007i configuredKotlinVersion = new C4007i(1, 7, 20);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        L l11 = (L) configuredReportLevels.b(annotation);
        if (l11 != null) {
            return l11;
        }
        z zVar = (z) f4788c.b(annotation);
        return zVar == null ? L.IGNORE : (zVar.d() == null || zVar.d().compareTo(configuredKotlinVersion) > 0) ? zVar.c() : zVar.b();
    }

    @NotNull
    public static final Sd.c c() {
        return f4786a;
    }

    @NotNull
    public static final Sd.c[] d() {
        return f4787b;
    }
}
