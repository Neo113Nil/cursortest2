package io.ktor.serialization;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/serialization/Configuration;", "", "Lio/ktor/serialization/ContentConverter;", "T", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "converter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "register", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Configuration {
    <T extends io.ktor.serialization.ContentConverter> void register(io.ktor.http.ContentType contentType, T converter, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> configuration);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(io.ktor.serialization.Configuration configuration, io.ktor.http.ContentType contentType, io.ktor.serialization.ContentConverter contentConverter, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i & 4) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.serialization.Configuration$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return io.ktor.serialization.Configuration.DefaultImpls.$r8$lambda$r8W1cXLmVbURyidqoQ3RnxOwQ8Q((io.ktor.serialization.ContentConverter) obj2);
                    }
                };
            }
            configuration.register(contentType, contentConverter, function1);
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$r8W1cXLmVbURyidqoQ3RnxOwQ8Q(io.ktor.serialization.ContentConverter contentConverter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentConverter, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
