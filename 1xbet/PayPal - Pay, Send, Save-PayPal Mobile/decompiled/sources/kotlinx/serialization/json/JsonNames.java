package kotlinx.serialization.json;

@java.lang.annotation.Target({})
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005"}, d2 = {"Lkotlinx/serialization/json/JsonNames;", "", "", "names", "", "()[Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.PROPERTY})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface JsonNames {
    java.lang.String[] names();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class Impl implements kotlinx.serialization.json.JsonNames {
        private final /* synthetic */ java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlinx.serialization.json.JsonNames
        public final /* synthetic */ java.lang.String[] names() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public Impl(java.lang.String[] strArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
            this.getHighResolutionOutputSizeshNQ4ISI = strArr;
        }
    }
}
