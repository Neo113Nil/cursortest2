package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getDEVELOPMENT_MODE", "()Z", "DEVELOPMENT_MODE"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteChannel_jvmKt {
    public static final boolean getDEVELOPMENT_MODE() {
        java.lang.String property = java.lang.System.getProperty("io.ktor.development");
        return property != null && java.lang.Boolean.parseBoolean(property);
    }
}
