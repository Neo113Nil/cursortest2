package M70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f17553a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final a f17554b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final b f17555c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final d f17556d;

    private c(@NonNull FrameLayout frameLayout, @NonNull a aVar, @NonNull b bVar, @NonNull d dVar) {
        this.f17553a = frameLayout;
        this.f17554b = aVar;
        this.f17555c = bVar;
        this.f17556d = dVar;
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.pinpad_fragment, viewGroup, false);
        int i11 = R.id.dbo_restricted;
        View d11 = C2548q.d(R.id.dbo_restricted, inflate);
        if (d11 != null) {
            a a11 = a.a(d11);
            View d12 = C2548q.d(R.id.empty_bank_phone, inflate);
            if (d12 != null) {
                b a12 = b.a(d12);
                View d13 = C2548q.d(R.id.pinpad_main, inflate);
                if (d13 != null) {
                    return new c((FrameLayout) inflate, a11, a12, d.a(d13));
                }
                i11 = R.id.pinpad_main;
            } else {
                i11 = R.id.empty_bank_phone;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f17553a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f17553a;
    }
}
