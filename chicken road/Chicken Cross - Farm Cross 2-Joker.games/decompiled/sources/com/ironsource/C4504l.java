package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4504l implements Eg {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f8292a;

    public C4504l(Activity activity) {
        this.f8292a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Eg
    public void a() {
        Activity activity = this.f8292a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
