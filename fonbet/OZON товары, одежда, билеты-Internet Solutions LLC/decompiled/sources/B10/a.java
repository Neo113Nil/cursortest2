package B10;

import B1.C2548q;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f2176a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f2177b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f2178c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final SmallButtonView f2179d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f2180e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialProgressBar f2181f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final SmallButtonView f2182g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f2183h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final SmallButtonView f2184i;

    private a(@NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SmallButtonView smallButtonView, @NonNull TextView textView2, @NonNull MaterialProgressBar materialProgressBar, @NonNull SmallButtonView smallButtonView2, @NonNull LinearLayout linearLayout, @NonNull SmallButtonView smallButtonView3) {
        this.f2176a = view;
        this.f2177b = textView;
        this.f2178c = imageView;
        this.f2179d = smallButtonView;
        this.f2180e = textView2;
        this.f2181f = materialProgressBar;
        this.f2182g = smallButtonView2;
        this.f2183h = linearLayout;
        this.f2184i = smallButtonView3;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = R.id.errorDescTv;
        TextView textView = (TextView) C2548q.d(R.id.errorDescTv, view);
        if (textView != null) {
            i11 = R.id.errorLogoIv;
            ImageView imageView = (ImageView) C2548q.d(R.id.errorLogoIv, view);
            if (imageView != null) {
                i11 = R.id.errorSummaryBtn;
                SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(R.id.errorSummaryBtn, view);
                if (smallButtonView != null) {
                    i11 = R.id.errorTitleTv;
                    TextView textView2 = (TextView) C2548q.d(R.id.errorTitleTv, view);
                    if (textView2 != null) {
                        i11 = R.id.progress;
                        MaterialProgressBar materialProgressBar = (MaterialProgressBar) C2548q.d(R.id.progress, view);
                        if (materialProgressBar != null) {
                            i11 = R.id.screenStateActionBtn;
                            SmallButtonView smallButtonView2 = (SmallButtonView) C2548q.d(R.id.screenStateActionBtn, view);
                            if (smallButtonView2 != null) {
                                i11 = R.id.screenStateBtnList;
                                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.screenStateBtnList, view);
                                if (linearLayout != null) {
                                    i11 = R.id.screenStateSecondaryActionBtn;
                                    SmallButtonView smallButtonView3 = (SmallButtonView) C2548q.d(R.id.screenStateSecondaryActionBtn, view);
                                    if (smallButtonView3 != null) {
                                        return new a(view, textView, imageView, smallButtonView, textView2, materialProgressBar, smallButtonView2, linearLayout, smallButtonView3);
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
        return this.f2176a;
    }
}
