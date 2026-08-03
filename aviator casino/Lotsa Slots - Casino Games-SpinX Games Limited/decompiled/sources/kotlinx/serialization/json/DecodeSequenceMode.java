package kotlinx.serialization.json;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Json.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/DecodeSequenceMode;", "", "<init>", "(Ljava/lang/String;I)V", "WHITESPACE_SEPARATED", "ARRAY_WRAPPED", "AUTO_DETECT", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes6.dex */
public final class DecodeSequenceMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlinx.serialization.json.DecodeSequenceMode[] $VALUES;
    public static final kotlinx.serialization.json.DecodeSequenceMode WHITESPACE_SEPARATED = new kotlinx.serialization.json.DecodeSequenceMode("WHITESPACE_SEPARATED", 0);
    public static final kotlinx.serialization.json.DecodeSequenceMode ARRAY_WRAPPED = new kotlinx.serialization.json.DecodeSequenceMode("ARRAY_WRAPPED", 1);
    public static final kotlinx.serialization.json.DecodeSequenceMode AUTO_DETECT = new kotlinx.serialization.json.DecodeSequenceMode("AUTO_DETECT", 2);

    private static final /* synthetic */ kotlinx.serialization.json.DecodeSequenceMode[] $values() {
        return new kotlinx.serialization.json.DecodeSequenceMode[]{WHITESPACE_SEPARATED, ARRAY_WRAPPED, AUTO_DETECT};
    }

    public static kotlin.enums.EnumEntries<kotlinx.serialization.json.DecodeSequenceMode> getEntries() {
        return $ENTRIES;
    }

    private DecodeSequenceMode(java.lang.String str, int i) {
    }

    static {
        kotlinx.serialization.json.DecodeSequenceMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlinx.serialization.json.DecodeSequenceMode valueOf(java.lang.String str) {
        return (kotlinx.serialization.json.DecodeSequenceMode) java.lang.Enum.valueOf(kotlinx.serialization.json.DecodeSequenceMode.class, str);
    }

    public static kotlinx.serialization.json.DecodeSequenceMode[] values() {
        return (kotlinx.serialization.json.DecodeSequenceMode[]) $VALUES.clone();
    }
}
