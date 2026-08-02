package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$0;
        lambda$new$0 = IntentSanitizer.Builder.lambda$new$0((String) obj);
        return lambda$new$0;
    }
}
