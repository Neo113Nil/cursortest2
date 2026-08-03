package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class cq {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.dz f1516;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.cq.d f1517;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7303(com.ironsource.adqualitysdk.sdk.i.Cif cif, com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar, java.util.List<java.lang.Object> list) {
        com.ironsource.adqualitysdk.sdk.i.cq.d dVar = this.f1517;
        if (dVar != null && !dVar.mo7304(cif)) {
            return false;
        }
        if (this.f1516 == null) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.add(0, cif);
        return this.f1516.m7668(eeVar, clVar, arrayList).m7679();
    }

    public static class e {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.cq f1519 = new com.ironsource.adqualitysdk.sdk.i.cq();

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.cq.e m7308(java.lang.Class cls) {
            this.f1519.f1517 = new com.ironsource.adqualitysdk.sdk.i.cq.c(cls);
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.cq.e m7306(java.lang.Class cls) {
            this.f1519.f1517 = new com.ironsource.adqualitysdk.sdk.i.cq.b(cls);
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.cq.e m7310(java.lang.Class cls) {
            this.f1519.f1517 = new com.ironsource.adqualitysdk.sdk.i.cq.a(cls);
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.cq.e m7309(com.ironsource.adqualitysdk.sdk.i.dz dzVar) {
            this.f1519.f1516 = dzVar;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.cq m7307() {
            return this.f1519;
        }
    }

    static abstract class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private java.lang.Class f1518;

        /* renamed from: ﻛ */
        abstract boolean mo7304(com.ironsource.adqualitysdk.sdk.i.Cif cif);

        d(java.lang.Class cls) {
            this.f1518 = cls;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        final java.lang.Class m7305() {
            return this.f1518;
        }
    }

    static class c extends com.ironsource.adqualitysdk.sdk.i.cq.d {
        c(java.lang.Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* renamed from: ﻛ */
        public final boolean mo7304(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
            return m7305().isAssignableFrom(cif.mo7964().getType());
        }
    }

    static class b extends com.ironsource.adqualitysdk.sdk.i.cq.d {
        b(java.lang.Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* renamed from: ﻛ */
        public final boolean mo7304(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
            return m7305().equals(cif.mo7964().getType());
        }
    }

    static class a extends com.ironsource.adqualitysdk.sdk.i.cq.d {
        a(java.lang.Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* renamed from: ﻛ, reason: contains not printable characters */
        final boolean mo7304(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
            return m7305().isInstance(cif.mo7963());
        }
    }
}
