package W70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.github.chrisbanes.photoview.PhotoView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f33296a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final PhotoView f33297b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f33298c;

    private a(@NonNull FrameLayout frameLayout, @NonNull PhotoView photoView, @NonNull ScreenStateView screenStateView) {
        this.f33296a = frameLayout;
        this.f33297b = photoView;
        this.f33298c = screenStateView;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.one_photo_page_fragment, viewGroup, false);
        int i11 = R.id.one_photo_image;
        PhotoView photoView = (PhotoView) C2548q.d(R.id.one_photo_image, inflate);
        if (photoView != null) {
            i11 = R.id.one_photo_screen_state;
            ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.one_photo_screen_state, inflate);
            if (screenStateView != null) {
                return new a((FrameLayout) inflate, photoView, screenStateView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f33296a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f33296a;
    }
}
