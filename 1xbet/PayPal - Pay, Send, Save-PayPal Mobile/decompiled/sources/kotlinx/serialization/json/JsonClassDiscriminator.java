package kotlinx.serialization.json;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/serialization/json/JsonClassDiscriminator;", "", "", "discriminator", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface JsonClassDiscriminator {
    java.lang.String discriminator();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class Impl implements kotlinx.serialization.json.JsonClassDiscriminator {
        private final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;

        @Override // kotlinx.serialization.json.JsonClassDiscriminator
        public final /* synthetic */ java.lang.String discriminator() {
            return this.Camera2StreamConfigurationMap;
        }

        public Impl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.Camera2StreamConfigurationMap = str;
        }
    }
}
