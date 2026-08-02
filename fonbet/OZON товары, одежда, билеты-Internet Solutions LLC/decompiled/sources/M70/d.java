package M70;

import B1.C2548q;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.pinbutton.PinButtonView;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapper;

/* loaded from: classes3.dex */
public final class d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f17557a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f17558b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f17559c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f17560d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17561e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17562f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17563g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17564h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17565i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17566j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17567k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17568l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17569m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17570n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17571o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final PinButtonView f17572p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f17573q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final ImageView f17574r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final ImageView f17575s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final View f17576t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final View f17577u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final PinProgressWrapper f17578v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final TextView f17579w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final View f17580x;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PinButtonView pinButtonView, @NonNull PinButtonView pinButtonView2, @NonNull PinButtonView pinButtonView3, @NonNull PinButtonView pinButtonView4, @NonNull PinButtonView pinButtonView5, @NonNull PinButtonView pinButtonView6, @NonNull PinButtonView pinButtonView7, @NonNull PinButtonView pinButtonView8, @NonNull PinButtonView pinButtonView9, @NonNull PinButtonView pinButtonView10, @NonNull PinButtonView pinButtonView11, @NonNull PinButtonView pinButtonView12, @NonNull TextView textView3, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull View view2, @NonNull PinProgressWrapper pinProgressWrapper, @NonNull TextView textView4, @NonNull View view3) {
        this.f17557a = constraintLayout;
        this.f17558b = imageView;
        this.f17559c = textView;
        this.f17560d = textView2;
        this.f17561e = pinButtonView;
        this.f17562f = pinButtonView2;
        this.f17563g = pinButtonView3;
        this.f17564h = pinButtonView4;
        this.f17565i = pinButtonView5;
        this.f17566j = pinButtonView6;
        this.f17567k = pinButtonView7;
        this.f17568l = pinButtonView8;
        this.f17569m = pinButtonView9;
        this.f17570n = pinButtonView10;
        this.f17571o = pinButtonView11;
        this.f17572p = pinButtonView12;
        this.f17573q = textView3;
        this.f17574r = imageView2;
        this.f17575s = imageView3;
        this.f17576t = view;
        this.f17577u = view2;
        this.f17578v = pinProgressWrapper;
        this.f17579w = textView4;
        this.f17580x = view3;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i11 = R.id.back;
        if (((ImageView) C2548q.d(R.id.back, view)) != null) {
            i11 = R.id.close;
            ImageView imageView = (ImageView) C2548q.d(R.id.close, view);
            if (imageView != null) {
                i11 = R.id.error_title;
                TextView textView = (TextView) C2548q.d(R.id.error_title, view);
                if (textView != null) {
                    i11 = R.id.forget;
                    TextView textView2 = (TextView) C2548q.d(R.id.forget, view);
                    if (textView2 != null) {
                        i11 = R.id.key0;
                        PinButtonView pinButtonView = (PinButtonView) C2548q.d(R.id.key0, view);
                        if (pinButtonView != null) {
                            i11 = R.id.key1;
                            PinButtonView pinButtonView2 = (PinButtonView) C2548q.d(R.id.key1, view);
                            if (pinButtonView2 != null) {
                                i11 = R.id.key2;
                                PinButtonView pinButtonView3 = (PinButtonView) C2548q.d(R.id.key2, view);
                                if (pinButtonView3 != null) {
                                    i11 = R.id.key3;
                                    PinButtonView pinButtonView4 = (PinButtonView) C2548q.d(R.id.key3, view);
                                    if (pinButtonView4 != null) {
                                        i11 = R.id.key4;
                                        PinButtonView pinButtonView5 = (PinButtonView) C2548q.d(R.id.key4, view);
                                        if (pinButtonView5 != null) {
                                            i11 = R.id.key5;
                                            PinButtonView pinButtonView6 = (PinButtonView) C2548q.d(R.id.key5, view);
                                            if (pinButtonView6 != null) {
                                                i11 = R.id.key6;
                                                PinButtonView pinButtonView7 = (PinButtonView) C2548q.d(R.id.key6, view);
                                                if (pinButtonView7 != null) {
                                                    i11 = R.id.key7;
                                                    PinButtonView pinButtonView8 = (PinButtonView) C2548q.d(R.id.key7, view);
                                                    if (pinButtonView8 != null) {
                                                        i11 = R.id.key8;
                                                        PinButtonView pinButtonView9 = (PinButtonView) C2548q.d(R.id.key8, view);
                                                        if (pinButtonView9 != null) {
                                                            i11 = R.id.key9;
                                                            PinButtonView pinButtonView10 = (PinButtonView) C2548q.d(R.id.key9, view);
                                                            if (pinButtonView10 != null) {
                                                                i11 = R.id.key_back;
                                                                PinButtonView pinButtonView11 = (PinButtonView) C2548q.d(R.id.key_back, view);
                                                                if (pinButtonView11 != null) {
                                                                    i11 = R.id.key_bio;
                                                                    PinButtonView pinButtonView12 = (PinButtonView) C2548q.d(R.id.key_bio, view);
                                                                    if (pinButtonView12 != null) {
                                                                        i11 = R.id.key_left_bottom;
                                                                        if (((FrameLayout) C2548q.d(R.id.key_left_bottom, view)) != null) {
                                                                            i11 = R.id.key_logout;
                                                                            TextView textView3 = (TextView) C2548q.d(R.id.key_logout, view);
                                                                            if (textView3 != null) {
                                                                                i11 = R.id.key_right_bottom;
                                                                                if (((FrameLayout) C2548q.d(R.id.key_right_bottom, view)) != null) {
                                                                                    i11 = R.id.keys;
                                                                                    if (((ConstraintLayout) C2548q.d(R.id.keys, view)) != null) {
                                                                                        i11 = R.id.logo;
                                                                                        ImageView imageView2 = (ImageView) C2548q.d(R.id.logo, view);
                                                                                        if (imageView2 != null) {
                                                                                            i11 = R.id.logo_mini;
                                                                                            ImageView imageView3 = (ImageView) C2548q.d(R.id.logo_mini, view);
                                                                                            if (imageView3 != null) {
                                                                                                i11 = R.id.middle_guideline;
                                                                                                View d11 = C2548q.d(R.id.middle_guideline, view);
                                                                                                if (d11 != null) {
                                                                                                    i11 = R.id.native_pinpad_marker;
                                                                                                    View d12 = C2548q.d(R.id.native_pinpad_marker, view);
                                                                                                    if (d12 != null) {
                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                                        i11 = R.id.pins2;
                                                                                                        PinProgressWrapper pinProgressWrapper = (PinProgressWrapper) C2548q.d(R.id.pins2, view);
                                                                                                        if (pinProgressWrapper != null) {
                                                                                                            i11 = R.id.subTitle;
                                                                                                            if (((TextView) C2548q.d(R.id.subTitle, view)) != null) {
                                                                                                                i11 = R.id.title;
                                                                                                                TextView textView4 = (TextView) C2548q.d(R.id.title, view);
                                                                                                                if (textView4 != null) {
                                                                                                                    i11 = R.id.top_container;
                                                                                                                    View d13 = C2548q.d(R.id.top_container, view);
                                                                                                                    if (d13 != null) {
                                                                                                                        return new d(constraintLayout, imageView, textView, textView2, pinButtonView, pinButtonView2, pinButtonView3, pinButtonView4, pinButtonView5, pinButtonView6, pinButtonView7, pinButtonView8, pinButtonView9, pinButtonView10, pinButtonView11, pinButtonView12, textView3, imageView2, imageView3, d11, d12, pinProgressWrapper, textView4, d13);
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
    public final View getRoot() {
        return this.f17557a;
    }
}
