package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class ax implements com.google.android.play.integrity.internal.bb {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f3852a = new java.lang.Object();
    private volatile com.google.android.play.integrity.internal.bb b;
    private volatile java.lang.Object c = f3852a;

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final java.lang.Object a() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = f3852a;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.c;
            if (obj == obj3) {
                obj = this.b.a();
                java.lang.Object obj4 = this.c;
                if (obj4 != obj3 && obj4 != obj) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj4);
                    sb.append(" & ");
                    sb.append(obj);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                this.c = obj;
                this.b = null;
            }
        }
        return obj;
    }

    public static com.google.android.play.integrity.internal.bb b(com.google.android.play.integrity.internal.bb bbVar) {
        return bbVar instanceof com.google.android.play.integrity.internal.ax ? bbVar : new com.google.android.play.integrity.internal.ax(bbVar);
    }

    private ax(com.google.android.play.integrity.internal.bb bbVar) {
        this.b = bbVar;
    }
}
