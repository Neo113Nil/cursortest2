package com.payair.logic.jwt;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0003 !\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/payair/logic/jwt/JWT;", "", "Lcom/payair/logic/jwt/JWT$JwtHeader;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Lcom/payair/logic/jwt/JWT$JwtPayload;", "payload", "", "signature", "<init>", "(Lcom/payair/logic/jwt/JWT$JwtHeader;Lcom/payair/logic/jwt/JWT$JwtPayload;Ljava/lang/String;)V", "component1", "()Lcom/payair/logic/jwt/JWT$JwtHeader;", "component2", "()Lcom/payair/logic/jwt/JWT$JwtPayload;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/payair/logic/jwt/JWT$JwtHeader;Lcom/payair/logic/jwt/JWT$JwtPayload;Ljava/lang/String;)Lcom/payair/logic/jwt/JWT;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/payair/logic/jwt/JWT$JwtHeader;", "getHeader", "Lcom/payair/logic/jwt/JWT$JwtPayload;", "getPayload", "Ljava/lang/String;", "getSignature", "Companion", "JwtHeader", "JwtPayload"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JWT {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.jwt.JWT.Companion INSTANCE = new com.payair.logic.jwt.JWT.Companion(null);
    private final com.payair.logic.jwt.JWT.JwtHeader header;
    private final com.payair.logic.jwt.JWT.JwtPayload payload;
    private final java.lang.String signature;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/logic/jwt/JWT$Companion;", "", "<init>", "()V", "", "tokenStr", "Lcom/payair/logic/jwt/JWT;", "convertStringToToken", "(Ljava/lang/String;)Lcom/payair/logic/jwt/JWT;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.payair.logic.jwt.JWT convertStringToToken(java.lang.String tokenStr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStr, "");
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) tokenStr, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str = (java.lang.String) split$default.get(0);
            java.lang.String str2 = (java.lang.String) split$default.get(1);
            return new com.payair.logic.jwt.JWT(com.payair.logic.jwt.JWT.JwtHeader.INSTANCE.decodeHeaderFromString(str), com.payair.logic.jwt.JWT.JwtPayload.INSTANCE.decodePayloadFromString(str2), (java.lang.String) split$default.get(2));
        }

        private Companion() {
        }
    }

    public JWT(com.payair.logic.jwt.JWT.JwtHeader jwtHeader, com.payair.logic.jwt.JWT.JwtPayload jwtPayload, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwtHeader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwtPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.header = jwtHeader;
        this.payload = jwtPayload;
        this.signature = str;
    }

    public final com.payair.logic.jwt.JWT.JwtHeader getHeader() {
        return this.header;
    }

    public final com.payair.logic.jwt.JWT.JwtPayload getPayload() {
        return this.payload;
    }

    public final java.lang.String getSignature() {
        return this.signature;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/payair/logic/jwt/JWT$JwtPayload;", "", "", "sub", "iss", "", "Lcom/payair/logic/jwt/ScopeType;", "scopes", "", "exp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)Lcom/payair/logic/jwt/JWT$JwtPayload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getExp", "Ljava/lang/String;", "getIss", "Ljava/util/List;", "getScopes", "getSub", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class JwtPayload {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.payair.logic.jwt.JWT.JwtPayload.Companion INSTANCE = new com.payair.logic.jwt.JWT.JwtPayload.Companion(null);
        private final long exp;
        private final java.lang.String iss;
        private final java.util.List<com.payair.logic.jwt.ScopeType> scopes;
        private final java.lang.String sub;

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/logic/jwt/JWT$JwtPayload$Companion;", "", "<init>", "()V", "", "encodedPayload", "Lcom/payair/logic/jwt/JWT$JwtPayload;", "decodePayloadFromString", "(Ljava/lang/String;)Lcom/payair/logic/jwt/JWT$JwtPayload;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final com.payair.logic.jwt.JWT.JwtPayload decodePayloadFromString(java.lang.String encodedPayload) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPayload, "");
                return (com.payair.logic.jwt.JWT.JwtPayload) com.payair.logic.jwt.JWTKt.decodeBase64Json(encodedPayload, com.payair.logic.jwt.JWT.JwtPayload.class);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public JwtPayload(java.lang.String str, java.lang.String str2, java.util.List<? extends com.payair.logic.jwt.ScopeType> list, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.sub = str;
            this.iss = str2;
            this.scopes = list;
            this.exp = j;
        }

        public final long getExp() {
            return this.exp;
        }

        public final java.lang.String getIss() {
            return this.iss;
        }

        public final java.util.List<com.payair.logic.jwt.ScopeType> getScopes() {
            return this.scopes;
        }

        public final java.lang.String getSub() {
            return this.sub;
        }

        public final int hashCode() {
            int a2 = com.payair.csdk.w3.a(this.iss, this.sub.hashCode() * 31, 31);
            return java.lang.Long.hashCode(this.exp) + ((this.scopes.hashCode() + a2) * 31);
        }

        public /* synthetic */ JwtPayload(java.lang.String str, java.lang.String str2, java.util.List list, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, j);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sub;
            java.lang.String str2 = this.iss;
            java.util.List<com.payair.logic.jwt.ScopeType> list = this.scopes;
            long j = this.exp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JwtPayload(sub=");
            sb.append(str);
            sb.append(", iss=");
            sb.append(str2);
            sb.append(", scopes=");
            sb.append(list);
            sb.append(", exp=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.logic.jwt.JWT.JwtPayload)) {
                return false;
            }
            com.payair.logic.jwt.JWT.JwtPayload jwtPayload = (com.payair.logic.jwt.JWT.JwtPayload) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sub, jwtPayload.sub) && kotlin.jvm.internal.Intrinsics.areEqual(this.iss, jwtPayload.iss) && kotlin.jvm.internal.Intrinsics.areEqual(this.scopes, jwtPayload.scopes) && this.exp == jwtPayload.exp;
        }

        public final com.payair.logic.jwt.JWT.JwtPayload copy(java.lang.String sub, java.lang.String iss, java.util.List<? extends com.payair.logic.jwt.ScopeType> scopes, long exp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
            return new com.payair.logic.jwt.JWT.JwtPayload(sub, iss, scopes, exp);
        }

        /* renamed from: component4, reason: from getter */
        public final long getExp() {
            return this.exp;
        }

        public final java.util.List<com.payair.logic.jwt.ScopeType> component3() {
            return this.scopes;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIss() {
            return this.iss;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSub() {
            return this.sub;
        }

        public static /* synthetic */ com.payair.logic.jwt.JWT.JwtPayload copy$default(com.payair.logic.jwt.JWT.JwtPayload jwtPayload, java.lang.String str, java.lang.String str2, java.util.List list, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = jwtPayload.sub;
            }
            if ((i & 2) != 0) {
                str2 = jwtPayload.iss;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                list = jwtPayload.scopes;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                j = jwtPayload.exp;
            }
            return jwtPayload.copy(str, str3, list2, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/payair/logic/jwt/JWT$JwtHeader;", "", "", "alg", "typ", "kid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/jwt/JWT$JwtHeader;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAlg", "getKid", "getTyp", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class JwtHeader {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.payair.logic.jwt.JWT.JwtHeader.Companion INSTANCE = new com.payair.logic.jwt.JWT.JwtHeader.Companion(null);
        private final java.lang.String alg;
        private final java.lang.String kid;
        private final java.lang.String typ;

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/logic/jwt/JWT$JwtHeader$Companion;", "", "<init>", "()V", "", "encodedHeader", "Lcom/payair/logic/jwt/JWT$JwtHeader;", "decodeHeaderFromString", "(Ljava/lang/String;)Lcom/payair/logic/jwt/JWT$JwtHeader;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final com.payair.logic.jwt.JWT.JwtHeader decodeHeaderFromString(java.lang.String encodedHeader) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedHeader, "");
                return (com.payair.logic.jwt.JWT.JwtHeader) com.payair.logic.jwt.JWTKt.decodeBase64Json(encodedHeader, com.payair.logic.jwt.JWT.JwtHeader.class);
            }

            private Companion() {
            }
        }

        public JwtHeader(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.alg = str;
            this.typ = str2;
            this.kid = str3;
        }

        public final java.lang.String getAlg() {
            return this.alg;
        }

        public final java.lang.String getKid() {
            return this.kid;
        }

        public final java.lang.String getTyp() {
            return this.typ;
        }

        public final int hashCode() {
            return this.kid.hashCode() + com.payair.csdk.w3.a(this.typ, this.alg.hashCode() * 31, 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.alg;
            java.lang.String str2 = this.typ;
            java.lang.String str3 = this.kid;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JwtHeader(alg=");
            sb.append(str);
            sb.append(", typ=");
            sb.append(str2);
            sb.append(", kid=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.logic.jwt.JWT.JwtHeader)) {
                return false;
            }
            com.payair.logic.jwt.JWT.JwtHeader jwtHeader = (com.payair.logic.jwt.JWT.JwtHeader) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alg, jwtHeader.alg) && kotlin.jvm.internal.Intrinsics.areEqual(this.typ, jwtHeader.typ) && kotlin.jvm.internal.Intrinsics.areEqual(this.kid, jwtHeader.kid);
        }

        public final com.payair.logic.jwt.JWT.JwtHeader copy(java.lang.String alg, java.lang.String typ, java.lang.String kid) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alg, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typ, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kid, "");
            return new com.payair.logic.jwt.JWT.JwtHeader(alg, typ, kid);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getKid() {
            return this.kid;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTyp() {
            return this.typ;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAlg() {
            return this.alg;
        }

        public static /* synthetic */ com.payair.logic.jwt.JWT.JwtHeader copy$default(com.payair.logic.jwt.JWT.JwtHeader jwtHeader, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = jwtHeader.alg;
            }
            if ((i & 2) != 0) {
                str2 = jwtHeader.typ;
            }
            if ((i & 4) != 0) {
                str3 = jwtHeader.kid;
            }
            return jwtHeader.copy(str, str2, str3);
        }
    }

    public final java.lang.String toString() {
        com.payair.logic.jwt.JWT.JwtHeader jwtHeader = this.header;
        com.payair.logic.jwt.JWT.JwtPayload jwtPayload = this.payload;
        java.lang.String str = this.signature;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JWT(header=");
        sb.append(jwtHeader);
        sb.append(", payload=");
        sb.append(jwtPayload);
        sb.append(", signature=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.header.hashCode();
        return this.signature.hashCode() + ((this.payload.hashCode() + (hashCode * 31)) * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.jwt.JWT)) {
            return false;
        }
        com.payair.logic.jwt.JWT jwt = (com.payair.logic.jwt.JWT) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.header, jwt.header) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, jwt.payload) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, jwt.signature);
    }

    public final com.payair.logic.jwt.JWT copy(com.payair.logic.jwt.JWT.JwtHeader header, com.payair.logic.jwt.JWT.JwtPayload payload, java.lang.String signature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
        return new com.payair.logic.jwt.JWT(header, payload, signature);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSignature() {
        return this.signature;
    }

    /* renamed from: component2, reason: from getter */
    public final com.payair.logic.jwt.JWT.JwtPayload getPayload() {
        return this.payload;
    }

    /* renamed from: component1, reason: from getter */
    public final com.payair.logic.jwt.JWT.JwtHeader getHeader() {
        return this.header;
    }

    public static /* synthetic */ com.payair.logic.jwt.JWT copy$default(com.payair.logic.jwt.JWT jwt, com.payair.logic.jwt.JWT.JwtHeader jwtHeader, com.payair.logic.jwt.JWT.JwtPayload jwtPayload, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jwtHeader = jwt.header;
        }
        if ((i & 2) != 0) {
            jwtPayload = jwt.payload;
        }
        if ((i & 4) != 0) {
            str = jwt.signature;
        }
        return jwt.copy(jwtHeader, jwtPayload, str);
    }
}
