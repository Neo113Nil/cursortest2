package Uc0;

import Db0.g;
import android.app.Activity;
import android.content.IntentFilter;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.i;

/* loaded from: classes3.dex */
public final class c implements DefaultLifecycleObserver {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final g f27530c = new g(19, 9, 0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f27531a;

    /* renamed from: b, reason: collision with root package name */
    private Uc0.a f27532b;

    static final class a extends AbstractC7737t implements Function1<Void, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f27533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f27534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar, c cVar) {
            super(1);
            this.f27533b = rVar;
            this.f27534c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Void r42) {
            c cVar = this.f27534c;
            Uc0.a aVar = new Uc0.a(new b(cVar));
            cVar.f27532b = aVar;
            androidx.core.content.a.registerReceiver(this.f27533b, aVar, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), 2);
            return Unit.f71690a;
        }
    }

    public c(Function1 function1) {
        this.f27531a = function1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull J owner) {
        g b11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m componentCallbacksC5392m = owner instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) owner : null;
        r context = componentCallbacksC5392m != null ? componentCallbacksC5392m.getActivity() : null;
        if (context == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
            if (googleApiAvailability.isGooglePlayServicesAvailable(context) != 0 || (b11 = i.b(context)) == null || b11.a(f27530c) < 0) {
                return;
            }
            SmsRetriever.getClient((Activity) context).startSmsRetriever().addOnSuccessListener(new Gy.b(new a(context, this), 3)).addOnFailureListener(new Fj.c());
        } catch (Exception unused) {
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J owner) {
        Uc0.a aVar;
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().e(this);
        ComponentCallbacksC5392m componentCallbacksC5392m = owner instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) owner : null;
        r context = componentCallbacksC5392m != null ? componentCallbacksC5392m.getActivity() : null;
        if (context == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
            if (googleApiAvailability.isGooglePlayServicesAvailable(context) != 0 || (aVar = this.f27532b) == null) {
                return;
            }
            context.unregisterReceiver(aVar);
            this.f27532b = null;
        } catch (Exception unused) {
        }
    }
}
