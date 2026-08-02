package O00;

import M00.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0391a f19823a = new C0391a();

        /* renamed from: O00.b$a$a, reason: collision with other inner class name */
        public static final class C0391a implements b {
            @Override // O00.b
            public final <I> d<I> a(M00.a request, Class<I> reponseType) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(reponseType, "reponseType");
                throw new IllegalStateException("ComposerAsyncWidgetsRepository not initialized");
            }
        }

        @NotNull
        public static C0391a a() {
            return f19823a;
        }
    }

    @NotNull
    <I> d<I> a(@NotNull M00.a aVar, @NotNull Class<I> cls);
}
