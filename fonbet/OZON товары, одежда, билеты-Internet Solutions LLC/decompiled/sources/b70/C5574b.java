package b70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.ui.contact.OfflineContactView;

/* renamed from: b70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5574b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f55584a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55585b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55586c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55587d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55588e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55589f;

    private C5574b(@NonNull ViewGroup viewGroup, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.f55584a = viewGroup;
        this.f55585b = textView;
        this.f55586c = imageView;
        this.f55587d = imageView2;
        this.f55588e = appCompatTextView;
        this.f55589f = appCompatTextView2;
    }

    @NonNull
    public static C5574b a(@NonNull LayoutInflater layoutInflater, @NonNull OfflineContactView offlineContactView) {
        layoutInflater.inflate(R.layout.offline_contact_view, offlineContactView);
        int i11 = R.id.big_letter;
        TextView textView = (TextView) C2548q.d(R.id.big_letter, offlineContactView);
        if (textView != null) {
            i11 = R.id.chevron;
            ImageView imageView = (ImageView) C2548q.d(R.id.chevron, offlineContactView);
            if (imageView != null) {
                i11 = R.id.image;
                ImageView imageView2 = (ImageView) C2548q.d(R.id.image, offlineContactView);
                if (imageView2 != null) {
                    i11 = R.id.image_holder;
                    if (((FrameLayout) C2548q.d(R.id.image_holder, offlineContactView)) != null) {
                        i11 = R.id.name;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.name, offlineContactView);
                        if (appCompatTextView != null) {
                            i11 = R.id.name_holder;
                            if (((LinearLayout) C2548q.d(R.id.name_holder, offlineContactView)) != null) {
                                i11 = R.id.number;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.number, offlineContactView);
                                if (appCompatTextView2 != null) {
                                    return new C5574b(offlineContactView, textView, imageView, imageView2, appCompatTextView, appCompatTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(offlineContactView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f55584a;
    }
}
