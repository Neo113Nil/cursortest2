package com.ironsource;

/* renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2969b8 {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6152a = "POST";
    private static final java.lang.String b = "GET";
    private static final java.lang.String c = "ISHttpService";

    /* renamed from: com.ironsource.b8$a */
    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final java.lang.String j = "UTF-8";

        /* renamed from: a, reason: collision with root package name */
        final java.lang.String f6153a;
        final java.lang.String b;
        final java.lang.String c;
        final int d;
        final int e;
        final java.lang.String f;
        java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> g;

        /* renamed from: com.ironsource.b8$a$a, reason: collision with other inner class name */
        static class C0147a {
            java.lang.String b;
            java.lang.String d;

            /* renamed from: a, reason: collision with root package name */
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> f6154a = new java.util.ArrayList();
            java.lang.String c = "POST";
            int e = 15000;
            int f = 15000;
            java.lang.String g = "UTF-8";

            C0147a() {
            }

            com.ironsource.C2969b8.a.C0147a a(java.lang.String str) {
                this.d = str;
                return this;
            }

            com.ironsource.C2969b8.a.C0147a b(java.lang.String str) {
                this.g = str;
                return this;
            }

            com.ironsource.C2969b8.a.C0147a c(java.lang.String str) {
                this.b = str;
                return this;
            }

            com.ironsource.C2969b8.a.C0147a d(java.lang.String str) {
                this.c = str;
                return this;
            }

            com.ironsource.C2969b8.a.C0147a a(int i) {
                this.e = i;
                return this;
            }

            com.ironsource.C2969b8.a.C0147a b(int i) {
                this.f = i;
                return this;
            }

            com.ironsource.C2969b8.a.C0147a a(android.util.Pair<java.lang.String, java.lang.String> pair) {
                this.f6154a.add(pair);
                return this;
            }

            com.ironsource.C2969b8.a.C0147a a(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) {
                this.f6154a.addAll(list);
                return this;
            }

            com.ironsource.C2969b8.a a() {
                return new com.ironsource.C2969b8.a(this);
            }
        }

        public a(com.ironsource.C2969b8.a.C0147a c0147a) {
            this.f6153a = c0147a.b;
            this.b = c0147a.c;
            this.c = c0147a.d;
            this.g = new java.util.ArrayList<>(c0147a.f6154a);
            this.d = c0147a.e;
            this.e = c0147a.f;
            this.f = c0147a.g;
        }

        boolean a() {
            return "POST".equals(this.b);
        }
    }

    public static com.ironsource.Pd a(java.lang.String str, java.lang.String str2, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.lang.Exception {
        android.net.Uri build = android.net.Uri.parse(str).buildUpon().encodedQuery(str2).build();
        com.ironsource.C2969b8.a.C0147a c0147a = new com.ironsource.C2969b8.a.C0147a();
        c0147a.c(build.toString()).a(str2).d("GET").a(list);
        return b(c0147a.a());
    }

    public static com.ironsource.Pd b(java.lang.String str, java.lang.String str2, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.lang.Exception {
        com.ironsource.C2969b8.a.C0147a c0147a = new com.ironsource.C2969b8.a.C0147a();
        c0147a.c(str).a(str2).d("POST").a(list);
        return b(c0147a.a());
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x009d: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:46:0x009d */
    public static com.ironsource.Pd b(com.ironsource.C2969b8.a r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C2969b8.b(com.ironsource.b8$a):com.ironsource.Pd");
    }

    private static void a(java.net.HttpURLConnection httpURLConnection, com.ironsource.C2969b8.a aVar) throws java.lang.Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.CONTENT_LENGTH, java.lang.Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(java.net.HttpURLConnection httpURLConnection, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.net.ProtocolException {
        for (android.util.Pair<java.lang.String, java.lang.String> pair : list) {
            httpURLConnection.setRequestProperty((java.lang.String) pair.first, (java.lang.String) pair.second);
        }
    }

    private static void a(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.lang.Exception {
        httpURLConnection.setDoOutput(true);
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static java.net.HttpURLConnection a(com.ironsource.C2969b8.a aVar) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(aVar.f6153a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }
}
