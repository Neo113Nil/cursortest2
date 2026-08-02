package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes5.dex */
public final class s extends AbstractC1177a {
    public final kotlinx.serialization.json.h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlinx.serialization.json.b json, kotlinx.serialization.json.h value, String str) {
        super(json, value, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f = value;
        this.a.add("primitive");
    }

    @Override // kotlinx.serialization.encoding.c
    public final int decodeElementIndex(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a
    public final kotlinx.serialization.json.h r(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return this.f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a
    public final kotlinx.serialization.json.h t() {
        return this.f;
    }
}
