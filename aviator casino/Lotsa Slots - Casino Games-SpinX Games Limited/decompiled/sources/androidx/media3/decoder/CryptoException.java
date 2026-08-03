package androidx.media3.decoder;

/* loaded from: classes2.dex */
public class CryptoException extends java.lang.Exception {
    public final int errorCode;

    public CryptoException(int i, java.lang.String str) {
        super(str);
        this.errorCode = i;
    }
}
