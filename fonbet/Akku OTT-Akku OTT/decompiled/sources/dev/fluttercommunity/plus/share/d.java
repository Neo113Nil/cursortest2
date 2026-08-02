package dev.fluttercommunity.plus.share;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import androidx.webkit.internal.AssetHelper;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\ndev/fluttercommunity/plus/share/Share\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,249:1\n800#2,11:250\n800#2,11:261\n1855#2:273\n1855#2,2:274\n1856#2:276\n1855#2,2:277\n1#3:272\n13579#4,2:279\n*S KotlinDebug\n*F\n+ 1 Share.kt\ndev/fluttercommunity/plus/share/Share\n*L\n66#1:250,11\n67#1:261,11\n139#1:273\n141#1:274,2\n139#1:276\n175#1:277,2\n233#1:279,2\n*E\n"})
/* loaded from: classes4.dex */
public final class d {
    public final Context a;
    public Activity b;
    public final f c;
    public final Lazy d;
    public final Lazy e;

    public d(Context context, f manager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.a = context;
        this.b = null;
        this.c = manager;
        this.d = LazyKt.lazy(new Function0() { // from class: dev.fluttercommunity.plus.share.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d dVar = d.this;
                Context context2 = dVar.b;
                if (context2 != null) {
                    Intrinsics.checkNotNull(context2);
                } else {
                    context2 = dVar.a;
                }
                return androidx.compose.runtime.changelist.d.b(context2.getPackageName(), ".flutter.share_provider");
            }
        });
        this.e = LazyKt.lazy(new c());
    }

    public static String a(String str) {
        boolean contains$default;
        int indexOf$default;
        if (str == null) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        contains$default = StringsKt__StringsKt.contains$default(str, DomExceptionUtils.SEPARATOR, false, 2, (Object) null);
        if (!contains$default) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        indexOf$default = StringsKt__StringsKt.indexOf$default(str, DomExceptionUtils.SEPARATOR, 0, false, 6, (Object) null);
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final File b() {
        Context context = this.b;
        if (context != null) {
            Intrinsics.checkNotNull(context);
        } else {
            context = this.a;
        }
        return new File(context.getCacheDir(), "share_plus");
    }

    public final void c(Map arguments) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<? extends Parcelable> arrayList3;
        String str;
        String str2;
        MethodChannel.Result result;
        boolean z;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        File b = b();
        File[] listFiles = b.listFiles();
        if (b.exists() && listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                file.delete();
            }
            b.delete();
        }
        String str3 = (String) arguments.get("text");
        String str4 = (String) arguments.get("uri");
        String str5 = (String) arguments.get("subject");
        String str6 = (String) arguments.get("title");
        List list = (List) arguments.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) arguments.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        Context context = this.a;
        if (arrayList != null) {
            arrayList3 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file2 = new File((String) it.next());
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    Intrinsics.checkNotNull(canonicalPath);
                    String canonicalPath2 = b().getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath2, "getCanonicalPath(...)");
                    z = StringsKt__StringsJVMKt.startsWith$default(canonicalPath, canonicalPath2, false, 2, null);
                } catch (IOException unused) {
                    z = false;
                }
                if (z) {
                    throw new IOException(android.support.v4.media.b.b("Shared file can not be located in '", b().getCanonicalPath(), "'"));
                }
                File b2 = b();
                if (!b2.exists()) {
                    b2.mkdirs();
                }
                File file3 = new File(b2, file2.getName());
                FilesKt__UtilsKt.copyTo$default(file2, file3, true, 0, 4, null);
                Context context2 = this.b;
                if (context2 != null) {
                    Intrinsics.checkNotNull(context2);
                } else {
                    context2 = context;
                }
                arrayList3.add(FileProvider.getUriForFile(context2, (String) this.d.getValue(), file3));
            }
        } else {
            arrayList3 = null;
        }
        Intent intent = new Intent();
        if (arrayList3 == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            if (str4 != null) {
                str3 = str4;
            }
            intent.putExtra("android.intent.extra.TEXT", str3);
            if (!(str5 == null || StringsKt.isBlank(str5))) {
                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str5);
            }
            if (!(str6 == null || StringsKt.isBlank(str6))) {
                intent.putExtra("android.intent.extra.TITLE", str6);
            }
        } else {
            if (arrayList3.isEmpty()) {
                throw new IOException("Error sharing files: No files found");
            }
            str = "*/*";
            if (arrayList3.size() == 1) {
                str = arrayList2 == null || arrayList2.isEmpty() ? "*/*" : (String) CollectionsKt.first((List) arrayList2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) CollectionsKt.first((List) arrayList3));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (arrayList2.size() == 1) {
                        str = (String) CollectionsKt.first((List) arrayList2);
                    } else {
                        str2 = (String) CollectionsKt.first((List) arrayList2);
                        int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                        if (1 <= lastIndex) {
                            int i = 1;
                            while (true) {
                                if (!Intrinsics.areEqual(str2, arrayList2.get(i))) {
                                    if (!Intrinsics.areEqual(a(str2), a((String) arrayList2.get(i)))) {
                                        break;
                                    } else {
                                        str2 = androidx.compose.runtime.changelist.d.b(a((String) arrayList2.get(i)), "/*");
                                    }
                                }
                                if (i == lastIndex) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        intent.setType(str2);
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                    }
                }
                str2 = str;
                intent.setType(str2);
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
            }
            if (!(str3 == null || StringsKt.isBlank(str3))) {
                intent.putExtra("android.intent.extra.TEXT", str3);
            }
            if (!(str5 == null || StringsKt.isBlank(str5))) {
                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str5);
            }
            if (!(str6 == null || StringsKt.isBlank(str6))) {
                intent.putExtra("android.intent.extra.TITLE", str6);
            }
            intent.addFlags(1);
        }
        Intent createChooser = Intent.createChooser(intent, str6, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) this.e.getValue()).intValue() | 134217728).getIntentSender());
        if (arrayList3 != null) {
            Context context3 = this.b;
            if (context3 != null) {
                Intrinsics.checkNotNull(context3);
            } else {
                context3 = context;
            }
            List<ResolveInfo> queryIntentActivities = context3.getPackageManager().queryIntentActivities(createChooser, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it2 = queryIntentActivities.iterator();
            while (it2.hasNext()) {
                String str7 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                Iterator<T> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Uri uri = (Uri) it3.next();
                    Context context4 = this.b;
                    if (context4 != null) {
                        Intrinsics.checkNotNull(context4);
                    } else {
                        context4 = context;
                    }
                    context4.grantUriPermission(str7, uri, 3);
                }
            }
        }
        Intrinsics.checkNotNull(createChooser);
        Activity activity = this.b;
        if (activity != null) {
            Intrinsics.checkNotNull(activity);
            activity.startActivityForResult(createChooser, 22643);
            return;
        }
        createChooser.addFlags(268435456);
        f fVar = this.c;
        if (fVar.b.compareAndSet(false, true) && (result = fVar.a) != null) {
            Intrinsics.checkNotNull(result);
            result.success("dev.fluttercommunity.plus/share/unavailable");
            fVar.a = null;
        }
        context.startActivity(createChooser);
    }
}
