package org.betup.model.remote.entity.challenges;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GlobalChallengeStateDeserializer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lorg/betup/model/remote/entity/challenges/GlobalChallengeStateDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GlobalChallengeStateDeserializer implements JsonDeserializer<ChallengeState> {
    public static final int $stable = 0;

    @Override // com.google.gson.JsonDeserializer
    public ChallengeState deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        ChallengeState fromServerGlobalInt = ChallengeState.INSTANCE.fromServerGlobalInt(json != null ? json.getAsInt() : 1);
        return fromServerGlobalInt == null ? ChallengeState.NONE.INSTANCE : fromServerGlobalInt;
    }
}
