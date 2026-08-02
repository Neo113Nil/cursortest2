package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
public interface MagnesNetworking {
    int execute(byte[] bArr) throws java.lang.Exception;

    java.util.List<java.lang.String> getCookies(java.lang.String str);

    java.lang.String getPayPalDebugId();

    byte[] getResponseContent();

    void setCookies(java.util.List<java.net.HttpCookie> list);

    void setHeader(java.util.Map<java.lang.String, java.lang.String> map);

    void setUri(android.net.Uri uri);
}
