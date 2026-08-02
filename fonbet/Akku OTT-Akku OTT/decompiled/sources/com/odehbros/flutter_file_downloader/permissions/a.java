package com.odehbros.flutter_file_downloader.permissions;

import android.app.Activity;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.media3.common.G;
import com.odehbros.flutter_file_downloader.e;
import com.odehbros.flutter_file_downloader.f;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a implements PluginRegistry.RequestPermissionsResultListener {
    public Activity a;
    public com.odehbros.flutter_file_downloader.b b;
    public G c;

    public final b a(String str) {
        boolean equals = str.equals("android.permission.WRITE_EXTERNAL_STORAGE");
        b bVar = b.c;
        return (!equals || Build.VERSION.SDK_INT < 29) ? ContextCompat.checkSelfPermission(this.a, str) == 0 ? bVar : c.a(this.a, str) ? b.a : b.b : bVar;
    }

    public final void b(com.odehbros.flutter_file_downloader.b bVar, G g) throws com.odehbros.flutter_file_downloader.errors.b {
        if (this.a == null) {
            MethodChannel.Result result = ((f) g.b).d;
            com.odehbros.flutter_file_downloader.errors.a aVar = com.odehbros.flutter_file_downloader.errors.a.a;
            result.error(aVar.toString(), aVar.a(), null);
            return;
        }
        this.c = g;
        this.b = bVar;
        int i = Build.VERSION.SDK_INT;
        b bVar2 = b.c;
        if (i < 29 && a("android.permission.WRITE_EXTERNAL_STORAGE") != bVar2) {
            ActivityCompat.requestPermissions(this.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 8137);
        }
        if (a("android.permission.POST_NOTIFICATIONS") == bVar2) {
            return;
        }
        ActivityCompat.requestPermissions(this.a, new String[]{"android.permission.POST_NOTIFICATIONS"}, 8137);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 0;
        if (i == 8137) {
            Activity activity = this.a;
            if (activity == null) {
                G g = this.c;
                if (g != null) {
                    MethodChannel.Result result = ((f) g.b).d;
                    com.odehbros.flutter_file_downloader.errors.a aVar = com.odehbros.flutter_file_downloader.errors.a.a;
                    result.error(aVar.toString(), aVar.a(), null);
                    return false;
                }
            } else {
                try {
                    boolean a = c.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
                    if (!a) {
                        throw new com.odehbros.flutter_file_downloader.errors.b();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (a) {
                        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    }
                    if (iArr.length != 0) {
                        Iterator it = arrayList.iterator();
                        char c = 65535;
                        boolean z = false;
                        boolean z2 = false;
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            int indexOf = Arrays.asList(strArr).indexOf(str);
                            if (indexOf >= 0) {
                                z = true;
                            }
                            if (iArr[indexOf] == 0) {
                                c = 0;
                            }
                            if (ActivityCompat.shouldShowRequestPermissionRationale(this.a, str)) {
                                z2 = true;
                            }
                        }
                        if (z) {
                            b bVar = b.c;
                            b bVar2 = c == 0 ? bVar : !z2 ? b.b : b.a;
                            com.odehbros.flutter_file_downloader.b bVar3 = this.b;
                            if (bVar3 != null) {
                                e eVar = bVar3.a;
                                boolean z3 = bVar3.b;
                                f fVar = bVar3.c;
                                HashMap hashMap = eVar.d;
                                if (z3) {
                                    MethodChannel.Result result2 = fVar.d;
                                    int ordinal = bVar2.ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal != 1) {
                                            i2 = 2;
                                            if (ordinal != 2) {
                                                throw new IndexOutOfBoundsException();
                                            }
                                        } else {
                                            i2 = 1;
                                        }
                                    }
                                    result2.success(Integer.valueOf(i2));
                                    hashMap.remove(fVar.c.argument(Constants.KEY));
                                    return true;
                                }
                                if (bVar2 != bVar) {
                                    MethodChannel.Result result3 = fVar.d;
                                    com.odehbros.flutter_file_downloader.errors.a aVar2 = com.odehbros.flutter_file_downloader.errors.a.c;
                                    result3.error(aVar2.toString(), aVar2.a(), null);
                                    hashMap.remove(fVar.c.argument(Constants.KEY));
                                    return true;
                                }
                                eVar.onMethodCall(fVar.c, fVar.d);
                            }
                            return true;
                        }
                    }
                } catch (com.odehbros.flutter_file_downloader.errors.b unused) {
                    G g2 = this.c;
                    if (g2 != null) {
                        MethodChannel.Result result4 = ((f) g2.b).d;
                        com.odehbros.flutter_file_downloader.errors.a aVar3 = com.odehbros.flutter_file_downloader.errors.a.b;
                        result4.error(aVar3.toString(), aVar3.a(), null);
                    }
                }
            }
        }
        return false;
    }
}
