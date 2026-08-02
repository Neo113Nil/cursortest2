package io.ktor.client.engine.android;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R3\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016"}, d2 = {"Lio/ktor/client/engine/android/AndroidEngineConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "<init>", "()V", "", "connectTimeout", com.visa.cbp.getEncExpo.warmup, "getConnectTimeout", "()I", "setConnectTimeout", "(I)V", "socketTimeout", "getSocketTimeout", "setSocketTimeout", "Lkotlin/Function1;", "Ljavax/net/ssl/HttpsURLConnection;", "", "sslManager", "Lkotlin/jvm/functions/Function1;", "getSslManager", "()Lkotlin/jvm/functions/Function1;", "setSslManager", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/net/HttpURLConnection;", "Lkotlin/ExtensionFunctionType;", "requestConfig", "getRequestConfig", "setRequestConfig"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AndroidEngineConfig extends io.ktor.client.engine.HttpClientEngineConfig {
    private int connectTimeout = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    private int socketTimeout = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    private kotlin.jvm.functions.Function1<? super javax.net.ssl.HttpsURLConnection, kotlin.Unit> sslManager = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidEngineConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.engine.android.AndroidEngineConfig.m23244$r8$lambda$ErKji_2KrMLLMa0rrRKDVRk5Ko((javax.net.ssl.HttpsURLConnection) obj);
        }
    };
    private kotlin.jvm.functions.Function1<? super java.net.HttpURLConnection, kotlin.Unit> requestConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidEngineConfig$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.engine.android.AndroidEngineConfig.m23245$r8$lambda$d_JhVaSfgBy9yxYHor8BFVBog4((java.net.HttpURLConnection) obj);
        }
    };

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public final int getSocketTimeout() {
        return this.socketTimeout;
    }

    public final void setSocketTimeout(int i) {
        this.socketTimeout = i;
    }

    public final kotlin.jvm.functions.Function1<javax.net.ssl.HttpsURLConnection, kotlin.Unit> getSslManager() {
        return this.sslManager;
    }

    public final void setSslManager(kotlin.jvm.functions.Function1<? super javax.net.ssl.HttpsURLConnection, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.sslManager = function1;
    }

    public final kotlin.jvm.functions.Function1<java.net.HttpURLConnection, kotlin.Unit> getRequestConfig() {
        return this.requestConfig;
    }

    public final void setRequestConfig(kotlin.jvm.functions.Function1<? super java.net.HttpURLConnection, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.requestConfig = function1;
    }

    /* renamed from: $r8$lambda$ErKji_2KrMLLMa0-rrRKDVRk5Ko, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23244$r8$lambda$ErKji_2KrMLLMa0rrRKDVRk5Ko(javax.net.ssl.HttpsURLConnection httpsURLConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpsURLConnection, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$d_JhVaSfgBy9yxYHor-8BFVBog4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23245$r8$lambda$d_JhVaSfgBy9yxYHor8BFVBog4(java.net.HttpURLConnection httpURLConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return kotlin.Unit.INSTANCE;
    }
}
