package androidx.appcompat.widget;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f8505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f8506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f8507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f8508e;

    public T0(View view) {
        this.f8504a = (TextView) view.findViewById(R.id.text1);
        this.f8505b = (TextView) view.findViewById(R.id.text2);
        this.f8506c = (ImageView) view.findViewById(R.id.icon1);
        this.f8507d = (ImageView) view.findViewById(R.id.icon2);
        this.f8508e = (ImageView) view.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.edit_query);
    }
}
