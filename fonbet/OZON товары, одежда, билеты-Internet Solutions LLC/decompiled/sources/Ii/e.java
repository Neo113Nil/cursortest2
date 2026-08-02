package Ii;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes10.dex */
public final class e implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f12565a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f12566b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final IconButtonV3View f12567c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f12568d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f12569e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f12570f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f12571g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f12572h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f12573i;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull IconButtonV3View iconButtonV3View, @NonNull RecyclerView recyclerView, @NonNull ButtonV3View buttonV3View2, @NonNull MaterialCardView materialCardView, @NonNull ButtonV3View buttonV3View3, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.f12565a = constraintLayout;
        this.f12566b = buttonV3View;
        this.f12567c = iconButtonV3View;
        this.f12568d = recyclerView;
        this.f12569e = buttonV3View2;
        this.f12570f = materialCardView;
        this.f12571g = buttonV3View3;
        this.f12572h = textAtomV2View;
        this.f12573i = textAtomV2View2;
    }

    @NonNull
    public static e b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gallery, viewGroup, false);
        int i11 = R.id.clear_selected_media_button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.clear_selected_media_button, inflate);
        if (buttonV3View != null) {
            i11 = R.id.closeButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(R.id.closeButton, inflate);
            if (iconButtonV3View != null) {
                i11 = R.id.mediaRecyclerView;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.mediaRecyclerView, inflate);
                if (recyclerView != null) {
                    i11 = R.id.pickAlbumButton;
                    ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(R.id.pickAlbumButton, inflate);
                    if (buttonV3View2 != null) {
                        i11 = R.id.selectionControls;
                        MaterialCardView materialCardView = (MaterialCardView) C2548q.d(R.id.selectionControls, inflate);
                        if (materialCardView != null) {
                            i11 = R.id.submit_selected_media_button;
                            ButtonV3View buttonV3View3 = (ButtonV3View) C2548q.d(R.id.submit_selected_media_button, inflate);
                            if (buttonV3View3 != null) {
                                i11 = R.id.subtitle;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.subtitle, inflate);
                                if (textAtomV2View != null) {
                                    i11 = R.id.title;
                                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.title, inflate);
                                    if (textAtomV2View2 != null) {
                                        i11 = R.id.toolbar;
                                        if (((Toolbar) C2548q.d(R.id.toolbar, inflate)) != null) {
                                            return new e((ConstraintLayout) inflate, buttonV3View, iconButtonV3View, recyclerView, buttonV3View2, materialCardView, buttonV3View3, textAtomV2View, textAtomV2View2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f12565a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f12565a;
    }
}
