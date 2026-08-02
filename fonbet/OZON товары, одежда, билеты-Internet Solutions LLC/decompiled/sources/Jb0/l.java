package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class l implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f14493a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14494b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14495c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f14496d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final MaterialButton f14497e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f14498f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14499g;

    private l(@NonNull NestedScrollView nestedScrollView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull View view, @NonNull AppCompatTextView appCompatTextView3) {
        this.f14493a = nestedScrollView;
        this.f14494b = appCompatTextView;
        this.f14495c = appCompatTextView2;
        this.f14496d = materialButton;
        this.f14497e = materialButton2;
        this.f14498f = view;
        this.f14499g = appCompatTextView3;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i11 = R.id.accountDataKeysTitleTextView;
        if (((AppCompatTextView) C2548q.d(R.id.accountDataKeysTitleTextView, view)) != null) {
            i11 = R.id.accountDataKeysValueTextView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.accountDataKeysValueTextView, view);
            if (appCompatTextView != null) {
                i11 = R.id.accountDataTitleTextView;
                if (((AppCompatTextView) C2548q.d(R.id.accountDataTitleTextView, view)) != null) {
                    i11 = R.id.accountDataValueTextView;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.accountDataValueTextView, view);
                    if (appCompatTextView2 != null) {
                        i11 = R.id.copyAccountDataButton;
                        MaterialButton materialButton = (MaterialButton) C2548q.d(R.id.copyAccountDataButton, view);
                        if (materialButton != null) {
                            i11 = R.id.copyAccountDataKeysButton;
                            MaterialButton materialButton2 = (MaterialButton) C2548q.d(R.id.copyAccountDataKeysButton, view);
                            if (materialButton2 != null) {
                                i11 = R.id.ozonIdDebugSharedCredentialsContent;
                                if (((ConstraintLayout) C2548q.d(R.id.ozonIdDebugSharedCredentialsContent, view)) != null) {
                                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                                    i11 = R.id.sharedCredentialsBlock;
                                    View d11 = C2548q.d(R.id.sharedCredentialsBlock, view);
                                    if (d11 != null) {
                                        i11 = R.id.sharedCredentialsBlockTitleTextView;
                                        if (((AppCompatTextView) C2548q.d(R.id.sharedCredentialsBlockTitleTextView, view)) != null) {
                                            i11 = R.id.sharedStoreMigrationFlagLabelTextView;
                                            if (((AppCompatTextView) C2548q.d(R.id.sharedStoreMigrationFlagLabelTextView, view)) != null) {
                                                i11 = R.id.sharedStoreMigrationFlagTitleTextView;
                                                if (((AppCompatTextView) C2548q.d(R.id.sharedStoreMigrationFlagTitleTextView, view)) != null) {
                                                    i11 = R.id.sharedStoreMigrationFlagValueTextView;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(R.id.sharedStoreMigrationFlagValueTextView, view);
                                                    if (appCompatTextView3 != null) {
                                                        return new l(nestedScrollView, appCompatTextView, appCompatTextView2, materialButton, materialButton2, d11, appCompatTextView3);
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
        return this.f14493a;
    }
}
