package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/util/PlatformUtils;", "Lio/ktor/util/Platform;", "getPlatform", "(Lio/ktor/util/PlatformUtils;)Lio/ktor/util/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "", "isDevelopmentMode", "(Lio/ktor/util/PlatformUtils;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformUtilsJvmKt {
    public static final io.ktor.util.Platform getPlatform(io.ktor.util.PlatformUtils platformUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformUtils, "");
        return io.ktor.util.Platform.Jvm.INSTANCE;
    }

    public static final boolean isDevelopmentMode(io.ktor.util.PlatformUtils platformUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformUtils, "");
        java.lang.String property = java.lang.System.getProperty("io.ktor.development");
        return property != null && java.lang.Boolean.parseBoolean(property);
    }
}
