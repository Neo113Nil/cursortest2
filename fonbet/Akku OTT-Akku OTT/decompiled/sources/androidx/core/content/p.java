package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$3;
        lambda$new$3 = IntentSanitizer.Builder.lambda$new$3((String) obj);
        return lambda$new$3;
    }
}
