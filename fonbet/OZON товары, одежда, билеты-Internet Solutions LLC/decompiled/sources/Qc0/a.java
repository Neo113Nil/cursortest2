package Qc0;

import android.view.ViewGroup;
import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import com.google.android.gms.wallet.WalletConstants;
import dc0.C6149M;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private NotificationBar f23229a;

    /* renamed from: Qc0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0460a implements NotificationBar.Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.internal.a f23230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f23231b;

        C0460a(com.google.gson.internal.a aVar, a aVar2) {
            this.f23230a = aVar;
            this.f23231b = aVar2;
        }

        @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
        public final void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            Intrinsics.checkNotNullParameter(reason, "reason");
            boolean z11 = reason == NotificationBar.DismissReason.MANUAL;
            com.google.gson.internal.a aVar = this.f23230a;
            if (aVar != null) {
                C6149M.a((C6149M) aVar.f59827a, z11);
            }
            this.f23231b.f23229a = null;
        }

        @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
        public final void onShown(NotificationBar notificationBar) {
            NotificationBar.Callback.DefaultImpls.onShown(this, notificationBar);
        }
    }

    @NotNull
    public static NotificationDTO b(@NotNull String message, @NotNull NotificationDTO.Preset preset, int i11) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(preset, "preset");
        return new NotificationDTO(message, null, 0, null, null, null, Integer.valueOf(i11), null, null, preset, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, null);
    }

    public static void e(a aVar, String message, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        aVar.d(b(message, NotificationDTO.Preset.INFO, 3), viewGroup, null, null);
    }

    public final void c() {
        NotificationBar notificationBar = this.f23229a;
        if (notificationBar != null) {
            notificationBar.dismiss();
        }
        this.f23229a = null;
    }

    public final void d(@NotNull NotificationDTO notificationDto, @NotNull ViewGroup viewGroup, com.google.gson.internal.a aVar, Function1<? super AtomAction, Unit> function1) {
        J a11;
        Intrinsics.checkNotNullParameter(notificationDto, "notificationDto");
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null);
        if (asNotificationLayoutManager$default == null || (a11 = C0.a(viewGroup)) == null) {
            return;
        }
        NotificationBar make = companion.make(asNotificationLayoutManager$default, notificationDto, a11, function1);
        make.addCallback(new C0460a(aVar, this));
        make.show();
        this.f23229a = make;
    }
}
