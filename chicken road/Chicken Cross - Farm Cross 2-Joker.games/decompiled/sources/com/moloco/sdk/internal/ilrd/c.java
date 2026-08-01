package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.IlrdRequest;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public interface c {

    public interface a {

        /* renamed from: com.moloco.sdk.internal.ilrd.c$a$a, reason: collision with other inner class name */
        public static final class C1475a implements a {
            public static final int b = 0;

            /* renamed from: a, reason: collision with root package name */
            public final IlrdRequest.LevelPlayImpression f10492a;

            public C1475a(IlrdRequest.LevelPlayImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                this.f10492a = impression;
            }

            public final IlrdRequest.LevelPlayImpression a() {
                return this.f10492a;
            }

            public final IlrdRequest.LevelPlayImpression b() {
                return this.f10492a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1475a) && Intrinsics.areEqual(this.f10492a, ((C1475a) obj).f10492a);
            }

            public int hashCode() {
                return this.f10492a.hashCode();
            }

            public String toString() {
                return "LevelPlay(impression=" + this.f10492a + ')';
            }

            public final C1475a a(IlrdRequest.LevelPlayImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                return new C1475a(impression);
            }

            public static /* synthetic */ C1475a a(C1475a c1475a, IlrdRequest.LevelPlayImpression levelPlayImpression, int i, Object obj) {
                if ((i & 1) != 0) {
                    levelPlayImpression = c1475a.f10492a;
                }
                return c1475a.a(levelPlayImpression);
            }
        }

        public static final class b implements a {
            public static final int b = 0;

            /* renamed from: a, reason: collision with root package name */
            public final IlrdRequest.MaxImpression f10493a;

            public b(IlrdRequest.MaxImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                this.f10493a = impression;
            }

            public final IlrdRequest.MaxImpression a() {
                return this.f10493a;
            }

            public final IlrdRequest.MaxImpression b() {
                return this.f10493a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f10493a, ((b) obj).f10493a);
            }

            public int hashCode() {
                return this.f10493a.hashCode();
            }

            public String toString() {
                return "Max(impression=" + this.f10493a + ')';
            }

            public final b a(IlrdRequest.MaxImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                return new b(impression);
            }

            public static /* synthetic */ b a(b bVar, IlrdRequest.MaxImpression maxImpression, int i, Object obj) {
                if ((i & 1) != 0) {
                    maxImpression = bVar.f10493a;
                }
                return bVar.a(maxImpression);
            }
        }
    }

    com.moloco.sdk.internal.ilrd.model.a a();

    Object b();

    SharedFlow<a> c();

    StateFlow<g> getState();
}
