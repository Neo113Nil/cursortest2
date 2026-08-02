package androidx.core.content;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$1;
        lambda$new$1 = IntentSanitizer.Builder.lambda$new$1((Uri) obj);
        return lambda$new$1;
    }
}
