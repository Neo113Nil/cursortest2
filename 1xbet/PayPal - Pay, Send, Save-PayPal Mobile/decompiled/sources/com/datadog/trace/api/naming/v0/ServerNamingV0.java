package com.datadog.trace.api.naming.v0;

/* loaded from: classes3.dex */
public class ServerNamingV0 implements com.datadog.trace.api.naming.NamingSchema.ForServer {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForServer
    public java.lang.String operationForProtocol(java.lang.String str) {
        if ("grpc".equals(str)) {
            return "grpc.server";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".request");
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.datadog.trace.api.naming.NamingSchema.ForServer
    public java.lang.String operationForComponent(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2127098104:
                if (str.equals("spray-http-server")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -853252051:
                if (str.equals("finatra")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -360668203:
                if (str.equals("pekko-http-server")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -290468574:
                if (str.equals("restlet-http-server")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 104711394:
                if (str.equals("netty")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 247312603:
                if (str.equals("akka-http-server")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 285983583:
                if (str.equals("undertow-http-server")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 905298397:
                if (str.equals("axway-http")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2025658375:
                if (str.equals("synapse-server")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                str = "spray-http";
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
                str = "pekko-http";
                break;
            case 3:
                str = "restlet-http";
                break;
            case 5:
                str = "akka-http";
                break;
            case 6:
                str = "undertow-http";
                break;
            case '\b':
                str = "synapse";
                break;
            default:
                str = "servlet";
                break;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".request");
        return sb.toString();
    }
}
