package org.betup.utils;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ApiUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/betup/utils/ApiUtils;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiUtils {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Json defaultModel = JsonKt.Json$default(null, new Function1() { // from class: org.betup.utils.ApiUtils$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit defaultModel$lambda$0;
            defaultModel$lambda$0 = ApiUtils.defaultModel$lambda$0((JsonBuilder) obj);
            return defaultModel$lambda$0;
        }
    }, 1, null);

    /* compiled from: ApiUtils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/betup/utils/ApiUtils$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "defaultModel", "Lkotlinx/serialization/json/Json;", "getDefaultModel$annotations", "getDefaultModel", "()Lkotlinx/serialization/json/Json;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefaultModel$annotations() {
        }

        private Companion() {
        }

        public final Json getDefaultModel() {
            return ApiUtils.defaultModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defaultModel$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setExplicitNulls(true);
        Json.setCoerceInputValues(true);
        return Unit.INSTANCE;
    }
}
