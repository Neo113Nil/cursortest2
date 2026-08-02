package financial.atomic.muppet.http;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/ClientPlugin;", "Lfinancial/atomic/muppet/http/ContentTypeFallbackConfig;", "ContentTypeFallback", "Lio/ktor/client/plugins/api/ClientPlugin;", "getContentTypeFallback", "()Lio/ktor/client/plugins/api/ClientPlugin;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentTypeFallbackKt {
    private static final io.ktor.client.plugins.api.ClientPlugin<financial.atomic.muppet.http.ContentTypeFallbackConfig> ContentTypeFallback = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("ContentTypeFallback", financial.atomic.muppet.c.a.f6838a, new kotlin.jvm.functions.Function1() { // from class: financial.atomic.muppet.http.ContentTypeFallbackKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return financial.atomic.muppet.http.ContentTypeFallbackKt.$r8$lambda$tHn1l02TTduwmGdM6JWEmt8wbIM((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
        }
    });

    public static final io.ktor.client.plugins.api.ClientPlugin<financial.atomic.muppet.http.ContentTypeFallbackConfig> getContentTypeFallback() {
        return ContentTypeFallback;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tHn1l02TTduwmGdM6JWEmt8wbIM(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        clientPluginBuilder.transformResponseBody(new financial.atomic.muppet.c.b(null));
        return kotlin.Unit.INSTANCE;
    }
}
