package com.facebook.internal;

/* compiled from: CustomTab.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/CustomTab;", "", "action", "", "parameters", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "openCustomTab", "", "activity", "Landroid/app/Activity;", "packageName", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class CustomTab {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.CustomTab.Companion INSTANCE = new com.facebook.internal.CustomTab.Companion(null);
    private android.net.Uri uri;

    @kotlin.jvm.JvmStatic
    public static android.net.Uri getURIForAction(java.lang.String str, android.os.Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.CustomTab.class)) {
            return null;
        }
        try {
            return INSTANCE.getURIForAction(str, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.CustomTab.class);
            return null;
        }
    }

    public CustomTab(java.lang.String action, android.os.Bundle bundle) {
        android.net.Uri uRIForAction;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        com.facebook.internal.GamingAction[] valuesCustom = com.facebook.internal.GamingAction.valuesCustom();
        java.util.ArrayList arrayList = new java.util.ArrayList(valuesCustom.length);
        for (com.facebook.internal.GamingAction gamingAction : valuesCustom) {
            arrayList.add(gamingAction.getRawValue());
        }
        if (arrayList.contains(action)) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
            uRIForAction = com.facebook.internal.Utility.buildUri(com.facebook.internal.ServerProtocol.getGamingDialogAuthority(), kotlin.jvm.internal.Intrinsics.stringPlus("/dialog/", action), bundle);
        } else {
            uRIForAction = INSTANCE.getURIForAction(action, bundle);
        }
        this.uri = uRIForAction;
    }

    protected final android.net.Uri getUri() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.uri;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    protected final void setUri(android.net.Uri uri) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.uri = uri;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final boolean openCustomTab(android.app.Activity activity, java.lang.String packageName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder(com.facebook.login.CustomTabPrefetchHelper.INSTANCE.getPreparedSessionOnce()).build();
            build.intent.setPackage(packageName);
            try {
                build.launchUrl(activity, this.uri);
                return true;
            } catch (android.content.ActivityNotFoundException unused) {
                return false;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* compiled from: CustomTab.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017¨\u0006\t"}, d2 = {"Lcom/facebook/internal/CustomTab$Companion;", "", "()V", "getURIForAction", "Landroid/net/Uri;", "action", "", "parameters", "Landroid/os/Bundle;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public android.net.Uri getURIForAction(java.lang.String action, android.os.Bundle parameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
            java.lang.String dialogAuthority = com.facebook.internal.ServerProtocol.getDialogAuthority();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            sb.append(com.facebook.FacebookSdk.getGraphApiVersion());
            sb.append("/dialog/");
            sb.append(action);
            return com.facebook.internal.Utility.buildUri(dialogAuthority, sb.toString(), parameters);
        }
    }
}
