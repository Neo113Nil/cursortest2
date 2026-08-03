package androidx.core.content;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class IntentSanitizer$Builder$$ExternalSyntheticLambda1 implements androidx.core.util.Predicate {
    public final /* synthetic */ java.lang.String f$0;

    @Override // androidx.core.util.Predicate
    public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate) {
        return androidx.core.util.Predicate.CC.$default$and(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ androidx.core.util.Predicate negate() {
        return androidx.core.util.Predicate.CC.$default$negate(this);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate) {
        return androidx.core.util.Predicate.CC.$default$or(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(java.lang.Object obj) {
        return this.f$0.equals((java.lang.String) obj);
    }
}
