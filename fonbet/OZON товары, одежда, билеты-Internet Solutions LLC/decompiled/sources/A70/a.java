package A70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.operations.ui.operationinfo.OperationInfoCardView;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f519a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Group f520b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f521c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f522d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f523e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f524f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f525g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f526h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f527i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f528j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f529k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f530l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f531m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f532n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f533o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f534p;

    private a(@NonNull ViewGroup viewGroup, @NonNull Group group, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f519a = viewGroup;
        this.f520b = group;
        this.f521c = linearLayout;
        this.f522d = linearLayout2;
        this.f523e = constraintLayout;
        this.f524f = imageView;
        this.f525g = imageView3;
        this.f526h = textView;
        this.f527i = textView2;
        this.f528j = textView3;
        this.f529k = textView5;
        this.f530l = textView6;
        this.f531m = textView7;
        this.f532n = textView8;
        this.f533o = textView9;
        this.f534p = textView10;
    }

    @NonNull
    public static a a(@NonNull LayoutInflater layoutInflater, @NonNull OperationInfoCardView operationInfoCardView) {
        layoutInflater.inflate(R.layout.operation_info_card_layout, operationInfoCardView);
        int i11 = R.id.cache_premium_points_group;
        Group group = (Group) C2548q.d(R.id.cache_premium_points_group, operationInfoCardView);
        if (group != null) {
            i11 = R.id.cacheback_container;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.cacheback_container, operationInfoCardView);
            if (linearLayout != null) {
                i11 = R.id.content_view;
                if (((ConstraintLayout) C2548q.d(R.id.content_view, operationInfoCardView)) != null) {
                    i11 = R.id.direction_barrier;
                    if (((Barrier) C2548q.d(R.id.direction_barrier, operationInfoCardView)) != null) {
                        i11 = R.id.discount_container;
                        LinearLayout linearLayout2 = (LinearLayout) C2548q.d(R.id.discount_container, operationInfoCardView);
                        if (linearLayout2 != null) {
                            i11 = R.id.dynamic_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(R.id.dynamic_container, operationInfoCardView);
                            if (constraintLayout != null) {
                                i11 = R.id.iv_arrow;
                                ImageView imageView = (ImageView) C2548q.d(R.id.iv_arrow, operationInfoCardView);
                                if (imageView != null) {
                                    i11 = R.id.iv_discount_icon;
                                    ImageView imageView2 = (ImageView) C2548q.d(R.id.iv_discount_icon, operationInfoCardView);
                                    if (imageView2 != null) {
                                        i11 = R.id.iv_operation_icon;
                                        ImageView imageView3 = (ImageView) C2548q.d(R.id.iv_operation_icon, operationInfoCardView);
                                        if (imageView3 != null) {
                                            i11 = R.id.tv_cacheback_count;
                                            TextView textView = (TextView) C2548q.d(R.id.tv_cacheback_count, operationInfoCardView);
                                            if (textView != null) {
                                                i11 = R.id.tv_cacheback_info;
                                                if (((TextView) C2548q.d(R.id.tv_cacheback_info, operationInfoCardView)) != null) {
                                                    i11 = R.id.tv_commission;
                                                    TextView textView2 = (TextView) C2548q.d(R.id.tv_commission, operationInfoCardView);
                                                    if (textView2 != null) {
                                                        i11 = R.id.tv_description;
                                                        TextView textView3 = (TextView) C2548q.d(R.id.tv_description, operationInfoCardView);
                                                        if (textView3 != null) {
                                                            i11 = R.id.tv_discount_info;
                                                            TextView textView4 = (TextView) C2548q.d(R.id.tv_discount_info, operationInfoCardView);
                                                            if (textView4 != null) {
                                                                i11 = R.id.tv_info_from;
                                                                TextView textView5 = (TextView) C2548q.d(R.id.tv_info_from, operationInfoCardView);
                                                                if (textView5 != null) {
                                                                    i11 = R.id.tv_info_to;
                                                                    TextView textView6 = (TextView) C2548q.d(R.id.tv_info_to, operationInfoCardView);
                                                                    if (textView6 != null) {
                                                                        i11 = R.id.tv_old_price;
                                                                        TextView textView7 = (TextView) C2548q.d(R.id.tv_old_price, operationInfoCardView);
                                                                        if (textView7 != null) {
                                                                            i11 = R.id.tv_operation_status;
                                                                            TextView textView8 = (TextView) C2548q.d(R.id.tv_operation_status, operationInfoCardView);
                                                                            if (textView8 != null) {
                                                                                i11 = R.id.tv_premium_cache_back;
                                                                                if (((TextView) C2548q.d(R.id.tv_premium_cache_back, operationInfoCardView)) != null) {
                                                                                    i11 = R.id.tv_premium_points;
                                                                                    TextView textView9 = (TextView) C2548q.d(R.id.tv_premium_points, operationInfoCardView);
                                                                                    if (textView9 != null) {
                                                                                        i11 = R.id.tv_price;
                                                                                        TextView textView10 = (TextView) C2548q.d(R.id.tv_price, operationInfoCardView);
                                                                                        if (textView10 != null) {
                                                                                            return new a(operationInfoCardView, group, linearLayout, linearLayout2, constraintLayout, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(operationInfoCardView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f519a;
    }
}
