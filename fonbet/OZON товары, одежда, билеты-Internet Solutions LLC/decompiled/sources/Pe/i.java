package Pe;

import Me.C3618a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final /* synthetic */ class i implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3618a buildSerialDescriptor = (C3618a) obj;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C3618a.a(buildSerialDescriptor, "JsonPrimitive", new n(new Lb.c(1)));
        C3618a.a(buildSerialDescriptor, "JsonNull", new n(new Lb.e(1)));
        C3618a.a(buildSerialDescriptor, "JsonLiteral", new n(new j()));
        C3618a.a(buildSerialDescriptor, "JsonObject", new n(new k()));
        C3618a.a(buildSerialDescriptor, "JsonArray", new n(new l()));
        return Unit.f71690a;
    }
}
