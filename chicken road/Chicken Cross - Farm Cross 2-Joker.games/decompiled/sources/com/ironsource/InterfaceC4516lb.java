package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4516lb<T> {

    /* renamed from: com.ironsource.lb$a */
    public static final class a<T> implements InterfaceC4516lb<T> {

        /* renamed from: a, reason: collision with root package name */
        private final IronSourceError f8313a;

        public a(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f8313a = error;
        }

        public final IronSourceError a() {
            return this.f8313a;
        }

        public final IronSourceError b() {
            return this.f8313a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f8313a, ((a) obj).f8313a);
        }

        public int hashCode() {
            return this.f8313a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f8313a + ")";
        }

        public final a<T> a(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.f8313a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* renamed from: com.ironsource.lb$b */
    public static final class b<T> implements InterfaceC4516lb<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f8314a;

        public b(T t) {
            this.f8314a = t;
        }

        public final T a() {
            return this.f8314a;
        }

        public final T b() {
            return this.f8314a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f8314a, ((b) obj).f8314a);
        }

        public int hashCode() {
            T t = this.f8314a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f8314a + ")";
        }

        public final b<T> a(T t) {
            return new b<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.f8314a;
            }
            return bVar.a(obj);
        }
    }
}
