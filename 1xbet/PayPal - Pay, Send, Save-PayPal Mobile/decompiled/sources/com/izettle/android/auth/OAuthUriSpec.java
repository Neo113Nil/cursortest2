package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0015\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fBO\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a"}, d2 = {"Lcom/izettle/android/auth/OAuthUriSpec;", "", "Lcom/izettle/android/auth/OAuthUriType;", "type", "", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "state", "", "scopes", "Ljava/util/Locale;", "locale", "", "extraQueryParams", "<init>", "(Lcom/izettle/android/auth/OAuthUriType;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)V", "Ljava/util/Map;", "getExtraQueryParams", "()Ljava/util/Map;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "[Ljava/lang/String;", "getScopes", "()[Ljava/lang/String;", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "Lcom/izettle/android/auth/OAuthUriType;", "getType", "()Lcom/izettle/android/auth/OAuthUriType;", "getUsername", "NewBuilder", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthUriSpec {

    /* renamed from: NewBuilder, reason: from kotlin metadata */
    public static final com.izettle.android.auth.OAuthUriSpec.Companion INSTANCE = new com.izettle.android.auth.OAuthUriSpec.Companion(null);
    private final java.util.Map<java.lang.String, java.lang.String> extraQueryParams;
    private final java.util.Locale locale;
    private final java.lang.String[] scopes;
    private final java.lang.String state;
    private final com.izettle.android.auth.OAuthUriType type;
    private final java.lang.String username;

    private OAuthUriSpec(com.izettle.android.auth.OAuthUriType oAuthUriType, java.lang.String str, java.lang.String str2, java.lang.String[] strArr, java.util.Locale locale, java.util.Map<java.lang.String, java.lang.String> map) {
        this.type = oAuthUriType;
        this.username = str;
        this.state = str2;
        this.scopes = strArr;
        this.locale = locale;
        this.extraQueryParams = map;
    }

    public final com.izettle.android.auth.OAuthUriType getType() {
        return this.type;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String[] getScopes() {
        return this.scopes;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtraQueryParams() {
        return this.extraQueryParams;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\b\u001a\u00020\u00002*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0004\"\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u0016RB\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d8\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\u0012\u0010(R6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u00100\"\u0004\b\u0015\u00101R.\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104\"\u0004\b\u0019\u00105R.\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b6\u00100\"\u0004\b\u001c\u00101"}, d2 = {"Lcom/izettle/android/auth/OAuthUriSpec$Builder;", "", "<init>", "()V", "", "Lkotlin/Pair;", "", "params", "addExtraQueryParams", "([Lkotlin/Pair;)Lcom/izettle/android/auth/OAuthUriSpec$Builder;", "scopes", "addScopes", "([Ljava/lang/String;)Lcom/izettle/android/auth/OAuthUriSpec$Builder;", "Lcom/izettle/android/auth/OAuthUriSpec;", "build", "()Lcom/izettle/android/auth/OAuthUriSpec;", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)Lcom/izettle/android/auth/OAuthUriSpec$Builder;", "state", "setState", "(Ljava/lang/String;)Lcom/izettle/android/auth/OAuthUriSpec$Builder;", "Lcom/izettle/android/auth/OAuthUriType;", "type", "setType", "(Lcom/izettle/android/auth/OAuthUriType;)Lcom/izettle/android/auth/OAuthUriSpec$Builder;", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "setUsername", "", "<set-?>", "extraQueryParams", "Ljava/util/Map;", "getExtraQueryParams", "()Ljava/util/Map;", "setExtraQueryParams", "(Ljava/util/Map;)V", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "(Ljava/util/Locale;)V", "[Ljava/lang/String;", "getScopes", "()[Ljava/lang/String;", "setScopes", "([Ljava/lang/String;)V", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "Lcom/izettle/android/auth/OAuthUriType;", "getType", "()Lcom/izettle/android/auth/OAuthUriType;", "(Lcom/izettle/android/auth/OAuthUriType;)V", "getUsername"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> extraQueryParams;
        private java.util.Locale locale;
        private java.lang.String[] scopes = new java.lang.String[0];
        private java.lang.String state;
        private com.izettle.android.auth.OAuthUriType type;
        private java.lang.String username;

        public Builder() {
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            this.locale = locale;
            this.extraQueryParams = new java.util.LinkedHashMap();
        }

        public final com.izettle.android.auth.OAuthUriType getType() {
            return this.type;
        }

        /* renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m10793setType(com.izettle.android.auth.OAuthUriType oAuthUriType) {
            this.type = oAuthUriType;
        }

        public final java.lang.String getUsername() {
            return this.username;
        }

        /* renamed from: setUsername, reason: collision with other method in class */
        public final /* synthetic */ void m10794setUsername(java.lang.String str) {
            this.username = str;
        }

        public final java.lang.String getState() {
            return this.state;
        }

        /* renamed from: setState, reason: collision with other method in class */
        public final /* synthetic */ void m10792setState(java.lang.String str) {
            this.state = str;
        }

        public final java.lang.String[] getScopes() {
            return this.scopes;
        }

        public final /* synthetic */ void setScopes(java.lang.String[] strArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
            this.scopes = strArr;
        }

        public final java.util.Locale getLocale() {
            return this.locale;
        }

        /* renamed from: setLocale, reason: collision with other method in class */
        public final /* synthetic */ void m10791setLocale(java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            this.locale = locale;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getExtraQueryParams() {
            return this.extraQueryParams;
        }

        public final /* synthetic */ void setExtraQueryParams(java.util.Map map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.extraQueryParams = map;
        }

        public final com.izettle.android.auth.OAuthUriSpec.Builder setType(com.izettle.android.auth.OAuthUriType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            this.type = type;
            return this;
        }

        public final com.izettle.android.auth.OAuthUriSpec.Builder setUsername(java.lang.String username) {
            this.username = username;
            return this;
        }

        public final com.izettle.android.auth.OAuthUriSpec.Builder setState(java.lang.String state) {
            this.state = state;
            return this;
        }

        public final com.izettle.android.auth.OAuthUriSpec.Builder addScopes(java.lang.String... scopes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
            this.scopes = (java.lang.String[]) kotlin.collections.ArraysKt.plus((java.lang.Object[]) this.scopes, (java.lang.Object[]) scopes);
            return this;
        }

        public final com.izettle.android.auth.OAuthUriSpec.Builder setLocale(java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            this.locale = locale;
            return this;
        }

        public final com.izettle.android.auth.OAuthUriSpec.Builder addExtraQueryParams(kotlin.Pair<java.lang.String, java.lang.String>... params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            kotlin.collections.MapsKt.putAll(this.extraQueryParams, params);
            return this;
        }

        public final com.izettle.android.auth.OAuthUriSpec build() {
            com.izettle.android.auth.OAuthUriType oAuthUriType = this.type;
            if (oAuthUriType != null) {
                return new com.izettle.android.auth.OAuthUriSpec(oAuthUriType, this.username, this.state, this.scopes, this.locale, this.extraQueryParams, null);
            }
            throw new java.lang.IllegalArgumentException("type must not be null".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/OAuthUriSpec$NewBuilder;", "Lkotlin/Function0;", "Lcom/izettle/android/auth/OAuthUriSpec$Builder;", "<init>", "()V", "invoke", "()Lcom/izettle/android/auth/OAuthUriSpec$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.izettle.android.auth.OAuthUriSpec$NewBuilder, reason: from kotlin metadata */
    public static final class Companion implements kotlin.jvm.functions.Function0<com.izettle.android.auth.OAuthUriSpec.Builder> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.izettle.android.auth.OAuthUriSpec.Builder invoke() {
            return new com.izettle.android.auth.OAuthUriSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OAuthUriSpec(com.izettle.android.auth.OAuthUriType oAuthUriType, java.lang.String str, java.lang.String str2, java.lang.String[] strArr, java.util.Locale locale, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(oAuthUriType, str, str2, strArr, locale, map);
    }
}
