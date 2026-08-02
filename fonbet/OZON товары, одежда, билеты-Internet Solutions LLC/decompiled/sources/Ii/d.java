package Ii;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f12560a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f12561b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f12562c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f12563d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreviewView f12564e;

    private d(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2, @NonNull PreviewView previewView) {
        this.f12560a = frameLayout;
        this.f12561b = imageView;
        this.f12562c = frameLayout2;
        this.f12563d = imageView2;
        this.f12564e = previewView;
    }

    @NonNull
    public static d b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.camera_preview_gallery_item, viewGroup, false);
        int i11 = R.id.cameraIcon;
        ImageView imageView = (ImageView) C2548q.d(R.id.cameraIcon, inflate);
        if (imageView != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            i11 = R.id.loadingPlaceholderIv;
            ImageView imageView2 = (ImageView) C2548q.d(R.id.loadingPlaceholderIv, inflate);
            if (imageView2 != null) {
                i11 = R.id.previewView;
                PreviewView previewView = (PreviewView) C2548q.d(R.id.previewView, inflate);
                if (previewView != null) {
                    return new d(frameLayout, imageView, frameLayout, imageView2, previewView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f12560a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f12560a;
    }
}
