package androidx.core.app;

/* loaded from: classes7.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.VersionedParcelable {
    public android.app.PendingIntent mActionIntent;
    public java.lang.CharSequence mContentDescription;
    public boolean mEnabled;
    public androidx.core.graphics.drawable.IconCompat mIcon;
    public boolean mShouldShowIcon;
    public java.lang.CharSequence mTitle;

    public RemoteActionCompat(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.app.PendingIntent pendingIntent) {
        this.mIcon = (androidx.core.graphics.drawable.IconCompat) androidx.core.util.Preconditions.checkNotNull(iconCompat);
        this.mTitle = (java.lang.CharSequence) androidx.core.util.Preconditions.checkNotNull(charSequence);
        this.mContentDescription = (java.lang.CharSequence) androidx.core.util.Preconditions.checkNotNull(charSequence2);
        this.mActionIntent = (android.app.PendingIntent) androidx.core.util.Preconditions.checkNotNull(pendingIntent);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(androidx.core.app.RemoteActionCompat remoteActionCompat) {
        androidx.core.util.Preconditions.checkNotNull(remoteActionCompat);
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }

    public static androidx.core.app.RemoteActionCompat createFromRemoteAction(android.app.RemoteAction remoteAction) {
        androidx.core.util.Preconditions.checkNotNull(remoteAction);
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat(androidx.core.graphics.drawable.IconCompat.createFromIcon(androidx.core.app.RemoteActionCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(remoteAction)), androidx.core.app.RemoteActionCompat.Api26Impl.getHighSpeedVideoFpsRanges(remoteAction), androidx.core.app.RemoteActionCompat.Api26Impl.getHighSpeedVideoSizes(remoteAction), androidx.core.app.RemoteActionCompat.Api26Impl.Camera2StreamConfigurationMap(remoteAction));
        remoteActionCompat.setEnabled(androidx.core.app.RemoteActionCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(remoteAction));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(androidx.core.app.RemoteActionCompat.Api28Impl.getHighSpeedVideoSizes(remoteAction));
        }
        return remoteActionCompat;
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void setShouldShowIcon(boolean z) {
        this.mShouldShowIcon = z;
    }

    public final boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public final androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    public final java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    public final java.lang.CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public final android.app.PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public final android.app.RemoteAction toRemoteAction() {
        android.app.RemoteAction highSpeedVideoSizes = androidx.core.app.RemoteActionCompat.Api26Impl.getHighSpeedVideoSizes(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        androidx.core.app.RemoteActionCompat.Api26Impl.getHighSpeedVideoSizes(highSpeedVideoSizes, isEnabled());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.RemoteActionCompat.Api28Impl.getHighSpeedVideoFpsRanges(highSpeedVideoSizes, shouldShowIcon());
        }
        return highSpeedVideoSizes;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.app.RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }

        static void getHighSpeedVideoFpsRanges(android.app.RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static java.lang.CharSequence getHighSpeedVideoSizes(android.app.RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        static android.app.PendingIntent Camera2StreamConfigurationMap(android.app.RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        static java.lang.CharSequence getHighSpeedVideoFpsRanges(android.app.RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        static android.graphics.drawable.Icon getHighResolutionOutputSizeshNQ4ISI(android.app.RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.app.RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        static android.app.RemoteAction getHighSpeedVideoSizes(android.graphics.drawable.Icon icon, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.app.PendingIntent pendingIntent) {
            return new android.app.RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        static void getHighSpeedVideoSizes(android.app.RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }
}
