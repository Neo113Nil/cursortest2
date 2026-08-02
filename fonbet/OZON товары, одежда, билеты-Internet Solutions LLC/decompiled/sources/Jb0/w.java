package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.IconButtonView;

/* loaded from: classes3.dex */
public final class w implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f14560a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CheckboxTitleSubtitleCellView f14561b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f14562c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final IconButtonView f14563d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonView f14564e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14565f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CheckboxTitleSubtitleCellView f14566g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14567h;

    private w(@NonNull ViewGroup viewGroup, @NonNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, @NonNull View view, @NonNull IconButtonView iconButtonView, @NonNull ButtonView buttonView, @NonNull TextAtomV2View textAtomV2View, @NonNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView2, @NonNull TextAtomV2View textAtomV2View2) {
        this.f14560a = viewGroup;
        this.f14561b = checkboxTitleSubtitleCellView;
        this.f14562c = view;
        this.f14563d = iconButtonView;
        this.f14564e = buttonView;
        this.f14565f = textAtomV2View;
        this.f14566g = checkboxTitleSubtitleCellView2;
        this.f14567h = textAtomV2View2;
    }

    @NonNull
    public static w a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ozon_id_agreements_sheet_view_dialog_content, viewGroup);
        int i11 = R.id.adsCheckbox;
        CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView = (CheckboxTitleSubtitleCellView) C2548q.d(R.id.adsCheckbox, viewGroup);
        if (checkboxTitleSubtitleCellView != null) {
            i11 = R.id.checkboxesFlow;
            if (((Flow) C2548q.d(R.id.checkboxesFlow, viewGroup)) != null) {
                i11 = R.id.checkboxesSeparator;
                View d11 = C2548q.d(R.id.checkboxesSeparator, viewGroup);
                if (d11 != null) {
                    i11 = R.id.closeButton;
                    IconButtonView iconButtonView = (IconButtonView) C2548q.d(R.id.closeButton, viewGroup);
                    if (iconButtonView != null) {
                        i11 = R.id.completeButton;
                        ButtonView buttonView = (ButtonView) C2548q.d(R.id.completeButton, viewGroup);
                        if (buttonView != null) {
                            i11 = R.id.navBarBarrier;
                            if (((Barrier) C2548q.d(R.id.navBarBarrier, viewGroup)) != null) {
                                i11 = R.id.subtitleTextAtomView;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.subtitleTextAtomView, viewGroup);
                                if (textAtomV2View != null) {
                                    i11 = R.id.termsOfUseCheckbox;
                                    CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView2 = (CheckboxTitleSubtitleCellView) C2548q.d(R.id.termsOfUseCheckbox, viewGroup);
                                    if (checkboxTitleSubtitleCellView2 != null) {
                                        i11 = R.id.titleTextAtomView;
                                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomView, viewGroup);
                                        if (textAtomV2View2 != null) {
                                            return new w(viewGroup, checkboxTitleSubtitleCellView, d11, iconButtonView, buttonView, textAtomV2View, checkboxTitleSubtitleCellView2, textAtomV2View2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14560a;
    }
}
