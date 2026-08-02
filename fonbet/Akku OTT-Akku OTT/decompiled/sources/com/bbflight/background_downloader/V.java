package com.bbflight.background_downloader;

import java.lang.Enum;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.e;

/* loaded from: classes3.dex */
public class V<T extends Enum<?>> implements kotlinx.serialization.b<T> {
    public final Function1<T, Integer> a;
    public final Function1<Integer, T> b;
    public final kotlinx.serialization.internal.J0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public V(String serialName, Function1<? super T, Integer> serialize, Function1<? super Integer, ? extends T> deserialize) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(serialize, "serialize");
        Intrinsics.checkNotNullParameter(deserialize, "deserialize");
        this.a = serialize;
        this.b = deserialize;
        this.c = kotlinx.serialization.descriptors.l.a(serialName, e.f.a);
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return this.b.invoke(Integer.valueOf(decoder.decodeInt()));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.c;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        Enum value = (Enum) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeInt(((Number) this.a.invoke(value)).intValue());
    }
}
