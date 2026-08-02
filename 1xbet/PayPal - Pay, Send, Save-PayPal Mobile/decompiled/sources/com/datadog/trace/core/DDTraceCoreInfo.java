package com.datadog.trace.core;

/* loaded from: classes8.dex */
public class DDTraceCoreInfo {
    public static final java.lang.String JAVA_VERSION = java.lang.System.getProperty("java.version", "unknown");
    public static final java.lang.String JAVA_VM_NAME = java.lang.System.getProperty("java.vm.name", "unknown");
    public static final java.lang.String JAVA_VM_VENDOR = java.lang.System.getProperty("java.vm.vendor", "unknown");
    public static final java.lang.String VERSION;

    static {
        java.lang.String str = "unknown";
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.datadog.trace.core.DDTraceCoreInfo.class.getResourceAsStream("/dd-trace-core.version"), "UTF-8"));
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
                java.lang.String trim = sb.toString().trim();
                bufferedReader.close();
                str = trim;
            } finally {
            }
        } catch (java.lang.Exception unused) {
        }
        VERSION = str;
    }

    public static void main(java.lang.String... strArr) {
        java.lang.System.out.println(VERSION);
    }
}
