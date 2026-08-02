package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class ErrorResponse {
    private java.util.List<com.visa.cbp.external.common.StatusDetailsEntry> details;
    private java.lang.String message;
    private java.lang.String reason;
    private java.lang.Integer status;

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public void setStatus(java.lang.Integer num) {
        this.status = num;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    public java.lang.String getReason() {
        return this.reason;
    }

    public void setReason(java.lang.String str) {
        this.reason = str;
    }

    public java.util.List<com.visa.cbp.external.common.StatusDetailsEntry> getDetails() {
        if (this.details == null) {
            this.details = new java.util.ArrayList();
        }
        return this.details;
    }

    public void setDetails(java.util.List<com.visa.cbp.external.common.StatusDetailsEntry> list) {
        this.details = list;
    }

    public static int f(java.lang.Object obj) {
        try {
            java.lang.Object[] objArr = {obj};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1983273232);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2000, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 29)).getMethod("D", java.lang.Object.class);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1983273232, obj2);
            }
            return ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
