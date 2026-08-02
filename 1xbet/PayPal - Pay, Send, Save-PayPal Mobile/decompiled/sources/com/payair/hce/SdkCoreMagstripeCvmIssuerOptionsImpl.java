package com.payair.hce;

/* loaded from: classes4.dex */
public class SdkCoreMagstripeCvmIssuerOptionsImpl implements com.payair.hce.stopSelfResultHook, java.io.Serializable {
    public byte[][] values;

    public SdkCoreMagstripeCvmIssuerOptionsImpl() {
        this.values = null;
        this.values = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 32, 256);
    }

    public int hashCode() {
        return java.util.Arrays.deepHashCode(this.values) + 485;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.deepEquals(this.values, ((com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl) obj).values);
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.values = (byte[][]) getstartcommandintent.DigitizedCardProfile(byte[][].class);
    }
}
