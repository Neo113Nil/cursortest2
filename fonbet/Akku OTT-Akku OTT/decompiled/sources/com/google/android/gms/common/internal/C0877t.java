package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.haryanvi.netstream.R;

/* renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0877t {
    public final Resources a;
    public final String b;

    public C0877t(@NonNull Context context) {
        C0875q.g(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @Nullable
    public final String a(@NonNull String str) {
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
