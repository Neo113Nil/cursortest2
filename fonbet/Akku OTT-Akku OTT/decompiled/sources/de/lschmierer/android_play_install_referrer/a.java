package de.lschmierer.android_play_install_referrer;

import com.android.installreferrer.api.InstallReferrerStateListener;
import io.flutter.plugin.common.MethodChannel;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class a implements InstallReferrerStateListener {
    public final /* synthetic */ AndroidPlayInstallReferrerPlugin a;

    public a(AndroidPlayInstallReferrerPlugin androidPlayInstallReferrerPlugin) {
        this.a = androidPlayInstallReferrerPlugin;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void a(int i) {
        AndroidPlayInstallReferrerPlugin androidPlayInstallReferrerPlugin = this.a;
        synchronized (androidPlayInstallReferrerPlugin) {
            try {
                if (i == -1) {
                    androidPlayInstallReferrerPlugin.f = new Pair<>("SERVICE_DISCONNECTED", "Play Store service is not connected now - potentially transient state.");
                } else if (i == 0) {
                    com.android.installreferrer.api.a aVar = androidPlayInstallReferrerPlugin.d;
                    if (aVar != null) {
                        androidPlayInstallReferrerPlugin.e = aVar.b();
                    } else {
                        androidPlayInstallReferrerPlugin.f = new Pair<>("BAD_STATE", "Result is null.");
                    }
                } else if (i == 1) {
                    androidPlayInstallReferrerPlugin.f = new Pair<>("SERVICE_UNAVAILABLE", "Connection couldn't be established.");
                } else if (i == 2) {
                    androidPlayInstallReferrerPlugin.f = new Pair<>("FEATURE_NOT_SUPPORTED", "API not available on the current Play Store app.");
                } else if (i == 3) {
                    androidPlayInstallReferrerPlugin.f = new Pair<>("DEVELOPER_ERROR", "General errors caused by incorrect usage.");
                } else if (i != 4) {
                    androidPlayInstallReferrerPlugin.f = new Pair<>("UNKNOWN_ERROR", "InstallReferrerClient returned unknown response code.");
                } else {
                    androidPlayInstallReferrerPlugin.f = new Pair<>("PERMISSION_ERROR", "App is not allowed to bind to the Service.");
                }
                synchronized (androidPlayInstallReferrerPlugin) {
                    try {
                        Iterator<MethodChannel.Result> it = androidPlayInstallReferrerPlugin.c.iterator();
                        while (it.hasNext()) {
                            androidPlayInstallReferrerPlugin.a(it.next());
                        }
                        androidPlayInstallReferrerPlugin.c.clear();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.android.installreferrer.api.a aVar2 = androidPlayInstallReferrerPlugin.d;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void b() {
    }
}
