package NZ;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    public static final class a extends AbstractC7737t implements Function1<EZ.g, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18883b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(EZ.g gVar) {
            EZ.g it = gVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof NZ.a);
        }
    }

    public static final NZ.a a(@NotNull EZ.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        EZ.g c11 = hVar.c(a.f18883b);
        if (!(c11 instanceof NZ.a)) {
            c11 = null;
        }
        return (NZ.a) c11;
    }
}
