package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$allowExtra$12;
        lambda$allowExtra$12 = IntentSanitizer.Builder.lambda$allowExtra$12(obj);
        return lambda$allowExtra$12;
    }
}
