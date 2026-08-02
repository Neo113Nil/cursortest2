package kotlin.internal.jdk8;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/MatchGroup;", "getMatchResultNamedGroup", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/MatchGroup;", "Lkotlin/random/Random;", "defaultPlatformRandom", "()Lkotlin/random/Random;", "Lkotlin/time/Clock;", "getSystemClock", "()Lkotlin/time/Clock;", "ReflectSdkVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class JDK8PlatformImplementations extends kotlin.internal.jdk7.JDK7PlatformImplementations {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "<init>", "()V", "", "getHighSpeedVideoFpsRanges", "Ljava/lang/Integer;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ReflectSdkVersion {
        public static final kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion INSTANCE = new kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        public static final java.lang.Integer Camera2StreamConfigurationMap;

        private ReflectSdkVersion() {
        }

        static {
            java.lang.Integer num;
            java.lang.Object obj;
            java.lang.Integer num2 = null;
            try {
                obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (java.lang.Throwable unused) {
            }
            if (obj instanceof java.lang.Integer) {
                num = (java.lang.Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                Camera2StreamConfigurationMap = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            Camera2StreamConfigurationMap = num2;
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    public kotlin.text.MatchGroup getMatchResultNamedGroup(java.util.regex.MatchResult matchResult, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.regex.Matcher matcher = matchResult instanceof java.util.regex.Matcher ? (java.util.regex.Matcher) matchResult : null;
        if (matcher == null) {
            throw new java.lang.UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(matcher.start(name2), matcher.end(name2) - 1);
        if (intRange.getStart().intValue() < 0) {
            return null;
        }
        java.lang.String group = matcher.group(name2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "");
        return new kotlin.text.MatchGroup(group, intRange);
    }

    @Override // kotlin.internal.PlatformImplementations
    public kotlin.random.Random defaultPlatformRandom() {
        return (kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.Camera2StreamConfigurationMap == null || kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.Camera2StreamConfigurationMap.intValue() >= 34) ? new kotlin.random.jdk8.PlatformThreadLocalRandom() : super.defaultPlatformRandom();
    }

    @Override // kotlin.internal.PlatformImplementations
    public kotlin.time.Clock getSystemClock() {
        if (kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.Camera2StreamConfigurationMap == null || kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.Camera2StreamConfigurationMap.intValue() >= 26) {
            return new kotlin.time.Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$1
                @Override // kotlin.time.Clock
                public final kotlin.time.Instant now() {
                    java.time.Instant now = java.time.Instant.now();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
                    return kotlin.time.jdk8.InstantConversionsJDK8Kt.toKotlinInstant(now);
                }
            };
        }
        return new kotlin.time.Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$2
            @Override // kotlin.time.Clock
            public final kotlin.time.Instant now() {
                return kotlin.time.Instant.INSTANCE.fromEpochMilliseconds(java.lang.System.currentTimeMillis());
            }
        };
    }
}
