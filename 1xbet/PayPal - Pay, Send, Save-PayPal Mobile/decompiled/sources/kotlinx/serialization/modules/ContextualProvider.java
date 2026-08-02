package kotlinx.serialization.modules;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider;", "", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Argless", "WithTypeArguments", "Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ContextualProvider {
    public abstract kotlinx.serialization.KSerializer<?> invoke(java.util.List<? extends kotlinx.serialization.KSerializer<?>> typeArgumentsSerializers);

    private ContextualProvider() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider;", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "getSerializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Argless extends kotlinx.serialization.modules.ContextualProvider {
        private final kotlinx.serialization.KSerializer<?> serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Argless(kotlinx.serialization.KSerializer<?> kSerializer) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
            this.serializer = kSerializer;
        }

        public final kotlinx.serialization.KSerializer<?> getSerializer() {
            return this.serializer;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public final kotlinx.serialization.KSerializer<?> invoke(java.util.List<? extends kotlinx.serialization.KSerializer<?>> typeArgumentsSerializers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "");
            return this.serializer;
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof kotlinx.serialization.modules.ContextualProvider.Argless) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlinx.serialization.modules.ContextualProvider.Argless) other).serializer, this.serializer);
        }

        public final int hashCode() {
            return this.serializer.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B.\u0012%\u0010\u0006\u001a!\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\b\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR6\u0010\u0006\u001a!\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\b\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "Lkotlinx/serialization/modules/ContextualProvider;", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "provider", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Lkotlin/jvm/functions/Function1;", "getProvider", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WithTypeArguments extends kotlinx.serialization.modules.ContextualProvider {
        private final kotlin.jvm.functions.Function1<java.util.List<? extends kotlinx.serialization.KSerializer<?>>, kotlinx.serialization.KSerializer<?>> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WithTypeArguments(kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> function1) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.provider = function1;
        }

        public final kotlin.jvm.functions.Function1<java.util.List<? extends kotlinx.serialization.KSerializer<?>>, kotlinx.serialization.KSerializer<?>> getProvider() {
            return this.provider;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public final kotlinx.serialization.KSerializer<?> invoke(java.util.List<? extends kotlinx.serialization.KSerializer<?>> typeArgumentsSerializers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "");
            return this.provider.invoke(typeArgumentsSerializers);
        }
    }

    public /* synthetic */ ContextualProvider(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
