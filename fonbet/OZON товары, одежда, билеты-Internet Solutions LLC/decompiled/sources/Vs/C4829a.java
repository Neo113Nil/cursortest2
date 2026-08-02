package Vs;

import k20.C7475g;
import ru.ozon.app.android.favorites.buttonStack.di.ButtonStackWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModelImpl;

/* renamed from: Vs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C4829a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32839b;

    public /* synthetic */ C4829a(Object obj, int i11) {
        this.f32838a = i11;
        this.f32839b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        DeleteWishlistViewModel deleteWishlistViewModelProvider$lambda$0;
        ReviewGalleryV2ViewModelImpl reviewGalleryV2ViewModel$lambda$4;
        switch (this.f32838a) {
            case 0:
                deleteWishlistViewModelProvider$lambda$0 = ButtonStackWidgetComponent$Companion$create$1$1.deleteWishlistViewModelProvider$lambda$0((C7475g) this.f32839b);
                return deleteWishlistViewModelProvider$lambda$0;
            default:
                reviewGalleryV2ViewModel$lambda$4 = ReviewGalleryComponent$Companion$create$1$1.reviewGalleryV2ViewModel$lambda$4((ReviewGalleryComponent$Companion$create$1$1) this.f32839b);
                return reviewGalleryV2ViewModel$lambda$4;
        }
    }
}
