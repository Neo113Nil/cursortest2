package A00;

import A00.b;
import L00.g;
import P00.k;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f258a = new a();

    public static final class a implements b {
        @Override // A00.b
        public final void onLoadCanceled(A00.a event, String uuid) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
        }

        @Override // A00.b
        public final void onLoadCompleted(A00.a event, String uuid, k<? extends C7854a> response) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(response, "response");
        }

        @Override // A00.b
        @InterfaceC3999a
        public final void onLoadFailed(A00.a aVar) {
            b.a.a(aVar);
        }

        @Override // A00.b
        public final void onLoadStarted(A00.a event, g request) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(request, "request");
        }

        @Override // A00.b
        public final void onLoadFailed(A00.a aVar, Throwable th2) {
            b.a.b(this, aVar, th2);
        }
    }

    @NotNull
    public static final a a() {
        return f258a;
    }
}
