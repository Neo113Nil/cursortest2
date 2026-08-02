package com.figma.code.connect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/figma/code/connect/FigmaType;", "", "<init>", "(Ljava/lang/String;I)V", "Text", "Boolean", "Instance", "Enum"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FigmaType {
    public static final com.figma.code.connect.FigmaType Boolean;
    public static final com.figma.code.connect.FigmaType Enum;
    public static final com.figma.code.connect.FigmaType Instance;
    public static final com.figma.code.connect.FigmaType Text;
    private static final /* synthetic */ com.figma.code.connect.FigmaType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FigmaType(java.lang.String str, int i) {
    }

    static {
        com.figma.code.connect.FigmaType figmaType = new com.figma.code.connect.FigmaType("Text", 0);
        Text = figmaType;
        com.figma.code.connect.FigmaType figmaType2 = new com.figma.code.connect.FigmaType("Boolean", 1);
        Boolean = figmaType2;
        com.figma.code.connect.FigmaType figmaType3 = new com.figma.code.connect.FigmaType("Instance", 2);
        Instance = figmaType3;
        com.figma.code.connect.FigmaType figmaType4 = new com.figma.code.connect.FigmaType("Enum", 3);
        Enum = figmaType4;
        com.figma.code.connect.FigmaType[] figmaTypeArr = {figmaType, figmaType2, figmaType3, figmaType4};
        getHighSpeedVideoFpsRangesFor = figmaTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(figmaTypeArr);
    }

    public static com.figma.code.connect.FigmaType valueOf(java.lang.String str) {
        return (com.figma.code.connect.FigmaType) java.lang.Enum.valueOf(com.figma.code.connect.FigmaType.class, str);
    }

    public static com.figma.code.connect.FigmaType[] values() {
        return (com.figma.code.connect.FigmaType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.enums.EnumEntries<com.figma.code.connect.FigmaType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
