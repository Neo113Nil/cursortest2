package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class TypeProjectionImpl extends kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase {
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.Variance getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return false;
    }

    public TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (variance == null) {
            getHighSpeedVideoFpsRanges(0);
        }
        if (kotlinType == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        this.getHighSpeedVideoFpsRangesFor = variance;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        this(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlinType);
        if (kotlinType == null) {
            getHighSpeedVideoFpsRanges(2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public kotlin.reflect.jvm.internal.impl.types.Variance getProjectionKind() {
        kotlin.reflect.jvm.internal.impl.types.Variance variance = this.getHighSpeedVideoFpsRangesFor;
        if (variance == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.getHighResolutionOutputSizeshNQ4ISI;
        if (kotlinType == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        return kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(this.getHighSpeedVideoFpsRangesFor, kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) this.getHighResolutionOutputSizeshNQ4ISI));
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
