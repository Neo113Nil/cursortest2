package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes3.dex */
public final class B implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f14348a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CellView f14349b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ButtonView f14350c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Group f14351d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final y f14352e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14353f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Group f14354g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14355h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ButtonView f14356i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Flow f14357j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14358k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final CellView f14359l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextFieldCellView f14360m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14361n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextAtomV2View f14362o;

    private B(@NonNull View view, @NonNull CellView cellView, @NonNull ButtonView buttonView, @NonNull Group group, @NonNull y yVar, @NonNull TextAtomV2View textAtomV2View, @NonNull Group group2, @NonNull TextAtomV2View textAtomV2View2, @NonNull ButtonView buttonView2, @NonNull Flow flow, @NonNull LinearLayout linearLayout, @NonNull CellView cellView2, @NonNull TextFieldCellView textFieldCellView, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4) {
        this.f14348a = view;
        this.f14349b = cellView;
        this.f14350c = buttonView;
        this.f14351d = group;
        this.f14352e = yVar;
        this.f14353f = textAtomV2View;
        this.f14354g = group2;
        this.f14355h = textAtomV2View2;
        this.f14356i = buttonView2;
        this.f14357j = flow;
        this.f14358k = linearLayout;
        this.f14359l = cellView2;
        this.f14360m = textFieldCellView;
        this.f14361n = textAtomV2View3;
        this.f14362o = textAtomV2View4;
    }

    @NonNull
    public static B a(@NonNull View view) {
        int i11 = R.id.callInCell;
        CellView cellView = (CellView) C2548q.d(R.id.callInCell, view);
        if (cellView != null) {
            i11 = R.id.continueButton;
            ButtonView buttonView = (ButtonView) C2548q.d(R.id.continueButton, view);
            if (buttonView != null) {
                i11 = R.id.defaultPageTypeGroup;
                Group group = (Group) C2548q.d(R.id.defaultPageTypeGroup, view);
                if (group != null) {
                    i11 = R.id.disclaimer;
                    View d11 = C2548q.d(R.id.disclaimer, view);
                    if (d11 != null) {
                        y a11 = y.a(d11);
                        i11 = R.id.flashCallAccentTextAtomV2;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(R.id.flashCallAccentTextAtomV2, view);
                        if (textAtomV2View != null) {
                            i11 = R.id.flashCallGroup;
                            Group group2 = (Group) C2548q.d(R.id.flashCallGroup, view);
                            if (group2 != null) {
                                i11 = R.id.flashCallHintTextAtomV2;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(R.id.flashCallHintTextAtomV2, view);
                                if (textAtomV2View2 != null) {
                                    i11 = R.id.getNewCodeButton;
                                    ButtonView buttonView2 = (ButtonView) C2548q.d(R.id.getNewCodeButton, view);
                                    if (buttonView2 != null) {
                                        i11 = R.id.hintButtonsFlow;
                                        Flow flow = (Flow) C2548q.d(R.id.hintButtonsFlow, view);
                                        if (flow != null) {
                                            i11 = R.id.hintButtonsLinearLayout;
                                            LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.hintButtonsLinearLayout, view);
                                            if (linearLayout != null) {
                                                i11 = R.id.logoImageView;
                                                if (((ImageView) C2548q.d(R.id.logoImageView, view)) != null) {
                                                    i11 = R.id.messengerOtpCell;
                                                    CellView cellView2 = (CellView) C2548q.d(R.id.messengerOtpCell, view);
                                                    if (cellView2 != null) {
                                                        i11 = R.id.otpCallInCellsBottomBarrier;
                                                        if (((Barrier) C2548q.d(R.id.otpCallInCellsBottomBarrier, view)) != null) {
                                                            i11 = R.id.otpTextField;
                                                            TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(R.id.otpTextField, view);
                                                            if (textFieldCellView != null) {
                                                                i11 = R.id.subtitleTextAtomV2;
                                                                TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(R.id.subtitleTextAtomV2, view);
                                                                if (textAtomV2View3 != null) {
                                                                    i11 = R.id.titleTextAtomV2;
                                                                    TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(R.id.titleTextAtomV2, view);
                                                                    if (textAtomV2View4 != null) {
                                                                        return new B(view, cellView, buttonView, group, a11, textAtomV2View, group2, textAtomV2View2, buttonView2, flow, linearLayout, cellView2, textFieldCellView, textAtomV2View3, textAtomV2View4);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14348a;
    }
}
