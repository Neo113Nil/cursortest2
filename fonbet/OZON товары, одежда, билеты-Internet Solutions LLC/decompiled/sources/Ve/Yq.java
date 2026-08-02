package Ve;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Yq implements InterfaceC4686uq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30520a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30521b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30522c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30523d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30524e;

    public Yq(Context context, C4248fl featuresHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f30520a = context;
    }

    public final void a(Vp authDataMode) {
        Intrinsics.checkNotNullParameter(authDataMode, "authDataMode");
        int ordinal = authDataMode.ordinal();
        if (ordinal == 0) {
            this.f30521b = false;
            return;
        }
        if (ordinal == 1) {
            this.f30522c = false;
            return;
        }
        if (ordinal == 2) {
            this.f30523d = false;
        } else {
            if (ordinal != 3) {
                return;
            }
            this.f30521b = false;
            this.f30522c = false;
            this.f30523d = false;
        }
    }

    public final void b(boolean z11) {
        SharedPreferences sharedPreferences = this.f30520a.getSharedPreferences("USER_TOGGLE", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("UserBiometricToggleKey", String.valueOf(z11));
        editor.apply();
    }
}
