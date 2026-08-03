package com.ironsource;

/* renamed from: com.ironsource.nb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3187nb<T> {

    /* renamed from: com.ironsource.nb$a */
    public static final class a<T> implements com.ironsource.InterfaceC3187nb<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.mediationsdk.logger.IronSourceError f6497a;

        public a(com.ironsource.mediationsdk.logger.IronSourceError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            this.f6497a = error;
        }

        public final com.ironsource.mediationsdk.logger.IronSourceError a() {
            return this.f6497a;
        }

        public final com.ironsource.mediationsdk.logger.IronSourceError b() {
            return this.f6497a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.InterfaceC3187nb.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6497a, ((com.ironsource.InterfaceC3187nb.a) obj).f6497a);
        }

        public int hashCode() {
            return this.f6497a.hashCode();
        }

        public java.lang.String toString() {
            return "Failure(error=" + this.f6497a + ")";
        }

        public final com.ironsource.InterfaceC3187nb.a<T> a(com.ironsource.mediationsdk.logger.IronSourceError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            return new com.ironsource.InterfaceC3187nb.a<>(error);
        }

        public static /* synthetic */ com.ironsource.InterfaceC3187nb.a a(com.ironsource.InterfaceC3187nb.a aVar, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.f6497a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* renamed from: com.ironsource.nb$b */
    public static final class b<T> implements com.ironsource.InterfaceC3187nb<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f6498a;

        public b(T t) {
            this.f6498a = t;
        }

        public final T a() {
            return this.f6498a;
        }

        public final T b() {
            return this.f6498a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.InterfaceC3187nb.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6498a, ((com.ironsource.InterfaceC3187nb.b) obj).f6498a);
        }

        public int hashCode() {
            T t = this.f6498a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public java.lang.String toString() {
            return "Success(value=" + this.f6498a + ")";
        }

        public final com.ironsource.InterfaceC3187nb.b<T> a(T t) {
            return new com.ironsource.InterfaceC3187nb.b<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.ironsource.InterfaceC3187nb.b a(com.ironsource.InterfaceC3187nb.b bVar, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.f6498a;
            }
            return bVar.a(obj);
        }
    }
}
