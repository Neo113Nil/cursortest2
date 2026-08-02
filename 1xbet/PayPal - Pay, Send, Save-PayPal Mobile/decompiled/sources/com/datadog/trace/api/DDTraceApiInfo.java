package com.datadog.trace.api;

/* loaded from: classes8.dex */
public class DDTraceApiInfo {
    public static final java.lang.String VERSION;

    static {
        java.lang.String str;
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.datadog.trace.api.DDTraceApiInfo.class.getResourceAsStream("/dd-trace-api.version"), "UTF-8"));
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read == -1) {
                        break;
                    } else {
                        sb.append((char) read);
                    }
                }
                str = sb.toString().trim();
                bufferedReader.close();
            } finally {
            }
        } catch (java.lang.Exception unused) {
            str = "unknown";
        }
        VERSION = str;
    }
}
