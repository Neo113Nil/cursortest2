package L30;

import C.g0;
import C.h0;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f16502a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private boolean f16503b;

    /* renamed from: c, reason: collision with root package name */
    private Ca.i f16504c;

    public static void a(Window window, i iVar) {
        window.clearFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
        Ca.i iVar2 = iVar.f16504c;
        if (iVar2 != null) {
            iVar2.invoke(Boolean.FALSE);
        }
    }

    public static void b(Window window, i iVar) {
        window.addFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
        Ca.i iVar2 = iVar.f16504c;
        if (iVar2 != null) {
            iVar2.invoke(Boolean.TRUE);
        }
    }

    public final void c(@NotNull Window window, boolean z11) {
        Intrinsics.checkNotNullParameter(window, "window");
        Handler handler = this.f16502a;
        if (!z11 && !this.f16503b) {
            handler.post(new g0(4, window, this));
            this.f16503b = true;
        } else if (z11 && this.f16503b) {
            handler.post(new h0(5, window, this));
            this.f16503b = false;
        }
    }

    public final void d(Ca.i iVar) {
        this.f16504c = iVar;
    }
}
