package Jb0;

import B1.C2548q;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class x implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayoutCompat f14568a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14569b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f14570c;

    private x(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatTextView appCompatTextView, @NonNull View view) {
        this.f14568a = linearLayoutCompat;
        this.f14569b = appCompatTextView;
        this.f14570c = view;
    }

    @NonNull
    public static x a(@NonNull View view) {
        int i11 = R.id.codeTextView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.codeTextView, view);
        if (appCompatTextView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            View d11 = C2548q.d(R.id.icon, view);
            if (d11 != null) {
                return new x(linearLayoutCompat, appCompatTextView, d11);
            }
            i11 = R.id.icon;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public final LinearLayoutCompat b() {
        return this.f14568a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14568a;
    }
}
