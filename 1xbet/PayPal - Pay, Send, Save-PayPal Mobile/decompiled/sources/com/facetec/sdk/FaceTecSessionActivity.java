package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class FaceTecSessionActivity extends com.facetec.sdk.bl {
    static com.facetec.sdk.FaceTecFaceScanProcessor e;
    static com.facetec.sdk.FaceTecIDScanProcessor i;

    @Override // com.facetec.sdk.bl, android.app.Activity
    public final /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.facetec.sdk.bf, android.app.Activity, android.content.ComponentCallbacks
    public final /* bridge */ /* synthetic */ void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facetec.sdk.bl, android.app.Activity
    public final /* bridge */ /* synthetic */ void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.facetec.sdk.bl, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public final /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i2, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // com.facetec.sdk.bl, android.app.Activity, android.view.Window.Callback
    public final /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // com.facetec.sdk.bl, com.facetec.sdk.dh.c
    public final /* bridge */ /* synthetic */ void r() {
        super.r();
    }

    public static void createAndLaunchSession(android.content.Context context, com.facetec.sdk.FaceTecFaceScanProcessor faceTecFaceScanProcessor) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, null, "");
    }

    public static void createAndLaunchSession(android.content.Context context, com.facetec.sdk.FaceTecFaceScanProcessor faceTecFaceScanProcessor, java.lang.String str) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, null, str);
    }

    public static void createAndLaunchSession(android.content.Context context, com.facetec.sdk.FaceTecFaceScanProcessor faceTecFaceScanProcessor, com.facetec.sdk.FaceTecIDScanProcessor faceTecIDScanProcessor) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, faceTecIDScanProcessor, "");
    }

    public static void createAndLaunchSession(android.content.Context context, com.facetec.sdk.FaceTecFaceScanProcessor faceTecFaceScanProcessor, com.facetec.sdk.FaceTecIDScanProcessor faceTecIDScanProcessor, java.lang.String str) {
        com.facetec.sdk.bj.g();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.facetec.sdk.FaceTecSessionActivity.class);
        if (str != null) {
            intent.putExtra("facetec.serverSessionToken", str);
        }
        e = faceTecFaceScanProcessor;
        i = faceTecIDScanProcessor;
        ((android.app.Activity) context).startActivityForResult(intent, 1002);
    }

    public static void createAndLaunchSession(android.content.Context context, com.facetec.sdk.FaceTecIDScanProcessor faceTecIDScanProcessor, java.lang.String str) {
        com.facetec.sdk.bj.g();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.facetec.sdk.FaceTecSessionActivity.class);
        if (str != null) {
            intent.putExtra("facetec.serverSessionToken", str);
        }
        e = null;
        i = faceTecIDScanProcessor;
        intent.putExtra("facetec.idScanOnlyMode", true);
        ((android.app.Activity) context).startActivityForResult(intent, 1002);
    }

    public static com.facetec.sdk.FaceTecSessionResult getSessionResultFromActivityResult(android.content.Intent intent) {
        if (intent != null) {
            return (com.facetec.sdk.FaceTecSessionResult) intent.getParcelableExtra(com.facetec.sdk.FaceTecSDK.EXTRA_SESSION_RESULTS);
        }
        return null;
    }

    public static com.facetec.sdk.FaceTecIDScanResult getIDScanResultFromActivityResult(android.content.Intent intent) {
        if (intent != null) {
            return (com.facetec.sdk.FaceTecIDScanResult) intent.getParcelableExtra(com.facetec.sdk.FaceTecSDK.EXTRA_ID_SCAN_RESULTS);
        }
        return null;
    }

    @Override // com.facetec.sdk.bl, com.facetec.sdk.bf, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.facetec.sdk.bl, com.facetec.sdk.bf, android.app.Activity
    protected final void onPause() {
        super.onPause();
    }

    @Override // com.facetec.sdk.bl, com.facetec.sdk.bf, android.app.Activity
    protected final void onResume() {
        super.onResume();
    }

    @Override // com.facetec.sdk.bl, com.facetec.sdk.bf, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // com.facetec.sdk.bl, com.facetec.sdk.bf, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
