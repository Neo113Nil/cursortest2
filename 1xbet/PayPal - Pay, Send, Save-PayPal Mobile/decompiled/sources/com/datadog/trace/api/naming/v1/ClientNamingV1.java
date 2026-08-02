package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class ClientNamingV1 implements com.datadog.trace.api.naming.NamingSchema.ForClient {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.datadog.trace.api.naming.NamingSchema.ForClient
    public java.lang.String operationForProtocol(java.lang.String str) {
        char c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        str.hashCode();
        switch (str.hashCode()) {
            case 101730:
                if (str.equals("ftp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3153745:
                if (str.equals("ftps")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3213448:
                if (str.equals("http")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 99617003:
                if (str.equals("https")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            str = "ftp";
        } else if (c == 2 || c == 3) {
            str = "http";
        }
        sb.append(str);
        sb.append(".client.request");
        return sb.toString();
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForClient
    public java.lang.String operationForComponent(java.lang.String str) {
        return "http.client.request";
    }
}
