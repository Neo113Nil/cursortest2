package sg.bigo.ads.h;

import android.webkit.ValueCallback;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f12854a = new WeakHashMap();
    public final WeakHashMap b = new WeakHashMap();
    public double c = Double.NaN;
    public int d = -14671580;

    public final void a(ValueCallback valueCallback) {
        if (valueCallback == null) {
            return;
        }
        this.b.put(valueCallback, this);
        double d = this.c;
        if (d != Double.MIN_VALUE) {
            valueCallback.onReceiveValue(Double.valueOf(d));
        }
    }

    public final void a(TextView textView) {
        if (textView == null) {
            return;
        }
        this.f12854a.put(textView, this);
        double d = this.c;
        if (d != Double.NaN) {
            a(textView, d);
        }
    }

    public static void a(TextView textView, int i, sg.bigo.ads.E0.k kVar) {
        if (textView == null) {
            return;
        }
        sg.bigo.ads.E0.p.a(textView, i, new C5141S(textView, kVar));
    }

    public final int a(int i) {
        int a2 = sg.bigo.ads.E0.p.a(i);
        this.c = sg.bigo.ads.E0.p.b(a2);
        Iterator it = this.f12854a.entrySet().iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((Map.Entry) it.next()).getKey();
            if (textView != null) {
                a(textView, this.c);
                this.d = this.c <= 3.0d ? -14671580 : -1;
            }
        }
        Iterator it2 = this.b.entrySet().iterator();
        while (it2.hasNext()) {
            ValueCallback valueCallback = (ValueCallback) ((Map.Entry) it2.next()).getKey();
            if (valueCallback != null) {
                valueCallback.onReceiveValue(Double.valueOf(this.c));
            }
        }
        return a2;
    }

    public static void a(TextView textView, double d) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(d <= 3.0d ? -14671580 : -1);
    }
}
