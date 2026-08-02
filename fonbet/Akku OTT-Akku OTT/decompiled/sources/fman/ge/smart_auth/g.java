package fman.ge.smart_auth;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b != -127) {
            return super.readValueOfType(b, buffer);
        }
        Object readValue = readValue(buffer);
        List pigeonVar_list = readValue instanceof List ? (List) readValue : null;
        if (pigeonVar_list == null) {
            return null;
        }
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
        return new f((String) pigeonVar_list.get(0));
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (!(obj instanceof f)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(129);
            writeValue(stream, CollectionsKt.listOf(((f) obj).a));
        }
    }
}
