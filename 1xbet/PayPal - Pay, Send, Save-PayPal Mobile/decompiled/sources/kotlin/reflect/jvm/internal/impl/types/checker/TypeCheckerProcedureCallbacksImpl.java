package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
class TypeCheckerProcedureCallbacksImpl implements kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks {
    TypeCheckerProcedureCallbacksImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    public boolean assertEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2) {
        if (typeConstructor == null) {
            getHighSpeedVideoFpsRanges(3);
        }
        if (typeConstructor2 == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        return typeConstructor.equals(typeConstructor2);
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = util.h.xy.cb.b.f1091;
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
