package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/plugins/DataConversion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/util/converters/DataConversion$Configuration;", "Lio/ktor/util/converters/DataConversion;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/util/converters/DataConversion;", "plugin", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Lio/ktor/util/converters/DataConversion;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DataConversion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.util.converters.DataConversion.Configuration, io.ktor.util.converters.DataConversion> {
    public static final io.ktor.client.plugins.DataConversion INSTANCE = new io.ktor.client.plugins.DataConversion();
    private static final io.ktor.util.AttributeKey<io.ktor.util.converters.DataConversion> key;

    private DataConversion() {
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final io.ktor.util.AttributeKey<io.ktor.util.converters.DataConversion> getKey() {
        return key;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final io.ktor.util.converters.DataConversion prepare(kotlin.jvm.functions.Function1<? super io.ktor.util.converters.DataConversion.Configuration, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        io.ktor.util.converters.DataConversion.Configuration configuration = new io.ktor.util.converters.DataConversion.Configuration();
        block.invoke(configuration);
        return new io.ktor.util.converters.DataConversion(configuration);
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.util.converters.DataConversion.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.util.converters.DataConversion.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        key = new io.ktor.util.AttributeKey<>("DataConversion", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final void install(io.ktor.util.converters.DataConversion plugin, io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }
}
