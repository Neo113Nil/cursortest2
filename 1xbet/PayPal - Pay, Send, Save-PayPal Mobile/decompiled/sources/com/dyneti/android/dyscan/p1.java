package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f3331a = java.util.regex.Pattern.compile("^\\d+: (.*):");
    public final java.util.regex.Pattern b = java.util.regex.Pattern.compile("inet ([0-9.]*)/");
    public final java.util.regex.Pattern c = java.util.regex.Pattern.compile("inet6 ([0-9a-f:]*)/");
    public java.lang.String d = null;
    public java.lang.String e = null;
    public java.lang.String f = null;
    public java.lang.String g = null;
    public final java.util.HashMap h = new java.util.HashMap();
    public final java.util.HashMap i = new java.util.HashMap();

    public final void a(com.dyneti.android.dyscan.n2 n2Var) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("ip addr show").getInputStream()));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else {
                    a(readLine);
                }
            }
        } catch (java.io.IOException | java.lang.SecurityException unused) {
        }
        a(this.h);
        a(this.i);
        n2Var.a("wifiIp", this.d);
        n2Var.a("cellularIp", this.e);
        n2Var.a("wiredIp", this.f);
    }

    public final void a(java.lang.String str) {
        java.util.regex.Matcher matcher = this.f3331a.matcher(str);
        if (matcher.find()) {
            this.g = matcher.group(1);
            return;
        }
        if (this.g != null) {
            java.util.regex.Matcher matcher2 = this.b.matcher(str);
            if (matcher2.find()) {
                this.h.put(this.g, matcher2.group(1));
            }
            java.util.regex.Matcher matcher3 = this.c.matcher(str);
            if (matcher3.find()) {
                this.i.put(this.g, matcher3.group(1));
            }
        }
    }

    public final void a(java.util.HashMap hashMap) {
        for (java.lang.String str : hashMap.keySet()) {
            if (str.startsWith("wlan") && this.d == null) {
                this.d = (java.lang.String) hashMap.get(str);
            } else if (str.startsWith("rmnet") && this.e == null) {
                this.e = (java.lang.String) hashMap.get(str);
            } else if (str.startsWith("eth") || str.startsWith("en")) {
                if (this.f == null) {
                    this.f = (java.lang.String) hashMap.get(str);
                }
            }
        }
    }
}
