package com.amplitude.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C1082i;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nEventsFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventsFileManager.kt\ncom/amplitude/core/utilities/EventsFileManager\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,369:1\n72#2,2:370\n72#2,2:373\n1#3:372\n1#3:375\n116#4,10:376\n116#4,10:392\n116#4,7:402\n124#4,2:411\n116#4,7:414\n124#4,2:427\n26#5:386\n26#5:413\n26#5:421\n6442#6:387\n3792#6:422\n4307#6,2:423\n1549#7:388\n1620#7,3:389\n1855#7,2:409\n1855#7,2:425\n*S KotlinDebug\n*F\n+ 1 EventsFileManager.kt\ncom/amplitude/core/utilities/EventsFileManager\n*L\n42#1:370,2\n43#1:373,2\n42#1:372\n43#1:375\n58#1:376,10\n138#1:392,10\n167#1:402,7\n167#1:411,2\n325#1:414,7\n325#1:427,2\n107#1:386\n254#1:413\n332#1:421\n110#1:387\n334#1:422\n334#1:423,2\n123#1:388\n123#1:389,3\n180#1:409,2\n335#1:425,2\n*E\n"})
/* loaded from: classes3.dex */
public final class h {
    public static final a Companion = new a();
    public static final ConcurrentHashMap<String, kotlinx.coroutines.sync.a> l = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, kotlinx.coroutines.sync.a> m = new ConcurrentHashMap<>();
    public final File a;
    public final String b;
    public final com.amplitude.android.utilities.d c;
    public final com.amplitude.common.a d;
    public final c e;
    public final String f;
    public final String g;
    public final Set<String> h;
    public final ConcurrentHashMap i;
    public final kotlinx.coroutines.sync.a j;
    public final kotlinx.coroutines.sync.a k;

    public static final class a {
    }

    public static final class b extends Lambda implements Function1<JSONObject, CharSequence> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(JSONObject jSONObject) {
            String replace$default;
            JSONObject it = jSONObject;
            Intrinsics.checkNotNullParameter(it, "it");
            String jSONObject2 = it.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            replace$default = StringsKt__StringsJVMKt.replace$default(jSONObject2, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", false, 4, (Object) null);
            return replace$default;
        }
    }

    public h(File directory, String storageKey, com.amplitude.android.utilities.d kvs, com.amplitude.common.a logger, c diagnostics) {
        kotlinx.coroutines.sync.a putIfAbsent;
        kotlinx.coroutines.sync.a putIfAbsent2;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        Intrinsics.checkNotNullParameter(kvs, "kvs");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.a = directory;
        this.b = storageKey;
        this.c = kvs;
        this.d = logger;
        this.e = diagnostics;
        this.f = defpackage.g.a("amplitude.events.file.index.", storageKey);
        this.g = defpackage.g.a("amplitude.events.file.version.", storageKey);
        Set<String> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(...)");
        this.h = newSetFromMap;
        this.i = new ConcurrentHashMap();
        ConcurrentHashMap<String, kotlinx.coroutines.sync.a> concurrentHashMap = l;
        kotlinx.coroutines.sync.a aVar = concurrentHashMap.get(storageKey);
        if (aVar == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(storageKey, (aVar = kotlinx.coroutines.sync.d.a()))) != null) {
            aVar = putIfAbsent2;
        }
        this.j = aVar;
        ConcurrentHashMap<String, kotlinx.coroutines.sync.a> concurrentHashMap2 = m;
        kotlinx.coroutines.sync.a aVar2 = concurrentHashMap2.get(storageKey);
        if (aVar2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(storageKey, (aVar2 = kotlinx.coroutines.sync.d.a()))) != null) {
            aVar2 = putIfAbsent;
        }
        this.k = aVar2;
        e();
        C1082i.d(EmptyCoroutineContext.INSTANCE, new g(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:12:0x0050, B:15:0x0129, B:20:0x0060, B:22:0x006e, B:23:0x0074, B:25:0x007d, B:27:0x0085, B:29:0x0088, B:32:0x008b, B:33:0x008f, B:35:0x0095, B:38:0x00aa, B:40:0x00d3, B:45:0x00ec, B:49:0x00f0, B:53:0x0120), top: B:11:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final h hVar, ContinuationImpl continuationImpl) {
        j jVar;
        int i;
        kotlinx.coroutines.sync.a writeMutex;
        String readText$default;
        boolean endsWith$default;
        try {
            if (continuationImpl instanceof j) {
                jVar = (j) continuationImpl;
                int i2 = jVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = jVar.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = jVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        writeMutex = hVar.j;
                        Intrinsics.checkNotNullExpressionValue(writeMutex, "writeMutex");
                        jVar.a = hVar;
                        jVar.b = writeMutex;
                        jVar.e = 1;
                        if (writeMutex.d(jVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.a aVar = jVar.b;
                        h hVar2 = jVar.a;
                        ResultKt.throwOnFailure(obj);
                        writeMutex = aVar;
                        hVar = hVar2;
                    }
                    if (hVar.c.b(hVar.g, 1L) <= 1) {
                        File[] listFiles = hVar.a.listFiles(new FilenameFilter() { // from class: com.amplitude.core.utilities.f
                            @Override // java.io.FilenameFilter
                            public final boolean accept(File file, String str) {
                                boolean contains$default;
                                boolean endsWith$default2;
                                h this$0 = h.this;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNull(str);
                                contains$default = StringsKt__StringsKt.contains$default(str, this$0.b, false, 2, (Object) null);
                                if (!contains$default) {
                                    return false;
                                }
                                endsWith$default2 = StringsKt__StringsJVMKt.endsWith$default(str, ".properties", false, 2, null);
                                return !endsWith$default2;
                            }
                        });
                        if (listFiles == null) {
                            listFiles = new File[0];
                        }
                        ArrayList arrayList = new ArrayList();
                        for (File file : listFiles) {
                            if (file.exists()) {
                                arrayList.add(file);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            File file2 = (File) it.next();
                            Intrinsics.checkNotNull(file2);
                            readText$default = FilesKt__FileReadWriteKt.readText$default(file2, null, 1, null);
                            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(readText$default, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, 2, null);
                            if (!endsWith$default) {
                                String str = '[' + StringsKt.trimEnd(StringsKt.trimStart(readText$default, '[', ','), ']', ',') + ']';
                                try {
                                    hVar.j(x.i(new JSONArray(str)), file2, false);
                                    if (Intrinsics.areEqual(FilesKt.getExtension(file2), "tmp")) {
                                        hVar.c(file2);
                                    }
                                } catch (JSONException unused) {
                                    hVar.d.b("Failed to parse events: " + str + ", dropping file: " + file2.getPath());
                                    String path = file2.getPath();
                                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                                    hVar.f(path);
                                }
                            }
                        }
                        hVar.c.c(2L, hVar.g);
                    }
                    Unit unit = Unit.INSTANCE;
                    writeMutex.c(null);
                    return unit;
                }
            }
            if (hVar.c.b(hVar.g, 1L) <= 1) {
            }
            Unit unit2 = Unit.INSTANCE;
            writeMutex.c(null);
            return unit2;
        } catch (Throwable th) {
            writeMutex.c(null);
            throw th;
        }
        jVar = new j(hVar, continuationImpl);
        Object obj2 = jVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jVar.e;
        if (i != 0) {
        }
    }

    public final File b() {
        ConcurrentHashMap concurrentHashMap = this.i;
        String str = this.b;
        File file = (File) concurrentHashMap.get(str);
        File file2 = this.a;
        if (file == null) {
            File[] listFiles = file2.listFiles(new FilenameFilter() { // from class: com.amplitude.core.utilities.e
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str2) {
                    boolean contains$default;
                    boolean endsWith$default;
                    h this_run = h.this;
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    Intrinsics.checkNotNull(str2);
                    contains$default = StringsKt__StringsKt.contains$default(str2, this_run.b, false, 2, (Object) null);
                    if (!contains$default) {
                        return false;
                    }
                    endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str2, ".tmp", false, 2, null);
                    return endsWith$default;
                }
            });
            if (listFiles == null) {
                listFiles = new File[0];
            }
            file = (File) ArraysKt.getOrNull(listFiles, 0);
        }
        long b2 = this.c.b(this.f, 0L);
        if (file == null) {
            file = new File(file2, str + '-' + b2 + ".tmp");
        }
        concurrentHashMap.put(str, file);
        Object obj = concurrentHashMap.get(str);
        Intrinsics.checkNotNull(obj);
        return (File) obj;
    }

    public final void c(File file) {
        g(file);
        com.amplitude.android.utilities.d dVar = this.c;
        String str = this.f;
        dVar.c(dVar.b(str, 0L) + 1, str);
        this.i.remove(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[Catch: all -> 0x0069, TRY_ENTER, TryCatch #2 {all -> 0x0069, blocks: (B:12:0x005a, B:15:0x0064, B:19:0x006c, B:48:0x0177, B:67:0x0180, B:68:0x0183, B:21:0x0087, B:24:0x0093, B:25:0x00a6, B:27:0x00ac, B:30:0x00b8, B:34:0x00c4, B:36:0x00d0, B:37:0x00db, B:39:0x00df, B:40:0x00e2, B:44:0x00f9, B:46:0x00ff, B:47:0x0103, B:49:0x0107, B:51:0x012b, B:54:0x013c, B:56:0x0148, B:57:0x0153, B:59:0x0157, B:60:0x015a, B:64:0x017e), top: B:11:0x005a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #2 {all -> 0x0069, blocks: (B:12:0x005a, B:15:0x0064, B:19:0x006c, B:48:0x0177, B:67:0x0180, B:68:0x0183, B:21:0x0087, B:24:0x0093, B:25:0x00a6, B:27:0x00ac, B:30:0x00b8, B:34:0x00c4, B:36:0x00d0, B:37:0x00db, B:39:0x00df, B:40:0x00e2, B:44:0x00f9, B:46:0x00ff, B:47:0x0103, B:49:0x0107, B:51:0x012b, B:54:0x013c, B:56:0x0148, B:57:0x0153, B:59:0x0157, B:60:0x015a, B:64:0x017e), top: B:11:0x005a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        i iVar;
        int i;
        kotlinx.coroutines.sync.a readMutex;
        h hVar;
        Set<String> set;
        String str2;
        boolean endsWith$default;
        List<String> split$default;
        try {
            if (continuationImpl instanceof i) {
                iVar = (i) continuationImpl;
                int i2 = iVar.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.f = i2 - Integer.MIN_VALUE;
                    Object obj = iVar.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = iVar.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        readMutex = this.k;
                        Intrinsics.checkNotNullExpressionValue(readMutex, "readMutex");
                        iVar.a = this;
                        iVar.b = str;
                        iVar.c = readMutex;
                        iVar.f = 1;
                        if (readMutex.d(iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.a aVar = iVar.c;
                        String str3 = iVar.b;
                        hVar = iVar.a;
                        ResultKt.throwOnFailure(obj);
                        readMutex = aVar;
                        str = str3;
                    }
                    set = hVar.h;
                    str2 = "";
                    if (set.contains(str)) {
                        set.add(str);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(str)), Charsets.UTF_8), 8192);
                        try {
                            String readText = TextStreamsKt.readText(bufferedReader);
                            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(readText, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, 2, null);
                            if (endsWith$default) {
                                JSONArray jSONArray = new JSONArray();
                                split$default = StringsKt__StringsKt.split$default(readText, new String[]{WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR}, false, 0, 6, (Object) null);
                                for (String event : split$default) {
                                    if (event.length() > 0) {
                                        try {
                                            jSONArray.put(new JSONObject(event));
                                        } catch (JSONException unused) {
                                            c cVar = hVar.e;
                                            cVar.getClass();
                                            Intrinsics.checkNotNullParameter(event, "event");
                                            if (cVar.a == null) {
                                                cVar.a = Collections.synchronizedList(new ArrayList());
                                            }
                                            List<String> list = cVar.a;
                                            if (list != null) {
                                                list.add(event);
                                            }
                                            hVar.d.b("Failed to parse event: " + event);
                                        }
                                    }
                                }
                                str2 = jSONArray.length() > 0 ? jSONArray.toString() : "";
                                Intrinsics.checkNotNull(str2);
                                CloseableKt.closeFinally(bufferedReader, null);
                            } else {
                                String event2 = "[" + StringsKt.trimEnd(StringsKt.trimStart(readText, '[', ','), ']', ',') + ']';
                                try {
                                    String jSONArray2 = new JSONArray(event2).toString();
                                    Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
                                    str2 = jSONArray2;
                                } catch (JSONException unused2) {
                                    c cVar2 = hVar.e;
                                    cVar2.getClass();
                                    Intrinsics.checkNotNullParameter(event2, "event");
                                    if (cVar2.a == null) {
                                        cVar2.a = Collections.synchronizedList(new ArrayList());
                                    }
                                    List<String> list2 = cVar2.a;
                                    if (list2 != null) {
                                        list2.add(event2);
                                    }
                                    hVar.d.b("Failed to parse events: " + event2 + ", dropping file: " + str);
                                    hVar.f(str);
                                    str2 = event2;
                                }
                                CloseableKt.closeFinally(bufferedReader, null);
                            }
                        } finally {
                        }
                    } else {
                        set.remove(str);
                    }
                    readMutex.c(null);
                    return str2;
                }
            }
            set = hVar.h;
            str2 = "";
            if (set.contains(str)) {
            }
            readMutex.c(null);
            return str2;
        } catch (Throwable th) {
            readMutex.c(null);
            throw th;
        }
        iVar = new i(this, continuationImpl);
        Object obj2 = iVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = iVar.f;
        if (i != 0) {
        }
    }

    public final boolean e() {
        File file = this.a;
        try {
            com.amplitude.id.utilities.a.a(file);
            return true;
        } catch (IOException e) {
            this.e.a("Failed to create directory: " + e.getMessage());
            this.d.b("Failed to create directory for events storage: " + file.getPath());
            return false;
        }
    }

    public final boolean f(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.h.remove(filePath);
        return new File(filePath).delete();
    }

    public final void g(File file) {
        if (!file.exists() || FilesKt.getExtension(file).length() == 0) {
            return;
        }
        String nameWithoutExtension = FilesKt.getNameWithoutExtension(file);
        File file2 = this.a;
        File file3 = new File(file2, nameWithoutExtension);
        if (!file3.exists()) {
            file.renameTo(new File(file2, FilesKt.getNameWithoutExtension(file)));
            return;
        }
        this.d.c("File already exists: " + file3 + ", handle gracefully.");
        file.renameTo(new File(file2, nameWithoutExtension + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(1000)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        l lVar;
        int i;
        h hVar;
        kotlinx.coroutines.sync.a aVar;
        File b2;
        try {
            if (continuationImpl instanceof l) {
                lVar = (l) continuationImpl;
                int i2 = lVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = lVar.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = lVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.a writeMutex = this.j;
                        Intrinsics.checkNotNullExpressionValue(writeMutex, "writeMutex");
                        lVar.a = this;
                        lVar.b = writeMutex;
                        lVar.e = 1;
                        if (writeMutex.d(lVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hVar = this;
                        aVar = writeMutex;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = lVar.b;
                        hVar = lVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    b2 = hVar.b();
                    if (b2.exists() && b2.length() > 0) {
                        hVar.c(b2);
                    }
                    Unit unit = Unit.INSTANCE;
                    aVar.c(null);
                    return unit;
                }
            }
            b2 = hVar.b();
            if (b2.exists()) {
                hVar.c(b2);
            }
            Unit unit2 = Unit.INSTANCE;
            aVar.c(null);
            return unit2;
        } catch (Throwable th) {
            aVar.c(null);
            throw th;
        }
        lVar = new l(this, continuationImpl);
        Object obj2 = lVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lVar.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[Catch: all -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:12:0x0055, B:15:0x0061, B:19:0x006d, B:24:0x009c, B:26:0x00a7, B:29:0x00b4, B:34:0x00b9, B:37:0x00e6, B:22:0x0075, B:38:0x010c), top: B:11:0x0055, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, ContinuationImpl continuationImpl) {
        m mVar;
        int i;
        kotlinx.coroutines.sync.a writeMutex;
        h hVar;
        boolean e;
        String replace$default;
        try {
            if (continuationImpl instanceof m) {
                mVar = (m) continuationImpl;
                int i2 = mVar.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mVar.f = i2 - Integer.MIN_VALUE;
                    Object obj = mVar.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mVar.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        writeMutex = this.j;
                        Intrinsics.checkNotNullExpressionValue(writeMutex, "writeMutex");
                        mVar.a = this;
                        mVar.b = str;
                        mVar.c = writeMutex;
                        mVar.f = 1;
                        if (writeMutex.d(mVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.a aVar = mVar.c;
                        String str2 = mVar.b;
                        hVar = mVar.a;
                        ResultKt.throwOnFailure(obj);
                        writeMutex = aVar;
                        str = str2;
                    }
                    e = hVar.e();
                    com.amplitude.common.a aVar2 = hVar.d;
                    c cVar = hVar.e;
                    if (e) {
                        File b2 = hVar.b();
                        if (!b2.exists()) {
                            try {
                                b2.createNewFile();
                            } catch (IOException e2) {
                                cVar.a("Failed to create new storage file: " + e2.getMessage());
                                aVar2.b("Failed to create new storage file: " + b2.getPath());
                            }
                        }
                        while (b2.length() > 975000) {
                            hVar.c(b2);
                            b2 = hVar.b();
                            if (!b2.exists()) {
                                try {
                                    b2.createNewFile();
                                } catch (IOException e3) {
                                    cVar.a("Failed to create new storage file: " + e3.getMessage());
                                    aVar2.b("Failed to create new storage file: " + b2.getPath());
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        replace$default = StringsKt__StringsJVMKt.replace$default(str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", false, 4, (Object) null);
                        sb.append(replace$default);
                        sb.append((char) 0);
                        byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        hVar.k(b2, bytes, true);
                    }
                    return Unit.INSTANCE;
                }
            }
            e = hVar.e();
            com.amplitude.common.a aVar22 = hVar.d;
            c cVar2 = hVar.e;
            if (e) {
            }
            return Unit.INSTANCE;
        } finally {
            writeMutex.c(null);
        }
        mVar = new m(this, continuationImpl);
        Object obj2 = mVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mVar.f;
        if (i != 0) {
        }
    }

    public final void j(List<? extends JSONObject> list, File file, boolean z) {
        String joinToString$default;
        com.amplitude.common.a aVar = this.d;
        c cVar = this.e;
        try {
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, null, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 0, null, b.a, 26, null);
            file.createNewFile();
            byte[] bytes = joinToString$default.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            k(file, bytes, z);
            g(file);
        } catch (IOException e) {
            cVar.a("Failed to create or write to split file: " + e.getMessage());
            aVar.b("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e2) {
            cVar.a("Failed to write to split file: " + e2.getMessage());
            aVar.b("Failed to write to split file: " + file.getPath() + " for error: " + e2.getMessage());
        }
    }

    public final void k(File file, byte[] bArr, boolean z) {
        com.amplitude.common.a aVar = this.d;
        c cVar = this.e;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            cVar.a("Error writing to file: " + e.getMessage());
            aVar.b("File not found: " + file.getPath());
        } catch (IOException e2) {
            cVar.a("Error writing to file: " + e2.getMessage());
            aVar.b("Failed to write to file: " + file.getPath());
        } catch (SecurityException e3) {
            cVar.a("Error writing to file: " + e3.getMessage());
            aVar.b("Security exception when saving event: " + e3.getMessage());
        } catch (Exception e4) {
            cVar.a("Error writing to file: " + e4.getMessage());
            aVar.b("Failed to write to file: " + file.getPath());
        }
    }
}
