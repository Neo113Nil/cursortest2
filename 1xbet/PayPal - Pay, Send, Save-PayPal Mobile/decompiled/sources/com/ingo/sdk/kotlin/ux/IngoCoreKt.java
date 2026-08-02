package com.ingo.sdk.kotlin.ux;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0001\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"6\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\"\u001d\u0010\u001c\u001a\u00020\u001b8\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"T", "get", "()Ljava/lang/Object;", "", "password", "", "isPasswordValid", "(Ljava/lang/String;)Z", "Lcom/ingo/sdk/kotlin/common/core/logging/IngoLogger;", "ingoLogging", "Lcom/ingo/sdk/kotlin/common/core/logging/IngoLogger;", "getIngoLogging", "()Lcom/ingo/sdk/kotlin/common/core/logging/IngoLogger;", "jsonHttpClientQualifierName", "Ljava/lang/String;", "", "HttpTimeoutValueMs", "J", "", "Lkotlin/reflect/KClass;", "", "ingoApplicationState", "Ljava/util/Map;", "getIngoApplicationState", "()Ljava/util/Map;", "setIngoApplicationState", "(Ljava/util/Map;)V", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "getJson$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IngoCoreKt {
    public static final long HttpTimeoutValueMs = 60000;
    public static final java.lang.String jsonHttpClientQualifierName = "jsonHttpClient";
    private static final com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = new com.ingo.sdk.kotlin.common.core.logging.IngoLogger();
    private static java.util.Map<kotlin.reflect.KClass<? extends java.lang.Object>, ? extends java.lang.Object> ingoApplicationState = kotlin.collections.MapsKt.emptyMap();
    private static final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.IngoCoreKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.ingo.sdk.kotlin.ux.IngoCoreKt.m10779$r8$lambda$RVxT0IF_GXwu5vAq0E8rYvS4H0((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    public static /* synthetic */ void getJson$annotations() {
    }

    public static final com.ingo.sdk.kotlin.common.core.logging.IngoLogger getIngoLogging() {
        return ingoLogging;
    }

    public static final java.util.Map<kotlin.reflect.KClass<? extends java.lang.Object>, java.lang.Object> getIngoApplicationState() {
        return ingoApplicationState;
    }

    public static final void setIngoApplicationState(java.util.Map<kotlin.reflect.KClass<? extends java.lang.Object>, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        ingoApplicationState = map;
    }

    public static final /* synthetic */ <T> T get() {
        java.util.Map<kotlin.reflect.KClass<? extends java.lang.Object>, java.lang.Object> ingoApplicationState2 = getIngoApplicationState();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        T t = (T) ingoApplicationState2.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }

    public static final kotlinx.serialization.json.Json getJson() {
        return json;
    }

    public static final boolean isPasswordValid(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        boolean z = false;
        if (str.length() < 8) {
            return false;
        }
        java.lang.String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            if (java.lang.Character.isUpperCase(str2.charAt(i))) {
                int i2 = 0;
                while (true) {
                    if (i2 >= str2.length()) {
                        z = true;
                        break;
                    }
                    if (java.lang.Character.isDigit(str2.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                return !z;
            }
        }
        return false;
    }

    /* renamed from: $r8$lambda$RVxT0IF_GXwu-5vAq0E8rYvS4H0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10779$r8$lambda$RVxT0IF_GXwu5vAq0E8rYvS4H0(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setLenient(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setUseAlternativeNames(false);
        return kotlin.Unit.INSTANCE;
    }
}
