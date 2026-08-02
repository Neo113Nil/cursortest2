package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f3306a;

    public final java.lang.Long a(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.f3306a.get(str);
        if (str2 == null) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str2.split(" ")[0]) * okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public final void a(com.dyneti.android.dyscan.n2 n2Var) {
        java.util.Scanner scanner;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            scanner = new java.util.Scanner(new java.io.File("/proc/meminfo"));
            while (scanner.hasNextLine()) {
                try {
                    java.lang.String[] split = scanner.nextLine().split(": ");
                    if (split.length > 1) {
                        hashMap.put(split[0].trim(), split[1].trim());
                    }
                } finally {
                }
            }
            scanner.close();
        } catch (java.io.FileNotFoundException unused) {
        }
        this.f3306a = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        try {
            scanner = new java.util.Scanner(new java.io.File("/proc/cpuinfo"));
            while (scanner.hasNextLine()) {
                try {
                    java.lang.String[] split2 = scanner.nextLine().split(": ");
                    if (split2.length > 1) {
                        java.lang.String trim = split2[0].trim();
                        java.lang.String trim2 = split2[1].trim();
                        if (hashMap2.containsKey(trim)) {
                            ((java.util.List) hashMap2.get(trim)).add(trim2);
                        } else {
                            hashMap2.put(trim, new java.util.ArrayList(java.util.Collections.singleton(trim2)));
                        }
                    }
                } finally {
                }
            }
            scanner.close();
        } catch (java.io.FileNotFoundException unused2) {
        }
        java.util.List list = (java.util.List) hashMap2.get("processor");
        n2Var.a("processorCount", list != null ? java.lang.Integer.valueOf(list.size()) : null);
        n2Var.a("physicalMemoryB", a("MemTotal"));
        n2Var.a("swapTotalB", a("SwapTotal"));
    }
}
