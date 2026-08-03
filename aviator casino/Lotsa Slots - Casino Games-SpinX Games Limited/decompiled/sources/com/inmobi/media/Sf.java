package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Sf {
    public static final boolean a(android.content.Context context, java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "permission");
        if (context == null) {
            return false;
        }
        return context.checkCallingOrSelfPermission(permission) == 0;
    }
}
