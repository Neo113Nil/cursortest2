package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;

/* loaded from: classes3.dex */
public final class p implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14524a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CheckboxTitleSubtitleCellView f14525b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f14526c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonView f14527d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final UncontainedButtonView f14528e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final CheckboxTitleSubtitleCellView f14529f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14530g;

    private p(@NonNull ConstraintLayout constraintLayout, @NonNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, @NonNull View view, @NonNull ButtonView buttonView, @NonNull UncontainedButtonView uncontainedButtonView, @NonNull CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView2, @NonNull TextAtomV2View textAtomV2View) {
        this.f14524a = constraintLayout;
        this.f14525b = checkboxTitleSubtitleCellView;
        this.f14526c = view;
        this.f14527d = buttonView;
        this.f14528e = uncontainedButtonView;
        this.f14529f = checkboxTitleSubtitleCellView2;
        this.f14530g = textAtomV2View;
    }

    @NonNull
    public static p a(@NonNull View view) {
        int i11 = R.id.adsCheckbox;
        CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView = (CheckboxTitleSubtitleCellView) C2548q.d(R.id.adsCheckbox, view);
        if (checkboxTitleSubtitleCellView != null) {
            i11 = R.id.checkboxesFlow;
            if (((Flow) C2548q.d(R.id.checkboxesFlow, view)) != null) {
                i11 = R.id.checkboxesSeparator;
                View d11 = C2548q.d(R.id.checkboxesSeparator, view);
                if (d11 != null) {
                    i11 = R.id.completeButton;
                    ButtonView buttonView = (ButtonView) C2548q.d(R.id.completeButton, view);
                    if (buttonView != null) {
                        i11 = R.id.logoImageView;
                        if (((AppCompatImageView) C2548q.d(R.id.logoImageView, view)) != null) {
                            i11 = R.id.returnToMainScreenButton;
                            UncontainedButtonView uncontainedButtonView = (UncontainedButtonView) C2548q.d(R.id.returnToMainScreenButton, view);
                            if (uncontainedButtonView != null) {
                                i11 = R.id.termsOfUseCheckbox;
                                CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView2 = (CheckboxTitleSubtitleCellView) C2548q.d(R.id.termsOfUseCheckbox, view);
                                if (checkboxTitleSubtitleCellView2 != null) {
                                    i11 = R.id.titleTextAtomView;
                                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.titleTextAtomView, view);
                                    if (textAtomV2View != null) {
                                        return new p((ConstraintLayout) view, checkboxTitleSubtitleCellView, d11, buttonView, uncontainedButtonView, checkboxTitleSubtitleCellView2, textAtomV2View);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout b() {
        return this.f14524a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14524a;
    }
}
