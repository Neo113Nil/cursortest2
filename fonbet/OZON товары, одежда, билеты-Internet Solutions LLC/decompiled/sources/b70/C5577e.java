package b70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankView;

/* renamed from: b70.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5577e implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f55607a;

    private C5577e(@NonNull ViewGroup viewGroup) {
        this.f55607a = viewGroup;
    }

    @NonNull
    public static C5577e a(@NonNull LayoutInflater layoutInflater, @NonNull OfflineNoBankView offlineNoBankView) {
        layoutInflater.inflate(R.layout.offline_no_bank_view, offlineNoBankView);
        if (((AppCompatTextView) C2548q.d(R.id.title, offlineNoBankView)) != null) {
            return new C5577e(offlineNoBankView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(offlineNoBankView.getResources().getResourceName(R.id.title)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f55607a;
    }
}
