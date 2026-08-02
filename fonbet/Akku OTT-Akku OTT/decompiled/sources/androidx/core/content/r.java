package androidx.core.content;

import android.content.ComponentName;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$5;
        lambda$new$5 = IntentSanitizer.Builder.lambda$new$5((ComponentName) obj);
        return lambda$new$5;
    }
}
