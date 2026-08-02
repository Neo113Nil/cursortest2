package com.chuckerteam.chucker.api;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\u00020\f8\u0007X\u0086D¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/chuckerteam/chucker/api/Chucker;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "getLaunchIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "", "dismissNotifications", "(Landroid/content/Context;)V", "", "isOp", "Z", "()Z", "isOp$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Chucker {
    public static final com.chuckerteam.chucker.api.Chucker INSTANCE = new com.chuckerteam.chucker.api.Chucker();
    private static final boolean isOp = false;

    public static /* synthetic */ void isOp$annotations() {
    }

    private Chucker() {
    }

    public final boolean isOp() {
        return isOp;
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent getLaunchIntent(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new android.content.Intent();
    }

    @kotlin.jvm.JvmStatic
    public static final void dismissNotifications(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
