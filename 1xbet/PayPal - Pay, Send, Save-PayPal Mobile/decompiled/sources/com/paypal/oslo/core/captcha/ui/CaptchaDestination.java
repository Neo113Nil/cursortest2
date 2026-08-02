package com.paypal.oslo.core.captcha.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/captcha/ui/CaptchaDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "requestId", "Lcom/paypal/oslo/core/captcha/CaptchaChallengeInput;", "parameters", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/captcha/CaptchaChallengeInput;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/core/captcha/CaptchaChallengeInput;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/captcha/CaptchaChallengeInput;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/captcha/CaptchaChallengeInput;)Lcom/paypal/oslo/core/captcha/ui/CaptchaDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$captcha_release", "(Lcom/paypal/oslo/core/captcha/ui/CaptchaDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getRequestId", "Lcom/paypal/oslo/core/captcha/CaptchaChallengeInput;", "getParameters", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CaptchaDestination implements androidx.navigation3.runtime.NavKey {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.captcha.ui.CaptchaDestination.Companion INSTANCE = new com.paypal.oslo.core.captcha.ui.CaptchaDestination.Companion(null);
    private final com.paypal.oslo.core.captcha.CaptchaChallengeInput parameters;
    private final java.lang.String requestId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/captcha/ui/CaptchaDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/captcha/ui/CaptchaDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.captcha.ui.CaptchaDestination> serializer() {
            return com.paypal.oslo.core.captcha.ui.CaptchaDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CaptchaDestination(int i, java.lang.String str, com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.captcha.ui.CaptchaDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.requestId = str;
        this.parameters = captchaChallengeInput;
    }

    public CaptchaDestination(java.lang.String str, com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captchaChallengeInput, "");
        this.requestId = str;
        this.parameters = captchaChallengeInput;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$captcha_release(com.paypal.oslo.core.captcha.ui.CaptchaDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.requestId);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.core.captcha.CaptchaChallengeInput$$serializer.INSTANCE, self.parameters);
    }

    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final com.paypal.oslo.core.captcha.CaptchaChallengeInput getParameters() {
        return this.parameters;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.requestId;
        com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput = this.parameters;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptchaDestination(requestId=");
        sb.append(str);
        sb.append(", parameters=");
        sb.append(captchaChallengeInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.requestId.hashCode() * 31) + this.parameters.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.captcha.ui.CaptchaDestination)) {
            return false;
        }
        com.paypal.oslo.core.captcha.ui.CaptchaDestination captchaDestination = (com.paypal.oslo.core.captcha.ui.CaptchaDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, captchaDestination.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, captchaDestination.parameters);
    }

    public final com.paypal.oslo.core.captcha.ui.CaptchaDestination copy(java.lang.String requestId, com.paypal.oslo.core.captcha.CaptchaChallengeInput parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        return new com.paypal.oslo.core.captcha.ui.CaptchaDestination(requestId, parameters);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.captcha.CaptchaChallengeInput getParameters() {
        return this.parameters;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public static /* synthetic */ com.paypal.oslo.core.captcha.ui.CaptchaDestination copy$default(com.paypal.oslo.core.captcha.ui.CaptchaDestination captchaDestination, java.lang.String str, com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = captchaDestination.requestId;
        }
        if ((i & 2) != 0) {
            captchaChallengeInput = captchaDestination.parameters;
        }
        return captchaDestination.copy(str, captchaChallengeInput);
    }
}
