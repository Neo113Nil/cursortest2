package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/http/IllegalHeaderNameException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/getHighSpeedVideoSizes;", "", "headerName", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "getHeaderName", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPosition", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IllegalHeaderNameException extends java.lang.IllegalArgumentException {
    private final java.lang.String headerName;
    private final int position;

    public final java.lang.String getHeaderName() {
        return this.headerName;
    }

    public final int getPosition() {
        return this.position;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IllegalHeaderNameException(java.lang.String str, int i) {
        super(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Header name '");
        sb.append(str);
        sb.append("' contains illegal character '");
        sb.append(str.charAt(i));
        sb.append("' (code ");
        sb.append(str.charAt(i) & 255);
        sb.append(')');
        this.headerName = str;
        this.position = i;
    }
}
