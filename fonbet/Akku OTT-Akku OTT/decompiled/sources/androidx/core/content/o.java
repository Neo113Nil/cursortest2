package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$2;
        lambda$new$2 = IntentSanitizer.Builder.lambda$new$2((String) obj);
        return lambda$new$2;
    }
}
