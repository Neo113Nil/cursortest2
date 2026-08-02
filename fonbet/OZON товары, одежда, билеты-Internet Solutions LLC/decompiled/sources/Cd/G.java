package Cd;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* loaded from: classes10.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4707a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4708b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4709c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4710d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4711e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4712f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4713g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4714h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4715i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f4716j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f4717k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f4718l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f4719m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f4720n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f4721o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final Object f4722p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final Sd.c f4723q;

    static {
        Sd.c cVar = new Sd.c("org.jspecify.nullness.Nullable");
        Sd.c cVar2 = new Sd.c("org.jspecify.nullness.NullMarked");
        f4707a = cVar2;
        Sd.c cVar3 = new Sd.c("org.jspecify.nullness.NullnessUnspecified");
        Sd.c cVar4 = new Sd.c("org.jspecify.annotations.NonNull");
        Sd.c cVar5 = new Sd.c("org.jspecify.annotations.Nullable");
        Sd.c cVar6 = new Sd.c("org.jspecify.annotations.NullMarked");
        f4708b = cVar6;
        Sd.c cVar7 = new Sd.c("org.jspecify.annotations.NullnessUnspecified");
        Sd.c cVar8 = new Sd.c("org.jspecify.annotations.NullUnmarked");
        f4709c = cVar8;
        f4710d = new Sd.c("javax.annotation.meta.TypeQualifier");
        f4711e = new Sd.c("javax.annotation.meta.TypeQualifierNickname");
        f4712f = new Sd.c("javax.annotation.meta.TypeQualifierDefault");
        Sd.c cVar9 = new Sd.c("javax.annotation.Nonnull");
        f4713g = cVar9;
        Sd.c cVar10 = new Sd.c("javax.annotation.Nullable");
        Sd.c cVar11 = new Sd.c("javax.annotation.CheckForNull");
        f4714h = new Sd.c("javax.annotation.ParametersAreNonnullByDefault");
        f4715i = new Sd.c("javax.annotation.ParametersAreNullableByDefault");
        Sd.c[] elements = {cVar9, cVar11};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f4716j = C7705l.j0(elements);
        Sd.c[] elements2 = {F.f4697h, cVar4, new Sd.c("android.annotation.NonNull"), new Sd.c("androidx.annotation.NonNull"), new Sd.c("androidx.annotation.RecentlyNonNull"), new Sd.c("android.support.annotation.NonNull"), new Sd.c("com.android.annotations.NonNull"), new Sd.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new Sd.c("org.checkerframework.checker.nullness.qual.NonNull"), new Sd.c("edu.umd.cs.findbugs.annotations.NonNull"), new Sd.c("io.reactivex.annotations.NonNull"), new Sd.c("io.reactivex.rxjava3.annotations.NonNull"), new Sd.c("org.eclipse.jdt.annotation.NonNull"), new Sd.c("lombok.NonNull")};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Set<Sd.c> j02 = C7705l.j0(elements2);
        f4717k = j02;
        Sd.c[] elements3 = {F.f4698i, cVar, cVar5, cVar10, cVar11, new Sd.c("android.annotation.Nullable"), new Sd.c("androidx.annotation.Nullable"), new Sd.c("androidx.annotation.RecentlyNullable"), new Sd.c("android.support.annotation.Nullable"), new Sd.c("com.android.annotations.Nullable"), new Sd.c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new Sd.c("org.checkerframework.checker.nullness.qual.Nullable"), new Sd.c("edu.umd.cs.findbugs.annotations.Nullable"), new Sd.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new Sd.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new Sd.c("io.reactivex.annotations.Nullable"), new Sd.c("io.reactivex.rxjava3.annotations.Nullable"), new Sd.c("org.eclipse.jdt.annotation.Nullable")};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set<Sd.c> j03 = C7705l.j0(elements3);
        f4718l = j03;
        Sd.c[] elements4 = {cVar3, cVar7};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        f4719m = C7705l.j0(elements4);
        e0.g(e0.g(e0.g(e0.g(e0.f(e0.f(new LinkedHashSet(), j02), j03), cVar9), cVar2), cVar6), cVar8);
        Sd.c[] elements5 = {F.f4700k, F.f4701l};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        f4720n = C7705l.j0(elements5);
        Sd.c[] elements6 = {F.f4699j, F.f4702m};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        f4721o = C7705l.j0(elements6);
        f4722p = U.j(new Pair(F.f4692c, s.a.f81920t), new Pair(F.f4693d, s.a.f81923w), new Pair(F.f4694e, s.a.f81913m), new Pair(F.f4695f, s.a.f81924x));
        f4723q = new Sd.c("kotlin.annotations.jvm.UnderMigration");
    }

    @NotNull
    public static final Set<Sd.c> a() {
        return f4716j;
    }

    @NotNull
    public static final Set<Sd.c> b() {
        return f4719m;
    }

    @NotNull
    public static final Sd.c c() {
        return f4713g;
    }

    @NotNull
    public static final Sd.c d() {
        return f4714h;
    }

    @NotNull
    public static final Sd.c e() {
        return f4715i;
    }

    @NotNull
    public static final Sd.c f() {
        return f4710d;
    }

    @NotNull
    public static final Sd.c g() {
        return f4712f;
    }

    @NotNull
    public static final Sd.c h() {
        return f4711e;
    }

    @NotNull
    public static final Sd.c i() {
        return f4708b;
    }

    @NotNull
    public static final Sd.c j() {
        return f4709c;
    }

    @NotNull
    public static final Sd.c k() {
        return f4707a;
    }

    @NotNull
    public static final Set<Sd.c> l() {
        return f4721o;
    }

    @NotNull
    public static final Set<Sd.c> m() {
        return f4717k;
    }

    @NotNull
    public static final Set<Sd.c> n() {
        return f4718l;
    }

    @NotNull
    public static final Set<Sd.c> o() {
        return f4720n;
    }

    @NotNull
    public static final Sd.c p() {
        return f4723q;
    }
}
