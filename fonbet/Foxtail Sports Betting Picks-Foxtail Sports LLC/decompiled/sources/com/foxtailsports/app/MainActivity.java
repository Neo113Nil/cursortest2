package com.foxtailsports.app;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import com.foxtailsports.app.MainActivity;
import com.getcapacitor.BridgeActivity;

/* loaded from: classes.dex */
public class MainActivity extends BridgeActivity {
    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        clearCacheOnVersionChange();
        getBridge().getWebView().addJavascriptInterface(new OfflineReloadBridge(), "FoxtailBridge");
    }

    private void clearCacheOnVersionChange() {
        try {
            int i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            SharedPreferences sharedPreferences = getSharedPreferences("foxtail_app", 0);
            int i2 = sharedPreferences.getInt("last_version_code", -1);
            if (i2 != i) {
                getBridge().getWebView().clearCache(true);
                Log.i("Foxtail", "Cleared WebView cache (version " + i2 + " -> " + i + ")");
            }
            sharedPreferences.edit().putInt("last_version_code", i).apply();
        } catch (Exception e) {
            Log.w("Foxtail", "Failed to check version for cache clear", e);
        }
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CookieManager.getInstance().flush();
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        CookieManager.getInstance().flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class OfflineReloadBridge {
        private OfflineReloadBridge() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reload$0() {
            MainActivity.this.getBridge().reload();
        }

        @JavascriptInterface
        public void reload() {
            MainActivity.this.runOnUiThread(new Runnable() { // from class: com.foxtailsports.app.MainActivity$OfflineReloadBridge$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.OfflineReloadBridge.this.lambda$reload$0();
                }
            });
        }
    }
}
