package Lw;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.originalText.f;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;
import ru.ozon.app.android.messenger.databinding.MBlockOriginalTextBinding;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4OnBoardingButtonVH;

/* renamed from: Lw.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3600c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17180d;

    public /* synthetic */ ViewOnClickListenerC3600c(Object obj, Object obj2, Object obj3, int i11) {
        this.f17177a = i11;
        this.f17178b = obj;
        this.f17179c = obj2;
        this.f17180d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17177a) {
            case 0:
                WiseBeakViewHolder.bind$lambda$2$lambda$1((FrameLayout) this.f17178b, (WiseBeakViewHolder) this.f17179c, (WiseSkuScrollVO.BeakVO) this.f17180d, view);
                break;
            case 1:
                GalleryV4OnBoardingButtonVH.bind$lambda$3$lambda$2((Function1) this.f17178b, (GalleryV4VO.Button) this.f17179c, (GalleryV4OnBoardingButtonVH) this.f17180d, view);
                break;
            default:
                ru.ozon.android.messenger.blocks.originalText.c.b((ru.ozon.android.messenger.blocks.originalText.c) this.f17178b, (MBlockOriginalTextBinding) this.f17179c, (f) this.f17180d);
                break;
        }
    }
}
