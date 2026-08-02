package bE;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.chat.old.c;
import ru.ozon.android.messenger.blocks.chat.old.e;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5ButtonOnBoardingBinder;

/* renamed from: bE.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class ViewOnClickListenerC5598a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55756d;

    public /* synthetic */ ViewOnClickListenerC5598a(Object obj, Object obj2, Object obj3, int i11) {
        this.f55753a = i11;
        this.f55754b = obj;
        this.f55755c = obj2;
        this.f55756d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f55753a) {
            case 0:
                GalleryV5ButtonOnBoardingBinder.bind$lambda$2$lambda$1((Function1) this.f55754b, (GalleryV5VO.Button) this.f55755c, (GalleryV5ButtonOnBoardingBinder) this.f55756d, view);
                break;
            default:
                e.d((e) this.f55754b, (c) this.f55755c, (p) this.f55756d);
                break;
        }
    }
}
