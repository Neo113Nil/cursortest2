package Cd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Cd.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2739A {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C2739A f4676d = new C2739A(y.a(), a.f4680a);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f4677a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Sd.c, L> f4678b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4679c;

    /* renamed from: Cd.A$a */
    /* synthetic */ class a extends C7734p implements Function1<Sd.c, L> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4680a = new a(1);

        @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final kotlin.reflect.g getOwner() {
            return kotlin.jvm.internal.N.d(y.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // kotlin.jvm.functions.Function1
        public final L invoke(Sd.c cVar) {
            Sd.c p02 = cVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return y.b(p02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2739A(@NotNull D jsr305, @NotNull Function1<? super Sd.c, ? extends L> getReportLevelForAnnotation) {
        boolean z11;
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f4677a = jsr305;
        this.f4678b = getReportLevelForAnnotation;
        if (!jsr305.e()) {
            if (((a) getReportLevelForAnnotation).invoke(y.c()) != L.IGNORE) {
                z11 = false;
                this.f4679c = z11;
            }
        }
        z11 = true;
        this.f4679c = z11;
    }

    public final boolean b() {
        return this.f4679c;
    }

    @NotNull
    public final Function1<Sd.c, L> c() {
        return this.f4678b;
    }

    @NotNull
    public final D d() {
        return this.f4677a;
    }

    @NotNull
    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f4677a + ", getReportLevelForAnnotation=" + this.f4678b + ')';
    }
}
