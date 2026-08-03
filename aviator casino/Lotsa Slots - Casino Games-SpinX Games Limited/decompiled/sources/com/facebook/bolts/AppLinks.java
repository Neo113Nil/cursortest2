package com.facebook.bolts;

/* compiled from: AppLinks.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/bolts/AppLinks;", "", "()V", "KEY_NAME_APPLINK_DATA", "", "KEY_NAME_EXTRAS", "getAppLinkData", "Landroid/os/Bundle;", "intent", "Landroid/content/Intent;", "getAppLinkExtras", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppLinks {
    public static final com.facebook.bolts.AppLinks INSTANCE = new com.facebook.bolts.AppLinks();
    public static final java.lang.String KEY_NAME_APPLINK_DATA = "al_applink_data";
    public static final java.lang.String KEY_NAME_EXTRAS = "extras";

    private AppLinks() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getAppLinkData(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.getBundleExtra(KEY_NAME_APPLINK_DATA);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getAppLinkExtras(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        android.os.Bundle appLinkData = getAppLinkData(intent);
        if (appLinkData == null) {
            return null;
        }
        return appLinkData.getBundle("extras");
    }
}
