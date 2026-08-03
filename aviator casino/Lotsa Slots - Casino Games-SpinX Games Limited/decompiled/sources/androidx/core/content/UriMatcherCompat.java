package androidx.core.content;

/* loaded from: classes.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    public static androidx.core.util.Predicate<android.net.Uri> asPredicate(final android.content.UriMatcher uriMatcher) {
        return new androidx.core.util.Predicate() { // from class: androidx.core.content.UriMatcherCompat$$ExternalSyntheticLambda0
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
                return androidx.core.content.UriMatcherCompat.lambda$asPredicate$0(uriMatcher, (android.net.Uri) obj);
            }
        };
    }

    static /* synthetic */ boolean lambda$asPredicate$0(android.content.UriMatcher uriMatcher, android.net.Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
