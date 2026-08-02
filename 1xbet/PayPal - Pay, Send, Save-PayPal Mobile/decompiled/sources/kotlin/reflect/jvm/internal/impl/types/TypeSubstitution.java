package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class TypeSubstitution {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution EMPTY = new kotlin.reflect.jvm.internal.impl.types.TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        public final boolean isEmpty() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* renamed from: get, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            return (kotlin.reflect.jvm.internal.impl.types.TypeProjection) get(kotlinType);
        }

        public final java.lang.String toString() {
            return "Empty TypeSubstitution";
        }

        public final java.lang.Void get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            return null;
        }
    };

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    /* renamed from: get */
    public abstract kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

    public boolean isEmpty() {
        return false;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor buildSubstitutor() {
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution replaceWithNonApproximating() {
        return new kotlin.reflect.jvm.internal.impl.types.TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$replaceWithNonApproximating$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final boolean approximateCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final boolean approximateContravariantCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* renamed from: get */
            public final kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
                return kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.this.mo23902get(kotlinType);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations filterAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
                return kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.this.filterAnnotations(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType prepareTopLevelType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
                return kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.this.prepareTopLevelType(kotlinType, variance);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final boolean isEmpty() {
                return kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.this.isEmpty();
            }
        };
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType prepareTopLevelType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
        return kotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations filterAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return annotations;
    }
}
