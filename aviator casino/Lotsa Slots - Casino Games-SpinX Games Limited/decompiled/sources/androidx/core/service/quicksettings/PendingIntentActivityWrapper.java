package androidx.core.service.quicksettings;

/* loaded from: classes.dex */
public class PendingIntentActivityWrapper {
    private final android.content.Context mContext;
    private final int mFlags;
    private final android.content.Intent mIntent;
    private final boolean mIsMutable;
    private final android.os.Bundle mOptions;
    private final android.app.PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentActivityWrapper(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        this(context, i, intent, i2, null, z);
    }

    public PendingIntentActivityWrapper(android.content.Context context, int i, android.content.Intent intent, int i2, android.os.Bundle bundle, boolean z) {
        this.mContext = context;
        this.mRequestCode = i;
        this.mIntent = intent;
        this.mFlags = i2;
        this.mOptions = bundle;
        this.mIsMutable = z;
        this.mPendingIntent = createPendingIntent();
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public android.content.Intent getIntent() {
        return this.mIntent;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public android.os.Bundle getOptions() {
        return this.mOptions;
    }

    public boolean isMutable() {
        return this.mIsMutable;
    }

    public android.app.PendingIntent getPendingIntent() {
        return this.mPendingIntent;
    }

    private android.app.PendingIntent createPendingIntent() {
        android.os.Bundle bundle = this.mOptions;
        if (bundle == null) {
            return androidx.core.app.PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, this.mIsMutable);
        }
        return androidx.core.app.PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, bundle, this.mIsMutable);
    }
}
