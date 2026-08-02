package okhttp3.internal.publicsuffix;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "", "path", "<init>", "(Ljava/lang/String;)V", "Lokio/Source;", "listSource", "()Lokio/Source;", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AssetPublicSuffixList extends okhttp3.internal.publicsuffix.BasePublicSuffixList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.publicsuffix.AssetPublicSuffixList.Companion INSTANCE = new okhttp3.internal.publicsuffix.AssetPublicSuffixList.Companion(null);
    private static final java.lang.String PUBLIC_SUFFIX_RESOURCE = "PublicSuffixDatabase.list";
    private final java.lang.String path;

    public AssetPublicSuffixList(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.path = str;
    }

    public /* synthetic */ AssetPublicSuffixList(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : str);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final java.lang.String getPath() {
        return this.path;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final okio.Source listSource() {
        android.content.Context applicationContext = okhttp3.internal.platform.PlatformRegistry.INSTANCE.getApplicationContext();
        android.content.res.AssetManager assets = applicationContext != null ? applicationContext.getAssets() : null;
        if (assets == null) {
            if (android.os.Build.FINGERPRINT == null) {
                throw new java.io.IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new java.io.IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        java.io.InputStream open = assets.open(getPath());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
        return okio.Okio.source(open);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList$Companion;", "", "<init>", "()V", "", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "getPUBLIC_SUFFIX_RESOURCE", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getPUBLIC_SUFFIX_RESOURCE() {
            return okhttp3.internal.publicsuffix.AssetPublicSuffixList.PUBLIC_SUFFIX_RESOURCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetPublicSuffixList() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
