package E30;

import E30.h;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.z0;
import g30.InterfaceC6618a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\"\u0010+\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\n\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020'8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b0\u0010*R\u0014\u00102\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\n¨\u00065"}, d2 = {"LE30/c;", "Landroidx/fragment/app/m;", "LE30/h;", "<init>", "()V", "Landroid/os/Bundle;", "provideOrGenerateArguments", "()Landroid/os/Bundle;", "", "generateAndPutUniqueId", "()Ljava/lang/String;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/LinearLayout;", "provideFragmentBottom", "()Landroid/widget/LinearLayout;", "provideFragmentTop", "provideWindowBottom", "provideWindowTop", "Landroidx/lifecycle/z0$b;", "factory", "Landroidx/lifecycle/z0$b;", "getFactory", "()Landroidx/lifecycle/z0$b;", "setFactory", "(Landroidx/lifecycle/z0$b;)V", "Lg30/a;", "analyticsInteractor", "Lg30/a;", "getAnalyticsInteractor", "()Lg30/a;", "setAnalyticsInteractor", "(Lg30/a;)V", "", "isAuthFlow", "Z", "()Z", "uniqueUuid", "Ljava/lang/String;", "getUniqueUuid", "setUniqueUuid", "(Ljava/lang/String;)V", "isNeedSendOnCreateAnalytic", "getFragmentName", "fragmentName", "Companion", "a", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c extends ComponentCallbacksC5392m implements h {

    @NotNull
    public static final String UNIQUE_UUID = "UNIQUE_UUID";
    public InterfaceC6618a analyticsInteractor;
    public z0.b factory;
    private final boolean isAuthFlow;

    @NotNull
    private String uniqueUuid = "";
    private final boolean isNeedSendOnCreateAnalytic = true;

    private final String generateAndPutUniqueId() {
        String b11 = P4.f.b("toString(...)");
        Bundle provideOrGenerateArguments = provideOrGenerateArguments();
        if (provideOrGenerateArguments != null) {
            provideOrGenerateArguments.putString(UNIQUE_UUID, b11);
        }
        return b11;
    }

    private final Bundle provideOrGenerateArguments() {
        if (getArguments() == null && !isStateSaved()) {
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

    @NotNull
    public final z0.b getFactory() {
        z0.b bVar = this.factory;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("factory");
        throw null;
    }

    @NotNull
    /* renamed from: getFragmentName */
    public abstract String getF95676e();

    @NotNull
    public String getUniqueUuid() {
        return this.uniqueUuid;
    }

    /* renamed from: isAuthFlow, reason: from getter */
    public boolean getIsAuthFlow() {
        return this.isAuthFlow;
    }

    /* renamed from: isNeedSendOnCreateAnalytic, reason: from getter */
    public boolean getIsNeedSendOnCreateAnalytic() {
        return this.isNeedSendOnCreateAnalytic;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        String generateAndPutUniqueId;
        Bundle provideOrGenerateArguments = provideOrGenerateArguments();
        if (provideOrGenerateArguments == null || (generateAndPutUniqueId = provideOrGenerateArguments.getString(UNIQUE_UUID)) == null) {
            generateAndPutUniqueId = generateAndPutUniqueId();
        }
        setUniqueUuid(generateAndPutUniqueId);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (getIsNeedSendOnCreateAnalytic()) {
            getAnalyticsInteractor().a2(getF95676e(), getIsAuthFlow());
        }
        super.onViewCreated(view, savedInstanceState);
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
        r activity = getActivity();
        return h.a.c(activity != null ? activity.getWindow() : null);
    }

    @Override // E30.h
    public LinearLayout provideWindowTop() {
        r activity = getActivity();
        return h.a.e(activity != null ? activity.getWindow() : null);
    }

    public final void setAnalyticsInteractor(@NotNull InterfaceC6618a interfaceC6618a) {
        Intrinsics.checkNotNullParameter(interfaceC6618a, "<set-?>");
        this.analyticsInteractor = interfaceC6618a;
    }

    public final void setFactory(@NotNull z0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.factory = bVar;
    }

    public void setUniqueUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uniqueUuid = str;
    }
}
