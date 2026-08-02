package androidx.core.content;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$6;
        lambda$new$6 = IntentSanitizer.Builder.lambda$new$6((Uri) obj);
        return lambda$new$6;
    }
}
