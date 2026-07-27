package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Og {
    public static final boolean a(Context context, String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context == null) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(permission) == 0;
        } catch (Exception unused) {
            String str = "Exception occurred while checking for permission " + permission;
            return false;
        }
    }
}
