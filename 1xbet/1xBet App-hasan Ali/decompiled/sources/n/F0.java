package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import game.betting133.sports1xbet.R;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18154a;

    /* renamed from: b, reason: collision with root package name */
    public final View f18155b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f18156c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f18157d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f18158e;
    public final int[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f18159g;

    public F0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f18157d = layoutParams;
        this.f18158e = new Rect();
        this.f = new int[2];
        this.f18159g = new int[2];
        this.f18154a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f18155b = inflate;
        this.f18156c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(F0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
