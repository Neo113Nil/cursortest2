package com.payair.hce;

/* loaded from: classes4.dex */
public class getPinAlwaysRequiredIfCurrencyProvided<T> {
    public final java.lang.reflect.Type AlternateContactlessPaymentDataJson;
    public final java.lang.Class<? super T> values;
    private int writeReplace;

    public getPinAlwaysRequiredIfCurrencyProvided() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof java.lang.Class)) {
            java.lang.reflect.Type writeReplace = com.payair.hce.getCdol1RelatedDataLength.writeReplace(((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.AlternateContactlessPaymentDataJson = writeReplace;
            this.values = (java.lang.Class<? super T>) com.payair.hce.getCdol1RelatedDataLength.valueOf(writeReplace);
            this.writeReplace = writeReplace.hashCode();
            return;
        }
        try {
            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance("Missing type parameter."));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public getPinAlwaysRequiredIfCurrencyProvided(java.lang.reflect.Type type) {
        java.lang.reflect.Type writeReplace = com.payair.hce.getCdol1RelatedDataLength.writeReplace(type);
        this.AlternateContactlessPaymentDataJson = writeReplace;
        this.values = (java.lang.Class<? super T>) com.payair.hce.getCdol1RelatedDataLength.valueOf(writeReplace);
        this.writeReplace = writeReplace.hashCode();
    }

    public final int hashCode() {
        return this.writeReplace;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided) && com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson, ((com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided) obj).AlternateContactlessPaymentDataJson);
    }

    public final java.lang.String toString() {
        return com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson);
    }
}
