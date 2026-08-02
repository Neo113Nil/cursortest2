package kotlin.time.jdk8;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/time/Instant;", "Ljava/time/Instant;", "toJavaInstant", "(Lkotlin/time/Instant;)Ljava/time/Instant;", "toKotlinInstant", "(Ljava/time/Instant;)Lkotlin/time/Instant;"}, k = 2, mv = {2, 3, 0}, pn = "", xi = 48)
/* loaded from: classes3.dex */
public final class InstantConversionsJDK8Kt {
    public static final java.time.Instant toJavaInstant(kotlin.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        java.time.Instant ofEpochSecond = java.time.Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "");
        return ofEpochSecond;
    }

    public static final kotlin.time.Instant toKotlinInstant(java.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        return kotlin.time.Instant.INSTANCE.fromEpochSeconds(instant.getEpochSecond(), instant.getNano());
    }
}
