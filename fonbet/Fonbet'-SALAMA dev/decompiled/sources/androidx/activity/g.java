package androidx.activity;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import f.C1060f;
import f.InterfaceC1055a;
import p.BinderC1519f;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8097a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8098b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8099c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8100d;

    public /* synthetic */ g(Object obj, int i7, Object obj2, int i8) {
        this.f8097a = i8;
        this.f8099c = obj;
        this.f8098b = i7;
        this.f8100d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1055a interfaceC1055a;
        switch (this.f8097a) {
            case 0:
                Object obj = ((E1.b) this.f8100d).f1900a;
                h hVar = (h) this.f8099c;
                String str = (String) hVar.f12751a.get(Integer.valueOf(this.f8098b));
                if (str != null) {
                    C1060f c1060f = (C1060f) hVar.f12755e.get(str);
                    if (c1060f != null && (interfaceC1055a = c1060f.f12747a) != null) {
                        if (hVar.f12754d.remove(str)) {
                            interfaceC1055a.a(obj);
                            break;
                        }
                    } else {
                        hVar.f12757g.remove(str);
                        hVar.f12756f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                ((h) this.f8099c).a(this.f8098b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f8100d));
                break;
            case 2:
                ((TextView) this.f8100d).setTypeface((Typeface) this.f8099c, this.f8098b);
                break;
            case 3:
                ((g1.g) this.f8100d).a((Intent) this.f8099c, this.f8098b);
                break;
            case 4:
                ((SystemForegroundService) this.f8099c).f9891e.notify(this.f8098b, (Notification) this.f8100d);
                break;
            default:
                ((BinderC1519f) this.f8099c).f15640b.onNavigationEvent(this.f8098b, (Bundle) this.f8100d);
                break;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i7, int i8) {
        this.f8097a = i8;
        this.f8100d = obj;
        this.f8099c = obj2;
        this.f8098b = i7;
    }
}
