package p000;

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
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0641r3 {

    /* JADX INFO: renamed from: A */
    public final int f6669A;

    /* JADX INFO: renamed from: B */
    public final boolean f6670B;

    /* JADX INFO: renamed from: C */
    public final HandlerC0567p3 f6671C;

    /* JADX INFO: renamed from: a */
    public final Context f6673a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0715t3 f6674b;

    /* JADX INFO: renamed from: c */
    public final Window f6675c;

    /* JADX INFO: renamed from: d */
    public CharSequence f6676d;

    /* JADX INFO: renamed from: e */
    public String f6677e;

    /* JADX INFO: renamed from: f */
    public AlertController$RecycleListView f6678f;

    /* JADX INFO: renamed from: g */
    public Button f6679g;

    /* JADX INFO: renamed from: h */
    public CharSequence f6680h;

    /* JADX INFO: renamed from: i */
    public Message f6681i;

    /* JADX INFO: renamed from: j */
    public Button f6682j;

    /* JADX INFO: renamed from: k */
    public CharSequence f6683k;

    /* JADX INFO: renamed from: l */
    public Message f6684l;

    /* JADX INFO: renamed from: m */
    public Button f6685m;

    /* JADX INFO: renamed from: n */
    public CharSequence f6686n;

    /* JADX INFO: renamed from: o */
    public Message f6687o;

    /* JADX INFO: renamed from: p */
    public NestedScrollView f6688p;

    /* JADX INFO: renamed from: q */
    public Drawable f6689q;

    /* JADX INFO: renamed from: r */
    public ImageView f6690r;

    /* JADX INFO: renamed from: s */
    public TextView f6691s;

    /* JADX INFO: renamed from: t */
    public TextView f6692t;

    /* JADX INFO: renamed from: u */
    public View f6693u;

    /* JADX INFO: renamed from: v */
    public ListAdapter f6694v;

    /* JADX INFO: renamed from: x */
    public final int f6696x;

    /* JADX INFO: renamed from: y */
    public final int f6697y;

    /* JADX INFO: renamed from: z */
    public final int f6698z;

    /* JADX INFO: renamed from: w */
    public int f6695w = -1;

    /* JADX INFO: renamed from: D */
    public final ViewOnClickListenerC0123d2 f6672D = new ViewOnClickListenerC0123d2(1, this);

    public C0641r3(Context context, DialogInterfaceC0715t3 dialogInterfaceC0715t3, Window window) {
        this.f6673a = context;
        this.f6674b = dialogInterfaceC0715t3;
        this.f6675c = window;
        HandlerC0567p3 handlerC0567p3 = new HandlerC0567p3();
        handlerC0567p3.f5969a = new WeakReference(dialogInterfaceC0715t3);
        this.f6671C = handlerC0567p3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, mz0.f5191e, R.attr.alertDialogStyle, 0);
        this.f6696x = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f6697y = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6698z = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f6669A = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f6670B = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0715t3.m4667f().mo2214f(1);
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup m4236a(View view, View view2) {
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

    /* JADX INFO: renamed from: b */
    public final void m4237b(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f6671C.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f6686n = charSequence;
            this.f6687o = messageObtainMessage;
        } else if (i == -2) {
            this.f6683k = charSequence;
            this.f6684l = messageObtainMessage;
        } else if (i != -1) {
            C0270h1.m2190f("Button does not exist");
        } else {
            this.f6680h = charSequence;
            this.f6681i = messageObtainMessage;
        }
    }
}
