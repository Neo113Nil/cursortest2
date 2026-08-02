package androidx.savedstate.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.modules.d;
import kotlinx.serialization.modules.h;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/savedstate/serialization/EmptyArrayDecoder;", "Lkotlinx/serialization/encoding/a;", "<init>", "()V", "Lkotlinx/serialization/descriptors/f;", "descriptor", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/f;)I", "Lkotlinx/serialization/modules/d;", "serializersModule", "Lkotlinx/serialization/modules/d;", "getSerializersModule", "()Lkotlinx/serialization/modules/d;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EmptyArrayDecoder extends kotlinx.serialization.encoding.a {
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();
    private static final d serializersModule = h.a;

    private EmptyArrayDecoder() {
    }

    @Override // kotlinx.serialization.encoding.c
    public int decodeElementIndex(f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    @Override // kotlinx.serialization.encoding.c
    public d getSerializersModule() {
        return serializersModule;
    }
}
