package Ql;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.atoms.atom2.AtomImageCarouselAdapter;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5SingleIconButtonBinder;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23795c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f23793a = i11;
        this.f23794b = obj;
        this.f23795c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23793a) {
            case 0:
                AtomImageCarouselAdapter.onCreateViewHolder$lambda$3$lambda$2((AtomImageCarouselAdapter) this.f23794b, (AtomImageCarouselAdapter.ViewHolder) this.f23795c, view);
                break;
            default:
                GalleryV5SingleIconButtonBinder.bind$lambda$0((Function1) this.f23794b, (GalleryV5VO.Button) this.f23795c, view);
                break;
        }
    }
}
