package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p000authapi.zbat;

/* renamed from: com.google.android.gms.auth.api.identity.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0816j {
    @NonNull
    public static zbat a(@NonNull Activity activity) {
        C0875q.g(activity);
        return new zbat(activity, new K());
    }

    @NonNull
    public static zbat b(@NonNull Context context) {
        C0875q.g(context);
        return new zbat(context, new K());
    }
}
