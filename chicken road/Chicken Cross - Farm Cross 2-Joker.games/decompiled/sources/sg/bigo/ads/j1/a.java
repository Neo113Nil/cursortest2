package sg.bigo.ads.j1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import java.io.Serializable;
import java.util.ArrayList;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f13007a;
    public ValueCallback b;

    public a(Activity activity) {
        this.f13007a = activity;
    }

    public final void a(int i, int i2, Intent intent) {
        String dataString;
        Uri[] uriArr = (i2 != -1 || i != 101 || intent == null || intent.getData() == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)};
        ValueCallback valueCallback = this.b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            this.b = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.Serializable, java.lang.Object[]] */
    public final void a(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        ValueCallback valueCallback2 = this.b;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.b = valueCallback;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        ArrayList arrayList = new ArrayList();
        if (acceptTypes != null) {
            for (String str : acceptTypes) {
                if (!I.a((CharSequence) str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.isEmpty()) {
            intent.setType("*/*");
        } else {
            intent.setType((String) arrayList.get(0));
            if (arrayList.size() > 1) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (Serializable) arrayList.toArray());
            }
        }
        this.f13007a.startActivityForResult(Intent.createChooser(intent, "Select File"), 101);
    }
}
