package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class KnotConfiguration {
    private final java.lang.String clientId;
    private final com.knotapi.knot.models.CustomerConfiguration customerConfiguration;
    private java.lang.String[] domainUrls;
    private java.lang.String entryPoint;
    private final com.knotapi.knot.models.Environment environment;
    private final int[] merchantIds;
    private final com.knotapi.knot.Knot.Product product;
    private final java.lang.String sessionId;
    private java.lang.Boolean useCategories;
    private java.lang.Boolean useSearch;

    public KnotConfiguration(java.lang.String str, java.lang.String str2, com.knotapi.knot.models.Environment environment, com.knotapi.knot.Knot.Product product, int[] iArr, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String[] strArr, java.lang.String str3, com.knotapi.knot.models.CustomerConfiguration customerConfiguration) {
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        this.useCategories = bool3;
        this.useSearch = bool3;
        this.domainUrls = null;
        this.entryPoint = null;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sessionId must not be null");
        }
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("clientId must not be null");
        }
        if (environment == null) {
            throw new java.lang.IllegalArgumentException("environment must not be null");
        }
        this.sessionId = str;
        this.clientId = str2;
        this.environment = environment;
        this.product = product;
        this.merchantIds = iArr;
        this.useCategories = bool;
        this.useSearch = bool2;
        this.domainUrls = strArr;
        this.entryPoint = str3;
        this.customerConfiguration = customerConfiguration;
    }

    public java.lang.String getClientId() {
        return this.clientId;
    }

    public com.knotapi.knot.models.CustomerConfiguration getCustomerConfiguration() {
        return this.customerConfiguration;
    }

    public java.lang.String[] getDomainUrls() {
        return this.domainUrls;
    }

    public java.lang.String getEntryPoint() {
        return this.entryPoint;
    }

    public com.knotapi.knot.models.Environment getEnvironment() {
        return this.environment;
    }

    public int[] getMerchantIds() {
        return this.merchantIds;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public java.lang.Boolean getUseCategories() {
        return this.useCategories;
    }

    public java.lang.Boolean getUseSearch() {
        return this.useSearch;
    }

    public KnotConfiguration(java.lang.String str, java.lang.String str2, com.knotapi.knot.models.Environment environment, com.knotapi.knot.Knot.Product product, int[] iArr, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String[] strArr, java.lang.String str3) {
        this(str, str2, environment, product, iArr, bool, bool2, strArr, str3, null);
    }

    public KnotConfiguration(java.lang.String str, java.lang.String str2, com.knotapi.knot.models.Environment environment, int[] iArr, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String[] strArr, java.lang.String str3, com.knotapi.knot.models.CustomerConfiguration customerConfiguration) {
        this(str, str2, environment, null, iArr, bool, bool2, strArr, str3, customerConfiguration);
    }
}
