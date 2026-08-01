package bolts;

import android.net.Uri;

/* loaded from: classes5.dex */
public interface AppLinkResolver {
    Task<AppLink> getAppLinkFromUrlInBackground(Uri uri);
}
