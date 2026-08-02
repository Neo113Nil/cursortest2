package com.paypal.oslo.feature.onboarding.api.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class InternationalDialingCode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.Companion(null);
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m15961constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m15963equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode> serializer() {
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ InternationalDialingCode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m15965toStringimpl(int i) {
        return java.lang.String.valueOf(i);
    }

    public final java.lang.String toString() {
        return m15965toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m15966unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m15964hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m15962equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m15964hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m15962equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode) && i == ((com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode) obj).m15966unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode m15960boximpl(int i) {
        return new com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode(i);
    }
}
