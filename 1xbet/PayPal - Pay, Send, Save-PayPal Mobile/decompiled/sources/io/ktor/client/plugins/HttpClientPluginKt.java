package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0007\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Lio/ktor/client/HttpClient;", "Lio/ktor/client/plugins/HttpClientPlugin;", "plugin", "pluginOrNull", "(Lio/ktor/client/HttpClient;Lio/ktor/client/plugins/HttpClientPlugin;)Ljava/lang/Object;", "Lio/ktor/util/AttributeKey;", "Lio/ktor/util/Attributes;", "PLUGIN_INSTALLED_LIST", "Lio/ktor/util/AttributeKey;", "getPLUGIN_INSTALLED_LIST", "()Lio/ktor/util/AttributeKey;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpClientPluginKt {
    private static final io.ktor.util.AttributeKey<io.ktor.util.Attributes> PLUGIN_INSTALLED_LIST;

    public static final io.ktor.util.AttributeKey<io.ktor.util.Attributes> getPLUGIN_INSTALLED_LIST() {
        return PLUGIN_INSTALLED_LIST;
    }

    public static final <B, F> F pluginOrNull(io.ktor.client.HttpClient httpClient, io.ktor.client.plugins.HttpClientPlugin<? extends B, F> httpClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientPlugin, "");
        io.ktor.util.Attributes attributes = (io.ktor.util.Attributes) httpClient.getAttributes().getOrNull(PLUGIN_INSTALLED_LIST);
        if (attributes != null) {
            return (F) attributes.getOrNull(httpClientPlugin.getKey());
        }
        return null;
    }

    public static final <B, F> F plugin(io.ktor.client.HttpClient httpClient, io.ktor.client.plugins.HttpClientPlugin<? extends B, F> httpClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientPlugin, "");
        F f = (F) pluginOrNull(httpClient, httpClientPlugin);
        if (f != null) {
            return f;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Plugin ");
        sb.append(httpClientPlugin);
        sb.append(" is not installed. Consider using `install(");
        sb.append(httpClientPlugin.getKey());
        sb.append(")` in client config first.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.util.Attributes.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.util.Attributes.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        PLUGIN_INSTALLED_LIST = new io.ktor.util.AttributeKey<>("ApplicationPluginRegistry", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }
}
