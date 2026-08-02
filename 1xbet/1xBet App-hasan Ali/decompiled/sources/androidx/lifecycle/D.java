package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.E;

/* loaded from: classes.dex */
public abstract class D {
    public static final void a(Activity activity, E.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
