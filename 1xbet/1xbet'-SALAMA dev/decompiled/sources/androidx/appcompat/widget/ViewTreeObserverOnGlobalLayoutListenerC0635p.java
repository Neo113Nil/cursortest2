package androidx.appcompat.widget;

import P.AbstractC0347c;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p086m.C0927d;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0635p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8731b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0635p(Object obj, int i7) {
        this.f8730a = i7;
        this.f8731b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C0623j c0623j;
        p086m.w wVar;
        Object obj = this.f8731b;
        switch (this.f8730a) {
            case 0:
                ActivityChooserView activityChooserView = (ActivityChooserView) obj;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        break;
                    } else {
                        activityChooserView.getListPopupWindow().show();
                        AbstractC0347c abstractC0347c = activityChooserView.f8255x;
                        if (abstractC0347c != null && (c0623j = abstractC0347c.f5050a) != null && (wVar = c0623j.f8655e) != null) {
                            wVar.n(c0623j.f8653c);
                            break;
                        }
                    }
                }
                break;
            case 1:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
                if (!appCompatSpinner.getInternalPopup().b()) {
                    appCompatSpinner.f8302f.m(C.b(appCompatSpinner), C.a(appCompatSpinner));
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    B.a(viewTreeObserver, this);
                }
                break;
            case 2:
                I i7 = (I) obj;
                AppCompatSpinner appCompatSpinner2 = i7.f8360W;
                i7.getClass();
                WeakHashMap weakHashMap = P.U.f5037a;
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(i7.f8358U)) {
                    i7.r();
                    i7.show();
                } else {
                    i7.dismiss();
                }
                break;
            case 3:
                p086m.e eVar = (p086m.e) obj;
                if (eVar.b()) {
                    ArrayList arrayList = eVar.f15111y;
                    if (arrayList.size() > 0 && !((C0927d) arrayList.get(0)).f15085a.f8396O) {
                        View view = eVar.f15093F;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0927d) it.next()).f15085a.show();
                            }
                        } else {
                            eVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                p086m.C c3 = (p086m.C) obj;
                if (c3.b()) {
                    A0 a2 = c3.f15063y;
                    if (!a2.f8396O) {
                        View view2 = c3.f15049D;
                        if (view2 != null && view2.isShown()) {
                            a2.show();
                        } else {
                            c3.dismiss();
                        }
                    }
                }
                break;
        }
    }
}
