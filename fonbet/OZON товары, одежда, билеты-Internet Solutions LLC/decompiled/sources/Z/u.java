package Z;

import androidx.camera.core.impl.M;
import androidx.core.widget.ContentLoadingProgressBar;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.vh.CreateShoppingListTitleViewHolder;
import ru.ozon.app.android.favorites.feature.databinding.WidgetCreateShoppingListTitleBinding;

/* loaded from: classes8.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35288b;

    public /* synthetic */ u(Object obj, int i11) {
        this.f35287a = i11;
        this.f35288b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35287a) {
            case 0:
                w.a((w) this.f35288b);
                break;
            case 1:
                CreateShoppingListTitleViewHolder.lambda$2$lambda$1((WidgetCreateShoppingListTitleBinding) this.f35288b);
                break;
            case 2:
                ((M.b) this.f35288b).a();
                break;
            default:
                ContentLoadingProgressBar.b((ContentLoadingProgressBar) this.f35288b);
                break;
        }
    }
}
