package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public class TypeCheckingProcedure {
    public static kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (kotlinType2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        return findCorrespondingSupertype(kotlinType, kotlinType2, new kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerProcedureCallbacksImpl());
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        if (kotlinType2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        if (typeCheckingProcedureCallbacks == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.UtilsKt.findCorrespondingSupertype(kotlinType, kotlinType2, typeCheckingProcedureCallbacks);
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 7 || i == 10) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case 21:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i == 7) {
            objArr[1] = "getOutType";
        } else if (i != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 7 && i != 10) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
