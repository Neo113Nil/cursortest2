package defpackage;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b == -127) {
            Object readValue = readValue(buffer);
            List pigeonVar_list = readValue instanceof List ? (List) readValue : null;
            if (pigeonVar_list != null) {
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
                return new c((Boolean) pigeonVar_list.get(0));
            }
        } else {
            if (b != -126) {
                return super.readValueOfType(b, buffer);
            }
            Object readValue2 = readValue(buffer);
            List pigeonVar_list2 = readValue2 instanceof List ? (List) readValue2 : null;
            if (pigeonVar_list2 != null) {
                b.Companion.getClass();
                Intrinsics.checkNotNullParameter(pigeonVar_list2, "pigeonVar_list");
                return new b((Boolean) pigeonVar_list2.get(0));
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (obj instanceof c) {
            stream.write(129);
            writeValue(stream, CollectionsKt.listOf(((c) obj).a));
        } else if (!(obj instanceof b)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(130);
            writeValue(stream, CollectionsKt.listOf(((b) obj).a));
        }
    }
}
