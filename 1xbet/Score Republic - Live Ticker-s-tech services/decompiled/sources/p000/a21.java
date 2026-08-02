package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a21 implements y11 {

    /* JADX INFO: renamed from: b */
    public static final ru0 f24b = new ru0("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, ru0.f6969e);

    /* JADX INFO: renamed from: a */
    public final Context f25a;

    public a21(Context context) {
        this.f25a = context.getApplicationContext();
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        return m20c((Uri) obj, uu0Var);
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final boolean mo19b(Object obj, uu0 uu0Var) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX INFO: renamed from: c */
    public final v11 m20c(Uri uri, uu0 uu0Var) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            C0042ay.m526c(uri, " is null or empty", "Package name for ");
            return null;
        }
        Context context = this.f25a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                dd0.m1167m(uri, "Failed to find resource id for: ");
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                dd0.m1167m(uri, "Unrecognized Uri format: ");
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) uu0Var.m4955c(f24b) : null;
        Drawable drawableM5768g = theme == null ? yd0.m5768g(context, contextCreatePackageContext, identifier, null) : yd0.m5768g(context, context, identifier, theme);
        if (drawableM5768g != null) {
            return new c80(drawableM5768g, 1);
        }
        return null;
    }
}
