package io.ktor.client.plugins.sse;

/* compiled from: ClientSSESession.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a,\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"T", "Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;", "", "data", "deserialize", "(Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;Ljava/lang/String;)Ljava/lang/Object;", "Lio/ktor/sse/TypedServerSentEvent;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "(Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;Lio/ktor/sse/TypedServerSentEvent;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClientSSESessionKt {
    public static final /* synthetic */ <T> T deserialize(io.ktor.client.plugins.sse.SSESessionWithDeserialization sSESessionWithDeserialization, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSESessionWithDeserialization, "<this>");
        if (str == null) {
            return null;
        }
        kotlin.jvm.functions.Function2<io.ktor.util.reflect.TypeInfo, java.lang.String, java.lang.Object> deserializer = sSESessionWithDeserialization.getDeserializer();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        T t = (T) deserializer.invoke(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), str);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public static final /* synthetic */ <T> T deserialize(io.ktor.client.plugins.sse.SSESessionWithDeserialization sSESessionWithDeserialization, io.ktor.sse.TypedServerSentEvent<java.lang.String> event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSESessionWithDeserialization, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.lang.String data = event.getData();
        if (data == null) {
            return null;
        }
        kotlin.jvm.functions.Function2<io.ktor.util.reflect.TypeInfo, java.lang.String, java.lang.Object> deserializer = sSESessionWithDeserialization.getDeserializer();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T?");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T?");
        } catch (java.lang.Throwable unused) {
        }
        T t = (T) deserializer.invoke(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null), data);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T?");
        return t;
    }
}
