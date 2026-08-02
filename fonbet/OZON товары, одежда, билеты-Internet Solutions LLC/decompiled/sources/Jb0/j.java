package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class j implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f14482a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f14483b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f14484c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatEditText f14485d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f14486e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialButton f14487f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialButton f14488g;

    private j(@NonNull FrameLayout frameLayout, @NonNull MaterialButton materialButton, @NonNull View view, @NonNull AppCompatEditText appCompatEditText, @NonNull FrameLayout frameLayout2, @NonNull MaterialButton materialButton2, @NonNull MaterialButton materialButton3) {
        this.f14482a = frameLayout;
        this.f14483b = materialButton;
        this.f14484c = view;
        this.f14485d = appCompatEditText;
        this.f14486e = frameLayout2;
        this.f14487f = materialButton2;
        this.f14488g = materialButton3;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i11 = R.id.clearRootViewButton;
        MaterialButton materialButton = (MaterialButton) C2548q.d(R.id.clearRootViewButton, view);
        if (materialButton != null) {
            i11 = R.id.notificationDebugBlock;
            View d11 = C2548q.d(R.id.notificationDebugBlock, view);
            if (d11 != null) {
                i11 = R.id.notificationDebugBlockTitleTextView;
                if (((AppCompatTextView) C2548q.d(R.id.notificationDebugBlockTitleTextView, view)) != null) {
                    i11 = R.id.notificationJsonEditText;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(R.id.notificationJsonEditText, view);
                    if (appCompatEditText != null) {
                        i11 = R.id.ozonIdDebugNotificationRoot;
                        if (((ConstraintLayout) C2548q.d(R.id.ozonIdDebugNotificationRoot, view)) != null) {
                            i11 = R.id.ozonIdDebugNotifierContainer;
                            FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.ozonIdDebugNotifierContainer, view);
                            if (frameLayout != null) {
                                i11 = R.id.setRootViewButton;
                                MaterialButton materialButton2 = (MaterialButton) C2548q.d(R.id.setRootViewButton, view);
                                if (materialButton2 != null) {
                                    i11 = R.id.showNotificationButton;
                                    MaterialButton materialButton3 = (MaterialButton) C2548q.d(R.id.showNotificationButton, view);
                                    if (materialButton3 != null) {
                                        return new j((FrameLayout) view, materialButton, d11, appCompatEditText, frameLayout, materialButton2, materialButton3);
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
        return this.f14482a;
    }
}
