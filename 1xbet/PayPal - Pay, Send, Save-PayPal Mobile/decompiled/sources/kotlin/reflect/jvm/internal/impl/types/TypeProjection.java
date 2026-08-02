package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public interface TypeProjection extends kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker {
    kotlin.reflect.jvm.internal.impl.types.Variance getProjectionKind();

    kotlin.reflect.jvm.internal.impl.types.KotlinType getType();

    boolean isStarProjection();

    kotlin.reflect.jvm.internal.impl.types.TypeProjection refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner);
}
