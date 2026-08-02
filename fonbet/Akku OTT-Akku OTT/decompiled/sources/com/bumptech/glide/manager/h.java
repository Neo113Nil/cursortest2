package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@RequiresApi(26)
/* loaded from: classes3.dex */
public final class h implements i {
    public final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // com.bumptech.glide.manager.i
    public final void a(FragmentActivity fragmentActivity) {
        if (!this.b && this.a.add(fragmentActivity)) {
            View decorView = fragmentActivity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new g(this, decorView));
        }
    }
}
