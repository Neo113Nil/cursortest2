package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4252a;
    public java.lang.String b;

    public h(java.lang.String str) {
        this.f4252a = false;
        try {
            a(str);
            this.f4252a = true;
            com.fyber.inneractive.sdk.util.IAlog.a("parser: Parsing finished. parser is ready", new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    public final void a(java.lang.String str) {
        java.lang.String str2;
        com.fyber.inneractive.sdk.util.IAlog.a("Start reading Response", new java.lang.Object[0]);
        org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new java.io.StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                int i = 1;
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, null, "tns:Ad");
                    com.fyber.inneractive.sdk.util.IAlog.a("Start reading Ad", new java.lang.Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        com.fyber.inneractive.sdk.util.IAlog.f("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    java.lang.String trim = str2.trim();
                    com.fyber.inneractive.sdk.util.IAlog.e("Ad content: %s", trim);
                    if (trim == null) {
                        trim = null;
                    } else {
                        com.fyber.inneractive.sdk.util.s0 s0Var = com.fyber.inneractive.sdk.util.s0.b;
                        s0Var.getClass();
                        int indexOf = trim.indexOf(38);
                        if (indexOf >= 0) {
                            java.io.StringWriter stringWriter = new java.io.StringWriter((int) ((trim.length() * 0.1d) + trim.length()));
                            try {
                                s0Var.a(stringWriter, trim, indexOf);
                            } catch (java.io.IOException unused) {
                            }
                            trim = stringWriter.toString();
                        }
                    }
                    this.b = trim;
                } else {
                    if (newPullParser.getEventType() != 2) {
                        throw new java.lang.IllegalStateException();
                    }
                    while (i != 0) {
                        int next = newPullParser.next();
                        if (next == 2) {
                            i++;
                        } else if (next == 3) {
                            i--;
                        }
                    }
                }
            }
        }
    }
}
