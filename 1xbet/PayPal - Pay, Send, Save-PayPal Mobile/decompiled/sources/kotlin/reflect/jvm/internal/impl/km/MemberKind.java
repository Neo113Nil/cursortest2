package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MemberKind {
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind DECLARATION;
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind DELEGATION;
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind FAKE_OVERRIDE;
    public static final kotlin.reflect.jvm.internal.impl.km.MemberKind SYNTHESIZED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.MemberKind[] getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getHighSpeedVideoFpsRangesFor;

    private MemberKind(java.lang.String str, int i, int i2) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(flagField, i2);
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.MemberKind memberKind = new kotlin.reflect.jvm.internal.impl.km.MemberKind("DECLARATION", 0, 0);
        DECLARATION = memberKind;
        kotlin.reflect.jvm.internal.impl.km.MemberKind memberKind2 = new kotlin.reflect.jvm.internal.impl.km.MemberKind("FAKE_OVERRIDE", 1, 1);
        FAKE_OVERRIDE = memberKind2;
        kotlin.reflect.jvm.internal.impl.km.MemberKind memberKind3 = new kotlin.reflect.jvm.internal.impl.km.MemberKind("DELEGATION", 2, 2);
        DELEGATION = memberKind3;
        kotlin.reflect.jvm.internal.impl.km.MemberKind memberKind4 = new kotlin.reflect.jvm.internal.impl.km.MemberKind("SYNTHESIZED", 3, 3);
        SYNTHESIZED = memberKind4;
        kotlin.reflect.jvm.internal.impl.km.MemberKind[] memberKindArr = {memberKind, memberKind2, memberKind3, memberKind4};
        getHighSpeedVideoSizes = memberKindArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(memberKindArr);
    }

    public final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getFlag$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlin.reflect.jvm.internal.impl.km.MemberKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.MemberKind[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.MemberKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.MemberKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.MemberKind.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.MemberKind> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
