package androidx.core.content;

/* loaded from: classes7.dex */
public final /* synthetic */ class IntentSanitizer$Builder$$ExternalSyntheticLambda1 implements androidx.core.util.Predicate {
    public final /* synthetic */ java.lang.String f$0;

    public /* synthetic */ IntentSanitizer$Builder$$ExternalSyntheticLambda1(java.lang.String str) {
        this.f$0 = str;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(java.lang.Object obj) {
        boolean equals;
        equals = this.f$0.equals((java.lang.String) obj);
        return equals;
    }
}
