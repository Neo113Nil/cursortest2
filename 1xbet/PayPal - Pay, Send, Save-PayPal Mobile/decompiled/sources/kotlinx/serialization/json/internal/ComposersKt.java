package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter;", "sb", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/Composer;", "Composer", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/internal/Composer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposersKt {
    public static final kotlinx.serialization.json.internal.Composer Composer(kotlinx.serialization.json.internal.InternalJsonWriter internalJsonWriter, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        return json.getConfiguration().getPrettyPrint() ? new kotlinx.serialization.json.internal.ComposerWithPrettyPrint(internalJsonWriter, json) : new kotlinx.serialization.json.internal.Composer(internalJsonWriter);
    }
}
