package com.google.mlkit.vision.barcode.common.internal;

/* loaded from: classes9.dex */
public interface BarcodeSource {
    android.graphics.Rect getBoundingBox();

    com.google.mlkit.vision.barcode.common.Barcode.CalendarEvent getCalendarEvent();

    com.google.mlkit.vision.barcode.common.Barcode.ContactInfo getContactInfo();

    android.graphics.Point[] getCornerPoints();

    java.lang.String getDisplayValue();

    com.google.mlkit.vision.barcode.common.Barcode.DriverLicense getDriverLicense();

    com.google.mlkit.vision.barcode.common.Barcode.Email getEmail();

    int getFormat();

    com.google.mlkit.vision.barcode.common.Barcode.GeoPoint getGeoPoint();

    com.google.mlkit.vision.barcode.common.Barcode.Phone getPhone();

    byte[] getRawBytes();

    java.lang.String getRawValue();

    com.google.mlkit.vision.barcode.common.Barcode.Sms getSms();

    com.google.mlkit.vision.barcode.common.Barcode.UrlBookmark getUrl();

    int getValueType();

    com.google.mlkit.vision.barcode.common.Barcode.WiFi getWifi();
}
