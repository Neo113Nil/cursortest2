package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class ExpirationDate {

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String month;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String year;

    public java.lang.String getMonth() {
        return this.month;
    }

    public void setMonth(java.lang.String str) {
        this.month = str;
    }

    public java.lang.String getYear() {
        return this.year;
    }

    public void setYear(java.lang.String str) {
        this.year = str;
    }
}
