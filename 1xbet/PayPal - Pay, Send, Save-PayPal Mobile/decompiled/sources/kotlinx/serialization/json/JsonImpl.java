package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonImpl;", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonConfiguration;", "p0", "Lkotlinx/serialization/modules/SerializersModule;", "p1", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/modules/SerializersModule;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonImpl extends kotlinx.serialization.json.Json {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonImpl(kotlinx.serialization.json.JsonConfiguration jsonConfiguration, kotlinx.serialization.modules.SerializersModule serializersModule) {
        super(jsonConfiguration, serializersModule, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(getSerializersModule(), kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule())) {
            return;
        }
        getSerializersModule().dumpTo(new kotlinx.serialization.json.internal.JsonSerializersModuleValidator(getConfiguration()));
    }
}
