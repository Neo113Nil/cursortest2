package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "readValueOfType", "", "type", "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", "value", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidWebkitLibrary.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWebkitLibrary.g.kt\nio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,6854:1\n1#2:6855\n*E\n"})
/* loaded from: classes3.dex */
class AndroidWebkitLibraryPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte type, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (type == -127) {
            Long l = (Long) readValue(buffer);
            if (l == null) {
                return null;
            }
            return FileChooserMode.INSTANCE.ofRaw((int) l.longValue());
        }
        if (type == -126) {
            Long l2 = (Long) readValue(buffer);
            if (l2 == null) {
                return null;
            }
            return ConsoleMessageLevel.INSTANCE.ofRaw((int) l2.longValue());
        }
        if (type == -125) {
            Long l3 = (Long) readValue(buffer);
            if (l3 == null) {
                return null;
            }
            return OverScrollMode.INSTANCE.ofRaw((int) l3.longValue());
        }
        if (type == -124) {
            Long l4 = (Long) readValue(buffer);
            if (l4 == null) {
                return null;
            }
            return SslErrorType.INSTANCE.ofRaw((int) l4.longValue());
        }
        if (type != -123) {
            return super.readValueOfType(type, buffer);
        }
        Long l5 = (Long) readValue(buffer);
        if (l5 == null) {
            return null;
        }
        return MixedContentMode.INSTANCE.ofRaw((int) l5.longValue());
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object value) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (value instanceof FileChooserMode) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((FileChooserMode) value).getRaw()));
            return;
        }
        if (value instanceof ConsoleMessageLevel) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((ConsoleMessageLevel) value).getRaw()));
            return;
        }
        if (value instanceof OverScrollMode) {
            stream.write(131);
            writeValue(stream, Long.valueOf(((OverScrollMode) value).getRaw()));
        } else if (value instanceof SslErrorType) {
            stream.write(132);
            writeValue(stream, Long.valueOf(((SslErrorType) value).getRaw()));
        } else if (!(value instanceof MixedContentMode)) {
            super.writeValue(stream, value);
        } else {
            stream.write(133);
            writeValue(stream, Long.valueOf(((MixedContentMode) value).getRaw()));
        }
    }
}
