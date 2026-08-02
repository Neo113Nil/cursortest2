package com.paypal.oslo.feature.onboarding.signup.password.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u001a\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/Password;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes13.dex */
public final class Password {
    private final java.lang.String value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m16377toStringimpl(java.lang.String str) {
        return str;
    }

    private /* synthetic */ Password(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m16377toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m16378unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m16376hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m16374equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m16376hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m16375equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m16374equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password) obj).m16378unboximpl());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m16373constructorimpl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password m16372boximpl(java.lang.String str) {
        return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password(str);
    }
}
