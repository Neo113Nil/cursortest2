package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0314i8 implements hq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3460a;

    /* JADX INFO: renamed from: b */
    public final Object f3461b;

    /* JADX INFO: renamed from: c */
    public final Object f3462c;

    public C0314i8(Context context, InterfaceC0261gt interfaceC0261gt) {
        this.f3460a = 1;
        this.f3461b = context.getApplicationContext();
        this.f3462c = interfaceC0261gt;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final boolean mo639a(Object obj) {
        int i = this.f3460a;
        Object obj2 = this.f3461b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    if (((hq0) obj3).mo639a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        gq0 gq0VarMo640b;
        Uri uri;
        int i3 = this.f3460a;
        gq0 gq0VarMo640b2 = null;
        Object obj2 = this.f3461b;
        Object obj3 = this.f3462c;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new gq0(new us0(uri2), ((InterfaceC0277h8) obj3).mo615k((AssetManager) obj2, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) uu0Var.m4955c(a21.f24b);
                return new gq0(new us0(num), new C0223ft(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (InterfaceC0261gt) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                xg0 xg0Var = null;
                for (int i4 = 0; i4 < size; i4++) {
                    hq0 hq0Var = (hq0) arrayList.get(i4);
                    if (hq0Var.mo639a(obj) && (gq0VarMo640b = hq0Var.mo640b(obj, i, i2, uu0Var)) != null) {
                        xg0Var = gq0VarMo640b.f2846a;
                        arrayList2.add(gq0VarMo640b.f2848c);
                    }
                }
                if (arrayList2.isEmpty() || xg0Var == null) {
                    return null;
                }
                return new gq0(xg0Var, new tq0(arrayList2, (kw0) obj3));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((hq0) obj2).mo640b(uri, i, i2, uu0Var);
            default:
                Uri uri3 = (Uri) obj;
                hq0 hq0Var2 = (hq0) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            gq0VarMo640b2 = hq0Var2.mo640b(Integer.valueOf(i5), i, i2, uu0Var);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return gq0VarMo640b2;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return gq0VarMo640b2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return gq0VarMo640b2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return hq0Var2.mo640b(Integer.valueOf(identifier), i, i2, uu0Var);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f3460a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f3461b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0314i8(Resources resources, hq0 hq0Var) {
        this.f3460a = 3;
        this.f3462c = resources;
        this.f3461b = hq0Var;
    }

    public /* synthetic */ C0314i8(int i, Object obj, Object obj2) {
        this.f3460a = i;
        this.f3461b = obj;
        this.f3462c = obj2;
    }

    public C0314i8(Context context, hq0 hq0Var) {
        this.f3460a = 4;
        this.f3461b = context.getApplicationContext();
        this.f3462c = hq0Var;
    }
}
