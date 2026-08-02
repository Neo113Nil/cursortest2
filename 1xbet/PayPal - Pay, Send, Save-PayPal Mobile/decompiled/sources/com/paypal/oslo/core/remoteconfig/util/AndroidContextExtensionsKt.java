package com.paypal.oslo.core.remoteconfig.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "", "isDebugBuild", "isRunningFromTestProcess", "(Landroid/content/Context;Z)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidContextExtensionsKt {
    public static /* synthetic */ boolean isRunningFromTestProcess$default(android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return isRunningFromTestProcess(context, z);
    }

    public static final boolean isRunningFromTestProcess(android.content.Context context, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            java.lang.String packageName = context.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
            if (kotlin.text.StringsKt.endsWith$default(packageName, "test", false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }
}
