package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ga<T extends java.util.Date> extends com.facetec.sdk.fd<T> {
    private final com.facetec.sdk.ga.c<T> b;
    private final java.util.List<java.text.DateFormat> d;

    /* synthetic */ ga(com.facetec.sdk.ga.c cVar, int i, int i2, byte b) {
        this(cVar, i, i2);
    }

    /* synthetic */ ga(com.facetec.sdk.ga.c cVar, java.lang.String str, byte b) {
        this(cVar, str);
    }

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
        java.lang.String format;
        java.util.Date date = (java.util.Date) obj;
        if (date == null) {
            guVar.g();
            return;
        }
        java.text.DateFormat dateFormat = this.d.get(0);
        synchronized (this.d) {
            format = dateFormat.format(date);
        }
        guVar.d(format);
    }

    public static abstract class c<T extends java.util.Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.facetec.sdk.ga.c<java.util.Date> f3587a = new com.facetec.sdk.ga.c<java.util.Date>(java.util.Date.class) { // from class: com.facetec.sdk.ga.c.1
            @Override // com.facetec.sdk.ga.c
            protected final java.util.Date b(java.util.Date date) {
                return date;
            }
        };
        private final java.lang.Class<T> c;

        protected abstract T b(java.util.Date date);

        public c(java.lang.Class<T> cls) {
            this.c = cls;
        }

        private final com.facetec.sdk.fb b(com.facetec.sdk.ga<T> gaVar) {
            return com.facetec.sdk.gj.d(this.c, gaVar);
        }

        public final com.facetec.sdk.fb b(java.lang.String str) {
            return b(new com.facetec.sdk.ga<>((com.facetec.sdk.ga.c) this, str, (byte) 0));
        }

        public final com.facetec.sdk.fb b(int i, int i2) {
            return b(new com.facetec.sdk.ga<>(this, i, i2, (byte) 0));
        }
    }

    private ga(com.facetec.sdk.ga.c<T> cVar, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.d = arrayList;
        this.b = (com.facetec.sdk.ga.c) java.util.Objects.requireNonNull(cVar);
        arrayList.add(new java.text.SimpleDateFormat(str, java.util.Locale.US));
        if (java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            return;
        }
        arrayList.add(new java.text.SimpleDateFormat(str));
    }

    private ga(com.facetec.sdk.ga.c<T> cVar, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.d = arrayList;
        this.b = (com.facetec.sdk.ga.c) java.util.Objects.requireNonNull(cVar);
        arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2));
        }
        if (com.facetec.sdk.fj.c()) {
            arrayList.add(com.facetec.sdk.fq.b(i, i2));
        }
    }

    private java.util.Date a(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        java.lang.String g = gtVar.g();
        synchronized (this.d) {
            java.util.Iterator<java.text.DateFormat> it = this.d.iterator();
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

    public final java.lang.String toString() {
        java.text.DateFormat dateFormat = this.d.get(0);
        if (dateFormat instanceof java.text.SimpleDateFormat) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((java.text.SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        if (gtVar.f() == com.facetec.sdk.gs.NULL) {
            gtVar.k();
            return null;
        }
        return this.b.b(a(gtVar));
    }
}
