package A70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.operations.ui.receipt.ReceiptItemView;

/* loaded from: classes3.dex */
public final class d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f546a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f547b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f548c;

    private d(@NonNull ViewGroup viewGroup, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f546a = viewGroup;
        this.f547b = textView;
        this.f548c = textView2;
    }

    @NonNull
    public static d a(@NonNull LayoutInflater layoutInflater, @NonNull ReceiptItemView receiptItemView) {
        layoutInflater.inflate(R.layout.receipt_item, receiptItemView);
        int i11 = R.id.tv_title;
        TextView textView = (TextView) C2548q.d(R.id.tv_title, receiptItemView);
        if (textView != null) {
            i11 = R.id.tv_value;
            TextView textView2 = (TextView) C2548q.d(R.id.tv_value, receiptItemView);
            if (textView2 != null) {
                return new d(receiptItemView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(receiptItemView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f546a;
    }
}
