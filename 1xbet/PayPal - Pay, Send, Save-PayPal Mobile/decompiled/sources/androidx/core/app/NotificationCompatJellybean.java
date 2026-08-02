package androidx.core.app;

/* loaded from: classes3.dex */
class NotificationCompatJellybean {
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    static androidx.core.app.NotificationCompat.Action Camera2StreamConfigurationMap(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("extras");
        return new androidx.core.app.NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (android.app.PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(bundle, "remoteInputs")), getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    static android.os.Bundle getHighResolutionOutputSizeshNQ4ISI(androidx.core.app.NotificationCompat.Action action) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = new android.os.Bundle();
        androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
        bundle2.putInt("icon", iconCompat != null ? iconCompat.getResId() : 0);
        bundle2.putCharSequence("title", action.getTitle());
        bundle2.putParcelable("actionIntent", action.getActionIntent());
        if (action.getExtras() != null) {
            bundle = new android.os.Bundle(action.getExtras());
        } else {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", getHighSpeedVideoSizes(action.getRemoteInputs()));
        bundle2.putBoolean("showsUserInterface", action.getShowsUserInterface());
        bundle2.putInt("semanticAction", action.getSemanticAction());
        return bundle2;
    }

    private static androidx.core.app.RemoteInput getHighSpeedVideoFpsRangesFor(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        java.util.HashSet hashSet = new java.util.HashSet();
        if (stringArrayList != null) {
            java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new androidx.core.app.RemoteInput(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    private static android.os.Bundle Camera2StreamConfigurationMap(androidx.core.app.RemoteInput remoteInput) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("resultKey", remoteInput.getResultKey());
        bundle.putCharSequence("label", remoteInput.getLabel());
        bundle.putCharSequenceArray("choices", remoteInput.getChoices());
        bundle.putBoolean("allowFreeFormInput", remoteInput.getAllowFreeFormInput());
        bundle.putBundle("extras", remoteInput.getExtras());
        java.util.Set<java.lang.String> allowedDataTypes = remoteInput.getAllowedDataTypes();
        if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(allowedDataTypes.size());
            java.util.Iterator<java.lang.String> it = allowedDataTypes.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static androidx.core.app.RemoteInput[] getHighSpeedVideoFpsRangesFor(android.os.Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        androidx.core.app.RemoteInput[] remoteInputArr = new androidx.core.app.RemoteInput[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            remoteInputArr[i] = getHighSpeedVideoFpsRangesFor(bundleArr[i]);
        }
        return remoteInputArr;
    }

    private static android.os.Bundle[] getHighSpeedVideoSizes(androidx.core.app.RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.os.Bundle[] bundleArr = new android.os.Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            bundleArr[i] = Camera2StreamConfigurationMap(remoteInputArr[i]);
        }
        return bundleArr;
    }

    private static android.os.Bundle[] getHighSpeedVideoSizes(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof android.os.Bundle[]) || parcelableArray == null) {
            return (android.os.Bundle[]) parcelableArray;
        }
        android.os.Bundle[] bundleArr = (android.os.Bundle[]) java.util.Arrays.copyOf(parcelableArray, parcelableArray.length, android.os.Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    private NotificationCompatJellybean() {
    }
}
