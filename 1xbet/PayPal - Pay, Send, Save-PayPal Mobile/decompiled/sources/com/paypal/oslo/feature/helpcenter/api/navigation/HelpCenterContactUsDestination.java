package com.paypal.oslo.feature.helpcenter.api.navigation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/api/navigation/HelpCenterContactUsDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/helpcenter/api/navigation/HelpCenterDestination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes12.dex */
public final /* data */ class HelpCenterContactUsDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterDestination {
    public static final com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination INSTANCE = new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination();
    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination.m14778$r8$lambda$5SQpOIW19qmZpUeyNZuNTfRLKw();
        }
    });

    public final int hashCode() {
        return -1216279323;
    }

    private HelpCenterContactUsDestination() {
    }

    /* renamed from: $r8$lambda$5SQpOIW19qmZpUey-NZuNTfRLKw, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m14778$r8$lambda$5SQpOIW19qmZpUeyNZuNTfRLKw() {
        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination", INSTANCE, new java.lang.annotation.Annotation[0]);
    }

    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination> serializer() {
        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
    }

    public final java.lang.String toString() {
        return "HelpCenterContactUsDestination";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination)) {
            return false;
        }
        return true;
    }
}
