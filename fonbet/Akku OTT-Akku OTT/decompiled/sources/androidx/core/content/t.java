package androidx.core.content;

import android.content.ClipData;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$new$7;
        lambda$new$7 = IntentSanitizer.Builder.lambda$new$7((ClipData) obj);
        return lambda$new$7;
    }
}
