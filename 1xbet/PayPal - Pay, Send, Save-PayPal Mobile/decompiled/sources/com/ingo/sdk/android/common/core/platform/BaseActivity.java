package com.ingo.sdk.android.common.core.platform;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/ingo/sdk/android/common/core/platform/BaseActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "Ljava/io/File;", "getSelfieDirectory", "()Ljava/io/File;", "selfieDirectory", "", "createDirectory", "(Ljava/io/File;)V", "deleteDirectory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseActivity extends androidx.fragment.app.FragmentActivity {
    public static final int $stable = 8;

    protected final java.io.File getSelfieDirectory() {
        java.lang.String path = getFilesDir().getPath();
        java.lang.String str = java.io.File.separator;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(path);
        sb.append(str);
        sb.append("ingo_sdk_kyc_selfie");
        return new java.io.File(sb.toString());
    }

    protected final void createDirectory(java.io.File selfieDirectory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selfieDirectory, "");
        if (!selfieDirectory.exists()) {
            if (selfieDirectory.mkdir()) {
                return;
            }
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Could Not Create Selfie Directory", null, null, 6, null);
            return;
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Selfie Directory Already Exists", null, 2, null);
    }

    protected final void deleteDirectory(java.io.File selfieDirectory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selfieDirectory, "");
        if (selfieDirectory.exists()) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Selfie Directory Exists, Attempting to Delete All Images", null, 2, null);
            java.io.File[] listFiles = selfieDirectory.listFiles();
            if (listFiles != null) {
                for (java.io.File file : listFiles) {
                    if (!file.delete()) {
                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Failed to delete ".concat(java.lang.String.valueOf(file.getPath())), null, null, 6, null);
                    }
                }
            }
            if (selfieDirectory.delete()) {
                return;
            }
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Failed deleting selfie directory", null, null, 6, null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
