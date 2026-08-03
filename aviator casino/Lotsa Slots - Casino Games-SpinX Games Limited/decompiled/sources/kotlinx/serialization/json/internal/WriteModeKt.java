package kotlinx.serialization.json.internal;

/* compiled from: WriteMode.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001aS\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u0007*\u0002H\u0006\"\b\b\u0002\u0010\b*\u0002H\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"switchMode", "Lkotlinx/serialization/json/internal/WriteMode;", "Lkotlinx/serialization/json/Json;", "desc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "selectMapMode", "T", "R1", "R2", "mapDescriptor", "ifMap", "Lkotlin/Function0;", "ifList", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "carrierDescriptor", "module", "Lkotlinx/serialization/modules/SerializersModule;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WriteModeKt {
    public static final kotlinx.serialization.json.internal.WriteMode switchMode(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor desc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "desc");
        kotlinx.serialization.descriptors.SerialKind kind = desc.getKind();
        if (kind instanceof kotlinx.serialization.descriptors.PolymorphicKind) {
            return kotlinx.serialization.json.internal.WriteMode.POLY_OBJ;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE)) {
            return kotlinx.serialization.json.internal.WriteMode.LIST;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE)) {
            return kotlinx.serialization.json.internal.WriteMode.OBJ;
        }
        kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor = carrierDescriptor(desc.getElementDescriptor(0), json.getSerializersModule());
        kotlinx.serialization.descriptors.SerialKind kind2 = carrierDescriptor.getKind();
        if ((kind2 instanceof kotlinx.serialization.descriptors.PrimitiveKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind2, kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
            return kotlinx.serialization.json.internal.WriteMode.MAP;
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return kotlinx.serialization.json.internal.WriteMode.LIST;
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
    }

    public static final <T, R1 extends T, R2 extends T> T selectMapMode(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor mapDescriptor, kotlin.jvm.functions.Function0<? extends R1> ifMap, kotlin.jvm.functions.Function0<? extends R2> ifList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapDescriptor, "mapDescriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifMap, "ifMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifList, "ifList");
        kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor = carrierDescriptor(mapDescriptor.getElementDescriptor(0), json.getSerializersModule());
        kotlinx.serialization.descriptors.SerialKind kind = carrierDescriptor.getKind();
        if ((kind instanceof kotlinx.serialization.descriptors.PrimitiveKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
            return ifMap.invoke();
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return ifList.invoke();
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.modules.SerializersModule module) {
        kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "module");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.INSTANCE)) {
            return serialDescriptor.getIsInline() ? carrierDescriptor(serialDescriptor.getElementDescriptor(0), module) : serialDescriptor;
        }
        kotlinx.serialization.descriptors.SerialDescriptor contextualDescriptor = kotlinx.serialization.descriptors.ContextAwareKt.getContextualDescriptor(module, serialDescriptor);
        return (contextualDescriptor == null || (carrierDescriptor = carrierDescriptor(contextualDescriptor, module)) == null) ? serialDescriptor : carrierDescriptor;
    }
}
