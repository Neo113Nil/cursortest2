package org.betup.games.dice.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiceBetType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/games/dice/model/rest/DiceBetType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "LESS", "GREATER", "EQUAL", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiceBetType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiceBetType[] $VALUES;

    @SerializedName("Less")
    public static final DiceBetType LESS = new DiceBetType("LESS", 0);

    @SerializedName("Greater")
    public static final DiceBetType GREATER = new DiceBetType("GREATER", 1);

    @SerializedName("Equal")
    public static final DiceBetType EQUAL = new DiceBetType("EQUAL", 2);

    private static final /* synthetic */ DiceBetType[] $values() {
        return new DiceBetType[]{LESS, GREATER, EQUAL};
    }

    public static EnumEntries<DiceBetType> getEntries() {
        return $ENTRIES;
    }

    private DiceBetType(String str, int i) {
    }

    static {
        DiceBetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DiceBetType valueOf(String str) {
        return (DiceBetType) Enum.valueOf(DiceBetType.class, str);
    }

    public static DiceBetType[] values() {
        return (DiceBetType[]) $VALUES.clone();
    }
}
