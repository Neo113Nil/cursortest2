package codec.language;

/* loaded from: classes7.dex */
public class Caverphone2 extends codec.language.AbstractCaverphone {
    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "1111111111";
        }
        java.lang.String replaceAll = str.toLowerCase(java.util.Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("e$", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^trough", "trou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replaceAll("cq", "2q").replaceAll("ci", "si").replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll("c", "k").replaceAll("q", "k").replaceAll("x", "k").replaceAll("v", "f").replaceAll("dg", "2g").replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll("d", "t").replaceAll("ph", "fh").replaceAll(util.h.xy.cb.b.f1091, "p").replaceAll("sh", "s2").replaceAll("z", lib.android.paypal.com.magnessdk.g.n2).replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replaceAll("j", "y").replaceAll("^y3", "Y3").replaceAll("^y", "A").replaceAll("y", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replaceAll("3gh3", "3kh3").replaceAll("gh", "22").replaceAll("g", "k").replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER).replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wh3", "Wh3").replaceAll("w$", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replaceAll("w", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replaceAll("^h", "A").replaceAll("h", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replaceAll("r3", "R3").replaceAll("r$", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replaceAll("r", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replaceAll("l3", "L3").replaceAll("l$", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D).replaceAll("l", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).replaceAll(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "").replaceAll("3$", "A").replaceAll(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(replaceAll);
        sb.append("1111111111");
        return sb.toString().substring(0, 10);
    }
}
