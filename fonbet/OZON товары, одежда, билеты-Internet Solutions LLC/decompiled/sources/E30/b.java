package E30;

import E30.h;
import H30.u;
import Sc.InterfaceC3999a;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.activity.C;
import androidx.core.view.C5334o0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.lifecycle.z0;
import g30.InterfaceC6618a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b&\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001OB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0004R\"\u0010\u001b\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00106\u001a\u0004\u0018\u0001058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\nR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010>R\u0014\u0010I\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010>R\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"LE30/b;", "Landroidx/fragment/app/k;", "LE30/h;", "<init>", "()V", "Landroid/os/Bundle;", "provideOrGenerateArguments", "()Landroid/os/Bundle;", "", "generateAndPutUniqueId", "()Ljava/lang/String;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/widget/LinearLayout;", "provideFragmentBottom", "()Landroid/widget/LinearLayout;", "provideFragmentTop", "provideWindowBottom", "provideWindowTop", "onStart", "onStop", "onDestroyView", "uniqueUuid", "Ljava/lang/String;", "getUniqueUuid", "setUniqueUuid", "(Ljava/lang/String;)V", "Landroidx/lifecycle/z0$b;", "factory", "Landroidx/lifecycle/z0$b;", "getFactory", "()Landroidx/lifecycle/z0$b;", "setFactory", "(Landroidx/lifecycle/z0$b;)V", "Lg30/a;", "analyticsInteractor", "Lg30/a;", "getAnalyticsInteractor", "()Lg30/a;", "setAnalyticsInteractor", "(Lg30/a;)V", "Landroid/view/View;", "focusedView", "Landroid/view/View;", "getFocusedView", "()Landroid/view/View;", "setFocusedView", "(Landroid/view/View;)V", "", "dialogBackground", "Ljava/lang/Integer;", "getDialogBackground", "()Ljava/lang/Integer;", "", "nightOnStart", "Z", "getNightOnStart", "()Z", "setNightOnStart", "(Z)V", "getFragmentName", "fragmentName", "Landroidx/activity/C;", "getOnBackPressedCallback", "()Landroidx/activity/C;", "onBackPressedCallback", "getLightStatusBar", "lightStatusBar", "isStandaloneIntegration", "", "getDimAmount", "()F", "dimAmount", "Companion", "a", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b extends DialogInterfaceOnCancelListenerC5390k implements h {
    public static final float DIM_0 = 0.0f;
    public static final float DIM_0_6 = 0.6f;
    public InterfaceC6618a analyticsInteractor;
    public z0.b factory;
    private View focusedView;
    private boolean nightOnStart;

    @NotNull
    private String uniqueUuid = "";
    private final Integer dialogBackground = Integer.valueOf(R.drawable.background_semantic_bg_primary);

    /* renamed from: E30.b$b, reason: collision with other inner class name */
    public static final class DialogC0165b extends Dialog {
        DialogC0165b(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.app.Dialog
        @InterfaceC3999a
        public final void onBackPressed() {
            b.this.getOnBackPressedCallback().handleOnBackPressed();
        }
    }

    private final String generateAndPutUniqueId() {
        String b11 = P4.f.b("toString(...)");
        Bundle provideOrGenerateArguments = provideOrGenerateArguments();
        if (provideOrGenerateArguments != null) {
            provideOrGenerateArguments.putString(c.UNIQUE_UUID, b11);
        }
        return b11;
    }

    private final Bundle provideOrGenerateArguments() {
        if (getArguments() == null) {
            setArguments(androidx.core.os.d.a());
        }
        return getArguments();
    }

    @NotNull
    public final InterfaceC6618a getAnalyticsInteractor() {
        InterfaceC6618a interfaceC6618a = this.analyticsInteractor;
        if (interfaceC6618a != null) {
            return interfaceC6618a;
        }
        Intrinsics.n("analyticsInteractor");
        throw null;
    }

    public Integer getDialogBackground() {
        return this.dialogBackground;
    }

    /* renamed from: getDimAmount */
    public abstract float getF96848e();

    @NotNull
    public final z0.b getFactory() {
        z0.b bVar = this.factory;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("factory");
        throw null;
    }

    public final View getFocusedView() {
        return this.focusedView;
    }

    @NotNull
    /* renamed from: getFragmentName */
    public abstract String getF96844a();

    /* renamed from: getLightStatusBar */
    public abstract boolean getF96846c();

    public final boolean getNightOnStart() {
        return this.nightOnStart;
    }

    @NotNull
    public abstract C getOnBackPressedCallback();

    @NotNull
    public String getUniqueUuid() {
        return this.uniqueUuid;
    }

    /* renamed from: isStandaloneIntegration */
    public abstract boolean getF96847d();

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        String generateAndPutUniqueId;
        Bundle provideOrGenerateArguments = provideOrGenerateArguments();
        if (provideOrGenerateArguments == null || (generateAndPutUniqueId = provideOrGenerateArguments.getString(c.UNIQUE_UUID)) == null) {
            generateAndPutUniqueId = generateAndPutUniqueId();
        }
        setUniqueUuid(generateAndPutUniqueId);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        getAnalyticsInteractor().a2(getF96844a(), false);
        L80.a.a("PINPADER_PERF", "onCreateDialog");
        DialogC0165b dialogC0165b = new DialogC0165b(requireContext(), getTheme());
        int i11 = getResources().getConfiguration().uiMode & 48;
        if (i11 == 16) {
            this.nightOnStart = false;
        } else if (i11 == 32) {
            this.nightOnStart = true;
        }
        getAnalyticsInteractor().a2(getF96844a(), false);
        Window window = dialogC0165b.getWindow();
        if (window != null) {
            Integer dialogBackground = getDialogBackground();
            if (dialogBackground != null) {
                window.setBackgroundDrawableResource(dialogBackground.intValue());
            }
            window.setDimAmount(getF96848e());
            C5334o0.a(window, false);
            u.a(window, getF96847d());
            if (getF96846c() && (getResources().getConfiguration().uiMode & 48) == 16) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8208);
            }
        }
        return dialogC0165b;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.focusedView = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        View view = this.focusedView;
        if (view != null) {
            view.requestFocus();
        }
        this.focusedView = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        Window window;
        Dialog dialog = getDialog();
        this.focusedView = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getCurrentFocus();
        super.onStop();
    }

    @Override // E30.h
    public LinearLayout provideFragmentBottom() {
        View view = getView();
        return h.a.b(view instanceof ViewGroup ? (ViewGroup) view : null);
    }

    @Override // E30.h
    public LinearLayout provideFragmentTop() {
        View view = getView();
        return h.a.d(view instanceof ViewGroup ? (ViewGroup) view : null);
    }

    @Override // E30.h
    public LinearLayout provideWindowBottom() {
        Dialog dialog = getDialog();
        return h.a.c(dialog != null ? dialog.getWindow() : null);
    }

    @Override // E30.h
    public LinearLayout provideWindowTop() {
        Dialog dialog = getDialog();
        return h.a.e(dialog != null ? dialog.getWindow() : null);
    }

    public final void setAnalyticsInteractor(@NotNull InterfaceC6618a interfaceC6618a) {
        Intrinsics.checkNotNullParameter(interfaceC6618a, "<set-?>");
        this.analyticsInteractor = interfaceC6618a;
    }

    public final void setFactory(@NotNull z0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.factory = bVar;
    }

    public final void setFocusedView(View view) {
        this.focusedView = view;
    }

    public final void setNightOnStart(boolean z11) {
        this.nightOnStart = z11;
    }

    public void setUniqueUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uniqueUuid = str;
    }
}
