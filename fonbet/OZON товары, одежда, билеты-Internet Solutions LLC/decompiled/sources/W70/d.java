package W70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f33305a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f33306b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f33307c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f33308d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final PermissionsScreenStateView f33309e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f33310f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f33311g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ShimmerFrameLayout f33312h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f33313i;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PermissionsScreenStateView permissionsScreenStateView, @NonNull ScreenStateView screenStateView, @NonNull FinLargeButtonView finLargeButtonView, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull FinToolbarView finToolbarView) {
        this.f33305a = constraintLayout;
        this.f33306b = imageView;
        this.f33307c = textView;
        this.f33308d = textView2;
        this.f33309e = permissionsScreenStateView;
        this.f33310f = screenStateView;
        this.f33311g = finLargeButtonView;
        this.f33312h = shimmerFrameLayout;
        this.f33313i = finToolbarView;
    }

    @NonNull
    public static d b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.sharing_preview_fragment, viewGroup, false);
        int i11 = R.id.file_image;
        ImageView imageView = (ImageView) C2548q.d(R.id.file_image, inflate);
        if (imageView != null) {
            i11 = R.id.file_name_title;
            TextView textView = (TextView) C2548q.d(R.id.file_name_title, inflate);
            if (textView != null) {
                i11 = R.id.file_type_subtitle;
                TextView textView2 = (TextView) C2548q.d(R.id.file_type_subtitle, inflate);
                if (textView2 != null) {
                    i11 = R.id.permissions_screen_state;
                    PermissionsScreenStateView permissionsScreenStateView = (PermissionsScreenStateView) C2548q.d(R.id.permissions_screen_state, inflate);
                    if (permissionsScreenStateView != null) {
                        i11 = R.id.screen_state;
                        ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, inflate);
                        if (screenStateView != null) {
                            i11 = R.id.share_btn;
                            FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.share_btn, inflate);
                            if (finLargeButtonView != null) {
                                i11 = R.id.shimmer_placeholder;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C2548q.d(R.id.shimmer_placeholder, inflate);
                                if (shimmerFrameLayout != null) {
                                    i11 = R.id.web_view_toolbar;
                                    FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.web_view_toolbar, inflate);
                                    if (finToolbarView != null) {
                                        return new d((ConstraintLayout) inflate, imageView, textView, textView2, permissionsScreenStateView, screenStateView, finLargeButtonView, shimmerFrameLayout, finToolbarView);
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
        return this.f33305a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f33305a;
    }
}
