package com.google.android.material.timepicker;

/* loaded from: classes8.dex */
interface TimePickerControls {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ActiveSelection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ClockPeriod {
    }

    void setActiveSelection(int i);

    void setHandRotation(float f);

    void setValues(java.lang.String[] strArr, int i);

    void updateTime(int i, int i2, int i3);
}
