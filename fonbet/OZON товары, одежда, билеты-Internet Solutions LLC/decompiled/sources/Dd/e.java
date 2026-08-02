package Dd;

import Cd.F;
import Gd.C3080j;
import Jd.InterfaceC3391a;
import Sd.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Sd.f f6570a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Sd.f f6571b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Sd.f f6572c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f6573d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6574e = 0;

    static {
        Sd.f f7 = Sd.f.f("message");
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        f6570a = f7;
        Sd.f f11 = Sd.f.f("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        f6571b = f11;
        Sd.f f12 = Sd.f.f(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(f12, "identifier(...)");
        f6572c = f12;
        f6573d = U.j(new Pair(s.a.f81920t, F.f4692c), new Pair(s.a.f81923w, F.f4693d), new Pair(s.a.f81924x, F.f4695f));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static Ed.g a(@NotNull Sd.c kotlinName, @NotNull Jd.d annotationOwner, @NotNull Fd.k c11) {
        InterfaceC3391a j11;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c11, "c");
        if (Intrinsics.d(kotlinName, s.a.f81913m)) {
            Sd.c DEPRECATED_ANNOTATION = F.f4694e;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC3391a j12 = annotationOwner.j(DEPRECATED_ANNOTATION);
            if (j12 != null) {
                return new i(j12, c11);
            }
        }
        Sd.c cVar = (Sd.c) f6573d.get(kotlinName);
        if (cVar == null || (j11 = annotationOwner.j(cVar)) == null) {
            return null;
        }
        return e(c11, j11, false);
    }

    @NotNull
    public static Sd.f b() {
        return f6570a;
    }

    @NotNull
    public static Sd.f c() {
        return f6572c;
    }

    @NotNull
    public static Sd.f d() {
        return f6571b;
    }

    public static Ed.g e(@NotNull Fd.k c11, @NotNull InterfaceC3391a annotation, boolean z11) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c11, "c");
        Sd.b b11 = annotation.b();
        Sd.c TARGET_ANNOTATION = F.f4692c;
        Intrinsics.checkNotNullExpressionValue(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (b11.equals(b.a.b(TARGET_ANNOTATION))) {
            return new o(annotation, c11);
        }
        Sd.c RETENTION_ANNOTATION = F.f4693d;
        Intrinsics.checkNotNullExpressionValue(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (b11.equals(b.a.b(RETENTION_ANNOTATION))) {
            return new m(annotation, c11);
        }
        Sd.c DOCUMENTED_ANNOTATION = F.f4695f;
        Intrinsics.checkNotNullExpressionValue(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (b11.equals(b.a.b(DOCUMENTED_ANNOTATION))) {
            return new d(c11, annotation, s.a.f81924x);
        }
        Sd.c DEPRECATED_ANNOTATION = F.f4694e;
        Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (b11.equals(b.a.b(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C3080j(c11, annotation, z11);
    }
}
