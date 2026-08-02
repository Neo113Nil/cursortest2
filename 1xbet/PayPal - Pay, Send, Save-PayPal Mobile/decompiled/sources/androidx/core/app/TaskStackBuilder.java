package androidx.core.app;

/* loaded from: classes3.dex */
public final class TaskStackBuilder implements java.lang.Iterable<android.content.Intent> {
    private final java.util.ArrayList<android.content.Intent> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    public interface SupportParentable {
        android.content.Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(android.content.Context context) {
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    public static androidx.core.app.TaskStackBuilder create(android.content.Context context) {
        return new androidx.core.app.TaskStackBuilder(context);
    }

    @java.lang.Deprecated
    public static androidx.core.app.TaskStackBuilder from(android.content.Context context) {
        return create(context);
    }

    public final androidx.core.app.TaskStackBuilder addNextIntent(android.content.Intent intent) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(intent);
        return this;
    }

    public final androidx.core.app.TaskStackBuilder addNextIntentWithParentStack(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.getHighSpeedVideoFpsRangesFor.getPackageManager());
        }
        if (component != null) {
            addParentStack(component);
        }
        addNextIntent(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.core.app.TaskStackBuilder addParentStack(android.app.Activity activity) {
        android.content.Intent supportParentActivityIntent = activity instanceof androidx.core.app.TaskStackBuilder.SupportParentable ? ((androidx.core.app.TaskStackBuilder.SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = androidx.core.app.NavUtils.getParentActivityIntent(activity);
        }
        if (supportParentActivityIntent != null) {
            android.content.ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.getHighSpeedVideoFpsRangesFor.getPackageManager());
            }
            addParentStack(component);
            addNextIntent(supportParentActivityIntent);
        }
        return this;
    }

    public final androidx.core.app.TaskStackBuilder addParentStack(java.lang.Class<?> cls) {
        return addParentStack(new android.content.ComponentName(this.getHighSpeedVideoFpsRangesFor, cls));
    }

    public final androidx.core.app.TaskStackBuilder addParentStack(android.content.ComponentName componentName) {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        try {
            android.content.Intent parentActivityIntent = androidx.core.app.NavUtils.getParentActivityIntent(this.getHighSpeedVideoFpsRangesFor, componentName);
            while (parentActivityIntent != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.add(size, parentActivityIntent);
                parentActivityIntent = androidx.core.app.NavUtils.getParentActivityIntent(this.getHighSpeedVideoFpsRangesFor, parentActivityIntent.getComponent());
            }
            return this;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public final int getIntentCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    @java.lang.Deprecated
    public final android.content.Intent getIntent(int i) {
        return editIntentAt(i);
    }

    public final android.content.Intent editIntentAt(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public final java.util.Iterator<android.content.Intent> iterator() {
        return this.getHighResolutionOutputSizeshNQ4ISI.iterator();
    }

    public final void startActivities() {
        startActivities(null);
    }

    public final void startActivities(android.os.Bundle bundle) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) this.getHighResolutionOutputSizeshNQ4ISI.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.ContextCompat.startActivities(this.getHighSpeedVideoFpsRangesFor, intentArr, bundle)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.getHighSpeedVideoFpsRangesFor.startActivity(intent);
    }

    public final android.app.PendingIntent getPendingIntent(int i, int i2) {
        return getPendingIntent(i, i2, (android.os.Bundle) null);
    }

    public final android.app.PendingIntent getPendingIntent(int i, int i2, boolean z) {
        return getPendingIntent(i, androidx.core.app.PendingIntentCompat.getHighSpeedVideoFpsRangesFor(z, i2));
    }

    public final android.app.PendingIntent getPendingIntent(int i, int i2, android.os.Bundle bundle) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) this.getHighResolutionOutputSizeshNQ4ISI.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        return android.app.PendingIntent.getActivities(this.getHighSpeedVideoFpsRangesFor, i, intentArr, i2, bundle);
    }

    public final android.app.PendingIntent getPendingIntent(int i, int i2, android.os.Bundle bundle, boolean z) {
        return getPendingIntent(i, androidx.core.app.PendingIntentCompat.getHighSpeedVideoFpsRangesFor(z, i2), bundle);
    }

    public final android.content.Intent[] getIntents() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        android.content.Intent[] intentArr = new android.content.Intent[size];
        if (size != 0) {
            intentArr[0] = new android.content.Intent(this.getHighResolutionOutputSizeshNQ4ISI.get(0)).addFlags(268484608);
            for (int i = 1; i < size; i++) {
                intentArr[i] = new android.content.Intent(this.getHighResolutionOutputSizeshNQ4ISI.get(i));
            }
        }
        return intentArr;
    }
}
