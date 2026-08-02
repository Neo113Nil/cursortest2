package org.betup.rewardedprompt;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedPromptContextParams.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ<\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/rewardedprompt/RewardedPromptContextParams;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "gson", "Lcom/google/gson/Gson;", "mapType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "toJson", "", "params", "", "fromJson", "json", "merge", "screenContext", "pushContext", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewardedPromptContextParams {
    public static final RewardedPromptContextParams INSTANCE = new RewardedPromptContextParams();
    private static final Gson gson = new Gson();
    private static final Type mapType = new TypeToken<Map<String, ? extends String>>() { // from class: org.betup.rewardedprompt.RewardedPromptContextParams$mapType$1
    }.getType();
    public static final int $stable = 8;

    private RewardedPromptContextParams() {
    }

    public final String toJson(Map<String, String> params) {
        if (params == null || params.isEmpty()) {
            return null;
        }
        return gson.toJson(params);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, String> fromJson(String json) {
        String str;
        Pair pair;
        String obj;
        String str2 = json;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return MapsKt.emptyMap();
        }
        try {
            Map map = (Map) gson.fromJson(json, mapType);
            Map<String, String> map2 = null;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    if (str3 == null || (obj = StringsKt.trim((CharSequence) str3).toString()) == null) {
                        str = null;
                    } else {
                        str = obj.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    String str5 = "";
                    if (str == null) {
                        str = "";
                    }
                    String obj2 = str4 != null ? StringsKt.trim((CharSequence) str4).toString() : null;
                    if (obj2 != null) {
                        str5 = obj2;
                    }
                    if (str.length() != 0 && str5.length() != 0) {
                        pair = TuplesKt.to(str, str5);
                        if (pair == null) {
                            arrayList.add(pair);
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                }
                map2 = MapsKt.toMap(arrayList);
            }
            return map2 == null ? MapsKt.emptyMap() : map2;
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }

    public final Map<String, String> merge(Map<String, String> screenContext, Map<String, String> pushContext) {
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        return (pushContext == null || pushContext.isEmpty()) ? screenContext : screenContext.isEmpty() ? pushContext : MapsKt.plus(screenContext, pushContext);
    }
}
