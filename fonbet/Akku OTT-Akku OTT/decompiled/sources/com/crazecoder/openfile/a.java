package com.crazecoder.openfile;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.MimeTypes;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.webkit.internal.AssetHelper;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener {

    @Nullable
    public FlutterPlugin.FlutterPluginBinding a;
    public Context b;
    public Activity c;
    public MethodChannel d;
    public MethodChannel.Result e;
    public String f;
    public String i;
    public boolean j = false;

    public final void a() {
        boolean isExternalStorageManager;
        String str;
        String str2;
        String str3;
        boolean isExternalStorageManager2;
        boolean isExternalStorageManager3;
        boolean isExternalStorageManager4;
        String str4 = this.f;
        if (str4 == null) {
            b(-4, "the file path cannot be null");
            return;
        }
        boolean z = false;
        if (!new File(str4).canRead()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                if (i >= 33) {
                    String str5 = this.f;
                    String str6 = this.i;
                    String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath();
                    String path2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getPath();
                    String path3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                    String path4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getPath();
                    String path5 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS).getPath();
                    str = Environment.DIRECTORY_AUDIOBOOKS;
                    String path6 = Environment.getExternalStoragePublicDirectory(str).getPath();
                    String path7 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath();
                    String path8 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getPath();
                    String path9 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS).getPath();
                    String path10 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS).getPath();
                    str2 = Environment.DIRECTORY_RECORDINGS;
                    String path11 = Environment.getExternalStoragePublicDirectory(str2).getPath();
                    String path12 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getPath();
                    str3 = Environment.DIRECTORY_SCREENSHOTS;
                    String[] strArr = {path, path2, path3, path4, path5, path6, path7, path8, path9, path10, path11, path12, Environment.getExternalStoragePublicDirectory(str3).getPath()};
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 13) {
                            break;
                        }
                        if (!str5.contains(strArr[i2])) {
                            i2++;
                        } else if (str6.contains("image/") || str6.contains("video/") || str6.contains("audio/")) {
                            if (this.i.contains("image/") && ContextCompat.checkSelfPermission(this.c, "android.permission.READ_MEDIA_IMAGES") != 0) {
                                isExternalStorageManager4 = Environment.isExternalStorageManager();
                                if (!isExternalStorageManager4) {
                                    b(-3, "Permission denied: android.permission.READ_MEDIA_IMAGES");
                                    return;
                                }
                            }
                            if (this.i.contains("video/") && ContextCompat.checkSelfPermission(this.c, "android.permission.READ_MEDIA_VIDEO") != 0) {
                                isExternalStorageManager3 = Environment.isExternalStorageManager();
                                if (!isExternalStorageManager3) {
                                    b(-3, "Permission denied: android.permission.READ_MEDIA_VIDEO");
                                    return;
                                }
                            }
                            if (this.i.contains("audio/") && ContextCompat.checkSelfPermission(this.c, "android.permission.READ_MEDIA_AUDIO") != 0) {
                                isExternalStorageManager2 = Environment.isExternalStorageManager();
                                if (!isExternalStorageManager2) {
                                    b(-3, "Permission denied: android.permission.READ_MEDIA_AUDIO");
                                    return;
                                }
                            }
                        }
                    }
                }
                isExternalStorageManager = Environment.isExternalStorageManager();
                if (!isExternalStorageManager) {
                    b(-3, "Permission denied: android.permission.MANAGE_EXTERNAL_STORAGE");
                    return;
                }
            } else if (ContextCompat.checkSelfPermission(this.c, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                b(-3, "Permission denied: android.permission.READ_EXTERNAL_STORAGE");
                return;
            }
        }
        if (!"application/vnd.android.package-archive".equals(this.i)) {
            c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                z = this.c.getPackageManager().canRequestPackageInstalls();
            } catch (SecurityException e) {
                e.printStackTrace();
            }
            if (!z) {
                b(-3, "Permission denied: android.permission.REQUEST_INSTALL_PACKAGES");
                return;
            }
        }
        c();
    }

    public final void b(int i, String str) {
        if (this.e == null || this.j) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(i));
        hashMap.put(Constants.MESSAGE, str);
        MethodChannel.Result result = this.e;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        result.success(jSONObject.toString());
        this.j = true;
    }

    public final void c() {
        Uri uriForFile;
        List<ResolveInfo> queryIntentActivities;
        String str;
        PackageManager.ResolveInfoFlags of;
        int i = -4;
        if (this.f == null) {
            b(-4, "the file path cannot be null");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        Context context = this.b;
        String str2 = this.f;
        if (!str2.contains("/Android/data/") || str2.contains(context.getPackageName())) {
            uriForFile = androidx.core.content.FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider.com.crazecoder.openfile", new File(str2));
        } else {
            StringBuilder sb = new StringBuilder("content://com.android.externalstorage.documents/tree/primary%3AAndroid%2Fdata/document/primary%3AAndroid%2Fdata%2F");
            if (str2.endsWith(DomExceptionUtils.SEPARATOR)) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            sb.append(str2.replace("/storage/emulated/0/", "").replace("Android/data/", "").replace(DomExceptionUtils.SEPARATOR, "%2F"));
            uriForFile = Uri.parse(sb.toString());
        }
        intent.setDataAndType(uriForFile, this.i);
        intent.addFlags(268435459);
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = this.c.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = this.c.getPackageManager().queryIntentActivities(intent, 65536);
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            this.c.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
        }
        try {
            this.c.startActivity(intent);
            str = "done";
            i = 0;
        } catch (ActivityNotFoundException unused) {
            i = -1;
            str = "No APP found to open this file。";
        } catch (Exception unused2) {
            str = "File opened incorrectly。";
        }
        b(i, str);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, @Nullable Intent intent) {
        Uri data;
        if (intent != null && i == 273 && (data = intent.getData()) != null) {
            this.b.getContentResolver().takePersistableUriPermission(data, 3);
            a();
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.c = activityPluginBinding.getActivity();
        activityPluginBinding.addActivityResultListener(this);
        if (this.d == null) {
            this.d = new MethodChannel(this.a.getBinaryMessenger(), "open_file");
        }
        this.d.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a = flutterPluginBinding;
        this.b = flutterPluginBinding.getApplicationContext();
        if (this.d == null) {
            this.d = new MethodChannel(this.a.getBinaryMessenger(), "open_file");
        }
        this.d.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a = null;
        MethodChannel methodChannel = this.d;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.d = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x041d, code lost:
    
        if (r8.equals("torrent") == false) goto L21;
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(MethodCall methodCall, @NonNull MethodChannel.Result result) {
        String path;
        char c = 0;
        this.j = false;
        if (!methodCall.method.equals("open_file")) {
            result.notImplemented();
            this.j = true;
            return;
        }
        this.e = result;
        if (methodCall.hasArgument("file_path")) {
            String str = (String) methodCall.argument("file_path");
            if (str == null) {
                path = null;
            } else {
                File file = new File(str);
                try {
                    path = file.getCanonicalPath();
                } catch (IOException unused) {
                    path = file.getPath();
                }
            }
            this.f = path;
        }
        if (!methodCall.hasArgument("type") || methodCall.argument("type") == null) {
            String[] split = this.f.split("\\.");
            String lowerCase = split[split.length - 1].toLowerCase();
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -1137141488:
                    break;
                case 99:
                    if (lowerCase.equals("c")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                    if (lowerCase.equals("h")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 122:
                    if (lowerCase.equals("z")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3315:
                    if (lowerCase.equals("gz")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3401:
                    if (lowerCase.equals("js")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3633:
                    if (lowerCase.equals("rc")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3669:
                    if (lowerCase.equals("sh")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 52316:
                    if (lowerCase.equals("3gp")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 96796:
                    if (lowerCase.equals("apk")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 96884:
                    if (lowerCase.equals("asf")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 96980:
                    if (lowerCase.equals("avi")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 97543:
                    if (lowerCase.equals("bin")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 97669:
                    if (lowerCase.equals("bmp")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 98723:
                    if (lowerCase.equals("cpp")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 98822:
                    if (lowerCase.equals("csv")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 99640:
                    if (lowerCase.equals("doc")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 100882:
                    if (lowerCase.equals("exe")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 102340:
                    if (lowerCase.equals("gif")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 102575:
                    if (lowerCase.equals("gpx")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 103649:
                    if (lowerCase.equals("htm")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 104987:
                    if (lowerCase.equals("jar")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 105441:
                    if (lowerCase.equals("jpg")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 106314:
                    if (lowerCase.equals("kml")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 106447:
                    if (lowerCase.equals("m3u")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 106458:
                    if (lowerCase.equals("m4a")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 106459:
                    if (lowerCase.equals("m4b")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 106473:
                    if (lowerCase.equals("m4p")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 106478:
                    if (lowerCase.equals("m4u")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 106479:
                    if (lowerCase.equals("m4v")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (lowerCase.equals("log")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 108271:
                    if (lowerCase.equals("mp2")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 108272:
                    if (lowerCase.equals("mp3")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 108273:
                    if (lowerCase.equals("mp4")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 108308:
                    if (lowerCase.equals("mov")) {
                        c = Typography.quote;
                        break;
                    }
                    c = 65535;
                    break;
                case 108320:
                    if (lowerCase.equals("mpc")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case 108322:
                    if (lowerCase.equals("mpe")) {
                        c = Typography.dollar;
                        break;
                    }
                    c = 65535;
                    break;
                case 108324:
                    if (lowerCase.equals("mpg")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case 108417:
                    if (lowerCase.equals(NotificationCompat.CATEGORY_MESSAGE)) {
                        c = Typography.amp;
                        break;
                    }
                    c = 65535;
                    break;
                case 109967:
                    if (lowerCase.equals("ogg")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case 110834:
                    if (lowerCase.equals("pdf")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 111145:
                    if (lowerCase.equals("png")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case 111219:
                    if (lowerCase.equals("pps")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 111220:
                    if (lowerCase.equals("ppt")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case 113252:
                    if (lowerCase.equals("rtf")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case 114597:
                    if (lowerCase.equals("tar")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case 114791:
                    if (lowerCase.equals("tgz")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case 115312:
                    if (lowerCase.equals("txt")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case 117484:
                    if (lowerCase.equals("wav")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 117835:
                    if (lowerCase.equals("wma")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case 117856:
                    if (lowerCase.equals("wmv")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case 117946:
                    if (lowerCase.equals("wps")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case 118783:
                    if (lowerCase.equals("xls")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 118807:
                    if (lowerCase.equals("xml")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case 120609:
                    if (lowerCase.equals("zip")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case 3059492:
                    if (lowerCase.equals("conf")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 3088960:
                    if (lowerCase.equals("docx")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 3183070:
                    if (lowerCase.equals("gtar")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case 3213227:
                    if (lowerCase.equals("html")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case 3254818:
                    if (lowerCase.equals("java")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case 3268712:
                    if (lowerCase.equals("jpeg")) {
                        c = Typography.less;
                        break;
                    }
                    c = 65535;
                    break;
                case 3358085:
                    if (lowerCase.equals("mpeg")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case 3358096:
                    if (lowerCase.equals("mpg4")) {
                        c = Typography.greater;
                        break;
                    }
                    c = 65535;
                    break;
                case 3358141:
                    if (lowerCase.equals("mpga")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case 3447940:
                    if (lowerCase.equals("pptx")) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case 3449699:
                    if (lowerCase.equals("prop")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case 3504679:
                    if (lowerCase.equals("rmvb")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case 3682393:
                    if (lowerCase.equals("xlsx")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case 94742904:
                    if (lowerCase.equals(Constants.CLASS)) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str2 = "audio/x-mpeg";
            switch (c) {
                case 0:
                    str2 = "application/x-bittorrent";
                    break;
                case 1:
                case 2:
                case 6:
                case 7:
                case 14:
                case 30:
                case '/':
                case '5':
                case '7':
                case ';':
                case 'A':
                    str2 = AssetHelper.DEFAULT_MIME_TYPE;
                    break;
                case 3:
                    str2 = "application/x-compress";
                    break;
                case 4:
                    str2 = "application/x-gzip";
                    break;
                case 5:
                    str2 = "application/x-javascript";
                    break;
                case '\b':
                    str2 = "video/3gpp";
                    break;
                case '\t':
                    str2 = "application/vnd.android.package-archive";
                    break;
                case '\n':
                    str2 = "video/x-ms-asf";
                    break;
                case 11:
                    str2 = "video/x-msvideo";
                    break;
                case '\f':
                case 17:
                case 'D':
                    str2 = "application/octet-stream";
                    break;
                case '\r':
                    str2 = MimeTypes.IMAGE_BMP;
                    break;
                case 15:
                case '4':
                    str2 = "application/vnd.ms-excel";
                    break;
                case 16:
                    str2 = "application/msword";
                    break;
                case 18:
                    str2 = "image/gif";
                    break;
                case 19:
                    str2 = "application/gpx+xml";
                    break;
                case 20:
                case ':':
                    str2 = "text/html";
                    break;
                case 21:
                    str2 = "application/java-archive";
                    break;
                case 22:
                case '<':
                    str2 = "image/jpeg";
                    break;
                case 23:
                    str2 = "application/vnd.google-earth.kml+xml";
                    break;
                case 24:
                    str2 = "audio/x-mpegurl";
                    break;
                case 25:
                case 26:
                case 27:
                    str2 = "audio/mp4a-latm";
                    break;
                case 28:
                    str2 = "video/vnd.mpegurl";
                    break;
                case 29:
                    str2 = "video/x-m4v";
                    break;
                case 31:
                case ' ':
                    break;
                case '!':
                case '>':
                    str2 = "video/mp4";
                    break;
                case '\"':
                    str2 = "video/quicktime";
                    break;
                case '#':
                    str2 = "application/vnd.mpohun.certificate";
                    break;
                case '$':
                case '%':
                case '=':
                    str2 = "video/mpeg";
                    break;
                case '&':
                    str2 = "application/vnd.ms-outlook";
                    break;
                case '\'':
                    str2 = "audio/ogg";
                    break;
                case '(':
                    str2 = "application/pdf";
                    break;
                case ')':
                    str2 = "image/png";
                    break;
                case '*':
                case '+':
                    str2 = "application/vnd.ms-powerpoint";
                    break;
                case ',':
                    str2 = "application/rtf";
                    break;
                case '-':
                    str2 = "application/x-tar";
                    break;
                case '.':
                    str2 = "application/x-compressed";
                    break;
                case '0':
                    str2 = "audio/x-wav";
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    str2 = "audio/x-ms-wma";
                    break;
                case '2':
                    str2 = "audio/x-ms-wmv";
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    str2 = "application/vnd.ms-works";
                    break;
                case '6':
                    str2 = "application/x-zip-compressed";
                    break;
                case '8':
                    str2 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                    break;
                case '9':
                    str2 = "application/x-gtar";
                    break;
                case '?':
                    str2 = "audio/mpeg";
                    break;
                case '@':
                    str2 = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
                    break;
                case 'B':
                    str2 = "audio/x-pn-realaudio";
                    break;
                case 'C':
                    str2 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                    break;
                default:
                    str2 = "*/*";
                    break;
            }
            this.i = str2;
        } else {
            this.i = (String) methodCall.argument("type");
        }
        a();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
