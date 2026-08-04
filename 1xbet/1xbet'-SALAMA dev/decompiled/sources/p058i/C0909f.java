package p058i;

import H2.e;
import R1.c;
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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.ref.WeakReference;
import p051h.a;

/* JADX INFO: renamed from: i.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0909f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f13677A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f13678B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f13679C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f13680D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final c f13681E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0910g f13684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f13685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f13686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f13688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f13689g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f13691i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f13692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f13693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f13694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f13695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f13696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f13697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f13698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f13699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f13700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f13701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f13702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f13703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f13704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f13705x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f13707z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13690h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13706y = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final e f13682F = new e(this, 3);

    public C0909f(Context context, DialogInterfaceC0910g dialogInterfaceC0910g, Window window) {
        this.f13683a = context;
        this.f13684b = dialogInterfaceC0910g;
        this.f13685c = window;
        c cVar = new c(2);
        cVar.f5887b = new WeakReference(dialogInterfaceC0910g);
        this.f13681E = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f13334f, R.attr.alertDialogStyle, 0);
        this.f13707z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f13677A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f13678B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f13679C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f13680D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0910g.d().i(1);
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
        Message messageObtainMessage = onClickListener != null ? this.f13681E.obtainMessage(i7, onClickListener) : null;
        if (i7 == -3) {
            this.f13697p = charSequence;
            this.f13698q = messageObtainMessage;
        } else if (i7 == -2) {
            this.f13694m = charSequence;
            this.f13695n = messageObtainMessage;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.f13692k = messageObtainMessage;
        }
    }
}
