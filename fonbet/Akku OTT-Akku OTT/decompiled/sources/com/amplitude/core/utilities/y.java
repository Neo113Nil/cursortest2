package com.amplitude.core.utilities;

import java.io.File;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.F;

/* loaded from: classes3.dex */
public final class y implements com.bumptech.glide.load.engine.cache.a {
    public static final F c(kotlinx.serialization.json.b json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        kotlinx.serialization.json.f fVar = json.a;
        return new F(source);
    }

    public static final void d(Exception exc, com.amplitude.common.a logger, String message) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(message, "message");
        String message2 = exc.getMessage();
        if (message2 != null) {
            logger.b(message + ": " + message2);
        }
        if (exc.getStackTrace() != null) {
            logger.b("Stack trace: " + ExceptionsKt.stackTraceToString(exc));
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public File b(com.bumptech.glide.load.g gVar) {
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public void a(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.engine.g gVar2) {
    }
}
