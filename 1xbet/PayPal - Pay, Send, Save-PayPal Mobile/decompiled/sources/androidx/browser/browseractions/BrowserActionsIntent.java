package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public class BrowserActionsIntent {
    public static final java.lang.String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final java.lang.String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final java.lang.String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final java.lang.String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final java.lang.String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final java.lang.String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final java.lang.String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    public static final java.lang.String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    public static final int MAX_CUSTOM_ITEMS = 5;
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;
    private final android.content.Intent getHighSpeedVideoFpsRangesFor;

    interface BrowserActionsFallDialogListener {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BrowserActionsItemId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BrowserActionsUrlType {
    }

    public android.content.Intent getIntent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    BrowserActionsIntent(android.content.Intent intent) {
        this.getHighSpeedVideoFpsRangesFor = intent;
    }

    public static final class Builder {
        private android.content.Context Camera2StreamConfigurationMap;
        private android.net.Uri getHighSpeedVideoSizesFor;
        private final android.content.Intent getHighResolutionOutputSizeshNQ4ISI = new android.content.Intent(androidx.browser.browseractions.BrowserActionsIntent.ACTION_BROWSER_ACTIONS_OPEN);
        private int getOutputFormats = 0;
        private java.util.ArrayList<android.os.Bundle> getHighSpeedVideoSizes = new java.util.ArrayList<>();
        private android.app.PendingIntent getHighSpeedVideoFpsRangesFor = null;
        private java.util.List<android.net.Uri> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        public Builder(android.content.Context context, android.net.Uri uri) {
            this.Camera2StreamConfigurationMap = context;
            this.getHighSpeedVideoSizesFor = uri;
        }

        public final androidx.browser.browseractions.BrowserActionsIntent.Builder setUrlType(int i) {
            this.getOutputFormats = i;
            return this;
        }

        public final androidx.browser.browseractions.BrowserActionsIntent.Builder setCustomItems(java.util.ArrayList<androidx.browser.browseractions.BrowserActionItem> arrayList) {
            if (arrayList.size() > 5) {
                throw new java.lang.IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (android.text.TextUtils.isEmpty(arrayList.get(i).getTitle()) || arrayList.get(i).getAction() == null) {
                    throw new java.lang.IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                java.util.ArrayList<android.os.Bundle> arrayList2 = this.getHighSpeedVideoSizes;
                androidx.browser.browseractions.BrowserActionItem browserActionItem = arrayList.get(i);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(androidx.browser.browseractions.BrowserActionsIntent.KEY_TITLE, browserActionItem.getTitle());
                bundle.putParcelable(androidx.browser.browseractions.BrowserActionsIntent.KEY_ACTION, browserActionItem.getAction());
                if (browserActionItem.getIconId() != 0) {
                    bundle.putInt(androidx.browser.browseractions.BrowserActionsIntent.KEY_ICON_ID, browserActionItem.getIconId());
                }
                if (browserActionItem.getIconUri() != null) {
                    bundle.putParcelable("androidx.browser.browseractions.ICON_URI", browserActionItem.getIconUri());
                }
                arrayList2.add(bundle);
                if (arrayList.get(i).getIconUri() != null) {
                    this.getHighSpeedVideoFpsRanges.add(arrayList.get(i).getIconUri());
                }
            }
            return this;
        }

        public final androidx.browser.browseractions.BrowserActionsIntent.Builder setCustomItems(androidx.browser.browseractions.BrowserActionItem... browserActionItemArr) {
            return setCustomItems(new java.util.ArrayList<>(java.util.Arrays.asList(browserActionItemArr)));
        }

        public final androidx.browser.browseractions.BrowserActionsIntent.Builder setOnItemSelectedAction(android.app.PendingIntent pendingIntent) {
            this.getHighSpeedVideoFpsRangesFor = pendingIntent;
            return this;
        }

        public final androidx.browser.browseractions.BrowserActionsIntent build() {
            this.getHighResolutionOutputSizeshNQ4ISI.setData(this.getHighSpeedVideoSizesFor);
            this.getHighResolutionOutputSizeshNQ4ISI.putExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_TYPE, this.getOutputFormats);
            this.getHighResolutionOutputSizeshNQ4ISI.putParcelableArrayListExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_MENU_ITEMS, this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI.putExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_APP_ID, android.app.PendingIntent.getActivity(this.Camera2StreamConfigurationMap, 0, new android.content.Intent(), 67108864));
            android.app.PendingIntent pendingIntent = this.getHighSpeedVideoFpsRangesFor;
            if (pendingIntent != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.putExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_SELECTED_ACTION_PENDING_INTENT, pendingIntent);
            }
            androidx.browser.browseractions.BrowserServiceFileProvider.grantReadPermission(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            return new androidx.browser.browseractions.BrowserActionsIntent(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static void openBrowserAction(android.content.Context context, android.net.Uri uri) {
        launchIntent(context, new androidx.browser.browseractions.BrowserActionsIntent.Builder(context, uri).build().getIntent());
    }

    public static void openBrowserAction(android.content.Context context, android.net.Uri uri, int i, java.util.ArrayList<androidx.browser.browseractions.BrowserActionItem> arrayList, android.app.PendingIntent pendingIntent) {
        launchIntent(context, new androidx.browser.browseractions.BrowserActionsIntent.Builder(context, uri).setUrlType(i).setCustomItems(arrayList).setOnItemSelectedAction(pendingIntent).build().getIntent());
    }

    public static void launchIntent(android.content.Context context, android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> browserActionsIntentHandlers = getBrowserActionsIntentHandlers(context);
        if (browserActionsIntentHandlers != null && browserActionsIntentHandlers.size() != 0) {
            int i = 0;
            if (browserActionsIntentHandlers.size() == 1) {
                intent.setPackage(browserActionsIntentHandlers.get(0).activityInfo.packageName);
            } else {
                android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.example.com")), 65536);
                if (resolveActivity != null) {
                    java.lang.String str = resolveActivity.activityInfo.packageName;
                    while (true) {
                        if (i >= browserActionsIntentHandlers.size()) {
                            break;
                        }
                        if (str.equals(browserActionsIntentHandlers.get(i).activityInfo.packageName)) {
                            intent.setPackage(str);
                            break;
                        }
                        i++;
                    }
                }
            }
            androidx.core.content.ContextCompat.startActivity(context, intent, null);
            return;
        }
        android.net.Uri data = intent.getData();
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(EXTRA_MENU_ITEMS);
        androidx.browser.browseractions.BrowserActionsFallbackMenuUi browserActionsFallbackMenuUi = new androidx.browser.browseractions.BrowserActionsFallbackMenuUi(context, data, parcelableArrayListExtra != null ? parseBrowserActionItems(parcelableArrayListExtra) : null);
        android.view.View inflate = android.view.LayoutInflater.from(browserActionsFallbackMenuUi.getHighSpeedVideoFpsRangesFor).inflate(androidx.browser.R.layout.browser_actions_context_menu_page, (android.view.ViewGroup) null);
        android.content.Context context2 = browserActionsFallbackMenuUi.getHighSpeedVideoFpsRangesFor;
        androidx.browser.browseractions.BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (androidx.browser.browseractions.BrowserActionsFallbackMenuView) inflate.findViewById(androidx.browser.R.id.browser_actions_menu_view);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(androidx.browser.R.id.browser_actions_header_text);
        textView.setText(browserActionsFallbackMenuUi.getHighSpeedVideoSizes.toString());
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuUi.3
            final /* synthetic */ android.widget.TextView getHighSpeedVideoFpsRangesFor;

            AnonymousClass3(android.widget.TextView textView2) {
                r2 = textView2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (androidx.core.widget.TextViewCompat.getMaxLines(r2) == Integer.MAX_VALUE) {
                    r2.setMaxLines(1);
                    r2.setEllipsize(android.text.TextUtils.TruncateAt.END);
                } else {
                    r2.setMaxLines(Integer.MAX_VALUE);
                    r2.setEllipsize(null);
                }
            }
        });
        android.widget.ListView listView = (android.widget.ListView) inflate.findViewById(androidx.browser.R.id.browser_actions_menu_items);
        listView.setAdapter((android.widget.ListAdapter) new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter(browserActionsFallbackMenuUi.getHighSpeedVideoFpsRanges, browserActionsFallbackMenuUi.getHighSpeedVideoFpsRangesFor));
        listView.setOnItemClickListener(browserActionsFallbackMenuUi);
        androidx.browser.browseractions.BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = new androidx.browser.browseractions.BrowserActionsFallbackMenuDialog(context2, browserActionsFallbackMenuView);
        browserActionsFallbackMenuUi.Camera2StreamConfigurationMap = browserActionsFallbackMenuDialog;
        browserActionsFallbackMenuDialog.setContentView(inflate);
        if (browserActionsFallbackMenuUi.getHighResolutionOutputSizeshNQ4ISI != null) {
            browserActionsFallbackMenuUi.Camera2StreamConfigurationMap.setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuUi.2
                final /* synthetic */ android.view.View getHighResolutionOutputSizeshNQ4ISI;

                AnonymousClass2(android.view.View inflate2) {
                    r2 = inflate2;
                }

                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(android.content.DialogInterface dialogInterface) {
                    if (androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.getHighResolutionOutputSizeshNQ4ISI == null) {
                        return;
                    }
                    androidx.browser.browseractions.BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener browserActionsFallMenuUiListener = androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.getHighResolutionOutputSizeshNQ4ISI;
                }
            });
        }
        browserActionsFallbackMenuUi.Camera2StreamConfigurationMap.show();
    }

    public static java.util.List<android.content.pm.ResolveInfo> getBrowserActionsIntentHandlers(android.content.Context context) {
        return context.getPackageManager().queryIntentActivities(new android.content.Intent(ACTION_BROWSER_ACTIONS_OPEN, android.net.Uri.parse("https://www.example.com")), 131072);
    }

    public static java.util.List<androidx.browser.browseractions.BrowserActionItem> parseBrowserActionItems(java.util.ArrayList<android.os.Bundle> arrayList) {
        androidx.browser.browseractions.BrowserActionItem browserActionItem;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            android.os.Bundle bundle = arrayList.get(i);
            java.lang.String string = bundle.getString(KEY_TITLE);
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable(KEY_ACTION);
            int i2 = bundle.getInt(KEY_ICON_ID);
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable("androidx.browser.browseractions.ICON_URI");
            if (!android.text.TextUtils.isEmpty(string) && pendingIntent != null) {
                if (i2 != 0) {
                    browserActionItem = new androidx.browser.browseractions.BrowserActionItem(string, pendingIntent, i2);
                } else {
                    browserActionItem = new androidx.browser.browseractions.BrowserActionItem(string, pendingIntent, uri);
                }
                arrayList2.add(browserActionItem);
            } else {
                throw new java.lang.IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
        }
        return arrayList2;
    }

    public static java.lang.String getUntrustedCreatorPackageName(android.content.Intent intent) {
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra(EXTRA_APP_ID);
        if (pendingIntent != null) {
            return pendingIntent.getTargetPackage();
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.String getCreatorPackageName(android.content.Intent intent) {
        return getUntrustedCreatorPackageName(intent);
    }
}
