package A;

import I1.AbstractActivityC0027d;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import e2.C0291f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p0.AbstractC1164b;
import p0.C1163a;

/* loaded from: classes.dex */
public final class e implements C0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10e;
    public final Object f;

    public e(Boolean bool, Boolean bool2, Set set, Map map, String str) {
        this.f8c = bool;
        this.f9d = bool2;
        this.f10e = set;
        this.f = map;
        this.f7b = str;
    }

    public io.flutter.plugin.editing.k a(AbstractActivityC0027d context) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        kotlin.jvm.internal.j.e(context, "context");
        Set set = (Set) this.f10e;
        if (set != null) {
            return new io.flutter.plugin.editing.k(set);
        }
        Set set2 = AbstractC1164b.f10231a;
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse("http://")).addCategory("android.intent.category.BROWSABLE");
        kotlin.jvm.internal.j.d(addCategory, "Intent(ACTION_VIEW, Uri.…ntent.CATEGORY_BROWSABLE)");
        PackageManager pm = context.getPackageManager();
        kotlin.jvm.internal.j.d(pm, "pm");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(131072);
            queryIntentActivities = pm.queryIntentActivities(addCategory, of);
            kotlin.jvm.internal.j.d(queryIntentActivities, "{\n            pm.queryIn…)\n            )\n        }");
        } else {
            queryIntentActivities = pm.queryIntentActivities(addCategory, 131072);
            kotlin.jvm.internal.j.d(queryIntentActivities, "{\n            pm.queryIn…s(intent, flag)\n        }");
        }
        return new io.flutter.plugin.editing.k(u2.f.V(new u2.c(new u2.c(new u2.k(new C0291f(1, queryIntentActivities), C1163a.f), true, C1163a.f10229g), true, new E2.g(2, pm))));
    }

    @Override // c2.a
    public Object get() {
        return new F0.c((Executor) ((c2.a) this.f7b).get(), (B0.g) ((c2.a) this.f8c).get(), (G0.d) ((A0.j) this.f9d).get(), (H0.d) ((c2.a) this.f10e).get(), (I0.c) ((c2.a) this.f).get());
    }

    public String toString() {
        switch (this.f6a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f7b) + ", mProviderPackage: " + ((String) this.f8c) + ", mQuery: " + ((String) this.f9d) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f;
                    if (i3 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i3);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i3++;
                }
            default:
                return super.toString();
        }
    }

    public e(c2.a aVar, c2.a aVar2, A0.j jVar, c2.a aVar3, c2.a aVar4) {
        this.f7b = aVar;
        this.f8c = aVar2;
        this.f9d = jVar;
        this.f10e = aVar3;
        this.f = aVar4;
    }

    public e(String str, String str2, String str3, List list) {
        this.f7b = str;
        this.f8c = str2;
        this.f9d = str3;
        list.getClass();
        this.f = list;
        this.f10e = str + TokenBuilder.TOKEN_DELIMITER + str2 + TokenBuilder.TOKEN_DELIMITER + str3;
    }
}
