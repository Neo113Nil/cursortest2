package kotlinx.serialization.modules;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJC\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\b\u0002\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u000bH'¢\u0006\u0004\b\b\u0010\rJ9\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u0006\u0010\u000f\u001a\u00028\u0000H'¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0011\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8!X¡\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0001!"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "", "<init>", "()V", "T", "Lkotlin/reflect/KClass;", "kclass", "Lkotlinx/serialization/KSerializer;", "getContextual", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "kClass", "", "typeArgumentsSerializers", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "baseClass", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/SerializationStrategy;", "getPolymorphic", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "collector", "", "dumpTo", "(Lkotlinx/serialization/modules/SerializersModuleCollector;)V", "", "getHasInterfaceContextualSerializers$kotlinx_serialization_core", "()Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations", "hasInterfaceContextualSerializers", "Lkotlinx/serialization/modules/SerialModuleImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SerializersModule {
    @kotlinx.serialization.InternalSerializationApi
    public static /* synthetic */ void getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations() {
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public abstract void dumpTo(kotlinx.serialization.modules.SerializersModuleCollector collector);

    @kotlinx.serialization.ExperimentalSerializationApi
    public abstract <T> kotlinx.serialization.KSerializer<T> getContextual(kotlin.reflect.KClass<T> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> typeArgumentsSerializers);

    public abstract boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core();

    @kotlinx.serialization.ExperimentalSerializationApi
    public abstract <T> kotlinx.serialization.DeserializationStrategy<T> getPolymorphic(kotlin.reflect.KClass<? super T> baseClass, java.lang.String serializedClassName);

    @kotlinx.serialization.ExperimentalSerializationApi
    public abstract <T> kotlinx.serialization.SerializationStrategy<T> getPolymorphic(kotlin.reflect.KClass<? super T> baseClass, T value);

    private SerializersModule() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of overload with default parameter", replaceWith = @kotlin.ReplaceWith(expression = "getContextual(kclass)", imports = {}))
    @kotlinx.serialization.ExperimentalSerializationApi
    public final /* synthetic */ kotlinx.serialization.KSerializer getContextual(kotlin.reflect.KClass kclass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kclass, "");
        return getContextual(kclass, kotlin.collections.CollectionsKt.emptyList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.serialization.KSerializer getContextual$default(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass kClass, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return serializersModule.getContextual(kClass, list);
    }

    public /* synthetic */ SerializersModule(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
