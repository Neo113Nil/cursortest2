package androidx.browser.customtabs;

/* loaded from: classes.dex */
public final class CustomTabsIntent {
    public static final int ACTIVITY_HEIGHT_ADJUSTABLE = 1;
    public static final int ACTIVITY_HEIGHT_DEFAULT = 0;
    public static final int ACTIVITY_HEIGHT_FIXED = 2;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DIVIDER = 3;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_SHADOW = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_END = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_START = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_TOP = 2;
    public static final int CLOSE_BUTTON_POSITION_DEFAULT = 0;
    public static final int CLOSE_BUTTON_POSITION_END = 2;
    public static final int CLOSE_BUTTON_POSITION_START = 1;
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final int CONTENT_TARGET_TYPE_IMAGE = 1;
    public static final int CONTENT_TARGET_TYPE_LINK = 2;
    public static final java.lang.String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final java.lang.String EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final java.lang.String EXTRA_CLICKED_CONTENT_TARGET_TYPE = "androidx.browser.customtabs.extra.CLICKED_CONTENT_TARGET_TYPE";
    public static final java.lang.String EXTRA_CLOSE_BUTTON_ENABLED = "androidx.browser.customtabs.extra.CLOSE_BUTTON_ENABLED";
    public static final java.lang.String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final java.lang.String EXTRA_CLOSE_BUTTON_POSITION = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final java.lang.String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final java.lang.String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final java.lang.String EXTRA_CONTEXT_IMAGE_ALT_TEXT = "androidx.browser.customtabs.extra.CONTEXT_IMAGE_ALT_TEXT";
    public static final java.lang.String EXTRA_CONTEXT_IMAGE_DATA_URI = "androidx.browser.customtabs.extra.CONTEXT_IMAGE_DATA_URI";
    public static final java.lang.String EXTRA_CONTEXT_IMAGE_URL = "androidx.browser.customtabs.extra.CONTEXT_IMAGE_URL";
    public static final java.lang.String EXTRA_CONTEXT_LINK_TEXT = "androidx.browser.customtabs.extra.CONTEXT_LINK_TEXT";
    public static final java.lang.String EXTRA_CONTEXT_LINK_URL = "androidx.browser.customtabs.extra.CONTEXT_LINK_URL";
    public static final java.lang.String EXTRA_CUSTOM_CONTENT_ACTIONS = "androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS";

    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final java.lang.String EXTRA_DISABLE_BACKGROUND_INTERACTION = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final java.lang.String EXTRA_DISABLE_BOOKMARKS_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final java.lang.String EXTRA_DISABLE_DOWNLOAD_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final java.lang.String EXTRA_ENABLE_EPHEMERAL_BROWSING = "androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING";
    public static final java.lang.String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final java.lang.String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final java.lang.String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final java.lang.String EXTRA_INITIAL_ACTIVITY_HEIGHT_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final java.lang.String EXTRA_INITIAL_ACTIVITY_WIDTH_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final java.lang.String EXTRA_INITIAL_NAVIGATION_CAN_LEAVE_BROWSER = "androidx.browser.customtabs.extra.INITIAL_NAVIGATION_CAN_LEAVE_BROWSER";
    public static final java.lang.String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final java.lang.String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final java.lang.String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final java.lang.String EXTRA_NETWORK = "androidx.browser.customtabs.extra.NETWORK";
    public static final java.lang.String EXTRA_OPEN_IN_BROWSER_STATE = "androidx.browser.customtabs.extra.OPEN_IN_BROWSER_STATE";
    public static final java.lang.String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final java.lang.String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final java.lang.String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final java.lang.String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final java.lang.String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final java.lang.String EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final java.lang.String EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final java.lang.String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
    public static final java.lang.String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final java.lang.String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final java.lang.String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final java.lang.String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final java.lang.String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final java.lang.String EXTRA_TOOLBAR_CORNER_RADIUS_DP = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final java.lang.String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final java.lang.String EXTRA_TRANSLATE_LANGUAGE_TAG = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    public static final java.lang.String EXTRA_TRIGGERED_CUSTOM_CONTENT_ACTION_ID = "androidx.browser.customtabs.extra.TRIGGERED_CUSTOM_CONTENT_ACTION_ID";
    public static final java.lang.String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final java.lang.String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final java.lang.String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final java.lang.String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final java.lang.String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final int NO_TITLE = 0;
    public static final int OPEN_IN_BROWSER_STATE_DEFAULT = 0;
    public static final int OPEN_IN_BROWSER_STATE_OFF = 2;
    public static final int OPEN_IN_BROWSER_STATE_ON = 1;
    public static final int SHARE_STATE_DEFAULT = 0;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
    public final android.content.Intent intent;
    public final android.os.Bundle startAnimationBundle;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ActivityHeightResizeBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ActivitySideSheetDecorationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ActivitySideSheetPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CloseButtonPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ColorScheme {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ContentTargetType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface OpenInBrowserState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ShareState {
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public final void launchUrl(android.content.Context context, android.net.Uri uri) {
        this.intent.setData(uri);
        androidx.core.content.ContextCompat.startActivity(context, this.intent, this.startAnimationBundle);
    }

    CustomTabsIntent(android.content.Intent intent, android.os.Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    public static final class Builder {
        private java.util.ArrayList<android.os.Bundle> Camera2StreamConfigurationMap;
        private java.util.ArrayList<android.os.Bundle> getHighResolutionOutputSizeshNQ4ISI;
        private android.util.SparseArray<android.os.Bundle> getHighSpeedVideoFpsRanges;
        private android.app.ActivityOptions getHighSpeedVideoFpsRangesFor;
        private android.os.Bundle getHighSpeedVideoSizesFor;
        private java.util.ArrayList<android.os.Bundle> getOutputFormats;
        private boolean getOutputMinFrameDuration;
        private final android.content.Intent getInputFormats = new android.content.Intent("android.intent.action.VIEW");
        private final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder getHighSpeedVideoSizes = new androidx.browser.customtabs.CustomTabColorSchemeParams.Builder();
        private int getOutputStallDuration = 0;
        private boolean getInputSizeshNQ4ISI = true;

        public Builder() {
        }

        public Builder(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
            if (customTabsSession != null) {
                setSession(customTabsSession);
            }
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setSession(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
            this.getInputFormats.setPackage(customTabsSession.getHighSpeedVideoSizes.getPackageName());
            getHighSpeedVideoFpsRanges(customTabsSession.getHighSpeedVideoFpsRanges.asBinder(), customTabsSession.getHighSpeedVideoFpsRangesFor);
            return this;
        }

        private void getHighSpeedVideoFpsRanges(android.os.IBinder iBinder, android.app.PendingIntent pendingIntent) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            }
            this.getInputFormats.putExtras(bundle);
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder setToolbarColor(int i) {
            this.getHighSpeedVideoSizes.setToolbarColor(i);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder enableUrlBarHiding() {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, true);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setUrlBarHidingEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setCloseButtonIcon(android.graphics.Bitmap bitmap) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLOSE_BUTTON_ICON, bitmap);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setShowTitle(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TITLE_VISIBILITY_STATE, z ? 1 : 0);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder addMenuItem(java.lang.String str, android.app.PendingIntent pendingIntent) {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = new java.util.ArrayList<>();
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_MENU_ITEM_TITLE, str);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.getOutputFormats.add(bundle);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder addDefaultShareMenuItem() {
            setShareState(1);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder setDefaultShareMenuItemEnabled(boolean z) {
            if (z) {
                setShareState(1);
                return this;
            }
            setShareState(2);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setShareState(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.getOutputStallDuration = i;
            if (i == 1) {
                this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, true);
                return this;
            }
            if (i == 2) {
                this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
                return this;
            }
            this.getInputFormats.removeExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setActionButton(android.graphics.Bitmap bitmap, java.lang.String str, android.app.PendingIntent pendingIntent, boolean z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.KEY_ID, 0);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
            bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TINT_ACTION_BUTTON, z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setActionButton(android.graphics.Bitmap bitmap, java.lang.String str, android.app.PendingIntent pendingIntent) {
            return setActionButton(bitmap, str, pendingIntent, false);
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder addToolbarItem(int i, android.graphics.Bitmap bitmap, java.lang.String str, android.app.PendingIntent pendingIntent) throws java.lang.IllegalStateException {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.size() >= 5) {
                throw new java.lang.IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.KEY_ID, i);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
            bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.getHighResolutionOutputSizeshNQ4ISI.add(bundle);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarColor(int i) {
            this.getHighSpeedVideoSizes.setSecondaryToolbarColor(i);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder setNavigationBarColor(int i) {
            this.getHighSpeedVideoSizes.setNavigationBarColor(i);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.browser.customtabs.CustomTabsIntent.Builder setNavigationBarDividerColor(int i) {
            this.getHighSpeedVideoSizes.setNavigationBarDividerColor(i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarViews(android.widget.RemoteViews remoteViews, int[] iArr, android.app.PendingIntent pendingIntent) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarSwipeUpGesture(android.app.PendingIntent pendingIntent) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setInstantAppsEnabled(boolean z) {
            this.getInputSizeshNQ4ISI = z;
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setStartAnimations(android.content.Context context, int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor = android.app.ActivityOptions.makeCustomAnimation(context, i, i2);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setExitAnimations(android.content.Context context, int i, int i2) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_EXIT_ANIMATION_BUNDLE, androidx.core.app.ActivityOptionsCompat.makeCustomAnimation(context, i, i2).toBundle());
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setColorScheme(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_COLOR_SCHEME, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setColorSchemeParams(int i, androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
            if (i < 0 || i > 2 || i == 0) {
                throw new java.lang.IllegalArgumentException("Invalid colorScheme: ".concat(java.lang.String.valueOf(i)));
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new android.util.SparseArray<>();
            }
            this.getHighSpeedVideoFpsRanges.put(i, customTabColorSchemeParams.Camera2StreamConfigurationMap());
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setDefaultColorSchemeParams(androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
            this.getHighSpeedVideoSizesFor = customTabColorSchemeParams.Camera2StreamConfigurationMap();
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityHeightPx(int i, int i2) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i2 < 0 || i2 > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, i);
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, i2);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityHeightPx(int i) {
            return setInitialActivityHeightPx(i, 0);
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityWidthPx(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_WIDTH_PX, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetBreakpointDp(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetMaximizationEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetPosition(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the sideSheetPosition argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_POSITION, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetDecorationType(int i) {
            if (i < 0 || i > 3) {
                throw new java.lang.IllegalArgumentException("Invalid value for the decorationType argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetRoundedCornersPosition(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setToolbarCornerRadiusDp(int i) {
            if (i < 0 || i > 16) {
                throw new java.lang.IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_CORNER_RADIUS_DP, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setCloseButtonPosition(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the position argument");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLOSE_BUTTON_POSITION, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setOpenInBrowserButtonState(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the openInBrowserState argument.");
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_OPEN_IN_BROWSER_STATE, i);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setBookmarksButtonEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DISABLE_BOOKMARKS_BUTTON, !z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setDownloadButtonEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DISABLE_DOWNLOAD_BUTTON, !z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setSendToExternalDefaultHandlerEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setInitialNavigationAllowedToLeaveBrowser(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_INITIAL_NAVIGATION_CAN_LEAVE_BROWSER, z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setBackgroundInteractionEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DISABLE_BACKGROUND_INTERACTION, !z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setShareIdentityEnabled(boolean z) {
            this.getOutputMinFrameDuration = z;
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setNetwork(android.net.Network network) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NETWORK, network);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setEphemeralBrowsingEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_EPHEMERAL_BROWSING, z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setCloseButtonEnabled(boolean z) {
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLOSE_BUTTON_ENABLED, z);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder addCustomContentAction(androidx.browser.customtabs.CustomContentAction customContentAction) {
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = new java.util.ArrayList<>();
            }
            java.util.Iterator<android.os.Bundle> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                if (it.next().getInt("androidx.browser.customtabs.customcontentaction.ID") == customContentAction.getId()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomContentAction with ID ");
                    sb.append(customContentAction.getId());
                    sb.append(" already exists.");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            java.util.ArrayList<android.os.Bundle> arrayList = this.Camera2StreamConfigurationMap;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("androidx.browser.customtabs.customcontentaction.ID", customContentAction.Camera2StreamConfigurationMap);
            bundle.putString("androidx.browser.customtabs.customcontentaction.LABEL", customContentAction.getHighSpeedVideoFpsRangesFor);
            bundle.putParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT", customContentAction.getHighSpeedVideoFpsRanges);
            bundle.putInt("androidx.browser.customtabs.customcontentaction.TARGET_TYPE", customContentAction.getHighResolutionOutputSizeshNQ4ISI);
            arrayList.add(bundle);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent build() {
            if (!this.getInputFormats.hasExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION)) {
                getHighSpeedVideoFpsRanges(null, null);
            }
            java.util.ArrayList<android.os.Bundle> arrayList = this.getOutputFormats;
            if (arrayList != null) {
                this.getInputFormats.putParcelableArrayListExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_MENU_ITEMS, arrayList);
            }
            java.util.ArrayList<android.os.Bundle> arrayList2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (arrayList2 != null) {
                this.getInputFormats.putParcelableArrayListExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_ITEMS, arrayList2);
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_INSTANT_APPS, this.getInputSizeshNQ4ISI);
            this.getInputFormats.putExtras(this.getHighSpeedVideoSizes.build().Camera2StreamConfigurationMap());
            android.os.Bundle bundle = this.getHighSpeedVideoSizesFor;
            if (bundle != null) {
                this.getInputFormats.putExtras(bundle);
            }
            if (this.getHighSpeedVideoFpsRanges != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putSparseParcelableArray(androidx.browser.customtabs.CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, this.getHighSpeedVideoFpsRanges);
                this.getInputFormats.putExtras(bundle2);
            }
            this.getInputFormats.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SHARE_STATE, this.getOutputStallDuration);
            java.util.ArrayList<android.os.Bundle> arrayList3 = this.Camera2StreamConfigurationMap;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.getInputFormats.putParcelableArrayListExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CUSTOM_CONTENT_ACTIONS, this.Camera2StreamConfigurationMap);
            }
            java.lang.String highSpeedVideoFpsRangesFor = androidx.browser.customtabs.CustomTabsIntent.Api24Impl.getHighSpeedVideoFpsRangesFor();
            if (!android.text.TextUtils.isEmpty(highSpeedVideoFpsRangesFor)) {
                android.os.Bundle bundleExtra = this.getInputFormats.hasExtra("com.android.browser.headers") ? this.getInputFormats.getBundleExtra("com.android.browser.headers") : new android.os.Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", highSpeedVideoFpsRangesFor);
                    this.getInputFormats.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = androidx.browser.customtabs.CustomTabsIntent.Api23Impl.Camera2StreamConfigurationMap();
                }
                androidx.browser.customtabs.CustomTabsIntent.Api34Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration);
            }
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = androidx.browser.customtabs.CustomTabsIntent.Api23Impl.Camera2StreamConfigurationMap();
                }
                androidx.browser.customtabs.CustomTabsIntent.Api36Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, androidx.browser.customtabs.CustomTabsIntent.isBackgroundInteractionEnabled(this.getInputFormats));
            }
            android.app.ActivityOptions activityOptions = this.getHighSpeedVideoFpsRangesFor;
            return new androidx.browser.customtabs.CustomTabsIntent(this.getInputFormats, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setPendingSession(androidx.browser.customtabs.CustomTabsSession.PendingSession pendingSession) {
            getHighSpeedVideoFpsRanges(null, pendingSession.getHighResolutionOutputSizeshNQ4ISI);
            return this;
        }

        public final androidx.browser.customtabs.CustomTabsIntent.Builder setTranslateLocale(java.util.Locale locale) {
            androidx.browser.customtabs.CustomTabsIntent.Api21Impl.getHighSpeedVideoFpsRanges(this.getInputFormats, locale);
            return this;
        }
    }

    public final boolean isEphemeralBrowsingEnabled() {
        return this.intent.getBooleanExtra(EXTRA_ENABLE_EPHEMERAL_BROWSING, false);
    }

    public static android.content.Intent setAlwaysUseBrowserUI(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(android.content.Intent intent) {
        return intent.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false) && (intent.getFlags() & 268435456) != 0;
    }

    public static androidx.browser.customtabs.CustomTabColorSchemeParams getColorSchemeParams(android.content.Intent intent, int i) {
        android.os.Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new java.lang.IllegalArgumentException("Invalid colorScheme: ".concat(java.lang.String.valueOf(i)));
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return androidx.browser.customtabs.CustomTabColorSchemeParams.getHighSpeedVideoFpsRanges(null);
        }
        androidx.browser.customtabs.CustomTabColorSchemeParams highSpeedVideoFpsRanges = androidx.browser.customtabs.CustomTabColorSchemeParams.getHighSpeedVideoFpsRanges(extras);
        android.util.SparseArray sparseParcelableArray = extras.getSparseParcelableArray(EXTRA_COLOR_SCHEME_PARAMS);
        if (sparseParcelableArray == null || (bundle = (android.os.Bundle) sparseParcelableArray.get(i)) == null) {
            return highSpeedVideoFpsRanges;
        }
        androidx.browser.customtabs.CustomTabColorSchemeParams highSpeedVideoFpsRanges2 = androidx.browser.customtabs.CustomTabColorSchemeParams.getHighSpeedVideoFpsRanges(bundle);
        java.lang.Integer num = highSpeedVideoFpsRanges2.toolbarColor;
        if (num == null) {
            num = highSpeedVideoFpsRanges.toolbarColor;
        }
        java.lang.Integer num2 = highSpeedVideoFpsRanges2.secondaryToolbarColor;
        if (num2 == null) {
            num2 = highSpeedVideoFpsRanges.secondaryToolbarColor;
        }
        java.lang.Integer num3 = highSpeedVideoFpsRanges2.navigationBarColor;
        if (num3 == null) {
            num3 = highSpeedVideoFpsRanges.navigationBarColor;
        }
        java.lang.Integer num4 = highSpeedVideoFpsRanges2.navigationBarDividerColor;
        if (num4 == null) {
            num4 = highSpeedVideoFpsRanges.navigationBarDividerColor;
        }
        return new androidx.browser.customtabs.CustomTabColorSchemeParams(num, num2, num3, num4);
    }

    public static int getActivityResizeBehavior(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, 0);
    }

    public static int getInitialActivityHeightPx(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, 0);
    }

    public static int getInitialActivityWidthPx(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_WIDTH_PX, 0);
    }

    public static int getActivitySideSheetBreakpointDp(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, 0);
    }

    public static boolean isActivitySideSheetMaximizationEnabled(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, false);
    }

    public static int getActivitySideSheetPosition(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_POSITION, 0);
    }

    public static int getActivitySideSheetDecorationType(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, 0);
    }

    public static int getActivitySideSheetRoundedCornersPosition(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, 0);
    }

    public static int getToolbarCornerRadiusDp(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_TOOLBAR_CORNER_RADIUS_DP, 16);
    }

    public static int getCloseButtonPosition(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_CLOSE_BUTTON_POSITION, 0);
    }

    public static int getOpenInBrowserButtonState(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_OPEN_IN_BROWSER_STATE, 0);
    }

    public static boolean isBookmarksButtonEnabled(android.content.Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BOOKMARKS_BUTTON, false);
    }

    public static boolean isDownloadButtonEnabled(android.content.Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_DOWNLOAD_BUTTON, false);
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, false);
    }

    public static boolean isInitialNavigationAllowedToLeaveBrowser(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_INITIAL_NAVIGATION_CAN_LEAVE_BROWSER, false);
    }

    public static android.net.Network getNetwork(android.content.Intent intent) {
        return (android.net.Network) androidx.core.content.IntentCompat.getParcelableExtra(intent, EXTRA_NETWORK, android.net.Network.class);
    }

    public static boolean isBackgroundInteractionEnabled(android.content.Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BACKGROUND_INTERACTION, false);
    }

    public static android.app.PendingIntent getSecondaryToolbarSwipeUpGesture(android.content.Intent intent) {
        return (android.app.PendingIntent) intent.getParcelableExtra(EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE);
    }

    public static boolean isCloseButtonEnabled(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_CLOSE_BUTTON_ENABLED, true);
    }

    public static java.util.List<androidx.browser.customtabs.CustomContentAction> getCustomContentActions(android.content.Intent intent) {
        java.util.ArrayList parcelableArrayListExtra = androidx.core.content.IntentCompat.getParcelableArrayListExtra(intent, EXTRA_CUSTOM_CONTENT_ACTIONS, android.os.Bundle.class);
        if (parcelableArrayListExtra == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayListExtra.size());
        java.util.Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(androidx.browser.customtabs.CustomContentAction.fromBundle((android.os.Bundle) it.next()));
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes6.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.content.Intent intent, java.util.Locale locale) {
            intent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG, locale.toLanguageTag());
        }

        static java.util.Locale getHighSpeedVideoFpsRanges(android.content.Intent intent) {
            java.lang.String stringExtra = intent.getStringExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG);
            if (stringExtra != null) {
                return java.util.Locale.forLanguageTag(stringExtra);
            }
            return null;
        }
    }

    /* loaded from: classes6.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static android.app.ActivityOptions Camera2StreamConfigurationMap() {
            return android.app.ActivityOptions.makeBasic();
        }
    }

    /* loaded from: classes6.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static java.lang.String getHighSpeedVideoFpsRangesFor() {
            android.os.LocaleList adjustedDefault = android.os.LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* loaded from: classes6.dex */
    static class Api34Impl {
        private Api34Impl() {
        }

        static void getHighSpeedVideoSizes(android.app.ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }

    /* loaded from: classes6.dex */
    static class Api36Impl {
        private Api36Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.app.ActivityOptions activityOptions, boolean z) {
            activityOptions.setAllowPassThroughOnTouchOutside(z);
        }
    }

    public static java.util.Locale getTranslateLocale(android.content.Intent intent) {
        return androidx.browser.customtabs.CustomTabsIntent.Api21Impl.getHighSpeedVideoFpsRanges(intent);
    }
}
