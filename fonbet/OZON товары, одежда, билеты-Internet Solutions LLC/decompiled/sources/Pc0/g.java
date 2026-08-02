package Pc0;

import Ib0.c;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f22201a = new a();
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f22202a = new b();
    }

    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f22203a = new c();
    }

    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Fb0.c f22204a;

        public d(@NotNull Fb0.c loginResult) {
            Intrinsics.checkNotNullParameter(loginResult, "loginResult");
            this.f22204a = loginResult;
        }

        @NotNull
        public final Fb0.c a() {
            return this.f22204a;
        }
    }

    public static final class e implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c.a f22205a;

        public e(@NotNull c.a otpFlowResult) {
            Intrinsics.checkNotNullParameter(otpFlowResult, "otpFlowResult");
            this.f22205a = otpFlowResult;
        }

        @NotNull
        public final c.a a() {
            return this.f22205a;
        }
    }

    public static final class f implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ComponentCallbacksC5392m f22206a;

        public f(@NotNull ComponentCallbacksC5392m fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f22206a = fragment;
        }

        @NotNull
        public final ComponentCallbacksC5392m a() {
            return this.f22206a;
        }
    }

    /* renamed from: Pc0.g$g, reason: collision with other inner class name */
    public static final class C0440g implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ComponentCallbacksC5392m f22207a;

        public C0440g(@NotNull ComponentCallbacksC5392m fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f22207a = fragment;
        }

        @NotNull
        public final ComponentCallbacksC5392m a() {
            return this.f22207a;
        }
    }

    public static final class h implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final DialogInterfaceOnCancelListenerC5390k f22208a;

        public h(@NotNull DialogInterfaceOnCancelListenerC5390k dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f22208a = dialog;
        }

        @NotNull
        public final DialogInterfaceOnCancelListenerC5390k a() {
            return this.f22208a;
        }
    }
}
