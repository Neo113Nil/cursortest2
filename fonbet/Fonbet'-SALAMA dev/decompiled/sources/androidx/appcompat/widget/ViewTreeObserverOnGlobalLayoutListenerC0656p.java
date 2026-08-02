package androidx.appcompat.widget;

import P.AbstractC0347c;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.C1420d;
import m.ViewOnKeyListenerC1415C;
import m.ViewOnKeyListenerC1421e;

/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0656p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8731b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0656p(Object obj, int i7) {
        this.f8730a = i7;
        this.f8731b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C0644j c0644j;
        m.w wVar;
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
                        if (abstractC0347c != null && (c0644j = abstractC0347c.f5050a) != null && (wVar = c0644j.f8655e) != null) {
                            wVar.n(c0644j.f8653c);
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
                    break;
                }
                break;
            case 2:
                I i7 = (I) obj;
                AppCompatSpinner appCompatSpinner2 = i7.f8360W;
                i7.getClass();
                WeakHashMap weakHashMap = P.U.f5037a;
                if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(i7.f8358U)) {
                    i7.dismiss();
                    break;
                } else {
                    i7.r();
                    i7.show();
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC1421e viewOnKeyListenerC1421e = (ViewOnKeyListenerC1421e) obj;
                if (viewOnKeyListenerC1421e.b()) {
                    ArrayList arrayList = viewOnKeyListenerC1421e.f15105y;
                    if (arrayList.size() > 0 && !((C1420d) arrayList.get(0)).f15079a.f8396O) {
                        View view = viewOnKeyListenerC1421e.f15087F;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C1420d) it.next()).f15079a.show();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC1421e.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC1415C viewOnKeyListenerC1415C = (ViewOnKeyListenerC1415C) obj;
                if (viewOnKeyListenerC1415C.b()) {
                    A0 a02 = viewOnKeyListenerC1415C.f15057y;
                    if (!a02.f8396O) {
                        View view2 = viewOnKeyListenerC1415C.f15043D;
                        if (view2 != null && view2.isShown()) {
                            a02.show();
                            break;
                        } else {
                            viewOnKeyListenerC1415C.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
