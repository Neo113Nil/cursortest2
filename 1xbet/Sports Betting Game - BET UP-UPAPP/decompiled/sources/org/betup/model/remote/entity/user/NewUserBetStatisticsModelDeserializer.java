package org.betup.model.remote.entity.user;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBetStatisticsModelDeserializer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\f\u001a\u00020\r*\u00020\u0007H\u0002J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0007H\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0007H\u0002J\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0007H\u0002¨\u0006\u0014"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModelDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "takeNumberAsInt", "", "takeNumberAsLong", "", "takeNumberAsDouble", "", "takeString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewUserBetStatisticsModelDeserializer implements JsonDeserializer<NewUserBetStatisticsModel> {
    public static final int $stable = 0;

    @Override // com.google.gson.JsonDeserializer
    public NewUserBetStatisticsModel deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        String str;
        String takeString;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        JsonObject asJsonObject = json.getAsJsonObject();
        JsonElement jsonElement = asJsonObject.get("all_bets");
        int takeNumberAsInt = jsonElement != null ? takeNumberAsInt(jsonElement) : 0;
        JsonElement jsonElement2 = asJsonObject.get("returned");
        int takeNumberAsInt2 = jsonElement2 != null ? takeNumberAsInt(jsonElement2) : 0;
        JsonElement jsonElement3 = asJsonObject.get("pending");
        int takeNumberAsInt3 = jsonElement3 != null ? takeNumberAsInt(jsonElement3) : 0;
        JsonElement jsonElement4 = asJsonObject.get("won");
        int takeNumberAsInt4 = jsonElement4 != null ? takeNumberAsInt(jsonElement4) : 0;
        JsonElement jsonElement5 = asJsonObject.get("lost");
        int takeNumberAsInt5 = jsonElement5 != null ? takeNumberAsInt(jsonElement5) : 0;
        JsonElement jsonElement6 = asJsonObject.get("sold");
        int takeNumberAsInt6 = jsonElement6 != null ? takeNumberAsInt(jsonElement6) : 0;
        JsonElement jsonElement7 = asJsonObject.get("canceled");
        int takeNumberAsInt7 = jsonElement7 != null ? takeNumberAsInt(jsonElement7) : 0;
        JsonElement jsonElement8 = asJsonObject.get("high_score");
        long takeNumberAsLong = jsonElement8 != null ? takeNumberAsLong(jsonElement8) : 0L;
        JsonElement jsonElement9 = asJsonObject.get("biggest_win");
        long takeNumberAsLong2 = jsonElement9 != null ? takeNumberAsLong(jsonElement9) : 0L;
        JsonElement jsonElement10 = asJsonObject.get("biggest_loss");
        long takeNumberAsLong3 = jsonElement10 != null ? takeNumberAsLong(jsonElement10) : 0L;
        JsonElement jsonElement11 = asJsonObject.get("bet_winning_streak");
        int takeNumberAsInt8 = jsonElement11 != null ? takeNumberAsInt(jsonElement11) : 0;
        JsonElement jsonElement12 = asJsonObject.get("current_win_streak");
        int takeNumberAsInt9 = jsonElement12 != null ? takeNumberAsInt(jsonElement12) : 0;
        JsonElement jsonElement13 = asJsonObject.get("max_winning_odds");
        double takeNumberAsDouble = jsonElement13 != null ? takeNumberAsDouble(jsonElement13) : 0.0d;
        JsonElement jsonElement14 = asJsonObject.get("average_bet_amount");
        long takeNumberAsLong4 = jsonElement14 != null ? takeNumberAsLong(jsonElement14) : 0L;
        JsonElement jsonElement15 = asJsonObject.get("most_popular_bet");
        String str2 = (jsonElement15 == null || (takeString = takeString(jsonElement15)) == null) ? "" : takeString;
        JsonElement jsonElement16 = asJsonObject.get("most_profitable_bet");
        if (jsonElement16 == null || (str = takeString(jsonElement16)) == null) {
            str = "";
        }
        return new NewUserBetStatisticsModel(takeNumberAsInt, takeNumberAsInt2, takeNumberAsInt3, takeNumberAsInt4, takeNumberAsInt5, takeNumberAsInt6, takeNumberAsInt7, takeNumberAsLong, takeNumberAsLong2, takeNumberAsLong3, takeNumberAsInt8, takeNumberAsInt9, takeNumberAsDouble, takeNumberAsLong4, str2, str);
    }

    private final int takeNumberAsInt(JsonElement jsonElement) {
        if (jsonElement.isJsonNull() || !jsonElement.isJsonPrimitive()) {
            return 0;
        }
        try {
            return jsonElement.getAsJsonPrimitive().getAsInt();
        } catch (Exception unused) {
            return RangesKt.coerceIn((int) jsonElement.getAsJsonPrimitive().getAsNumber().longValue(), Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }

    private final long takeNumberAsLong(JsonElement jsonElement) {
        if (jsonElement.isJsonNull() || !jsonElement.isJsonPrimitive()) {
            return 0L;
        }
        try {
            return jsonElement.getAsJsonPrimitive().getAsNumber().longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    private final double takeNumberAsDouble(JsonElement jsonElement) {
        if (jsonElement.isJsonNull() || !jsonElement.isJsonPrimitive()) {
            return 0.0d;
        }
        try {
            return jsonElement.getAsJsonPrimitive().getAsNumber().doubleValue();
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    private final String takeString(JsonElement jsonElement) {
        if (jsonElement.isJsonNull() || !jsonElement.isJsonPrimitive()) {
            return "";
        }
        try {
            String asString = jsonElement.getAsJsonPrimitive().getAsString();
            Intrinsics.checkNotNull(asString);
            return asString;
        } catch (Exception unused) {
            return "";
        }
    }
}
