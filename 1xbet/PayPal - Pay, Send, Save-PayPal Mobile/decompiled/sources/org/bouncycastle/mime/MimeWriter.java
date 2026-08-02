package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public abstract class MimeWriter {
    protected final org.bouncycastle.mime.Headers headers;

    public abstract java.io.OutputStream getContentStream() throws java.io.IOException;

    public org.bouncycastle.mime.Headers getHeaders() {
        return this.headers;
    }

    protected static java.util.List<java.lang.String> mapToLines(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.lang.String str : map.keySet()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public MimeWriter(org.bouncycastle.mime.Headers headers) {
        this.headers = headers;
    }
}
