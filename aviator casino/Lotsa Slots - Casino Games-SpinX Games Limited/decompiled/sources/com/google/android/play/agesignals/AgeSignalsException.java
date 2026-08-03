package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public class AgeSignalsException extends com.google.android.gms.common.api.ApiException {
    public AgeSignalsException(int i) {
        super(new com.google.android.gms.common.api.Status(i, java.lang.String.format(java.util.Locale.getDefault(), "Age Signals Error: %d", java.lang.Integer.valueOf(i))));
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }

    public AgeSignalsException(com.google.android.gms.common.api.Status status) {
        super(status);
    }
}
