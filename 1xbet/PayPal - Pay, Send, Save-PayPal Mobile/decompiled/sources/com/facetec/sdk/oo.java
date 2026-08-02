package com.facetec.sdk;

/* loaded from: classes8.dex */
final class oo implements java.io.Closeable {
    static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(com.facetec.sdk.on.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.oo.c f3726a;
    final boolean c;
    private com.facetec.sdk.om.b d;
    final com.facetec.sdk.pr e;

    interface b {
        void a(int i, com.facetec.sdk.pq pqVar);

        void a(com.facetec.sdk.oq oqVar);

        void a(boolean z, int i, java.util.List<com.facetec.sdk.of> list);

        void b(boolean z, int i, com.facetec.sdk.pr prVar, int i2) throws java.io.IOException;

        void c(int i, long j);

        void c(int i, java.util.List<com.facetec.sdk.of> list) throws java.io.IOException;

        void d(int i, com.facetec.sdk.og ogVar);

        void d(boolean z, int i, int i2);
    }

    oo(com.facetec.sdk.pr prVar, boolean z) {
        this.e = prVar;
        this.c = z;
        com.facetec.sdk.oo.c cVar = new com.facetec.sdk.oo.c(prVar);
        this.f3726a = cVar;
        this.d = new com.facetec.sdk.om.b(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(boolean z, com.facetec.sdk.oo.b bVar) throws java.io.IOException {
        try {
            this.e.b(9L);
            int d = d(this.e);
            if (d < 0 || d > 16384) {
                throw com.facetec.sdk.on.a("FRAME_SIZE_ERROR: %s", java.lang.Integer.valueOf(d));
            }
            byte j = this.e.j();
            if (z && j != 4) {
                throw com.facetec.sdk.on.a("Expected a SETTINGS frame but was %s", java.lang.Byte.valueOf(j));
            }
            byte j2 = this.e.j();
            int f = this.e.f() & Integer.MAX_VALUE;
            java.util.logging.Logger logger = b;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine(com.facetec.sdk.on.d(true, f, d, j, j2));
            }
            switch (j) {
                case 0:
                    if (f == 0) {
                        throw com.facetec.sdk.on.a("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new java.lang.Object[0]);
                    }
                    boolean z2 = (j2 & 1) != 0;
                    if ((j2 & 32) != 0) {
                        throw com.facetec.sdk.on.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new java.lang.Object[0]);
                    }
                    short j3 = (j2 & 8) != 0 ? (short) (this.e.j() & 255) : (short) 0;
                    bVar.b(z2, f, this.e, a(d, j2, j3));
                    this.e.g(j3);
                    return true;
                case 1:
                    if (f == 0) {
                        throw com.facetec.sdk.on.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new java.lang.Object[0]);
                    }
                    boolean z3 = (j2 & 1) != 0;
                    short j4 = (j2 & 8) != 0 ? (short) (this.e.j() & 255) : (short) 0;
                    if ((j2 & 32) != 0) {
                        d();
                        d -= 5;
                    }
                    bVar.a(z3, f, d(a(d, j2, j4), j4, j2, f));
                    return true;
                case 2:
                    if (d != 5) {
                        throw com.facetec.sdk.on.a("TYPE_PRIORITY length: %d != 5", java.lang.Integer.valueOf(d));
                    }
                    if (f == 0) {
                        throw com.facetec.sdk.on.a("TYPE_PRIORITY streamId == 0", new java.lang.Object[0]);
                    }
                    d();
                    return true;
                case 3:
                    if (d != 4) {
                        throw com.facetec.sdk.on.a("TYPE_RST_STREAM length: %d != 4", java.lang.Integer.valueOf(d));
                    }
                    if (f == 0) {
                        throw com.facetec.sdk.on.a("TYPE_RST_STREAM streamId == 0", new java.lang.Object[0]);
                    }
                    int f2 = this.e.f();
                    com.facetec.sdk.og a2 = com.facetec.sdk.og.a(f2);
                    if (a2 == null) {
                        throw com.facetec.sdk.on.a("TYPE_RST_STREAM unexpected error code: %d", java.lang.Integer.valueOf(f2));
                    }
                    bVar.d(f, a2);
                    return true;
                case 4:
                    if (f != 0) {
                        throw com.facetec.sdk.on.a("TYPE_SETTINGS streamId != 0", new java.lang.Object[0]);
                    }
                    if ((j2 & 1) == 0) {
                        if (d % 6 != 0) {
                            throw com.facetec.sdk.on.a("TYPE_SETTINGS length %% 6 != 0: %s", java.lang.Integer.valueOf(d));
                        }
                        com.facetec.sdk.oq oqVar = new com.facetec.sdk.oq();
                        for (int i = 0; i < d; i += 6) {
                            int g = this.e.g() & kotlin.UShort.MAX_VALUE;
                            int f3 = this.e.f();
                            if (g != 2) {
                                if (g == 3) {
                                    g = 4;
                                } else if (g == 4) {
                                    if (f3 < 0) {
                                        throw com.facetec.sdk.on.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new java.lang.Object[0]);
                                    }
                                    g = 7;
                                } else if (g == 5 && (f3 < 16384 || f3 > 16777215)) {
                                    throw com.facetec.sdk.on.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(f3));
                                }
                            } else if (f3 != 0 && f3 != 1) {
                                throw com.facetec.sdk.on.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new java.lang.Object[0]);
                            }
                            oqVar.a(g, f3);
                        }
                        bVar.a(oqVar);
                    } else if (d != 0) {
                        throw com.facetec.sdk.on.a("FRAME_SIZE_ERROR ack frame should be empty!", new java.lang.Object[0]);
                    }
                    return true;
                case 5:
                    if (f == 0) {
                        throw com.facetec.sdk.on.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new java.lang.Object[0]);
                    }
                    short j5 = (j2 & 8) != 0 ? (short) (this.e.j() & 255) : (short) 0;
                    bVar.c(this.e.f() & Integer.MAX_VALUE, d(a(d - 4, j2, j5), j5, j2, f));
                    return true;
                case 6:
                    if (d != 8) {
                        throw com.facetec.sdk.on.a("TYPE_PING length != 8: %s", java.lang.Integer.valueOf(d));
                    }
                    if (f != 0) {
                        throw com.facetec.sdk.on.a("TYPE_PING streamId != 0", new java.lang.Object[0]);
                    }
                    bVar.d((j2 & 1) != 0, this.e.f(), this.e.f());
                    return true;
                case 7:
                    if (d < 8) {
                        throw com.facetec.sdk.on.a("TYPE_GOAWAY length < 8: %s", java.lang.Integer.valueOf(d));
                    }
                    if (f != 0) {
                        throw com.facetec.sdk.on.a("TYPE_GOAWAY streamId != 0", new java.lang.Object[0]);
                    }
                    int f4 = this.e.f();
                    int f5 = this.e.f();
                    int i2 = d - 8;
                    if (com.facetec.sdk.og.a(f5) == null) {
                        throw com.facetec.sdk.on.a("TYPE_GOAWAY unexpected error code: %d", java.lang.Integer.valueOf(f5));
                    }
                    com.facetec.sdk.pq pqVar = com.facetec.sdk.pq.b;
                    if (i2 > 0) {
                        pqVar = this.e.a(i2);
                    }
                    bVar.a(f4, pqVar);
                    return true;
                case 8:
                    if (d != 4) {
                        throw com.facetec.sdk.on.a("TYPE_WINDOW_UPDATE length !=4: %s", java.lang.Integer.valueOf(d));
                    }
                    long f6 = this.e.f() & androidx.collection.SieveCacheKt.NodeLinkMask;
                    if (f6 == 0) {
                        throw com.facetec.sdk.on.a("windowSizeIncrement was 0", java.lang.Long.valueOf(f6));
                    }
                    bVar.c(f, f6);
                    return true;
                default:
                    this.e.g(d);
                    return true;
            }
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private java.util.List<com.facetec.sdk.of> d(int i, short s, byte b2, int i2) throws java.io.IOException {
        com.facetec.sdk.oo.c cVar = this.f3726a;
        cVar.d = i;
        cVar.c = i;
        this.f3726a.f3727a = s;
        this.f3726a.b = b2;
        this.f3726a.e = i2;
        this.d.b();
        return this.d.d();
    }

    private void d() throws java.io.IOException {
        this.e.f();
        this.e.j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.e.close();
    }

    static final class c implements com.facetec.sdk.pz {

        /* renamed from: a, reason: collision with root package name */
        short f3727a;
        byte b;
        int c;
        int d;
        int e;
        private final com.facetec.sdk.pr g;

        @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
        }

        c(com.facetec.sdk.pr prVar) {
            this.g = prVar;
        }

        @Override // com.facetec.sdk.pz
        public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            int i;
            int f;
            do {
                int i2 = this.d;
                if (i2 == 0) {
                    this.g.g(this.f3727a);
                    this.f3727a = (short) 0;
                    if ((this.b & 4) != 0) {
                        return -1L;
                    }
                    i = this.e;
                    int d = com.facetec.sdk.oo.d(this.g);
                    this.d = d;
                    this.c = d;
                    byte j2 = this.g.j();
                    this.b = this.g.j();
                    if (com.facetec.sdk.oo.b.isLoggable(java.util.logging.Level.FINE)) {
                        com.facetec.sdk.oo.b.fine(com.facetec.sdk.on.d(true, this.e, this.c, j2, this.b));
                    }
                    f = this.g.f() & Integer.MAX_VALUE;
                    this.e = f;
                    if (j2 != 9) {
                        throw com.facetec.sdk.on.a("%s != TYPE_CONTINUATION", java.lang.Byte.valueOf(j2));
                    }
                } else {
                    long b = this.g.b(pkVar, java.lang.Math.min(j, i2));
                    if (b == -1) {
                        return -1L;
                    }
                    this.d = (int) (this.d - b);
                    return b;
                }
            } while (f == i);
            throw com.facetec.sdk.on.a("TYPE_CONTINUATION streamId changed", new java.lang.Object[0]);
        }

        @Override // com.facetec.sdk.pz
        public final com.facetec.sdk.qe d() {
            return this.g.d();
        }
    }

    static int d(com.facetec.sdk.pr prVar) throws java.io.IOException {
        return (prVar.j() & 255) | ((prVar.j() & 255) << 16) | ((prVar.j() & 255) << 8);
    }

    private static int a(int i, byte b2, short s) throws java.io.IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw com.facetec.sdk.on.a("PROTOCOL_ERROR padding %s > remaining length %s", java.lang.Short.valueOf(s), java.lang.Integer.valueOf(i));
    }
}
