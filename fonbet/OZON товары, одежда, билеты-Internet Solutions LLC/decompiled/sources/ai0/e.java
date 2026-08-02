package ai0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f36801a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f36802b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36803c;

    public e(@NotNull View view, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36801a = view;
        this.f36802b = callback;
    }

    public static void a(e eVar) {
        ViewTreeObserver viewTreeObserver = eVar.f36801a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(eVar);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f36803c) {
            return;
        }
        this.f36803c = true;
        this.f36802b.invoke();
        this.f36801a.post(new Runnable() { // from class: ai0.d
            @Override // java.lang.Runnable
            public final void run() {
                e.a(e.this);
            }
        });
    }
}
