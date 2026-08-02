package kotlin.reflect.jvm.internal.impl.incremental.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class NoLookupLocation implements kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation {
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FOR_ALREADY_TRACKED;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FOR_DEFAULT_IMPORTS;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FOR_NON_TRACKED_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FOR_SCRIPT;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_BACKEND;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_BUILTINS;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_DESERIALIZATION;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_IDE;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_JAVA_LOADER;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_REFLECTION;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_SYNTHETIC_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation FROM_TEST;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_CHECK_DECLARATION_CONFLICTS;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_CHECK_OVERRIDES;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_FIND_BY_FQNAME;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_GET_ALL_DESCRIPTORS;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_GET_COMPANION_OBJECT;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_GET_DECLARATION_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_GET_LOCAL_VARIABLE;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_GET_SUPER_MEMBERS;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_RESOLVE_DECLARATION;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation WHEN_TYPING;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation
    public final kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo getLocation() {
        return null;
    }

    private NoLookupLocation(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_IDE", 0);
        FROM_IDE = noLookupLocation;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation2 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_BACKEND", 1);
        FROM_BACKEND = noLookupLocation2;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation3 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_TEST", 2);
        FROM_TEST = noLookupLocation3;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation4 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_BUILTINS", 3);
        FROM_BUILTINS = noLookupLocation4;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation5 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        WHEN_CHECK_DECLARATION_CONFLICTS = noLookupLocation5;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation6 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_CHECK_OVERRIDES", 5);
        WHEN_CHECK_OVERRIDES = noLookupLocation6;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation7 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FOR_SCRIPT", 6);
        FOR_SCRIPT = noLookupLocation7;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation8 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_REFLECTION", 7);
        FROM_REFLECTION = noLookupLocation8;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation9 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_RESOLVE_DECLARATION", 8);
        WHEN_RESOLVE_DECLARATION = noLookupLocation9;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation10 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_GET_DECLARATION_SCOPE", 9);
        WHEN_GET_DECLARATION_SCOPE = noLookupLocation10;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation11 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = noLookupLocation11;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation12 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FOR_ALREADY_TRACKED", 11);
        FOR_ALREADY_TRACKED = noLookupLocation12;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation13 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_GET_ALL_DESCRIPTORS", 12);
        WHEN_GET_ALL_DESCRIPTORS = noLookupLocation13;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation14 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_TYPING", 13);
        WHEN_TYPING = noLookupLocation14;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation15 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_GET_SUPER_MEMBERS", 14);
        WHEN_GET_SUPER_MEMBERS = noLookupLocation15;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation16 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FOR_NON_TRACKED_SCOPE", 15);
        FOR_NON_TRACKED_SCOPE = noLookupLocation16;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation17 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_SYNTHETIC_SCOPE", 16);
        FROM_SYNTHETIC_SCOPE = noLookupLocation17;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation18 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_DESERIALIZATION", 17);
        FROM_DESERIALIZATION = noLookupLocation18;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation19 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FROM_JAVA_LOADER", 18);
        FROM_JAVA_LOADER = noLookupLocation19;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation20 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_GET_LOCAL_VARIABLE", 19);
        WHEN_GET_LOCAL_VARIABLE = noLookupLocation20;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation21 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_FIND_BY_FQNAME", 20);
        WHEN_FIND_BY_FQNAME = noLookupLocation21;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation22 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("WHEN_GET_COMPANION_OBJECT", 21);
        WHEN_GET_COMPANION_OBJECT = noLookupLocation22;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation23 = new kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation("FOR_DEFAULT_IMPORTS", 22);
        FOR_DEFAULT_IMPORTS = noLookupLocation23;
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation[] noLookupLocationArr = {noLookupLocation, noLookupLocation2, noLookupLocation3, noLookupLocation4, noLookupLocation5, noLookupLocation6, noLookupLocation7, noLookupLocation8, noLookupLocation9, noLookupLocation10, noLookupLocation11, noLookupLocation12, noLookupLocation13, noLookupLocation14, noLookupLocation15, noLookupLocation16, noLookupLocation17, noLookupLocation18, noLookupLocation19, noLookupLocation20, noLookupLocation21, noLookupLocation22, noLookupLocation23};
        getHighSpeedVideoFpsRanges = noLookupLocationArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(noLookupLocationArr);
    }

    public static kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation[] values() {
        return (kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.class, str);
    }
}
