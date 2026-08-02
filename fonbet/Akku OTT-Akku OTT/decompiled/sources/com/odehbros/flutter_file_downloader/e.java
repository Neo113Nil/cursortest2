package com.odehbros.flutter_file_downloader;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.G;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.odehbros.flutter_file_downloader.downloader.g;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class e implements MethodChannel.MethodCallHandler {
    public final com.odehbros.flutter_file_downloader.permissions.a a;

    @Nullable
    public Activity b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    @Nullable
    public MethodChannel e;

    public e(com.odehbros.flutter_file_downloader.permissions.a aVar) {
        this.a = aVar;
    }

    public final f a(long j) {
        String valueOf = String.valueOf(j);
        HashMap hashMap = this.d;
        for (String str : hashMap.keySet()) {
            if (androidx.compose.runtime.changelist.d.b(valueOf, "").equals(((f) hashMap.get(str)).a + "")) {
                return (f) hashMap.get(str);
            }
        }
        return null;
    }

    public final void b(f fVar, boolean z) {
        try {
            this.a.b(new b(this, z, fVar), new G(fVar, 4));
        } catch (com.odehbros.flutter_file_downloader.errors.b unused) {
            MethodChannel.Result result = fVar.d;
            com.odehbros.flutter_file_downloader.errors.a aVar = com.odehbros.flutter_file_downloader.errors.a.b;
            result.error(aVar.toString(), aVar.a(), null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d5  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
        char c;
        com.odehbros.flutter_file_downloader.core.b bVar;
        com.odehbros.flutter_file_downloader.core.c cVar;
        com.odehbros.flutter_file_downloader.core.d dVar;
        String lowerCase;
        Activity activity;
        com.odehbros.flutter_file_downloader.downloader.e eVar;
        int ordinal;
        com.odehbros.flutter_file_downloader.downloader.e gVar;
        char c2;
        f fVar = new f();
        fVar.c = methodCall;
        fVar.d = result;
        this.d.put((String) methodCall.argument(Constants.KEY), fVar);
        String str = methodCall.method;
        str.getClass();
        int i = 1;
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1841475917:
                if (str.equals("onStartDownloadingFile")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1406748165:
                if (str.equals("writeFile")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -503430878:
                if (str.equals("cancelDownload")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1108651556:
                if (str.equals("downloadFile")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        File file = null;
        switch (c) {
            case 0:
            case 4:
                if (this.a.a("android.permission.WRITE_EXTERNAL_STORAGE") != com.odehbros.flutter_file_downloader.permissions.b.c) {
                    b(fVar, false);
                    return;
                }
                String str2 = (String) methodCall.argument("url");
                String str3 = (String) methodCall.argument("name");
                String str4 = (String) methodCall.argument(Constants.KEY);
                String str5 = (String) methodCall.argument("subPath");
                String str6 = (String) methodCall.argument("download_destination");
                String str7 = (String) methodCall.argument("download_service");
                String str8 = (String) methodCall.argument("method_type");
                String str9 = (String) methodCall.argument("notifications");
                Map map = (Map) methodCall.argument("headers");
                Activity activity2 = this.b;
                String lowerCase2 = str9.toLowerCase();
                lowerCase2.getClass();
                switch (lowerCase2.hashCode()) {
                    case 96673:
                        if (lowerCase2.equals("all")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 109935:
                        if (lowerCase2.equals("off")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 270940796:
                        if (lowerCase2.equals("disabled")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 718406489:
                        if (lowerCase2.equals("progressonly")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 781019774:
                        if (lowerCase2.equals("progress_only")) {
                            c3 = 4;
                            break;
                        }
                        break;
                    case 1147450760:
                        if (lowerCase2.equals("completiononly")) {
                            c2 = 5;
                            c3 = c2;
                            break;
                        }
                        break;
                    case 1196490287:
                        if (lowerCase2.equals("completion_only")) {
                            c2 = 6;
                            c3 = c2;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                        bVar = com.odehbros.flutter_file_downloader.core.b.a;
                        break;
                    case 1:
                    case 2:
                        bVar = com.odehbros.flutter_file_downloader.core.b.d;
                        break;
                    case 3:
                    case 4:
                        bVar = com.odehbros.flutter_file_downloader.core.b.b;
                        break;
                    case 5:
                    case 6:
                        bVar = com.odehbros.flutter_file_downloader.core.b.c;
                        break;
                    default:
                        bVar = null;
                        break;
                }
                String lowerCase3 = str6.toLowerCase();
                lowerCase3.getClass();
                com.odehbros.flutter_file_downloader.downloadDestination.b aVar = !lowerCase3.equals("publicdownloads") ? !lowerCase3.equals("appfiles") ? null : new com.odehbros.flutter_file_downloader.downloadDestination.a(activity2, str5) : new com.odehbros.flutter_file_downloader.downloadDestination.c(str5);
                String lowerCase4 = str8.toLowerCase();
                lowerCase4.getClass();
                boolean equals = lowerCase4.equals("get");
                com.odehbros.flutter_file_downloader.core.c cVar2 = com.odehbros.flutter_file_downloader.core.c.a;
                com.odehbros.flutter_file_downloader.core.d dVar2 = com.odehbros.flutter_file_downloader.core.d.a;
                if (equals) {
                    cVar = cVar2;
                } else {
                    if (lowerCase4.equals("post")) {
                        cVar = com.odehbros.flutter_file_downloader.core.c.b;
                        dVar = dVar2;
                        lowerCase = str7.toLowerCase();
                        lowerCase.getClass();
                        if (lowerCase.equals("downloadmanager")) {
                            if (!lowerCase.equals("httpconnection")) {
                                activity = activity2;
                                dVar2 = dVar;
                                d dVar3 = new d(this, fVar, str4);
                                if (activity != null && !TextUtils.isEmpty(str2) && aVar != null) {
                                    ordinal = dVar2.ordinal();
                                    if (ordinal != 0) {
                                        gVar = new g(activity, str2, str3, bVar, aVar, dVar3, map, fVar);
                                    } else if (ordinal == 1) {
                                        gVar = new com.odehbros.flutter_file_downloader.downloader.d(activity, str2, str3, bVar, aVar, dVar3, map, fVar);
                                    }
                                    eVar = gVar;
                                    fVar.b = eVar;
                                    eVar.a();
                                    eVar.f();
                                    eVar.c();
                                    return;
                                }
                                eVar = null;
                                fVar.b = eVar;
                                eVar.a();
                                eVar.f();
                                eVar.c();
                                return;
                            }
                        } else if (cVar == cVar2) {
                            dVar2 = com.odehbros.flutter_file_downloader.core.d.b;
                        }
                        activity = activity2;
                        d dVar32 = new d(this, fVar, str4);
                        if (activity != null) {
                            ordinal = dVar2.ordinal();
                            if (ordinal != 0) {
                            }
                            eVar = gVar;
                            fVar.b = eVar;
                            eVar.a();
                            eVar.f();
                            eVar.c();
                            return;
                        }
                        eVar = null;
                        fVar.b = eVar;
                        eVar.a();
                        eVar.f();
                        eVar.c();
                        return;
                    }
                    cVar = null;
                }
                dVar = null;
                lowerCase = str7.toLowerCase();
                lowerCase.getClass();
                if (lowerCase.equals("downloadmanager")) {
                }
                activity = activity2;
                d dVar322 = new d(this, fVar, str4);
                if (activity != null) {
                }
                eVar = null;
                fVar.b = eVar;
                eVar.a();
                eVar.f();
                eVar.c();
                return;
            case 1:
                String str10 = (String) methodCall.argument(Constants.KEY);
                String str11 = (String) methodCall.argument(FirebaseAnalytics.Param.CONTENT);
                String str12 = (String) methodCall.argument("name");
                String str13 = (String) methodCall.argument("extension");
                String str14 = (String) methodCall.argument("download_destination");
                String str15 = (String) methodCall.argument("subPath");
                com.odehbros.flutter_file_downloader.downloadDestination.b cVar3 = new com.odehbros.flutter_file_downloader.downloadDestination.c(str15);
                if (str14.equalsIgnoreCase("appfiles")) {
                    cVar3 = new com.odehbros.flutter_file_downloader.downloadDestination.a(this.b, str15);
                }
                c cVar4 = new c(this, fVar, str10);
                String absolutePath = cVar3.a().getAbsolutePath();
                if (!TextUtils.isEmpty(str15)) {
                    absolutePath = android.support.v4.media.session.f.b(cVar3.a().getAbsolutePath(), DomExceptionUtils.SEPARATOR, str15);
                }
                byte[] decode = Base64.decode(str11, 0);
                String b = android.support.v4.media.session.f.b(str12, ".", str13.replace(".", ""));
                cVar4.c(b, 0.0d);
                try {
                    File file2 = new File(com.odehbros.flutter_file_downloader.fileStore.a.a(absolutePath, str12, str13));
                    cVar4.c(b, 20.0d);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    cVar4.c(b, 40.0d);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    cVar4.c(b, 60.0d);
                    try {
                        try {
                            bufferedOutputStream.write(decode);
                            cVar4.c(b, 80.0d);
                            cVar4.c(b, 100.0d);
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            cVar4.a(file2.getPath());
                            file = file2;
                        } catch (Throwable th) {
                            cVar4.c(b, 100.0d);
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            cVar4.a(file2.getPath());
                            throw th;
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        cVar4.b(e3.getLocalizedMessage());
                        cVar4.c(b, 100.0d);
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        cVar4.a(file2.getPath());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    cVar4.b(e5.getLocalizedMessage());
                }
                this.b.runOnUiThread(new androidx.fragment.app.strictmode.b(i, file, fVar));
                return;
            case 2:
                Long valueOf = Long.valueOf((String) methodCall.argument("id"));
                long longValue = valueOf.longValue();
                com.odehbros.flutter_file_downloader.core.a aVar2 = (com.odehbros.flutter_file_downloader.core.a) this.c.get(valueOf);
                f a = a(longValue);
                if (aVar2 == null && a == null) {
                    result.error("Download task not found", androidx.core.database.a.c(longValue, "Could not find an active download task with id "), null);
                    return;
                } else if (a.b.b(longValue)) {
                    result.success(Boolean.TRUE);
                    return;
                } else {
                    result.error("Cancel download failed", "Cancel download failed due to unknown error!", null);
                    return;
                }
            case 3:
                b(fVar, true);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
