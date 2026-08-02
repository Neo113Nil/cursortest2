package androidx.lifecycle;

import M4.c;
import Sc.InterfaceC4008j;
import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l0 implements c.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M4.c f43339a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f43340b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f43341c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f43342d;

    static final class a extends AbstractC7737t implements Function0<m0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B0 f43343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B0 b02) {
            super(0);
            this.f43343b = b02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final m0 invoke() {
            B0 b02 = this.f43343b;
            Intrinsics.checkNotNullParameter(b02, "<this>");
            return (m0) new z0(b02, new k0()).b(m0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
    }

    public l0(@NotNull M4.c savedStateRegistry, @NotNull B0 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f43339a = savedStateRegistry;
        this.f43342d = Sc.k.b(new a(viewModelStoreOwner));
    }

    public final Bundle a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        Bundle bundle = this.f43341c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f43341c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f43341c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f43341c = null;
        }
        return bundle2;
    }

    public final void b() {
        if (this.f43340b) {
            return;
        }
        Bundle b11 = this.f43339a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f43341c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b11 != null) {
            bundle.putAll(b11);
        }
        this.f43341c = bundle;
        this.f43340b = true;
    }

    @Override // M4.c.b
    @NotNull
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f43341c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((m0) this.f43342d.getValue()).getF43344a().entrySet()) {
            String str = (String) entry.getKey();
            Bundle saveState = ((C5418g0) entry.getValue()).f().saveState();
            if (!Intrinsics.d(saveState, Bundle.EMPTY)) {
                bundle.putBundle(str, saveState);
            }
        }
        this.f43340b = false;
        return bundle;
    }
}
