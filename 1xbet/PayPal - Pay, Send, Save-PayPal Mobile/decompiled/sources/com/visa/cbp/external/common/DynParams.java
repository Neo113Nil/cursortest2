package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class DynParams {

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String api;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String dki;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String encKeyInfo;
    private java.lang.Long keyExpTS;
    private java.lang.Integer maxPmts;
    private com.visa.cbp.external.common.ParamsStatus paramsStatus;
    private java.lang.Integer sc;

    @com.google.gson.annotations.SerializedName("tvl")
    private java.util.List<java.lang.String> tvls;

    public java.lang.String getEncKeyInfo() {
        return this.encKeyInfo;
    }

    public void setEncKeyInfo(java.lang.String str) {
        this.encKeyInfo = str;
    }

    public int getMaxPmts() {
        return this.maxPmts.intValue();
    }

    public void setMaxPmts(int i) {
        this.maxPmts = java.lang.Integer.valueOf(i);
    }

    public java.lang.String getApi() {
        return this.api;
    }

    public void setApi(java.lang.String str) {
        this.api = str;
    }

    public int getSc() {
        return this.sc.intValue();
    }

    public void setSc(int i) {
        this.sc = java.lang.Integer.valueOf(i);
    }

    public long getKeyExpTS() {
        return this.keyExpTS.longValue();
    }

    public void setKeyExpTS(long j) {
        this.keyExpTS = java.lang.Long.valueOf(j);
    }

    public java.lang.String getDki() {
        return this.dki;
    }

    public void setDki(java.lang.String str) {
        this.dki = str;
    }

    public java.util.List<java.lang.String> getTvls() {
        if (this.tvls == null) {
            this.tvls = new java.util.ArrayList();
        }
        return this.tvls;
    }

    public void setTvls(java.util.List<java.lang.String> list) {
        this.tvls = list;
    }

    public com.visa.cbp.external.common.ParamsStatus getParamsStatus() {
        return this.paramsStatus;
    }

    public void setParamsStatus(com.visa.cbp.external.common.ParamsStatus paramsStatus) {
        this.paramsStatus = paramsStatus;
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        try {
            java.lang.Object[] objArr = {obj, obj2};
            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(2107890674);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1838 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25)).getMethod("w", java.lang.Object.class, java.lang.Object.class);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(2107890674, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
