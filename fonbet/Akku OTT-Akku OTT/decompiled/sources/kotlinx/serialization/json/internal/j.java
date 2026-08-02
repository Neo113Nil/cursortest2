package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStringsKt;

@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n384#2,5:392\n384#2,5:397\n384#2,5:402\n384#2,5:407\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n377#1:392,5\n378#1:397,5\n379#1:402,5\n380#1:407,5\n*E\n"})
/* loaded from: classes5.dex */
public final class j extends kotlinx.serialization.encoding.a {
    public final F a;
    public final kotlinx.serialization.modules.d b;

    public j(F lexer, kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.a = lexer;
        this.b = json.b;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final byte decodeByte() {
        F f = this.a;
        String j = f.j();
        try {
            return UStringsKt.toUByte(j);
        } catch (IllegalArgumentException unused) {
            F.m(f, androidx.compose.runtime.t.c("Failed to parse type 'UByte' for input '", '\'', j), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public final int decodeElementIndex(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final int decodeInt() {
        F f = this.a;
        String j = f.j();
        try {
            return UStringsKt.toUInt(j);
        } catch (IllegalArgumentException unused) {
            F.m(f, androidx.compose.runtime.t.c("Failed to parse type 'UInt' for input '", '\'', j), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final long decodeLong() {
        F f = this.a;
        String j = f.j();
        try {
            return UStringsKt.toULong(j);
        } catch (IllegalArgumentException unused) {
            F.m(f, androidx.compose.runtime.t.c("Failed to parse type 'ULong' for input '", '\'', j), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final short decodeShort() {
        F f = this.a;
        String j = f.j();
        try {
            return UStringsKt.toUShort(j);
        } catch (IllegalArgumentException unused) {
            F.m(f, androidx.compose.runtime.t.c("Failed to parse type 'UShort' for input '", '\'', j), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public final kotlinx.serialization.modules.d getSerializersModule() {
        return this.b;
    }
}
