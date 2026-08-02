package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes8.dex */
public final class f extends w implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    final AlertController f37117a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f37118a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37119b;

        public a(@NonNull Context context) {
            this(context, f.c(0, context));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37042r = listAdapter;
            bVar.f37043s = onClickListener;
            return this;
        }

        public a b(boolean z11) {
            this.f37118a.f37037m = z11;
            return this;
        }

        public a c(View view) {
            this.f37118a.f37029e = view;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v17, types: [android.widget.ListAdapter] */
        /* JADX WARN: Type inference failed for: r1v26, types: [androidx.appcompat.app.c] */
        @NonNull
        public f create() {
            ?? r12;
            AlertController.b bVar = this.f37118a;
            f fVar = new f(bVar.f37025a, this.f37119b);
            View view = bVar.f37029e;
            AlertController alertController = fVar.f37117a;
            if (view != null) {
                alertController.e(view);
            } else {
                CharSequence charSequence = bVar.f37028d;
                if (charSequence != null) {
                    alertController.h(charSequence);
                }
                Drawable drawable = bVar.f37027c;
                if (drawable != null) {
                    alertController.f(drawable);
                }
            }
            CharSequence charSequence2 = bVar.f37030f;
            if (charSequence2 != null) {
                alertController.g(charSequence2);
            }
            CharSequence charSequence3 = bVar.f37031g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar.f37032h);
            }
            CharSequence charSequence4 = bVar.f37033i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar.f37034j);
            }
            CharSequence charSequence5 = bVar.f37035k;
            if (charSequence5 != null) {
                alertController.d(-3, charSequence5, bVar.f37036l);
            }
            if (bVar.f37041q != null || bVar.f37042r != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f37026b.inflate(alertController.f36989A, (ViewGroup) null);
                boolean z11 = bVar.f37046v;
                ContextThemeWrapper contextThemeWrapper = bVar.f37025a;
                if (z11) {
                    r12 = new C5053c(bVar, contextThemeWrapper, alertController.f36990B, bVar.f37041q, recycleListView);
                } else {
                    int i11 = bVar.f37047w ? alertController.f36991C : alertController.f36992D;
                    Object obj = bVar.f37042r;
                    Object obj2 = obj;
                    if (obj == null) {
                        obj2 = new AlertController.d(contextThemeWrapper, i11, R.id.text1, bVar.f37041q);
                    }
                    r12 = obj2;
                }
                alertController.f37019x = r12;
                alertController.f37020y = bVar.f37048x;
                if (bVar.f37043s != null) {
                    recycleListView.setOnItemClickListener(new C5054d(bVar, alertController));
                } else if (bVar.f37049y != null) {
                    recycleListView.setOnItemClickListener(new C5055e(bVar, recycleListView, alertController));
                }
                if (bVar.f37047w) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.f37046v) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f37001f = recycleListView;
            }
            View view2 = bVar.f37044t;
            if (view2 != null) {
                alertController.i(view2);
            }
            fVar.setCancelable(bVar.f37037m);
            if (bVar.f37037m) {
                fVar.setCanceledOnTouchOutside(true);
            }
            fVar.setOnCancelListener(bVar.f37038n);
            fVar.setOnDismissListener(bVar.f37039o);
            DialogInterface.OnKeyListener onKeyListener = bVar.f37040p;
            if (onKeyListener != null) {
                fVar.setOnKeyListener(onKeyListener);
            }
            return fVar;
        }

        public a d(Drawable drawable) {
            this.f37118a.f37027c = drawable;
            return this;
        }

        public a e(int i11) {
            AlertController.b bVar = this.f37118a;
            bVar.f37030f = bVar.f37025a.getText(i11);
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f37118a.f37030f = charSequence;
            return this;
        }

        public void g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37041q = charSequenceArr;
            bVar.f37049y = onMultiChoiceClickListener;
            bVar.f37045u = zArr;
            bVar.f37046v = true;
        }

        @NonNull
        public Context getContext() {
            return this.f37118a.f37025a;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37033i = charSequence;
            bVar.f37034j = onClickListener;
            return this;
        }

        public a i(Wg0.c cVar) {
            AlertController.b bVar = this.f37118a;
            bVar.f37035k = bVar.f37025a.getText(ru.ozon.app.android.R.string.protection_app_dialog_dont_show_again);
            bVar.f37036l = cVar;
            return this;
        }

        public a j(DialogInterface.OnCancelListener onCancelListener) {
            this.f37118a.f37038n = onCancelListener;
            return this;
        }

        public a k(DialogInterface.OnDismissListener onDismissListener) {
            this.f37118a.f37039o = (vX.b) onDismissListener;
            return this;
        }

        public a l(DialogInterface.OnKeyListener onKeyListener) {
            this.f37118a.f37040p = onKeyListener;
            return this;
        }

        public a m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37031g = charSequence;
            bVar.f37032h = onClickListener;
            return this;
        }

        public a n(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37042r = listAdapter;
            bVar.f37043s = onClickListener;
            bVar.f37048x = i11;
            bVar.f37047w = true;
            return this;
        }

        public void o(CharSequence[] charSequenceArr, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37041q = charSequenceArr;
            bVar.f37043s = onClickListener;
            bVar.f37048x = i11;
            bVar.f37047w = true;
        }

        public a p(int i11) {
            AlertController.b bVar = this.f37118a;
            bVar.f37028d = bVar.f37025a.getText(i11);
            return this;
        }

        public final void q() {
            create().show();
        }

        public a setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37033i = bVar.f37025a.getText(i11);
            bVar.f37034j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f37118a;
            bVar.f37031g = bVar.f37025a.getText(i11);
            bVar.f37032h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f37118a.f37028d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f37118a.f37044t = view;
            return this;
        }

        public a(@NonNull Context context, int i11) {
            this.f37118a = new AlertController.b(new ContextThemeWrapper(context, f.c(i11, context)));
            this.f37119b = i11;
        }
    }

    protected f(@NonNull ContextThemeWrapper contextThemeWrapper, int i11) {
        super(contextThemeWrapper, c(i11, contextThemeWrapper));
        this.f37117a = new AlertController(getContext(), this, getWindow());
    }

    static int c(int i11, @NonNull Context context) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ru.ozon.app.android.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final AlertController.RecycleListView b() {
        return this.f37117a.f37001f;
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37117a.b();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f37117a.f37013r;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i11, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f37117a.f37013r;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i11, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.w, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f37117a.h(charSequence);
    }
}
