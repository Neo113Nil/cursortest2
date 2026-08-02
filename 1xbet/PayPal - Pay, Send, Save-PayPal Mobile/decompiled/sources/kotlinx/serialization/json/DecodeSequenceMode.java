package kotlinx.serialization.json;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlinx/serialization/json/DecodeSequenceMode;", "", "<init>", "(Ljava/lang/String;I)V", "WHITESPACE_SEPARATED", "ARRAY_WRAPPED", "AUTO_DETECT"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes17.dex */
public final class DecodeSequenceMode {
    public static final kotlinx.serialization.json.DecodeSequenceMode ARRAY_WRAPPED;
    public static final kotlinx.serialization.json.DecodeSequenceMode AUTO_DETECT;
    public static final kotlinx.serialization.json.DecodeSequenceMode WHITESPACE_SEPARATED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlinx.serialization.json.DecodeSequenceMode[] getHighSpeedVideoSizes;

    private DecodeSequenceMode(java.lang.String str, int i) {
    }

    static {
        kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode = new kotlinx.serialization.json.DecodeSequenceMode("WHITESPACE_SEPARATED", 0);
        WHITESPACE_SEPARATED = decodeSequenceMode;
        kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode2 = new kotlinx.serialization.json.DecodeSequenceMode("ARRAY_WRAPPED", 1);
        ARRAY_WRAPPED = decodeSequenceMode2;
        kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode3 = new kotlinx.serialization.json.DecodeSequenceMode("AUTO_DETECT", 2);
        AUTO_DETECT = decodeSequenceMode3;
        kotlinx.serialization.json.DecodeSequenceMode[] decodeSequenceModeArr = {decodeSequenceMode, decodeSequenceMode2, decodeSequenceMode3};
        getHighSpeedVideoSizes = decodeSequenceModeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(decodeSequenceModeArr);
    }

    public static kotlinx.serialization.json.DecodeSequenceMode[] values() {
        return (kotlinx.serialization.json.DecodeSequenceMode[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlinx.serialization.json.DecodeSequenceMode valueOf(java.lang.String str) {
        return (kotlinx.serialization.json.DecodeSequenceMode) java.lang.Enum.valueOf(kotlinx.serialization.json.DecodeSequenceMode.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlinx.serialization.json.DecodeSequenceMode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
