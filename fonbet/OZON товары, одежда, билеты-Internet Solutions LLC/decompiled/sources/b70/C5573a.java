package b70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.ui.bank.OfflineBankView;

/* renamed from: b70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5573a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f55581a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55582b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55583c;

    private C5573a(@NonNull ViewGroup viewGroup, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView) {
        this.f55581a = viewGroup;
        this.f55582b = imageView;
        this.f55583c = appCompatTextView;
    }

    @NonNull
    public static C5573a a(@NonNull LayoutInflater layoutInflater, @NonNull OfflineBankView offlineBankView) {
        layoutInflater.inflate(R.layout.offline_bank_view, offlineBankView);
        int i11 = R.id.image;
        ImageView imageView = (ImageView) C2548q.d(R.id.image, offlineBankView);
        if (imageView != null) {
            i11 = R.id.title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.title, offlineBankView);
            if (appCompatTextView != null) {
                return new C5573a(offlineBankView, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(offlineBankView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f55581a;
    }
}
