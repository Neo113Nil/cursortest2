package androidx.core.content;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$allowExtra$14;
        lambda$allowExtra$14 = IntentSanitizer.Builder.lambda$allowExtra$14(obj);
        return lambda$allowExtra$14;
    }
}
