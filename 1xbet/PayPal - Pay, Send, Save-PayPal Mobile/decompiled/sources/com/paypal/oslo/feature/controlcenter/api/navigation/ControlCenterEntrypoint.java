package com.paypal.oslo.feature.controlcenter.api.navigation;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/navigation/ControlCenterEntrypoint;", "Landroidx/navigation3/runtime/NavKey;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes5.dex */
public final /* data */ class ControlCenterEntrypoint implements androidx.navigation3.runtime.NavKey {
    public static final com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint INSTANCE = new com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint();
    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint.m13718$r8$lambda$RQKAn9yyEYx8VwnViBspdGU4qA();
        }
    });
    public static final int $stable = 8;

    public final int hashCode() {
        return 2035876247;
    }

    private ControlCenterEntrypoint() {
    }

    /* renamed from: $r8$lambda$RQKAn9yyEYx8VwnViBspd-GU4qA, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m13718$r8$lambda$RQKAn9yyEYx8VwnViBspdGU4qA() {
        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint", INSTANCE, new java.lang.annotation.Annotation[0]);
    }

    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint> serializer() {
        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
    }

    public final java.lang.String toString() {
        return "ControlCenterEntrypoint";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint)) {
            return false;
        }
        return true;
    }
}
