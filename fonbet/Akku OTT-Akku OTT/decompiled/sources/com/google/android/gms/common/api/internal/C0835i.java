package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;

/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0835i {
    public final Activity a;

    public C0835i(@NonNull Activity activity) {
        C0875q.h(activity, "Activity must not be null");
        this.a = activity;
    }
}
