package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f37248a;

    public static a b(Context context) {
        a aVar = new a();
        aVar.f37248a = context;
        return aVar;
    }

    public final boolean a() {
        return this.f37248a.getApplicationInfo().targetSdkVersion < 14;
    }

    public final int c() {
        return this.f37248a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public final int d() {
        Configuration configuration = this.f37248a.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600) {
            return 5;
        }
        if (i11 > 960 && i12 > 720) {
            return 5;
        }
        if (i11 > 720 && i12 > 960) {
            return 5;
        }
        if (i11 >= 500) {
            return 4;
        }
        if (i11 > 640 && i12 > 480) {
            return 4;
        }
        if (i11 <= 480 || i12 <= 640) {
            return i11 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final boolean e() {
        return this.f37248a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
