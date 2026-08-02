package org.betup.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ActivitySavedStateGuard.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/utils/ActivitySavedStateGuard;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "FRAGMENTS_KEY", "SAVED_STATE_REGISTRY_KEY", "MAX_SAFE_PARCEL_BYTES", "", "stripHeavyState", "", "outState", "Landroid/os/Bundle;", "stripNestedViewStatesPublic", "bundle", "stripNestedViewStates", "estimateBundleSize", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivitySavedStateGuard {
    public static final int $stable = 0;
    private static final String FRAGMENTS_KEY = "android:support:fragments";
    public static final ActivitySavedStateGuard INSTANCE = new ActivitySavedStateGuard();
    private static final int MAX_SAFE_PARCEL_BYTES = 450000;
    private static final String SAVED_STATE_REGISTRY_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private static final String TAG = "ActivitySavedStateGuard";

    private ActivitySavedStateGuard() {
    }

    @JvmStatic
    public static final void stripHeavyState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        ActivitySavedStateGuard activitySavedStateGuard = INSTANCE;
        activitySavedStateGuard.stripNestedViewStates(outState);
        Bundle bundle = outState.getBundle(FRAGMENTS_KEY);
        if (bundle != null) {
            activitySavedStateGuard.stripNestedViewStates(bundle);
            outState.putBundle(FRAGMENTS_KEY, bundle);
        }
        int estimateBundleSize = activitySavedStateGuard.estimateBundleSize(outState);
        if (estimateBundleSize > MAX_SAFE_PARCEL_BYTES) {
            outState.remove(SAVED_STATE_REGISTRY_KEY);
            Log.w(TAG, "Stripped BundlableSavedStateRegistry (estimated parcel=" + estimateBundleSize + " bytes)");
        }
    }

    @JvmStatic
    public static final void stripNestedViewStatesPublic(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        INSTANCE.stripNestedViewStates(bundle);
    }

    private final void stripNestedViewStates(Bundle bundle) {
        bundle.remove("android:view_state");
        bundle.remove("android:views");
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
        for (String str : CollectionsKt.toList(keySet)) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                stripNestedViewStates(bundle2);
                bundle.putBundle(str, bundle2);
            }
        }
    }

    private final int estimateBundleSize(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        try {
            obtain.writeBundle(bundle);
            return obtain.dataSize();
        } finally {
            obtain.recycle();
        }
    }
}
