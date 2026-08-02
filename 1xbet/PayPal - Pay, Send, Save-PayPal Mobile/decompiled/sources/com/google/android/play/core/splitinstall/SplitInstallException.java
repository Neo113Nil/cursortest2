package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public class SplitInstallException extends com.google.android.gms.common.api.ApiException {
    public int getErrorCode() {
        return super.getStatusCode();
    }

    public SplitInstallException(int i) {
        super(new com.google.android.gms.common.api.Status(i, java.lang.String.format("Split Install Error(%d): %s", java.lang.Integer.valueOf(i), com.google.android.play.core.splitinstall.model.zza.zzb(i))));
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
