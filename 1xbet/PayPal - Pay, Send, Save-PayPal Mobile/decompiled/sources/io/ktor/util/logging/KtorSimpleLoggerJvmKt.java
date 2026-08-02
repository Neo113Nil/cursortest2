package io.ktor.util.logging;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "name", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "KtorSimpleLogger", "(Ljava/lang/String;)Lorg/slf4j/Logger;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KtorSimpleLoggerJvmKt {
    public static final org.slf4j.Logger KtorSimpleLogger(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logger, "");
        return logger;
    }
}
