package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class Y extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f37848a = null;

    public static void a(@NonNull Context context) {
        if ((context instanceof Y) || (context.getResources() instanceof a0)) {
            return;
        }
        context.getResources();
        int i11 = h0.f37937a;
    }
}
