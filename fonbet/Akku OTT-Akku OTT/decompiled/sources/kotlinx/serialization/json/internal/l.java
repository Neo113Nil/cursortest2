package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {
    public final kotlinx.serialization.internal.E a;
    public boolean b;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<kotlinx.serialization.descriptors.f, Integer, Boolean> {
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(kotlinx.serialization.descriptors.f fVar, Integer num) {
            kotlinx.serialization.descriptors.f p0 = fVar;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            l lVar = (l) this.receiver;
            lVar.getClass();
            boolean z = !p0.i(intValue) && p0.g(intValue).b();
            lVar.b = z;
            return Boolean.valueOf(z);
        }
    }

    public l(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.a = new kotlinx.serialization.internal.E(descriptor, new a(2, this, l.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
