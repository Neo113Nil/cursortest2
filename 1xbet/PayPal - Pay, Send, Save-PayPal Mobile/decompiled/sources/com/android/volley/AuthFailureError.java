package com.android.volley;

/* loaded from: classes3.dex */
public class AuthFailureError extends com.android.volley.VolleyError {
    private android.content.Intent getHighSpeedVideoFpsRanges;

    public AuthFailureError() {
    }

    public AuthFailureError(android.content.Intent intent) {
        this.getHighSpeedVideoFpsRanges = intent;
    }

    public AuthFailureError(com.android.volley.NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public AuthFailureError(java.lang.String str) {
        super(str);
    }

    public AuthFailureError(java.lang.String str, java.lang.Exception exc) {
        super(str, exc);
    }

    public android.content.Intent getResolutionIntent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        if (this.getHighSpeedVideoFpsRanges != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
