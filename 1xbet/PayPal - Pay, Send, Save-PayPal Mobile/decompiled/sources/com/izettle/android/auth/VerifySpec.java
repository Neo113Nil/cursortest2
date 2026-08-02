package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u001b\u001aB;\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/izettle/android/auth/VerifySpec;", "Lcom/izettle/android/auth/AuthTaskSpec;", "Lcom/izettle/android/auth/BrowserAuthTaskSpec;", "Landroid/app/Activity;", "activity", "", "toolbarColor", "", "", "scopes", "", "queryParams", "<init>", "(Landroid/app/Activity;I[Ljava/lang/String;Ljava/util/Map;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Ljava/util/Map;", "getQueryParams", "()Ljava/util/Map;", "[Ljava/lang/String;", "getScopes", "()[Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getToolbarColor", "()I", "Companion", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerifySpec extends com.izettle.android.auth.AuthTaskSpec implements com.izettle.android.auth.BrowserAuthTaskSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.VerifySpec.Companion INSTANCE = new com.izettle.android.auth.VerifySpec.Companion(null);
    private final android.app.Activity activity;
    private final java.util.Map<java.lang.String, java.lang.String> queryParams;
    private final java.lang.String[] scopes;
    private final int toolbarColor;

    @Override // com.izettle.android.auth.BrowserAuthTaskSpec
    public final android.app.Activity getActivity() {
        return this.activity;
    }

    @Override // com.izettle.android.auth.BrowserAuthTaskSpec
    public final int getToolbarColor() {
        return this.toolbarColor;
    }

    @Override // com.izettle.android.auth.BrowserAuthTaskSpec
    public final java.lang.String[] getScopes() {
        return this.scopes;
    }

    @Override // com.izettle.android.auth.BrowserAuthTaskSpec
    public final java.util.Map<java.lang.String, java.lang.String> getQueryParams() {
        return this.queryParams;
    }

    private VerifySpec(android.app.Activity activity, int i, java.lang.String[] strArr, java.util.Map<java.lang.String, java.lang.String> map) {
        super(null);
        this.activity = activity;
        this.toolbarColor = i;
        this.scopes = strArr;
        this.queryParams = map;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\b\u001a\u00020\u00002*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0004\"\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0012\u0010\u001cRB\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R.\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+\"\u0004\b\u0016\u0010,"}, d2 = {"Lcom/izettle/android/auth/VerifySpec$Builder;", "", "<init>", "()V", "", "Lkotlin/Pair;", "", "params", "addQueryParams", "([Lkotlin/Pair;)Lcom/izettle/android/auth/VerifySpec$Builder;", "scopes", "addScopes", "([Ljava/lang/String;)Lcom/izettle/android/auth/VerifySpec$Builder;", "Lcom/izettle/android/auth/VerifySpec;", "build", "()Lcom/izettle/android/auth/VerifySpec;", "Landroid/app/Activity;", "activity", "setActivity", "(Landroid/app/Activity;)Lcom/izettle/android/auth/VerifySpec$Builder;", "", "toolbarColor", "setToolbarColor", "(Ljava/lang/Integer;)Lcom/izettle/android/auth/VerifySpec$Builder;", "<set-?>", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "(Landroid/app/Activity;)V", "", "queryParams", "Ljava/util/Map;", "getQueryParams", "()Ljava/util/Map;", "setQueryParams", "(Ljava/util/Map;)V", "[Ljava/lang/String;", "getScopes", "()[Ljava/lang/String;", "setScopes", "([Ljava/lang/String;)V", "Ljava/lang/Integer;", "getToolbarColor", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Builder {
        private android.app.Activity activity;
        private java.lang.Integer toolbarColor;
        private java.lang.String[] scopes = new java.lang.String[0];
        private java.util.Map<java.lang.String, java.lang.String> queryParams = new java.util.LinkedHashMap();

        public final android.app.Activity getActivity() {
            return this.activity;
        }

        /* renamed from: setActivity, reason: collision with other method in class */
        public final /* synthetic */ void m10796setActivity(android.app.Activity activity) {
            this.activity = activity;
        }

        public final java.lang.Integer getToolbarColor() {
            return this.toolbarColor;
        }

        /* renamed from: setToolbarColor, reason: collision with other method in class */
        public final /* synthetic */ void m10797setToolbarColor(java.lang.Integer num) {
            this.toolbarColor = num;
        }

        public final java.lang.String[] getScopes() {
            return this.scopes;
        }

        public final /* synthetic */ void setScopes(java.lang.String[] strArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
            this.scopes = strArr;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getQueryParams() {
            return this.queryParams;
        }

        public final /* synthetic */ void setQueryParams(java.util.Map map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.queryParams = map;
        }

        public final com.izettle.android.auth.VerifySpec.Builder setActivity(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            this.activity = activity;
            return this;
        }

        public final com.izettle.android.auth.VerifySpec.Builder setToolbarColor(java.lang.Integer toolbarColor) {
            this.toolbarColor = toolbarColor;
            return this;
        }

        public final com.izettle.android.auth.VerifySpec.Builder addScopes(java.lang.String... scopes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
            this.scopes = (java.lang.String[]) kotlin.collections.ArraysKt.plus((java.lang.Object[]) this.scopes, (java.lang.Object[]) scopes);
            return this;
        }

        public final com.izettle.android.auth.VerifySpec.Builder addQueryParams(kotlin.Pair<java.lang.String, java.lang.String>... params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            kotlin.collections.MapsKt.putAll(this.queryParams, params);
            return this;
        }

        public final com.izettle.android.auth.VerifySpec build() {
            android.app.Activity activity = this.activity;
            if (activity == null) {
                throw new java.lang.IllegalArgumentException("activity must not be null".toString());
            }
            java.lang.Integer num = this.toolbarColor;
            return new com.izettle.android.auth.VerifySpec(activity, num != null ? num.intValue() : 0, this.scopes, this.queryParams, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/VerifySpec$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/VerifySpec$Builder;", "builder", "()Lcom/izettle/android/auth/VerifySpec$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.izettle.android.auth.VerifySpec.Builder builder() {
            return new com.izettle.android.auth.VerifySpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ VerifySpec(android.app.Activity activity, int i, java.lang.String[] strArr, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, i, strArr, map);
    }
}
