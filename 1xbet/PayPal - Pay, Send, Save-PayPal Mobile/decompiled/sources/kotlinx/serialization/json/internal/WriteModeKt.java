package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aU\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u0007*\u00028\u0000\"\b\b\u0002\u0010\b*\u00028\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "Lkotlinx/serialization/json/internal/WriteMode;", "switchMode", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/WriteMode;", "T", "R1", "R2", "mapDescriptor", "Lkotlin/Function0;", "ifMap", "ifList", "selectMapMode", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/modules/SerializersModule;", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "carrierDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WriteModeKt {
    public static final kotlinx.serialization.json.internal.WriteMode switchMode(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlinx.serialization.descriptors.SerialKind kind = serialDescriptor.getKind();
        if (kind instanceof kotlinx.serialization.descriptors.PolymorphicKind) {
            return kotlinx.serialization.json.internal.WriteMode.POLY_OBJ;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE)) {
            return kotlinx.serialization.json.internal.WriteMode.LIST;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE)) {
            return kotlinx.serialization.json.internal.WriteMode.OBJ;
        }
        kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor = carrierDescriptor(serialDescriptor.getElementDescriptor(0), json.getSerializersModule());
        kotlinx.serialization.descriptors.SerialKind kind2 = carrierDescriptor.getKind();
        if ((kind2 instanceof kotlinx.serialization.descriptors.PrimitiveKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind2, kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
            return kotlinx.serialization.json.internal.WriteMode.MAP;
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return kotlinx.serialization.json.internal.WriteMode.LIST;
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
    }

    public static final <T, R1 extends T, R2 extends T> T selectMapMode(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.jvm.functions.Function0<? extends R1> function0, kotlin.jvm.functions.Function0<? extends R2> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor = carrierDescriptor(serialDescriptor.getElementDescriptor(0), json.getSerializersModule());
        kotlinx.serialization.descriptors.SerialKind kind = carrierDescriptor.getKind();
        if ((kind instanceof kotlinx.serialization.descriptors.PrimitiveKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
            return function0.invoke();
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return function02.invoke();
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.modules.SerializersModule serializersModule) {
        kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.INSTANCE)) {
            return serialDescriptor.getIsInline() ? carrierDescriptor(serialDescriptor.getElementDescriptor(0), serializersModule) : serialDescriptor;
        }
        kotlinx.serialization.descriptors.SerialDescriptor contextualDescriptor = kotlinx.serialization.descriptors.ContextAwareKt.getContextualDescriptor(serializersModule, serialDescriptor);
        return (contextualDescriptor == null || (carrierDescriptor = carrierDescriptor(contextualDescriptor, serializersModule)) == null) ? serialDescriptor : carrierDescriptor;
    }
}
