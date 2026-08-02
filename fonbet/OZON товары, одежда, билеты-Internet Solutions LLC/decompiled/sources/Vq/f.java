package Vq;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ru.ozon.android.messenger.framework.presentation.chatlist.k;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesWidgetViewHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32837c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f32835a = i11;
        this.f32836b = obj;
        this.f32837c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32835a) {
            case 0:
                FilterValuesWidgetViewHolder.addIslandSeparator$lambda$7$lambda$6((CoordinatorLayout) this.f32836b, (FilterValuesWidgetViewHolder) this.f32837c);
                break;
            default:
                k.a((k) this.f32836b, (w) this.f32837c);
                break;
        }
    }
}
