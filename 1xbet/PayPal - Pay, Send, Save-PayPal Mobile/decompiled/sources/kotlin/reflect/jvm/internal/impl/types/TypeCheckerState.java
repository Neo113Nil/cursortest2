package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class TypeCheckerState {
    private final boolean Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner getInputFormats;
    private java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext getOutputSizes;

    public TypeCheckerState(boolean z, boolean z2, boolean z3, boolean z4, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator abstractTypePreparator, kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner abstractTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractTypePreparator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractTypeRefiner, "");
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = z2;
        this.getHighSpeedVideoSizes = z3;
        this.getHighSpeedVideoFpsRangesFor = z4;
        this.getOutputSizes = typeSystemContext;
        this.getOutputFormats = abstractTypePreparator;
        this.getInputFormats = abstractTypeRefiner;
    }

    public final boolean isErrorTypeEqualsToAnything() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean isStubTypeEqualsToAnything() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isDnnTypesEqualToFlexible() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext getTypeSystemContext() {
        return this.getOutputSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker refineType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return this.getInputFormats.refineType(kotlinTypeMarker);
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return this.getOutputFormats.prepareType(kotlinTypeMarker);
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy getLowerCapturedTypePolicy(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public static /* synthetic */ java.lang.Boolean addSubtypeConstraint$default(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return typeCheckerState.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    public boolean runForkingPoint(kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext.Default r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext.Default();
        function1.invoke(r0);
        return r0.getResult();
    }

    public interface ForkPointContext {
        void fork(kotlin.jvm.functions.Function0<java.lang.Boolean> function0);

        public static final class Default implements kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext {
            private boolean getHighSpeedVideoFpsRanges;

            public final boolean getResult() {
                return this.getHighSpeedVideoFpsRanges;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public final void fork(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = function0.invoke().booleanValue();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LowerCapturedTypePolicy {
        public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy CHECK_ONLY_LOWER;
        public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy CHECK_SUBTYPE_AND_LOWER;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[] Camera2StreamConfigurationMap;
        public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy SKIP_LOWER;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

        private LowerCapturedTypePolicy(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy lowerCapturedTypePolicy = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);
            CHECK_ONLY_LOWER = lowerCapturedTypePolicy;
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy lowerCapturedTypePolicy2 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);
            CHECK_SUBTYPE_AND_LOWER = lowerCapturedTypePolicy2;
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy lowerCapturedTypePolicy3 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy("SKIP_LOWER", 2);
            SKIP_LOWER = lowerCapturedTypePolicy3;
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr = {lowerCapturedTypePolicy, lowerCapturedTypePolicy2, lowerCapturedTypePolicy3};
            Camera2StreamConfigurationMap = lowerCapturedTypePolicyArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(lowerCapturedTypePolicyArr);
        }

        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[] values() {
            return (kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[]) Camera2StreamConfigurationMap.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.class, str);
        }
    }

    public final java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> getSupertypesDeque() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> getSupertypesSet() {
        return this.getInputSizeshNQ4ISI;
    }

    public final void initialize() {
        this.getOutputMinFrameDuration = true;
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new java.util.ArrayDeque<>(4);
        }
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        }
    }

    public final void clear() {
        java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> arrayDeque = this.getHighSpeedVideoSizesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(arrayDeque);
        arrayDeque.clear();
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> set = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(set);
        set.clear();
        this.getOutputMinFrameDuration = false;
    }

    public static abstract class SupertypesPolicy {
        /* renamed from: transformType */
        public abstract kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker mo23901transformType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

        private SupertypesPolicy() {
        }

        public static final class None extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy {
            public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None INSTANCE = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None();

            private None() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* renamed from: transformType, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker mo23901transformType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
                return (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) transformType(typeCheckerState, kotlinTypeMarker);
            }

            public final java.lang.Void transformType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
                throw new java.lang.UnsupportedOperationException("Should not be called");
            }
        }

        public static final class UpperIfFlexible extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy {
            public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.UpperIfFlexible INSTANCE = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.UpperIfFlexible();

            private UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* renamed from: transformType */
            public final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker mo23901transformType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
                return typeCheckerState.getTypeSystemContext().upperBoundIfFlexible(kotlinTypeMarker);
            }
        }

        public static final class LowerIfFlexible extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy {
            public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible INSTANCE = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible();

            private LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* renamed from: transformType */
            public final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker mo23901transformType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
                return typeCheckerState.getTypeSystemContext().lowerBoundIfFlexible(kotlinTypeMarker);
            }
        }

        public static abstract class DoCustomTransform extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        public /* synthetic */ SupertypesPolicy(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean isAllowedTypeVariable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return this.getHighSpeedVideoFpsRangesFor && this.getOutputSizes.isTypeVariableType(kotlinTypeMarker);
    }

    public boolean customIsSubtypeOf(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
        return true;
    }

    public java.lang.Boolean addSubtypeConstraint(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
        return null;
    }
}
