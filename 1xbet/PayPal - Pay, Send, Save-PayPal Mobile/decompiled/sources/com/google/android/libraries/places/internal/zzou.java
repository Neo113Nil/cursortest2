package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzou {
    public static final android.os.Parcelable zza(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        android.os.Parcelable parcelable = android.os.Build.VERSION.SDK_INT >= 33 ? (android.os.Parcelable) bundle.getParcelable(str, cls) : bundle.getParcelable(str);
        if (parcelable != null) {
            return parcelable;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }
}
