package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gf extends com.facetec.sdk.gu {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f3595a;
    private final java.util.List<com.facetec.sdk.es> d;
    private com.facetec.sdk.es e;
    private static final java.io.Writer c = new java.io.Writer() { // from class: com.facetec.sdk.gf.2
        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new java.lang.AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws java.io.IOException {
            throw new java.lang.AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            throw new java.lang.AssertionError();
        }
    };
    private static final com.facetec.sdk.ex b = new com.facetec.sdk.ex(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);

    @Override // com.facetec.sdk.gu, java.io.Flushable
    public final void flush() throws java.io.IOException {
    }

    public gf() {
        super(c);
        this.d = new java.util.ArrayList();
        this.e = com.facetec.sdk.eq.b;
    }

    public final com.facetec.sdk.es c() {
        if (!this.d.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected one JSON element but was ");
            sb.append(this.d);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return this.e;
    }

    private com.facetec.sdk.es i() {
        return this.d.get(r0.size() - 1);
    }

    private void d(com.facetec.sdk.es esVar) {
        if (this.f3595a != null) {
            if (!esVar.i() || j()) {
                ((com.facetec.sdk.ep) i()).b(this.f3595a, esVar);
            }
            this.f3595a = null;
            return;
        }
        if (this.d.isEmpty()) {
            this.e = esVar;
            return;
        }
        com.facetec.sdk.es i = i();
        if (i instanceof com.facetec.sdk.en) {
            ((com.facetec.sdk.en) i).c(esVar);
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu a() throws java.io.IOException {
        com.facetec.sdk.en enVar = new com.facetec.sdk.en();
        d(enVar);
        this.d.add(enVar);
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu b() throws java.io.IOException {
        if (this.d.isEmpty() || this.f3595a != null) {
            throw new java.lang.IllegalStateException();
        }
        if (i() instanceof com.facetec.sdk.en) {
            this.d.remove(r0.size() - 1);
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu e() throws java.io.IOException {
        com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
        d(epVar);
        this.d.add(epVar);
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu d() throws java.io.IOException {
        if (this.d.isEmpty() || this.f3595a != null) {
            throw new java.lang.IllegalStateException();
        }
        if (i() instanceof com.facetec.sdk.ep) {
            this.d.remove(r0.size() - 1);
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu c(java.lang.String str) throws java.io.IOException {
        java.util.Objects.requireNonNull(str, "name == null");
        if (this.d.isEmpty() || this.f3595a != null) {
            throw new java.lang.IllegalStateException();
        }
        if (i() instanceof com.facetec.sdk.ep) {
            this.f3595a = str;
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu d(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return g();
        }
        d(new com.facetec.sdk.ex(str));
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu g() throws java.io.IOException {
        d(com.facetec.sdk.eq.b);
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu b(boolean z) throws java.io.IOException {
        d(new com.facetec.sdk.ex(java.lang.Boolean.valueOf(z)));
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu d(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return g();
        }
        d(new com.facetec.sdk.ex(bool));
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu d(double d) throws java.io.IOException {
        if (!f() && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
            throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(d)));
        }
        d(new com.facetec.sdk.ex(java.lang.Double.valueOf(d)));
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu e(long j) throws java.io.IOException {
        d(new com.facetec.sdk.ex(java.lang.Long.valueOf(j)));
        return this;
    }

    @Override // com.facetec.sdk.gu
    public final com.facetec.sdk.gu e(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return g();
        }
        if (!f()) {
            double doubleValue = number.doubleValue();
            if (java.lang.Double.isNaN(doubleValue) || java.lang.Double.isInfinite(doubleValue)) {
                throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(number)));
            }
        }
        d(new com.facetec.sdk.ex(number));
        return this;
    }

    @Override // com.facetec.sdk.gu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (!this.d.isEmpty()) {
            throw new java.io.IOException("Incomplete document");
        }
        this.d.add(b);
    }
}
