package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nJ'\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "elementIndex", "", "serialName", "serialNameForJson", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)Ljava/lang/String;", "Builtins"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes3.dex */
public interface JsonNamingStrategy {

    /* renamed from: Builtins, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.JsonNamingStrategy.Companion INSTANCE = kotlinx.serialization.json.JsonNamingStrategy.Companion.Camera2StreamConfigurationMap;

    java.lang.String serialNameForJson(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int elementIndex, java.lang.String serialName);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy$Builtins;", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonNamingStrategy;", "SnakeCase", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase$annotations", "KebabCase", "getKebabCase", "getKebabCase$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.ExperimentalSerializationApi
    /* renamed from: kotlinx.serialization.json.JsonNamingStrategy$Builtins, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ kotlinx.serialization.json.JsonNamingStrategy.Companion Camera2StreamConfigurationMap = new kotlinx.serialization.json.JsonNamingStrategy.Companion();
        private static final kotlinx.serialization.json.JsonNamingStrategy SnakeCase = new kotlinx.serialization.json.JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public final java.lang.String serialNameForJson(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int elementIndex, java.lang.String serialName) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "");
                return kotlinx.serialization.json.JsonNamingStrategy.Companion.access$convertCamelCase(kotlinx.serialization.json.JsonNamingStrategy.Companion.Camera2StreamConfigurationMap, serialName, '_');
            }

            public final java.lang.String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };
        private static final kotlinx.serialization.json.JsonNamingStrategy KebabCase = new kotlinx.serialization.json.JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public final java.lang.String serialNameForJson(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int elementIndex, java.lang.String serialName) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "");
                return kotlinx.serialization.json.JsonNamingStrategy.Companion.access$convertCamelCase(kotlinx.serialization.json.JsonNamingStrategy.Companion.Camera2StreamConfigurationMap, serialName, '-');
            }

            public final java.lang.String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        };

        @kotlinx.serialization.ExperimentalSerializationApi
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        public static /* synthetic */ void getSnakeCase$annotations() {
        }

        private Companion() {
        }

        public final kotlinx.serialization.json.JsonNamingStrategy getSnakeCase() {
            return SnakeCase;
        }

        public final kotlinx.serialization.json.JsonNamingStrategy getKebabCase() {
            return KebabCase;
        }

        public static final /* synthetic */ java.lang.String access$convertCamelCase(kotlinx.serialization.json.JsonNamingStrategy.Companion companion, java.lang.String str, char c) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() * 2);
            java.lang.String str2 = str;
            java.lang.Character ch = null;
            int i = 0;
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char charAt = str2.charAt(i2);
                if (java.lang.Character.isUpperCase(charAt)) {
                    if (i == 0) {
                        java.lang.StringBuilder sb2 = sb;
                        if (sb2.length() > 0 && kotlin.text.StringsKt.last(sb2) != c) {
                            sb.append(c);
                        }
                    }
                    if (ch != null) {
                        sb.append(ch.charValue());
                    }
                    i++;
                    ch = java.lang.Character.valueOf(java.lang.Character.toLowerCase(charAt));
                } else {
                    if (ch != null) {
                        if (i > 1 && java.lang.Character.isLetter(charAt)) {
                            sb.append(c);
                        }
                        sb.append(ch.charValue());
                        ch = null;
                        i = 0;
                    }
                    sb.append(charAt);
                }
            }
            if (ch != null) {
                sb.append(ch.charValue());
            }
            return sb.toString();
        }
    }
}
