package com.amplitude.android.storage;

import android.content.SharedPreferences;
import com.amplitude.core.k;
import com.amplitude.core.utilities.n;
import com.amplitude.core.utilities.q;
import com.amplitude.core.utilities.w;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.internal.C1086c;

@SourceDebugExtension({"SMAP\nAndroidStorageV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStorageV2.kt\ncom/amplitude/android/storage/AndroidStorageV2\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,176:1\n39#2,12:177\n39#2,12:189\n*S KotlinDebug\n*F\n+ 1 AndroidStorageV2.kt\ncom/amplitude/android/storage/AndroidStorageV2\n*L\n66#1:177,12\n72#1:189,12\n*E\n"})
/* loaded from: classes3.dex */
public final class i implements k, n {
    public final com.amplitude.common.a a;
    public final SharedPreferences b;
    public final com.amplitude.core.utilities.h c;
    public final LinkedHashMap d;

    public i(String storageKey, com.amplitude.common.a logger, SharedPreferences sharedPreferences, File storageDirectory, com.amplitude.core.utilities.c diagnostics) {
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(storageDirectory, "storageDirectory");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.a = logger;
        this.b = sharedPreferences;
        this.c = new com.amplitude.core.utilities.h(storageDirectory, storageKey, new com.amplitude.android.utilities.d(sharedPreferences), logger, diagnostics);
        this.d = new LinkedHashMap();
    }

    @Override // com.amplitude.core.k, com.amplitude.core.utilities.n
    public final List<Object> a() {
        int collectionSizeOrDefault;
        final com.amplitude.core.utilities.h hVar = this.c;
        File[] listFiles = hVar.a.listFiles(new FilenameFilter() { // from class: com.amplitude.core.utilities.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean contains$default;
                boolean endsWith$default;
                boolean endsWith$default2;
                h this$0 = h.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(str);
                contains$default = StringsKt__StringsKt.contains$default(str, this$0.b, false, 2, (Object) null);
                if (!contains$default) {
                    return false;
                }
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, ".tmp", false, 2, null);
                if (endsWith$default) {
                    return false;
                }
                endsWith$default2 = StringsKt__StringsJVMKt.endsWith$default(str, ".properties", false, 2, null);
                return !endsWith$default2;
            }
        });
        if (listFiles == null) {
            listFiles = new File[0];
        }
        List sortedWith = ArraysKt.sortedWith(listFiles, new com.amplitude.core.utilities.k(hVar));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    @Override // com.amplitude.core.k, com.amplitude.core.utilities.n
    public final Object b(Object obj, Continuation<? super String> continuation) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return this.c.d((String) obj, (ContinuationImpl) continuation);
    }

    @Override // com.amplitude.core.k, com.amplitude.core.utilities.n
    public final Object c(ContinuationImpl continuationImpl) {
        Object h = this.c.h(continuationImpl);
        return h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h : Unit.INSTANCE;
    }

    @Override // com.amplitude.core.k
    public final Unit d(k.a aVar, String str) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(aVar.a, str);
        edit.apply();
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.utilities.n
    public final boolean e(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return this.c.f(filePath);
    }

    @Override // com.amplitude.core.k
    public final String f(k.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.b.getString(key.a, null);
    }

    @Override // com.amplitude.core.k
    public final com.amplitude.core.utilities.http.h g(com.amplitude.core.platform.b eventPipeline, com.amplitude.android.h configuration, C1086c scope, C1101n0 storageDispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        return new q(this, eventPipeline, configuration, scope, storageDispatcher, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.amplitude.core.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(com.amplitude.core.events.a event, ContinuationImpl continuationImpl) {
        h hVar;
        int i;
        if (continuationImpl instanceof h) {
            hVar = (h) continuationImpl;
            int i2 = hVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.e = i2 - Integer.MIN_VALUE;
                Object obj = hVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullParameter(event, "event");
                    String jSONObject = w.a(event).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                    hVar.a = this;
                    hVar.b = event;
                    hVar.e = 1;
                    if (this.c.i(jSONObject, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    event = hVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                event.getClass();
                return Unit.INSTANCE;
            }
        }
        hVar = new h(this, continuationImpl);
        Object obj2 = hVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hVar.e;
        if (i != 0) {
        }
        event.getClass();
        return Unit.INSTANCE;
    }

    public final void i(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        com.amplitude.core.utilities.h hVar = this.c;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        hVar.h.remove(filePath);
    }

    public final void j(String insertId) {
        Intrinsics.checkNotNullParameter(insertId, "insertId");
        this.d.remove(insertId);
    }
}
