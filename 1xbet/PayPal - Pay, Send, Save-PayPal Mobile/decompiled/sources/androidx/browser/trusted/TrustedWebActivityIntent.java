package androidx.browser.trusted;

/* loaded from: classes6.dex */
public final class TrustedWebActivityIntent {
    private final android.content.Intent getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<android.net.Uri> getHighSpeedVideoFpsRanges;
    private final java.util.List<android.net.Uri> getHighSpeedVideoSizes;

    TrustedWebActivityIntent(android.content.Intent intent, java.util.List<android.net.Uri> list, java.util.List<android.net.Uri> list2) {
        this.getHighResolutionOutputSizeshNQ4ISI = intent;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoSizes = list2;
    }

    public final android.net.Uri getOriginalLaunchUrl() {
        return (android.net.Uri) androidx.core.content.IntentCompat.getParcelableExtra(getIntent(), androidx.browser.trusted.TrustedWebActivityIntentBuilder.EXTRA_ORIGINAL_LAUNCH_URL, android.net.Uri.class);
    }

    public final androidx.browser.trusted.FileHandlingData getFileHandlingData() {
        return androidx.browser.trusted.FileHandlingData.fromBundle(getIntent().getBundleExtra(androidx.browser.trusted.TrustedWebActivityIntentBuilder.EXTRA_FILE_HANDLING_DATA));
    }

    public final int getLaunchHandlerClientMode() {
        return getIntent().getIntExtra(androidx.browser.trusted.TrustedWebActivityIntentBuilder.EXTRA_LAUNCH_HANDLER_CLIENT_MODE, 0);
    }

    public final java.util.List<androidx.browser.trusted.TrustedWebActivityDisplayMode> getDisplayOverrideList() {
        java.util.ArrayList parcelableArrayListExtra = androidx.core.content.IntentCompat.getParcelableArrayListExtra(getIntent(), androidx.browser.trusted.TrustedWebActivityIntentBuilder.EXTRA_DISPLAY_OVERRIDE, android.os.Bundle.class);
        if (parcelableArrayListExtra == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.browser.trusted.TrustedWebActivityDisplayMode.fromBundle((android.os.Bundle) it.next()));
        }
        return arrayList;
    }

    public final android.content.Intent getIntent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void launchTrustedWebActivity(android.content.Context context) {
        java.util.Iterator<android.net.Uri> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.getHighResolutionOutputSizeshNQ4ISI.getPackage(), it.next(), 1);
        }
        for (android.net.Uri uri : this.getHighSpeedVideoSizes) {
            if (context.checkCallingOrSelfUriPermission(uri, 1) == 0) {
                if (context.checkCallingOrSelfUriPermission(uri, 2) == 0) {
                    context.grantUriPermission(this.getHighResolutionOutputSizeshNQ4ISI.getPackage(), uri, 3);
                } else {
                    context.grantUriPermission(this.getHighResolutionOutputSizeshNQ4ISI.getPackage(), uri, 1);
                }
            }
        }
        androidx.core.content.ContextCompat.startActivity(context, this.getHighResolutionOutputSizeshNQ4ISI, null);
    }
}
