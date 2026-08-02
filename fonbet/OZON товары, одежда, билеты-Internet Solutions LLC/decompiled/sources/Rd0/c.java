package Rd0;

import Ae.M0;
import Qd0.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ g f25031a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f25032b;

    public static final class a extends Yd0.b {
        a() {
        }

        @Override // Yd0.b
        public final M0<Ud0.a> a() {
            Ud0.c c11;
            Ud0.b cdnChooserInternal$ozon_limb_release = c.this.f25031a.e().getCdnChooserInternal$ozon_limb_release();
            if (cdnChooserInternal$ozon_limb_release == null || (c11 = cdnChooserInternal$ozon_limb_release.c()) == null) {
                return null;
            }
            return c11.a();
        }

        @Override // Yd0.b
        public final He.g b() {
            Ud0.c c11;
            Ud0.b cdnChooserInternal$ozon_limb_release = c.this.f25031a.e().getCdnChooserInternal$ozon_limb_release();
            if (cdnChooserInternal$ozon_limb_release == null || (c11 = cdnChooserInternal$ozon_limb_release.c()) == null) {
                return null;
            }
            return c11.b();
        }
    }

    public c(@NotNull g context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.f25031a = context_receiver_0;
        this.f25032b = new a();
    }

    @NotNull
    public final a b() {
        return this.f25032b;
    }
}
