package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class k implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f14489a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f14490b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f14491c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f14492d;

    private k(@NonNull FrameLayout frameLayout, @NonNull MaterialButton materialButton, @NonNull View view, @NonNull RecyclerView recyclerView) {
        this.f14489a = frameLayout;
        this.f14490b = materialButton;
        this.f14491c = view;
        this.f14492d = recyclerView;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i11 = R.id.copyPreferencesButton;
        MaterialButton materialButton = (MaterialButton) C2548q.d(R.id.copyPreferencesButton, view);
        if (materialButton != null) {
            i11 = R.id.ozonIdDebugPreferencesBlock;
            View d11 = C2548q.d(R.id.ozonIdDebugPreferencesBlock, view);
            if (d11 != null) {
                i11 = R.id.ozonIdDebugPreferencesContent;
                if (((ConstraintLayout) C2548q.d(R.id.ozonIdDebugPreferencesContent, view)) != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    int i12 = R.id.preferences;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.preferences, view);
                    if (recyclerView != null) {
                        i12 = R.id.preferencesBlockTitleTextView;
                        if (((AppCompatTextView) C2548q.d(R.id.preferencesBlockTitleTextView, view)) != null) {
                            return new k(frameLayout, materialButton, d11, recyclerView);
                        }
                    }
                    i11 = i12;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14489a;
    }
}
