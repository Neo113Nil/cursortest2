package l;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9769a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9770b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9771c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f9772d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9773e;

    public e0(View view) {
        this.f9769a = (TextView) view.findViewById(R.id.text1);
        this.f9770b = (TextView) view.findViewById(R.id.text2);
        this.f9771c = (ImageView) view.findViewById(R.id.icon1);
        this.f9772d = (ImageView) view.findViewById(R.id.icon2);
        this.f9773e = (ImageView) view.findViewById(com.chicken.jump.road.pump.R.id.edit_query);
    }
}
