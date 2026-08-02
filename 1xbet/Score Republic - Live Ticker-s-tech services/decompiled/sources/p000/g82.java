package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g82 {

    /* JADX INFO: renamed from: a */
    public final HashMap f2649a;

    /* JADX INFO: renamed from: b */
    public final HashMap f2650b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2651c;

    public g82(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f2649a = new HashMap();
        this.f2650b = new HashMap();
        this.f2651c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w82 w82Var = (w82) it.next();
            if (TextUtils.isEmpty(w82Var.mo2570f())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                w82 w82Var2 = (w82) this.f2649a.put(w82Var.mo2570f(), w82Var);
                if (w82Var2 != null) {
                    String canonicalName = w82Var2.getClass().getCanonicalName();
                    String canonicalName2 = w82Var.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw AbstractC0024an.m280c(it2);
        }
        this.f2651c.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final Object m1999a(Uri uri, f82 f82Var) {
        return f82Var.mo79c(m2000b(uri));
    }

    /* JADX INFO: renamed from: b */
    public final e82 m2000b(Uri uri) throws C0287hi {
        mc0 mc0VarM4056l = qc0.m4056l();
        mc0 mc0VarM4056l2 = qc0.m4056l();
        String encodedFragment = uri.getEncodedFragment();
        List listM4057p = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? q01.f6303n : qc0.m4057p(new q91(new r91(new jg0(14, new C0173eg("+".charAt(0))), true, C0248gg.f2721k, Integer.MAX_VALUE), encodedFragment.substring(10)));
        int size = listM4057p.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listM4057p.get(i);
            Matcher matcher = t82.f7355a.matcher(str);
            if (!matcher.matches()) {
                C0270h1.m2190f("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            mc0VarM4056l2.m3004a(matcher.group(1));
        }
        q01 q01VarM3374d = mc0VarM4056l2.m3374d();
        if (q01VarM3374d.f6305m > 0) {
            String str2 = (String) q01VarM3374d.get(0);
            if (this.f2650b.get(str2) != null) {
                dd0.m1158c();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(str2.length() + 40 + strValueOf.length());
            sb.append("Requested transform isn't registered: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(strValueOf);
            throw new C0287hi(sb.toString());
        }
        qc0 qc0VarMo3680s = mc0VarM4056l.m3374d().mo3680s();
        e82 e82Var = new e82();
        String scheme = uri.getScheme();
        w82 w82Var = (w82) this.f2649a.get(scheme);
        if (w82Var == null) {
            throw new C0287hi(AbstractC0024an.m283f("Requested backend isn't registered: ", scheme));
        }
        e82Var.f2013a = w82Var;
        e82Var.f2015c = this.f2651c;
        e82Var.f2014b = qc0VarMo3680s;
        if (!qc0VarMo3680s.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = qc0VarMo3680s.listIterator(qc0VarMo3680s.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        dd0.m1158c();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        e82Var.f2016d = uri;
        e82 e82Var2 = new e82();
        e82Var2.f2013a = e82Var.f2013a;
        e82Var2.f2014b = e82Var.f2014b;
        e82Var2.f2015c = e82Var.f2015c;
        e82Var2.f2016d = e82Var.f2016d;
        return e82Var2;
    }
}
