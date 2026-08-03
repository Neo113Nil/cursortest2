package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface o extends com.ironsource.InterfaceC3163m5<java.lang.String> {

    public static final class a implements com.ironsource.mediationsdk.demandOnly.o {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6431a;

        public a(java.lang.String rowAdm) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.f6431a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC3163m5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String a() {
            return this.f6431a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(com.ironsource.Ib<java.lang.String, T> mapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.f6431a);
        }
    }

    <T> T a(com.ironsource.Ib<java.lang.String, T> ib);
}
