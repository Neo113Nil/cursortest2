package com.amplitude.id;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.v;
import kotlinx.serialization.json.x;

/* loaded from: classes3.dex */
public final class b {
    public static final Object b(kotlinx.serialization.json.b bVar, String discriminator, x element, kotlinx.serialization.a deserializer) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new v(bVar, element, discriminator, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
    }

    public h a(d configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new a(configuration);
    }
}
