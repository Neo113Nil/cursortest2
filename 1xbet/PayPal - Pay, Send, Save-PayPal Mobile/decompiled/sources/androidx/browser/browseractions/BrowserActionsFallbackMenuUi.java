package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes5.dex */
class BrowserActionsFallbackMenuUi implements android.widget.AdapterView.OnItemClickListener {
    androidx.browser.browseractions.BrowserActionsFallbackMenuDialog Camera2StreamConfigurationMap;
    androidx.browser.browseractions.BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<androidx.browser.browseractions.BrowserActionItem> getHighSpeedVideoFpsRanges;
    final android.content.Context getHighSpeedVideoFpsRangesFor;
    final android.net.Uri getHighSpeedVideoSizes;

    interface BrowserActionsFallMenuUiListener {
    }

    BrowserActionsFallbackMenuUi(android.content.Context context, android.net.Uri uri, java.util.List<androidx.browser.browseractions.BrowserActionItem> list) {
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoSizes = uri;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new androidx.browser.browseractions.BrowserActionItem(context.getString(androidx.browser.R.string.fallback_menu_item_open_in_browser), android.app.PendingIntent.getActivity(context, 0, new android.content.Intent("android.intent.action.VIEW", uri), 67108864)));
        arrayList.add(new androidx.browser.browseractions.BrowserActionItem(context.getString(androidx.browser.R.string.fallback_menu_item_copy_link), new java.lang.Runnable() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuUi.1
            @Override // java.lang.Runnable
            public void run() {
                ((android.content.ClipboardManager) androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.getHighSpeedVideoFpsRangesFor.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("url", androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.getHighSpeedVideoSizes.toString()));
                android.widget.Toast.makeText(androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.getHighSpeedVideoFpsRangesFor, androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.getHighSpeedVideoFpsRangesFor.getString(androidx.browser.R.string.copy_toast_msg), 0).show();
            }
        }));
        java.lang.String string = context.getString(androidx.browser.R.string.fallback_menu_item_share_link);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", uri.toString());
        intent.setType("text/plain");
        arrayList.add(new androidx.browser.browseractions.BrowserActionItem(string, android.app.PendingIntent.getActivity(context, 0, intent, 67108864)));
        arrayList.addAll(list);
        this.getHighSpeedVideoFpsRanges = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        androidx.browser.browseractions.BrowserActionItem browserActionItem = this.getHighSpeedVideoFpsRanges.get(i);
        if (browserActionItem.getAction() != null) {
            try {
                browserActionItem.getAction().send();
            } catch (android.app.PendingIntent.CanceledException unused) {
            }
        } else if (browserActionItem.getHighResolutionOutputSizeshNQ4ISI != null) {
            browserActionItem.getHighResolutionOutputSizeshNQ4ISI.run();
        }
        androidx.browser.browseractions.BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = this.Camera2StreamConfigurationMap;
        if (browserActionsFallbackMenuDialog == null) {
            return;
        }
        browserActionsFallbackMenuDialog.dismiss();
    }
}
