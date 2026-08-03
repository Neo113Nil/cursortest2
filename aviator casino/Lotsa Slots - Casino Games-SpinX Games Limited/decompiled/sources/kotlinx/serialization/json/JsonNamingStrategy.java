package kotlinx.serialization.json;

/* compiled from: JsonNamingStrategy.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy;", "", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "Builtins", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes6.dex */
public interface JsonNamingStrategy {

    /* renamed from: Builtins, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.JsonNamingStrategy.Companion INSTANCE = kotlinx.serialization.json.JsonNamingStrategy.Companion.$$INSTANCE;

    java.lang.String serialNameForJson(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int elementIndex, java.lang.String serialName);

    /* compiled from: JsonNamingStrategy.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy$Builtins;", "", "<init>", "()V", "SnakeCase", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase$annotations", "getSnakeCase", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "KebabCase", "getKebabCase$annotations", "getKebabCase", "convertCamelCase", "", "serialName", "delimiter", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.ExperimentalSerializationApi
    /* renamed from: kotlinx.serialization.json.JsonNamingStrategy$Builtins, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ kotlinx.serialization.json.JsonNamingStrategy.Companion $$INSTANCE = new kotlinx.serialization.json.JsonNamingStrategy.Companion();
        private static final kotlinx.serialization.json.JsonNamingStrategy SnakeCase = new kotlinx.serialization.json.JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public java.lang.String serialNameForJson(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int elementIndex, java.lang.String serialName) {
                java.lang.String convertCamelCase;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
                convertCamelCase = kotlinx.serialization.json.JsonNamingStrategy.Companion.$$INSTANCE.convertCamelCase(serialName, '_');
                return convertCamelCase;
            }

            public java.lang.String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };
        private static final kotlinx.serialization.json.JsonNamingStrategy KebabCase = new kotlinx.serialization.json.JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public java.lang.String serialNameForJson(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int elementIndex, java.lang.String serialName) {
                java.lang.String convertCamelCase;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
                convertCamelCase = kotlinx.serialization.json.JsonNamingStrategy.Companion.$$INSTANCE.convertCamelCase(serialName, '-');
                return convertCamelCase;
            }

            public java.lang.String toString() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String convertCamelCase(java.lang.String serialName, char delimiter) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(serialName.length() * 2);
            java.lang.String str = serialName;
            java.lang.Character ch = null;
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (java.lang.Character.isUpperCase(charAt)) {
                    if (i == 0) {
                        java.lang.StringBuilder sb2 = sb;
                        if (sb2.length() > 0 && kotlin.text.StringsKt.last(sb2) != delimiter) {
                            sb.append(delimiter);
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
                            sb.append(delimiter);
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
