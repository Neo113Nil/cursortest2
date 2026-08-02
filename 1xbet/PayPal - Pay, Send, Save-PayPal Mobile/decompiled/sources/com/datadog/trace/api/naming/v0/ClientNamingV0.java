package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class ClientNamingV0 implements com.datadog.trace.api.naming.NamingSchema.ForClient {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForClient
    public java.lang.String operationForProtocol(java.lang.String str) {
        java.lang.String str2;
        str.hashCode();
        if (str.equals("rmi")) {
            str2 = ".invoke";
        } else if (str.equals("grpc")) {
            str2 = ".client";
        } else {
            str2 = ".request";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.datadog.trace.api.naming.NamingSchema.ForClient
    public java.lang.String operationForComponent(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1015101340:
                if (str.equals("okhttp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -812554147:
                if (str.equals("pekko-http-client")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -493621227:
                if (str.equals("play-ws")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -204573341:
                if (str.equals("akka-http-client")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 30586646:
                if (str.equals("netty-client")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1237268332:
                if (str.equals("jax-rs.client")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return "pekko-http.client.request";
            }
            if (c != 2) {
                if (c == 3) {
                    return "akka-http.client.request";
                }
                if (c == 4) {
                    return "netty.client.request";
                }
                if (c == 5) {
                    return "jax-rs.client.call";
                }
                return "http.request";
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".request");
        return sb.toString();
    }
}
