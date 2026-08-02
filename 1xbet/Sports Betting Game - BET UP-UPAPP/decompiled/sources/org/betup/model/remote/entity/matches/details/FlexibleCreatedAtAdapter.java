package org.betup.model.remote.entity.matches.details;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchPlacedBetInfoModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/FlexibleCreatedAtAdapter;", "Lcom/google/gson/JsonDeserializer;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlexibleCreatedAtAdapter implements JsonDeserializer<String> {
    public static final int $stable = 0;

    @Override // com.google.gson.JsonDeserializer
    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        if (json == null || json.isJsonNull() || !json.isJsonPrimitive()) {
            return null;
        }
        JsonPrimitive asJsonPrimitive = json.getAsJsonPrimitive();
        if (asJsonPrimitive.isString()) {
            String asString = asJsonPrimitive.getAsString();
            Intrinsics.checkNotNull(asString);
            if (StringsKt.isBlank(asString)) {
                return null;
            }
            return asString;
        }
        if (!asJsonPrimitive.isNumber()) {
            return null;
        }
        long asLong = asJsonPrimitive.getAsLong();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(asLong));
    }
}
