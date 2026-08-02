package com.facetec.sdk;

/* loaded from: classes8.dex */
final class go extends com.facetec.sdk.fd<java.sql.Time> {
    static final com.facetec.sdk.fb d = new com.facetec.sdk.fb() { // from class: com.facetec.sdk.go.4
        public static int c;
        public static int e;

        @Override // com.facetec.sdk.fb
        public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
            if (gwVar.a() == java.sql.Time.class) {
                return new com.facetec.sdk.go((byte) 0);
            }
            return null;
        }

        public static int c() {
            int i = e;
            e = i + 1;
            if (i % 7108395 != 0) {
                return c;
            }
            int nextInt = new java.util.Random().nextInt(1838814749);
            c = nextInt;
            return nextInt;
        }
    };
    private final java.text.DateFormat e;

    /* synthetic */ go(byte b) {
        this();
    }

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.sql.Time time) throws java.io.IOException {
        java.lang.String format;
        java.sql.Time time2 = time;
        if (time2 == null) {
            guVar.g();
            return;
        }
        synchronized (this) {
            format = this.e.format((java.util.Date) time2);
        }
        guVar.d(format);
    }

    private go() {
        this.e = new java.text.SimpleDateFormat("hh:mm:ss a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facetec.sdk.fd
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.sql.Time b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        java.sql.Time time;
        if (gtVar.f() == com.facetec.sdk.gs.NULL) {
            gtVar.k();
            return null;
        }
        java.lang.String g = gtVar.g();
        try {
            synchronized (this) {
                time = new java.sql.Time(this.e.parse(g).getTime());
            }
            return time;
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
            sb.append(g);
            sb.append("' as SQL Time; at path ");
            sb.append(gtVar.s());
            throw new com.facetec.sdk.ev(sb.toString(), e);
        }
    }
}
