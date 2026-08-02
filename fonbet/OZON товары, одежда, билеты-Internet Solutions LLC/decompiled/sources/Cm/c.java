package Cm;

import M3.j;
import W.o0;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import io.sentry.cache.l;
import io.sentry.protocol.t;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileView;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterVO;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5155c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f5153a = i11;
        this.f5155c = obj;
        this.f5154b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5153a) {
            case 0:
                ProductStarsTileView.updateUserStars$lambda$4$lambda$3$lambda$1((ProductStarsTileView) this.f5155c, (Drawable) this.f5154b);
                break;
            case 1:
                ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileView.updateUserStars$lambda$3((ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileView) this.f5155c, (Drawable) this.f5154b);
                break;
            case 2:
                j.b((j) this.f5155c, (SurfaceTexture) this.f5154b);
                break;
            case 3:
                SuggestionWithFilterViewHolder.bind$lambda$3((SuggestionWithFilterViewHolder) this.f5155c, (SuggestionWithFilterVO) this.f5154b);
                break;
            case 4:
                ((o0) this.f5155c).a((Surface) this.f5154b);
                break;
            default:
                ((l) this.f5155c).K((t) this.f5154b, "replay.json");
                break;
        }
    }
}
