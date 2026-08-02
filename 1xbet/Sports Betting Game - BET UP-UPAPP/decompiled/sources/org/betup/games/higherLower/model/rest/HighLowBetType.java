package org.betup.games.higherLower.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HighLowBetType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/games/higherLower/model/rest/HighLowBetType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "HIGHER", "LOWER", "EVEN", "ODD", "EQUAL", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HighLowBetType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HighLowBetType[] $VALUES;

    @SerializedName("Higher")
    public static final HighLowBetType HIGHER = new HighLowBetType("HIGHER", 0);

    @SerializedName("Lower")
    public static final HighLowBetType LOWER = new HighLowBetType("LOWER", 1);

    @SerializedName("Even")
    public static final HighLowBetType EVEN = new HighLowBetType("EVEN", 2);

    @SerializedName("Odd")
    public static final HighLowBetType ODD = new HighLowBetType("ODD", 3);

    @SerializedName("Equal")
    public static final HighLowBetType EQUAL = new HighLowBetType("EQUAL", 4);

    private static final /* synthetic */ HighLowBetType[] $values() {
        return new HighLowBetType[]{HIGHER, LOWER, EVEN, ODD, EQUAL};
    }

    public static EnumEntries<HighLowBetType> getEntries() {
        return $ENTRIES;
    }

    private HighLowBetType(String str, int i) {
    }

    static {
        HighLowBetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HighLowBetType valueOf(String str) {
        return (HighLowBetType) Enum.valueOf(HighLowBetType.class, str);
    }

    public static HighLowBetType[] values() {
        return (HighLowBetType[]) $VALUES.clone();
    }
}
