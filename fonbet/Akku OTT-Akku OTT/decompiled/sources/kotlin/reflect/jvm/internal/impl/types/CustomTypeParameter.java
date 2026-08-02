package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public interface CustomTypeParameter {
    boolean isTypeParameter();

    KotlinType substitutionResult(KotlinType kotlinType);
}
