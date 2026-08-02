package com.adobe.marketing.mobile.services;

/* loaded from: classes3.dex */
public interface NamedCollection {
    boolean contains(java.lang.String str);

    boolean getBoolean(java.lang.String str, boolean z);

    double getDouble(java.lang.String str, double d);

    float getFloat(java.lang.String str, float f);

    int getInt(java.lang.String str, int i);

    long getLong(java.lang.String str, long j);

    java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String str);

    java.lang.String getString(java.lang.String str, java.lang.String str2);

    void remove(java.lang.String str);

    void removeAll();

    void setBoolean(java.lang.String str, boolean z);

    void setDouble(java.lang.String str, double d);

    void setFloat(java.lang.String str, float f);

    void setInt(java.lang.String str, int i);

    void setLong(java.lang.String str, long j);

    void setMap(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    void setString(java.lang.String str, java.lang.String str2);
}
