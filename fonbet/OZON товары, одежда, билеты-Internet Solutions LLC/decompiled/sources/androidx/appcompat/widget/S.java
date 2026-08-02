package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f37707a;

    /* renamed from: b, reason: collision with root package name */
    private final View f37708b;

    /* renamed from: c, reason: collision with root package name */
    final androidx.appcompat.view.menu.l f37709c;

    public S(@NonNull View view, @NonNull Context context) {
        this.f37708b = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f37707a = gVar;
        gVar.F(new P(this));
        androidx.appcompat.view.menu.l lVar = new androidx.appcompat.view.menu.l(R.attr.popupMenuStyle, context, view, gVar, false);
        this.f37709c = lVar;
        lVar.g(0);
        lVar.h(new Q(this));
    }

    @NonNull
    public final androidx.appcompat.view.menu.g a() {
        return this.f37707a;
    }

    public final void b() {
        if (!this.f37709c.k()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
