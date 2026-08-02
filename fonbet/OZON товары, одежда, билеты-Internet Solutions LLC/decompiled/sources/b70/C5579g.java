package b70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView;

/* renamed from: b70.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5579g implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f55640a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55641b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55642c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55643d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55644e;

    private C5579g(@NonNull ViewGroup viewGroup, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.f55640a = viewGroup;
        this.f55641b = imageView;
        this.f55642c = linearLayout;
        this.f55643d = appCompatTextView;
        this.f55644e = appCompatTextView2;
    }

    @NonNull
    public static C5579g a(@NonNull LayoutInflater layoutInflater, @NonNull OfflinePermissionContactView offlinePermissionContactView) {
        layoutInflater.inflate(R.layout.offline_permission_contact_view, offlinePermissionContactView);
        int i11 = R.id.chevron;
        if (((ImageView) C2548q.d(R.id.chevron, offlinePermissionContactView)) != null) {
            i11 = R.id.image;
            ImageView imageView = (ImageView) C2548q.d(R.id.image, offlinePermissionContactView);
            if (imageView != null) {
                i11 = R.id.island;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.island, offlinePermissionContactView);
                if (linearLayout != null) {
                    i11 = R.id.name_holder;
                    if (((LinearLayout) C2548q.d(R.id.name_holder, offlinePermissionContactView)) != null) {
                        i11 = R.id.subTitle;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.subTitle, offlinePermissionContactView);
                        if (appCompatTextView != null) {
                            i11 = R.id.title;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.title, offlinePermissionContactView);
                            if (appCompatTextView2 != null) {
                                return new C5579g(offlinePermissionContactView, imageView, linearLayout, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(offlinePermissionContactView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f55640a;
    }
}
