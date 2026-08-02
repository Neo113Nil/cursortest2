package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.Y;
import androidx.core.widget.NestedScrollView;
import i.C6977a;
import java.lang.ref.WeakReference;
import ru.ozon.app.android.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class AlertController {

    /* renamed from: A, reason: collision with root package name */
    int f36989A;

    /* renamed from: B, reason: collision with root package name */
    int f36990B;

    /* renamed from: C, reason: collision with root package name */
    int f36991C;

    /* renamed from: D, reason: collision with root package name */
    int f36992D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f36993E;

    /* renamed from: F, reason: collision with root package name */
    Handler f36994F;

    /* renamed from: a, reason: collision with root package name */
    private final Context f36996a;

    /* renamed from: b, reason: collision with root package name */
    final f f36997b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f36998c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f36999d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f37000e;

    /* renamed from: f, reason: collision with root package name */
    RecycleListView f37001f;

    /* renamed from: g, reason: collision with root package name */
    private View f37002g;

    /* renamed from: i, reason: collision with root package name */
    Button f37004i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f37005j;

    /* renamed from: k, reason: collision with root package name */
    Message f37006k;

    /* renamed from: l, reason: collision with root package name */
    Button f37007l;

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f37008m;

    /* renamed from: n, reason: collision with root package name */
    Message f37009n;

    /* renamed from: o, reason: collision with root package name */
    Button f37010o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f37011p;

    /* renamed from: q, reason: collision with root package name */
    Message f37012q;

    /* renamed from: r, reason: collision with root package name */
    NestedScrollView f37013r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f37014s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f37015t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f37016u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f37017v;

    /* renamed from: w, reason: collision with root package name */
    private View f37018w;

    /* renamed from: x, reason: collision with root package name */
    ListAdapter f37019x;

    /* renamed from: z, reason: collision with root package name */
    private int f37021z;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37003h = false;

    /* renamed from: y, reason: collision with root package name */
    int f37020y = -1;

    /* renamed from: G, reason: collision with root package name */
    private final View.OnClickListener f36995G = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f37022a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37023b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6977a.f65666t);
            this.f37023b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f37022a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }

        public final void a(boolean z11, boolean z12) {
            if (z12 && z11) {
                return;
            }
            setPadding(getPaddingLeft(), z11 ? getPaddingTop() : this.f37022a, getPaddingRight(), z12 ? getPaddingBottom() : this.f37023b);
        }
    }

    final class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f37004i || (message3 = alertController.f37006k) == null) ? (view != alertController.f37007l || (message2 = alertController.f37009n) == null) ? (view != alertController.f37010o || (message = alertController.f37012q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            alertController.f36994F.obtainMessage(1, alertController.f36997b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ContextThemeWrapper f37025a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f37026b;

        /* renamed from: c, reason: collision with root package name */
        public Drawable f37027c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f37028d;

        /* renamed from: e, reason: collision with root package name */
        public View f37029e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f37030f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f37031g;

        /* renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f37032h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f37033i;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f37034j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f37035k;

        /* renamed from: l, reason: collision with root package name */
        public Wg0.c f37036l;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnCancelListener f37038n;

        /* renamed from: o, reason: collision with root package name */
        public vX.b f37039o;

        /* renamed from: p, reason: collision with root package name */
        public DialogInterface.OnKeyListener f37040p;

        /* renamed from: q, reason: collision with root package name */
        public CharSequence[] f37041q;

        /* renamed from: r, reason: collision with root package name */
        public Object f37042r;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnClickListener f37043s;

        /* renamed from: t, reason: collision with root package name */
        public View f37044t;

        /* renamed from: u, reason: collision with root package name */
        public boolean[] f37045u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f37046v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f37047w;

        /* renamed from: y, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f37049y;

        /* renamed from: x, reason: collision with root package name */
        public int f37048x = -1;

        /* renamed from: m, reason: collision with root package name */
        public boolean f37037m = true;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f37025a = contextThemeWrapper;
            this.f37026b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f37050a;

        public c(w wVar) {
            this.f37050a = new WeakReference<>(wVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == -3 || i11 == -2 || i11 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f37050a.get(), message.what);
            } else {
                if (i11 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, f fVar, Window window) {
        this.f36996a = context;
        this.f36997b = fVar;
        this.f36998c = window;
        this.f36994F = new c(fVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C6977a.f65651e, R.attr.alertDialogStyle, 0);
        this.f37021z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f36989A = obtainStyledAttributes.getResourceId(4, 0);
        this.f36990B = obtainStyledAttributes.getResourceId(5, 0);
        this.f36991C = obtainStyledAttributes.getResourceId(7, 0);
        this.f36992D = obtainStyledAttributes.getResourceId(3, 0);
        this.f36993E = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        fVar.supportRequestWindowFeature(1);
    }

    static boolean a(View view) {
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

    private static ViewGroup c(View view, View view2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        int i11;
        ListAdapter listAdapter;
        View findViewById;
        this.f36997b.setContentView(this.f37021z);
        Window window = this.f36998c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = this.f37002g;
        if (view == null) {
            view = null;
        }
        boolean z11 = view != null;
        if (!z11 || !a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f37003h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (this.f37001f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c11 = c(findViewById6, findViewById3);
        ViewGroup c12 = c(findViewById7, findViewById4);
        ViewGroup c13 = c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        this.f37013r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f37013r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c12.findViewById(android.R.id.message);
        this.f37017v = textView;
        if (textView != null) {
            CharSequence charSequence = this.f37000e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f37013r.removeView(this.f37017v);
                if (this.f37001f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f37013r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f37013r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f37001f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c12.setVisibility(8);
                }
            }
        }
        Button button = (Button) c13.findViewById(android.R.id.button1);
        this.f37004i = button;
        View.OnClickListener onClickListener = this.f36995G;
        button.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f37005j)) {
            this.f37004i.setVisibility(8);
            i11 = 0;
        } else {
            this.f37004i.setText(this.f37005j);
            this.f37004i.setVisibility(0);
            i11 = 1;
        }
        Button button2 = (Button) c13.findViewById(android.R.id.button2);
        this.f37007l = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f37008m)) {
            this.f37007l.setVisibility(8);
        } else {
            this.f37007l.setText(this.f37008m);
            this.f37007l.setVisibility(0);
            i11 |= 2;
        }
        Button button3 = (Button) c13.findViewById(android.R.id.button3);
        this.f37010o = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(this.f37011p)) {
            this.f37010o.setVisibility(8);
        } else {
            this.f37010o.setText(this.f37011p);
            this.f37010o.setVisibility(0);
            i11 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        this.f36996a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i11 == 1) {
                Button button4 = this.f37004i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i11 == 2) {
                Button button5 = this.f37007l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i11 == 4) {
                Button button6 = this.f37010o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i11 == 0) {
            c13.setVisibility(8);
        }
        if (this.f37018w != null) {
            c11.addView(this.f37018w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            this.f37015t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(this.f36999d) || !this.f36993E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                this.f37015t.setVisibility(8);
                c11.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                this.f37016u = textView2;
                textView2.setText(this.f36999d);
                Drawable drawable = this.f37014s;
                if (drawable != null) {
                    this.f37015t.setImageDrawable(drawable);
                } else {
                    this.f37016u.setPadding(this.f37015t.getPaddingLeft(), this.f37015t.getPaddingTop(), this.f37015t.getPaddingRight(), this.f37015t.getPaddingBottom());
                    this.f37015t.setVisibility(8);
                }
            }
        }
        boolean z12 = viewGroup.getVisibility() != 8;
        boolean z13 = (c11 == null || c11.getVisibility() == 8) ? 0 : 1;
        boolean z14 = c13.getVisibility() != 8;
        if (!z14 && (findViewById = c12.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z13 != 0) {
            NestedScrollView nestedScrollView2 = this.f37013r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (this.f37000e == null && this.f37001f == null) ? null : c11.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = c12.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        RecycleListView recycleListView = this.f37001f;
        if (recycleListView != null) {
            recycleListView.a(z13, z14);
        }
        if (!z12) {
            ViewGroup viewGroup3 = this.f37001f;
            if (viewGroup3 == null) {
                viewGroup3 = this.f37013r;
            }
            if (viewGroup3 != null) {
                int i12 = z14 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                Y.M(z13 | i12, viewGroup3);
                if (findViewById11 != null) {
                    c12.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c12.removeView(findViewById12);
                }
            }
        }
        RecycleListView recycleListView2 = this.f37001f;
        if (recycleListView2 == null || (listAdapter = this.f37019x) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i13 = this.f37020y;
        if (i13 > -1) {
            recycleListView2.setItemChecked(i13, true);
            recycleListView2.setSelection(i13);
        }
    }

    public final void d(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f36994F.obtainMessage(i11, onClickListener) : null;
        if (i11 == -3) {
            this.f37011p = charSequence;
            this.f37012q = obtainMessage;
        } else if (i11 == -2) {
            this.f37008m = charSequence;
            this.f37009n = obtainMessage;
        } else {
            if (i11 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f37005j = charSequence;
            this.f37006k = obtainMessage;
        }
    }

    public final void e(View view) {
        this.f37018w = view;
    }

    public final void f(Drawable drawable) {
        this.f37014s = drawable;
        ImageView imageView = this.f37015t;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f37015t.setImageDrawable(drawable);
            }
        }
    }

    public final void g(CharSequence charSequence) {
        this.f37000e = charSequence;
        TextView textView = this.f37017v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void h(CharSequence charSequence) {
        this.f36999d = charSequence;
        TextView textView = this.f37016u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void i(View view) {
        this.f37002g = view;
        this.f37003h = false;
    }
}
