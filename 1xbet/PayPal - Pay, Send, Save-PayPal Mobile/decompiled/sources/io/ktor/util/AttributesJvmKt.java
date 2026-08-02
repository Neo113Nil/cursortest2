package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "concurrent", "Lio/ktor/util/Attributes;", "Attributes", "(Z)Lio/ktor/util/Attributes;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AttributesJvmKt {
    public static /* synthetic */ io.ktor.util.Attributes Attributes$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Attributes(z);
    }

    public static final io.ktor.util.Attributes Attributes(boolean z) {
        return z ? new io.ktor.util.ConcurrentSafeAttributes() : new io.ktor.util.HashMapAttributes();
    }
}
