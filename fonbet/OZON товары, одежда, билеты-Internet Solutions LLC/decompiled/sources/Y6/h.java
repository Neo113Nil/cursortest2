package Y6;

import S6.r;
import a7.b;
import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.AbstractServiceC5929j;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes9.dex */
public final /* synthetic */ class h implements b.a, OnCompleteListener, D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f34665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34666b;

    public /* synthetic */ h(Object obj, Object obj2) {
        this.f34665a = obj;
        this.f34666b = obj2;
    }

    @Override // a7.b.a
    public Object execute() {
        Iterable w02;
        w02 = ((m) this.f34665a).f34680c.w0((r) this.f34666b);
        return w02;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        return FintechWebViewFragmentBase.w((ConstraintLayout) this.f34665a, (FintechWebViewFragmentBase) this.f34666b, view, c5353y0);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((AbstractServiceC5929j) this.f34665a).lambda$onStartCommand$1((Intent) this.f34666b, task);
    }
}
