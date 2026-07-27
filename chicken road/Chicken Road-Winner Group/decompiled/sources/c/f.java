package c;

import Y1.C0077a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import e.C0280a;
import e.C0283d;
import e.C0285f;
import e.InterfaceC0281b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import s.AbstractC1180a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2488a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2489b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2490c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2491d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f2492e = new HashMap();
    public final HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2493g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f2494h;

    public f(k kVar) {
        this.f2494h = kVar;
    }

    public final boolean a(int i3, int i4, Intent intent) {
        String str = (String) this.f2488a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        C0283d c0283d = (C0283d) this.f2492e.get(str);
        if (c0283d != null) {
            InterfaceC0281b interfaceC0281b = c0283d.f4859a;
            if (this.f2491d.contains(str)) {
                interfaceC0281b.b(new C0280a(intent, i4));
                this.f2491d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.f2493g.putParcelable(str, new C0280a(intent, i4));
        return true;
    }

    public final void b(int i3, C0077a c0077a, C0285f c0285f) {
        Bundle bundle;
        int i4;
        k context = this.f2494h;
        kotlin.jvm.internal.j.e(context, "context");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0285f);
        kotlin.jvm.internal.j.d(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        if (putExtra.getExtras() != null && putExtra.getExtras().getClassLoader() == null) {
            putExtra.setExtrasClassLoader(context.getClassLoader());
        }
        if (putExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = putExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            putExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(putExtra.getAction())) {
            String[] stringArrayExtra = putExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (TextUtils.isEmpty(stringArrayExtra[i5])) {
                    throw new IllegalArgumentException(B0.c.l(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i5], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i5));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < stringArrayExtra.length; i7++) {
                    if (!hashSet.contains(Integer.valueOf(i7))) {
                        strArr[i6] = stringArrayExtra[i7];
                        i6++;
                    }
                }
            }
            AbstractC1180a.b(context, stringArrayExtra, i3);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(putExtra.getAction())) {
            context.startActivityForResult(putExtra, i3, bundle2);
            return;
        }
        C0285f c0285f2 = (C0285f) putExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i4 = i3;
            try {
                context.startIntentSenderForResult(c0285f2.f4862a, i4, c0285f2.f4863b, c0285f2.f4864c, c0285f2.f4865d, 0, bundle2);
            } catch (IntentSender.SendIntentException e3) {
                e = e3;
                new Handler(Looper.getMainLooper()).post(new e(this, i4, e));
            }
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            i4 = i3;
        }
    }
}
