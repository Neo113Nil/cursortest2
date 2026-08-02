package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzlu {
    public static java.lang.String zzb(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str2) ? str : str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1698126997:
                    if (str.equals("REQUEST_DENIED")) {
                        return com.google.android.libraries.places.api.net.PlacesStatusCodes.REQUEST_DENIED;
                    }
                    return 13;
                case -1125000185:
                    if (str.equals("INVALID_REQUEST")) {
                        return com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST;
                    }
                    break;
                case -813482689:
                    if (str.equals("ZERO_RESULTS")) {
                        return 0;
                    }
                    break;
                case 2524:
                    if (str.equals(com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton)) {
                        return 0;
                    }
                    break;
                case 1023286998:
                    if (str.equals(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND)) {
                        return com.google.android.libraries.places.api.net.PlacesStatusCodes.NOT_FOUND;
                    }
                    break;
                case 1831775833:
                    if (str.equals("OVER_QUERY_LIMIT")) {
                        return com.google.android.libraries.places.api.net.PlacesStatusCodes.OVER_QUERY_LIMIT;
                    }
                    break;
            }
        } else {
            return 13;
        }
    }
}
