package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class v implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f14557a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14558b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14559c;

    private v(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.f14557a = linearLayout;
        this.f14558b = appCompatTextView;
        this.f14559c = appCompatTextView2;
    }

    @NonNull
    public static v b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_preference_entry, viewGroup, false);
        int i11 = R.id.key;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.key, inflate);
        if (appCompatTextView != null) {
            i11 = R.id.value;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.value, inflate);
            if (appCompatTextView2 != null) {
                return new v((LinearLayout) inflate, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final LinearLayout a() {
        return this.f14557a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14557a;
    }
}
