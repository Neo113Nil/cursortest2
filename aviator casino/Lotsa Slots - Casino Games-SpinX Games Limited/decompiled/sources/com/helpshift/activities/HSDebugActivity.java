package com.helpshift.activities;

/* loaded from: classes4.dex */
public class HSDebugActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final java.lang.String TAG = "Helpshift_DebugAct";

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.helpshift.R.layout.hs__debug_layout);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.helpshift.R.id.debug_log_message);
        textView.setText("Preparing logs...");
        try {
            com.helpshift.storage.HSPersistentStorage hSPersistentStorage = new com.helpshift.storage.HSPersistentStorage(new com.helpshift.storage.SharedPreferencesStore(this, com.helpshift.storage.HSPersistentStorage.FILE_NAME, 0));
            java.lang.String str = hSPersistentStorage.getDomain() + "." + hSPersistentStorage.getHost();
            java.lang.String appName = getAppName();
            java.io.File file = new java.io.File(getFilesDir() + java.io.File.separator + com.helpshift.log.LogCollector.LOG_DIR_PATH);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.io.File[] listFiles = file.listFiles();
            if (file.exists() && listFiles != null && listFiles.length > 0) {
                java.util.Arrays.sort(listFiles);
                for (java.io.File file2 : listFiles) {
                    sb.append("Log File: ");
                    sb.append(file2.getName());
                    sb.append("\n \n");
                    readFileAsString(file2, sb);
                    sb.append("\n \n");
                }
            }
            sendEmailIntent(sb.toString(), str, appName);
            finish();
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Error when sharing/reading log", e);
            textView.setText("Error preparing logs: " + e.getMessage());
        }
    }

    private void sendEmailIntent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{"bugs@helpshift.com"});
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", str2 + " / " + str3 + " / " + getPackageName());
        startActivity(android.content.Intent.createChooser(intent, "Send email..."));
    }

    private java.lang.String getAppName() {
        try {
            return getApplicationInfo().loadLabel(getPackageManager()).toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private void readFileAsString(java.io.File file, java.lang.StringBuilder sb) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append("\n");
                    } else {
                        bufferedReader.close();
                        return;
                    }
                } finally {
                }
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Error reading log file: " + file.getName(), e);
        }
    }
}
