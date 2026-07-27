package l;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f10834a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10835b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10836c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10837d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10838e;

    public c0(View view) {
        this.f10834a = (TextView) view.findViewById(R.id.text1);
        this.f10835b = (TextView) view.findViewById(R.id.text2);
        this.f10836c = (ImageView) view.findViewById(R.id.icon1);
        this.f10837d = (ImageView) view.findViewById(R.id.icon2);
        this.f10838e = (ImageView) view.findViewById(com.chickyneer.roadway.R.id.edit_query);
    }
}
