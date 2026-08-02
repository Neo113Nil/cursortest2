package androidx.browser.customtabs;

/* loaded from: classes5.dex */
public final class ContentActionSelectedData {
    private final android.content.Intent getHighSpeedVideoFpsRangesFor;

    private ContentActionSelectedData(android.content.Intent intent) {
        this.getHighSpeedVideoFpsRangesFor = intent;
    }

    public static androidx.browser.customtabs.ContentActionSelectedData fromIntent(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return new androidx.browser.customtabs.ContentActionSelectedData(intent);
    }

    public final android.net.Uri getPageUrl() {
        return this.getHighSpeedVideoFpsRangesFor.getData();
    }

    public final int getTriggeredActionId() {
        return this.getHighSpeedVideoFpsRangesFor.getIntExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TRIGGERED_CUSTOM_CONTENT_ACTION_ID, -1);
    }

    public final int getClickedContentTargetType() {
        return this.getHighSpeedVideoFpsRangesFor.getIntExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLICKED_CONTENT_TARGET_TYPE, 0);
    }

    public final java.lang.String getImageUrl() {
        return this.getHighSpeedVideoFpsRangesFor.getStringExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CONTEXT_IMAGE_URL);
    }

    public final android.net.Uri getImageDataUri() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return (android.net.Uri) this.getHighSpeedVideoFpsRangesFor.getParcelableExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CONTEXT_IMAGE_DATA_URI, android.net.Uri.class);
        }
        return null;
    }

    public final java.lang.String getImageAltText() {
        return this.getHighSpeedVideoFpsRangesFor.getStringExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CONTEXT_IMAGE_ALT_TEXT);
    }

    public final java.lang.String getLinkUrl() {
        return this.getHighSpeedVideoFpsRangesFor.getStringExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CONTEXT_LINK_URL);
    }

    public final java.lang.String getLinkText() {
        return this.getHighSpeedVideoFpsRangesFor.getStringExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CONTEXT_LINK_TEXT);
    }

    public final android.content.Intent getIntent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
