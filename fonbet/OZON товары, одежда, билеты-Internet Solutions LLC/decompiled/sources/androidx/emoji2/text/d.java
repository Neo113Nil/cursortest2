package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import v2.C10190e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final e f42686a;

    public d() {
        this.f42686a = Build.VERSION.SDK_INT >= 28 ? new g() : new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q a(@NonNull Context context) {
        ProviderInfo providerInfo;
        C10190e c10190e;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        x2.i.e(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        e eVar = this.f42686a;
        Iterator it = eVar.c(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = eVar.a((ResolveInfo) it.next());
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] b11 = eVar.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : b11) {
                    arrayList.add(signature.toByteArray());
                }
                c10190e = new C10190e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e11) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e11);
            }
            if (c10190e != null) {
                return null;
            }
            return new q(context, c10190e);
        }
        c10190e = null;
        if (c10190e != null) {
        }
    }
}
