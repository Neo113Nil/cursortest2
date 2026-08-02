package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b`\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0012\"\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/izettle/android/auth/AuthWebLauncher;", "", "Landroid/app/Activity;", "activity", "Landroid/net/Uri;", "uri", "", "taskId", "", "toolbarColor", "", "launchContainerActivity", "(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;I)V", "Lcom/izettle/android/core/data/result/Result;", "", "", "launchInBrowser", "(Landroid/app/Activity;Landroid/net/Uri;I)Lcom/izettle/android/core/data/result/Result;", "", "uris", "prepare", "([Landroid/net/Uri;)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface AuthWebLauncher {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.AuthWebLauncher.Companion INSTANCE = com.izettle.android.auth.AuthWebLauncher.Companion.$$INSTANCE;

    void launchContainerActivity(android.app.Activity activity, android.net.Uri uri, java.lang.String taskId, int toolbarColor);

    com.izettle.android.core.data.result.Result<java.lang.Boolean, java.lang.Throwable> launchInBrowser(android.app.Activity activity, android.net.Uri uri, int toolbarColor);

    void prepare(android.net.Uri... uris);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/AuthWebLauncher$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/izettle/android/auth/log/Logger;", "logger", "Lcom/izettle/android/auth/AuthWebLauncher;", "create", "(Landroid/content/Context;Lcom/izettle/android/auth/log/Logger;)Lcom/izettle/android/auth/AuthWebLauncher;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.AuthWebLauncher.Companion $$INSTANCE = new com.izettle.android.auth.AuthWebLauncher.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.AuthWebLauncher create(android.content.Context context, com.izettle.android.auth.log.Logger logger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
            return new com.izettle.android.auth.AuthWebLauncherImpl(logger, context, null, 4, null);
        }
    }
}
