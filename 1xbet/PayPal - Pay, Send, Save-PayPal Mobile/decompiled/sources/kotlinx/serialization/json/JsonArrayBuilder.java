package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/serialization/json/JsonArrayBuilder;", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Lkotlinx/serialization/json/JsonElement;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lkotlinx/serialization/json/JsonArray;", "build", "()Lkotlinx/serialization/json/JsonArray;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.json.JsonDslMarker
/* loaded from: classes17.dex */
public final class JsonArrayBuilder {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<kotlinx.serialization.json.JsonElement> Camera2StreamConfigurationMap = new java.util.ArrayList();

    @kotlin.IgnorableReturnValue
    public final boolean add(kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        this.Camera2StreamConfigurationMap.add(element);
        return true;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    @kotlin.IgnorableReturnValue
    public final boolean addAll(java.util.Collection<? extends kotlinx.serialization.json.JsonElement> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.Camera2StreamConfigurationMap.addAll(elements);
    }

    public final kotlinx.serialization.json.JsonArray build() {
        return new kotlinx.serialization.json.JsonArray(this.Camera2StreamConfigurationMap);
    }
}
