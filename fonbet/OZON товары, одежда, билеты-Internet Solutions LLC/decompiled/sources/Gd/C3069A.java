package Gd;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Gd.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final /* synthetic */ class C3069A extends C7734p implements Function1<Sd.f, Collection<? extends td.c0>> {
    C3069A(C3070B c3070b) {
        super(1, c3070b);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return kotlin.jvm.internal.N.b(C3070B.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Collection<? extends td.c0> invoke(Sd.f fVar) {
        ArrayList i02;
        Sd.f p02 = fVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        i02 = ((C3070B) this.receiver).i0(p02);
        return i02;
    }
}
