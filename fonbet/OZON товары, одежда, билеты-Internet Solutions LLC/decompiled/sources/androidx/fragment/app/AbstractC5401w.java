package androidx.fragment.app;

import Sc.InterfaceC3999a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5401w<H> extends AbstractC5398t {

    /* renamed from: a, reason: collision with root package name */
    private final r f43174a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r f43175b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f43176c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final G f43177d;

    public AbstractC5401w(@NotNull r context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f43174a = context;
        this.f43175b = context;
        this.f43176c = handler;
        this.f43177d = new H();
    }

    public final Activity d() {
        return this.f43174a;
    }

    @NotNull
    public final Context e() {
        return this.f43175b;
    }

    @NotNull
    public final G f() {
        return this.f43177d;
    }

    @NotNull
    public final Handler g() {
        return this.f43176c;
    }

    public abstract void h(@NotNull PrintWriter printWriter, String[] strArr);

    public abstract r i();

    @NotNull
    public abstract LayoutInflater j();

    public abstract boolean k(@NotNull String str);

    public final void l(@NotNull ComponentCallbacksC5392m fragment, @NotNull Intent intent, int i11, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i11 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.startActivity(this.f43175b, intent, bundle);
    }

    @InterfaceC3999a
    public final void m(@NotNull ComponentCallbacksC5392m fragment, @NotNull IntentSender intent, int i11, Intent intent2, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i11 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        r rVar = this.f43174a;
        if (rVar == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.j(rVar, intent, i11, intent2, i12, i13, i14, bundle);
    }

    public abstract void n();
}
