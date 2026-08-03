package com.ironsource;

/* loaded from: classes5.dex */
public interface C7 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.ArrayList<com.ironsource.C3360x5> f5652a;
        private boolean b;
        private int c;
        private java.lang.Exception d;

        public a(java.util.ArrayList<com.ironsource.C3360x5> arrayList) {
            this.b = false;
            this.c = -1;
            this.f5652a = arrayList;
        }

        public com.ironsource.C7.a a(java.lang.Exception exc) {
            return new com.ironsource.C7.a(this.f5652a, this.c, this.b, exc);
        }

        public java.util.ArrayList<com.ironsource.C3360x5> b() {
            return this.f5652a;
        }

        public boolean c() {
            return this.b;
        }

        public java.lang.String toString() {
            return "EventSendResult{success=" + this.b + ", responseCode=" + this.c + ", exception=" + this.d + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
        }

        public com.ironsource.C7.a a(boolean z) {
            return new com.ironsource.C7.a(this.f5652a, this.c, z, this.d);
        }

        public com.ironsource.C7.a a(int i) {
            return new com.ironsource.C7.a(this.f5652a, i, this.b, this.d);
        }

        public java.lang.String a() {
            if (this.b) {
                return "";
            }
            return "rc=" + this.c + ", ex=" + this.d;
        }

        a(java.util.ArrayList<com.ironsource.C3360x5> arrayList, int i, boolean z, java.lang.Exception exc) {
            this.f5652a = arrayList;
            this.b = z;
            this.d = exc;
            this.c = i;
        }
    }

    void a(com.ironsource.C7.a aVar);
}
