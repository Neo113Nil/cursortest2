package androidx.media3.common;

/* loaded from: classes7.dex */
public class ParserException extends java.io.IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public static androidx.media3.common.ParserException createForMalformedDataOfUnknownType(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, true, 0);
    }

    public static androidx.media3.common.ParserException createForMalformedContainer(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, true, 1);
    }

    public static androidx.media3.common.ParserException createForMalformedManifest(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, true, 4);
    }

    public static androidx.media3.common.ParserException createForManifestWithUnsupportedFeature(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, false, 4);
    }

    public static androidx.media3.common.ParserException createForUnsupportedContainerFeature(java.lang.String str) {
        return new androidx.media3.common.ParserException(str, null, false, 1);
    }

    protected ParserException(java.lang.String str, java.lang.Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String str;
        java.lang.String message = super.getMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (message != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(message);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("{contentIsMalformed=");
        sb.append(this.contentIsMalformed);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append("}");
        return sb.toString();
    }
}
