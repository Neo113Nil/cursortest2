package J50;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h.AbstractC6755a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends AbstractC6755a<Intent, Uri[]> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, Intent intent) {
        Intent input = intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // h.AbstractC6755a
    public final Uri[] c(int i11, Intent intent) {
        if (i11 != -1 || intent == null) {
            return null;
        }
        return L30.b.a(i11, intent);
    }
}
