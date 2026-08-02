package com.payair.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001'B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/payair/model/CompleteTokenizeData;", "", "", "networkTokenReference", "Lcom/payair/model/ProductConfig;", "productConfig", "Lcom/payair/model/TokenStatus;", "status", "", "Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod;", "authenticationMethods", "<init>", "(Ljava/lang/String;Lcom/payair/model/ProductConfig;Lcom/payair/model/TokenStatus;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/payair/model/ProductConfig;", "component3", "()Lcom/payair/model/TokenStatus;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/payair/model/ProductConfig;Lcom/payair/model/TokenStatus;Ljava/util/List;)Lcom/payair/model/CompleteTokenizeData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAuthenticationMethods", "Ljava/lang/String;", "getNetworkTokenReference", "Lcom/payair/model/ProductConfig;", "getProductConfig", "Lcom/payair/model/TokenStatus;", "getStatus", "AuthenticationMethod"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CompleteTokenizeData {
    private final java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> authenticationMethods;
    private final java.lang.String networkTokenReference;
    private final com.payair.model.ProductConfig productConfig;
    private final com.payair.model.TokenStatus status;

    public CompleteTokenizeData(java.lang.String str, com.payair.model.ProductConfig productConfig, com.payair.model.TokenStatus tokenStatus, java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.networkTokenReference = str;
        this.productConfig = productConfig;
        this.status = tokenStatus;
        this.authenticationMethods = list;
    }

    public final java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> getAuthenticationMethods() {
        return this.authenticationMethods;
    }

    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public final com.payair.model.ProductConfig getProductConfig() {
        return this.productConfig;
    }

    public final com.payair.model.TokenStatus getStatus() {
        return this.status;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod;", "", "", "id", "Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;", "type", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/payair/model/ProductConfig$IssuerMobileApp;", "issuerMobileApp", "<init>", "(Ljava/lang/String;Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;Ljava/lang/String;Lcom/payair/model/ProductConfig$IssuerMobileApp;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;", "component3", "component4", "()Lcom/payair/model/ProductConfig$IssuerMobileApp;", "copy", "(Ljava/lang/String;Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;Ljava/lang/String;Lcom/payair/model/ProductConfig$IssuerMobileApp;)Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/payair/model/ProductConfig$IssuerMobileApp;", "getIssuerMobileApp", "Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;", "getType", "getValue", "AuthenticationMethodType"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuthenticationMethod {
        private final java.lang.String id;
        private final com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp;
        private final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType type;
        private final java.lang.String value;

        public AuthenticationMethod(java.lang.String str, com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType authenticationMethodType, java.lang.String str2, com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethodType, "");
            this.id = str;
            this.type = authenticationMethodType;
            this.value = str2;
            this.issuerMobileApp = issuerMobileApp;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.payair.model.ProductConfig.IssuerMobileApp getIssuerMobileApp() {
            return this.issuerMobileApp;
        }

        public final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType getType() {
            return this.type;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType authenticationMethodType = this.type;
            java.lang.String str2 = this.value;
            com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp = this.issuerMobileApp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationMethod(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(authenticationMethodType);
            sb.append(", value=");
            sb.append(str2);
            sb.append(", issuerMobileApp=");
            sb.append(issuerMobileApp);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            java.lang.String str = this.value;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp = this.issuerMobileApp;
            return ((((hashCode2 + (hashCode * 31)) * 31) + hashCode3) * 31) + (issuerMobileApp != null ? issuerMobileApp.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.model.CompleteTokenizeData.AuthenticationMethod)) {
                return false;
            }
            com.payair.model.CompleteTokenizeData.AuthenticationMethod authenticationMethod = (com.payair.model.CompleteTokenizeData.AuthenticationMethod) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, authenticationMethod.id) && this.type == authenticationMethod.type && kotlin.jvm.internal.Intrinsics.areEqual(this.value, authenticationMethod.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerMobileApp, authenticationMethod.issuerMobileApp);
        }

        public final com.payair.model.CompleteTokenizeData.AuthenticationMethod copy(java.lang.String id, com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType type, java.lang.String value, com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.payair.model.CompleteTokenizeData.AuthenticationMethod(id, type, value, issuerMobileApp);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "UNKNOWN", "TEXT_TO_CARDHOLDER_NUMBER", "EMAIL_TO_CARDHOLDER_ADDRESS", "CARDHOLDER_TO_CALL_MANNED_NUMBER", "CARDHOLDER_TO_USE_ISSUER_MOBILE_APP", "THREE_D_SECURE"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AuthenticationMethodType {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.Companion INSTANCE;
            private final java.lang.String type;
            public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType UNKNOWN = new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType("UNKNOWN", 0, "UNKNOWN");
            public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType TEXT_TO_CARDHOLDER_NUMBER = new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType("TEXT_TO_CARDHOLDER_NUMBER", 1, "TEXT_TO_CARDHOLDER_NUMBER");
            public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType EMAIL_TO_CARDHOLDER_ADDRESS = new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType("EMAIL_TO_CARDHOLDER_ADDRESS", 2, "EMAIL_TO_CARDHOLDER_ADDRESS");
            public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType CARDHOLDER_TO_CALL_MANNED_NUMBER = new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType("CARDHOLDER_TO_CALL_MANNED_NUMBER", 3, "CARDHOLDER_TO_CALL_MANNED_NUMBER");
            public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType CARDHOLDER_TO_USE_ISSUER_MOBILE_APP = new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType("CARDHOLDER_TO_USE_ISSUER_MOBILE_APP", 4, "CARDHOLDER_TO_USE_ISSUER_MOBILE_APP");
            public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType THREE_D_SECURE = new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType("THREE_D_SECURE", 5, "THREE_D_SECURE");

            @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;", "enumByValue", "(Ljava/lang/String;)Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod$AuthenticationMethodType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType enumByValue(java.lang.String value) {
                    java.lang.Object obj;
                    java.util.Iterator<E> it = com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType) obj).getType(), value)) {
                            break;
                        }
                    }
                    com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType authenticationMethodType = (com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType) obj;
                    return authenticationMethodType == null ? com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.UNKNOWN : authenticationMethodType;
                }

                private Companion() {
                }
            }

            static {
                com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
                INSTANCE = new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.Companion(null);
            }

            private AuthenticationMethodType(java.lang.String str, int i, java.lang.String str2) {
                this.type = str2;
            }

            public final java.lang.String getType() {
                return this.type;
            }

            public static com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType[] values() {
                return (com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType[]) $VALUES.clone();
            }

            public static com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType valueOf(java.lang.String str) {
                return (com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType) java.lang.Enum.valueOf(com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.class, str);
            }

            public static kotlin.enums.EnumEntries<com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType[] $values() {
                return new com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType[]{UNKNOWN, TEXT_TO_CARDHOLDER_NUMBER, EMAIL_TO_CARDHOLDER_ADDRESS, CARDHOLDER_TO_CALL_MANNED_NUMBER, CARDHOLDER_TO_USE_ISSUER_MOBILE_APP, THREE_D_SECURE};
            }
        }

        /* renamed from: component4, reason: from getter */
        public final com.payair.model.ProductConfig.IssuerMobileApp getIssuerMobileApp() {
            return this.issuerMobileApp;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.payair.model.CompleteTokenizeData.AuthenticationMethod copy$default(com.payair.model.CompleteTokenizeData.AuthenticationMethod authenticationMethod, java.lang.String str, com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType authenticationMethodType, java.lang.String str2, com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticationMethod.id;
            }
            if ((i & 2) != 0) {
                authenticationMethodType = authenticationMethod.type;
            }
            if ((i & 4) != 0) {
                str2 = authenticationMethod.value;
            }
            if ((i & 8) != 0) {
                issuerMobileApp = authenticationMethod.issuerMobileApp;
            }
            return authenticationMethod.copy(str, authenticationMethodType, str2, issuerMobileApp);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.networkTokenReference;
        com.payair.model.ProductConfig productConfig = this.productConfig;
        com.payair.model.TokenStatus tokenStatus = this.status;
        java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> list = this.authenticationMethods;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompleteTokenizeData(networkTokenReference=");
        sb.append(str);
        sb.append(", productConfig=");
        sb.append(productConfig);
        sb.append(", status=");
        sb.append(tokenStatus);
        sb.append(", authenticationMethods=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.networkTokenReference.hashCode();
        com.payair.model.ProductConfig productConfig = this.productConfig;
        int hashCode2 = productConfig == null ? 0 : productConfig.hashCode();
        com.payair.model.TokenStatus tokenStatus = this.status;
        int hashCode3 = tokenStatus == null ? 0 : tokenStatus.hashCode();
        java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> list = this.authenticationMethods;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.CompleteTokenizeData)) {
            return false;
        }
        com.payair.model.CompleteTokenizeData completeTokenizeData = (com.payair.model.CompleteTokenizeData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.networkTokenReference, completeTokenizeData.networkTokenReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.productConfig, completeTokenizeData.productConfig) && this.status == completeTokenizeData.status && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationMethods, completeTokenizeData.authenticationMethods);
    }

    public final com.payair.model.CompleteTokenizeData copy(java.lang.String networkTokenReference, com.payair.model.ProductConfig productConfig, com.payair.model.TokenStatus status, java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> authenticationMethods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return new com.payair.model.CompleteTokenizeData(networkTokenReference, productConfig, status, authenticationMethods);
    }

    public final java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> component4() {
        return this.authenticationMethods;
    }

    /* renamed from: component3, reason: from getter */
    public final com.payair.model.TokenStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final com.payair.model.ProductConfig getProductConfig() {
        return this.productConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.model.CompleteTokenizeData copy$default(com.payair.model.CompleteTokenizeData completeTokenizeData, java.lang.String str, com.payair.model.ProductConfig productConfig, com.payair.model.TokenStatus tokenStatus, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = completeTokenizeData.networkTokenReference;
        }
        if ((i & 2) != 0) {
            productConfig = completeTokenizeData.productConfig;
        }
        if ((i & 4) != 0) {
            tokenStatus = completeTokenizeData.status;
        }
        if ((i & 8) != 0) {
            list = completeTokenizeData.authenticationMethods;
        }
        return completeTokenizeData.copy(str, productConfig, tokenStatus, list);
    }
}
