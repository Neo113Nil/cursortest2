package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gc extends com.facetec.sdk.fd<java.util.Date> {
    public static final com.facetec.sdk.fb c = new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gc.2
        @Override // com.facetec.sdk.fb
        public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
            if (gwVar.a() == java.util.Date.class) {
                return new com.facetec.sdk.gc();
            }
            return null;
        }
    };
    private final java.util.List<java.text.DateFormat> b;

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.Date date) throws java.io.IOException {
        java.lang.String format;
        java.util.Date date2 = date;
        if (date2 == null) {
            guVar.g();
            return;
        }
        java.text.DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date2);
        }
        guVar.d(format);
    }

    public gc() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.facetec.sdk.fj.c()) {
            arrayList.add(com.facetec.sdk.fq.b(2, 2));
        }
    }

    private java.util.Date e(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        java.lang.String g = gtVar.g();
        synchronized (this.b) {
            java.util.Iterator<java.text.DateFormat> it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(g);
                } catch (java.text.ParseException unused) {
                }
            }
            try {
                return com.facetec.sdk.gm.c(g, new java.text.ParsePosition(0));
            } catch (java.text.ParseException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                sb.append(g);
                sb.append("' as Date; at path ");
                sb.append(gtVar.s());
                throw new com.facetec.sdk.ev(sb.toString(), e);
            }
        }
    }

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ java.util.Date b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        if (gtVar.f() == com.facetec.sdk.gs.NULL) {
            gtVar.k();
            return null;
        }
        return e(gtVar);
    }
}
