package com.paypal.oslo.core.network.http;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/network/http/CertificatePins;", "", "<init>", "()V", "", "DIGICERT_GLOBAL_ROOT_CA", "Ljava/lang/String;", "DIGICERT_GLOBAL_G2_ROOT", "DIGICERT_HIGH_ASSURANCE_EV_ROOT_CA", "DIGICERT_SHA2_ROOT", "PAYPAL_COM_PATTERN", "PAYPAL_OBJECTS_COM_PATTERN", "PAYPAL_ME_PATTERN", "", "ALL_PINS", "Ljava/util/Set;", "getALL_PINS", "()Ljava/util/Set;", "ALL_DOMAINS", "getALL_DOMAINS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CertificatePins {
    public static final com.paypal.oslo.core.network.http.CertificatePins INSTANCE = new com.paypal.oslo.core.network.http.CertificatePins();
    public static final java.lang.String DIGICERT_GLOBAL_ROOT_CA = "sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=";
    public static final java.lang.String DIGICERT_GLOBAL_G2_ROOT = "sha256/i7WTqTvh0OioIruIfFR4kMPnBqrS2rdiVPl/s2uC/CY=";
    public static final java.lang.String DIGICERT_HIGH_ASSURANCE_EV_ROOT_CA = "sha256/WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=";
    public static final java.lang.String DIGICERT_SHA2_ROOT = "sha256/Wd8xe/qfTwq3ylFNd3IpaqLHZbh2ZNCLluVzmeNkcpw=";
    private static final java.util.Set<java.lang.String> ALL_PINS = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{DIGICERT_GLOBAL_ROOT_CA, DIGICERT_GLOBAL_G2_ROOT, DIGICERT_HIGH_ASSURANCE_EV_ROOT_CA, DIGICERT_SHA2_ROOT});
    public static final java.lang.String PAYPAL_COM_PATTERN = "**.paypal.com";
    public static final java.lang.String PAYPAL_OBJECTS_COM_PATTERN = "**.paypalobjects.com";
    public static final java.lang.String PAYPAL_ME_PATTERN = "**.paypal.me";
    private static final java.util.Set<java.lang.String> ALL_DOMAINS = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{PAYPAL_COM_PATTERN, PAYPAL_OBJECTS_COM_PATTERN, PAYPAL_ME_PATTERN});

    private CertificatePins() {
    }

    public final java.util.Set<java.lang.String> getALL_PINS() {
        return ALL_PINS;
    }

    public final java.util.Set<java.lang.String> getALL_DOMAINS() {
        return ALL_DOMAINS;
    }
}
