package org.betup.games;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackPressedType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/games/BackPressedType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "BACK_FROM_BACK_STACK", "BACK_TO_VIEW", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackPressedType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackPressedType[] $VALUES;
    public static final BackPressedType BACK_FROM_BACK_STACK = new BackPressedType("BACK_FROM_BACK_STACK", 0);
    public static final BackPressedType BACK_TO_VIEW = new BackPressedType("BACK_TO_VIEW", 1);

    private static final /* synthetic */ BackPressedType[] $values() {
        return new BackPressedType[]{BACK_FROM_BACK_STACK, BACK_TO_VIEW};
    }

    public static EnumEntries<BackPressedType> getEntries() {
        return $ENTRIES;
    }

    private BackPressedType(String str, int i) {
    }

    static {
        BackPressedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BackPressedType valueOf(String str) {
        return (BackPressedType) Enum.valueOf(BackPressedType.class, str);
    }

    public static BackPressedType[] values() {
        return (BackPressedType[]) $VALUES.clone();
    }
}
