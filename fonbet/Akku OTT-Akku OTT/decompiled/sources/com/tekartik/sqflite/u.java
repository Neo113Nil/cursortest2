package com.tekartik.sqflite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import androidx.media3.exoplayer.source.preload.RunnableC0436b;
import com.tekartik.sqflite.operation.b;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class u implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public static String j;
    public static h n;
    public Context a;
    public MethodChannel b;
    public static final HashMap c = new HashMap();

    @SuppressLint({"UseSparseArrays"})
    public static final HashMap d = new HashMap();
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static int i = 0;
    public static int k = 0;
    public static int l = 1;
    public static int m = 0;

    public static void a(u uVar, d dVar) {
        try {
            if (dVar.d >= 1) {
                dVar.g();
            }
            HashMap hashMap = dVar.g;
            if (!hashMap.isEmpty() && dVar.d >= 1) {
                dVar.g();
                hashMap.size();
            }
            dVar.i.close();
        } catch (Exception e2) {
            e2.toString();
        }
        synchronized (e) {
            try {
                if (d.isEmpty() && n != null) {
                    if (dVar.d >= 1) {
                        dVar.g();
                    }
                    n.a();
                    n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static d b(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument("id");
        int intValue = num.intValue();
        d dVar = (d) d.get(num);
        if (dVar != null) {
            return dVar;
        }
        result.error("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i2, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        if (z) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.a = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a = null;
        this.b.setMethodCallHandler(null);
        this.b = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(final MethodCall methodCall, final MethodChannel.Result result) {
        final int i2;
        d dVar;
        String str = methodCall.method;
        str.getClass();
        int i3 = 1;
        boolean z = false;
        Object[] objArr = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c2 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c2 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c2 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c2 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c2 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c2 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c2 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c2 = 15;
                    break;
                }
                break;
        }
        d dVar2 = null;
        switch (c2) {
            case 0:
                d b = b(methodCall, result);
                if (b == null) {
                    return;
                }
                n.c(b, new p(methodCall, result, b, 0));
                return;
            case 1:
                Integer num = (Integer) methodCall.argument("id");
                num.getClass();
                d b2 = b(methodCall, result);
                if (b2 == null) {
                    return;
                }
                if (b2.d >= 1) {
                    b2.g();
                }
                String str2 = b2.b;
                synchronized (e) {
                    try {
                        d.remove(num);
                        if (b2.a) {
                            c.remove(str2);
                        }
                    } finally {
                    }
                }
                n.c(b2, new s(this, b2, result));
                return;
            case 2:
                Object argument = methodCall.argument("androidThreadPriority");
                if (argument != null) {
                    k = ((Integer) argument).intValue();
                }
                Object argument2 = methodCall.argument("androidThreadCount");
                if (argument2 != null && !argument2.equals(Integer.valueOf(l))) {
                    l = ((Integer) argument2).intValue();
                    h hVar = n;
                    if (hVar != null) {
                        hVar.a();
                        n = null;
                    }
                }
                Integer num2 = (Integer) methodCall.argument("logLevel");
                if (num2 != null) {
                    i = num2.intValue();
                }
                result.success(null);
                return;
            case 3:
                final d b3 = b(methodCall, result);
                if (b3 == null) {
                    return;
                }
                n.c(b3, new Runnable() { // from class: com.tekartik.sqflite.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        HashMap hashMap = u.c;
                        com.tekartik.sqflite.operation.c cVar = new com.tekartik.sqflite.operation.c(methodCall, result);
                        d dVar3 = b3;
                        dVar3.k(cVar, new androidx.fragment.app.strictmode.a(2, dVar3, cVar));
                    }
                });
                return;
            case 4:
                d b4 = b(methodCall, result);
                if (b4 == null) {
                    return;
                }
                n.c(b4, new q(methodCall, result, b4, objArr == true ? 1 : 0));
                return;
            case 5:
                final d b5 = b(methodCall, result);
                if (b5 == null) {
                    return;
                }
                n.c(b5, new Runnable() { // from class: com.tekartik.sqflite.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar3 = b5;
                        MethodChannel.Result result2 = result;
                        HashMap hashMap = u.c;
                        try {
                            dVar3.i.setLocale(Locale.forLanguageTag((String) methodCall.argument("locale")));
                            result2.success(null);
                        } catch (Exception e2) {
                            result2.error("sqlite_error", "Error calling setLocale: " + e2.getMessage(), null);
                        }
                    }
                });
                return;
            case 6:
                String str3 = (String) methodCall.argument("path");
                synchronized (e) {
                    try {
                        if (com.baseflow.permissionhandler.a.b(i)) {
                            Objects.toString(c.keySet());
                        }
                        HashMap hashMap = c;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = d;
                            d dVar3 = (d) hashMap2.get(num3);
                            if (dVar3 != null && dVar3.i.isOpen()) {
                                if (com.baseflow.permissionhandler.a.b(i)) {
                                    dVar3.g();
                                    dVar3.i();
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                dVar2 = dVar3;
                            }
                        }
                    } finally {
                    }
                }
                t tVar = new t(this, dVar2, str3, result);
                h hVar2 = n;
                if (hVar2 != null) {
                    hVar2.c(dVar2, tVar);
                    return;
                } else {
                    tVar.run();
                    return;
                }
            case 7:
                boolean equals = Boolean.TRUE.equals(methodCall.arguments());
                if (!equals) {
                    i = 0;
                } else if (equals) {
                    i = 1;
                }
                result.success(null);
                return;
            case '\b':
                final String str4 = (String) methodCall.argument("path");
                final Boolean bool = (Boolean) methodCall.argument("readOnly");
                boolean z2 = str4 == null || str4.equals(":memory:");
                boolean z3 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || z2) ? false : true;
                if (z3) {
                    synchronized (e) {
                        try {
                            if (com.baseflow.permissionhandler.a.b(i)) {
                                Objects.toString(c.keySet());
                            }
                            Integer num4 = (Integer) c.get(str4);
                            if (num4 != null && (dVar = (d) d.get(num4)) != null) {
                                if (dVar.i.isOpen()) {
                                    if (com.baseflow.permissionhandler.a.b(i)) {
                                        dVar.g();
                                        dVar.i();
                                    }
                                    result.success(c(num4.intValue(), true, dVar.i()));
                                    return;
                                }
                                if (com.baseflow.permissionhandler.a.b(i)) {
                                    dVar.g();
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = e;
                synchronized (obj) {
                    i2 = m + 1;
                    m = i2;
                }
                final d dVar4 = new d(this.a, str4, i2, i, z3);
                synchronized (obj) {
                    try {
                        if (n == null) {
                            int i4 = l;
                            int i5 = k;
                            h kVar = i4 == 1 ? new k(i5) : new j(i4, i5);
                            n = kVar;
                            kVar.start();
                            if (dVar4.d >= 1) {
                                dVar4.g();
                            }
                        }
                        dVar4.h = n;
                        if (dVar4.d >= 1) {
                            dVar4.g();
                        }
                        final boolean z4 = z2;
                        final boolean z5 = z3;
                        n.c(dVar4, new Runnable() { // from class: com.tekartik.sqflite.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z6 = z4;
                                String str5 = str4;
                                MethodChannel.Result result2 = result;
                                Boolean bool2 = bool;
                                d dVar5 = dVar4;
                                MethodCall methodCall2 = methodCall;
                                boolean z7 = z5;
                                int i6 = i2;
                                synchronized (u.f) {
                                    if (!z6) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            result2.error("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            dVar5.i = SQLiteDatabase.openDatabase(dVar5.b, null, 1, new c());
                                        } else {
                                            dVar5.j();
                                        }
                                        synchronized (u.e) {
                                            if (z7) {
                                                try {
                                                    u.c.put(str5, Integer.valueOf(i6));
                                                } finally {
                                                }
                                            }
                                            u.d.put(Integer.valueOf(i6), dVar5);
                                        }
                                        if (dVar5.d >= 1) {
                                            dVar5.g();
                                        }
                                        result2.success(u.c(i6, false, false));
                                    } catch (Exception e2) {
                                        dVar5.h(e2, new com.tekartik.sqflite.operation.c(methodCall2, result2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case '\t':
                final d b6 = b(methodCall, result);
                if (b6 == null) {
                    return;
                }
                n.c(b6, new Runnable() { // from class: com.tekartik.sqflite.r
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // java.lang.Runnable
                    public final void run() {
                        HashMap hashMap3 = u.c;
                        Boolean bool2 = Boolean.TRUE;
                        MethodCall methodCall2 = methodCall;
                        boolean equals2 = bool2.equals(methodCall2.argument("noResult"));
                        boolean equals3 = bool2.equals(methodCall2.argument("continueOnError"));
                        List list = (List) methodCall2.argument("operations");
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            MethodChannel.Result result2 = result;
                            if (!hasNext) {
                                if (equals2) {
                                    result2.success(null);
                                    return;
                                } else {
                                    result2.success(arrayList);
                                    return;
                                }
                            }
                            com.tekartik.sqflite.operation.b bVar = new com.tekartik.sqflite.operation.b((Map) it.next(), equals2);
                            String c3 = bVar.c();
                            c3.getClass();
                            char c4 = 65535;
                            switch (c3.hashCode()) {
                                case -1319569547:
                                    if (c3.equals("execute")) {
                                        c4 = 0;
                                        break;
                                    }
                                    break;
                                case -1183792455:
                                    if (c3.equals("insert")) {
                                        c4 = 1;
                                        break;
                                    }
                                    break;
                                case -838846263:
                                    if (c3.equals("update")) {
                                        c4 = 2;
                                        break;
                                    }
                                    break;
                                case 107944136:
                                    if (c3.equals("query")) {
                                        c4 = 3;
                                        break;
                                    }
                                    break;
                            }
                            d dVar5 = d.this;
                            b.a aVar = bVar.b;
                            switch (c4) {
                                case 0:
                                    if (dVar5.f(bVar)) {
                                        bVar.success(null);
                                        bVar.h(arrayList);
                                        break;
                                    } else if (!equals3) {
                                        result2.error(aVar.b, aVar.c, aVar.d);
                                        return;
                                    } else {
                                        bVar.g(arrayList);
                                        break;
                                    }
                                case 1:
                                    if (dVar5.c(bVar)) {
                                        bVar.h(arrayList);
                                        break;
                                    } else if (!equals3) {
                                        result2.error(aVar.b, aVar.c, aVar.d);
                                        return;
                                    } else {
                                        bVar.g(arrayList);
                                        break;
                                    }
                                case 2:
                                    if (dVar5.e(bVar)) {
                                        bVar.h(arrayList);
                                        break;
                                    } else if (!equals3) {
                                        result2.error(aVar.b, aVar.c, aVar.d);
                                        return;
                                    } else {
                                        bVar.g(arrayList);
                                        break;
                                    }
                                case 3:
                                    if (dVar5.d(bVar)) {
                                        bVar.h(arrayList);
                                        break;
                                    } else if (!equals3) {
                                        result2.error(aVar.b, aVar.c, aVar.d);
                                        return;
                                    } else {
                                        bVar.g(arrayList);
                                        break;
                                    }
                                default:
                                    result2.error("bad_param", android.support.v4.media.b.b("Batch method '", c3, "' not supported"), null);
                                    return;
                            }
                        }
                    }
                });
                return;
            case '\n':
                String str5 = (String) methodCall.argument("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i6 = i;
                    if (i6 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i6));
                    }
                    HashMap hashMap4 = d;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            d dVar5 = (d) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", dVar5.b);
                            hashMap6.put("singleInstance", Boolean.valueOf(dVar5.a));
                            int i7 = dVar5.d;
                            if (i7 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i7));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                result.success(hashMap3);
                return;
            case 11:
                d b7 = b(methodCall, result);
                if (b7 == null) {
                    return;
                }
                n.c(b7, new androidx.webkit.c(methodCall, result, b7, 1));
                return;
            case '\f':
                try {
                    z = new File((String) methodCall.argument("path")).exists();
                } catch (Exception unused) {
                }
                result.success(Boolean.valueOf(z));
                return;
            case '\r':
                d b8 = b(methodCall, result);
                if (b8 == null) {
                    return;
                }
                n.c(b8, new RunnableC0436b(methodCall, result, b8, i3));
                return;
            case 14:
                result.success("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                if (j == null) {
                    j = this.a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                result.success(j);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
