package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J*\u0010\b\u001a\u00028\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/client/plugins/HttpClientPlugin;", "", "TConfig", "TPlugin", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "plugin", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Ljava/lang/Object;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HttpClientPlugin<TConfig, TPlugin> {
    io.ktor.util.AttributeKey<TPlugin> getKey();

    void install(TPlugin plugin, io.ktor.client.HttpClient scope);

    TPlugin prepare(kotlin.jvm.functions.Function1<? super TConfig, kotlin.Unit> block);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object prepare$default(io.ktor.client.plugins.HttpClientPlugin httpClientPlugin, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            }
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpClientPlugin$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return io.ktor.client.plugins.HttpClientPlugin.DefaultImpls.m23250$r8$lambda$Jbtz270R2Gb7Rc_YocXLnVi0LU(obj2);
                    }
                };
            }
            return httpClientPlugin.prepare(function1);
        }

        /* renamed from: $r8$lambda$Jbtz270R2Gb7Rc_YocX-LnVi0LU, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m23250$r8$lambda$Jbtz270R2Gb7Rc_YocXLnVi0LU(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
