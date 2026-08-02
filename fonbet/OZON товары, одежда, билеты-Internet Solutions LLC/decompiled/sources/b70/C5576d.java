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
import ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView;

/* renamed from: b70.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5576d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f55603a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55604b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55605c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55606d;

    private C5576d(@NonNull ViewGroup viewGroup, @NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.f55603a = viewGroup;
        this.f55604b = linearLayout;
        this.f55605c = appCompatTextView;
        this.f55606d = appCompatTextView2;
    }

    @NonNull
    public static C5576d a(@NonNull LayoutInflater layoutInflater, @NonNull OfflineMyContactView offlineMyContactView) {
        layoutInflater.inflate(R.layout.offline_my_contact_view, offlineMyContactView);
        int i11 = R.id.image;
        if (((ImageView) C2548q.d(R.id.image, offlineMyContactView)) != null) {
            i11 = R.id.island;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.island, offlineMyContactView);
            if (linearLayout != null) {
                i11 = R.id.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.name, offlineMyContactView);
                if (appCompatTextView != null) {
                    i11 = R.id.name_holder;
                    if (((LinearLayout) C2548q.d(R.id.name_holder, offlineMyContactView)) != null) {
                        i11 = R.id.number;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.number, offlineMyContactView);
                        if (appCompatTextView2 != null) {
                            return new C5576d(offlineMyContactView, linearLayout, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(offlineMyContactView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f55603a;
    }
}
