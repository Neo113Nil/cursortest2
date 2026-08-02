package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final /* synthetic */ class zzcfm {
    public static final /* synthetic */ int zza = 0;

    static {
        java.util.logging.Logger.getLogger("okio.Okio");
    }

    public static final boolean zza(java.lang.AssertionError assertionError) {
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assertionError, "");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "getsockname failed", false, 2, (java.lang.Object) null)) ? false : true;
    }
}
