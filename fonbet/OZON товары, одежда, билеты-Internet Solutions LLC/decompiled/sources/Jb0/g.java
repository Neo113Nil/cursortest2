package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.fintech.presentation.camera.views.DocFrameView;
import ru.ozon.id.nativeauth.fintech.presentation.camera.views.SelfieDocFrameView;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes3.dex */
public final class g implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f14416a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14417b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14418c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final DocFrameView f14419d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ErrorView f14420e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f14421f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f14422g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14423h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f14424i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageButton f14425j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f14426k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final PreviewView f14427l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final FrameLayout f14428m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14429n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14430o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final SelfieDocFrameView f14431p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final ButtonV3View f14432q;

    private g(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull DocFrameView docFrameView, @NonNull ErrorView errorView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView2, @NonNull ImageButton imageButton, @NonNull ImageView imageView3, @NonNull PreviewView previewView, @NonNull FrameLayout frameLayout, @NonNull ButtonV3View buttonV3View, @NonNull AppCompatTextView appCompatTextView3, @NonNull SelfieDocFrameView selfieDocFrameView, @NonNull ButtonV3View buttonV3View2) {
        this.f14416a = constraintLayout;
        this.f14417b = appCompatTextView;
        this.f14418c = appCompatTextView2;
        this.f14419d = docFrameView;
        this.f14420e = errorView;
        this.f14421f = constraintLayout2;
        this.f14422g = imageView;
        this.f14423h = appCompatImageView;
        this.f14424i = imageView2;
        this.f14425j = imageButton;
        this.f14426k = imageView3;
        this.f14427l = previewView;
        this.f14428m = frameLayout;
        this.f14429n = buttonV3View;
        this.f14430o = appCompatTextView3;
        this.f14431p = selfieDocFrameView;
        this.f14432q = buttonV3View2;
    }

    @NonNull
    public static g b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fintech_recovery_camera, viewGroup, false);
        int i11 = R.id.cameraUploadText;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.cameraUploadText, inflate);
        if (appCompatTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i11 = R.id.crossAppLoaderView;
            if (((ProgressBar) C2548q.d(R.id.crossAppLoaderView, inflate)) != null) {
                i11 = R.id.disclaimer;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.disclaimer, inflate);
                if (appCompatTextView2 != null) {
                    i11 = R.id.docFrame;
                    DocFrameView docFrameView = (DocFrameView) C2548q.d(R.id.docFrame, inflate);
                    if (docFrameView != null) {
                        i11 = R.id.errorView;
                        ErrorView errorView = (ErrorView) C2548q.d(R.id.errorView, inflate);
                        if (errorView != null) {
                            i11 = R.id.fit_holder;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C2548q.d(R.id.fit_holder, inflate);
                            if (constraintLayout2 != null) {
                                i11 = R.id.iv_change_camera;
                                ImageView imageView = (ImageView) C2548q.d(R.id.iv_change_camera, inflate);
                                if (imageView != null) {
                                    i11 = R.id.iv_close;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.iv_close, inflate);
                                    if (appCompatImageView != null) {
                                        i11 = R.id.iv_flash;
                                        ImageView imageView2 = (ImageView) C2548q.d(R.id.iv_flash, inflate);
                                        if (imageView2 != null) {
                                            i11 = R.id.iv_shutter;
                                            ImageButton imageButton = (ImageButton) C2548q.d(R.id.iv_shutter, inflate);
                                            if (imageButton != null) {
                                                i11 = R.id.photo;
                                                ImageView imageView3 = (ImageView) C2548q.d(R.id.photo, inflate);
                                                if (imageView3 != null) {
                                                    i11 = R.id.previewView;
                                                    PreviewView previewView = (PreviewView) C2548q.d(R.id.previewView, inflate);
                                                    if (previewView != null) {
                                                        i11 = R.id.progress;
                                                        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.progress, inflate);
                                                        if (frameLayout != null) {
                                                            i11 = R.id.retakeButton;
                                                            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(R.id.retakeButton, inflate);
                                                            if (buttonV3View != null) {
                                                                i11 = R.id.selfieDisclaimer;
                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(R.id.selfieDisclaimer, inflate);
                                                                if (appCompatTextView3 != null) {
                                                                    i11 = R.id.selfieDocFrame;
                                                                    SelfieDocFrameView selfieDocFrameView = (SelfieDocFrameView) C2548q.d(R.id.selfieDocFrame, inflate);
                                                                    if (selfieDocFrameView != null) {
                                                                        i11 = R.id.submitButton;
                                                                        ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(R.id.submitButton, inflate);
                                                                        if (buttonV3View2 != null) {
                                                                            return new g(constraintLayout, appCompatTextView, appCompatTextView2, docFrameView, errorView, constraintLayout2, imageView, appCompatImageView, imageView2, imageButton, imageView3, previewView, frameLayout, buttonV3View, appCompatTextView3, selfieDocFrameView, buttonV3View2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f14416a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14416a;
    }
}
