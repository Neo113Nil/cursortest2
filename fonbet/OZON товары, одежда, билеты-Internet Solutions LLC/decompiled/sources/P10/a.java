package P10;

import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.ui.widget.k<l20.c> f21604a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f21605b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f21606c;

    a(ru.ozon.composer.ui.widget.k<l20.c> kVar, b bVar, int i11) {
        this.f21604a = kVar;
        this.f21605b = bVar;
        this.f21606c = i11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        this.f21604a.setLifecycleState(AbstractC5434v.b.CREATED);
        List<i> c11 = this.f21605b.c();
        O10.e.a(v11);
        c11.get(O10.d.c(v11)).b().getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v11) {
        d dVar;
        Intrinsics.checkNotNullParameter(v11, "v");
        dVar = this.f21605b.f21609c;
        int i11 = this.f21606c;
        ru.ozon.composer.ui.widget.k<l20.c> kVar = this.f21604a;
        dVar.b(i11, kVar);
        kVar.setLifecycleState(AbstractC5434v.b.DESTROYED);
    }
}
