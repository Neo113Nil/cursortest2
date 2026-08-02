package androidx.core.app;

/* loaded from: classes.dex */
public class ActivityCompat extends androidx.core.content.ContextCompat {
    private static androidx.core.app.ActivityCompat.PermissionCompatDelegate getHighSpeedVideoSizes;

    /* loaded from: classes3.dex */
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr);
    }

    /* loaded from: classes3.dex */
    public interface PermissionCompatDelegate {
        @java.lang.Deprecated
        boolean onActivityResult(android.app.Activity activity, int i, int i2, android.content.Intent intent);

        boolean requestPermissions(android.app.Activity activity, java.lang.String[] strArr, int i);
    }

    /* loaded from: classes3.dex */
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    protected ActivityCompat() {
    }

    public static void setPermissionCompatDelegate(androidx.core.app.ActivityCompat.PermissionCompatDelegate permissionCompatDelegate) {
        getHighSpeedVideoSizes = permissionCompatDelegate;
    }

    public static androidx.core.app.ActivityCompat.PermissionCompatDelegate getPermissionCompatDelegate() {
        return getHighSpeedVideoSizes;
    }

    @java.lang.Deprecated
    public static boolean invalidateOptionsMenu(android.app.Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void startActivityForResult(android.app.Activity activity, android.content.Intent intent, int i, android.os.Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void startIntentSenderForResult(android.app.Activity activity, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void finishAffinity(android.app.Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(android.app.Activity activity) {
        activity.finishAfterTransition();
    }

    public static android.net.Uri getReferrer(android.app.Activity activity) {
        return activity.getReferrer();
    }

    public static <T extends android.view.View> T requireViewById(android.app.Activity activity, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return (T) androidx.core.app.ActivityCompat.Api28Impl.getHighSpeedVideoSizes(activity, i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(android.app.Activity activity, androidx.core.app.SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback != null ? new androidx.core.app.ActivityCompat.SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void setExitSharedElementCallback(android.app.Activity activity, androidx.core.app.SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback != null ? new androidx.core.app.ActivityCompat.SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void postponeEnterTransition(android.app.Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void startPostponedEnterTransition(android.app.Activity activity) {
        activity.startPostponedEnterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(android.app.Activity activity, java.lang.String[] strArr, int i) {
        androidx.core.app.ActivityCompat.PermissionCompatDelegate permissionCompatDelegate = getHighSpeedVideoSizes;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.requestPermissions(activity, strArr, i)) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (android.text.TextUtils.isEmpty(strArr[i2])) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Permission request for permissions ");
                    sb.append(java.util.Arrays.toString(strArr));
                    sb.append(" must not contain null or empty values");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                if (android.os.Build.VERSION.SDK_INT < 33 && android.text.TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(java.lang.Integer.valueOf(i2));
                }
            }
            int size = hashSet.size();
            java.lang.String[] strArr2 = size > 0 ? new java.lang.String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(java.lang.Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            }
            if (activity instanceof androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) {
                ((androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        }
    }

    public static boolean shouldShowRequestPermissionRationale(android.app.Activity activity, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 33 && android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            return androidx.core.app.ActivityCompat.Api32Impl.Camera2StreamConfigurationMap(activity, str);
        }
        if (android.os.Build.VERSION.SDK_INT == 31) {
            return androidx.core.app.ActivityCompat.Api31Impl.getHighSpeedVideoSizes(activity, str);
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static boolean isLaunchedFromBubble(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.app.ActivityCompat.Api31Impl.getHighResolutionOutputSizeshNQ4ISI(activity);
        }
        return android.os.Build.VERSION.SDK_INT == 30 ? (androidx.core.app.ActivityCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(activity) == null || androidx.core.app.ActivityCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(activity).getDisplayId() == 0) ? false : true : (android.os.Build.VERSION.SDK_INT != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
    }

    public static androidx.core.view.DragAndDropPermissionsCompat requestDragAndDropPermissions(android.app.Activity activity, android.view.DragEvent dragEvent) {
        return androidx.core.view.DragAndDropPermissionsCompat.request(activity, dragEvent);
    }

    public static void recreate(final android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new android.os.Handler(activity.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.app.ActivityCompat.getHighSpeedVideoFpsRangesFor(activity);
                }
            });
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(android.app.Activity activity) {
        if (activity.isFinishing() || androidx.core.app.ActivityRecreator.getHighSpeedVideoSizes(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void setLocusContext(android.app.Activity activity, androidx.core.content.LocusIdCompat locusIdCompat, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.app.ActivityCompat.Api30Impl.getHighSpeedVideoSizes(activity, locusIdCompat, bundle);
        }
    }

    /* loaded from: classes7.dex */
    static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final androidx.core.app.SharedElementCallback getHighSpeedVideoSizes;

        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback sharedElementCallback) {
            this.getHighSpeedVideoSizes = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
            this.getHighSpeedVideoSizes.onSharedElementStart(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
            this.getHighSpeedVideoSizes.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(java.util.List<android.view.View> list) {
            this.getHighSpeedVideoSizes.onRejectSharedElements(list);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, android.view.View> map) {
            this.getHighSpeedVideoSizes.onMapSharedElements(list, map);
        }

        @Override // android.app.SharedElementCallback
        public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
            return this.getHighSpeedVideoSizes.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public android.view.View onCreateSnapshotView(android.content.Context context, android.os.Parcelable parcelable) {
            return this.getHighSpeedVideoSizes.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, final android.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            androidx.core.app.SharedElementCallback sharedElementCallback = this.getHighSpeedVideoSizes;
            java.util.Objects.requireNonNull(onSharedElementsReadyListener);
            sharedElementCallback.onSharedElementsArrived(list, list2, new androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener() { // from class: androidx.core.app.ActivityCompat$SharedElementCallback21Impl$$ExternalSyntheticLambda0
                @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
                public final void onSharedElementsReady() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        static void getHighSpeedVideoSizes(android.app.Activity activity, androidx.core.content.LocusIdCompat locusIdCompat, android.os.Bundle bundle) {
            activity.setLocusContext(locusIdCompat == null ? null : locusIdCompat.toLocusId(), bundle);
        }

        static android.view.Display getHighResolutionOutputSizeshNQ4ISI(android.content.ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }
    }

    /* loaded from: classes7.dex */
    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        static boolean getHighSpeedVideoSizes(android.app.Activity activity, java.lang.String str) {
            try {
                return ((java.lang.Boolean) android.content.pm.PackageManager.class.getMethod("shouldShowRequestPermissionRationale", java.lang.String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* loaded from: classes7.dex */
    static class Api32Impl {
        private Api32Impl() {
        }

        static boolean Camera2StreamConfigurationMap(android.app.Activity activity, java.lang.String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes7.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T getHighSpeedVideoSizes(android.app.Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }
}
