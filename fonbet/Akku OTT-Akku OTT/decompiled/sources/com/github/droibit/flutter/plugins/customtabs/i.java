package com.github.droibit.flutter.plugins.customtabs;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return super.readValueOfType(b, buffer);
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        super.writeValue(stream, obj);
    }
}
