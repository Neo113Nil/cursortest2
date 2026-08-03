package io.appmetrica.analytics.coreapi.internal.event;

/* loaded from: classes.dex */
public interface CounterReportApi {
    int getBytesTruncated();

    int getCustomType();

    java.util.Map<java.lang.String, byte[]> getExtras();

    java.lang.String getName();

    int getType();

    java.lang.String getValue();

    byte[] getValueBytes();

    void setBytesTruncated(int i2);

    void setCustomType(int i2);

    void setExtras(java.util.Map<java.lang.String, byte[]> map);

    void setName(java.lang.String str);

    void setType(int i2);

    void setValue(java.lang.String str);

    void setValueBytes(byte[] bArr);
}
