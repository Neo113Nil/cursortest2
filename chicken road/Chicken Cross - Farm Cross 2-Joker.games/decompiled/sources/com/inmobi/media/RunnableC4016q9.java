package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC4016q9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f7322a;
    public final ArrayList b;
    public final WeakReference c;

    public RunnableC4016q9(C4044r9 impressionTracker) {
        Intrinsics.checkNotNullParameter(impressionTracker, "impressionTracker");
        this.f7322a = "q9";
        this.b = new ArrayList();
        this.c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String TAG = this.f7322a;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        C4044r9 c4044r9 = (C4044r9) this.c.get();
        if (c4044r9 != null) {
            for (Map.Entry entry : c4044r9.b.entrySet()) {
                View view = (View) entry.getKey();
                C3988p9 c3988p9 = (C3988p9) entry.getValue();
                String TAG2 = this.f7322a;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                String str = "inside for " + c3988p9;
                if (SystemClock.uptimeMillis() - c3988p9.d >= c3988p9.c) {
                    String TAG3 = this.f7322a;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    String str2 = "hasRequiredTimeElapsed " + c3988p9;
                    R7 r7 = c4044r9.h;
                    r7.getClass();
                    if (view instanceof Ej) {
                        Y9 y9 = r7.f6821a.f;
                        if (y9 != null) {
                            ((Z9) y9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((Ej) view).v();
                    }
                    this.b.add(view);
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                c4044r9.a((View) it.next());
            }
            this.b.clear();
            if (c4044r9.b.isEmpty() || c4044r9.e.hasMessages(0)) {
                return;
            }
            c4044r9.e.postDelayed(c4044r9.f, c4044r9.g);
        }
    }
}
