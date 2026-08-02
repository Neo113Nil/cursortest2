package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fm implements com.facetec.sdk.fb, java.lang.Cloneable {
    public static final com.facetec.sdk.fm c = new com.facetec.sdk.fm();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3571a;
    public double b = -1.0d;
    public int e = 136;
    public boolean d = true;
    public java.util.List<com.facetec.sdk.ef> g = java.util.Collections.emptyList();
    public java.util.List<com.facetec.sdk.ef> f = java.util.Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.facetec.sdk.fm clone() {
        try {
            return (com.facetec.sdk.fm) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // com.facetec.sdk.fb
    public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
        boolean a2 = a(gwVar.a());
        boolean z = a2 || e(true);
        boolean z2 = a2 || e(false);
        if (z || z2) {
            return new com.facetec.sdk.fm.AnonymousClass3(z2, z, eoVar, gwVar);
        }
        return null;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facetec.sdk.fm$3, reason: invalid class name */
    final class AnonymousClass3<T> extends com.facetec.sdk.fd<T> {
        public static int b;
        public static int d;

        /* renamed from: a, reason: collision with root package name */
        private com.facetec.sdk.fd<T> f3572a;
        private /* synthetic */ boolean c;
        private /* synthetic */ boolean e;
        private /* synthetic */ com.facetec.sdk.gw f;
        private /* synthetic */ com.facetec.sdk.eo j;

        AnonymousClass3(boolean z, boolean z2, com.facetec.sdk.eo eoVar, com.facetec.sdk.gw gwVar) {
            this.e = z;
            this.c = z2;
            this.j = eoVar;
            this.f = gwVar;
        }

        @Override // com.facetec.sdk.fd
        public final T b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            if (this.e) {
                gtVar.n();
                return null;
            }
            return d().b(gtVar);
        }

        @Override // com.facetec.sdk.fd
        public final void a(com.facetec.sdk.gu guVar, T t) throws java.io.IOException {
            if (this.c) {
                guVar.g();
            } else {
                d().a(guVar, t);
            }
        }

        private com.facetec.sdk.fd<T> d() {
            com.facetec.sdk.fd<T> fdVar = this.f3572a;
            if (fdVar != null) {
                return fdVar;
            }
            com.facetec.sdk.fd<T> e = this.j.e(com.facetec.sdk.fm.this, this.f);
            this.f3572a = e;
            return e;
        }

        public static int b() {
            int i = b;
            b = i + 1;
            if (i % 9710255 != 0) {
                return d;
            }
            int myPid = android.os.Process.myPid();
            d = myPid;
            return myPid;
        }
    }

    public final boolean a(java.lang.Class<?> cls) {
        if (this.b == -1.0d || d((com.facetec.sdk.fh) cls.getAnnotation(com.facetec.sdk.fh.class), (com.facetec.sdk.fe) cls.getAnnotation(com.facetec.sdk.fe.class))) {
            return (!this.d && b(cls)) || e(cls);
        }
        return true;
    }

    public final boolean e(boolean z) {
        java.util.Iterator<com.facetec.sdk.ef> it = (z ? this.g : this.f).iterator();
        while (it.hasNext()) {
            if (it.next().d()) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(java.lang.Class<?> cls) {
        if (java.lang.Enum.class.isAssignableFrom(cls) || c(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean b(java.lang.Class<?> cls) {
        return cls.isMemberClass() && !c(cls);
    }

    private static boolean c(java.lang.Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean d(com.facetec.sdk.fh fhVar, com.facetec.sdk.fe feVar) {
        return c(fhVar) && e(feVar);
    }

    private boolean c(com.facetec.sdk.fh fhVar) {
        if (fhVar != null) {
            return this.b >= fhVar.c();
        }
        return true;
    }

    private boolean e(com.facetec.sdk.fe feVar) {
        if (feVar != null) {
            return this.b < feVar.c();
        }
        return true;
    }
}
