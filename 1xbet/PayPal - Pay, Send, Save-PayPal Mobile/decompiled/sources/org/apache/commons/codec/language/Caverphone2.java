package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class Caverphone2 extends org.apache.commons.codec.language.AbstractCaverphone {
    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        if (org.apache.commons.codec.language.SoundexUtils.Camera2StreamConfigurationMap(str)) {
            return "1111111111";
        }
        java.lang.String replace = str.toLowerCase(java.util.Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("e$", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^trough", "trou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replace("cq", "2q").replace("ci", "si").replace("ce", "se").replace("cy", "sy").replace("tch", "2ch").replace("c", "k").replace("q", "k").replace("x", "k").replace("v", "f").replace("dg", "2g").replace("tio", "sio").replace("tia", "sia").replace("d", "t").replace("ph", "fh").replace(util.h.xy.cb.b.f1091, "p").replace("sh", "s2").replace("z", lib.android.paypal.com.magnessdk.g.n2).replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replace("j", "y").replaceAll("^y3", "Y3").replaceAll("^y", "A").replace("y", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replace("3gh3", "3kh3").replace("gh", "22").replace("g", "k").replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER).replaceAll("m+", "M").replaceAll("n+", "N").replace("w3", "W3").replace("wh3", "Wh3").replaceAll("w$", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replace("w", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replaceAll("^h", "A").replace("h", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replace("r3", "R3").replaceAll("r$", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replace("r", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replace("l3", "L3").replaceAll("l$", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replace("l", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replace(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "").replaceAll("3$", "A").replace(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(replace);
        sb.append("1111111111");
        return sb.toString().substring(0, 10);
    }
}
