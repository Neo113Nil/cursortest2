package Bd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c implements InterfaceC2627a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FOR_ALREADY_TRACKED;
    public static final c FOR_DEFAULT_IMPORTS;
    public static final c FOR_NON_TRACKED_SCOPE;
    public static final c FOR_SCRIPT;
    public static final c FROM_BACKEND;
    public static final c FROM_BUILTINS;
    public static final c FROM_DESERIALIZATION;
    public static final c FROM_IDE;
    public static final c FROM_JAVA_LOADER;
    public static final c FROM_REFLECTION;
    public static final c FROM_SYNTHETIC_SCOPE;
    public static final c FROM_TEST;
    public static final c WHEN_CHECK_DECLARATION_CONFLICTS;
    public static final c WHEN_CHECK_OVERRIDES;
    public static final c WHEN_FIND_BY_FQNAME;
    public static final c WHEN_GET_ALL_DESCRIPTORS;
    public static final c WHEN_GET_COMPANION_OBJECT;
    public static final c WHEN_GET_DECLARATION_SCOPE;
    public static final c WHEN_GET_LOCAL_VARIABLE;
    public static final c WHEN_GET_SUPER_MEMBERS;
    public static final c WHEN_RESOLVE_DECLARATION;
    public static final c WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS;
    public static final c WHEN_TYPING;

    static {
        c cVar = new c("FROM_IDE", 0);
        FROM_IDE = cVar;
        c cVar2 = new c("FROM_BACKEND", 1);
        FROM_BACKEND = cVar2;
        c cVar3 = new c("FROM_TEST", 2);
        FROM_TEST = cVar3;
        c cVar4 = new c("FROM_BUILTINS", 3);
        FROM_BUILTINS = cVar4;
        c cVar5 = new c("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        WHEN_CHECK_DECLARATION_CONFLICTS = cVar5;
        c cVar6 = new c("WHEN_CHECK_OVERRIDES", 5);
        WHEN_CHECK_OVERRIDES = cVar6;
        c cVar7 = new c("FOR_SCRIPT", 6);
        FOR_SCRIPT = cVar7;
        c cVar8 = new c("FROM_REFLECTION", 7);
        FROM_REFLECTION = cVar8;
        c cVar9 = new c("WHEN_RESOLVE_DECLARATION", 8);
        WHEN_RESOLVE_DECLARATION = cVar9;
        c cVar10 = new c("WHEN_GET_DECLARATION_SCOPE", 9);
        WHEN_GET_DECLARATION_SCOPE = cVar10;
        c cVar11 = new c("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = cVar11;
        c cVar12 = new c("FOR_ALREADY_TRACKED", 11);
        FOR_ALREADY_TRACKED = cVar12;
        c cVar13 = new c("WHEN_GET_ALL_DESCRIPTORS", 12);
        WHEN_GET_ALL_DESCRIPTORS = cVar13;
        c cVar14 = new c("WHEN_TYPING", 13);
        WHEN_TYPING = cVar14;
        c cVar15 = new c("WHEN_GET_SUPER_MEMBERS", 14);
        WHEN_GET_SUPER_MEMBERS = cVar15;
        c cVar16 = new c("FOR_NON_TRACKED_SCOPE", 15);
        FOR_NON_TRACKED_SCOPE = cVar16;
        c cVar17 = new c("FROM_SYNTHETIC_SCOPE", 16);
        FROM_SYNTHETIC_SCOPE = cVar17;
        c cVar18 = new c("FROM_DESERIALIZATION", 17);
        FROM_DESERIALIZATION = cVar18;
        c cVar19 = new c("FROM_JAVA_LOADER", 18);
        FROM_JAVA_LOADER = cVar19;
        c cVar20 = new c("WHEN_GET_LOCAL_VARIABLE", 19);
        WHEN_GET_LOCAL_VARIABLE = cVar20;
        c cVar21 = new c("WHEN_FIND_BY_FQNAME", 20);
        WHEN_FIND_BY_FQNAME = cVar21;
        c cVar22 = new c("WHEN_GET_COMPANION_OBJECT", 21);
        WHEN_GET_COMPANION_OBJECT = cVar22;
        c cVar23 = new c("FOR_DEFAULT_IMPORTS", 22);
        FOR_DEFAULT_IMPORTS = cVar23;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
