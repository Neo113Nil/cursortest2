package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes5.dex */
public final class SpecialNames {
    public static final kotlin.reflect.jvm.internal.impl.name.Name ANONYMOUS;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName ANONYMOUS_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.Name ARRAY;
    public static final kotlin.reflect.jvm.internal.impl.name.Name DEFAULT_NAME_FOR_COMPANION_OBJECT;
    public static final kotlin.reflect.jvm.internal.impl.name.Name DESTRUCT;
    public static final kotlin.reflect.jvm.internal.impl.name.Name ENUM_GET_ENTRIES;
    public static final kotlin.reflect.jvm.internal.impl.name.Name IMPLICIT_SET_PARAMETER;
    public static final kotlin.reflect.jvm.internal.impl.name.Name INIT;
    public static final kotlin.reflect.jvm.internal.impl.name.SpecialNames INSTANCE = new kotlin.reflect.jvm.internal.impl.name.SpecialNames();
    public static final kotlin.reflect.jvm.internal.impl.name.Name ITERATOR;
    public static final kotlin.reflect.jvm.internal.impl.name.Name LOCAL;
    public static final kotlin.reflect.jvm.internal.impl.name.Name NO_NAME_PROVIDED;
    public static final kotlin.reflect.jvm.internal.impl.name.Name RECEIVER;
    public static final kotlin.reflect.jvm.internal.impl.name.Name ROOT_PACKAGE;
    public static final kotlin.reflect.jvm.internal.impl.name.Name SAFE_IDENTIFIER_FOR_NO_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.Name THIS;
    public static final kotlin.reflect.jvm.internal.impl.name.Name UNARY;
    public static final kotlin.reflect.jvm.internal.impl.name.Name UNDERSCORE_FOR_UNUSED_VAR;
    public static final kotlin.reflect.jvm.internal.impl.name.Name WHEN_SUBJECT;

    private SpecialNames() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name special = kotlin.reflect.jvm.internal.impl.name.Name.special("<no name provided>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special, "");
        NO_NAME_PROVIDED = special;
        kotlin.reflect.jvm.internal.impl.name.Name special2 = kotlin.reflect.jvm.internal.impl.name.Name.special("<root package>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special2, "");
        ROOT_PACKAGE = special2;
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("Companion");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        DEFAULT_NAME_FOR_COMPANION_OBJECT = identifier;
        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
        SAFE_IDENTIFIER_FOR_NO_NAME = identifier2;
        kotlin.reflect.jvm.internal.impl.name.Name special3 = kotlin.reflect.jvm.internal.impl.name.Name.special("<anonymous>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special3, "");
        ANONYMOUS = special3;
        kotlin.reflect.jvm.internal.impl.name.FqName.Companion companion = kotlin.reflect.jvm.internal.impl.name.FqName.Companion;
        kotlin.reflect.jvm.internal.impl.name.Name special4 = kotlin.reflect.jvm.internal.impl.name.Name.special("<anonymous>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special4, "");
        ANONYMOUS_FQ_NAME = companion.topLevel(special4);
        kotlin.reflect.jvm.internal.impl.name.Name special5 = kotlin.reflect.jvm.internal.impl.name.Name.special("<unary>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special5, "");
        UNARY = special5;
        kotlin.reflect.jvm.internal.impl.name.Name special6 = kotlin.reflect.jvm.internal.impl.name.Name.special("<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special6, "");
        THIS = special6;
        kotlin.reflect.jvm.internal.impl.name.Name special7 = kotlin.reflect.jvm.internal.impl.name.Name.special("<init>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special7, "");
        INIT = special7;
        kotlin.reflect.jvm.internal.impl.name.Name special8 = kotlin.reflect.jvm.internal.impl.name.Name.special("<when-subject>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special8, "");
        WHEN_SUBJECT = special8;
        kotlin.reflect.jvm.internal.impl.name.Name special9 = kotlin.reflect.jvm.internal.impl.name.Name.special("<iterator>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special9, "");
        ITERATOR = special9;
        kotlin.reflect.jvm.internal.impl.name.Name special10 = kotlin.reflect.jvm.internal.impl.name.Name.special("<destruct>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special10, "");
        DESTRUCT = special10;
        kotlin.reflect.jvm.internal.impl.name.Name special11 = kotlin.reflect.jvm.internal.impl.name.Name.special("<local>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special11, "");
        LOCAL = special11;
        kotlin.reflect.jvm.internal.impl.name.Name special12 = kotlin.reflect.jvm.internal.impl.name.Name.special("<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special12, "");
        UNDERSCORE_FOR_UNUSED_VAR = special12;
        kotlin.reflect.jvm.internal.impl.name.Name special13 = kotlin.reflect.jvm.internal.impl.name.Name.special("<set-?>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special13, "");
        IMPLICIT_SET_PARAMETER = special13;
        kotlin.reflect.jvm.internal.impl.name.Name special14 = kotlin.reflect.jvm.internal.impl.name.Name.special("<array>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special14, "");
        ARRAY = special14;
        kotlin.reflect.jvm.internal.impl.name.Name special15 = kotlin.reflect.jvm.internal.impl.name.Name.special("<receiver>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special15, "");
        RECEIVER = special15;
        kotlin.reflect.jvm.internal.impl.name.Name special16 = kotlin.reflect.jvm.internal.impl.name.Name.special("<get-entries>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special16, "");
        ENUM_GET_ENTRIES = special16;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.name.Name safeIdentifier(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        return (name2 == null || name2.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : name2;
    }

    public final boolean isSafeIdentifier(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String asString = name2.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return asString.length() > 0 && !name2.isSpecial();
    }
}
