package i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import h.AbstractC1174a;
import java.lang.ref.WeakReference;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228f {

    /* renamed from: A, reason: collision with root package name */
    public final int f13671A;

    /* renamed from: B, reason: collision with root package name */
    public final int f13672B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13673C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f13674D;

    /* renamed from: E, reason: collision with root package name */
    public final R1.c f13675E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13677a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC1229g f13678b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f13679c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f13680d;

    /* renamed from: e, reason: collision with root package name */
    public String f13681e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f13682f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f13683g;

    /* renamed from: i, reason: collision with root package name */
    public Button f13685i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Message f13686k;

    /* renamed from: l, reason: collision with root package name */
    public Button f13687l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f13688m;

    /* renamed from: n, reason: collision with root package name */
    public Message f13689n;

    /* renamed from: o, reason: collision with root package name */
    public Button f13690o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f13691p;

    /* renamed from: q, reason: collision with root package name */
    public Message f13692q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f13693r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f13694s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f13695t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f13696u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f13697v;

    /* renamed from: w, reason: collision with root package name */
    public View f13698w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f13699x;

    /* renamed from: z, reason: collision with root package name */
    public final int f13701z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13684h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f13700y = -1;

    /* renamed from: F, reason: collision with root package name */
    public final H2.e f13676F = new H2.e(this, 3);

    public C1228f(Context context, DialogInterfaceC1229g dialogInterfaceC1229g, Window window) {
        this.f13677a = context;
        this.f13678b = dialogInterfaceC1229g;
        this.f13679c = window;
        R1.c cVar = new R1.c(2);
        cVar.f5887b = new WeakReference(dialogInterfaceC1229g);
        this.f13675E = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1174a.f13328f, R.attr.alertDialogStyle, 0);
        this.f13701z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f13671A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f13672B = obtainStyledAttributes.getResourceId(7, 0);
        this.f13673C = obtainStyledAttributes.getResourceId(3, 0);
        this.f13674D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC1229g.d().i(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f13675E.obtainMessage(i7, onClickListener) : null;
        if (i7 == -3) {
            this.f13691p = charSequence;
            this.f13692q = obtainMessage;
        } else if (i7 == -2) {
            this.f13688m = charSequence;
            this.f13689n = obtainMessage;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.f13686k = obtainMessage;
        }
    }
}
