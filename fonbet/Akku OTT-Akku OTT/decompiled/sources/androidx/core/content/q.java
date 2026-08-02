package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$4;
        lambda$new$4 = IntentSanitizer.Builder.lambda$new$4((String) obj);
        return lambda$new$4;
    }
}
